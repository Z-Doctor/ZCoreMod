package zdoctor.zcoremod.asm.patches;

import static zdoctor.zcoremod.asm.util.ASMConstants.ZPackage;

import java.util.List;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

import zdoctor.zcoremod.asm.util.ASMConstants;
import zdoctor.zcoremod.asm.util.InsnBuilder;
import zdoctor.zcoremod.map.McMappingDatabase;
import zdoctor.zcoremod.map.pair.McObfPair;

public class EntityLivingPatch extends ClassTransformer {
	private static McObfPair EntityLivingBase = McMappingDatabase.getSRG("EntityLivingBase");
	private static McObfPair EntityInit = McMappingDatabase.getSRG("EntityLivingBase.func_70088_a");
	private static McObfPair GetHealth = McMappingDatabase.getSRG("EntityLivingBase.func_110143_aJ");
	private static McObfPair SetHealth = McMappingDatabase.getSRG("EntityLivingBase.func_70606_j");
	private static McObfPair ReadNbt = McMappingDatabase.getSRG("EntityLivingBase.func_70037_a");
	private static McObfPair WriteNbt = McMappingDatabase.getSRG("EntityLivingBase.func_70014_b");
	private static McObfPair UpdatePotionMetadata = McMappingDatabase.getSRG("EntityLivingBase.func_175135_B");
	private static McObfPair ResetPotionEffectMetadata = McMappingDatabase.getSRG("EntityLivingBase.func_175133_bi");
	private static McObfPair NotifyDataManagerChange = McMappingDatabase.getSRG("EntityLivingBase.func_184206_a");

	private static McObfPair EntityDataManager = McMappingDatabase.getSRG("EntityDataManager");
	private static McObfPair DataManager = McMappingDatabase.getSRG("field_70180_af");
	private static McObfPair CreateKey = McMappingDatabase.getSRG("EntityDataManager.func_187226_a");
	private static McObfPair Register = McMappingDatabase.getSRG("EntityDataManager.func_187214_a");
	private static McObfPair Set = McMappingDatabase.getSRG("EntityDataManager.func_187227_b");
	private static McObfPair Get = McMappingDatabase.getSRG("EntityDataManager.func_187225_a");

	private static McObfPair NBTTagCompound = McMappingDatabase.getSRG("NBTTagCompound");

	private static McObfPair DataSerializer = McMappingDatabase.getSRG("DataSerializer");

	private static McObfPair DataSerializers = McMappingDatabase.getSRG("DataSerializers");
	private static McObfPair FLOAT = McMappingDatabase.getSRG("field_187193_c");
	private static McObfPair COMPOUND = McMappingDatabase.getSRG("field_192734_n");

	private static McObfPair DataParameter = McMappingDatabase.getSRG("DataParameter");

	public EntityLivingPatch() {
		super(EntityLivingBase.getKey());
	}

	@Override
	public void transform(ClassNode classNode) {
		System.out.println("Test: " + UpdatePotionMetadata);
		classNode.interfaces.add(ZPackage + "/tweaks/EntityTweaks$ExtendedEntity");
		addFields(classNode);

		for (MethodNode method : classNode.methods) {
//			System.out.println("Method: " + method.name);	
			if (ASMConstants.STATIC_INIT.matches(method.name))
				clinit(method);
			else if (EntityInit.matches(method))
				entityInit(method);
			else if (SetHealth.matches(method))
				setHealth(method);
			else if (ReadNbt.matches(method))
				readNBT(method);
			else if (WriteNbt.matches(method))
				writeNBT(method);
			else if (UpdatePotionMetadata.matches(method))
				updatePotionMetadata(method);
			else if (ResetPotionEffectMetadata.matches(method))
				resetPotionEffectMetadata(method);
			else if (NotifyDataManagerChange.matches(method))
				notifyDataManagerChange(method);
		}

		addGetLastHealth(classNode);
		addSetLastHealth(classNode);
	}

	public void addFields(ClassNode classNode) {
		List<FieldNode> fields = classNode.fields;

		String sig = "L" + DataParameter.getClassName() + "<Ljava/lang/Float;>;";
		FieldNode lastHealthField = new FieldNode(ASMConstants.PSF, "LAST_HEALTH", DataParameter.getDescriptor(), sig,
				null);
		fields.add(lastHealthField);

		sig = "L" + DataParameter.getClassName() + "<" + NBTTagCompound.getDescriptor() + ">;";
		FieldNode potionWatcher = new FieldNode(ASMConstants.PSF, "POTION_WATCHER", DataParameter.getDescriptor(), sig,
				null);
		fields.add(potionWatcher);
	}

	public void clinit(MethodNode method) {
//		System.out.println("Initialized: LAST_HEALTH");

		InsnBuilder list = new InsnBuilder();
		// Add a DataParameter named LAST_HEALTH to Entity
		list.ldc(Type.getType(EntityLivingBase.getDescriptor()));
		list.getStatic(DataSerializers.getClassName(), FLOAT.getName(), DataSerializer.getDescriptor());
		list.invokeStatic(EntityDataManager.getClassName(), CreateKey.getName(), CreateKey.getDescriptor(), false);

		list.dup();
		list.putStatic(EntityLivingBase.getClassName(), "LAST_HEALTH", DataParameter.getDescriptor());
		list.putStatic(ZPackage + "/tweaks/EntityTweaks", "LAST_HEALTH", DataParameter.getDescriptor());

		list.ldc(Type.getType(EntityLivingBase.getDescriptor()));
		list.getStatic(DataSerializers.getClassName(), COMPOUND.getName(), DataSerializer.getDescriptor());
		list.invokeStatic(EntityDataManager.getClassName(), CreateKey.getName(), CreateKey.getDescriptor(), false);

		list.dup();
		list.putStatic(EntityLivingBase.getClassName(), "POTION_WATCHER", DataParameter.getDescriptor());
		list.putStatic(ZPackage + "/tweaks/EntityTweaks", "POTION_WATCHER", DataParameter.getDescriptor());

		list.addToEnd(method);
	}

	public void entityInit(MethodNode method) {
//		System.out.println("Injected in EntityLivingBase.entityInit: EntityTweaks.entityInit");

		InsnBuilder list = new InsnBuilder();
		list.var(Opcodes.ALOAD);
		list.getField(EntityLivingBase.getClassName(), DataManager.getName(), EntityDataManager.getDescriptor());
		list.invokeStatic(ZPackage + "/tweaks/EntityTweaks", "entityInit",
				"(" + EntityDataManager.getDescriptor() + ")V", false);
		list.addToEnd(method);
	}

	public void setHealth(MethodNode method) {
//		System.out.println("Injecting code into: EntityLivingBase.setHealth");

		InsnBuilder list = new InsnBuilder();
		// Get Current Health
		list.var(Opcodes.ALOAD);
		list.dup();
		list.invokeVirtual(EntityLivingBase.getClassName(), GetHealth.getName(), GetHealth.getDescriptor(), false);
		list.invokeVirtual(EntityLivingBase.getClassName(), "setLastHealth", "(F)V", false);

		list.addToStart(method);
	}

	public void readNBT(MethodNode method) {
		InsnBuilder list = new InsnBuilder();

		list.var(Opcodes.ALOAD);
		list.dup();
		list.getField(EntityLivingBase.getClassName(), DataManager.getName(), EntityDataManager.getDescriptor());
		list.getStatic(EntityLivingBase.getClassName(), "POTION_WATCHER", DataParameter.getDescriptor());
		list.invokeVirtual(EntityDataManager.getClassName(), Get.getName(), Get.getDescriptor(), false);
		list.checkCast(NBTTagCompound.getClassName());
		list.invokeStatic(ZPackage + "/tweaks/EntityTweaks", "readNbt",
				"(" + EntityLivingBase.getDescriptor() + NBTTagCompound.getDescriptor() + ")V", false);

		list.addTo(method);
	}

	public void writeNBT(MethodNode method) {
		InsnBuilder list = new InsnBuilder();

		list.var(Opcodes.ALOAD);
		list.dup();
		list.getField(EntityLivingBase.getClassName(), DataManager.getName(), EntityDataManager.getDescriptor());
		list.getStatic(EntityLivingBase.getClassName(), "POTION_WATCHER", DataParameter.getDescriptor());
		list.invokeVirtual(EntityDataManager.getClassName(), Get.getName(), Get.getDescriptor(), false);
		list.checkCast(NBTTagCompound.getClassName());
		list.invokeStatic(ZPackage + "/tweaks/EntityTweaks", "writeNbt",
				"(" + EntityLivingBase.getDescriptor() + NBTTagCompound.getDescriptor() + ")V", false);

		list.addTo(method);
	}

	public void updatePotionMetadata(MethodNode method) {
		System.out.println("Injecting code into: EntityLivingBase.updatePotionMetadata");

		for (AbstractInsnNode node : method.instructions.toArray()) {
			if (node instanceof FieldInsnNode) {
				FieldInsnNode fieldNode = (FieldInsnNode) node;
				if (fieldNode.desc.equals("Ljava/util/Map;") && node.getNext() instanceof MethodInsnNode) {
					MethodInsnNode methodNode = (MethodInsnNode) fieldNode.getNext();
					if (methodNode.name.equals("values") && methodNode.desc.equals("()Ljava/util/Collection;")
							&& methodNode.getNext() instanceof VarInsnNode) {
						VarInsnNode collection = (VarInsnNode) methodNode.getNext();
						int var = collection.var;
						InsnBuilder list = new InsnBuilder();
						list.print("Updating Potions");
						list.var(Opcodes.ALOAD);
						list.var(Opcodes.ALOAD, var);
						list.invokeStatic(ZPackage + "/tweaks/EntityTweaks", "updatePotionMetadata",
								"(" + EntityLivingBase.getDescriptor() + "Ljava/util/Collection;" + ")V", false);
						list.addAt(method, collection);
						break;
					}
				}
			}
		}
	}

	public void resetPotionEffectMetadata(MethodNode method) {
		System.out.println("Injecting code into: EntityLivingBase.resetPotionEffectMetadata");
		
		InsnBuilder list = new InsnBuilder();

		list.var(Opcodes.ALOAD);
		list.invokeStatic(ZPackage + "/tweaks/EntityTweaks", "resetPotionEffectMetadata",
				"(" + EntityLivingBase.getDescriptor() + ")V", false);

		list.addTo(method);
	}

	public void notifyDataManagerChange(MethodNode method) {
		System.out.println("Injecting code into: EntityLivingBase.notifyDataManagerChange");
		
		InsnBuilder list = new InsnBuilder();
		list.print("dataChanged");
		list.var(Opcodes.ALOAD);
		list.var(Opcodes.ALOAD, 1);
		list.invokeStatic(ZPackage + "/tweaks/EntityTweaks", "notifyDataManagerChange",
				"(" + EntityLivingBase.getDescriptor() + DataParameter.getDescriptor() + ")V", false);

		list.addTo(method);
	}

	public void addGetLastHealth(ClassNode classNode) {
//		System.out.println("Added Method: addGetLastHealth");

		MethodNode getLastHealth = new MethodNode(Opcodes.ACC_PUBLIC, "getLastHealth", "()F", null, null);
		InsnBuilder list = new InsnBuilder();

		list.var(Opcodes.ALOAD);
		list.getField(EntityLivingBase.getClassName(), DataManager.getName(), EntityDataManager.getDescriptor());
		list.getStatic(EntityLivingBase.getClassName(), "LAST_HEALTH", DataParameter.getDescriptor());
		list.invokeVirtual(EntityDataManager.getClassName(), Get.getName(), Get.getDescriptor(), false);
		list.checkCastFloat();
		list.floatValue();

		list.insn(Opcodes.FRETURN);
		list.addTo(getLastHealth);

		classNode.methods.add(getLastHealth);
	}

	public void addSetLastHealth(ClassNode classNode) {
		System.out.println("Added Method: setLastHealth");

		MethodNode getLastHealth = new MethodNode(Opcodes.ACC_PUBLIC, "setLastHealth", "(F)V", null, null);
		InsnBuilder list = new InsnBuilder();

		list.var(Opcodes.ALOAD);
		list.getField(EntityLivingBase.getClassName(), DataManager.getName(), EntityDataManager.getDescriptor());
		list.getStatic(EntityLivingBase.getClassName(), "LAST_HEALTH", DataParameter.getDescriptor());
		list.var(Opcodes.FLOAD, 1);
		list.valueOfFloat();
		list.invokeVirtual(EntityDataManager.getClassName(), Set.getName(), Set.getDescriptor(), false);
		list.end();
		list.addTo(getLastHealth);

		classNode.methods.add(getLastHealth);
	}

}

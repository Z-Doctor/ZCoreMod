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
import zdoctor.zcoremod.map.minecraft.entity.Entity;
import zdoctor.zcoremod.map.minecraft.entity.EntityLivingBase;
import zdoctor.zcoremod.map.minecraft.nbt.NBTTagCompound;
import zdoctor.zcoremod.map.minecraft.network.datasync.DataParameter;
import zdoctor.zcoremod.map.minecraft.network.datasync.DataSerializer;
import zdoctor.zcoremod.map.minecraft.network.datasync.DataSerializers;
import zdoctor.zcoremod.map.minecraft.network.datasync.EntityDataManager;

public class EntityLivingPatch extends ClassTransformer {
	public EntityLivingPatch() {
		super(EntityLivingBase.getKey());
	}

	@Override
	public void transform(ClassNode classNode) {
		System.out.println("Transforming");
		classNode.interfaces.add(ZPackage + "/tweaks/EntityTweaks$ExtendedEntity");
		addFields(classNode);

		for (MethodNode method : classNode.methods) {
			if (ASMConstants.STATIC_INIT.matches(method.name))
				clinit(method);
			else if (EntityLivingBase.func_70088_a.matches(method))
				entityInit(method);
			else if (EntityLivingBase.func_70606_j.matches(method))
				setHealth(method);
			else if (EntityLivingBase.func_70037_a.matches(method))
				readNbt(method);
			else if (EntityLivingBase.func_70014_b.matches(method))
				writeNBT(method);
			else if (EntityLivingBase.func_175135_B.matches(method))
				updatePotionMetadata(method);
			else if (EntityLivingBase.func_175133_bi.matches(method))
				resetPotionEffectMetadata(method);
			else if (EntityLivingBase.func_184206_a.matches(method))
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
		list.getStatic(DataSerializers.getClassName(), DataSerializers.field_187193_c.getName(),
				DataSerializer.getDescriptor());
		list.invokeStatic(EntityDataManager.getClassName(), EntityDataManager.func_187226_a.getName(),
				EntityDataManager.func_187226_a.getDescriptor(), false);

		list.dup();
		list.putStatic(EntityLivingBase.getClassName(), "LAST_HEALTH", DataParameter.getDescriptor());
		list.putStatic(ZPackage + "/tweaks/EntityTweaks", "LAST_HEALTH", DataParameter.getDescriptor());

		list.ldc(Type.getType(EntityLivingBase.getDescriptor()));
		list.getStatic(DataSerializers.getClassName(), DataSerializers.field_192734_n.getName(),
				DataSerializer.getDescriptor());
		list.invokeStatic(EntityDataManager.getClassName(), EntityDataManager.func_187226_a.getName(),
				EntityDataManager.func_187226_a.getDescriptor(), false);

		list.dup();
		list.putStatic(EntityLivingBase.getClassName(), "POTION_WATCHER", DataParameter.getDescriptor());
		list.putStatic(ZPackage + "/tweaks/EntityTweaks", "POTION_WATCHER", DataParameter.getDescriptor());

		list.addToEnd(method);
	}

	public void entityInit(MethodNode method) {
//		System.out.println("Injected in EntityLivingBase.entityInit: EntityTweaks.entityInit");

		InsnBuilder list = new InsnBuilder();
		list.var(Opcodes.ALOAD);
		list.getField(EntityLivingBase.getClassName(), Entity.field_70180_af.getName(),
				EntityDataManager.getDescriptor());
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
		list.invokeVirtual(EntityLivingBase.getClassName(), EntityLivingBase.func_110143_aJ.getName(),
				EntityLivingBase.func_110143_aJ.getDescriptor(), false);
		list.invokeVirtual(EntityLivingBase.getClassName(), "setLastHealth", "(F)V", false);

		list.addToStart(method);
	}

	public void readNbt(MethodNode method) {
		InsnBuilder list = new InsnBuilder();
		list.var(Opcodes.ALOAD);
		list.var(Opcodes.ALOAD, 1);
		list.invokeStatic(ZPackage + "/tweaks/EntityTweaks", "readNbt",
				"(" + EntityLivingBase.getDescriptor() + NBTTagCompound.getDescriptor() + ")V", false);
		list.addToEnd(method);

	}

	public void writeNBT(MethodNode method) {
		InsnBuilder list = new InsnBuilder();
		list.var(Opcodes.ALOAD);
		list.var(Opcodes.ALOAD, 1);
		list.invokeStatic(ZPackage + "/tweaks/EntityTweaks", "writeNbt",
				"(" + EntityLivingBase.getDescriptor() + NBTTagCompound.getDescriptor() + ")V", false);
		list.addToEnd(method);

//		list.var(Opcodes.ALOAD);
//		list.dup();
//		list.getField(EntityLivingBase.getClassName(), DataManager.getName(), EntityDataManager.getDescriptor());
//		list.getStatic(EntityLivingBase.getClassName(), "POTION_WATCHER", DataParameter.getDescriptor());
//		list.invokeVirtual(EntityDataManager.getClassName(), Get.getName(), Get.getDescriptor(), false);
//		list.checkCast(NBTTagCompound.getClassName());
//		list.invokeStatic(ZPackage + "/tweaks/EntityTweaks", "writeNbt",
//				"(" + EntityLivingBase.getDescriptor() + NBTTagCompound.getDescriptor() + ")V", false);
//		list.addTo(method);
	}

	public void updatePotionMetadata(MethodNode method) {
//		System.out.println("Injecting code into: EntityLivingBase.updatePotionMetadata");

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
//						list.print("Updating Potions");
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
//		System.out.println("Injecting code into: EntityLivingBase.resetPotionEffectMetadata");

		InsnBuilder list = new InsnBuilder();

		list.var(Opcodes.ALOAD);
		list.invokeStatic(ZPackage + "/tweaks/EntityTweaks", "resetPotionEffectMetadata",
				"(" + EntityLivingBase.getDescriptor() + ")V", false);

		list.addTo(method);
	}

	public void notifyDataManagerChange(MethodNode method) {
//		System.out.println("Injecting code into: EntityLivingBase.notifyDataManagerChange");

		InsnBuilder list = new InsnBuilder();
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
		list.getField(EntityLivingBase.getClassName(), Entity.field_70180_af.getName(),
				EntityDataManager.getDescriptor());
		list.getStatic(EntityLivingBase.getClassName(), "LAST_HEALTH", DataParameter.getDescriptor());
		list.invokeVirtual(EntityDataManager.getClassName(), EntityDataManager.func_187225_a.getName(),
				EntityDataManager.func_187225_a.getDescriptor(), false);
		list.checkCastFloat();
		list.floatValue();

		list.insn(Opcodes.FRETURN);
		list.addTo(getLastHealth);

		classNode.methods.add(getLastHealth);
	}

	public void addSetLastHealth(ClassNode classNode) {
//		System.out.println("Added Method: setLastHealth");

		MethodNode getLastHealth = new MethodNode(Opcodes.ACC_PUBLIC, "setLastHealth", "(F)V", null, null);
		InsnBuilder list = new InsnBuilder();

		list.var(Opcodes.ALOAD);
		list.getField(EntityLivingBase.getClassName(), Entity.field_70180_af.getName(),
				EntityDataManager.getDescriptor());
		list.getStatic(EntityLivingBase.getClassName(), "LAST_HEALTH", DataParameter.getDescriptor());
		list.var(Opcodes.FLOAD, 1);
		list.valueOfFloat();
		list.invokeVirtual(EntityDataManager.getClassName(), EntityDataManager.func_187227_b.getName(),
				EntityDataManager.func_187227_b.getDescriptor(), false);
		list.end();
		list.addTo(getLastHealth);

		classNode.methods.add(getLastHealth);
	}

}

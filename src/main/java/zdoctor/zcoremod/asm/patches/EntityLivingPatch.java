package zdoctor.zcoremod.asm.patches;

import static zdoctor.zcoremod.asm.util.ASMConstants.ZPackage;

import java.util.List;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import zdoctor.zcoremod.asm.util.ASMConstants;
import zdoctor.zcoremod.asm.util.InsnBuilder;
import zdoctor.zcoremod.map.McMappingDatabase;
import zdoctor.zcoremod.map.pair.McObfPair;

public class EntityLivingPatch extends ClassTransformer {
	private static McObfPair EntityLivingBase = McMappingDatabase.getSRG("EntityLivingBase");
	private static McObfPair EntityInit = McMappingDatabase.getSRG("EntityLivingBase.func_70088_a");
	private static McObfPair GetHealth = McMappingDatabase.getSRG("EntityLivingBase.func_110143_aJ");
	private static McObfPair SetHealth = McMappingDatabase.getSRG("EntityLivingBase.func_70606_j");

	private static McObfPair EntityDataManager = McMappingDatabase.getSRG("EntityDataManager");
	private static McObfPair DataManager = McMappingDatabase.getSRG("field_70180_af");
	private static McObfPair CreateKey = McMappingDatabase.getSRG("EntityDataManager.func_187226_a");
	private static McObfPair Register = McMappingDatabase.getSRG("EntityDataManager.func_187214_a");
	private static McObfPair Set = McMappingDatabase.getSRG("EntityDataManager.func_187227_b");
	private static McObfPair Get = McMappingDatabase.getSRG("EntityDataManager.func_187225_a");

	private static McObfPair DataSerializer = McMappingDatabase.getSRG("DataSerializer");

	private static McObfPair DataSerializers = McMappingDatabase.getSRG("DataSerializers");
	private static McObfPair DataSerializers_FLOAT = McMappingDatabase.getSRG("field_187193_c");

	private static McObfPair DataParameter = McMappingDatabase.getSRG("DataParameter");

	public EntityLivingPatch() {
		super("net.minecraft.entity.EntityLivingBase");
	}

	@Override
	public void transform(ClassNode classNode) {
		addFields(classNode);
	
		for (MethodNode method : classNode.methods) {
			if (ASMConstants.STATIC_INIT.matches(method.name))
				clinit(method);
			if (EntityInit.matches(method))
				entityInit(method);
			else if (SetHealth.matches(method))
				setHealth(method);
		}
	
	}

	public void addFields(ClassNode classNode) {
		System.out.println("Added Field: LAST_HEALTH");

		List<FieldNode> fields = classNode.fields;
		String sig = "L" + DataParameter.getClassName() + "<Ljava/lang/Float;>;";
		FieldNode lastHealthField = new FieldNode(ASMConstants.PSF, "LAST_HEALTH", DataParameter.getDescriptor(), sig,
				null);
		fields.add(lastHealthField);
	}

	public void clinit(MethodNode method) {
		System.out.println("Initialized: LAST_HEALTH");
		InsnBuilder list = new InsnBuilder();
		// Add a DataParameter named LAST_HEALTH to Entity
		list.ldc(Type.getType(EntityLivingBase.getDescriptor()));
		list.getStatic(DataSerializers.getClassName(), DataSerializers_FLOAT.getName(), DataSerializer.getDescriptor());
		list.invokeStatic(EntityDataManager.getClassName(), CreateKey.getName(), CreateKey.getDescriptor(), false);
		list.dup();
		list.putStatic(EntityLivingBase.getClassName(), "LAST_HEALTH", DataParameter.getDescriptor());
		list.putStatic(ZPackage + "/tweaks/EntityTweaks", "LAST_HEALTH", DataParameter.getDescriptor());
		list.addToEnd(method);
	}

	public void entityInit(MethodNode method) {
		System.out.println("Injected in EntityLivingBase.entityInit: EntityTweaks.entityInit");
		InsnBuilder list = new InsnBuilder();
		list.print("Sending to: Entity Tweaks");
		list.var(Opcodes.ALOAD, 0);
		list.dup();
		list.getField(EntityLivingBase.getClassName(), DataManager.getName(), EntityDataManager.getDescriptor());
		list.invokeStatic(ZPackage + "/tweaks/EntityTweaks", "entityInit",
				"(" + EntityLivingBase.getDescriptor() + EntityDataManager.getDescriptor() + ")V", false);
		list.addToEnd(method);
	}

	public void setHealth(MethodNode method) {
		System.out.println("Injecting code into: EntityLivingBase.setHealth");

		InsnBuilder list = new InsnBuilder();
		// Retrieve LAST_HEALTH
		list.var(Opcodes.ALOAD, 0);
		list.getField(EntityLivingBase.getClassName(), DataManager.getName(), EntityDataManager.getDescriptor());
		list.getStatic(EntityLivingBase.getClassName(), "LAST_HEALTH", DataParameter.getDescriptor());

		// Get Current Health
		list.var(Opcodes.ALOAD, 0);
		list.invokeVirtual(EntityLivingBase.getClassName(), GetHealth.getName(), GetHealth.getDescriptor(), false);

		// Set Last Health
		list.valueOfFloat();
		list.invokeVirtual(EntityDataManager.getClassName(), Set.getName(), Set.getDescriptor(), false);

		list.addToStart(method);
	}

	public void readNBT(MethodNode method) {
		// TODO Auto-generated method stub

	}

	public void writeNBT(MethodNode method) {
		// TODO Auto-generated method stub

	}

}

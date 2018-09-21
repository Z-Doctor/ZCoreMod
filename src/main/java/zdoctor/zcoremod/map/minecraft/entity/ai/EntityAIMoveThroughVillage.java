package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIMoveThroughVillage {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xq";
		else
			return "net/minecraft/entity/ai/EntityAIMoveThroughVillage";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xq";
		else
			return "EntityAIMoveThroughVillage";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxq;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIMoveThroughVillage;";
	}

	/**
	 * <p>
	 * Name: path
	 * </p>
	 */
	public static McObfPair field_75419_c = McMappingDatabase.getSRG("field_75419_c");

	/**
	 * <p>
	 * Name: doesDoorListContain
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/village/VillageDoorInfo;)Z]
	 * </p>
	 */
	public static McObfPair func_75413_a = McMappingDatabase.getSRG("EntityAIMoveThroughVillage.func_75413_a");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIMoveThroughVillage.func_75253_b");

	/**
	 * <p>
	 * Name: resizeDoorList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75414_f = McMappingDatabase.getSRG("EntityAIMoveThroughVillage.func_75414_f");

	/**
	 * <p>
	 * Name: isNocturnal
	 * </p>
	 */
	public static McObfPair field_75417_e = McMappingDatabase.getSRG("field_75417_e");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_75420_a = McMappingDatabase.getSRG("field_75420_a");

	/**
	 * <p>
	 * Name: doorInfo
	 * </p>
	 */
	public static McObfPair field_75416_d = McMappingDatabase.getSRG("field_75416_d");

	/**
	 * <p>
	 * Name: movementSpeed
	 * </p>
	 */
	public static McObfPair field_75418_b = McMappingDatabase.getSRG("field_75418_b");

	/**
	 * <p>
	 * Name: doorList
	 * </p>
	 */
	public static McObfPair field_75415_f = McMappingDatabase.getSRG("field_75415_f");

	/**
	 * <p>
	 * Name: findNearestDoor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/village/Village;)Lnet/minecraft/village/VillageDoorInfo;]
	 * </p>
	 */
	public static McObfPair func_75412_a = McMappingDatabase.getSRG("EntityAIMoveThroughVillage.func_75412_a");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIMoveThroughVillage.func_75251_c");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIMoveThroughVillage.func_75249_e");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIMoveThroughVillage.func_75250_a");

}

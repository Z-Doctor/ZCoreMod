package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIFleeSun {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wy";
		else
			return "net/minecraft/entity/ai/EntityAIFleeSun";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wy";
		else
			return "EntityAIFleeSun";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwy;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIFleeSun;";
	}

	/**
	 * <p>
	 * Name: creature
	 * </p>
	 */
	public static McObfPair field_75372_a = McMappingDatabase.getSRG("field_75372_a");

	/**
	 * <p>
	 * Name: movementSpeed
	 * </p>
	 */
	public static McObfPair field_75369_e = McMappingDatabase.getSRG("field_75369_e");

	/**
	 * <p>
	 * Name: shelterX
	 * </p>
	 */
	public static McObfPair field_75370_b = McMappingDatabase.getSRG("field_75370_b");

	/**
	 * <p>
	 * Name: shelterY
	 * </p>
	 */
	public static McObfPair field_75371_c = McMappingDatabase.getSRG("field_75371_c");

	/**
	 * <p>
	 * Name: findPossibleShelter
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_75366_f = McMappingDatabase.getSRG("EntityAIFleeSun.func_75366_f");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_75367_f = McMappingDatabase.getSRG("field_75367_f");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIFleeSun.func_75249_e");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIFleeSun.func_75250_a");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIFleeSun.func_75253_b");

	/**
	 * <p>
	 * Name: shelterZ
	 * </p>
	 */
	public static McObfPair field_75368_d = McMappingDatabase.getSRG("field_75368_d");

}

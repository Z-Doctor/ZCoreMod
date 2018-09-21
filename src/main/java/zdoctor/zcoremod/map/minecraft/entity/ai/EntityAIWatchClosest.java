package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIWatchClosest {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xl";
		else
			return "net/minecraft/entity/ai/EntityAIWatchClosest";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xl";
		else
			return "EntityAIWatchClosest";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxl;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIWatchClosest;";
	}

	/**
	 * <p>
	 * Name: watchedClass
	 * </p>
	 */
	public static McObfPair field_75329_f = McMappingDatabase.getSRG("field_75329_f");

	/**
	 * <p>
	 * Name: closestEntity
	 * </p>
	 */
	public static McObfPair field_75334_a = McMappingDatabase.getSRG("field_75334_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIWatchClosest.func_75250_a");

	/**
	 * <p>
	 * Name: maxDistanceForPlayer
	 * </p>
	 */
	public static McObfPair field_75333_c = McMappingDatabase.getSRG("field_75333_c");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIWatchClosest.func_75246_d");

	/**
	 * <p>
	 * Name: lookTime
	 * </p>
	 */
	public static McObfPair field_75330_d = McMappingDatabase.getSRG("field_75330_d");

	/**
	 * <p>
	 * Name: chance
	 * </p>
	 */
	public static McObfPair field_75331_e = McMappingDatabase.getSRG("field_75331_e");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIWatchClosest.func_75253_b");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_75332_b = McMappingDatabase.getSRG("field_75332_b");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIWatchClosest.func_75251_c");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIWatchClosest.func_75249_e");

}

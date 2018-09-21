package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIFindEntityNearest {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yu";
		else
			return "net/minecraft/entity/ai/EntityAIFindEntityNearest";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yu";
		else
			return "EntityAIFindEntityNearest";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyu;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIFindEntityNearest;";
	}

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_179444_a = McMappingDatabase.getSRG("field_179444_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIFindEntityNearest.func_75250_a");

	/**
	 * <p>
	 * Name: sorter
	 * </p>
	 */
	public static McObfPair field_179440_d = McMappingDatabase.getSRG("field_179440_d");

	/**
	 * <p>
	 * Name: classToCheck
	 * </p>
	 */
	public static McObfPair field_179439_f = McMappingDatabase.getSRG("field_179439_f");

	/**
	 * <p>
	 * Name: predicate
	 * </p>
	 */
	public static McObfPair field_179443_c = McMappingDatabase.getSRG("field_179443_c");

	/**
	 * <p>
	 * Name: getFollowRange
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_179438_f = McMappingDatabase.getSRG("EntityAIFindEntityNearest.func_179438_f");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIFindEntityNearest.func_75251_c");

	/**
	 * <p>
	 * Name: target
	 * </p>
	 */
	public static McObfPair field_179441_e = McMappingDatabase.getSRG("field_179441_e");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIFindEntityNearest.func_75253_b");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIFindEntityNearest.func_75249_e");

	/**
	 * <p>
	 * Name: mob
	 * </p>
	 */
	public static McObfPair field_179442_b = McMappingDatabase.getSRG("field_179442_b");

}

package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIFollow {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xa";
		else
			return "net/minecraft/entity/ai/EntityAIFollow";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xa";
		else
			return "EntityAIFollow";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxa;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIFollow;";
	}

	/**
	 * <p>
	 * Name: followPredicate
	 * </p>
	 */
	public static McObfPair field_192373_b = McMappingDatabase.getSRG("field_192373_b");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIFollow.func_75249_e");

	/**
	 * <p>
	 * Name: speedModifier
	 * </p>
	 */
	public static McObfPair field_192375_d = McMappingDatabase.getSRG("field_192375_d");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIFollow.func_75246_d");

	/**
	 * <p>
	 * Name: timeToRecalcPath
	 * </p>
	 */
	public static McObfPair field_192377_f = McMappingDatabase.getSRG("field_192377_f");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIFollow.func_75251_c");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_192372_a = McMappingDatabase.getSRG("field_192372_a");

	/**
	 * <p>
	 * Name: navigation
	 * </p>
	 */
	public static McObfPair field_192376_e = McMappingDatabase.getSRG("field_192376_e");

	/**
	 * <p>
	 * Name: followingEntity
	 * </p>
	 */
	public static McObfPair field_192374_c = McMappingDatabase.getSRG("field_192374_c");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIFollow.func_75253_b");

	/**
	 * <p>
	 * Name: oldWaterCost
	 * </p>
	 */
	public static McObfPair field_192379_h = McMappingDatabase.getSRG("field_192379_h");

	/**
	 * <p>
	 * Name: areaSize
	 * </p>
	 */
	public static McObfPair field_192380_i = McMappingDatabase.getSRG("field_192380_i");

	/**
	 * <p>
	 * Name: stopDistance
	 * </p>
	 */
	public static McObfPair field_192378_g = McMappingDatabase.getSRG("field_192378_g");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIFollow.func_75250_a");

}

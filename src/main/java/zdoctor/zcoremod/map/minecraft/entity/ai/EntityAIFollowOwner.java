package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIFollowOwner {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xc";
		else
			return "net/minecraft/entity/ai/EntityAIFollowOwner";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xc";
		else
			return "EntityAIFollowOwner";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxc;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIFollowOwner;";
	}

	/**
	 * <p>
	 * Name: isTeleportFriendlyBlock
	 * </p>
	 * <p>
	 * Desc: [(IIIII)Z]
	 * </p>
	 */
	public static McObfPair func_192381_a = McMappingDatabase.getSRG("EntityAIFollowOwner.func_192381_a");

	/**
	 * <p>
	 * Name: timeToRecalcPath
	 * </p>
	 */
	public static McObfPair field_75343_h = McMappingDatabase.getSRG("field_75343_h");

	/**
	 * <p>
	 * Name: petPathfinder
	 * </p>
	 */
	public static McObfPair field_75337_g = McMappingDatabase.getSRG("field_75337_g");

	/**
	 * <p>
	 * Name: owner
	 * </p>
	 */
	public static McObfPair field_75339_e = McMappingDatabase.getSRG("field_75339_e");

	/**
	 * <p>
	 * Name: oldWaterCost
	 * </p>
	 */
	public static McObfPair field_75344_i = McMappingDatabase.getSRG("field_75344_i");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIFollowOwner.func_75249_e");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIFollowOwner.func_75246_d");

	/**
	 * <p>
	 * Name: minDist
	 * </p>
	 */
	public static McObfPair field_75341_c = McMappingDatabase.getSRG("field_75341_c");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIFollowOwner.func_75250_a");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIFollowOwner.func_75253_b");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_75342_a = McMappingDatabase.getSRG("field_75342_a");

	/**
	 * <p>
	 * Name: maxDist
	 * </p>
	 */
	public static McObfPair field_75340_b = McMappingDatabase.getSRG("field_75340_b");

	/**
	 * <p>
	 * Name: tameable
	 * </p>
	 */
	public static McObfPair field_75338_d = McMappingDatabase.getSRG("field_75338_d");

	/**
	 * <p>
	 * Name: followSpeed
	 * </p>
	 */
	public static McObfPair field_75336_f = McMappingDatabase.getSRG("field_75336_f");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIFollowOwner.func_75251_c");

}

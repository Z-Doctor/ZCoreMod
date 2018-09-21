package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAITarget {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "za";
		else
			return "net/minecraft/entity/ai/EntityAITarget";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "za";
		else
			return "EntityAITarget";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lza;";
		else
			return "Lnet/minecraft/entity/ai/EntityAITarget;";
	}

	/**
	 * <p>
	 * Name: targetSearchDelay
	 * </p>
	 */
	public static McObfPair field_75302_c = McMappingDatabase.getSRG("field_75302_c");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAITarget.func_75253_b");

	/**
	 * <p>
	 * Name: isSuitableTarget
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Z)Z]
	 * </p>
	 */
	public static McObfPair func_75296_a = McMappingDatabase.getSRG("EntityAITarget.func_75296_a");

	/**
	 * <p>
	 * Name: isSuitableTarget
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLiving;Lnet/minecraft/entity/EntityLivingBase;ZZ)Z]
	 * </p>
	 */
	public static McObfPair func_179445_a = McMappingDatabase.getSRG("EntityAITarget.func_179445_a");

	/**
	 * <p>
	 * Name: target
	 * </p>
	 */
	public static McObfPair field_188509_g = McMappingDatabase.getSRG("field_188509_g");

	/**
	 * <p>
	 * Name: taskOwner
	 * </p>
	 */
	public static McObfPair field_75299_d = McMappingDatabase.getSRG("field_75299_d");

	/**
	 * <p>
	 * Name: setUnseenMemoryTicks
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/entity/ai/EntityAITarget;]
	 * </p>
	 */
	public static McObfPair func_190882_b = McMappingDatabase.getSRG("EntityAITarget.func_190882_b");

	/**
	 * <p>
	 * Name: targetSearchStatus
	 * </p>
	 */
	public static McObfPair field_75301_b = McMappingDatabase.getSRG("field_75301_b");

	/**
	 * <p>
	 * Name: nearbyOnly
	 * </p>
	 */
	public static McObfPair field_75303_a = McMappingDatabase.getSRG("field_75303_a");

	/**
	 * <p>
	 * Name: targetUnseenTicks
	 * </p>
	 */
	public static McObfPair field_75298_g = McMappingDatabase.getSRG("field_75298_g");

	/**
	 * <p>
	 * Name: shouldCheckSight
	 * </p>
	 */
	public static McObfPair field_75297_f = McMappingDatabase.getSRG("field_75297_f");

	/**
	 * <p>
	 * Name: canEasilyReach
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_75295_a = McMappingDatabase.getSRG("EntityAITarget.func_75295_a");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAITarget.func_75249_e");

	/**
	 * <p>
	 * Name: unseenMemoryTicks
	 * </p>
	 */
	public static McObfPair field_188510_h = McMappingDatabase.getSRG("field_188510_h");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAITarget.func_75251_c");

	/**
	 * <p>
	 * Name: getTargetDistance
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_111175_f = McMappingDatabase.getSRG("EntityAITarget.func_111175_f");

}

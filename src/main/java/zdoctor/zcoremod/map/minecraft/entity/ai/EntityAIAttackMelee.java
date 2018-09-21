package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIAttackMelee {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xo";
		else
			return "net/minecraft/entity/ai/EntityAIAttackMelee";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xo";
		else
			return "EntityAIAttackMelee";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxo;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIAttackMelee;";
	}

	/**
	 * <p>
	 * Name: targetY
	 * </p>
	 */
	public static McObfPair field_151495_j = McMappingDatabase.getSRG("field_151495_j");

	/**
	 * <p>
	 * Name: checkAndPerformAttack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;D)V]
	 * </p>
	 */
	public static McObfPair func_190102_a = McMappingDatabase.getSRG("EntityAIAttackMelee.func_190102_a");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIAttackMelee.func_75251_c");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIAttackMelee.func_75250_a");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_75443_a = McMappingDatabase.getSRG("field_75443_a");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIAttackMelee.func_75249_e");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIAttackMelee.func_75246_d");

	/**
	 * <p>
	 * Name: speedTowardsTarget
	 * </p>
	 */
	public static McObfPair field_75440_e = McMappingDatabase.getSRG("field_75440_e");

	/**
	 * <p>
	 * Name: attacker
	 * </p>
	 */
	public static McObfPair field_75441_b = McMappingDatabase.getSRG("field_75441_b");

	/**
	 * <p>
	 * Name: delayCounter
	 * </p>
	 */
	public static McObfPair field_75445_i = McMappingDatabase.getSRG("field_75445_i");

	/**
	 * <p>
	 * Name: path
	 * </p>
	 */
	public static McObfPair field_75438_g = McMappingDatabase.getSRG("field_75438_g");

	/**
	 * <p>
	 * Name: targetX
	 * </p>
	 */
	public static McObfPair field_151497_i = McMappingDatabase.getSRG("field_151497_i");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIAttackMelee.func_75253_b");

	/**
	 * <p>
	 * Name: longMemory
	 * </p>
	 */
	public static McObfPair field_75437_f = McMappingDatabase.getSRG("field_75437_f");

	/**
	 * <p>
	 * Name: attackTick
	 * </p>
	 */
	public static McObfPair field_75439_d = McMappingDatabase.getSRG("field_75439_d");

	/**
	 * <p>
	 * Name: attackInterval
	 * </p>
	 */
	public static McObfPair field_188493_g = McMappingDatabase.getSRG("field_188493_g");

	/**
	 * <p>
	 * Name: targetZ
	 * </p>
	 */
	public static McObfPair field_151496_k = McMappingDatabase.getSRG("field_151496_k");

	/**
	 * <p>
	 * Name: getAttackReachSqr
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)D]
	 * </p>
	 */
	public static McObfPair func_179512_a = McMappingDatabase.getSRG("EntityAIAttackMelee.func_179512_a");

}

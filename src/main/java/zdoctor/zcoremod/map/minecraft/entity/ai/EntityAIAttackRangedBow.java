package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIAttackRangedBow {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ye";
		else
			return "net/minecraft/entity/ai/EntityAIAttackRangedBow";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ye";
		else
			return "EntityAIAttackRangedBow";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lye;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIAttackRangedBow;";
	}

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIAttackRangedBow.func_75253_b");

	/**
	 * <p>
	 * Name: attackCooldown
	 * </p>
	 */
	public static McObfPair field_188501_c = McMappingDatabase.getSRG("field_188501_c");

	/**
	 * <p>
	 * Name: strafingBackwards
	 * </p>
	 */
	public static McObfPair field_188506_h = McMappingDatabase.getSRG("field_188506_h");

	/**
	 * <p>
	 * Name: attackTime
	 * </p>
	 */
	public static McObfPair field_188503_e = McMappingDatabase.getSRG("field_188503_e");

	/**
	 * <p>
	 * Name: strafingTime
	 * </p>
	 */
	public static McObfPair field_188507_i = McMappingDatabase.getSRG("field_188507_i");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIAttackRangedBow.func_75251_c");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_188499_a = McMappingDatabase.getSRG("field_188499_a");

	/**
	 * <p>
	 * Name: isBowInMainhand
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188498_f = McMappingDatabase.getSRG("EntityAIAttackRangedBow.func_188498_f");

	/**
	 * <p>
	 * Name: moveSpeedAmp
	 * </p>
	 */
	public static McObfPair field_188500_b = McMappingDatabase.getSRG("field_188500_b");

	/**
	 * <p>
	 * Name: maxAttackDistance
	 * </p>
	 */
	public static McObfPair field_188502_d = McMappingDatabase.getSRG("field_188502_d");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIAttackRangedBow.func_75246_d");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIAttackRangedBow.func_75250_a");

	/**
	 * <p>
	 * Name: setAttackCooldown
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_189428_b = McMappingDatabase.getSRG("EntityAIAttackRangedBow.func_189428_b");

	/**
	 * <p>
	 * Name: seeTime
	 * </p>
	 */
	public static McObfPair field_188504_f = McMappingDatabase.getSRG("field_188504_f");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIAttackRangedBow.func_75249_e");

	/**
	 * <p>
	 * Name: strafingClockwise
	 * </p>
	 */
	public static McObfPair field_188505_g = McMappingDatabase.getSRG("field_188505_g");

}

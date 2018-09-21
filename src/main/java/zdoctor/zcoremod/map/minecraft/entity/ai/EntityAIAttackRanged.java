package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIAttackRanged {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yd";
		else
			return "net/minecraft/entity/ai/EntityAIAttackRanged";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yd";
		else
			return "EntityAIAttackRanged";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyd;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIAttackRanged;";
	}

	/**
	 * <p>
	 * Name: attackRadius
	 * </p>
	 */
	public static McObfPair field_96562_i = McMappingDatabase.getSRG("field_96562_i");

	/**
	 * <p>
	 * Name: seeTime
	 * </p>
	 */
	public static McObfPair field_75318_f = McMappingDatabase.getSRG("field_75318_f");

	/**
	 * <p>
	 * Name: rangedAttackTime
	 * </p>
	 */
	public static McObfPair field_75320_d = McMappingDatabase.getSRG("field_75320_d");

	/**
	 * <p>
	 * Name: attackTarget
	 * </p>
	 */
	public static McObfPair field_75323_c = McMappingDatabase.getSRG("field_75323_c");

	/**
	 * <p>
	 * Name: rangedAttackEntityHost
	 * </p>
	 */
	public static McObfPair field_82641_b = McMappingDatabase.getSRG("field_82641_b");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIAttackRanged.func_75250_a");

	/**
	 * <p>
	 * Name: attackIntervalMin
	 * </p>
	 */
	public static McObfPair field_96561_g = McMappingDatabase.getSRG("field_96561_g");

	/**
	 * <p>
	 * Name: entityHost
	 * </p>
	 */
	public static McObfPair field_75322_b = McMappingDatabase.getSRG("field_75322_b");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIAttackRanged.func_75253_b");

	/**
	 * <p>
	 * Name: maxRangedAttackTime
	 * </p>
	 */
	public static McObfPair field_75325_h = McMappingDatabase.getSRG("field_75325_h");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIAttackRanged.func_75251_c");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIAttackRanged.func_75246_d");

	/**
	 * <p>
	 * Name: maxAttackDistance
	 * </p>
	 */
	public static McObfPair field_82642_h = McMappingDatabase.getSRG("field_82642_h");

	/**
	 * <p>
	 * Name: entityMoveSpeed
	 * </p>
	 */
	public static McObfPair field_75321_e = McMappingDatabase.getSRG("field_75321_e");

}

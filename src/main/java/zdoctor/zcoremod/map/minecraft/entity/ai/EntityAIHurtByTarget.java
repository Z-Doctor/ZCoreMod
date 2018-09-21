package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIHurtByTarget {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yt";
		else
			return "net/minecraft/entity/ai/EntityAIHurtByTarget";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yt";
		else
			return "EntityAIHurtByTarget";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyt;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIHurtByTarget;";
	}

	/**
	 * <p>
	 * Name: entityCallsForHelp
	 * </p>
	 */
	public static McObfPair field_75312_a = McMappingDatabase.getSRG("field_75312_a");

	/**
	 * <p>
	 * Name: excludedReinforcementTypes
	 * </p>
	 */
	public static McObfPair field_179447_c = McMappingDatabase.getSRG("field_179447_c");

	/**
	 * <p>
	 * Name: setEntityAttackTarget
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityCreature;Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_179446_a = McMappingDatabase.getSRG("EntityAIHurtByTarget.func_179446_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIHurtByTarget.func_75250_a");

	/**
	 * <p>
	 * Name: alertOthers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190105_f = McMappingDatabase.getSRG("EntityAIHurtByTarget.func_190105_f");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIHurtByTarget.func_75249_e");

	/**
	 * <p>
	 * Name: revengeTimerOld
	 * </p>
	 */
	public static McObfPair field_142052_b = McMappingDatabase.getSRG("field_142052_b");

}

package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CombatTracker {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uq";
		else
			return "net/minecraft/util/CombatTracker";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uq";
		else
			return "CombatTracker";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Luq;";
		else
			return "Lnet/minecraft/util/CombatTracker;";
	}

	/**
	 * <p>
	 * Name: resetFallSuffix
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_94542_g = McMappingDatabase.getSRG("CombatTracker.func_94542_g");

	/**
	 * <p>
	 * Name: lastDamageTime
	 * </p>
	 */
	public static McObfPair field_94555_c = McMappingDatabase.getSRG("field_94555_c");

	/**
	 * <p>
	 * Name: reset
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_94549_h = McMappingDatabase.getSRG("CombatTracker.func_94549_h");

	/**
	 * <p>
	 * Name: fallSuffix
	 * </p>
	 */
	public static McObfPair field_94551_f = McMappingDatabase.getSRG("field_94551_f");

	/**
	 * <p>
	 * Name: calculateFallSuffix
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_94545_a = McMappingDatabase.getSRG("CombatTracker.func_94545_a");

	/**
	 * <p>
	 * Name: getCombatDuration
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_180134_f = McMappingDatabase.getSRG("CombatTracker.func_180134_f");

	/**
	 * <p>
	 * Name: trackDamage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;FF)V]
	 * </p>
	 */
	public static McObfPair func_94547_a = McMappingDatabase.getSRG("CombatTracker.func_94547_a");

	/**
	 * <p>
	 * Name: combatEndTime
	 * </p>
	 */
	public static McObfPair field_152776_e = McMappingDatabase.getSRG("field_152776_e");

	/**
	 * <p>
	 * Name: combatEntries
	 * </p>
	 */
	public static McObfPair field_94556_a = McMappingDatabase.getSRG("field_94556_a");

	/**
	 * <p>
	 * Name: getFallSuffix
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/CombatEntry;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_94548_b = McMappingDatabase.getSRG("CombatTracker.func_94548_b");

	/**
	 * <p>
	 * Name: getFighter
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EntityLivingBase;]
	 * </p>
	 */
	public static McObfPair func_180135_h = McMappingDatabase.getSRG("CombatTracker.func_180135_h");

	/**
	 * <p>
	 * Name: getBestAttacker
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EntityLivingBase;]
	 * </p>
	 */
	public static McObfPair func_94550_c = McMappingDatabase.getSRG("CombatTracker.func_94550_c");

	/**
	 * <p>
	 * Name: combatStartTime
	 * </p>
	 */
	public static McObfPair field_152775_d = McMappingDatabase.getSRG("field_152775_d");

	/**
	 * <p>
	 * Name: getDeathMessage
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_151521_b = McMappingDatabase.getSRG("CombatTracker.func_151521_b");

	/**
	 * <p>
	 * Name: inCombat
	 * </p>
	 */
	public static McObfPair field_94552_d = McMappingDatabase.getSRG("field_94552_d");

	/**
	 * <p>
	 * Name: fighter
	 * </p>
	 */
	public static McObfPair field_94554_b = McMappingDatabase.getSRG("field_94554_b");

	/**
	 * <p>
	 * Name: takingDamage
	 * </p>
	 */
	public static McObfPair field_94553_e = McMappingDatabase.getSRG("field_94553_e");

	/**
	 * <p>
	 * Name: getBestCombatEntry
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/CombatEntry;]
	 * </p>
	 */
	public static McObfPair func_94544_f = McMappingDatabase.getSRG("CombatTracker.func_94544_f");

}

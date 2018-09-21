package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CombatEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uo";
		else
			return "net/minecraft/util/CombatEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uo";
		else
			return "CombatEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Luo;";
		else
			return "Lnet/minecraft/util/CombatEntry;";
	}

	/**
	 * <p>
	 * Name: damageSrc
	 * </p>
	 */
	public static McObfPair field_94569_a = McMappingDatabase.getSRG("field_94569_a");

	/**
	 * <p>
	 * Name: getDamageSrcDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_151522_h = McMappingDatabase.getSRG("CombatEntry.func_151522_h");

	/**
	 * <p>
	 * Name: isLivingDamageSrc
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_94559_f = McMappingDatabase.getSRG("CombatEntry.func_94559_f");

	/**
	 * <p>
	 * Name: damage
	 * </p>
	 */
	public static McObfPair field_94568_c = McMappingDatabase.getSRG("field_94568_c");

	/**
	 * <p>
	 * Name: fallDistance
	 * </p>
	 */
	public static McObfPair field_94564_f = McMappingDatabase.getSRG("field_94564_f");

	/**
	 * <p>
	 * Name: getFallSuffix
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_94562_g = McMappingDatabase.getSRG("CombatEntry.func_94562_g");

	/**
	 * <p>
	 * Name: time
	 * </p>
	 */
	public static McObfPair field_94567_b = McMappingDatabase.getSRG("field_94567_b");

	/**
	 * <p>
	 * Name: getDamageAmount
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_94561_i = McMappingDatabase.getSRG("CombatEntry.func_94561_i");

	/**
	 * <p>
	 * Name: getDamageSrc
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_94560_a = McMappingDatabase.getSRG("CombatEntry.func_94560_a");

	/**
	 * <p>
	 * Name: getDamage
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_94563_c = McMappingDatabase.getSRG("CombatEntry.func_94563_c");

	/**
	 * <p>
	 * Name: health
	 * </p>
	 */
	public static McObfPair field_94565_d = McMappingDatabase.getSRG("field_94565_d");

	/**
	 * <p>
	 * Name: fallSuffix
	 * </p>
	 */
	public static McObfPair field_94566_e = McMappingDatabase.getSRG("field_94566_e");

}

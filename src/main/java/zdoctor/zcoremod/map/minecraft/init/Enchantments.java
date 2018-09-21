package zdoctor.zcoremod.map.minecraft.init;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Enchantments {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alo";
		else
			return "net/minecraft/init/Enchantments";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alo";
		else
			return "Enchantments";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lalo;";
		else
			return "Lnet/minecraft/init/Enchantments;";
	}

	/**
	 * <p>
	 * Name: DEPTH_STRIDER
	 * </p>
	 */
	public static McObfPair field_185300_i = McMappingDatabase.getSRG("field_185300_i");

	/**
	 * <p>
	 * Name: LUCK_OF_THE_SEA
	 * </p>
	 */
	public static McObfPair field_151370_z = McMappingDatabase.getSRG("field_151370_z");

	/**
	 * <p>
	 * Name: VANISHING_CURSE
	 * </p>
	 */
	public static McObfPair field_190940_C = McMappingDatabase.getSRG("field_190940_C");

	/**
	 * <p>
	 * Name: FIRE_PROTECTION
	 * </p>
	 */
	public static McObfPair field_77329_d = McMappingDatabase.getSRG("field_77329_d");

	/**
	 * <p>
	 * Name: EFFICIENCY
	 * </p>
	 */
	public static McObfPair field_185305_q = McMappingDatabase.getSRG("field_185305_q");

	/**
	 * <p>
	 * Name: UNBREAKING
	 * </p>
	 */
	public static McObfPair field_185307_s = McMappingDatabase.getSRG("field_185307_s");

	/**
	 * <p>
	 * Name: INFINITY
	 * </p>
	 */
	public static McObfPair field_185312_x = McMappingDatabase.getSRG("field_185312_x");

	/**
	 * <p>
	 * Name: FIRE_ASPECT
	 * </p>
	 */
	public static McObfPair field_77334_n = McMappingDatabase.getSRG("field_77334_n");

	/**
	 * <p>
	 * Name: PROJECTILE_PROTECTION
	 * </p>
	 */
	public static McObfPair field_180308_g = McMappingDatabase.getSRG("field_180308_g");

	/**
	 * <p>
	 * Name: FEATHER_FALLING
	 * </p>
	 */
	public static McObfPair field_180309_e = McMappingDatabase.getSRG("field_180309_e");

	/**
	 * <p>
	 * Name: RESPIRATION
	 * </p>
	 */
	public static McObfPair field_185298_f = McMappingDatabase.getSRG("field_185298_f");

	/**
	 * <p>
	 * Name: FROST_WALKER
	 * </p>
	 */
	public static McObfPair field_185301_j = McMappingDatabase.getSRG("field_185301_j");

	/**
	 * <p>
	 * Name: FLAME
	 * </p>
	 */
	public static McObfPair field_185311_w = McMappingDatabase.getSRG("field_185311_w");

	/**
	 * <p>
	 * Name: SWEEPING
	 * </p>
	 */
	public static McObfPair field_191530_r = McMappingDatabase.getSRG("field_191530_r");

	/**
	 * <p>
	 * Name: PROTECTION
	 * </p>
	 */
	public static McObfPair field_180310_c = McMappingDatabase.getSRG("field_180310_c");

	/**
	 * <p>
	 * Name: LOOTING
	 * </p>
	 */
	public static McObfPair field_185304_p = McMappingDatabase.getSRG("field_185304_p");

	/**
	 * <p>
	 * Name: BANE_OF_ARTHROPODS
	 * </p>
	 */
	public static McObfPair field_180312_n = McMappingDatabase.getSRG("field_180312_n");

	/**
	 * <p>
	 * Name: SHARPNESS
	 * </p>
	 */
	public static McObfPair field_185302_k = McMappingDatabase.getSRG("field_185302_k");

	/**
	 * <p>
	 * Name: MENDING
	 * </p>
	 */
	public static McObfPair field_185296_A = McMappingDatabase.getSRG("field_185296_A");

	/**
	 * <p>
	 * Name: BLAST_PROTECTION
	 * </p>
	 */
	public static McObfPair field_185297_d = McMappingDatabase.getSRG("field_185297_d");

	/**
	 * <p>
	 * Name: SMITE
	 * </p>
	 */
	public static McObfPair field_185303_l = McMappingDatabase.getSRG("field_185303_l");

	/**
	 * <p>
	 * Name: THORNS
	 * </p>
	 */
	public static McObfPair field_92091_k = McMappingDatabase.getSRG("field_92091_k");

	/**
	 * <p>
	 * Name: KNOCKBACK
	 * </p>
	 */
	public static McObfPair field_180313_o = McMappingDatabase.getSRG("field_180313_o");

	/**
	 * <p>
	 * Name: FORTUNE
	 * </p>
	 */
	public static McObfPair field_185308_t = McMappingDatabase.getSRG("field_185308_t");

	/**
	 * <p>
	 * Name: AQUA_AFFINITY
	 * </p>
	 */
	public static McObfPair field_185299_g = McMappingDatabase.getSRG("field_185299_g");

	/**
	 * <p>
	 * Name: SILK_TOUCH
	 * </p>
	 */
	public static McObfPair field_185306_r = McMappingDatabase.getSRG("field_185306_r");

	/**
	 * <p>
	 * Name: PUNCH
	 * </p>
	 */
	public static McObfPair field_185310_v = McMappingDatabase.getSRG("field_185310_v");

	/**
	 * <p>
	 * Name: getRegisteredEnchantment
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/enchantment/Enchantment;]
	 * </p>
	 */
	public static McObfPair func_185295_a = McMappingDatabase.getSRG("Enchantments.func_185295_a");

	/**
	 * <p>
	 * Name: BINDING_CURSE
	 * </p>
	 */
	public static McObfPair field_190941_k = McMappingDatabase.getSRG("field_190941_k");

	/**
	 * <p>
	 * Name: POWER
	 * </p>
	 */
	public static McObfPair field_185309_u = McMappingDatabase.getSRG("field_185309_u");

	/**
	 * <p>
	 * Name: LURE
	 * </p>
	 */
	public static McObfPair field_151369_A = McMappingDatabase.getSRG("field_151369_A");

}

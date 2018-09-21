package zdoctor.zcoremod.map.minecraft.init;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PotionTypes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akj";
		else
			return "net/minecraft/init/PotionTypes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akj";
		else
			return "PotionTypes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lakj;";
		else
			return "Lnet/minecraft/init/PotionTypes;";
	}

	/**
	 * <p>
	 * Name: LONG_SLOWNESS
	 * </p>
	 */
	public static McObfPair field_185247_s = McMappingDatabase.getSRG("field_185247_s");

	/**
	 * <p>
	 * Name: NIGHT_VISION
	 * </p>
	 */
	public static McObfPair field_185234_f = McMappingDatabase.getSRG("field_185234_f");

	/**
	 * <p>
	 * Name: STRONG_HARMING
	 * </p>
	 */
	public static McObfPair field_185253_y = McMappingDatabase.getSRG("field_185253_y");

	/**
	 * <p>
	 * Name: getRegisteredPotionType
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/potion/PotionType;]
	 * </p>
	 */
	public static McObfPair func_185217_a = McMappingDatabase.getSRG("PotionTypes.func_185217_a");

	/**
	 * <p>
	 * Name: REGENERATION
	 * </p>
	 */
	public static McObfPair field_185220_C = McMappingDatabase.getSRG("field_185220_C");

	/**
	 * <p>
	 * Name: LEAPING
	 * </p>
	 */
	public static McObfPair field_185238_j = McMappingDatabase.getSRG("field_185238_j");

	/**
	 * <p>
	 * Name: LONG_SWIFTNESS
	 * </p>
	 */
	public static McObfPair field_185244_p = McMappingDatabase.getSRG("field_185244_p");

	/**
	 * <p>
	 * Name: LONG_FIRE_RESISTANCE
	 * </p>
	 */
	public static McObfPair field_185242_n = McMappingDatabase.getSRG("field_185242_n");

	/**
	 * <p>
	 * Name: LONG_STRENGTH
	 * </p>
	 */
	public static McObfPair field_185224_G = McMappingDatabase.getSRG("field_185224_G");

	/**
	 * <p>
	 * Name: SLOWNESS
	 * </p>
	 */
	public static McObfPair field_185246_r = McMappingDatabase.getSRG("field_185246_r");

	/**
	 * <p>
	 * Name: WEAKNESS
	 * </p>
	 */
	public static McObfPair field_185226_I = McMappingDatabase.getSRG("field_185226_I");

	/**
	 * <p>
	 * Name: THICK
	 * </p>
	 */
	public static McObfPair field_185232_d = McMappingDatabase.getSRG("field_185232_d");

	/**
	 * <p>
	 * Name: CACHE
	 * </p>
	 */
	public static McObfPair field_185228_K = McMappingDatabase.getSRG("field_185228_K");

	/**
	 * <p>
	 * Name: STRONG_SWIFTNESS
	 * </p>
	 */
	public static McObfPair field_185245_q = McMappingDatabase.getSRG("field_185245_q");

	/**
	 * <p>
	 * Name: HARMING
	 * </p>
	 */
	public static McObfPair field_185252_x = McMappingDatabase.getSRG("field_185252_x");

	/**
	 * <p>
	 * Name: STRONG_LEAPING
	 * </p>
	 */
	public static McObfPair field_185240_l = McMappingDatabase.getSRG("field_185240_l");

	/**
	 * <p>
	 * Name: WATER
	 * </p>
	 */
	public static McObfPair field_185230_b = McMappingDatabase.getSRG("field_185230_b");

	/**
	 * <p>
	 * Name: STRONG_HEALING
	 * </p>
	 */
	public static McObfPair field_185251_w = McMappingDatabase.getSRG("field_185251_w");

	/**
	 * <p>
	 * Name: LONG_WATER_BREATHING
	 * </p>
	 */
	public static McObfPair field_185249_u = McMappingDatabase.getSRG("field_185249_u");

	/**
	 * <p>
	 * Name: STRONG_STRENGTH
	 * </p>
	 */
	public static McObfPair field_185225_H = McMappingDatabase.getSRG("field_185225_H");

	/**
	 * <p>
	 * Name: LONG_NIGHT_VISION
	 * </p>
	 */
	public static McObfPair field_185235_g = McMappingDatabase.getSRG("field_185235_g");

	/**
	 * <p>
	 * Name: STRONG_REGENERATION
	 * </p>
	 */
	public static McObfPair field_185222_E = McMappingDatabase.getSRG("field_185222_E");

	/**
	 * <p>
	 * Name: INVISIBILITY
	 * </p>
	 */
	public static McObfPair field_185236_h = McMappingDatabase.getSRG("field_185236_h");

	/**
	 * <p>
	 * Name: LONG_INVISIBILITY
	 * </p>
	 */
	public static McObfPair field_185237_i = McMappingDatabase.getSRG("field_185237_i");

	/**
	 * <p>
	 * Name: WATER_BREATHING
	 * </p>
	 */
	public static McObfPair field_185248_t = McMappingDatabase.getSRG("field_185248_t");

	/**
	 * <p>
	 * Name: HEALING
	 * </p>
	 */
	public static McObfPair field_185250_v = McMappingDatabase.getSRG("field_185250_v");

	/**
	 * <p>
	 * Name: LONG_WEAKNESS
	 * </p>
	 */
	public static McObfPair field_185227_J = McMappingDatabase.getSRG("field_185227_J");

	/**
	 * <p>
	 * Name: EMPTY
	 * </p>
	 */
	public static McObfPair field_185229_a = McMappingDatabase.getSRG("field_185229_a");

	/**
	 * <p>
	 * Name: STRENGTH
	 * </p>
	 */
	public static McObfPair field_185223_F = McMappingDatabase.getSRG("field_185223_F");

	/**
	 * <p>
	 * Name: SWIFTNESS
	 * </p>
	 */
	public static McObfPair field_185243_o = McMappingDatabase.getSRG("field_185243_o");

	/**
	 * <p>
	 * Name: MUNDANE
	 * </p>
	 */
	public static McObfPair field_185231_c = McMappingDatabase.getSRG("field_185231_c");

	/**
	 * <p>
	 * Name: LONG_LEAPING
	 * </p>
	 */
	public static McObfPair field_185239_k = McMappingDatabase.getSRG("field_185239_k");

	/**
	 * <p>
	 * Name: AWKWARD
	 * </p>
	 */
	public static McObfPair field_185233_e = McMappingDatabase.getSRG("field_185233_e");

	/**
	 * <p>
	 * Name: POISON
	 * </p>
	 */
	public static McObfPair field_185254_z = McMappingDatabase.getSRG("field_185254_z");

	/**
	 * <p>
	 * Name: LONG_POISON
	 * </p>
	 */
	public static McObfPair field_185218_A = McMappingDatabase.getSRG("field_185218_A");

	/**
	 * <p>
	 * Name: FIRE_RESISTANCE
	 * </p>
	 */
	public static McObfPair field_185241_m = McMappingDatabase.getSRG("field_185241_m");

	/**
	 * <p>
	 * Name: LONG_REGENERATION
	 * </p>
	 */
	public static McObfPair field_185221_D = McMappingDatabase.getSRG("field_185221_D");

	/**
	 * <p>
	 * Name: STRONG_POISON
	 * </p>
	 */
	public static McObfPair field_185219_B = McMappingDatabase.getSRG("field_185219_B");

}

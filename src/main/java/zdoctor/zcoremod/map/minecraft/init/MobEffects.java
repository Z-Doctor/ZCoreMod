package zdoctor.zcoremod.map.minecraft.init;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MobEffects {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vb";
		else
			return "net/minecraft/init/MobEffects";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vb";
		else
			return "MobEffects";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvb;";
		else
			return "Lnet/minecraft/init/MobEffects;";
	}

	/**
	 * <p>
	 * Name: ABSORPTION
	 * </p>
	 */
	public static McObfPair field_76444_x = McMappingDatabase.getSRG("field_76444_x");

	/**
	 * <p>
	 * Name: INSTANT_HEALTH
	 * </p>
	 */
	public static McObfPair field_76432_h = McMappingDatabase.getSRG("field_76432_h");

	/**
	 * <p>
	 * Name: getRegisteredMobEffect
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/potion/Potion;]
	 * </p>
	 */
	public static McObfPair func_188422_a = McMappingDatabase.getSRG("MobEffects.func_188422_a");

	/**
	 * <p>
	 * Name: STRENGTH
	 * </p>
	 */
	public static McObfPair field_76420_g = McMappingDatabase.getSRG("field_76420_g");

	/**
	 * <p>
	 * Name: INVISIBILITY
	 * </p>
	 */
	public static McObfPair field_76441_p = McMappingDatabase.getSRG("field_76441_p");

	/**
	 * <p>
	 * Name: LEVITATION
	 * </p>
	 */
	public static McObfPair field_188424_y = McMappingDatabase.getSRG("field_188424_y");

	/**
	 * <p>
	 * Name: NAUSEA
	 * </p>
	 */
	public static McObfPair field_76431_k = McMappingDatabase.getSRG("field_76431_k");

	/**
	 * <p>
	 * Name: JUMP_BOOST
	 * </p>
	 */
	public static McObfPair field_76430_j = McMappingDatabase.getSRG("field_76430_j");

	/**
	 * <p>
	 * Name: WEAKNESS
	 * </p>
	 */
	public static McObfPair field_76437_t = McMappingDatabase.getSRG("field_76437_t");

	/**
	 * <p>
	 * Name: SLOWNESS
	 * </p>
	 */
	public static McObfPair field_76421_d = McMappingDatabase.getSRG("field_76421_d");

	/**
	 * <p>
	 * Name: SATURATION
	 * </p>
	 */
	public static McObfPair field_76443_y = McMappingDatabase.getSRG("field_76443_y");

	/**
	 * <p>
	 * Name: INSTANT_DAMAGE
	 * </p>
	 */
	public static McObfPair field_76433_i = McMappingDatabase.getSRG("field_76433_i");

	/**
	 * <p>
	 * Name: WATER_BREATHING
	 * </p>
	 */
	public static McObfPair field_76427_o = McMappingDatabase.getSRG("field_76427_o");

	/**
	 * <p>
	 * Name: WITHER
	 * </p>
	 */
	public static McObfPair field_82731_v = McMappingDatabase.getSRG("field_82731_v");

	/**
	 * <p>
	 * Name: HUNGER
	 * </p>
	 */
	public static McObfPair field_76438_s = McMappingDatabase.getSRG("field_76438_s");

	/**
	 * <p>
	 * Name: POISON
	 * </p>
	 */
	public static McObfPair field_76436_u = McMappingDatabase.getSRG("field_76436_u");

	/**
	 * <p>
	 * Name: UNLUCK
	 * </p>
	 */
	public static McObfPair field_189112_A = McMappingDatabase.getSRG("field_189112_A");

	/**
	 * <p>
	 * Name: FIRE_RESISTANCE
	 * </p>
	 */
	public static McObfPair field_76426_n = McMappingDatabase.getSRG("field_76426_n");

	/**
	 * <p>
	 * Name: HASTE
	 * </p>
	 */
	public static McObfPair field_76422_e = McMappingDatabase.getSRG("field_76422_e");

	/**
	 * <p>
	 * Name: RESISTANCE
	 * </p>
	 */
	public static McObfPair field_76429_m = McMappingDatabase.getSRG("field_76429_m");

	/**
	 * <p>
	 * Name: BLINDNESS
	 * </p>
	 */
	public static McObfPair field_76440_q = McMappingDatabase.getSRG("field_76440_q");

	/**
	 * <p>
	 * Name: MINING_FATIGUE
	 * </p>
	 */
	public static McObfPair field_76419_f = McMappingDatabase.getSRG("field_76419_f");

	/**
	 * <p>
	 * Name: GLOWING
	 * </p>
	 */
	public static McObfPair field_188423_x = McMappingDatabase.getSRG("field_188423_x");

	/**
	 * <p>
	 * Name: REGENERATION
	 * </p>
	 */
	public static McObfPair field_76428_l = McMappingDatabase.getSRG("field_76428_l");

	/**
	 * <p>
	 * Name: SPEED
	 * </p>
	 */
	public static McObfPair field_76424_c = McMappingDatabase.getSRG("field_76424_c");

	/**
	 * <p>
	 * Name: NIGHT_VISION
	 * </p>
	 */
	public static McObfPair field_76439_r = McMappingDatabase.getSRG("field_76439_r");

	/**
	 * <p>
	 * Name: LUCK
	 * </p>
	 */
	public static McObfPair field_188425_z = McMappingDatabase.getSRG("field_188425_z");

	/**
	 * <p>
	 * Name: HEALTH_BOOST
	 * </p>
	 */
	public static McObfPair field_180152_w = McMappingDatabase.getSRG("field_180152_w");

}

package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SoundType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aty";
		else
			return "net/minecraft/block/SoundType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aty";
		else
			return "SoundType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laty;";
		else
			return "Lnet/minecraft/block/SoundType;";
	}

	/**
	 * <p>
	 * Name: placeSound
	 * </p>
	 */
	public static McObfPair field_185864_q = McMappingDatabase.getSRG("field_185864_q");

	/**
	 * <p>
	 * Name: hitSound
	 * </p>
	 */
	public static McObfPair field_185865_r = McMappingDatabase.getSRG("field_185865_r");

	/**
	 * <p>
	 * Name: getPitch
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_185847_b = McMappingDatabase.getSRG("SoundType.func_185847_b");

	/**
	 * <p>
	 * Name: WOOD
	 * </p>
	 */
	public static McObfPair field_185848_a = McMappingDatabase.getSRG("field_185848_a");

	/**
	 * <p>
	 * Name: getVolume
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_185843_a = McMappingDatabase.getSRG("SoundType.func_185843_a");

	/**
	 * <p>
	 * Name: pitch
	 * </p>
	 */
	public static McObfPair field_185861_n = McMappingDatabase.getSRG("field_185861_n");

	/**
	 * <p>
	 * Name: getHitSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_185846_f = McMappingDatabase.getSRG("SoundType.func_185846_f");

	/**
	 * <p>
	 * Name: SAND
	 * </p>
	 */
	public static McObfPair field_185855_h = McMappingDatabase.getSRG("field_185855_h");

	/**
	 * <p>
	 * Name: GROUND
	 * </p>
	 */
	public static McObfPair field_185849_b = McMappingDatabase.getSRG("field_185849_b");

	/**
	 * <p>
	 * Name: breakSound
	 * </p>
	 */
	public static McObfPair field_185862_o = McMappingDatabase.getSRG("field_185862_o");

	/**
	 * <p>
	 * Name: SLIME
	 * </p>
	 */
	public static McObfPair field_185859_l = McMappingDatabase.getSRG("field_185859_l");

	/**
	 * <p>
	 * Name: getFallSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_185842_g = McMappingDatabase.getSRG("SoundType.func_185842_g");

	/**
	 * <p>
	 * Name: volume
	 * </p>
	 */
	public static McObfPair field_185860_m = McMappingDatabase.getSRG("field_185860_m");

	/**
	 * <p>
	 * Name: stepSound
	 * </p>
	 */
	public static McObfPair field_185863_p = McMappingDatabase.getSRG("field_185863_p");

	/**
	 * <p>
	 * Name: STONE
	 * </p>
	 */
	public static McObfPair field_185851_d = McMappingDatabase.getSRG("field_185851_d");

	/**
	 * <p>
	 * Name: LADDER
	 * </p>
	 */
	public static McObfPair field_185857_j = McMappingDatabase.getSRG("field_185857_j");

	/**
	 * <p>
	 * Name: getStepSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_185844_d = McMappingDatabase.getSRG("SoundType.func_185844_d");

	/**
	 * <p>
	 * Name: METAL
	 * </p>
	 */
	public static McObfPair field_185852_e = McMappingDatabase.getSRG("field_185852_e");

	/**
	 * <p>
	 * Name: getBreakSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_185845_c = McMappingDatabase.getSRG("SoundType.func_185845_c");

	/**
	 * <p>
	 * Name: SNOW
	 * </p>
	 */
	public static McObfPair field_185856_i = McMappingDatabase.getSRG("field_185856_i");

	/**
	 * <p>
	 * Name: GLASS
	 * </p>
	 */
	public static McObfPair field_185853_f = McMappingDatabase.getSRG("field_185853_f");

	/**
	 * <p>
	 * Name: ANVIL
	 * </p>
	 */
	public static McObfPair field_185858_k = McMappingDatabase.getSRG("field_185858_k");

	/**
	 * <p>
	 * Name: PLANT
	 * </p>
	 */
	public static McObfPair field_185850_c = McMappingDatabase.getSRG("field_185850_c");

	/**
	 * <p>
	 * Name: CLOTH
	 * </p>
	 */
	public static McObfPair field_185854_g = McMappingDatabase.getSRG("field_185854_g");

	/**
	 * <p>
	 * Name: fallSound
	 * </p>
	 */
	public static McObfPair field_185866_s = McMappingDatabase.getSRG("field_185866_s");

	/**
	 * <p>
	 * Name: getPlaceSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_185841_e = McMappingDatabase.getSRG("SoundType.func_185841_e");

}

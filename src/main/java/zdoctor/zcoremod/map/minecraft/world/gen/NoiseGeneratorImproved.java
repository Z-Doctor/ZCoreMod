package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NoiseGeneratorImproved {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bco";
		else
			return "net/minecraft/world/gen/NoiseGeneratorImproved";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bco";
		else
			return "NoiseGeneratorImproved";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbco;";
		else
			return "Lnet/minecraft/world/gen/NoiseGeneratorImproved;";
	}

	/**
	 * <p>
	 * Name: GRAD_2Z
	 * </p>
	 */
	public static McObfPair field_152385_i = McMappingDatabase.getSRG("field_152385_i");

	/**
	 * <p>
	 * Name: populateNoiseArray
	 * </p>
	 * <p>
	 * Desc: [([DDDDIIIDDDD)V]
	 * </p>
	 */
	public static McObfPair func_76308_a = McMappingDatabase.getSRG("NoiseGeneratorImproved.func_76308_a");

	/**
	 * <p>
	 * Name: GRAD_2X
	 * </p>
	 */
	public static McObfPair field_152384_h = McMappingDatabase.getSRG("field_152384_h");

	/**
	 * <p>
	 * Name: GRAD_Z
	 * </p>
	 */
	public static McObfPair field_152383_g = McMappingDatabase.getSRG("field_152383_g");

	/**
	 * <p>
	 * Name: grad2
	 * </p>
	 * <p>
	 * Desc: [(IDD)D]
	 * </p>
	 */
	public static McObfPair func_76309_a = McMappingDatabase.getSRG("NoiseGeneratorImproved.func_76309_a");

	/**
	 * <p>
	 * Name: xCoord
	 * </p>
	 */
	public static McObfPair field_76315_a = McMappingDatabase.getSRG("field_76315_a");

	/**
	 * <p>
	 * Name: yCoord
	 * </p>
	 */
	public static McObfPair field_76313_b = McMappingDatabase.getSRG("field_76313_b");

	/**
	 * <p>
	 * Name: lerp
	 * </p>
	 * <p>
	 * Desc: [(DDD)D]
	 * </p>
	 */
	public static McObfPair func_76311_b = McMappingDatabase.getSRG("NoiseGeneratorImproved.func_76311_b");

	/**
	 * <p>
	 * Name: GRAD_Y
	 * </p>
	 */
	public static McObfPair field_152382_f = McMappingDatabase.getSRG("field_152382_f");

	/**
	 * <p>
	 * Name: grad
	 * </p>
	 * <p>
	 * Desc: [(IDDD)D]
	 * </p>
	 */
	public static McObfPair func_76310_a = McMappingDatabase.getSRG("NoiseGeneratorImproved.func_76310_a");

	/**
	 * <p>
	 * Name: GRAD_X
	 * </p>
	 */
	public static McObfPair field_152381_e = McMappingDatabase.getSRG("field_152381_e");

	/**
	 * <p>
	 * Name: zCoord
	 * </p>
	 */
	public static McObfPair field_76314_c = McMappingDatabase.getSRG("field_76314_c");

	/**
	 * <p>
	 * Name: permutations
	 * </p>
	 */
	public static McObfPair field_76312_d = McMappingDatabase.getSRG("field_76312_d");

}

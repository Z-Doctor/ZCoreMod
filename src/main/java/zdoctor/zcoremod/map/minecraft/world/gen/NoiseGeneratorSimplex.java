package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NoiseGeneratorSimplex {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bct";
		else
			return "net/minecraft/world/gen/NoiseGeneratorSimplex";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bct";
		else
			return "NoiseGeneratorSimplex";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbct;";
		else
			return "Lnet/minecraft/world/gen/NoiseGeneratorSimplex;";
	}

	/**
	 * <p>
	 * Name: p
	 * </p>
	 */
	public static McObfPair field_151608_f = McMappingDatabase.getSRG("field_151608_f");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [([DDDIIDDD)V]
	 * </p>
	 */
	public static McObfPair func_151606_a = McMappingDatabase.getSRG("NoiseGeneratorSimplex.func_151606_a");

	/**
	 * <p>
	 * Name: grad3
	 * </p>
	 */
	public static McObfPair field_151611_e = McMappingDatabase.getSRG("field_151611_e");

	/**
	 * <p>
	 * Name: xo
	 * </p>
	 */
	public static McObfPair field_151612_b = McMappingDatabase.getSRG("field_151612_b");

	/**
	 * <p>
	 * Name: SQRT_3
	 * </p>
	 */
	public static McObfPair field_151614_a = McMappingDatabase.getSRG("field_151614_a");

	/**
	 * <p>
	 * Name: getValue
	 * </p>
	 * <p>
	 * Desc: [(DD)D]
	 * </p>
	 */
	public static McObfPair func_151605_a = McMappingDatabase.getSRG("NoiseGeneratorSimplex.func_151605_a");

	/**
	 * <p>
	 * Name: G2
	 * </p>
	 */
	public static McObfPair field_151615_h = McMappingDatabase.getSRG("field_151615_h");

	/**
	 * <p>
	 * Name: dot
	 * </p>
	 * <p>
	 * Desc: [([IDD)D]
	 * </p>
	 */
	public static McObfPair func_151604_a = McMappingDatabase.getSRG("NoiseGeneratorSimplex.func_151604_a");

	/**
	 * <p>
	 * Name: F2
	 * </p>
	 */
	public static McObfPair field_151609_g = McMappingDatabase.getSRG("field_151609_g");

	/**
	 * <p>
	 * Name: yo
	 * </p>
	 */
	public static McObfPair field_151613_c = McMappingDatabase.getSRG("field_151613_c");

	/**
	 * <p>
	 * Name: zo
	 * </p>
	 */
	public static McObfPair field_151610_d = McMappingDatabase.getSRG("field_151610_d");

	/**
	 * <p>
	 * Name: fastFloor
	 * </p>
	 * <p>
	 * Desc: [(D)I]
	 * </p>
	 */
	public static McObfPair func_151607_a = McMappingDatabase.getSRG("NoiseGeneratorSimplex.func_151607_a");

}

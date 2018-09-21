package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NoiseGeneratorPerlin {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcq";
		else
			return "net/minecraft/world/gen/NoiseGeneratorPerlin";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcq";
		else
			return "NoiseGeneratorPerlin";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcq;";
		else
			return "Lnet/minecraft/world/gen/NoiseGeneratorPerlin;";
	}

	/**
	 * <p>
	 * Name: noiseLevels
	 * </p>
	 */
	public static McObfPair field_151603_a = McMappingDatabase.getSRG("field_151603_a");

	/**
	 * <p>
	 * Name: getRegion
	 * </p>
	 * <p>
	 * Desc: [([DDDIIDDD)[D]
	 * </p>
	 */
	public static McObfPair func_151599_a = McMappingDatabase.getSRG("NoiseGeneratorPerlin.func_151599_a");

	/**
	 * <p>
	 * Name: levels
	 * </p>
	 */
	public static McObfPair field_151602_b = McMappingDatabase.getSRG("field_151602_b");

	/**
	 * <p>
	 * Name: getValue
	 * </p>
	 * <p>
	 * Desc: [(DD)D]
	 * </p>
	 */
	public static McObfPair func_151601_a = McMappingDatabase.getSRG("NoiseGeneratorPerlin.func_151601_a");

	/**
	 * <p>
	 * Name: getRegion
	 * </p>
	 * <p>
	 * Desc: [([DDDIIDDDD)[D]
	 * </p>
	 */
	public static McObfPair func_151600_a = McMappingDatabase.getSRG("NoiseGeneratorPerlin.func_151600_a");

}

package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NoiseGeneratorOctaves {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcp";
		else
			return "net/minecraft/world/gen/NoiseGeneratorOctaves";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcp";
		else
			return "NoiseGeneratorOctaves";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcp;";
		else
			return "Lnet/minecraft/world/gen/NoiseGeneratorOctaves;";
	}

	/**
	 * <p>
	 * Name: octaves
	 * </p>
	 */
	public static McObfPair field_76306_b = McMappingDatabase.getSRG("field_76306_b");

	/**
	 * <p>
	 * Name: generateNoiseOctaves
	 * </p>
	 * <p>
	 * Desc: [([DIIIIIIDDD)[D]
	 * </p>
	 */
	public static McObfPair func_76304_a = McMappingDatabase.getSRG("NoiseGeneratorOctaves.func_76304_a");

	/**
	 * <p>
	 * Name: generateNoiseOctaves
	 * </p>
	 * <p>
	 * Desc: [([DIIIIDDD)[D]
	 * </p>
	 */
	public static McObfPair func_76305_a = McMappingDatabase.getSRG("NoiseGeneratorOctaves.func_76305_a");

	/**
	 * <p>
	 * Name: generatorCollection
	 * </p>
	 */
	public static McObfPair field_76307_a = McMappingDatabase.getSRG("field_76307_a");

}

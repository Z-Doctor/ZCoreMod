package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeEnd {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aoh";
		else
			return "net/minecraft/world/biome/BiomeEnd";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aoh";
		else
			return "BiomeEnd";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laoh;";
		else
			return "Lnet/minecraft/world/biome/BiomeEnd;";
	}

	/**
	 * <p>
	 * Name: getSkyColorByTemp
	 * </p>
	 * <p>
	 * Desc: [(F)I]
	 * </p>
	 */
	public static McObfPair func_76731_a = McMappingDatabase.getSRG("BiomeEnd.func_76731_a");

}

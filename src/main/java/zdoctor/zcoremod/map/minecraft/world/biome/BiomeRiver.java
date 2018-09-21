package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeRiver {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aoc";
		else
			return "net/minecraft/world/biome/BiomeRiver";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aoc";
		else
			return "BiomeRiver";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laoc;";
		else
			return "Lnet/minecraft/world/biome/BiomeRiver;";
	}

}

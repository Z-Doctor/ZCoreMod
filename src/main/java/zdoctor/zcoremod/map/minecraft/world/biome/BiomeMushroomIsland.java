package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeMushroomIsland {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anx";
		else
			return "net/minecraft/world/biome/BiomeMushroomIsland";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anx";
		else
			return "BiomeMushroomIsland";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanx;";
		else
			return "Lnet/minecraft/world/biome/BiomeMushroomIsland;";
	}

}

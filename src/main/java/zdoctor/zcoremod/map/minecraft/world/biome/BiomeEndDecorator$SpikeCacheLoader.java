package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeEndDecorator$SpikeCacheLoader {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aoi$a";
		else
			return "net/minecraft/world/biome/BiomeEndDecorator$SpikeCacheLoader";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aoi$a";
		else
			return "BiomeEndDecorator$SpikeCacheLoader";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laoi$a;";
		else
			return "Lnet/minecraft/world/biome/BiomeEndDecorator$SpikeCacheLoader;";
	}

}

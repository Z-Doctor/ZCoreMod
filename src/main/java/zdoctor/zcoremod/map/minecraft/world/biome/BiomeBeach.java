package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeBeach {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ang";
		else
			return "net/minecraft/world/biome/BiomeBeach";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ang";
		else
			return "BiomeBeach";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lang;";
		else
			return "Lnet/minecraft/world/biome/BiomeBeach;";
	}

}

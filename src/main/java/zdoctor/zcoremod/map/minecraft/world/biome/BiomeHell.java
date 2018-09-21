package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeHell {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ans";
		else
			return "net/minecraft/world/biome/BiomeHell";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ans";
		else
			return "BiomeHell";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lans;";
		else
			return "Lnet/minecraft/world/biome/BiomeHell;";
	}

}

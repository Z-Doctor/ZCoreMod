package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeMesa$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anw$1";
		else
			return "net/minecraft/world/biome/BiomeMesa$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anw$1";
		else
			return "BiomeMesa$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanw$1;";
		else
			return "Lnet/minecraft/world/biome/BiomeMesa$1;";
	}

}

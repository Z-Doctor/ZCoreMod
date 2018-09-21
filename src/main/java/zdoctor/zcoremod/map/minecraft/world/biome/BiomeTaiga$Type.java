package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeTaiga$Type {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aog$a";
		else
			return "net/minecraft/world/biome/BiomeTaiga$Type";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aog$a";
		else
			return "BiomeTaiga$Type";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laog$a;";
		else
			return "Lnet/minecraft/world/biome/BiomeTaiga$Type;";
	}

}

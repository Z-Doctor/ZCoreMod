package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Biome$TempCategory {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anh$b";
		else
			return "net/minecraft/world/biome/Biome$TempCategory";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anh$b";
		else
			return "Biome$TempCategory";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanh$b;";
		else
			return "Lnet/minecraft/world/biome/Biome$TempCategory;";
	}

}

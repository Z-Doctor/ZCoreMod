package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MinecraftException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amv";
		else
			return "net/minecraft/world/MinecraftException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amv";
		else
			return "MinecraftException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamv;";
		else
			return "Lnet/minecraft/world/MinecraftException;";
	}

}

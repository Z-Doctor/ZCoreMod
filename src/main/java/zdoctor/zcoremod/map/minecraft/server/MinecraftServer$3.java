package zdoctor.zcoremod.map.minecraft.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MinecraftServer$3 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "net/minecraft/server/MinecraftServer$3";
		else
			return "net/minecraft/server/MinecraftServer$3";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "MinecraftServer$3";
		else
			return "MinecraftServer$3";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnet/minecraft/server/MinecraftServer$3;";
		else
			return "Lnet/minecraft/server/MinecraftServer$3;";
	}

}

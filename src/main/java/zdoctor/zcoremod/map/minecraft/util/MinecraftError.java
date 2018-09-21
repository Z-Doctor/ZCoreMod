package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MinecraftError {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "big";
		else
			return "net/minecraft/util/MinecraftError";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "big";
		else
			return "MinecraftError";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbig;";
		else
			return "Lnet/minecraft/util/MinecraftError;";
	}

}

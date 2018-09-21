package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumConnectionState$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gx$1";
		else
			return "net/minecraft/network/EnumConnectionState$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gx$1";
		else
			return "EnumConnectionState$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgx$1;";
		else
			return "Lnet/minecraft/network/EnumConnectionState$1;";
	}

}

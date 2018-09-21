package zdoctor.zcoremod.map.minecraft.server.dedicated;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DedicatedServer$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nz$2";
		else
			return "net/minecraft/server/dedicated/DedicatedServer$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nz$2";
		else
			return "DedicatedServer$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnz$2;";
		else
			return "Lnet/minecraft/server/dedicated/DedicatedServer$2;";
	}

}

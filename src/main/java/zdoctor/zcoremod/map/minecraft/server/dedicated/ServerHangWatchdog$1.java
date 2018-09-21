package zdoctor.zcoremod.map.minecraft.server.dedicated;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerHangWatchdog$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oa$1";
		else
			return "net/minecraft/server/dedicated/ServerHangWatchdog$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oa$1";
		else
			return "ServerHangWatchdog$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Loa$1;";
		else
			return "Lnet/minecraft/server/dedicated/ServerHangWatchdog$1;";
	}

}

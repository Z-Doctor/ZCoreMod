package zdoctor.zcoremod.map.minecraft.server.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetHandlerLoginServer$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pc$1";
		else
			return "net/minecraft/server/network/NetHandlerLoginServer$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pc$1";
		else
			return "NetHandlerLoginServer$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpc$1;";
		else
			return "Lnet/minecraft/server/network/NetHandlerLoginServer$1;";
	}

}

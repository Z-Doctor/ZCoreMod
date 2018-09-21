package zdoctor.zcoremod.map.minecraft.server.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetHandlerLoginServer$LoginState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pc$a";
		else
			return "net/minecraft/server/network/NetHandlerLoginServer$LoginState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pc$a";
		else
			return "NetHandlerLoginServer$LoginState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpc$a;";
		else
			return "Lnet/minecraft/server/network/NetHandlerLoginServer$LoginState;";
	}

}

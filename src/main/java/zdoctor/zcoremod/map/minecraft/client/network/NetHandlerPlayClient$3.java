package zdoctor.zcoremod.map.minecraft.client.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetHandlerPlayClient$3 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brz$3";
		else
			return "net/minecraft/client/network/NetHandlerPlayClient$3";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brz$3";
		else
			return "NetHandlerPlayClient$3";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbrz$3;";
		else
			return "Lnet/minecraft/client/network/NetHandlerPlayClient$3;";
	}

}

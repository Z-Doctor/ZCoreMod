package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetHandlerPlayServer$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pa$2";
		else
			return "net/minecraft/network/NetHandlerPlayServer$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pa$2";
		else
			return "NetHandlerPlayServer$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpa$2;";
		else
			return "Lnet/minecraft/network/NetHandlerPlayServer$2;";
	}

}

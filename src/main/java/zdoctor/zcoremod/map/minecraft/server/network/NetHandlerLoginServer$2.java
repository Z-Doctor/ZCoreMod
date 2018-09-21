package zdoctor.zcoremod.map.minecraft.server.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetHandlerLoginServer$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pc$2";
		else
			return "net/minecraft/server/network/NetHandlerLoginServer$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pc$2";
		else
			return "NetHandlerLoginServer$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpc$2;";
		else
			return "Lnet/minecraft/server/network/NetHandlerLoginServer$2;";
	}

	/**
	 * <p>
	 * Name: getAddress
	 * </p>
	 * <p>
	 * Desc: [()Ljava/net/InetAddress;]
	 * </p>
	 */
	public static McObfPair func_191235_a = McMappingDatabase.getSRG("NetHandlerLoginServer$2.func_191235_a");

}

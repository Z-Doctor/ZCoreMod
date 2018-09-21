package zdoctor.zcoremod.map.minecraft.network.handshake;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class INetHandlerHandshakeServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "me";
		else
			return "net/minecraft/network/handshake/INetHandlerHandshakeServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "me";
		else
			return "INetHandlerHandshakeServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lme;";
		else
			return "Lnet/minecraft/network/handshake/INetHandlerHandshakeServer;";
	}

	/**
	 * <p>
	 * Name: processHandshake
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/handshake/client/C00Handshake;)V]
	 * </p>
	 */
	public static McObfPair func_147383_a = McMappingDatabase.getSRG("INetHandlerHandshakeServer.func_147383_a");

}

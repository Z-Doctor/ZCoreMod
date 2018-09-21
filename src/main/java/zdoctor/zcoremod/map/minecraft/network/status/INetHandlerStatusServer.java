package zdoctor.zcoremod.map.minecraft.network.status;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class INetHandlerStatusServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mu";
		else
			return "net/minecraft/network/status/INetHandlerStatusServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mu";
		else
			return "INetHandlerStatusServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lmu;";
		else
			return "Lnet/minecraft/network/status/INetHandlerStatusServer;";
	}

	/**
	 * <p>
	 * Name: processServerQuery
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/status/client/CPacketServerQuery;)V]
	 * </p>
	 */
	public static McObfPair func_147312_a = McMappingDatabase.getSRG("INetHandlerStatusServer.func_147312_a");

	/**
	 * <p>
	 * Name: processPing
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/status/client/CPacketPing;)V]
	 * </p>
	 */
	public static McObfPair func_147311_a = McMappingDatabase.getSRG("INetHandlerStatusServer.func_147311_a");

}

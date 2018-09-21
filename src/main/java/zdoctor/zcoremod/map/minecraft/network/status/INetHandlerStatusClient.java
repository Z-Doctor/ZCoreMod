package zdoctor.zcoremod.map.minecraft.network.status;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class INetHandlerStatusClient {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mq";
		else
			return "net/minecraft/network/status/INetHandlerStatusClient";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mq";
		else
			return "INetHandlerStatusClient";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lmq;";
		else
			return "Lnet/minecraft/network/status/INetHandlerStatusClient;";
	}

	/**
	 * <p>
	 * Name: handlePong
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/status/server/SPacketPong;)V]
	 * </p>
	 */
	public static McObfPair func_147398_a = McMappingDatabase.getSRG("INetHandlerStatusClient.func_147398_a");

	/**
	 * <p>
	 * Name: handleServerInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/status/server/SPacketServerInfo;)V]
	 * </p>
	 */
	public static McObfPair func_147397_a = McMappingDatabase.getSRG("INetHandlerStatusClient.func_147397_a");

}

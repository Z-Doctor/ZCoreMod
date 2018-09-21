package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetworkSystem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oz";
		else
			return "net/minecraft/network/NetworkSystem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oz";
		else
			return "NetworkSystem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Loz;";
		else
			return "Lnet/minecraft/network/NetworkSystem;";
	}

	/**
	 * <p>
	 * Name: terminateEndpoints
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_151268_b = McMappingDatabase.getSRG("NetworkSystem.func_151268_b");

	/**
	 * <p>
	 * Name: isAlive
	 * </p>
	 */
	public static McObfPair field_151277_a = McMappingDatabase.getSRG("field_151277_a");

	/**
	 * <p>
	 * Name: networkManagers
	 * </p>
	 */
	public static McObfPair field_151272_f = McMappingDatabase.getSRG("field_151272_f");

	/**
	 * <p>
	 * Name: addLocalEndpoint
	 * </p>
	 * <p>
	 * Desc: [()Ljava/net/SocketAddress;]
	 * </p>
	 */
	public static McObfPair func_151270_a = McMappingDatabase.getSRG("NetworkSystem.func_151270_a");

	/**
	 * <p>
	 * Name: SERVER_LOCAL_EVENTLOOP
	 * </p>
	 */
	public static McObfPair field_180232_b = McMappingDatabase.getSRG("field_180232_b");

	/**
	 * <p>
	 * Name: getServer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/MinecraftServer;]
	 * </p>
	 */
	public static McObfPair func_151267_d = McMappingDatabase.getSRG("NetworkSystem.func_151267_d");

	/**
	 * <p>
	 * Name: SERVER_EPOLL_EVENTLOOP
	 * </p>
	 */
	public static McObfPair field_181141_b = McMappingDatabase.getSRG("field_181141_b");

	/**
	 * <p>
	 * Name: networkTick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_151269_c = McMappingDatabase.getSRG("NetworkSystem.func_151269_c");

	/**
	 * <p>
	 * Name: SERVER_NIO_EVENTLOOP
	 * </p>
	 */
	public static McObfPair field_151276_c = McMappingDatabase.getSRG("field_151276_c");

	/**
	 * <p>
	 * Name: mcServer
	 * </p>
	 */
	public static McObfPair field_151273_d = McMappingDatabase.getSRG("field_151273_d");

	/**
	 * <p>
	 * Name: addLanEndpoint
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/InetAddress;I)V]
	 * </p>
	 */
	public static McObfPair func_151265_a = McMappingDatabase.getSRG("NetworkSystem.func_151265_a");

	/**
	 * <p>
	 * Name: endpoints
	 * </p>
	 */
	public static McObfPair field_151274_e = McMappingDatabase.getSRG("field_151274_e");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_151275_b = McMappingDatabase.getSRG("field_151275_b");

}

package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetworkManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gw";
		else
			return "net/minecraft/network/NetworkManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gw";
		else
			return "NetworkManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgw;";
		else
			return "Lnet/minecraft/network/NetworkManager;";
	}

	/**
	 * <p>
	 * Name: packetListener
	 * </p>
	 */
	public static McObfPair field_150744_m = McMappingDatabase.getSRG("field_150744_m");

	/**
	 * <p>
	 * Name: dispatchPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/Packet;[Lio/netty/util/concurrent/GenericFutureListener;)V]
	 * </p>
	 */
	public static McObfPair func_150732_b = McMappingDatabase.getSRG("NetworkManager.func_150732_b");

	/**
	 * <p>
	 * Name: channel
	 * </p>
	 */
	public static McObfPair field_150746_k = McMappingDatabase.getSRG("field_150746_k");

	/**
	 * <p>
	 * Name: isChannelOpen
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150724_d = McMappingDatabase.getSRG("NetworkManager.func_150724_d");

	/**
	 * <p>
	 * Name: terminationReason
	 * </p>
	 */
	public static McObfPair field_150742_o = McMappingDatabase.getSRG("field_150742_o");

	/**
	 * <p>
	 * Name: getExitMessage
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_150730_f = McMappingDatabase.getSRG("NetworkManager.func_150730_f");

	/**
	 * <p>
	 * Name: setCompressionThreshold
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179289_a = McMappingDatabase.getSRG("NetworkManager.func_179289_a");

	/**
	 * <p>
	 * Name: disableAutoRead
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_150721_g = McMappingDatabase.getSRG("NetworkManager.func_150721_g");

	/**
	 * <p>
	 * Name: CLIENT_EPOLL_EVENTLOOP
	 * </p>
	 */
	public static McObfPair field_181125_e = McMappingDatabase.getSRG("field_181125_e");

	/**
	 * <p>
	 * Name: provideLocalClient
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/SocketAddress;)Lnet/minecraft/network/NetworkManager;]
	 * </p>
	 */
	public static McObfPair func_150722_a = McMappingDatabase.getSRG("NetworkManager.func_150722_a");

	/**
	 * <p>
	 * Name: createNetworkManagerAndConnect
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/InetAddress;IZ)Lnet/minecraft/network/NetworkManager;]
	 * </p>
	 */
	public static McObfPair func_181124_a = McMappingDatabase.getSRG("NetworkManager.func_181124_a");

	/**
	 * <p>
	 * Name: setNetHandler
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V]
	 * </p>
	 */
	public static McObfPair func_150719_a = McMappingDatabase.getSRG("NetworkManager.func_150719_a");

	/**
	 * <p>
	 * Name: checkDisconnected
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179293_l = McMappingDatabase.getSRG("NetworkManager.func_179293_l");

	/**
	 * <p>
	 * Name: getRemoteAddress
	 * </p>
	 * <p>
	 * Desc: [()Ljava/net/SocketAddress;]
	 * </p>
	 */
	public static McObfPair func_74430_c = McMappingDatabase.getSRG("NetworkManager.func_74430_c");

	/**
	 * <p>
	 * Name: PROTOCOL_ATTRIBUTE_KEY
	 * </p>
	 */
	public static McObfPair field_150739_c = McMappingDatabase.getSRG("field_150739_c");

	/**
	 * <p>
	 * Name: direction
	 * </p>
	 */
	public static McObfPair field_179294_g = McMappingDatabase.getSRG("field_179294_g");

	/**
	 * <p>
	 * Name: isEncrypted
	 * </p>
	 */
	public static McObfPair field_152463_r = McMappingDatabase.getSRG("field_152463_r");

	/**
	 * <p>
	 * Name: closeChannel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_150718_a = McMappingDatabase.getSRG("NetworkManager.func_150718_a");

	/**
	 * <p>
	 * Name: enableEncryption
	 * </p>
	 * <p>
	 * Desc: [(Ljavax/crypto/SecretKey;)V]
	 * </p>
	 */
	public static McObfPair func_150727_a = McMappingDatabase.getSRG("NetworkManager.func_150727_a");

	/**
	 * <p>
	 * Name: hasNoChannel
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_179291_h = McMappingDatabase.getSRG("NetworkManager.func_179291_h");

	/**
	 * <p>
	 * Name: setConnectionState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/EnumConnectionState;)V]
	 * </p>
	 */
	public static McObfPair func_150723_a = McMappingDatabase.getSRG("NetworkManager.func_150723_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_150735_g = McMappingDatabase.getSRG("field_150735_g");

	/**
	 * <p>
	 * Name: flushOutboundQueue
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_150733_h = McMappingDatabase.getSRG("NetworkManager.func_150733_h");

	/**
	 * <p>
	 * Name: readWriteLock
	 * </p>
	 */
	public static McObfPair field_181680_j = McMappingDatabase.getSRG("field_181680_j");

	/**
	 * <p>
	 * Name: NETWORK_PACKETS_MARKER
	 * </p>
	 */
	public static McObfPair field_150738_b = McMappingDatabase.getSRG("field_150738_b");

	/**
	 * <p>
	 * Name: disconnected
	 * </p>
	 */
	public static McObfPair field_179297_n = McMappingDatabase.getSRG("field_179297_n");

	/**
	 * <p>
	 * Name: isEncrypted
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_179292_f = McMappingDatabase.getSRG("NetworkManager.func_179292_f");

	/**
	 * <p>
	 * Name: sendPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/Packet;)V]
	 * </p>
	 */
	public static McObfPair func_179290_a = McMappingDatabase.getSRG("NetworkManager.func_179290_a");

	/**
	 * <p>
	 * Name: getNetHandler
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/INetHandler;]
	 * </p>
	 */
	public static McObfPair func_150729_e = McMappingDatabase.getSRG("NetworkManager.func_150729_e");

	/**
	 * <p>
	 * Name: NETWORK_MARKER
	 * </p>
	 */
	public static McObfPair field_150740_a = McMappingDatabase.getSRG("field_150740_a");

	/**
	 * <p>
	 * Name: CLIENT_NIO_EVENTLOOP
	 * </p>
	 */
	public static McObfPair field_179295_d = McMappingDatabase.getSRG("field_179295_d");

	/**
	 * <p>
	 * Name: processReceivedPackets
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_74428_b = McMappingDatabase.getSRG("NetworkManager.func_74428_b");

	/**
	 * <p>
	 * Name: isLocalChannel
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150731_c = McMappingDatabase.getSRG("NetworkManager.func_150731_c");

	/**
	 * <p>
	 * Name: CLIENT_LOCAL_EVENTLOOP
	 * </p>
	 */
	public static McObfPair field_179296_e = McMappingDatabase.getSRG("field_179296_e");

	/**
	 * <p>
	 * Name: sendPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/Packet;Lio/netty/util/concurrent/GenericFutureListener;[Lio/netty/util/concurrent/GenericFutureListener;)V]
	 * </p>
	 */
	public static McObfPair func_179288_a = McMappingDatabase.getSRG("NetworkManager.func_179288_a");

	/**
	 * <p>
	 * Name: socketAddress
	 * </p>
	 */
	public static McObfPair field_150743_l = McMappingDatabase.getSRG("field_150743_l");

	/**
	 * <p>
	 * Name: outboundPacketsQueue
	 * </p>
	 */
	public static McObfPair field_150745_j = McMappingDatabase.getSRG("field_150745_j");

}

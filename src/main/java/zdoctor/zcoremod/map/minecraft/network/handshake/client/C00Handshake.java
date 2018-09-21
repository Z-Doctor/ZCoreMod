package zdoctor.zcoremod.map.minecraft.network.handshake.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class C00Handshake {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "md";
		else
			return "net/minecraft/network/handshake/client/C00Handshake";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "md";
		else
			return "C00Handshake";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lmd;";
		else
			return "Lnet/minecraft/network/handshake/client/C00Handshake;";
	}

	/**
	 * <p>
	 * Name: port
	 * </p>
	 */
	public static McObfPair field_149599_c = McMappingDatabase.getSRG("field_149599_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("C00Handshake.func_148840_b");

	/**
	 * <p>
	 * Name: requestedState
	 * </p>
	 */
	public static McObfPair field_149597_d = McMappingDatabase.getSRG("field_149597_d");

	/**
	 * <p>
	 * Name: getRequestedState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/EnumConnectionState;]
	 * </p>
	 */
	public static McObfPair func_149594_c = McMappingDatabase.getSRG("C00Handshake.func_149594_c");

	/**
	 * <p>
	 * Name: protocolVersion
	 * </p>
	 */
	public static McObfPair field_149600_a = McMappingDatabase.getSRG("field_149600_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/handshake/INetHandlerHandshakeServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("C00Handshake.func_148833_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("C00Handshake.func_148837_a");

	/**
	 * <p>
	 * Name: ip
	 * </p>
	 */
	public static McObfPair field_149598_b = McMappingDatabase.getSRG("field_149598_b");

	/**
	 * <p>
	 * Name: getProtocolVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149595_d = McMappingDatabase.getSRG("C00Handshake.func_149595_d");

}

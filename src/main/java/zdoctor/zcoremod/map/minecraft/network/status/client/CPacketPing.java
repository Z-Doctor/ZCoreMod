package zdoctor.zcoremod.map.minecraft.network.status.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketPing {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mv";
		else
			return "net/minecraft/network/status/client/CPacketPing";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mv";
		else
			return "CPacketPing";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lmv;";
		else
			return "Lnet/minecraft/network/status/client/CPacketPing;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/status/INetHandlerStatusServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketPing.func_148833_a");

	/**
	 * <p>
	 * Name: getClientTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_149289_c = McMappingDatabase.getSRG("CPacketPing.func_149289_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketPing.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketPing.func_148837_a");

	/**
	 * <p>
	 * Name: clientTime
	 * </p>
	 */
	public static McObfPair field_149290_a = McMappingDatabase.getSRG("field_149290_a");

}

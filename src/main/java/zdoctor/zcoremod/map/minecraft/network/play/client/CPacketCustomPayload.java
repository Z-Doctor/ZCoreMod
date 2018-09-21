package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketCustomPayload {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lh";
		else
			return "net/minecraft/network/play/client/CPacketCustomPayload";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lh";
		else
			return "CPacketCustomPayload";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llh;";
		else
			return "Lnet/minecraft/network/play/client/CPacketCustomPayload;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketCustomPayload.func_148833_a");

	/**
	 * <p>
	 * Name: data
	 * </p>
	 */
	public static McObfPair field_149561_c = McMappingDatabase.getSRG("field_149561_c");

	/**
	 * <p>
	 * Name: getChannelName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149559_c = McMappingDatabase.getSRG("CPacketCustomPayload.func_149559_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketCustomPayload.func_148840_b");

	/**
	 * <p>
	 * Name: channel
	 * </p>
	 */
	public static McObfPair field_149562_a = McMappingDatabase.getSRG("field_149562_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketCustomPayload.func_148837_a");

	/**
	 * <p>
	 * Name: getBufferData
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/PacketBuffer;]
	 * </p>
	 */
	public static McObfPair func_180760_b = McMappingDatabase.getSRG("CPacketCustomPayload.func_180760_b");

}

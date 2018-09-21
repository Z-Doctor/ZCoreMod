package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketCustomPayload {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "iw";
		else
			return "net/minecraft/network/play/server/SPacketCustomPayload";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "iw";
		else
			return "SPacketCustomPayload";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Liw;";
		else
			return "Lnet/minecraft/network/play/server/SPacketCustomPayload;";
	}

	/**
	 * <p>
	 * Name: getChannelName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149169_c = McMappingDatabase.getSRG("SPacketCustomPayload.func_149169_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketCustomPayload.func_148833_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketCustomPayload.func_148840_b");

	/**
	 * <p>
	 * Name: data
	 * </p>
	 */
	public static McObfPair field_149171_b = McMappingDatabase.getSRG("field_149171_b");

	/**
	 * <p>
	 * Name: getBufferData
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/PacketBuffer;]
	 * </p>
	 */
	public static McObfPair func_180735_b = McMappingDatabase.getSRG("SPacketCustomPayload.func_180735_b");

	/**
	 * <p>
	 * Name: channel
	 * </p>
	 */
	public static McObfPair field_149172_a = McMappingDatabase.getSRG("field_149172_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketCustomPayload.func_148837_a");

}

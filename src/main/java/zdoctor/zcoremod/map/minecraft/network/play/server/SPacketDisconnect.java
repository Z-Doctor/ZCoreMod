package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketDisconnect {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "iy";
		else
			return "net/minecraft/network/play/server/SPacketDisconnect";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "iy";
		else
			return "SPacketDisconnect";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Liy;";
		else
			return "Lnet/minecraft/network/play/server/SPacketDisconnect;";
	}

	/**
	 * <p>
	 * Name: getReason
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_149165_c = McMappingDatabase.getSRG("SPacketDisconnect.func_149165_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V, (Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/login/INetHandlerLoginClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketDisconnect.func_148833_a");

	/**
	 * <p>
	 * Name: reason
	 * </p>
	 */
	public static McObfPair field_149167_a = McMappingDatabase.getSRG("field_149167_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V, (Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketDisconnect.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V, (Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketDisconnect.func_148837_a");

}

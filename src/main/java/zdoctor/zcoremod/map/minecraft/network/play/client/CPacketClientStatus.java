package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketClientStatus {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lb";
		else
			return "net/minecraft/network/play/client/CPacketClientStatus";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lb";
		else
			return "CPacketClientStatus";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llb;";
		else
			return "Lnet/minecraft/network/play/client/CPacketClientStatus;";
	}

	/**
	 * <p>
	 * Name: status
	 * </p>
	 */
	public static McObfPair field_149437_a = McMappingDatabase.getSRG("field_149437_a");

	/**
	 * <p>
	 * Name: getStatus
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/client/CPacketClientStatus$State;]
	 * </p>
	 */
	public static McObfPair func_149435_c = McMappingDatabase.getSRG("CPacketClientStatus.func_149435_c");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketClientStatus.func_148837_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketClientStatus.func_148840_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketClientStatus.func_148833_a");

}

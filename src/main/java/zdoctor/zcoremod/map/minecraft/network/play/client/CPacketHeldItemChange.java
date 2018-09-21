package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketHeldItemChange {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lv";
		else
			return "net/minecraft/network/play/client/CPacketHeldItemChange";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lv";
		else
			return "CPacketHeldItemChange";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llv;";
		else
			return "Lnet/minecraft/network/play/client/CPacketHeldItemChange;";
	}

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketHeldItemChange.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketHeldItemChange.func_148837_a");

	/**
	 * <p>
	 * Name: slotId
	 * </p>
	 */
	public static McObfPair field_149615_a = McMappingDatabase.getSRG("field_149615_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketHeldItemChange.func_148833_a");

	/**
	 * <p>
	 * Name: getSlotId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149614_c = McMappingDatabase.getSRG("CPacketHeldItemChange.func_149614_c");

}

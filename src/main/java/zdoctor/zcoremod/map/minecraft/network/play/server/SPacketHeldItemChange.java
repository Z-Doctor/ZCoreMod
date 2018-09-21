package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketHeldItemChange {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kb";
		else
			return "net/minecraft/network/play/server/SPacketHeldItemChange";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kb";
		else
			return "SPacketHeldItemChange";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkb;";
		else
			return "Lnet/minecraft/network/play/server/SPacketHeldItemChange;";
	}

	/**
	 * <p>
	 * Name: getHeldItemHotbarIndex
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149385_c = McMappingDatabase.getSRG("SPacketHeldItemChange.func_149385_c");

	/**
	 * <p>
	 * Name: heldItemHotbarIndex
	 * </p>
	 */
	public static McObfPair field_149387_a = McMappingDatabase.getSRG("field_149387_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketHeldItemChange.func_148840_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketHeldItemChange.func_148833_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketHeldItemChange.func_148837_a");

}

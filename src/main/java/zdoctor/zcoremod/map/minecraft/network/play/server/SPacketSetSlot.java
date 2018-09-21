package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketSetSlot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "iu";
		else
			return "net/minecraft/network/play/server/SPacketSetSlot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "iu";
		else
			return "SPacketSetSlot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Liu;";
		else
			return "Lnet/minecraft/network/play/server/SPacketSetSlot;";
	}

	/**
	 * <p>
	 * Name: getWindowId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149175_c = McMappingDatabase.getSRG("SPacketSetSlot.func_149175_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketSetSlot.func_148833_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketSetSlot.func_148840_b");

	/**
	 * <p>
	 * Name: item
	 * </p>
	 */
	public static McObfPair field_149178_c = McMappingDatabase.getSRG("field_149178_c");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketSetSlot.func_148837_a");

	/**
	 * <p>
	 * Name: getSlot
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149173_d = McMappingDatabase.getSRG("SPacketSetSlot.func_149173_d");

	/**
	 * <p>
	 * Name: getStack
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_149174_e = McMappingDatabase.getSRG("SPacketSetSlot.func_149174_e");

	/**
	 * <p>
	 * Name: windowId
	 * </p>
	 */
	public static McObfPair field_149179_a = McMappingDatabase.getSRG("field_149179_a");

	/**
	 * <p>
	 * Name: slot
	 * </p>
	 */
	public static McObfPair field_149177_b = McMappingDatabase.getSRG("field_149177_b");

}

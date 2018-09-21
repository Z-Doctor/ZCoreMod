package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketClickWindow {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lf";
		else
			return "net/minecraft/network/play/client/CPacketClickWindow";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lf";
		else
			return "CPacketClickWindow";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llf;";
		else
			return "Lnet/minecraft/network/play/client/CPacketClickWindow;";
	}

	/**
	 * <p>
	 * Name: windowId
	 * </p>
	 */
	public static McObfPair field_149554_a = McMappingDatabase.getSRG("field_149554_a");

	/**
	 * <p>
	 * Name: packedClickData
	 * </p>
	 */
	public static McObfPair field_149553_c = McMappingDatabase.getSRG("field_149553_c");

	/**
	 * <p>
	 * Name: mode
	 * </p>
	 */
	public static McObfPair field_149549_f = McMappingDatabase.getSRG("field_149549_f");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketClickWindow.func_148840_b");

	/**
	 * <p>
	 * Name: getClickedItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_149546_g = McMappingDatabase.getSRG("CPacketClickWindow.func_149546_g");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketClickWindow.func_148833_a");

	/**
	 * <p>
	 * Name: getUsedButton
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149543_e = McMappingDatabase.getSRG("CPacketClickWindow.func_149543_e");

	/**
	 * <p>
	 * Name: getClickType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/inventory/ClickType;]
	 * </p>
	 */
	public static McObfPair func_186993_f = McMappingDatabase.getSRG("CPacketClickWindow.func_186993_f");

	/**
	 * <p>
	 * Name: getActionNumber
	 * </p>
	 * <p>
	 * Desc: [()S]
	 * </p>
	 */
	public static McObfPair func_149547_f = McMappingDatabase.getSRG("CPacketClickWindow.func_149547_f");

	/**
	 * <p>
	 * Name: getWindowId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149548_c = McMappingDatabase.getSRG("CPacketClickWindow.func_149548_c");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketClickWindow.func_148837_a");

	/**
	 * <p>
	 * Name: clickedItem
	 * </p>
	 */
	public static McObfPair field_149551_e = McMappingDatabase.getSRG("field_149551_e");

	/**
	 * <p>
	 * Name: slotId
	 * </p>
	 */
	public static McObfPair field_149552_b = McMappingDatabase.getSRG("field_149552_b");

	/**
	 * <p>
	 * Name: actionNumber
	 * </p>
	 */
	public static McObfPair field_149550_d = McMappingDatabase.getSRG("field_149550_d");

	/**
	 * <p>
	 * Name: getSlotId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149544_d = McMappingDatabase.getSRG("CPacketClickWindow.func_149544_d");

}

package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketOpenWindow {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ir";
		else
			return "net/minecraft/network/play/server/SPacketOpenWindow";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ir";
		else
			return "SPacketOpenWindow";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lir;";
		else
			return "Lnet/minecraft/network/play/server/SPacketOpenWindow;";
	}

	/**
	 * <p>
	 * Name: getSlotCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148898_f = McMappingDatabase.getSRG("SPacketOpenWindow.func_148898_f");

	/**
	 * <p>
	 * Name: getWindowTitle
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_179840_c = McMappingDatabase.getSRG("SPacketOpenWindow.func_179840_c");

	/**
	 * <p>
	 * Name: getEntityId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148897_h = McMappingDatabase.getSRG("SPacketOpenWindow.func_148897_h");

	/**
	 * <p>
	 * Name: getGuiId
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148902_e = McMappingDatabase.getSRG("SPacketOpenWindow.func_148902_e");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketOpenWindow.func_148840_b");

	/**
	 * <p>
	 * Name: slotCount
	 * </p>
	 */
	public static McObfPair field_148905_d = McMappingDatabase.getSRG("field_148905_d");

	/**
	 * <p>
	 * Name: windowId
	 * </p>
	 */
	public static McObfPair field_148909_a = McMappingDatabase.getSRG("field_148909_a");

	/**
	 * <p>
	 * Name: hasSlots
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148900_g = McMappingDatabase.getSRG("SPacketOpenWindow.func_148900_g");

	/**
	 * <p>
	 * Name: getWindowId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148901_c = McMappingDatabase.getSRG("SPacketOpenWindow.func_148901_c");

	/**
	 * <p>
	 * Name: inventoryType
	 * </p>
	 */
	public static McObfPair field_148907_b = McMappingDatabase.getSRG("field_148907_b");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_148904_f = McMappingDatabase.getSRG("field_148904_f");

	/**
	 * <p>
	 * Name: windowTitle
	 * </p>
	 */
	public static McObfPair field_148908_c = McMappingDatabase.getSRG("field_148908_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketOpenWindow.func_148833_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketOpenWindow.func_148837_a");

}

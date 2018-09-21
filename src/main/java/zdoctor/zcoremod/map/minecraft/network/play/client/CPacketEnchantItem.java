package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketEnchantItem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "le";
		else
			return "net/minecraft/network/play/client/CPacketEnchantItem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "le";
		else
			return "CPacketEnchantItem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lle;";
		else
			return "Lnet/minecraft/network/play/client/CPacketEnchantItem;";
	}

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketEnchantItem.func_148837_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketEnchantItem.func_148840_b");

	/**
	 * <p>
	 * Name: getWindowId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149539_c = McMappingDatabase.getSRG("CPacketEnchantItem.func_149539_c");

	/**
	 * <p>
	 * Name: getButton
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149537_d = McMappingDatabase.getSRG("CPacketEnchantItem.func_149537_d");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketEnchantItem.func_148833_a");

	/**
	 * <p>
	 * Name: button
	 * </p>
	 */
	public static McObfPair field_149540_b = McMappingDatabase.getSRG("field_149540_b");

	/**
	 * <p>
	 * Name: windowId
	 * </p>
	 */
	public static McObfPair field_149541_a = McMappingDatabase.getSRG("field_149541_a");

}

package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketWindowItems {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "is";
		else
			return "net/minecraft/network/play/server/SPacketWindowItems";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "is";
		else
			return "SPacketWindowItems";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lis;";
		else
			return "Lnet/minecraft/network/play/server/SPacketWindowItems;";
	}

	/**
	 * <p>
	 * Name: getWindowId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148911_c = McMappingDatabase.getSRG("SPacketWindowItems.func_148911_c");

	/**
	 * <p>
	 * Name: getItemStacks
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_148910_d = McMappingDatabase.getSRG("SPacketWindowItems.func_148910_d");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketWindowItems.func_148837_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketWindowItems.func_148833_a");

	/**
	 * <p>
	 * Name: itemStacks
	 * </p>
	 */
	public static McObfPair field_148913_b = McMappingDatabase.getSRG("field_148913_b");

	/**
	 * <p>
	 * Name: windowId
	 * </p>
	 */
	public static McObfPair field_148914_a = McMappingDatabase.getSRG("field_148914_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketWindowItems.func_148840_b");

}

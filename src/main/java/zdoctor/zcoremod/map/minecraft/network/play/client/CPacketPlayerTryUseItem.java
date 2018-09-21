package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketPlayerTryUseItem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mb";
		else
			return "net/minecraft/network/play/client/CPacketPlayerTryUseItem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mb";
		else
			return "CPacketPlayerTryUseItem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lmb;";
		else
			return "Lnet/minecraft/network/play/client/CPacketPlayerTryUseItem;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketPlayerTryUseItem.func_148833_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketPlayerTryUseItem.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketPlayerTryUseItem.func_148837_a");

	/**
	 * <p>
	 * Name: hand
	 * </p>
	 */
	public static McObfPair field_187029_a = McMappingDatabase.getSRG("field_187029_a");

	/**
	 * <p>
	 * Name: getHand
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumHand;]
	 * </p>
	 */
	public static McObfPair func_187028_a = McMappingDatabase.getSRG("CPacketPlayerTryUseItem.func_187028_a");

}

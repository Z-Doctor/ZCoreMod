package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketCreativeInventoryAction {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lw";
		else
			return "net/minecraft/network/play/client/CPacketCreativeInventoryAction";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lw";
		else
			return "CPacketCreativeInventoryAction";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llw;";
		else
			return "Lnet/minecraft/network/play/client/CPacketCreativeInventoryAction;";
	}

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketCreativeInventoryAction.func_148837_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketCreativeInventoryAction.func_148840_b");

	/**
	 * <p>
	 * Name: stack
	 * </p>
	 */
	public static McObfPair field_149628_b = McMappingDatabase.getSRG("field_149628_b");

	/**
	 * <p>
	 * Name: getStack
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_149625_d = McMappingDatabase.getSRG("CPacketCreativeInventoryAction.func_149625_d");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketCreativeInventoryAction.func_148833_a");

	/**
	 * <p>
	 * Name: getSlotId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149627_c = McMappingDatabase.getSRG("CPacketCreativeInventoryAction.func_149627_c");

	/**
	 * <p>
	 * Name: slotId
	 * </p>
	 */
	public static McObfPair field_149629_a = McMappingDatabase.getSRG("field_149629_a");

}

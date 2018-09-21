package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketEntityAction {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lq";
		else
			return "net/minecraft/network/play/client/CPacketEntityAction";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "lq";
		else
			return "CPacketEntityAction";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Llq;";
		else
			return "Lnet/minecraft/network/play/client/CPacketEntityAction;";
	}

	/**
	 * <p>
	 * Name: entityID
	 * </p>
	 */
	public static McObfPair field_149517_a = McMappingDatabase.getSRG("field_149517_a");

	/**
	 * <p>
	 * Name: getAuxData
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149512_e = McMappingDatabase.getSRG("CPacketEntityAction.func_149512_e");

	/**
	 * <p>
	 * Name: getAction
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/client/CPacketEntityAction$Action;]
	 * </p>
	 */
	public static McObfPair func_180764_b = McMappingDatabase.getSRG("CPacketEntityAction.func_180764_b");

	/**
	 * <p>
	 * Name: auxData
	 * </p>
	 */
	public static McObfPair field_149516_c = McMappingDatabase.getSRG("field_149516_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketEntityAction.func_148840_b");

	/**
	 * <p>
	 * Name: action
	 * </p>
	 */
	public static McObfPair field_149515_b = McMappingDatabase.getSRG("field_149515_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketEntityAction.func_148837_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketEntityAction.func_148833_a");

}

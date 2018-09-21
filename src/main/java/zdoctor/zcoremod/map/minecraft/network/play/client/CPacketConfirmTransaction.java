package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketConfirmTransaction {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ld";
		else
			return "net/minecraft/network/play/client/CPacketConfirmTransaction";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ld";
		else
			return "CPacketConfirmTransaction";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lld;";
		else
			return "Lnet/minecraft/network/play/client/CPacketConfirmTransaction;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketConfirmTransaction.func_148833_a");

	/**
	 * <p>
	 * Name: uid
	 * </p>
	 */
	public static McObfPair field_149534_b = McMappingDatabase.getSRG("field_149534_b");

	/**
	 * <p>
	 * Name: getUid
	 * </p>
	 * <p>
	 * Desc: [()S]
	 * </p>
	 */
	public static McObfPair func_149533_d = McMappingDatabase.getSRG("CPacketConfirmTransaction.func_149533_d");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketConfirmTransaction.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketConfirmTransaction.func_148837_a");

	/**
	 * <p>
	 * Name: getWindowId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149532_c = McMappingDatabase.getSRG("CPacketConfirmTransaction.func_149532_c");

	/**
	 * <p>
	 * Name: windowId
	 * </p>
	 */
	public static McObfPair field_149536_a = McMappingDatabase.getSRG("field_149536_a");

	/**
	 * <p>
	 * Name: accepted
	 * </p>
	 */
	public static McObfPair field_149535_c = McMappingDatabase.getSRG("field_149535_c");

}

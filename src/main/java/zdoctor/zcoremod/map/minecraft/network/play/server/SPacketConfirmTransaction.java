package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketConfirmTransaction {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ip";
		else
			return "net/minecraft/network/play/server/SPacketConfirmTransaction";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ip";
		else
			return "SPacketConfirmTransaction";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lip;";
		else
			return "Lnet/minecraft/network/play/server/SPacketConfirmTransaction;";
	}

	/**
	 * <p>
	 * Name: getActionNumber
	 * </p>
	 * <p>
	 * Desc: [()S]
	 * </p>
	 */
	public static McObfPair func_148890_d = McMappingDatabase.getSRG("SPacketConfirmTransaction.func_148890_d");

	/**
	 * <p>
	 * Name: windowId
	 * </p>
	 */
	public static McObfPair field_148894_a = McMappingDatabase.getSRG("field_148894_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketConfirmTransaction.func_148837_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketConfirmTransaction.func_148833_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketConfirmTransaction.func_148840_b");

	/**
	 * <p>
	 * Name: accepted
	 * </p>
	 */
	public static McObfPair field_148893_c = McMappingDatabase.getSRG("field_148893_c");

	/**
	 * <p>
	 * Name: getWindowId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148889_c = McMappingDatabase.getSRG("SPacketConfirmTransaction.func_148889_c");

	/**
	 * <p>
	 * Name: wasAccepted
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148888_e = McMappingDatabase.getSRG("SPacketConfirmTransaction.func_148888_e");

	/**
	 * <p>
	 * Name: actionNumber
	 * </p>
	 */
	public static McObfPair field_148892_b = McMappingDatabase.getSRG("field_148892_b");

}

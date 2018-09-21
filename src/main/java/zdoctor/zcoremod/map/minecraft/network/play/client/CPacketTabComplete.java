package zdoctor.zcoremod.map.minecraft.network.play.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CPacketTabComplete {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kz";
		else
			return "net/minecraft/network/play/client/CPacketTabComplete";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kz";
		else
			return "CPacketTabComplete";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkz;";
		else
			return "Lnet/minecraft/network/play/client/CPacketTabComplete;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayServer;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("CPacketTabComplete.func_148833_a");

	/**
	 * <p>
	 * Name: message
	 * </p>
	 */
	public static McObfPair field_149420_a = McMappingDatabase.getSRG("field_149420_a");

	/**
	 * <p>
	 * Name: hasTargetBlock
	 * </p>
	 */
	public static McObfPair field_186990_b = McMappingDatabase.getSRG("field_186990_b");

	/**
	 * <p>
	 * Name: getTargetBlock
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_179709_b = McMappingDatabase.getSRG("CPacketTabComplete.func_179709_b");

	/**
	 * <p>
	 * Name: hasTargetBlock
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186989_c = McMappingDatabase.getSRG("CPacketTabComplete.func_186989_c");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("CPacketTabComplete.func_148837_a");

	/**
	 * <p>
	 * Name: getMessage
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149419_c = McMappingDatabase.getSRG("CPacketTabComplete.func_149419_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("CPacketTabComplete.func_148840_b");

	/**
	 * <p>
	 * Name: targetBlock
	 * </p>
	 */
	public static McObfPair field_179710_b = McMappingDatabase.getSRG("field_179710_b");

}

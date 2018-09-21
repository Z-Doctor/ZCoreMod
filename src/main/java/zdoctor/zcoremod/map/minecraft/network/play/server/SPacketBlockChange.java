package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketBlockChange {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ij";
		else
			return "net/minecraft/network/play/server/SPacketBlockChange";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ij";
		else
			return "SPacketBlockChange";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lij;";
		else
			return "Lnet/minecraft/network/play/server/SPacketBlockChange;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketBlockChange.func_148833_a");

	/**
	 * <p>
	 * Name: blockState
	 * </p>
	 */
	public static McObfPair field_148883_d = McMappingDatabase.getSRG("field_148883_d");

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180728_a = McMappingDatabase.getSRG("SPacketBlockChange.func_180728_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketBlockChange.func_148840_b");

	/**
	 * <p>
	 * Name: blockPosition
	 * </p>
	 */
	public static McObfPair field_179828_a = McMappingDatabase.getSRG("field_179828_a");

	/**
	 * <p>
	 * Name: getBlockPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_179827_b = McMappingDatabase.getSRG("SPacketBlockChange.func_179827_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketBlockChange.func_148837_a");

}

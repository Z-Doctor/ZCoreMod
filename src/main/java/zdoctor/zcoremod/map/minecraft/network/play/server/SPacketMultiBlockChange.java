package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketMultiBlockChange {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "io";
		else
			return "net/minecraft/network/play/server/SPacketMultiBlockChange";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "io";
		else
			return "SPacketMultiBlockChange";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lio;";
		else
			return "Lnet/minecraft/network/play/server/SPacketMultiBlockChange;";
	}

	/**
	 * <p>
	 * Name: getChangedBlocks
	 * </p>
	 * <p>
	 * Desc: [()[Lnet/minecraft/network/play/server/SPacketMultiBlockChange$BlockUpdateData;]
	 * </p>
	 */
	public static McObfPair func_179844_a = McMappingDatabase.getSRG("SPacketMultiBlockChange.func_179844_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketMultiBlockChange.func_148833_a");

	/**
	 * <p>
	 * Name: changedBlocks
	 * </p>
	 */
	public static McObfPair field_179845_b = McMappingDatabase.getSRG("field_179845_b");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketMultiBlockChange.func_148840_b");

	/**
	 * <p>
	 * Name: chunkPos
	 * </p>
	 */
	public static McObfPair field_148925_b = McMappingDatabase.getSRG("field_148925_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketMultiBlockChange.func_148837_a");

}

package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketSpawnPosition {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kn";
		else
			return "net/minecraft/network/play/server/SPacketSpawnPosition";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kn";
		else
			return "SPacketSpawnPosition";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkn;";
		else
			return "Lnet/minecraft/network/play/server/SPacketSpawnPosition;";
	}

	/**
	 * <p>
	 * Name: getSpawnPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_179800_a = McMappingDatabase.getSRG("SPacketSpawnPosition.func_179800_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketSpawnPosition.func_148833_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketSpawnPosition.func_148837_a");

	/**
	 * <p>
	 * Name: spawnBlockPos
	 * </p>
	 */
	public static McObfPair field_179801_a = McMappingDatabase.getSRG("field_179801_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketSpawnPosition.func_148840_b");

}

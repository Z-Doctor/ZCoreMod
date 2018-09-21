package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketStatistics {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ie";
		else
			return "net/minecraft/network/play/server/SPacketStatistics";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ie";
		else
			return "SPacketStatistics";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lie;";
		else
			return "Lnet/minecraft/network/play/server/SPacketStatistics;";
	}

	/**
	 * <p>
	 * Name: getStatisticMap
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_148974_c = McMappingDatabase.getSRG("SPacketStatistics.func_148974_c");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketStatistics.func_148837_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketStatistics.func_148833_a");

	/**
	 * <p>
	 * Name: statisticMap
	 * </p>
	 */
	public static McObfPair field_148976_a = McMappingDatabase.getSRG("field_148976_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketStatistics.func_148840_b");

}

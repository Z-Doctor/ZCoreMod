package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketTimeUpdate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ko";
		else
			return "net/minecraft/network/play/server/SPacketTimeUpdate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ko";
		else
			return "SPacketTimeUpdate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lko;";
		else
			return "Lnet/minecraft/network/play/server/SPacketTimeUpdate;";
	}

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketTimeUpdate.func_148837_a");

	/**
	 * <p>
	 * Name: totalWorldTime
	 * </p>
	 */
	public static McObfPair field_149369_a = McMappingDatabase.getSRG("field_149369_a");

	/**
	 * <p>
	 * Name: getTotalWorldTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_149366_c = McMappingDatabase.getSRG("SPacketTimeUpdate.func_149366_c");

	/**
	 * <p>
	 * Name: getWorldTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_149365_d = McMappingDatabase.getSRG("SPacketTimeUpdate.func_149365_d");

	/**
	 * <p>
	 * Name: worldTime
	 * </p>
	 */
	public static McObfPair field_149368_b = McMappingDatabase.getSRG("field_149368_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketTimeUpdate.func_148833_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketTimeUpdate.func_148840_b");

}

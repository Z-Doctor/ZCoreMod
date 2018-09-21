package zdoctor.zcoremod.map.minecraft.network.status.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketServerInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ms";
		else
			return "net/minecraft/network/status/server/SPacketServerInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ms";
		else
			return "SPacketServerInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lms;";
		else
			return "Lnet/minecraft/network/status/server/SPacketServerInfo;";
	}

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/status/INetHandlerStatusClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketServerInfo.func_148833_a");

	/**
	 * <p>
	 * Name: GSON
	 * </p>
	 */
	public static McObfPair field_149297_a = McMappingDatabase.getSRG("field_149297_a");

	/**
	 * <p>
	 * Name: getResponse
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/ServerStatusResponse;]
	 * </p>
	 */
	public static McObfPair func_149294_c = McMappingDatabase.getSRG("SPacketServerInfo.func_149294_c");

	/**
	 * <p>
	 * Name: response
	 * </p>
	 */
	public static McObfPair field_149296_b = McMappingDatabase.getSRG("field_149296_b");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketServerInfo.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketServerInfo.func_148837_a");

}

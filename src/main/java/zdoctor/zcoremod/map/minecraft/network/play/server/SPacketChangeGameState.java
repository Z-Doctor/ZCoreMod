package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketChangeGameState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jc";
		else
			return "net/minecraft/network/play/server/SPacketChangeGameState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jc";
		else
			return "SPacketChangeGameState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljc;";
		else
			return "Lnet/minecraft/network/play/server/SPacketChangeGameState;";
	}

	/**
	 * <p>
	 * Name: MESSAGE_NAMES
	 * </p>
	 */
	public static McObfPair field_149142_a = McMappingDatabase.getSRG("field_149142_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketChangeGameState.func_148833_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketChangeGameState.func_148837_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketChangeGameState.func_148840_b");

	/**
	 * <p>
	 * Name: getValue
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_149137_d = McMappingDatabase.getSRG("SPacketChangeGameState.func_149137_d");

	/**
	 * <p>
	 * Name: value
	 * </p>
	 */
	public static McObfPair field_149141_c = McMappingDatabase.getSRG("field_149141_c");

	/**
	 * <p>
	 * Name: getGameState
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149138_c = McMappingDatabase.getSRG("SPacketChangeGameState.func_149138_c");

	/**
	 * <p>
	 * Name: state
	 * </p>
	 */
	public static McObfPair field_149140_b = McMappingDatabase.getSRG("field_149140_b");

}

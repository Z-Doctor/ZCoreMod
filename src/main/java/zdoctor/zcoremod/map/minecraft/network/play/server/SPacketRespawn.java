package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketRespawn {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jw";
		else
			return "net/minecraft/network/play/server/SPacketRespawn";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jw";
		else
			return "SPacketRespawn";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljw;";
		else
			return "Lnet/minecraft/network/play/server/SPacketRespawn;";
	}

	/**
	 * <p>
	 * Name: getGameType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_149083_e = McMappingDatabase.getSRG("SPacketRespawn.func_149083_e");

	/**
	 * <p>
	 * Name: worldType
	 * </p>
	 */
	public static McObfPair field_149085_d = McMappingDatabase.getSRG("field_149085_d");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketRespawn.func_148837_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketRespawn.func_148833_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketRespawn.func_148840_b");

	/**
	 * <p>
	 * Name: getWorldType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/WorldType;]
	 * </p>
	 */
	public static McObfPair func_149080_f = McMappingDatabase.getSRG("SPacketRespawn.func_149080_f");

	/**
	 * <p>
	 * Name: difficulty
	 * </p>
	 */
	public static McObfPair field_149086_b = McMappingDatabase.getSRG("field_149086_b");

	/**
	 * <p>
	 * Name: dimensionID
	 * </p>
	 */
	public static McObfPair field_149088_a = McMappingDatabase.getSRG("field_149088_a");

	/**
	 * <p>
	 * Name: getDimensionID
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149082_c = McMappingDatabase.getSRG("SPacketRespawn.func_149082_c");

	/**
	 * <p>
	 * Name: gameType
	 * </p>
	 */
	public static McObfPair field_149087_c = McMappingDatabase.getSRG("field_149087_c");

	/**
	 * <p>
	 * Name: getDifficulty
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/EnumDifficulty;]
	 * </p>
	 */
	public static McObfPair func_149081_d = McMappingDatabase.getSRG("SPacketRespawn.func_149081_d");

}

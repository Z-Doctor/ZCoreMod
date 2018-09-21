package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketJoinGame {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jh";
		else
			return "net/minecraft/network/play/server/SPacketJoinGame";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jh";
		else
			return "SPacketJoinGame";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljh;";
		else
			return "Lnet/minecraft/network/play/server/SPacketJoinGame;";
	}

	/**
	 * <p>
	 * Name: reducedDebugInfo
	 * </p>
	 */
	public static McObfPair field_179745_h = McMappingDatabase.getSRG("field_179745_h");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketJoinGame.func_148837_a");

	/**
	 * <p>
	 * Name: getDimension
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149194_f = McMappingDatabase.getSRG("SPacketJoinGame.func_149194_f");

	/**
	 * <p>
	 * Name: playerId
	 * </p>
	 */
	public static McObfPair field_149206_a = McMappingDatabase.getSRG("field_149206_a");

	/**
	 * <p>
	 * Name: getGameType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_149198_e = McMappingDatabase.getSRG("SPacketJoinGame.func_149198_e");

	/**
	 * <p>
	 * Name: dimension
	 * </p>
	 */
	public static McObfPair field_149202_d = McMappingDatabase.getSRG("field_149202_d");

	/**
	 * <p>
	 * Name: getPlayerId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149197_c = McMappingDatabase.getSRG("SPacketJoinGame.func_149197_c");

	/**
	 * <p>
	 * Name: difficulty
	 * </p>
	 */
	public static McObfPair field_149203_e = McMappingDatabase.getSRG("field_149203_e");

	/**
	 * <p>
	 * Name: getWorldType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/WorldType;]
	 * </p>
	 */
	public static McObfPair func_149196_i = McMappingDatabase.getSRG("SPacketJoinGame.func_149196_i");

	/**
	 * <p>
	 * Name: getDifficulty
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/EnumDifficulty;]
	 * </p>
	 */
	public static McObfPair func_149192_g = McMappingDatabase.getSRG("SPacketJoinGame.func_149192_g");

	/**
	 * <p>
	 * Name: worldType
	 * </p>
	 */
	public static McObfPair field_149201_g = McMappingDatabase.getSRG("field_149201_g");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketJoinGame.func_148840_b");

	/**
	 * <p>
	 * Name: getMaxPlayers
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149193_h = McMappingDatabase.getSRG("SPacketJoinGame.func_149193_h");

	/**
	 * <p>
	 * Name: gameType
	 * </p>
	 */
	public static McObfPair field_149205_c = McMappingDatabase.getSRG("field_149205_c");

	/**
	 * <p>
	 * Name: maxPlayers
	 * </p>
	 */
	public static McObfPair field_149200_f = McMappingDatabase.getSRG("field_149200_f");

	/**
	 * <p>
	 * Name: isHardcoreMode
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_149195_d = McMappingDatabase.getSRG("SPacketJoinGame.func_149195_d");

	/**
	 * <p>
	 * Name: hardcoreMode
	 * </p>
	 */
	public static McObfPair field_149204_b = McMappingDatabase.getSRG("field_149204_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketJoinGame.func_148833_a");

	/**
	 * <p>
	 * Name: isReducedDebugInfo
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_179744_h = McMappingDatabase.getSRG("SPacketJoinGame.func_179744_h");

}

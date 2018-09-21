package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketServerDifficulty {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "il";
		else
			return "net/minecraft/network/play/server/SPacketServerDifficulty";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "il";
		else
			return "SPacketServerDifficulty";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lil;";
		else
			return "Lnet/minecraft/network/play/server/SPacketServerDifficulty;";
	}

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketServerDifficulty.func_148840_b");

	/**
	 * <p>
	 * Name: isDifficultyLocked
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_179830_a = McMappingDatabase.getSRG("SPacketServerDifficulty.func_179830_a");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketServerDifficulty.func_148833_a");

	/**
	 * <p>
	 * Name: difficulty
	 * </p>
	 */
	public static McObfPair field_179833_a = McMappingDatabase.getSRG("field_179833_a");

	/**
	 * <p>
	 * Name: difficultyLocked
	 * </p>
	 */
	public static McObfPair field_179832_b = McMappingDatabase.getSRG("field_179832_b");

	/**
	 * <p>
	 * Name: getDifficulty
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/EnumDifficulty;]
	 * </p>
	 */
	public static McObfPair func_179831_b = McMappingDatabase.getSRG("SPacketServerDifficulty.func_179831_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketServerDifficulty.func_148837_a");

}

package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketUpdateScore {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "km";
		else
			return "net/minecraft/network/play/server/SPacketUpdateScore";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "km";
		else
			return "SPacketUpdateScore";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkm;";
		else
			return "Lnet/minecraft/network/play/server/SPacketUpdateScore;";
	}

	/**
	 * <p>
	 * Name: getObjectiveName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149321_d = McMappingDatabase.getSRG("SPacketUpdateScore.func_149321_d");

	/**
	 * <p>
	 * Name: objective
	 * </p>
	 */
	public static McObfPair field_149327_b = McMappingDatabase.getSRG("field_149327_b");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketUpdateScore.func_148833_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_149329_a = McMappingDatabase.getSRG("field_149329_a");

	/**
	 * <p>
	 * Name: action
	 * </p>
	 */
	public static McObfPair field_149326_d = McMappingDatabase.getSRG("field_149326_d");

	/**
	 * <p>
	 * Name: value
	 * </p>
	 */
	public static McObfPair field_149328_c = McMappingDatabase.getSRG("field_149328_c");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketUpdateScore.func_148837_a");

	/**
	 * <p>
	 * Name: getPlayerName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149324_c = McMappingDatabase.getSRG("SPacketUpdateScore.func_149324_c");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketUpdateScore.func_148840_b");

	/**
	 * <p>
	 * Name: getScoreAction
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/server/SPacketUpdateScore$Action;]
	 * </p>
	 */
	public static McObfPair func_180751_d = McMappingDatabase.getSRG("SPacketUpdateScore.func_180751_d");

	/**
	 * <p>
	 * Name: getScoreValue
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149323_e = McMappingDatabase.getSRG("SPacketUpdateScore.func_149323_e");

}

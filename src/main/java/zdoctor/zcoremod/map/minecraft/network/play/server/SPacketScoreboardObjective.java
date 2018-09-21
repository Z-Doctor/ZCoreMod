package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketScoreboardObjective {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kj";
		else
			return "net/minecraft/network/play/server/SPacketScoreboardObjective";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kj";
		else
			return "SPacketScoreboardObjective";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkj;";
		else
			return "Lnet/minecraft/network/play/server/SPacketScoreboardObjective;";
	}

	/**
	 * <p>
	 * Name: getObjectiveName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149339_c = McMappingDatabase.getSRG("SPacketScoreboardObjective.func_149339_c");

	/**
	 * <p>
	 * Name: getRenderType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/IScoreCriteria$EnumRenderType;]
	 * </p>
	 */
	public static McObfPair func_179817_d = McMappingDatabase.getSRG("SPacketScoreboardObjective.func_179817_d");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketScoreboardObjective.func_148840_b");

	/**
	 * <p>
	 * Name: getObjectiveValue
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149337_d = McMappingDatabase.getSRG("SPacketScoreboardObjective.func_149337_d");

	/**
	 * <p>
	 * Name: getAction
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_149338_e = McMappingDatabase.getSRG("SPacketScoreboardObjective.func_149338_e");

	/**
	 * <p>
	 * Name: objectiveValue
	 * </p>
	 */
	public static McObfPair field_149341_b = McMappingDatabase.getSRG("field_149341_b");

	/**
	 * <p>
	 * Name: objectiveName
	 * </p>
	 */
	public static McObfPair field_149343_a = McMappingDatabase.getSRG("field_149343_a");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketScoreboardObjective.func_148837_a");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_179818_c = McMappingDatabase.getSRG("field_179818_c");

	/**
	 * <p>
	 * Name: action
	 * </p>
	 */
	public static McObfPair field_149342_c = McMappingDatabase.getSRG("field_149342_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketScoreboardObjective.func_148833_a");

}

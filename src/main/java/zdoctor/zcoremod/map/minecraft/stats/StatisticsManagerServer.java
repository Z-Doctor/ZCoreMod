package zdoctor.zcoremod.map.minecraft.stats;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StatisticsManagerServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qn";
		else
			return "net/minecraft/stats/StatisticsManagerServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qn";
		else
			return "StatisticsManagerServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqn;";
		else
			return "Lnet/minecraft/stats/StatisticsManagerServer;";
	}

	/**
	 * <p>
	 * Name: unlockAchievement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/stats/StatBase;I)V]
	 * </p>
	 */
	public static McObfPair func_150873_a = McMappingDatabase.getSRG("StatisticsManagerServer.func_150873_a");

	/**
	 * <p>
	 * Name: sendStats
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_150876_a = McMappingDatabase.getSRG("StatisticsManagerServer.func_150876_a");

	/**
	 * <p>
	 * Name: dirty
	 * </p>
	 */
	public static McObfPair field_150888_e = McMappingDatabase.getSRG("field_150888_e");

	/**
	 * <p>
	 * Name: dumpJson
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150880_a = McMappingDatabase.getSRG("StatisticsManagerServer.func_150880_a");

	/**
	 * <p>
	 * Name: mcServer
	 * </p>
	 */
	public static McObfPair field_150890_c = McMappingDatabase.getSRG("field_150890_c");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_150889_b = McMappingDatabase.getSRG("field_150889_b");

	/**
	 * <p>
	 * Name: lastStatRequest
	 * </p>
	 */
	public static McObfPair field_150885_f = McMappingDatabase.getSRG("field_150885_f");

	/**
	 * <p>
	 * Name: statsFile
	 * </p>
	 */
	public static McObfPair field_150887_d = McMappingDatabase.getSRG("field_150887_d");

	/**
	 * <p>
	 * Name: saveStatFile
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_150883_b = McMappingDatabase.getSRG("StatisticsManagerServer.func_150883_b");

	/**
	 * <p>
	 * Name: readStatFile
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_150882_a = McMappingDatabase.getSRG("StatisticsManagerServer.func_150882_a");

	/**
	 * <p>
	 * Name: markAllDirty
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_150877_d = McMappingDatabase.getSRG("StatisticsManagerServer.func_150877_d");

	/**
	 * <p>
	 * Name: parseJson
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_150881_a = McMappingDatabase.getSRG("StatisticsManagerServer.func_150881_a");

	/**
	 * <p>
	 * Name: getDirty
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_150878_c = McMappingDatabase.getSRG("StatisticsManagerServer.func_150878_c");

}

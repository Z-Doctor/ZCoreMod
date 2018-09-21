package zdoctor.zcoremod.map.minecraft.stats;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StatisticsManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qt";
		else
			return "net/minecraft/stats/StatisticsManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qt";
		else
			return "StatisticsManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqt;";
		else
			return "Lnet/minecraft/stats/StatisticsManager;";
	}

	/**
	 * <p>
	 * Name: statsData
	 * </p>
	 */
	public static McObfPair field_150875_a = McMappingDatabase.getSRG("field_150875_a");

	/**
	 * <p>
	 * Name: increaseStat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/stats/StatBase;I)V]
	 * </p>
	 */
	public static McObfPair func_150871_b = McMappingDatabase.getSRG("StatisticsManager.func_150871_b");

	/**
	 * <p>
	 * Name: unlockAchievement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/stats/StatBase;I)V]
	 * </p>
	 */
	public static McObfPair func_150873_a = McMappingDatabase.getSRG("StatisticsManager.func_150873_a");

	/**
	 * <p>
	 * Name: readStat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/stats/StatBase;)I]
	 * </p>
	 */
	public static McObfPair func_77444_a = McMappingDatabase.getSRG("StatisticsManager.func_77444_a");

}

package zdoctor.zcoremod.map.minecraft.scoreboard;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerScoreboard {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nv";
		else
			return "net/minecraft/scoreboard/ServerScoreboard";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nv";
		else
			return "ServerScoreboard";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnv;";
		else
			return "Lnet/minecraft/scoreboard/ServerScoreboard;";
	}

	/**
	 * <p>
	 * Name: getCreatePackets
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScoreObjective;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_96550_d = McMappingDatabase.getSRG("ServerScoreboard.func_96550_d");

	/**
	 * <p>
	 * Name: broadcastTeamRemove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScorePlayerTeam;)V]
	 * </p>
	 */
	public static McObfPair func_96513_c = McMappingDatabase.getSRG("ServerScoreboard.func_96513_c");

	/**
	 * <p>
	 * Name: getDestroyPackets
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScoreObjective;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_96548_f = McMappingDatabase.getSRG("ServerScoreboard.func_96548_f");

	/**
	 * <p>
	 * Name: addObjective
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScoreObjective;)V]
	 * </p>
	 */
	public static McObfPair func_96549_e = McMappingDatabase.getSRG("ServerScoreboard.func_96549_e");

	/**
	 * <p>
	 * Name: broadcastTeamCreated
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScorePlayerTeam;)V]
	 * </p>
	 */
	public static McObfPair func_96523_a = McMappingDatabase.getSRG("ServerScoreboard.func_96523_a");

	/**
	 * <p>
	 * Name: setObjectiveInDisplaySlot
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/scoreboard/ScoreObjective;)V]
	 * </p>
	 */
	public static McObfPair func_96530_a = McMappingDatabase.getSRG("ServerScoreboard.func_96530_a");

	/**
	 * <p>
	 * Name: addedObjectives
	 * </p>
	 */
	public static McObfPair field_96553_b = McMappingDatabase.getSRG("field_96553_b");

	/**
	 * <p>
	 * Name: addPlayerToTeam
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_151392_a = McMappingDatabase.getSRG("ServerScoreboard.func_151392_a");

	/**
	 * <p>
	 * Name: broadcastScoreUpdate
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/scoreboard/ScoreObjective;)V]
	 * </p>
	 */
	public static McObfPair func_178820_a = McMappingDatabase.getSRG("ServerScoreboard.func_178820_a");

	/**
	 * <p>
	 * Name: broadcastScoreUpdate
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_96516_a = McMappingDatabase.getSRG("ServerScoreboard.func_96516_a");

	/**
	 * <p>
	 * Name: markSaveDataDirty
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_96551_b = McMappingDatabase.getSRG("ServerScoreboard.func_96551_b");

	/**
	 * <p>
	 * Name: onScoreObjectiveRemoved
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScoreObjective;)V]
	 * </p>
	 */
	public static McObfPair func_96533_c = McMappingDatabase.getSRG("ServerScoreboard.func_96533_c");

	/**
	 * <p>
	 * Name: addDirtyRunnable
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Runnable;)V]
	 * </p>
	 */
	public static McObfPair func_186684_a = McMappingDatabase.getSRG("ServerScoreboard.func_186684_a");

	/**
	 * <p>
	 * Name: broadcastTeamInfoUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScorePlayerTeam;)V]
	 * </p>
	 */
	public static McObfPair func_96538_b = McMappingDatabase.getSRG("ServerScoreboard.func_96538_b");

	/**
	 * <p>
	 * Name: sendDisplaySlotRemovalPackets
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScoreObjective;)V]
	 * </p>
	 */
	public static McObfPair func_96546_g = McMappingDatabase.getSRG("ServerScoreboard.func_96546_g");

	/**
	 * <p>
	 * Name: onScoreObjectiveAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScoreObjective;)V]
	 * </p>
	 */
	public static McObfPair func_96522_a = McMappingDatabase.getSRG("ServerScoreboard.func_96522_a");

	/**
	 * <p>
	 * Name: scoreboardMCServer
	 * </p>
	 */
	public static McObfPair field_96555_a = McMappingDatabase.getSRG("field_96555_a");

	/**
	 * <p>
	 * Name: getObjectiveDisplaySlotCount
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScoreObjective;)I]
	 * </p>
	 */
	public static McObfPair func_96552_h = McMappingDatabase.getSRG("ServerScoreboard.func_96552_h");

	/**
	 * <p>
	 * Name: dirtyRunnables
	 * </p>
	 */
	public static McObfPair field_186685_c = McMappingDatabase.getSRG("field_186685_c");

	/**
	 * <p>
	 * Name: removePlayerFromTeam
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/scoreboard/ScorePlayerTeam;)V]
	 * </p>
	 */
	public static McObfPair func_96512_b = McMappingDatabase.getSRG("ServerScoreboard.func_96512_b");

	/**
	 * <p>
	 * Name: onScoreUpdated
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/Score;)V]
	 * </p>
	 */
	public static McObfPair func_96536_a = McMappingDatabase.getSRG("ServerScoreboard.func_96536_a");

	/**
	 * <p>
	 * Name: onObjectiveDisplayNameChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScoreObjective;)V]
	 * </p>
	 */
	public static McObfPair func_96532_b = McMappingDatabase.getSRG("ServerScoreboard.func_96532_b");

}

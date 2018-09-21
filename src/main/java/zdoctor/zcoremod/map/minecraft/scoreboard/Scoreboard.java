package zdoctor.zcoremod.map.minecraft.scoreboard;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Scoreboard {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhk";
		else
			return "net/minecraft/scoreboard/Scoreboard";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhk";
		else
			return "Scoreboard";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhk;";
		else
			return "Lnet/minecraft/scoreboard/Scoreboard;";
	}

	/**
	 * <p>
	 * Name: onScoreObjectiveAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScoreObjective;)V]
	 * </p>
	 */
	public static McObfPair func_96522_a = McMappingDatabase.getSRG("Scoreboard.func_96522_a");

	/**
	 * <p>
	 * Name: getPlayersTeam
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/scoreboard/ScorePlayerTeam;]
	 * </p>
	 */
	public static McObfPair func_96509_i = McMappingDatabase.getSRG("Scoreboard.func_96509_i");

	/**
	 * <p>
	 * Name: removePlayerFromTeam
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/scoreboard/ScorePlayerTeam;)V]
	 * </p>
	 */
	public static McObfPair func_96512_b = McMappingDatabase.getSRG("Scoreboard.func_96512_b");

	/**
	 * <p>
	 * Name: removePlayerFromTeams
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_96524_g = McMappingDatabase.getSRG("Scoreboard.func_96524_g");

	/**
	 * <p>
	 * Name: displaySlots
	 * </p>
	 */
	public static McObfPair field_178823_g = McMappingDatabase.getSRG("field_178823_g");

	/**
	 * <p>
	 * Name: getObjectivesForEntity
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_96510_d = McMappingDatabase.getSRG("Scoreboard.func_96510_d");

	/**
	 * <p>
	 * Name: getDisplaySlotStrings
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_178821_h = McMappingDatabase.getSRG("Scoreboard.func_178821_h");

	/**
	 * <p>
	 * Name: addScoreObjective
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/scoreboard/IScoreCriteria;)Lnet/minecraft/scoreboard/ScoreObjective;]
	 * </p>
	 */
	public static McObfPair func_96535_a = McMappingDatabase.getSRG("Scoreboard.func_96535_a");

	/**
	 * <p>
	 * Name: onScoreObjectiveRemoved
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScoreObjective;)V]
	 * </p>
	 */
	public static McObfPair func_96533_c = McMappingDatabase.getSRG("Scoreboard.func_96533_c");

	/**
	 * <p>
	 * Name: addPlayerToTeam
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_151392_a = McMappingDatabase.getSRG("Scoreboard.func_151392_a");

	/**
	 * <p>
	 * Name: broadcastTeamRemove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScorePlayerTeam;)V]
	 * </p>
	 */
	public static McObfPair func_96513_c = McMappingDatabase.getSRG("Scoreboard.func_96513_c");

	/**
	 * <p>
	 * Name: getObjectiveInDisplaySlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/scoreboard/ScoreObjective;]
	 * </p>
	 */
	public static McObfPair func_96539_a = McMappingDatabase.getSRG("Scoreboard.func_96539_a");

	/**
	 * <p>
	 * Name: onScoreUpdated
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/Score;)V]
	 * </p>
	 */
	public static McObfPair func_96536_a = McMappingDatabase.getSRG("Scoreboard.func_96536_a");

	/**
	 * <p>
	 * Name: setObjectiveInDisplaySlot
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/scoreboard/ScoreObjective;)V]
	 * </p>
	 */
	public static McObfPair func_96530_a = McMappingDatabase.getSRG("Scoreboard.func_96530_a");

	/**
	 * <p>
	 * Name: scoreObjectiveCriterias
	 * </p>
	 */
	public static McObfPair field_96543_b = McMappingDatabase.getSRG("field_96543_b");

	/**
	 * <p>
	 * Name: getObjectiveDisplaySlotNumber
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_96537_j = McMappingDatabase.getSRG("Scoreboard.func_96537_j");

	/**
	 * <p>
	 * Name: teams
	 * </p>
	 */
	public static McObfPair field_96542_e = McMappingDatabase.getSRG("field_96542_e");

	/**
	 * <p>
	 * Name: getObjectiveDisplaySlot
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_96517_b = McMappingDatabase.getSRG("Scoreboard.func_96517_b");

	/**
	 * <p>
	 * Name: objectiveDisplaySlots
	 * </p>
	 */
	public static McObfPair field_96541_d = McMappingDatabase.getSRG("field_96541_d");

	/**
	 * <p>
	 * Name: entityHasObjective
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/scoreboard/ScoreObjective;)Z]
	 * </p>
	 */
	public static McObfPair func_178819_b = McMappingDatabase.getSRG("Scoreboard.func_178819_b");

	/**
	 * <p>
	 * Name: getObjectiveNames
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_96526_d = McMappingDatabase.getSRG("Scoreboard.func_96526_d");

	/**
	 * <p>
	 * Name: broadcastScoreUpdate
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/scoreboard/ScoreObjective;)V]
	 * </p>
	 */
	public static McObfPair func_178820_a = McMappingDatabase.getSRG("Scoreboard.func_178820_a");

	/**
	 * <p>
	 * Name: getScoreObjectives
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_96514_c = McMappingDatabase.getSRG("Scoreboard.func_96514_c");

	/**
	 * <p>
	 * Name: entitiesScoreObjectives
	 * </p>
	 */
	public static McObfPair field_96544_c = McMappingDatabase.getSRG("field_96544_c");

	/**
	 * <p>
	 * Name: onObjectiveDisplayNameChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScoreObjective;)V]
	 * </p>
	 */
	public static McObfPair func_96532_b = McMappingDatabase.getSRG("Scoreboard.func_96532_b");

	/**
	 * <p>
	 * Name: getSortedScores
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScoreObjective;)Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_96534_i = McMappingDatabase.getSRG("Scoreboard.func_96534_i");

	/**
	 * <p>
	 * Name: createTeam
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/scoreboard/ScorePlayerTeam;]
	 * </p>
	 */
	public static McObfPair func_96527_f = McMappingDatabase.getSRG("Scoreboard.func_96527_f");

	/**
	 * <p>
	 * Name: getObjectivesFromCriteria
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/IScoreCriteria;)Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_96520_a = McMappingDatabase.getSRG("Scoreboard.func_96520_a");

	/**
	 * <p>
	 * Name: getTeam
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/scoreboard/ScorePlayerTeam;]
	 * </p>
	 */
	public static McObfPair func_96508_e = McMappingDatabase.getSRG("Scoreboard.func_96508_e");

	/**
	 * <p>
	 * Name: getObjective
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/scoreboard/ScoreObjective;]
	 * </p>
	 */
	public static McObfPair func_96518_b = McMappingDatabase.getSRG("Scoreboard.func_96518_b");

	/**
	 * <p>
	 * Name: scoreObjectives
	 * </p>
	 */
	public static McObfPair field_96545_a = McMappingDatabase.getSRG("field_96545_a");

	/**
	 * <p>
	 * Name: broadcastTeamCreated
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScorePlayerTeam;)V]
	 * </p>
	 */
	public static McObfPair func_96523_a = McMappingDatabase.getSRG("Scoreboard.func_96523_a");

	/**
	 * <p>
	 * Name: removeTeam
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScorePlayerTeam;)V]
	 * </p>
	 */
	public static McObfPair func_96511_d = McMappingDatabase.getSRG("Scoreboard.func_96511_d");

	/**
	 * <p>
	 * Name: getScores
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_96528_e = McMappingDatabase.getSRG("Scoreboard.func_96528_e");

	/**
	 * <p>
	 * Name: getOrCreateScore
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/scoreboard/ScoreObjective;)Lnet/minecraft/scoreboard/Score;]
	 * </p>
	 */
	public static McObfPair func_96529_a = McMappingDatabase.getSRG("Scoreboard.func_96529_a");

	/**
	 * <p>
	 * Name: getTeams
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_96525_g = McMappingDatabase.getSRG("Scoreboard.func_96525_g");

	/**
	 * <p>
	 * Name: removeEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_181140_a = McMappingDatabase.getSRG("Scoreboard.func_181140_a");

	/**
	 * <p>
	 * Name: broadcastScoreUpdate
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_96516_a = McMappingDatabase.getSRG("Scoreboard.func_96516_a");

	/**
	 * <p>
	 * Name: teamMemberships
	 * </p>
	 */
	public static McObfPair field_96540_f = McMappingDatabase.getSRG("field_96540_f");

	/**
	 * <p>
	 * Name: removeObjective
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScoreObjective;)V]
	 * </p>
	 */
	public static McObfPair func_96519_k = McMappingDatabase.getSRG("Scoreboard.func_96519_k");

	/**
	 * <p>
	 * Name: broadcastTeamInfoUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScorePlayerTeam;)V]
	 * </p>
	 */
	public static McObfPair func_96538_b = McMappingDatabase.getSRG("Scoreboard.func_96538_b");

	/**
	 * <p>
	 * Name: removeObjectiveFromEntity
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/scoreboard/ScoreObjective;)V]
	 * </p>
	 */
	public static McObfPair func_178822_d = McMappingDatabase.getSRG("Scoreboard.func_178822_d");

	/**
	 * <p>
	 * Name: getTeamNames
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_96531_f = McMappingDatabase.getSRG("Scoreboard.func_96531_f");

}

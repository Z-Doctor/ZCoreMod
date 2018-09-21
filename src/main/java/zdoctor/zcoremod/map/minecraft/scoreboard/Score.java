package zdoctor.zcoremod.map.minecraft.scoreboard;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Score {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhi";
		else
			return "net/minecraft/scoreboard/Score";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhi";
		else
			return "Score";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhi;";
		else
			return "Lnet/minecraft/scoreboard/Score;";
	}

	/**
	 * <p>
	 * Name: getScoreScoreboard
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/Scoreboard;]
	 * </p>
	 */
	public static McObfPair func_96650_f = McMappingDatabase.getSRG("Score.func_96650_f");

	/**
	 * <p>
	 * Name: getPlayerName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_96653_e = McMappingDatabase.getSRG("Score.func_96653_e");

	/**
	 * <p>
	 * Name: locked
	 * </p>
	 */
	public static McObfPair field_178817_f = McMappingDatabase.getSRG("field_178817_f");

	/**
	 * <p>
	 * Name: scorePlayerName
	 * </p>
	 */
	public static McObfPair field_96654_d = McMappingDatabase.getSRG("field_96654_d");

	/**
	 * <p>
	 * Name: setLocked
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_178815_a = McMappingDatabase.getSRG("Score.func_178815_a");

	/**
	 * <p>
	 * Name: getScorePoints
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_96652_c = McMappingDatabase.getSRG("Score.func_96652_c");

	/**
	 * <p>
	 * Name: isLocked
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178816_g = McMappingDatabase.getSRG("Score.func_178816_g");

	/**
	 * <p>
	 * Name: getObjective
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/ScoreObjective;]
	 * </p>
	 */
	public static McObfPair func_96645_d = McMappingDatabase.getSRG("Score.func_96645_d");

	/**
	 * <p>
	 * Name: increaseScore
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_96649_a = McMappingDatabase.getSRG("Score.func_96649_a");

	/**
	 * <p>
	 * Name: scoreboard
	 * </p>
	 */
	public static McObfPair field_96656_b = McMappingDatabase.getSRG("field_96656_b");

	/**
	 * <p>
	 * Name: incrementScore
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_96648_a = McMappingDatabase.getSRG("Score.func_96648_a");

	/**
	 * <p>
	 * Name: forceUpdate
	 * </p>
	 */
	public static McObfPair field_178818_g = McMappingDatabase.getSRG("field_178818_g");

	/**
	 * <p>
	 * Name: scorePoints
	 * </p>
	 */
	public static McObfPair field_96655_e = McMappingDatabase.getSRG("field_96655_e");

	/**
	 * <p>
	 * Name: SCORE_COMPARATOR
	 * </p>
	 */
	public static McObfPair field_96658_a = McMappingDatabase.getSRG("field_96658_a");

	/**
	 * <p>
	 * Name: setScorePoints
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_96647_c = McMappingDatabase.getSRG("Score.func_96647_c");

	/**
	 * <p>
	 * Name: decreaseScore
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_96646_b = McMappingDatabase.getSRG("Score.func_96646_b");

	/**
	 * <p>
	 * Name: objective
	 * </p>
	 */
	public static McObfPair field_96657_c = McMappingDatabase.getSRG("field_96657_c");

}

package zdoctor.zcoremod.map.minecraft.scoreboard;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ScoreObjective {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhg";
		else
			return "net/minecraft/scoreboard/ScoreObjective";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhg";
		else
			return "ScoreObjective";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhg;";
		else
			return "Lnet/minecraft/scoreboard/ScoreObjective;";
	}

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_96679_b = McMappingDatabase.getSRG("ScoreObjective.func_96679_b");

	/**
	 * <p>
	 * Name: objectiveCriteria
	 * </p>
	 */
	public static McObfPair field_96685_c = McMappingDatabase.getSRG("field_96685_c");

	/**
	 * <p>
	 * Name: getRenderType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/IScoreCriteria$EnumRenderType;]
	 * </p>
	 */
	public static McObfPair func_178766_e = McMappingDatabase.getSRG("ScoreObjective.func_178766_e");

	/**
	 * <p>
	 * Name: displayName
	 * </p>
	 */
	public static McObfPair field_96683_d = McMappingDatabase.getSRG("field_96683_d");

	/**
	 * <p>
	 * Name: getCriteria
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/IScoreCriteria;]
	 * </p>
	 */
	public static McObfPair func_96680_c = McMappingDatabase.getSRG("ScoreObjective.func_96680_c");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_96678_d = McMappingDatabase.getSRG("ScoreObjective.func_96678_d");

	/**
	 * <p>
	 * Name: setRenderType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/IScoreCriteria$EnumRenderType;)V]
	 * </p>
	 */
	public static McObfPair func_178767_a = McMappingDatabase.getSRG("ScoreObjective.func_178767_a");

	/**
	 * <p>
	 * Name: setDisplayName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_96681_a = McMappingDatabase.getSRG("ScoreObjective.func_96681_a");

	/**
	 * <p>
	 * Name: getScoreboard
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/Scoreboard;]
	 * </p>
	 */
	public static McObfPair func_96682_a = McMappingDatabase.getSRG("ScoreObjective.func_96682_a");

	/**
	 * <p>
	 * Name: scoreboard
	 * </p>
	 */
	public static McObfPair field_96686_a = McMappingDatabase.getSRG("field_96686_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_96684_b = McMappingDatabase.getSRG("field_96684_b");

	/**
	 * <p>
	 * Name: renderType
	 * </p>
	 */
	public static McObfPair field_178768_d = McMappingDatabase.getSRG("field_178768_d");

}

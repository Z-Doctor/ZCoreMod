package zdoctor.zcoremod.map.minecraft.scoreboard;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ScoreCriteriaColored {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhn";
		else
			return "net/minecraft/scoreboard/ScoreCriteriaColored";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhn";
		else
			return "ScoreCriteriaColored";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhn;";
		else
			return "Lnet/minecraft/scoreboard/ScoreCriteriaColored;";
	}

	/**
	 * <p>
	 * Name: getRenderType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/IScoreCriteria$EnumRenderType;]
	 * </p>
	 */
	public static McObfPair func_178790_c = McMappingDatabase.getSRG("ScoreCriteriaColored.func_178790_c");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_96636_a = McMappingDatabase.getSRG("ScoreCriteriaColored.func_96636_a");

	/**
	 * <p>
	 * Name: isReadOnly
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_96637_b = McMappingDatabase.getSRG("ScoreCriteriaColored.func_96637_b");

	/**
	 * <p>
	 * Name: goalName
	 * </p>
	 */
	public static McObfPair field_178794_j = McMappingDatabase.getSRG("field_178794_j");

}

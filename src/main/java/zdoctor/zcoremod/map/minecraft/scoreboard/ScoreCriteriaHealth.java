package zdoctor.zcoremod.map.minecraft.scoreboard;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ScoreCriteriaHealth {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhp";
		else
			return "net/minecraft/scoreboard/ScoreCriteriaHealth";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhp";
		else
			return "ScoreCriteriaHealth";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhp;";
		else
			return "Lnet/minecraft/scoreboard/ScoreCriteriaHealth;";
	}

	/**
	 * <p>
	 * Name: getRenderType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/IScoreCriteria$EnumRenderType;]
	 * </p>
	 */
	public static McObfPair func_178790_c = McMappingDatabase.getSRG("ScoreCriteriaHealth.func_178790_c");

	/**
	 * <p>
	 * Name: isReadOnly
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_96637_b = McMappingDatabase.getSRG("ScoreCriteriaHealth.func_96637_b");

}

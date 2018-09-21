package zdoctor.zcoremod.map.minecraft.scoreboard;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ScoreCriteriaReadOnly {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhr";
		else
			return "net/minecraft/scoreboard/ScoreCriteriaReadOnly";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhr";
		else
			return "ScoreCriteriaReadOnly";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhr;";
		else
			return "Lnet/minecraft/scoreboard/ScoreCriteriaReadOnly;";
	}

	/**
	 * <p>
	 * Name: isReadOnly
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_96637_b = McMappingDatabase.getSRG("ScoreCriteriaReadOnly.func_96637_b");

}

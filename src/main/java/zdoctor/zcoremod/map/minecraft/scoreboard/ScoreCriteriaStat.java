package zdoctor.zcoremod.map.minecraft.scoreboard;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ScoreCriteriaStat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhs";
		else
			return "net/minecraft/scoreboard/ScoreCriteriaStat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhs";
		else
			return "ScoreCriteriaStat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhs;";
		else
			return "Lnet/minecraft/scoreboard/ScoreCriteriaStat;";
	}

	/**
	 * <p>
	 * Name: stat
	 * </p>
	 */
	public static McObfPair field_151459_g = McMappingDatabase.getSRG("field_151459_g");

}

package zdoctor.zcoremod.map.minecraft.scoreboard;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ScoreCriteria {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bho";
		else
			return "net/minecraft/scoreboard/ScoreCriteria";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bho";
		else
			return "ScoreCriteria";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbho;";
		else
			return "Lnet/minecraft/scoreboard/ScoreCriteria;";
	}

	/**
	 * <p>
	 * Name: dummyName
	 * </p>
	 */
	public static McObfPair field_96644_g = McMappingDatabase.getSRG("field_96644_g");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_96636_a = McMappingDatabase.getSRG("ScoreCriteria.func_96636_a");

	/**
	 * <p>
	 * Name: getRenderType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/IScoreCriteria$EnumRenderType;]
	 * </p>
	 */
	public static McObfPair func_178790_c = McMappingDatabase.getSRG("ScoreCriteria.func_178790_c");

	/**
	 * <p>
	 * Name: isReadOnly
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_96637_b = McMappingDatabase.getSRG("ScoreCriteria.func_96637_b");

}

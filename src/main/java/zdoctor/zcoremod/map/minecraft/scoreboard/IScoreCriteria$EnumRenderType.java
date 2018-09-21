package zdoctor.zcoremod.map.minecraft.scoreboard;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IScoreCriteria$EnumRenderType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhq$a";
		else
			return "net/minecraft/scoreboard/IScoreCriteria$EnumRenderType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhq$a";
		else
			return "IScoreCriteria$EnumRenderType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhq$a;";
		else
			return "Lnet/minecraft/scoreboard/IScoreCriteria$EnumRenderType;";
	}

	/**
	 * <p>
	 * Name: getByName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/scoreboard/IScoreCriteria$EnumRenderType;]
	 * </p>
	 */
	public static McObfPair func_178795_a = McMappingDatabase.getSRG("IScoreCriteria$EnumRenderType.func_178795_a");

	/**
	 * <p>
	 * Name: getRenderType
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_178796_a = McMappingDatabase.getSRG("IScoreCriteria$EnumRenderType.func_178796_a");

	/**
	 * <p>
	 * Name: renderType
	 * </p>
	 */
	public static McObfPair field_178798_d = McMappingDatabase.getSRG("field_178798_d");

	/**
	 * <p>
	 * Name: BY_NAME
	 * </p>
	 */
	public static McObfPair field_178801_c = McMappingDatabase.getSRG("field_178801_c");

}

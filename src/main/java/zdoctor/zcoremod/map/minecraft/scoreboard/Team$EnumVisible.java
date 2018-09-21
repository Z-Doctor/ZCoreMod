package zdoctor.zcoremod.map.minecraft.scoreboard;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Team$EnumVisible {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhm$b";
		else
			return "net/minecraft/scoreboard/Team$EnumVisible";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhm$b";
		else
			return "Team$EnumVisible";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhm$b;";
		else
			return "Lnet/minecraft/scoreboard/Team$EnumVisible;";
	}

	/**
	 * <p>
	 * Name: nameMap
	 * </p>
	 */
	public static McObfPair field_186697_g = McMappingDatabase.getSRG("field_186697_g");

	/**
	 * <p>
	 * Name: internalName
	 * </p>
	 */
	public static McObfPair field_178830_e = McMappingDatabase.getSRG("field_178830_e");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_178827_f = McMappingDatabase.getSRG("field_178827_f");

	/**
	 * <p>
	 * Name: getByName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/scoreboard/Team$EnumVisible;]
	 * </p>
	 */
	public static McObfPair func_178824_a = McMappingDatabase.getSRG("Team$EnumVisible.func_178824_a");

	/**
	 * <p>
	 * Name: getNames
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_178825_a = McMappingDatabase.getSRG("Team$EnumVisible.func_178825_a");

}

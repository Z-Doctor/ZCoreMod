package zdoctor.zcoremod.map.minecraft.scoreboard;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Team$CollisionRule {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhm$a";
		else
			return "net/minecraft/scoreboard/Team$CollisionRule";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhm$a";
		else
			return "Team$CollisionRule";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhm$a;";
		else
			return "Lnet/minecraft/scoreboard/Team$CollisionRule;";
	}

	/**
	 * <p>
	 * Name: nameMap
	 * </p>
	 */
	public static McObfPair field_186695_g = McMappingDatabase.getSRG("field_186695_g");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_186693_e = McMappingDatabase.getSRG("field_186693_e");

	/**
	 * <p>
	 * Name: getByName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/scoreboard/Team$CollisionRule;]
	 * </p>
	 */
	public static McObfPair func_186686_a = McMappingDatabase.getSRG("Team$CollisionRule.func_186686_a");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_186694_f = McMappingDatabase.getSRG("field_186694_f");

	/**
	 * <p>
	 * Name: getNames
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_186687_a = McMappingDatabase.getSRG("Team$CollisionRule.func_186687_a");

}

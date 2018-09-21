package zdoctor.zcoremod.map.minecraft.scoreboard;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Team {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhm";
		else
			return "net/minecraft/scoreboard/Team";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhm";
		else
			return "Team";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhm;";
		else
			return "Lnet/minecraft/scoreboard/Team;";
	}

	/**
	 * <p>
	 * Name: formatString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_142053_d = McMappingDatabase.getSRG("Team.func_142053_d");

	/**
	 * <p>
	 * Name: getMembershipCollection
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_96670_d = McMappingDatabase.getSRG("Team.func_96670_d");

	/**
	 * <p>
	 * Name: getNameTagVisibility
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/Team$EnumVisible;]
	 * </p>
	 */
	public static McObfPair func_178770_i = McMappingDatabase.getSRG("Team.func_178770_i");

	/**
	 * <p>
	 * Name: isSameTeam
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/Team;)Z]
	 * </p>
	 */
	public static McObfPair func_142054_a = McMappingDatabase.getSRG("Team.func_142054_a");

	/**
	 * <p>
	 * Name: getAllowFriendlyFire
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_96665_g = McMappingDatabase.getSRG("Team.func_96665_g");

	/**
	 * <p>
	 * Name: getDeathMessageVisibility
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/Team$EnumVisible;]
	 * </p>
	 */
	public static McObfPair func_178771_j = McMappingDatabase.getSRG("Team.func_178771_j");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/TextFormatting;]
	 * </p>
	 */
	public static McObfPair func_178775_l = McMappingDatabase.getSRG("Team.func_178775_l");

	/**
	 * <p>
	 * Name: getCollisionRule
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/Team$CollisionRule;]
	 * </p>
	 */
	public static McObfPair func_186681_k = McMappingDatabase.getSRG("Team.func_186681_k");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_96661_b = McMappingDatabase.getSRG("Team.func_96661_b");

	/**
	 * <p>
	 * Name: getSeeFriendlyInvisiblesEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_98297_h = McMappingDatabase.getSRG("Team.func_98297_h");

}

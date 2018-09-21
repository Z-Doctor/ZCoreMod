package zdoctor.zcoremod.map.minecraft.scoreboard;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ScorePlayerTeam {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhh";
		else
			return "net/minecraft/scoreboard/ScorePlayerTeam";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhh";
		else
			return "ScorePlayerTeam";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhh;";
		else
			return "Lnet/minecraft/scoreboard/ScorePlayerTeam;";
	}

	/**
	 * <p>
	 * Name: setDisplayName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_96664_a = McMappingDatabase.getSRG("ScorePlayerTeam.func_96664_a");

	/**
	 * <p>
	 * Name: getSuffix
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_96663_f = McMappingDatabase.getSRG("ScorePlayerTeam.func_96663_f");

	/**
	 * <p>
	 * Name: getSeeFriendlyInvisiblesEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_98297_h = McMappingDatabase.getSRG("ScorePlayerTeam.func_98297_h");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_96675_b = McMappingDatabase.getSRG("field_96675_b");

	/**
	 * <p>
	 * Name: membershipSet
	 * </p>
	 */
	public static McObfPair field_96676_c = McMappingDatabase.getSRG("field_96676_c");

	/**
	 * <p>
	 * Name: scoreboard
	 * </p>
	 */
	public static McObfPair field_96677_a = McMappingDatabase.getSRG("field_96677_a");

	/**
	 * <p>
	 * Name: setCollisionRule
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/Team$CollisionRule;)V]
	 * </p>
	 */
	public static McObfPair func_186682_a = McMappingDatabase.getSRG("ScorePlayerTeam.func_186682_a");

	/**
	 * <p>
	 * Name: setSuffix
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_96662_c = McMappingDatabase.getSRG("ScorePlayerTeam.func_96662_c");

	/**
	 * <p>
	 * Name: getCollisionRule
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/Team$CollisionRule;]
	 * </p>
	 */
	public static McObfPair func_186681_k = McMappingDatabase.getSRG("ScorePlayerTeam.func_186681_k");

	/**
	 * <p>
	 * Name: canSeeFriendlyInvisibles
	 * </p>
	 */
	public static McObfPair field_98301_h = McMappingDatabase.getSRG("field_98301_h");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_96669_c = McMappingDatabase.getSRG("ScorePlayerTeam.func_96669_c");

	/**
	 * <p>
	 * Name: formatPlayerName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/Team;Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_96667_a = McMappingDatabase.getSRG("ScorePlayerTeam.func_96667_a");

	/**
	 * <p>
	 * Name: collisionRule
	 * </p>
	 */
	public static McObfPair field_186683_l = McMappingDatabase.getSRG("field_186683_l");

	/**
	 * <p>
	 * Name: nameTagVisibility
	 * </p>
	 */
	public static McObfPair field_178778_i = McMappingDatabase.getSRG("field_178778_i");

	/**
	 * <p>
	 * Name: setFriendlyFlags
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_98298_a = McMappingDatabase.getSRG("ScorePlayerTeam.func_98298_a");

	/**
	 * <p>
	 * Name: setColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/TextFormatting;)V]
	 * </p>
	 */
	public static McObfPair func_178774_a = McMappingDatabase.getSRG("ScorePlayerTeam.func_178774_a");

	/**
	 * <p>
	 * Name: setSeeFriendlyInvisiblesEnabled
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_98300_b = McMappingDatabase.getSRG("ScorePlayerTeam.func_98300_b");

	/**
	 * <p>
	 * Name: getNameTagVisibility
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/Team$EnumVisible;]
	 * </p>
	 */
	public static McObfPair func_178770_i = McMappingDatabase.getSRG("ScorePlayerTeam.func_178770_i");

	/**
	 * <p>
	 * Name: formatString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_142053_d = McMappingDatabase.getSRG("ScorePlayerTeam.func_142053_d");

	/**
	 * <p>
	 * Name: color
	 * </p>
	 */
	public static McObfPair field_178777_k = McMappingDatabase.getSRG("field_178777_k");

	/**
	 * <p>
	 * Name: getMembershipCollection
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_96670_d = McMappingDatabase.getSRG("ScorePlayerTeam.func_96670_d");

	/**
	 * <p>
	 * Name: displayName
	 * </p>
	 */
	public static McObfPair field_96673_d = McMappingDatabase.getSRG("field_96673_d");

	/**
	 * <p>
	 * Name: getDeathMessageVisibility
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/Team$EnumVisible;]
	 * </p>
	 */
	public static McObfPair func_178771_j = McMappingDatabase.getSRG("ScorePlayerTeam.func_178771_j");

	/**
	 * <p>
	 * Name: getAllowFriendlyFire
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_96665_g = McMappingDatabase.getSRG("ScorePlayerTeam.func_96665_g");

	/**
	 * <p>
	 * Name: setNameTagVisibility
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/Team$EnumVisible;)V]
	 * </p>
	 */
	public static McObfPair func_178772_a = McMappingDatabase.getSRG("ScorePlayerTeam.func_178772_a");

	/**
	 * <p>
	 * Name: prefix
	 * </p>
	 */
	public static McObfPair field_96674_e = McMappingDatabase.getSRG("field_96674_e");

	/**
	 * <p>
	 * Name: deathMessageVisibility
	 * </p>
	 */
	public static McObfPair field_178776_j = McMappingDatabase.getSRG("field_178776_j");

	/**
	 * <p>
	 * Name: setPrefix
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_96666_b = McMappingDatabase.getSRG("ScorePlayerTeam.func_96666_b");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_96661_b = McMappingDatabase.getSRG("ScorePlayerTeam.func_96661_b");

	/**
	 * <p>
	 * Name: setAllowFriendlyFire
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_96660_a = McMappingDatabase.getSRG("ScorePlayerTeam.func_96660_a");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/TextFormatting;]
	 * </p>
	 */
	public static McObfPair func_178775_l = McMappingDatabase.getSRG("ScorePlayerTeam.func_178775_l");

	/**
	 * <p>
	 * Name: getPrefix
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_96668_e = McMappingDatabase.getSRG("ScorePlayerTeam.func_96668_e");

	/**
	 * <p>
	 * Name: allowFriendlyFire
	 * </p>
	 */
	public static McObfPair field_96672_g = McMappingDatabase.getSRG("field_96672_g");

	/**
	 * <p>
	 * Name: suffix
	 * </p>
	 */
	public static McObfPair field_96671_f = McMappingDatabase.getSRG("field_96671_f");

	/**
	 * <p>
	 * Name: getFriendlyFlags
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_98299_i = McMappingDatabase.getSRG("ScorePlayerTeam.func_98299_i");

	/**
	 * <p>
	 * Name: setDeathMessageVisibility
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/Team$EnumVisible;)V]
	 * </p>
	 */
	public static McObfPair func_178773_b = McMappingDatabase.getSRG("ScorePlayerTeam.func_178773_b");

}

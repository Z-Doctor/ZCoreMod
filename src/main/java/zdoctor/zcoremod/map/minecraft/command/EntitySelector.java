package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySelector {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bq";
		else
			return "net/minecraft/command/EntitySelector";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bq";
		else
			return "EntitySelector";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbq;";
		else
			return "Lnet/minecraft/command/EntitySelector;";
	}

	/**
	 * <p>
	 * Name: matchOneEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Ljava/lang/String;Ljava/lang/Class;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_179652_a = McMappingDatabase.getSRG("EntitySelector.func_179652_a");

	/**
	 * <p>
	 * Name: getPlayers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Ljava/lang/String;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_193531_b = McMappingDatabase.getSRG("EntitySelector.func_193531_b");

	/**
	 * <p>
	 * Name: ARGUMENT_COORDINATE_Y
	 * </p>
	 */
	public static McObfPair field_190836_j = McMappingDatabase.getSRG("field_190836_j");

	/**
	 * <p>
	 * Name: VALID_ARGUMENTS
	 * </p>
	 */
	public static McObfPair field_190830_d = McMappingDatabase.getSRG("field_190830_d");

	/**
	 * <p>
	 * Name: ARGUMENT_COORDINATE_X
	 * </p>
	 */
	public static McObfPair field_190835_i = McMappingDatabase.getSRG("field_190835_i");

	/**
	 * <p>
	 * Name: matchEntitiesToTextComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Ljava/lang/String;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_150869_b = McMappingDatabase.getSRG("EntitySelector.func_150869_b");

	/**
	 * <p>
	 * Name: IS_VALID_ARGUMENT
	 * </p>
	 */
	public static McObfPair field_190851_y = McMappingDatabase.getSRG("field_190851_y");

	/**
	 * <p>
	 * Name: getPosFromArguments
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_189210_b = McMappingDatabase.getSRG("EntitySelector.func_189210_b");

	/**
	 * <p>
	 * Name: ARGUMENT_MODE
	 * </p>
	 */
	public static McObfPair field_190846_t = McMappingDatabase.getSRG("field_190846_t");

	/**
	 * <p>
	 * Name: WORLD_BINDING_ARGS
	 * </p>
	 */
	public static McObfPair field_179666_d = McMappingDatabase.getSRG("field_179666_d");

	/**
	 * <p>
	 * Name: getScorePredicates
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Ljava/util/Map;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184952_c = McMappingDatabase.getSRG("EntitySelector.func_184952_c");

	/**
	 * <p>
	 * Name: getWorlds
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Ljava/util/Map;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_179654_a = McMappingDatabase.getSRG("EntitySelector.func_179654_a");

	/**
	 * <p>
	 * Name: ARGUMENT_TEAM_NAME
	 * </p>
	 */
	public static McObfPair field_190847_u = McMappingDatabase.getSRG("field_190847_u");

	/**
	 * <p>
	 * Name: isEntityTypeValid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Ljava/util/Map;)Z]
	 * </p>
	 */
	public static McObfPair func_179655_b = McMappingDatabase.getSRG("EntitySelector.func_179655_b");

	/**
	 * <p>
	 * Name: addArgument
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_190826_c = McMappingDatabase.getSRG("EntitySelector.func_190826_c");

	/**
	 * <p>
	 * Name: filterResults
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;Ljava/lang/Class;Ljava/util/List;Ljava/lang/String;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_179660_a = McMappingDatabase.getSRG("EntitySelector.func_179660_a");

	/**
	 * <p>
	 * Name: EQUAL_SPLITTER
	 * </p>
	 */
	public static McObfPair field_190829_c = McMappingDatabase.getSRG("field_190829_c");

	/**
	 * <p>
	 * Name: ARGUMENT_COUNT
	 * </p>
	 */
	public static McObfPair field_190845_s = McMappingDatabase.getSRG("field_190845_s");

	/**
	 * <p>
	 * Name: isSelector
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_82378_b = McMappingDatabase.getSRG("EntitySelector.func_82378_b");

	/**
	 * <p>
	 * Name: getBlockPosFromArguments
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_179664_b = McMappingDatabase.getSRG("EntitySelector.func_179664_b");

	/**
	 * <p>
	 * Name: COMMA_SPLITTER
	 * </p>
	 */
	public static McObfPair field_190828_b = McMappingDatabase.getSRG("field_190828_b");

	/**
	 * <p>
	 * Name: ARGUMENT_ROTY_MIN
	 * </p>
	 */
	public static McObfPair field_190844_r = McMappingDatabase.getSRG("field_190844_r");

	/**
	 * <p>
	 * Name: getArgument
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_179651_b = McMappingDatabase.getSRG("EntitySelector.func_179651_b");

	/**
	 * <p>
	 * Name: getCoordinate
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;Ljava/lang/String;DZ)D]
	 * </p>
	 */
	public static McObfPair func_189211_a = McMappingDatabase.getSRG("EntitySelector.func_189211_a");

	/**
	 * <p>
	 * Name: getAABB
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;III)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_179661_a = McMappingDatabase.getSRG("EntitySelector.func_179661_a");

	/**
	 * <p>
	 * Name: ARGUMENT_ENTITY_TAG
	 * </p>
	 */
	public static McObfPair field_190850_x = McMappingDatabase.getSRG("field_190850_x");

	/**
	 * <p>
	 * Name: matchEntities
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_179656_b = McMappingDatabase.getSRG("EntitySelector.func_179656_b");

	/**
	 * <p>
	 * Name: ARGUMENT_ROTX_MIN
	 * </p>
	 */
	public static McObfPair field_190842_p = McMappingDatabase.getSRG("field_190842_p");

	/**
	 * <p>
	 * Name: getArgumentMap
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_82381_h = McMappingDatabase.getSRG("EntitySelector.func_82381_h");

	/**
	 * <p>
	 * Name: ARGUMENT_LEVEL_MIN
	 * </p>
	 */
	public static McObfPair field_190834_h = McMappingDatabase.getSRG("field_190834_h");

	/**
	 * <p>
	 * Name: hasArgument
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)Z]
	 * </p>
	 */
	public static McObfPair func_179665_h = McMappingDatabase.getSRG("EntitySelector.func_179665_h");

	/**
	 * <p>
	 * Name: getXpLevelPredicates
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_179648_b = McMappingDatabase.getSRG("EntitySelector.func_179648_b");

	/**
	 * <p>
	 * Name: ARGUMENT_PLAYER_NAME
	 * </p>
	 */
	public static McObfPair field_190848_v = McMappingDatabase.getSRG("field_190848_v");

	/**
	 * <p>
	 * Name: getNamePredicates
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_179647_f = McMappingDatabase.getSRG("EntitySelector.func_179647_f");

	/**
	 * <p>
	 * Name: getScoreMap
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_96560_a = McMappingDatabase.getSRG("EntitySelector.func_96560_a");

	/**
	 * <p>
	 * Name: getRotationsPredicates
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_179662_g = McMappingDatabase.getSRG("EntitySelector.func_179662_g");

	/**
	 * <p>
	 * Name: ARGUMENT_DELTA_X
	 * </p>
	 */
	public static McObfPair field_190838_l = McMappingDatabase.getSRG("field_190838_l");

	/**
	 * <p>
	 * Name: getTypePredicates
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_179663_a = McMappingDatabase.getSRG("EntitySelector.func_179663_a");

	/**
	 * <p>
	 * Name: ARGUMENT_ROTY_MAX
	 * </p>
	 */
	public static McObfPair field_190843_q = McMappingDatabase.getSRG("field_190843_q");

	/**
	 * <p>
	 * Name: ARGUMENT_ENTITY_TYPE
	 * </p>
	 */
	public static McObfPair field_190849_w = McMappingDatabase.getSRG("field_190849_w");

	/**
	 * <p>
	 * Name: matchesMultiplePlayers
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_82377_a = McMappingDatabase.getSRG("EntitySelector.func_82377_a");

	/**
	 * <p>
	 * Name: ARGUMENT_RANGE_MIN
	 * </p>
	 */
	public static McObfPair field_190832_f = McMappingDatabase.getSRG("field_190832_f");

	/**
	 * <p>
	 * Name: getRadiusPredicates
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;Lnet/minecraft/util/math/Vec3d;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_180698_a = McMappingDatabase.getSRG("EntitySelector.func_180698_a");

	/**
	 * <p>
	 * Name: getEntitiesFromPredicates
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Ljava/util/Map;Lnet/minecraft/command/ICommandSender;Ljava/lang/Class;Ljava/lang/String;Lnet/minecraft/util/math/Vec3d;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_179658_a = McMappingDatabase.getSRG("EntitySelector.func_179658_a");

	/**
	 * <p>
	 * Name: getInt
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;Ljava/lang/String;I)I]
	 * </p>
	 */
	public static McObfPair func_179653_a = McMappingDatabase.getSRG("EntitySelector.func_179653_a");

	/**
	 * <p>
	 * Name: ARGUMENT_ROTX_MAX
	 * </p>
	 */
	public static McObfPair field_190841_o = McMappingDatabase.getSRG("field_190841_o");

	/**
	 * <p>
	 * Name: matchOnePlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Ljava/lang/String;)Lnet/minecraft/entity/player/EntityPlayerMP;]
	 * </p>
	 */
	public static McObfPair func_82386_a = McMappingDatabase.getSRG("EntitySelector.func_82386_a");

	/**
	 * <p>
	 * Name: ARGUMENT_LEVEL_MAX
	 * </p>
	 */
	public static McObfPair field_190833_g = McMappingDatabase.getSRG("field_190833_g");

	/**
	 * <p>
	 * Name: getTeamPredicates
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_179659_d = McMappingDatabase.getSRG("EntitySelector.func_179659_d");

	/**
	 * <p>
	 * Name: ARGUMENT_RANGE_MAX
	 * </p>
	 */
	public static McObfPair field_190831_e = McMappingDatabase.getSRG("field_190831_e");

	/**
	 * <p>
	 * Name: getTagPredicates
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184951_f = McMappingDatabase.getSRG("EntitySelector.func_184951_f");

	/**
	 * <p>
	 * Name: ARGUMENT_DELTA_Y
	 * </p>
	 */
	public static McObfPair field_190839_m = McMappingDatabase.getSRG("field_190839_m");

	/**
	 * <p>
	 * Name: TOKEN_PATTERN
	 * </p>
	 */
	public static McObfPair field_82389_a = McMappingDatabase.getSRG("field_82389_a");

	/**
	 * <p>
	 * Name: ARGUMENT_COORDINATE_Z
	 * </p>
	 */
	public static McObfPair field_190837_k = McMappingDatabase.getSRG("field_190837_k");

	/**
	 * <p>
	 * Name: ARGUMENT_DELTA_Z
	 * </p>
	 */
	public static McObfPair field_190840_n = McMappingDatabase.getSRG("field_190840_n");

	/**
	 * <p>
	 * Name: getGamemodePredicates
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_179649_c = McMappingDatabase.getSRG("EntitySelector.func_179649_c");

}

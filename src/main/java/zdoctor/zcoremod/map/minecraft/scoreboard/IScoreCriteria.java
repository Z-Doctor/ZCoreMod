package zdoctor.zcoremod.map.minecraft.scoreboard;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IScoreCriteria {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhq";
		else
			return "net/minecraft/scoreboard/IScoreCriteria";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhq";
		else
			return "IScoreCriteria";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhq;";
		else
			return "Lnet/minecraft/scoreboard/IScoreCriteria;";
	}

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_96636_a = McMappingDatabase.getSRG("IScoreCriteria.func_96636_a");

	/**
	 * <p>
	 * Name: FOOD
	 * </p>
	 */
	public static McObfPair field_186698_h = McMappingDatabase.getSRG("field_186698_h");

	/**
	 * <p>
	 * Name: getRenderType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/IScoreCriteria$EnumRenderType;]
	 * </p>
	 */
	public static McObfPair func_178790_c = McMappingDatabase.getSRG("IScoreCriteria.func_178790_c");

	/**
	 * <p>
	 * Name: INSTANCES
	 * </p>
	 */
	public static McObfPair field_96643_a = McMappingDatabase.getSRG("field_96643_a");

	/**
	 * <p>
	 * Name: DEATH_COUNT
	 * </p>
	 */
	public static McObfPair field_96642_c = McMappingDatabase.getSRG("field_96642_c");

	/**
	 * <p>
	 * Name: XP
	 * </p>
	 */
	public static McObfPair field_186701_k = McMappingDatabase.getSRG("field_186701_k");

	/**
	 * <p>
	 * Name: TOTAL_KILL_COUNT
	 * </p>
	 */
	public static McObfPair field_96640_e = McMappingDatabase.getSRG("field_96640_e");

	/**
	 * <p>
	 * Name: PLAYER_KILL_COUNT
	 * </p>
	 */
	public static McObfPair field_96639_d = McMappingDatabase.getSRG("field_96639_d");

	/**
	 * <p>
	 * Name: ARMOR
	 * </p>
	 */
	public static McObfPair field_186700_j = McMappingDatabase.getSRG("field_186700_j");

	/**
	 * <p>
	 * Name: AIR
	 * </p>
	 */
	public static McObfPair field_186699_i = McMappingDatabase.getSRG("field_186699_i");

	/**
	 * <p>
	 * Name: DUMMY
	 * </p>
	 */
	public static McObfPair field_96641_b = McMappingDatabase.getSRG("field_96641_b");

	/**
	 * <p>
	 * Name: TRIGGER
	 * </p>
	 */
	public static McObfPair field_178791_c = McMappingDatabase.getSRG("field_178791_c");

	/**
	 * <p>
	 * Name: TEAM_KILL
	 * </p>
	 */
	public static McObfPair field_178792_h = McMappingDatabase.getSRG("field_178792_h");

	/**
	 * <p>
	 * Name: LEVEL
	 * </p>
	 */
	public static McObfPair field_186702_l = McMappingDatabase.getSRG("field_186702_l");

	/**
	 * <p>
	 * Name: HEALTH
	 * </p>
	 */
	public static McObfPair field_96638_f = McMappingDatabase.getSRG("field_96638_f");

	/**
	 * <p>
	 * Name: isReadOnly
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_96637_b = McMappingDatabase.getSRG("IScoreCriteria.func_96637_b");

	/**
	 * <p>
	 * Name: KILLED_BY_TEAM
	 * </p>
	 */
	public static McObfPair field_178793_i = McMappingDatabase.getSRG("field_178793_i");

}

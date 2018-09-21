package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySelectors {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vk";
		else
			return "net/minecraft/util/EntitySelectors";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vk";
		else
			return "EntitySelectors";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvk;";
		else
			return "Lnet/minecraft/util/EntitySelectors;";
	}

	/**
	 * <p>
	 * Name: getTeamCollisionPredicate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lcom/google/common/base/Predicate;]
	 * </p>
	 */
	public static McObfPair func_188442_a = McMappingDatabase.getSRG("EntitySelectors.func_188442_a");

	/**
	 * <p>
	 * Name: notRiding
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lcom/google/common/base/Predicate;]
	 * </p>
	 */
	public static McObfPair func_191324_b = McMappingDatabase.getSRG("EntitySelectors.func_191324_b");

	/**
	 * <p>
	 * Name: IS_STANDALONE
	 * </p>
	 */
	public static McObfPair field_152785_b = McMappingDatabase.getSRG("field_152785_b");

	/**
	 * <p>
	 * Name: IS_ALIVE
	 * </p>
	 */
	public static McObfPair field_94557_a = McMappingDatabase.getSRG("field_94557_a");

	/**
	 * <p>
	 * Name: CAN_AI_TARGET
	 * </p>
	 */
	public static McObfPair field_188444_d = McMappingDatabase.getSRG("field_188444_d");

	/**
	 * <p>
	 * Name: withinRange
	 * </p>
	 * <p>
	 * Desc: [(DDDD)Lcom/google/common/base/Predicate;]
	 * </p>
	 */
	public static McObfPair func_188443_a = McMappingDatabase.getSRG("EntitySelectors.func_188443_a");

	/**
	 * <p>
	 * Name: NOT_SPECTATING
	 * </p>
	 */
	public static McObfPair field_180132_d = McMappingDatabase.getSRG("field_180132_d");

	/**
	 * <p>
	 * Name: HAS_INVENTORY
	 * </p>
	 */
	public static McObfPair field_96566_b = McMappingDatabase.getSRG("field_96566_b");

}

package zdoctor.zcoremod.map.minecraft.world.storage.loot.conditions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityHasScore {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgk";
		else
			return "net/minecraft/world/storage/loot/conditions/EntityHasScore";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgk";
		else
			return "EntityHasScore";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgk;";
		else
			return "Lnet/minecraft/world/storage/loot/conditions/EntityHasScore;";
	}

	/**
	 * <p>
	 * Name: testCondition
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Z]
	 * </p>
	 */
	public static McObfPair func_186618_a = McMappingDatabase.getSRG("EntityHasScore.func_186618_a");

	/**
	 * <p>
	 * Name: entityScoreMatch
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/scoreboard/Scoreboard;Ljava/lang/String;Lnet/minecraft/world/storage/loot/RandomValueRange;)Z]
	 * </p>
	 */
	public static McObfPair func_186631_a = McMappingDatabase.getSRG("EntityHasScore.func_186631_a");

	/**
	 * <p>
	 * Name: scores
	 * </p>
	 */
	public static McObfPair field_186634_a = McMappingDatabase.getSRG("field_186634_a");

	/**
	 * <p>
	 * Name: target
	 * </p>
	 */
	public static McObfPair field_186635_b = McMappingDatabase.getSRG("field_186635_b");

}

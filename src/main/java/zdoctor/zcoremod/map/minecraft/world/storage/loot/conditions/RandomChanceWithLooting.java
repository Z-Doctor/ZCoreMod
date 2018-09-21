package zdoctor.zcoremod.map.minecraft.world.storage.loot.conditions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RandomChanceWithLooting {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgq";
		else
			return "net/minecraft/world/storage/loot/conditions/RandomChanceWithLooting";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgq";
		else
			return "RandomChanceWithLooting";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgq;";
		else
			return "Lnet/minecraft/world/storage/loot/conditions/RandomChanceWithLooting;";
	}

	/**
	 * <p>
	 * Name: lootingMultiplier
	 * </p>
	 */
	public static McObfPair field_186628_b = McMappingDatabase.getSRG("field_186628_b");

	/**
	 * <p>
	 * Name: chance
	 * </p>
	 */
	public static McObfPair field_186627_a = McMappingDatabase.getSRG("field_186627_a");

	/**
	 * <p>
	 * Name: testCondition
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Z]
	 * </p>
	 */
	public static McObfPair func_186618_a = McMappingDatabase.getSRG("RandomChanceWithLooting.func_186618_a");

}

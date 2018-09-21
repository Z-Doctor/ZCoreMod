package zdoctor.zcoremod.map.minecraft.world.storage.loot;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootPool {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfq";
		else
			return "net/minecraft/world/storage/loot/LootPool";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfq";
		else
			return "LootPool";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfq;";
		else
			return "Lnet/minecraft/world/storage/loot/LootPool;";
	}

	/**
	 * <p>
	 * Name: poolConditions
	 * </p>
	 */
	public static McObfPair field_186454_b = McMappingDatabase.getSRG("field_186454_b");

	/**
	 * <p>
	 * Name: bonusRolls
	 * </p>
	 */
	public static McObfPair field_186456_d = McMappingDatabase.getSRG("field_186456_d");

	/**
	 * <p>
	 * Name: lootEntries
	 * </p>
	 */
	public static McObfPair field_186453_a = McMappingDatabase.getSRG("field_186453_a");

	/**
	 * <p>
	 * Name: rolls
	 * </p>
	 */
	public static McObfPair field_186455_c = McMappingDatabase.getSRG("field_186455_c");

	/**
	 * <p>
	 * Name: generateLoot
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Collection;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)V]
	 * </p>
	 */
	public static McObfPair func_186449_b = McMappingDatabase.getSRG("LootPool.func_186449_b");

	/**
	 * <p>
	 * Name: createLootRoll
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Collection;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)V]
	 * </p>
	 */
	public static McObfPair func_186452_a = McMappingDatabase.getSRG("LootPool.func_186452_a");

}

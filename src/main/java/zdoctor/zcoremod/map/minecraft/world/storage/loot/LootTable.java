package zdoctor.zcoremod.map.minecraft.world.storage.loot;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootTable {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfs";
		else
			return "net/minecraft/world/storage/loot/LootTable";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfs";
		else
			return "LootTable";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfs;";
		else
			return "Lnet/minecraft/world/storage/loot/LootTable;";
	}

	/**
	 * <p>
	 * Name: shuffleItems
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;ILjava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_186463_a = McMappingDatabase.getSRG("LootTable.func_186463_a");

	/**
	 * <p>
	 * Name: getEmptySlotsRandomized
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;Ljava/util/Random;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_186459_a = McMappingDatabase.getSRG("LootTable.func_186459_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_186465_b = McMappingDatabase.getSRG("field_186465_b");

	/**
	 * <p>
	 * Name: EMPTY_LOOT_TABLE
	 * </p>
	 */
	public static McObfPair field_186464_a = McMappingDatabase.getSRG("field_186464_a");

	/**
	 * <p>
	 * Name: pools
	 * </p>
	 */
	public static McObfPair field_186466_c = McMappingDatabase.getSRG("field_186466_c");

	/**
	 * <p>
	 * Name: generateLootForPools
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_186462_a = McMappingDatabase.getSRG("LootTable.func_186462_a");

	/**
	 * <p>
	 * Name: fillInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)V]
	 * </p>
	 */
	public static McObfPair func_186460_a = McMappingDatabase.getSRG("LootTable.func_186460_a");

}

package zdoctor.zcoremod.map.minecraft.world.storage.loot;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootContext {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bft";
		else
			return "net/minecraft/world/storage/loot/LootContext";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bft";
		else
			return "LootContext";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbft;";
		else
			return "Lnet/minecraft/world/storage/loot/LootContext;";
	}

	/**
	 * <p>
	 * Name: getKillerPlayer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_186495_b = McMappingDatabase.getSRG("LootContext.func_186495_b");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_186502_e = McMappingDatabase.getSRG("field_186502_e");

	/**
	 * <p>
	 * Name: luck
	 * </p>
	 */
	public static McObfPair field_186498_a = McMappingDatabase.getSRG("field_186498_a");

	/**
	 * <p>
	 * Name: addLootTable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/loot/LootTable;)Z]
	 * </p>
	 */
	public static McObfPair func_186496_a = McMappingDatabase.getSRG("LootContext.func_186496_a");

	/**
	 * <p>
	 * Name: lootTableManager
	 * </p>
	 */
	public static McObfPair field_186500_c = McMappingDatabase.getSRG("field_186500_c");

	/**
	 * <p>
	 * Name: getLootedEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_186493_a = McMappingDatabase.getSRG("LootContext.func_186493_a");

	/**
	 * <p>
	 * Name: getEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/loot/LootContext$EntityTarget;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_186494_a = McMappingDatabase.getSRG("LootContext.func_186494_a");

	/**
	 * <p>
	 * Name: lootTables
	 * </p>
	 */
	public static McObfPair field_186504_g = McMappingDatabase.getSRG("field_186504_g");

	/**
	 * <p>
	 * Name: removeLootTable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/loot/LootTable;)V]
	 * </p>
	 */
	public static McObfPair func_186490_b = McMappingDatabase.getSRG("LootContext.func_186490_b");

	/**
	 * <p>
	 * Name: getLootTableManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/storage/loot/LootTableManager;]
	 * </p>
	 */
	public static McObfPair func_186497_e = McMappingDatabase.getSRG("LootContext.func_186497_e");

	/**
	 * <p>
	 * Name: lootedEntity
	 * </p>
	 */
	public static McObfPair field_186501_d = McMappingDatabase.getSRG("field_186501_d");

	/**
	 * <p>
	 * Name: getLuck
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_186491_f = McMappingDatabase.getSRG("LootContext.func_186491_f");

	/**
	 * <p>
	 * Name: getKiller
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_186492_c = McMappingDatabase.getSRG("LootContext.func_186492_c");

	/**
	 * <p>
	 * Name: damageSource
	 * </p>
	 */
	public static McObfPair field_186503_f = McMappingDatabase.getSRG("field_186503_f");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_186499_b = McMappingDatabase.getSRG("field_186499_b");

}

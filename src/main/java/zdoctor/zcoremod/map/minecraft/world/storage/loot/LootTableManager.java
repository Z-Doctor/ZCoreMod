package zdoctor.zcoremod.map.minecraft.world.storage.loot;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootTableManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfv";
		else
			return "net/minecraft/world/storage/loot/LootTableManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfv";
		else
			return "LootTableManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfv;";
		else
			return "Lnet/minecraft/world/storage/loot/LootTableManager;";
	}

	/**
	 * <p>
	 * Name: reloadLootTables
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186522_a = McMappingDatabase.getSRG("LootTableManager.func_186522_a");

	/**
	 * <p>
	 * Name: baseFolder
	 * </p>
	 */
	public static McObfPair field_186528_d = McMappingDatabase.getSRG("field_186528_d");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_186525_a = McMappingDatabase.getSRG("field_186525_a");

	/**
	 * <p>
	 * Name: GSON_INSTANCE
	 * </p>
	 */
	public static McObfPair field_186526_b = McMappingDatabase.getSRG("field_186526_b");

	/**
	 * <p>
	 * Name: getLootTableFromLocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/world/storage/loot/LootTable;]
	 * </p>
	 */
	public static McObfPair func_186521_a = McMappingDatabase.getSRG("LootTableManager.func_186521_a");

	/**
	 * <p>
	 * Name: registeredLootTables
	 * </p>
	 */
	public static McObfPair field_186527_c = McMappingDatabase.getSRG("field_186527_c");

}

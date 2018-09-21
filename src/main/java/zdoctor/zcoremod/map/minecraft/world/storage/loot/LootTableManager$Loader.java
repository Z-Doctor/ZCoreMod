package zdoctor.zcoremod.map.minecraft.world.storage.loot;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootTableManager$Loader {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfv$a";
		else
			return "net/minecraft/world/storage/loot/LootTableManager$Loader";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfv$a";
		else
			return "LootTableManager$Loader";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfv$a;";
		else
			return "Lnet/minecraft/world/storage/loot/LootTableManager$Loader;";
	}

	/**
	 * <p>
	 * Name: loadBuiltinLootTable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/world/storage/loot/LootTable;]
	 * </p>
	 */
	public static McObfPair func_186518_c = McMappingDatabase.getSRG("LootTableManager$Loader.func_186518_c");

	/**
	 * <p>
	 * Name: loadLootTable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/world/storage/loot/LootTable;]
	 * </p>
	 */
	public static McObfPair func_186517_b = McMappingDatabase.getSRG("LootTableManager$Loader.func_186517_b");

}

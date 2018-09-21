package zdoctor.zcoremod.map.minecraft.world.storage.loot;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootEntryTable {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfu";
		else
			return "net/minecraft/world/storage/loot/LootEntryTable";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfu";
		else
			return "LootEntryTable";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfu;";
		else
			return "Lnet/minecraft/world/storage/loot/LootEntryTable;";
	}

	/**
	 * <p>
	 * Name: table
	 * </p>
	 */
	public static McObfPair field_186371_a = McMappingDatabase.getSRG("field_186371_a");

	/**
	 * <p>
	 * Name: addLoot
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Collection;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)V]
	 * </p>
	 */
	public static McObfPair func_186363_a = McMappingDatabase.getSRG("LootEntryTable.func_186363_a");

	/**
	 * <p>
	 * Name: serialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonSerializationContext;)V]
	 * </p>
	 */
	public static McObfPair func_186362_a = McMappingDatabase.getSRG("LootEntryTable.func_186362_a");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;II[Lnet/minecraft/world/storage/loot/conditions/LootCondition;)Lnet/minecraft/world/storage/loot/LootEntryTable;]
	 * </p>
	 */
	public static McObfPair func_186370_a = McMappingDatabase.getSRG("LootEntryTable.func_186370_a");

}

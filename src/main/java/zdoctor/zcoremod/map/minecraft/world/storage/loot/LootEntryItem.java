package zdoctor.zcoremod.map.minecraft.world.storage.loot;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootEntryItem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfp";
		else
			return "net/minecraft/world/storage/loot/LootEntryItem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfp";
		else
			return "LootEntryItem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfp;";
		else
			return "Lnet/minecraft/world/storage/loot/LootEntryItem;";
	}

	/**
	 * <p>
	 * Name: item
	 * </p>
	 */
	public static McObfPair field_186368_a = McMappingDatabase.getSRG("field_186368_a");

	/**
	 * <p>
	 * Name: functions
	 * </p>
	 */
	public static McObfPair field_186369_b = McMappingDatabase.getSRG("field_186369_b");

	/**
	 * <p>
	 * Name: serialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonSerializationContext;)V]
	 * </p>
	 */
	public static McObfPair func_186362_a = McMappingDatabase.getSRG("LootEntryItem.func_186362_a");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;II[Lnet/minecraft/world/storage/loot/conditions/LootCondition;)Lnet/minecraft/world/storage/loot/LootEntryItem;]
	 * </p>
	 */
	public static McObfPair func_186367_a = McMappingDatabase.getSRG("LootEntryItem.func_186367_a");

	/**
	 * <p>
	 * Name: addLoot
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Collection;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)V]
	 * </p>
	 */
	public static McObfPair func_186363_a = McMappingDatabase.getSRG("LootEntryItem.func_186363_a");

}

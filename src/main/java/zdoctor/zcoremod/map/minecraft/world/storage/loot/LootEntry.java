package zdoctor.zcoremod.map.minecraft.world.storage.loot;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfr";
		else
			return "net/minecraft/world/storage/loot/LootEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfr";
		else
			return "LootEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfr;";
		else
			return "Lnet/minecraft/world/storage/loot/LootEntry;";
	}

	/**
	 * <p>
	 * Name: weight
	 * </p>
	 */
	public static McObfPair field_186364_c = McMappingDatabase.getSRG("field_186364_c");

	/**
	 * <p>
	 * Name: serialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonSerializationContext;)V]
	 * </p>
	 */
	public static McObfPair func_186362_a = McMappingDatabase.getSRG("LootEntry.func_186362_a");

	/**
	 * <p>
	 * Name: quality
	 * </p>
	 */
	public static McObfPair field_186365_d = McMappingDatabase.getSRG("field_186365_d");

	/**
	 * <p>
	 * Name: conditions
	 * </p>
	 */
	public static McObfPair field_186366_e = McMappingDatabase.getSRG("field_186366_e");

	/**
	 * <p>
	 * Name: getEffectiveWeight
	 * </p>
	 * <p>
	 * Desc: [(F)I]
	 * </p>
	 */
	public static McObfPair func_186361_a = McMappingDatabase.getSRG("LootEntry.func_186361_a");

	/**
	 * <p>
	 * Name: addLoot
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Collection;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)V]
	 * </p>
	 */
	public static McObfPair func_186363_a = McMappingDatabase.getSRG("LootEntry.func_186363_a");

}

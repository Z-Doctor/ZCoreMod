package zdoctor.zcoremod.map.minecraft.world.storage.loot;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootEntryEmpty {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfo";
		else
			return "net/minecraft/world/storage/loot/LootEntryEmpty";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfo";
		else
			return "LootEntryEmpty";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfo;";
		else
			return "Lnet/minecraft/world/storage/loot/LootEntryEmpty;";
	}

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;II[Lnet/minecraft/world/storage/loot/conditions/LootCondition;)Lnet/minecraft/world/storage/loot/LootEntryEmpty;]
	 * </p>
	 */
	public static McObfPair func_186372_a = McMappingDatabase.getSRG("LootEntryEmpty.func_186372_a");

	/**
	 * <p>
	 * Name: serialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonSerializationContext;)V]
	 * </p>
	 */
	public static McObfPair func_186362_a = McMappingDatabase.getSRG("LootEntryEmpty.func_186362_a");

	/**
	 * <p>
	 * Name: addLoot
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Collection;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)V]
	 * </p>
	 */
	public static McObfPair func_186363_a = McMappingDatabase.getSRG("LootEntryEmpty.func_186363_a");

}

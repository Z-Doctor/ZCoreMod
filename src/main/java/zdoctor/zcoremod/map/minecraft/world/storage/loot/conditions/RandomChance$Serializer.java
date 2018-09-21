package zdoctor.zcoremod.map.minecraft.world.storage.loot.conditions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RandomChance$Serializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgp$a";
		else
			return "net/minecraft/world/storage/loot/conditions/RandomChance$Serializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgp$a";
		else
			return "RandomChance$Serializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgp$a;";
		else
			return "Lnet/minecraft/world/storage/loot/conditions/RandomChance$Serializer;";
	}

	/**
	 * <p>
	 * Name: serialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lnet/minecraft/world/storage/loot/conditions/LootCondition;Lcom/google/gson/JsonSerializationContext;)V, (Lcom/google/gson/JsonObject;Lnet/minecraft/world/storage/loot/conditions/RandomChance;Lcom/google/gson/JsonSerializationContext;)V]
	 * </p>
	 */
	public static McObfPair func_186605_a = McMappingDatabase.getSRG("RandomChance$Serializer.func_186605_a");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/world/storage/loot/conditions/RandomChance;, (Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/world/storage/loot/conditions/LootCondition;]
	 * </p>
	 */
	public static McObfPair func_186603_b = McMappingDatabase.getSRG("RandomChance$Serializer.func_186603_b");

}

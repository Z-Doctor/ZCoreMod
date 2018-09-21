package zdoctor.zcoremod.map.minecraft.world.storage.loot.conditions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityHasProperty$Serializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgn$a";
		else
			return "net/minecraft/world/storage/loot/conditions/EntityHasProperty$Serializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgn$a";
		else
			return "EntityHasProperty$Serializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgn$a;";
		else
			return "Lnet/minecraft/world/storage/loot/conditions/EntityHasProperty$Serializer;";
	}

	/**
	 * <p>
	 * Name: serialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lnet/minecraft/world/storage/loot/conditions/LootCondition;Lcom/google/gson/JsonSerializationContext;)V, (Lcom/google/gson/JsonObject;Lnet/minecraft/world/storage/loot/conditions/EntityHasProperty;Lcom/google/gson/JsonSerializationContext;)V]
	 * </p>
	 */
	public static McObfPair func_186605_a = McMappingDatabase.getSRG("EntityHasProperty$Serializer.func_186605_a");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/world/storage/loot/conditions/EntityHasProperty;, (Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/world/storage/loot/conditions/LootCondition;]
	 * </p>
	 */
	public static McObfPair func_186603_b = McMappingDatabase.getSRG("EntityHasProperty$Serializer.func_186603_b");

}

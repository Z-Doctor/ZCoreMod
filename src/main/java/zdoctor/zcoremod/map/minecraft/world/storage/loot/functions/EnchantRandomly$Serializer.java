package zdoctor.zcoremod.map.minecraft.world.storage.loot.functions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantRandomly$Serializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfx$a";
		else
			return "net/minecraft/world/storage/loot/functions/EnchantRandomly$Serializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfx$a";
		else
			return "EnchantRandomly$Serializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfx$a;";
		else
			return "Lnet/minecraft/world/storage/loot/functions/EnchantRandomly$Serializer;";
	}

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;[Lnet/minecraft/world/storage/loot/conditions/LootCondition;)Lnet/minecraft/world/storage/loot/functions/EnchantRandomly;, (Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;[Lnet/minecraft/world/storage/loot/conditions/LootCondition;)Lnet/minecraft/world/storage/loot/functions/LootFunction;]
	 * </p>
	 */
	public static McObfPair func_186530_b = McMappingDatabase.getSRG("EnchantRandomly$Serializer.func_186530_b");

	/**
	 * <p>
	 * Name: serialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lnet/minecraft/world/storage/loot/functions/EnchantRandomly;Lcom/google/gson/JsonSerializationContext;)V, (Lcom/google/gson/JsonObject;Lnet/minecraft/world/storage/loot/functions/LootFunction;Lcom/google/gson/JsonSerializationContext;)V]
	 * </p>
	 */
	public static McObfPair func_186532_a = McMappingDatabase.getSRG("EnchantRandomly$Serializer.func_186532_a");

}

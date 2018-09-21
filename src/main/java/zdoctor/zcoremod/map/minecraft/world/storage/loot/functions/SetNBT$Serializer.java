package zdoctor.zcoremod.map.minecraft.world.storage.loot.functions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SetNBT$Serializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgg$a";
		else
			return "net/minecraft/world/storage/loot/functions/SetNBT$Serializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgg$a";
		else
			return "SetNBT$Serializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgg$a;";
		else
			return "Lnet/minecraft/world/storage/loot/functions/SetNBT$Serializer;";
	}

	/**
	 * <p>
	 * Name: serialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lnet/minecraft/world/storage/loot/functions/LootFunction;Lcom/google/gson/JsonSerializationContext;)V, (Lcom/google/gson/JsonObject;Lnet/minecraft/world/storage/loot/functions/SetNBT;Lcom/google/gson/JsonSerializationContext;)V]
	 * </p>
	 */
	public static McObfPair func_186532_a = McMappingDatabase.getSRG("SetNBT$Serializer.func_186532_a");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;[Lnet/minecraft/world/storage/loot/conditions/LootCondition;)Lnet/minecraft/world/storage/loot/functions/SetNBT;, (Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;[Lnet/minecraft/world/storage/loot/conditions/LootCondition;)Lnet/minecraft/world/storage/loot/functions/LootFunction;]
	 * </p>
	 */
	public static McObfPair func_186530_b = McMappingDatabase.getSRG("SetNBT$Serializer.func_186530_b");

}

package zdoctor.zcoremod.map.minecraft.world.storage.loot.functions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootFunction$Serializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfz$a";
		else
			return "net/minecraft/world/storage/loot/functions/LootFunction$Serializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfz$a";
		else
			return "LootFunction$Serializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfz$a;";
		else
			return "Lnet/minecraft/world/storage/loot/functions/LootFunction$Serializer;";
	}

	/**
	 * <p>
	 * Name: getFunctionName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_186529_a = McMappingDatabase.getSRG("LootFunction$Serializer.func_186529_a");

	/**
	 * <p>
	 * Name: functionClass
	 * </p>
	 */
	public static McObfPair field_186534_b = McMappingDatabase.getSRG("field_186534_b");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;[Lnet/minecraft/world/storage/loot/conditions/LootCondition;)Lnet/minecraft/world/storage/loot/functions/LootFunction;]
	 * </p>
	 */
	public static McObfPair func_186530_b = McMappingDatabase.getSRG("LootFunction$Serializer.func_186530_b");

	/**
	 * <p>
	 * Name: lootTableLocation
	 * </p>
	 */
	public static McObfPair field_186533_a = McMappingDatabase.getSRG("field_186533_a");

	/**
	 * <p>
	 * Name: getFunctionClass
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Class;]
	 * </p>
	 */
	public static McObfPair func_186531_b = McMappingDatabase.getSRG("LootFunction$Serializer.func_186531_b");

	/**
	 * <p>
	 * Name: serialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lnet/minecraft/world/storage/loot/functions/LootFunction;Lcom/google/gson/JsonSerializationContext;)V]
	 * </p>
	 */
	public static McObfPair func_186532_a = McMappingDatabase.getSRG("LootFunction$Serializer.func_186532_a");

}

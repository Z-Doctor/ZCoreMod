package zdoctor.zcoremod.map.minecraft.world.storage.loot.conditions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootCondition$Serializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgl$a";
		else
			return "net/minecraft/world/storage/loot/conditions/LootCondition$Serializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgl$a";
		else
			return "LootCondition$Serializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgl$a;";
		else
			return "Lnet/minecraft/world/storage/loot/conditions/LootCondition$Serializer;";
	}

	/**
	 * <p>
	 * Name: getLootTableLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_186602_a = McMappingDatabase.getSRG("LootCondition$Serializer.func_186602_a");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/world/storage/loot/conditions/LootCondition;]
	 * </p>
	 */
	public static McObfPair func_186603_b = McMappingDatabase.getSRG("LootCondition$Serializer.func_186603_b");

	/**
	 * <p>
	 * Name: lootTableLocation
	 * </p>
	 */
	public static McObfPair field_186606_a = McMappingDatabase.getSRG("field_186606_a");

	/**
	 * <p>
	 * Name: serialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lnet/minecraft/world/storage/loot/conditions/LootCondition;Lcom/google/gson/JsonSerializationContext;)V]
	 * </p>
	 */
	public static McObfPair func_186605_a = McMappingDatabase.getSRG("LootCondition$Serializer.func_186605_a");

	/**
	 * <p>
	 * Name: getConditionClass
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Class;]
	 * </p>
	 */
	public static McObfPair func_186604_b = McMappingDatabase.getSRG("LootCondition$Serializer.func_186604_b");

	/**
	 * <p>
	 * Name: conditionClass
	 * </p>
	 */
	public static McObfPair field_186607_b = McMappingDatabase.getSRG("field_186607_b");

}

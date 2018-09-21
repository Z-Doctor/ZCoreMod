package zdoctor.zcoremod.map.minecraft.world.storage.loot.properties;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityOnFire$Serializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgu$a";
		else
			return "net/minecraft/world/storage/loot/properties/EntityOnFire$Serializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgu$a";
		else
			return "EntityOnFire$Serializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgu$a;";
		else
			return "Lnet/minecraft/world/storage/loot/properties/EntityOnFire$Serializer;";
	}

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/world/storage/loot/properties/EntityProperty;, (Lcom/google/gson/JsonElement;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/world/storage/loot/properties/EntityOnFire;]
	 * </p>
	 */
	public static McObfPair func_186652_a = McMappingDatabase.getSRG("EntityOnFire$Serializer.func_186652_a");

	/**
	 * <p>
	 * Name: serialize
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/loot/properties/EntityProperty;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;, (Lnet/minecraft/world/storage/loot/properties/EntityOnFire;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;]
	 * </p>
	 */
	public static McObfPair func_186650_a = McMappingDatabase.getSRG("EntityOnFire$Serializer.func_186650_a");

}

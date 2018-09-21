package zdoctor.zcoremod.map.minecraft.world.storage.loot.properties;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityProperty$Serializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgt$a";
		else
			return "net/minecraft/world/storage/loot/properties/EntityProperty$Serializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgt$a";
		else
			return "EntityProperty$Serializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgt$a;";
		else
			return "Lnet/minecraft/world/storage/loot/properties/EntityProperty$Serializer;";
	}

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_186653_a = McMappingDatabase.getSRG("field_186653_a");

	/**
	 * <p>
	 * Name: serialize
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/loot/properties/EntityProperty;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;]
	 * </p>
	 */
	public static McObfPair func_186650_a = McMappingDatabase.getSRG("EntityProperty$Serializer.func_186650_a");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/world/storage/loot/properties/EntityProperty;]
	 * </p>
	 */
	public static McObfPair func_186652_a = McMappingDatabase.getSRG("EntityProperty$Serializer.func_186652_a");

	/**
	 * <p>
	 * Name: propertyClass
	 * </p>
	 */
	public static McObfPair field_186654_b = McMappingDatabase.getSRG("field_186654_b");

	/**
	 * <p>
	 * Name: getPropertyClass
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Class;]
	 * </p>
	 */
	public static McObfPair func_186651_b = McMappingDatabase.getSRG("EntityProperty$Serializer.func_186651_b");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_186649_a = McMappingDatabase.getSRG("EntityProperty$Serializer.func_186649_a");

}

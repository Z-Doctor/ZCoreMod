package zdoctor.zcoremod.map.minecraft.world.storage.loot.properties;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPropertyManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgs";
		else
			return "net/minecraft/world/storage/loot/properties/EntityPropertyManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgs";
		else
			return "EntityPropertyManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgs;";
		else
			return "Lnet/minecraft/world/storage/loot/properties/EntityPropertyManager;";
	}

	/**
	 * <p>
	 * Name: registerProperty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/loot/properties/EntityProperty$Serializer;)V]
	 * </p>
	 */
	public static McObfPair func_186644_a = McMappingDatabase.getSRG("EntityPropertyManager.func_186644_a");

	/**
	 * <p>
	 * Name: getSerializerFor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/loot/properties/EntityProperty;)Lnet/minecraft/world/storage/loot/properties/EntityProperty$Serializer;]
	 * </p>
	 */
	public static McObfPair func_186645_a = McMappingDatabase.getSRG("EntityPropertyManager.func_186645_a");

	/**
	 * <p>
	 * Name: NAME_TO_SERIALIZER_MAP
	 * </p>
	 */
	public static McObfPair field_186647_a = McMappingDatabase.getSRG("field_186647_a");

	/**
	 * <p>
	 * Name: CLASS_TO_SERIALIZER_MAP
	 * </p>
	 */
	public static McObfPair field_186648_b = McMappingDatabase.getSRG("field_186648_b");

	/**
	 * <p>
	 * Name: getSerializerForName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/world/storage/loot/properties/EntityProperty$Serializer;]
	 * </p>
	 */
	public static McObfPair func_186646_a = McMappingDatabase.getSRG("EntityPropertyManager.func_186646_a");

}

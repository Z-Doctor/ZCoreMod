package zdoctor.zcoremod.map.minecraft.world.storage.loot.properties;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityProperty {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgt";
		else
			return "net/minecraft/world/storage/loot/properties/EntityProperty";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgt";
		else
			return "EntityProperty";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgt;";
		else
			return "Lnet/minecraft/world/storage/loot/properties/EntityProperty;";
	}

	/**
	 * <p>
	 * Name: testProperty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_186657_a = McMappingDatabase.getSRG("EntityProperty.func_186657_a");

}

package zdoctor.zcoremod.map.minecraft.world.storage.loot.properties;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityOnFire {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgu";
		else
			return "net/minecraft/world/storage/loot/properties/EntityOnFire";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgu";
		else
			return "EntityOnFire";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgu;";
		else
			return "Lnet/minecraft/world/storage/loot/properties/EntityOnFire;";
	}

	/**
	 * <p>
	 * Name: testProperty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_186657_a = McMappingDatabase.getSRG("EntityOnFire.func_186657_a");

	/**
	 * <p>
	 * Name: onFire
	 * </p>
	 */
	public static McObfPair field_186659_a = McMappingDatabase.getSRG("field_186659_a");

}

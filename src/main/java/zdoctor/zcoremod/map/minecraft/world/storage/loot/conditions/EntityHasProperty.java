package zdoctor.zcoremod.map.minecraft.world.storage.loot.conditions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityHasProperty {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgn";
		else
			return "net/minecraft/world/storage/loot/conditions/EntityHasProperty";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgn";
		else
			return "EntityHasProperty";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgn;";
		else
			return "Lnet/minecraft/world/storage/loot/conditions/EntityHasProperty;";
	}

	/**
	 * <p>
	 * Name: testCondition
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Z]
	 * </p>
	 */
	public static McObfPair func_186618_a = McMappingDatabase.getSRG("EntityHasProperty.func_186618_a");

	/**
	 * <p>
	 * Name: target
	 * </p>
	 */
	public static McObfPair field_186624_b = McMappingDatabase.getSRG("field_186624_b");

	/**
	 * <p>
	 * Name: properties
	 * </p>
	 */
	public static McObfPair field_186623_a = McMappingDatabase.getSRG("field_186623_a");

}

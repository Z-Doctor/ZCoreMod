package zdoctor.zcoremod.map.minecraft.world.storage.loot.conditions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RandomChance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgp";
		else
			return "net/minecraft/world/storage/loot/conditions/RandomChance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgp";
		else
			return "RandomChance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgp;";
		else
			return "Lnet/minecraft/world/storage/loot/conditions/RandomChance;";
	}

	/**
	 * <p>
	 * Name: chance
	 * </p>
	 */
	public static McObfPair field_186630_a = McMappingDatabase.getSRG("field_186630_a");

	/**
	 * <p>
	 * Name: testCondition
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Z]
	 * </p>
	 */
	public static McObfPair func_186618_a = McMappingDatabase.getSRG("RandomChance.func_186618_a");

}

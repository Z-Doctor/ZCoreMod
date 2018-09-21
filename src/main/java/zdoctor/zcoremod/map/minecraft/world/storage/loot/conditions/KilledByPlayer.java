package zdoctor.zcoremod.map.minecraft.world.storage.loot.conditions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class KilledByPlayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgo";
		else
			return "net/minecraft/world/storage/loot/conditions/KilledByPlayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgo";
		else
			return "KilledByPlayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgo;";
		else
			return "Lnet/minecraft/world/storage/loot/conditions/KilledByPlayer;";
	}

	/**
	 * <p>
	 * Name: inverse
	 * </p>
	 */
	public static McObfPair field_186620_a = McMappingDatabase.getSRG("field_186620_a");

	/**
	 * <p>
	 * Name: testCondition
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Z]
	 * </p>
	 */
	public static McObfPair func_186618_a = McMappingDatabase.getSRG("KilledByPlayer.func_186618_a");

}

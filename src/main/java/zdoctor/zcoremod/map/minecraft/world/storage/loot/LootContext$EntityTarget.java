package zdoctor.zcoremod.map.minecraft.world.storage.loot;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootContext$EntityTarget {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bft$b";
		else
			return "net/minecraft/world/storage/loot/LootContext$EntityTarget";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bft$b";
		else
			return "LootContext$EntityTarget";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbft$b;";
		else
			return "Lnet/minecraft/world/storage/loot/LootContext$EntityTarget;";
	}

	/**
	 * <p>
	 * Name: fromString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/world/storage/loot/LootContext$EntityTarget;]
	 * </p>
	 */
	public static McObfPair func_186482_a = McMappingDatabase.getSRG("LootContext$EntityTarget.func_186482_a");

	/**
	 * <p>
	 * Name: targetType
	 * </p>
	 */
	public static McObfPair field_186488_d = McMappingDatabase.getSRG("field_186488_d");

}

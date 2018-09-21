package zdoctor.zcoremod.map.minecraft.world.storage.loot.functions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootFunction {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfz";
		else
			return "net/minecraft/world/storage/loot/functions/LootFunction";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfz";
		else
			return "LootFunction";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfz;";
		else
			return "Lnet/minecraft/world/storage/loot/functions/LootFunction;";
	}

	/**
	 * <p>
	 * Name: getConditions
	 * </p>
	 * <p>
	 * Desc: [()[Lnet/minecraft/world/storage/loot/conditions/LootCondition;]
	 * </p>
	 */
	public static McObfPair func_186554_a = McMappingDatabase.getSRG("LootFunction.func_186554_a");

	/**
	 * <p>
	 * Name: conditions
	 * </p>
	 */
	public static McObfPair field_186555_a = McMappingDatabase.getSRG("field_186555_a");

	/**
	 * <p>
	 * Name: apply
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_186553_a = McMappingDatabase.getSRG("LootFunction.func_186553_a");

}

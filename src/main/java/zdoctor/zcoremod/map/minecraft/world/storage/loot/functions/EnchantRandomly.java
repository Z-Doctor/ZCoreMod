package zdoctor.zcoremod.map.minecraft.world.storage.loot.functions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantRandomly {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfx";
		else
			return "net/minecraft/world/storage/loot/functions/EnchantRandomly";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfx";
		else
			return "EnchantRandomly";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfx;";
		else
			return "Lnet/minecraft/world/storage/loot/functions/EnchantRandomly;";
	}

	/**
	 * <p>
	 * Name: enchantments
	 * </p>
	 */
	public static McObfPair field_186558_b = McMappingDatabase.getSRG("field_186558_b");

	/**
	 * <p>
	 * Name: apply
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_186553_a = McMappingDatabase.getSRG("EnchantRandomly.func_186553_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_186557_a = McMappingDatabase.getSRG("field_186557_a");

}

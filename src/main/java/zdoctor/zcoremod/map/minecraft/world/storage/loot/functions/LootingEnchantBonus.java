package zdoctor.zcoremod.map.minecraft.world.storage.loot.functions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootingEnchantBonus {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgb";
		else
			return "net/minecraft/world/storage/loot/functions/LootingEnchantBonus";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgb";
		else
			return "LootingEnchantBonus";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgb;";
		else
			return "Lnet/minecraft/world/storage/loot/functions/LootingEnchantBonus;";
	}

	/**
	 * <p>
	 * Name: count
	 * </p>
	 */
	public static McObfPair field_186563_a = McMappingDatabase.getSRG("field_186563_a");

	/**
	 * <p>
	 * Name: limit
	 * </p>
	 */
	public static McObfPair field_189971_b = McMappingDatabase.getSRG("field_189971_b");

	/**
	 * <p>
	 * Name: apply
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_186553_a = McMappingDatabase.getSRG("LootingEnchantBonus.func_186553_a");

}

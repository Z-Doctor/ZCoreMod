package zdoctor.zcoremod.map.minecraft.world.storage.loot.functions;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantWithLevels {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfy";
		else
			return "net/minecraft/world/storage/loot/functions/EnchantWithLevels";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfy";
		else
			return "EnchantWithLevels";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfy;";
		else
			return "Lnet/minecraft/world/storage/loot/functions/EnchantWithLevels;";
	}

	/**
	 * <p>
	 * Name: randomLevel
	 * </p>
	 */
	public static McObfPair field_186577_a = McMappingDatabase.getSRG("field_186577_a");

	/**
	 * <p>
	 * Name: isTreasure
	 * </p>
	 */
	public static McObfPair field_186578_b = McMappingDatabase.getSRG("field_186578_b");

	/**
	 * <p>
	 * Name: apply
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_186553_a = McMappingDatabase.getSRG("EnchantWithLevels.func_186553_a");

}

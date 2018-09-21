package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentDurability {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ali";
		else
			return "net/minecraft/enchantment/EnchantmentDurability";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ali";
		else
			return "EnchantmentDurability";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lali;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentDurability;";
	}

	/**
	 * <p>
	 * Name: getMaxEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77317_b = McMappingDatabase.getSRG("EnchantmentDurability.func_77317_b");

	/**
	 * <p>
	 * Name: canApply
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_92089_a = McMappingDatabase.getSRG("EnchantmentDurability.func_92089_a");

	/**
	 * <p>
	 * Name: getMinEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77321_a = McMappingDatabase.getSRG("EnchantmentDurability.func_77321_a");

	/**
	 * <p>
	 * Name: negateDamage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;ILjava/util/Random;)Z]
	 * </p>
	 */
	public static McObfPair func_92097_a = McMappingDatabase.getSRG("EnchantmentDurability.func_92097_a");

	/**
	 * <p>
	 * Name: getMaxLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77325_b = McMappingDatabase.getSRG("EnchantmentDurability.func_77325_b");

}

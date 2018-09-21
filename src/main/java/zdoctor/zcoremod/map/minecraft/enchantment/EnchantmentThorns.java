package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentThorns {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aly";
		else
			return "net/minecraft/enchantment/EnchantmentThorns";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aly";
		else
			return "EnchantmentThorns";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laly;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentThorns;";
	}

	/**
	 * <p>
	 * Name: shouldHit
	 * </p>
	 * <p>
	 * Desc: [(ILjava/util/Random;)Z]
	 * </p>
	 */
	public static McObfPair func_92094_a = McMappingDatabase.getSRG("EnchantmentThorns.func_92094_a");

	/**
	 * <p>
	 * Name: onUserHurt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/Entity;I)V]
	 * </p>
	 */
	public static McObfPair func_151367_b = McMappingDatabase.getSRG("EnchantmentThorns.func_151367_b");

	/**
	 * <p>
	 * Name: canApply
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_92089_a = McMappingDatabase.getSRG("EnchantmentThorns.func_92089_a");

	/**
	 * <p>
	 * Name: getDamage
	 * </p>
	 * <p>
	 * Desc: [(ILjava/util/Random;)I]
	 * </p>
	 */
	public static McObfPair func_92095_b = McMappingDatabase.getSRG("EnchantmentThorns.func_92095_b");

	/**
	 * <p>
	 * Name: getMaxEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77317_b = McMappingDatabase.getSRG("EnchantmentThorns.func_77317_b");

	/**
	 * <p>
	 * Name: getMinEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77321_a = McMappingDatabase.getSRG("EnchantmentThorns.func_77321_a");

	/**
	 * <p>
	 * Name: getMaxLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77325_b = McMappingDatabase.getSRG("EnchantmentThorns.func_77325_b");

}

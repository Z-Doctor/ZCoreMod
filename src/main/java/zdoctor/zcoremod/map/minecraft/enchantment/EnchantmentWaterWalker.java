package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentWaterWalker {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amb";
		else
			return "net/minecraft/enchantment/EnchantmentWaterWalker";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amb";
		else
			return "EnchantmentWaterWalker";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamb;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentWaterWalker;";
	}

	/**
	 * <p>
	 * Name: getMinEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77321_a = McMappingDatabase.getSRG("EnchantmentWaterWalker.func_77321_a");

	/**
	 * <p>
	 * Name: canApplyTogether
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/Enchantment;)Z]
	 * </p>
	 */
	public static McObfPair func_77326_a = McMappingDatabase.getSRG("EnchantmentWaterWalker.func_77326_a");

	/**
	 * <p>
	 * Name: getMaxEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77317_b = McMappingDatabase.getSRG("EnchantmentWaterWalker.func_77317_b");

	/**
	 * <p>
	 * Name: getMaxLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77325_b = McMappingDatabase.getSRG("EnchantmentWaterWalker.func_77325_b");

}

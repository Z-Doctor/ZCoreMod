package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentMending {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alu";
		else
			return "net/minecraft/enchantment/EnchantmentMending";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alu";
		else
			return "EnchantmentMending";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lalu;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentMending;";
	}

	/**
	 * <p>
	 * Name: isTreasureEnchantment
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185261_e = McMappingDatabase.getSRG("EnchantmentMending.func_185261_e");

	/**
	 * <p>
	 * Name: getMaxLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77325_b = McMappingDatabase.getSRG("EnchantmentMending.func_77325_b");

	/**
	 * <p>
	 * Name: getMinEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77321_a = McMappingDatabase.getSRG("EnchantmentMending.func_77321_a");

	/**
	 * <p>
	 * Name: getMaxEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77317_b = McMappingDatabase.getSRG("EnchantmentMending.func_77317_b");

}

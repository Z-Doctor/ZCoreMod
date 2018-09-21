package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentBindingCurse {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alg";
		else
			return "net/minecraft/enchantment/EnchantmentBindingCurse";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alg";
		else
			return "EnchantmentBindingCurse";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lalg;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentBindingCurse;";
	}

	/**
	 * <p>
	 * Name: getMinEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77321_a = McMappingDatabase.getSRG("EnchantmentBindingCurse.func_77321_a");

	/**
	 * <p>
	 * Name: isCurse
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190936_d = McMappingDatabase.getSRG("EnchantmentBindingCurse.func_190936_d");

	/**
	 * <p>
	 * Name: isTreasureEnchantment
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185261_e = McMappingDatabase.getSRG("EnchantmentBindingCurse.func_185261_e");

	/**
	 * <p>
	 * Name: getMaxLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77325_b = McMappingDatabase.getSRG("EnchantmentBindingCurse.func_77325_b");

	/**
	 * <p>
	 * Name: getMaxEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77317_b = McMappingDatabase.getSRG("EnchantmentBindingCurse.func_77317_b");

}

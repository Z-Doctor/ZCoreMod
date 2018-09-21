package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentVanishingCurse {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ama";
		else
			return "net/minecraft/enchantment/EnchantmentVanishingCurse";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ama";
		else
			return "EnchantmentVanishingCurse";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lama;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentVanishingCurse;";
	}

	/**
	 * <p>
	 * Name: isTreasureEnchantment
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185261_e = McMappingDatabase.getSRG("EnchantmentVanishingCurse.func_185261_e");

	/**
	 * <p>
	 * Name: getMinEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77321_a = McMappingDatabase.getSRG("EnchantmentVanishingCurse.func_77321_a");

	/**
	 * <p>
	 * Name: isCurse
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190936_d = McMappingDatabase.getSRG("EnchantmentVanishingCurse.func_190936_d");

	/**
	 * <p>
	 * Name: getMaxEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77317_b = McMappingDatabase.getSRG("EnchantmentVanishingCurse.func_77317_b");

	/**
	 * <p>
	 * Name: getMaxLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77325_b = McMappingDatabase.getSRG("EnchantmentVanishingCurse.func_77325_b");

}

package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentFrostWalker {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alr";
		else
			return "net/minecraft/enchantment/EnchantmentFrostWalker";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alr";
		else
			return "EnchantmentFrostWalker";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lalr;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentFrostWalker;";
	}

	/**
	 * <p>
	 * Name: isTreasureEnchantment
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185261_e = McMappingDatabase.getSRG("EnchantmentFrostWalker.func_185261_e");

	/**
	 * <p>
	 * Name: getMaxEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77317_b = McMappingDatabase.getSRG("EnchantmentFrostWalker.func_77317_b");

	/**
	 * <p>
	 * Name: getMinEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77321_a = McMappingDatabase.getSRG("EnchantmentFrostWalker.func_77321_a");

	/**
	 * <p>
	 * Name: freezeNearby
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_185266_a = McMappingDatabase.getSRG("EnchantmentFrostWalker.func_185266_a");

	/**
	 * <p>
	 * Name: getMaxLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77325_b = McMappingDatabase.getSRG("EnchantmentFrostWalker.func_77325_b");

	/**
	 * <p>
	 * Name: canApplyTogether
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/Enchantment;)Z]
	 * </p>
	 */
	public static McObfPair func_77326_a = McMappingDatabase.getSRG("EnchantmentFrostWalker.func_77326_a");

}

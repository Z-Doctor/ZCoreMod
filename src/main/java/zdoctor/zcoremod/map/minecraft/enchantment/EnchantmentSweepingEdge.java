package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentSweepingEdge {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alx";
		else
			return "net/minecraft/enchantment/EnchantmentSweepingEdge";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alx";
		else
			return "EnchantmentSweepingEdge";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lalx;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentSweepingEdge;";
	}

	/**
	 * <p>
	 * Name: getMaxEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77317_b = McMappingDatabase.getSRG("EnchantmentSweepingEdge.func_77317_b");

	/**
	 * <p>
	 * Name: getMinEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77321_a = McMappingDatabase.getSRG("EnchantmentSweepingEdge.func_77321_a");

	/**
	 * <p>
	 * Name: getMaxLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77325_b = McMappingDatabase.getSRG("EnchantmentSweepingEdge.func_77325_b");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77320_a = McMappingDatabase.getSRG("EnchantmentSweepingEdge.func_77320_a");

	/**
	 * <p>
	 * Name: getSweepingDamageRatio
	 * </p>
	 * <p>
	 * Desc: [(I)F]
	 * </p>
	 */
	public static McObfPair func_191526_e = McMappingDatabase.getSRG("EnchantmentSweepingEdge.func_191526_e");

}

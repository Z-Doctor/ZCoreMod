package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentProtection {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alw";
		else
			return "net/minecraft/enchantment/EnchantmentProtection";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alw";
		else
			return "EnchantmentProtection";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lalw;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentProtection;";
	}

	/**
	 * <p>
	 * Name: getMaxLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77325_b = McMappingDatabase.getSRG("EnchantmentProtection.func_77325_b");

	/**
	 * <p>
	 * Name: getMinEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77321_a = McMappingDatabase.getSRG("EnchantmentProtection.func_77321_a");

	/**
	 * <p>
	 * Name: getFireTimeForEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;I)I]
	 * </p>
	 */
	public static McObfPair func_92093_a = McMappingDatabase.getSRG("EnchantmentProtection.func_92093_a");

	/**
	 * <p>
	 * Name: canApplyTogether
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/Enchantment;)Z]
	 * </p>
	 */
	public static McObfPair func_77326_a = McMappingDatabase.getSRG("EnchantmentProtection.func_77326_a");

	/**
	 * <p>
	 * Name: calcModifierDamage
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/util/DamageSource;)I]
	 * </p>
	 */
	public static McObfPair func_77318_a = McMappingDatabase.getSRG("EnchantmentProtection.func_77318_a");

	/**
	 * <p>
	 * Name: protectionType
	 * </p>
	 */
	public static McObfPair field_77356_a = McMappingDatabase.getSRG("field_77356_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77320_a = McMappingDatabase.getSRG("EnchantmentProtection.func_77320_a");

	/**
	 * <p>
	 * Name: getMaxEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77317_b = McMappingDatabase.getSRG("EnchantmentProtection.func_77317_b");

	/**
	 * <p>
	 * Name: getBlastDamageReduction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;D)D]
	 * </p>
	 */
	public static McObfPair func_92092_a = McMappingDatabase.getSRG("EnchantmentProtection.func_92092_a");

}

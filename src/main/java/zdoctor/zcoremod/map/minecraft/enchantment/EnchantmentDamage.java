package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentDamage {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alh";
		else
			return "net/minecraft/enchantment/EnchantmentDamage";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alh";
		else
			return "EnchantmentDamage";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lalh;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentDamage;";
	}

	/**
	 * <p>
	 * Name: LEVEL_COST_SPAN
	 * </p>
	 */
	public static McObfPair field_77358_D = McMappingDatabase.getSRG("field_77358_D");

	/**
	 * <p>
	 * Name: DAMAGE_NAMES
	 * </p>
	 */
	public static McObfPair field_77359_A = McMappingDatabase.getSRG("field_77359_A");

	/**
	 * <p>
	 * Name: getMinEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77321_a = McMappingDatabase.getSRG("EnchantmentDamage.func_77321_a");

	/**
	 * <p>
	 * Name: canApply
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_92089_a = McMappingDatabase.getSRG("EnchantmentDamage.func_92089_a");

	/**
	 * <p>
	 * Name: LEVEL_COST
	 * </p>
	 */
	public static McObfPair field_77362_C = McMappingDatabase.getSRG("field_77362_C");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77320_a = McMappingDatabase.getSRG("EnchantmentDamage.func_77320_a");

	/**
	 * <p>
	 * Name: getMaxEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77317_b = McMappingDatabase.getSRG("EnchantmentDamage.func_77317_b");

	/**
	 * <p>
	 * Name: getMaxLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77325_b = McMappingDatabase.getSRG("EnchantmentDamage.func_77325_b");

	/**
	 * <p>
	 * Name: canApplyTogether
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/Enchantment;)Z]
	 * </p>
	 */
	public static McObfPair func_77326_a = McMappingDatabase.getSRG("EnchantmentDamage.func_77326_a");

	/**
	 * <p>
	 * Name: damageType
	 * </p>
	 */
	public static McObfPair field_77361_a = McMappingDatabase.getSRG("field_77361_a");

	/**
	 * <p>
	 * Name: onEntityDamaged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/Entity;I)V]
	 * </p>
	 */
	public static McObfPair func_151368_a = McMappingDatabase.getSRG("EnchantmentDamage.func_151368_a");

	/**
	 * <p>
	 * Name: MIN_COST
	 * </p>
	 */
	public static McObfPair field_77360_B = McMappingDatabase.getSRG("field_77360_B");

	/**
	 * <p>
	 * Name: calcDamageByCreature
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/entity/EnumCreatureAttribute;)F]
	 * </p>
	 */
	public static McObfPair func_152376_a = McMappingDatabase.getSRG("EnchantmentDamage.func_152376_a");

}

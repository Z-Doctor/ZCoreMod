package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnchantmentHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alm";
		else
			return "net/minecraft/enchantment/EnchantmentHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alm";
		else
			return "EnchantmentHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lalm;";
		else
			return "Lnet/minecraft/enchantment/EnchantmentHelper;";
	}

	/**
	 * <p>
	 * Name: addRandomEnchantment
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77504_a = McMappingDatabase.getSRG("EnchantmentHelper.func_77504_a");

	/**
	 * <p>
	 * Name: getFireAspectModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)I]
	 * </p>
	 */
	public static McObfPair func_90036_a = McMappingDatabase.getSRG("EnchantmentHelper.func_90036_a");

	/**
	 * <p>
	 * Name: getEnchantments
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_82781_a = McMappingDatabase.getSRG("EnchantmentHelper.func_82781_a");

	/**
	 * <p>
	 * Name: getFishingSpeedBonus
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_191528_c = McMappingDatabase.getSRG("EnchantmentHelper.func_191528_c");

	/**
	 * <p>
	 * Name: getSweepingDamageRatio
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)F]
	 * </p>
	 */
	public static McObfPair func_191527_a = McMappingDatabase.getSRG("EnchantmentHelper.func_191527_a");

	/**
	 * <p>
	 * Name: getMaxEnchantmentLevel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/Enchantment;Lnet/minecraft/entity/EntityLivingBase;)I]
	 * </p>
	 */
	public static McObfPair func_185284_a = McMappingDatabase.getSRG("EnchantmentHelper.func_185284_a");

	/**
	 * <p>
	 * Name: applyThornEnchantments
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_151384_a = McMappingDatabase.getSRG("EnchantmentHelper.func_151384_a");

	/**
	 * <p>
	 * Name: buildEnchantmentList
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_77513_b = McMappingDatabase.getSRG("EnchantmentHelper.func_77513_b");

	/**
	 * <p>
	 * Name: getEnchantmentLevel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/Enchantment;Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_77506_a = McMappingDatabase.getSRG("EnchantmentHelper.func_77506_a");

	/**
	 * <p>
	 * Name: getEfficiencyModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)I]
	 * </p>
	 */
	public static McObfPair func_185293_e = McMappingDatabase.getSRG("EnchantmentHelper.func_185293_e");

	/**
	 * <p>
	 * Name: applyArthropodEnchantments
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_151385_b = McMappingDatabase.getSRG("EnchantmentHelper.func_151385_b");

	/**
	 * <p>
	 * Name: getLootingModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)I]
	 * </p>
	 */
	public static McObfPair func_185283_h = McMappingDatabase.getSRG("EnchantmentHelper.func_185283_h");

	/**
	 * <p>
	 * Name: getEnchantedItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/Enchantment;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_92099_a = McMappingDatabase.getSRG("EnchantmentHelper.func_92099_a");

	/**
	 * <p>
	 * Name: getModifierForCreature
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/EnumCreatureAttribute;)F]
	 * </p>
	 */
	public static McObfPair func_152377_a = McMappingDatabase.getSRG("EnchantmentHelper.func_152377_a");

	/**
	 * <p>
	 * Name: hasFrostWalkerEnchantment
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_189869_j = McMappingDatabase.getSRG("EnchantmentHelper.func_189869_j");

	/**
	 * <p>
	 * Name: applyEnchantmentModifierArray
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/EnchantmentHelper$IModifier;Ljava/lang/Iterable;)V]
	 * </p>
	 */
	public static McObfPair func_77516_a = McMappingDatabase.getSRG("EnchantmentHelper.func_77516_a");

	/**
	 * <p>
	 * Name: ENCHANTMENT_MODIFIER_DAMAGE
	 * </p>
	 */
	public static McObfPair field_77520_b = McMappingDatabase.getSRG("field_77520_b");

	/**
	 * <p>
	 * Name: calcItemStackEnchantability
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;IILnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_77514_a = McMappingDatabase.getSRG("EnchantmentHelper.func_77514_a");

	/**
	 * <p>
	 * Name: getRespirationModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)I]
	 * </p>
	 */
	public static McObfPair func_185292_c = McMappingDatabase.getSRG("EnchantmentHelper.func_185292_c");

	/**
	 * <p>
	 * Name: getEnchantmentModifierDamage
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Iterable;Lnet/minecraft/util/DamageSource;)I]
	 * </p>
	 */
	public static McObfPair func_77508_a = McMappingDatabase.getSRG("EnchantmentHelper.func_77508_a");

	/**
	 * <p>
	 * Name: hasBindingCurse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_190938_b = McMappingDatabase.getSRG("EnchantmentHelper.func_190938_b");

	/**
	 * <p>
	 * Name: removeIncompatible
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/enchantment/EnchantmentData;)V]
	 * </p>
	 */
	public static McObfPair func_185282_a = McMappingDatabase.getSRG("EnchantmentHelper.func_185282_a");

	/**
	 * <p>
	 * Name: ENCHANTMENT_ITERATOR_DAMAGE
	 * </p>
	 */
	public static McObfPair field_151389_e = McMappingDatabase.getSRG("field_151389_e");

	/**
	 * <p>
	 * Name: getKnockbackModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)I]
	 * </p>
	 */
	public static McObfPair func_77501_a = McMappingDatabase.getSRG("EnchantmentHelper.func_77501_a");

	/**
	 * <p>
	 * Name: ENCHANTMENT_ITERATOR_HURT
	 * </p>
	 */
	public static McObfPair field_151388_d = McMappingDatabase.getSRG("field_151388_d");

	/**
	 * <p>
	 * Name: getAquaAffinityModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_185287_i = McMappingDatabase.getSRG("EnchantmentHelper.func_185287_i");

	/**
	 * <p>
	 * Name: getFishingLuckBonus
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_191529_b = McMappingDatabase.getSRG("EnchantmentHelper.func_191529_b");

	/**
	 * <p>
	 * Name: ENCHANTMENT_MODIFIER_LIVING
	 * </p>
	 */
	public static McObfPair field_77521_c = McMappingDatabase.getSRG("field_77521_c");

	/**
	 * <p>
	 * Name: getEnchantmentDatas
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;Z)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_185291_a = McMappingDatabase.getSRG("EnchantmentHelper.func_185291_a");

	/**
	 * <p>
	 * Name: hasVanishingCurse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_190939_c = McMappingDatabase.getSRG("EnchantmentHelper.func_190939_c");

	/**
	 * <p>
	 * Name: getDepthStriderModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)I]
	 * </p>
	 */
	public static McObfPair func_185294_d = McMappingDatabase.getSRG("EnchantmentHelper.func_185294_d");

	/**
	 * <p>
	 * Name: applyEnchantmentModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/EnchantmentHelper$IModifier;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_77518_a = McMappingDatabase.getSRG("EnchantmentHelper.func_77518_a");

	/**
	 * <p>
	 * Name: setEnchantments
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_82782_a = McMappingDatabase.getSRG("EnchantmentHelper.func_82782_a");

}

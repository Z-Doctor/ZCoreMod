package zdoctor.zcoremod.map.minecraft.enchantment;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Enchantment {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alk";
		else
			return "net/minecraft/enchantment/Enchantment";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "alk";
		else
			return "Enchantment";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lalk;";
		else
			return "Lnet/minecraft/enchantment/Enchantment;";
	}

	/**
	 * <p>
	 * Name: getTranslatedName
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77316_c = McMappingDatabase.getSRG("Enchantment.func_77316_c");

	/**
	 * <p>
	 * Name: getMaxLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77325_b = McMappingDatabase.getSRG("Enchantment.func_77325_b");

	/**
	 * <p>
	 * Name: calcModifierDamage
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/util/DamageSource;)I]
	 * </p>
	 */
	public static McObfPair func_77318_a = McMappingDatabase.getSRG("Enchantment.func_77318_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_77350_z = McMappingDatabase.getSRG("field_77350_z");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77320_a = McMappingDatabase.getSRG("Enchantment.func_77320_a");

	/**
	 * <p>
	 * Name: applicableEquipmentTypes
	 * </p>
	 */
	public static McObfPair field_185263_a = McMappingDatabase.getSRG("field_185263_a");

	/**
	 * <p>
	 * Name: calcDamageByCreature
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/entity/EnumCreatureAttribute;)F]
	 * </p>
	 */
	public static McObfPair func_152376_a = McMappingDatabase.getSRG("Enchantment.func_152376_a");

	/**
	 * <p>
	 * Name: getEnchantmentID
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/Enchantment;)I]
	 * </p>
	 */
	public static McObfPair func_185258_b = McMappingDatabase.getSRG("Enchantment.func_185258_b");

	/**
	 * <p>
	 * Name: canApply
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_92089_a = McMappingDatabase.getSRG("Enchantment.func_92089_a");

	/**
	 * <p>
	 * Name: getMinLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77319_d = McMappingDatabase.getSRG("Enchantment.func_77319_d");

	/**
	 * <p>
	 * Name: isCompatibleWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/Enchantment;)Z]
	 * </p>
	 */
	public static McObfPair func_191560_c = McMappingDatabase.getSRG("Enchantment.func_191560_c");

	/**
	 * <p>
	 * Name: isCurse
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190936_d = McMappingDatabase.getSRG("Enchantment.func_190936_d");

	/**
	 * <p>
	 * Name: getMinEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77321_a = McMappingDatabase.getSRG("Enchantment.func_77321_a");

	/**
	 * <p>
	 * Name: onUserHurt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/Entity;I)V]
	 * </p>
	 */
	public static McObfPair func_151367_b = McMappingDatabase.getSRG("Enchantment.func_151367_b");

	/**
	 * <p>
	 * Name: registerEnchantments
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_185257_f = McMappingDatabase.getSRG("Enchantment.func_185257_f");

	/**
	 * <p>
	 * Name: canApplyTogether
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/Enchantment;)Z]
	 * </p>
	 */
	public static McObfPair func_77326_a = McMappingDatabase.getSRG("Enchantment.func_77326_a");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_77351_y = McMappingDatabase.getSRG("field_77351_y");

	/**
	 * <p>
	 * Name: getEnchantmentByID
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/enchantment/Enchantment;]
	 * </p>
	 */
	public static McObfPair func_185262_c = McMappingDatabase.getSRG("Enchantment.func_185262_c");

	/**
	 * <p>
	 * Name: setName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/enchantment/Enchantment;]
	 * </p>
	 */
	public static McObfPair func_77322_b = McMappingDatabase.getSRG("Enchantment.func_77322_b");

	/**
	 * <p>
	 * Name: onEntityDamaged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/Entity;I)V]
	 * </p>
	 */
	public static McObfPair func_151368_a = McMappingDatabase.getSRG("Enchantment.func_151368_a");

	/**
	 * <p>
	 * Name: rarity
	 * </p>
	 */
	public static McObfPair field_77333_a = McMappingDatabase.getSRG("field_77333_a");

	/**
	 * <p>
	 * Name: REGISTRY
	 * </p>
	 */
	public static McObfPair field_185264_b = McMappingDatabase.getSRG("field_185264_b");

	/**
	 * <p>
	 * Name: getEnchantmentByLocation
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/enchantment/Enchantment;]
	 * </p>
	 */
	public static McObfPair func_180305_b = McMappingDatabase.getSRG("Enchantment.func_180305_b");

	/**
	 * <p>
	 * Name: isTreasureEnchantment
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185261_e = McMappingDatabase.getSRG("Enchantment.func_185261_e");

	/**
	 * <p>
	 * Name: getEntityEquipment
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_185260_a = McMappingDatabase.getSRG("Enchantment.func_185260_a");

	/**
	 * <p>
	 * Name: getRarity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/enchantment/Enchantment$Rarity;]
	 * </p>
	 */
	public static McObfPair func_77324_c = McMappingDatabase.getSRG("Enchantment.func_77324_c");

	/**
	 * <p>
	 * Name: getMaxEnchantability
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77317_b = McMappingDatabase.getSRG("Enchantment.func_77317_b");

}

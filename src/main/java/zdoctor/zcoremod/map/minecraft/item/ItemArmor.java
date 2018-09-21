package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemArmor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agv";
		else
			return "net/minecraft/item/ItemArmor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agv";
		else
			return "ItemArmor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagv;";
		else
			return "Lnet/minecraft/item/ItemArmor;";
	}

	/**
	 * <p>
	 * Name: armorType
	 * </p>
	 */
	public static McObfPair field_77881_a = McMappingDatabase.getSRG("field_77881_a");

	/**
	 * <p>
	 * Name: MAX_DAMAGE_ARRAY
	 * </p>
	 */
	public static McObfPair field_77882_bY = McMappingDatabase.getSRG("field_77882_bY");

	/**
	 * <p>
	 * Name: getItemAttributeModifiers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;)Lcom/google/common/collect/Multimap;]
	 * </p>
	 */
	public static McObfPair func_111205_h = McMappingDatabase.getSRG("ItemArmor.func_111205_h");

	/**
	 * <p>
	 * Name: getItemEnchantability
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77619_b = McMappingDatabase.getSRG("ItemArmor.func_77619_b");

	/**
	 * <p>
	 * Name: getArmorMaterial
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemArmor$ArmorMaterial;]
	 * </p>
	 */
	public static McObfPair func_82812_d = McMappingDatabase.getSRG("ItemArmor.func_82812_d");

	/**
	 * <p>
	 * Name: getEquipmentSlot
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/inventory/EntityEquipmentSlot;]
	 * </p>
	 */
	public static McObfPair func_185083_B_ = McMappingDatabase.getSRG("ItemArmor.func_185083_B_");

	/**
	 * <p>
	 * Name: removeColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_82815_c = McMappingDatabase.getSRG("ItemArmor.func_82815_c");

	/**
	 * <p>
	 * Name: getIsRepairable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_82789_a = McMappingDatabase.getSRG("ItemArmor.func_82789_a");

	/**
	 * <p>
	 * Name: EMPTY_SLOT_NAMES
	 * </p>
	 */
	public static McObfPair field_94603_a = McMappingDatabase.getSRG("field_94603_a");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_82814_b = McMappingDatabase.getSRG("ItemArmor.func_82814_b");

	/**
	 * <p>
	 * Name: hasColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_82816_b_ = McMappingDatabase.getSRG("ItemArmor.func_82816_b_");

	/**
	 * <p>
	 * Name: setColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;I)V]
	 * </p>
	 */
	public static McObfPair func_82813_b = McMappingDatabase.getSRG("ItemArmor.func_82813_b");

	/**
	 * <p>
	 * Name: onItemRightClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;]
	 * </p>
	 */
	public static McObfPair func_77659_a = McMappingDatabase.getSRG("ItemArmor.func_77659_a");

	/**
	 * <p>
	 * Name: damageReduceAmount
	 * </p>
	 */
	public static McObfPair field_77879_b = McMappingDatabase.getSRG("field_77879_b");

	/**
	 * <p>
	 * Name: dispenseArmor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/dispenser/IBlockSource;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_185082_a = McMappingDatabase.getSRG("ItemArmor.func_185082_a");

	/**
	 * <p>
	 * Name: ARMOR_MODIFIERS
	 * </p>
	 */
	public static McObfPair field_185084_n = McMappingDatabase.getSRG("field_185084_n");

	/**
	 * <p>
	 * Name: material
	 * </p>
	 */
	public static McObfPair field_77878_bZ = McMappingDatabase.getSRG("field_77878_bZ");

	/**
	 * <p>
	 * Name: renderIndex
	 * </p>
	 */
	public static McObfPair field_77880_c = McMappingDatabase.getSRG("field_77880_c");

	/**
	 * <p>
	 * Name: toughness
	 * </p>
	 */
	public static McObfPair field_189415_e = McMappingDatabase.getSRG("field_189415_e");

	/**
	 * <p>
	 * Name: DISPENSER_BEHAVIOR
	 * </p>
	 */
	public static McObfPair field_96605_cw = McMappingDatabase.getSRG("field_96605_cw");

}

package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemArmor$ArmorMaterial {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agv$a";
		else
			return "net/minecraft/item/ItemArmor$ArmorMaterial";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agv$a";
		else
			return "ItemArmor$ArmorMaterial";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagv$a;";
		else
			return "Lnet/minecraft/item/ItemArmor$ArmorMaterial;";
	}

	/**
	 * <p>
	 * Name: getSoundEvent
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_185017_b = McMappingDatabase.getSRG("ItemArmor$ArmorMaterial.func_185017_b");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_179243_f = McMappingDatabase.getSRG("field_179243_f");

	/**
	 * <p>
	 * Name: getRepairItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_151685_b = McMappingDatabase.getSRG("ItemArmor$ArmorMaterial.func_151685_b");

	/**
	 * <p>
	 * Name: soundEvent
	 * </p>
	 */
	public static McObfPair field_185020_j = McMappingDatabase.getSRG("field_185020_j");

	/**
	 * <p>
	 * Name: maxDamageFactor
	 * </p>
	 */
	public static McObfPair field_78048_f = McMappingDatabase.getSRG("field_78048_f");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_179242_c = McMappingDatabase.getSRG("ItemArmor$ArmorMaterial.func_179242_c");

	/**
	 * <p>
	 * Name: getEnchantability
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_78045_a = McMappingDatabase.getSRG("ItemArmor$ArmorMaterial.func_78045_a");

	/**
	 * <p>
	 * Name: damageReductionAmountArray
	 * </p>
	 */
	public static McObfPair field_78049_g = McMappingDatabase.getSRG("field_78049_g");

	/**
	 * <p>
	 * Name: getToughness
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_189416_e = McMappingDatabase.getSRG("ItemArmor$ArmorMaterial.func_189416_e");

	/**
	 * <p>
	 * Name: toughness
	 * </p>
	 */
	public static McObfPair field_189417_k = McMappingDatabase.getSRG("field_189417_k");

	/**
	 * <p>
	 * Name: getDurability
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;)I]
	 * </p>
	 */
	public static McObfPair func_78046_a = McMappingDatabase.getSRG("ItemArmor$ArmorMaterial.func_78046_a");

	/**
	 * <p>
	 * Name: getDamageReductionAmount
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;)I]
	 * </p>
	 */
	public static McObfPair func_78044_b = McMappingDatabase.getSRG("ItemArmor$ArmorMaterial.func_78044_b");

	/**
	 * <p>
	 * Name: enchantability
	 * </p>
	 */
	public static McObfPair field_78055_h = McMappingDatabase.getSRG("field_78055_h");

}

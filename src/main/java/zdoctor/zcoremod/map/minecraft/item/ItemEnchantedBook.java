package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemEnchantedBook {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahy";
		else
			return "net/minecraft/item/ItemEnchantedBook";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahy";
		else
			return "ItemEnchantedBook";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lahy;";
		else
			return "Lnet/minecraft/item/ItemEnchantedBook;";
	}

	/**
	 * <p>
	 * Name: getEnchantments
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/nbt/NBTTagList;]
	 * </p>
	 */
	public static McObfPair func_92110_g = McMappingDatabase.getSRG("ItemEnchantedBook.func_92110_g");

	/**
	 * <p>
	 * Name: getEnchantedItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/EnchantmentData;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_92111_a = McMappingDatabase.getSRG("ItemEnchantedBook.func_92111_a");

	/**
	 * <p>
	 * Name: getRarity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/EnumRarity;]
	 * </p>
	 */
	public static McObfPair func_77613_e = McMappingDatabase.getSRG("ItemEnchantedBook.func_77613_e");

	/**
	 * <p>
	 * Name: isEnchantable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_77616_k = McMappingDatabase.getSRG("ItemEnchantedBook.func_77616_k");

	/**
	 * <p>
	 * Name: addEnchantment
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/enchantment/EnchantmentData;)V]
	 * </p>
	 */
	public static McObfPair func_92115_a = McMappingDatabase.getSRG("ItemEnchantedBook.func_92115_a");

	/**
	 * <p>
	 * Name: getSubItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_150895_a = McMappingDatabase.getSRG("ItemEnchantedBook.func_150895_a");

	/**
	 * <p>
	 * Name: addInformation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Ljava/util/List;Lnet/minecraft/client/util/ITooltipFlag;)V]
	 * </p>
	 */
	public static McObfPair func_77624_a = McMappingDatabase.getSRG("ItemEnchantedBook.func_77624_a");

	/**
	 * <p>
	 * Name: hasEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_77636_d = McMappingDatabase.getSRG("ItemEnchantedBook.func_77636_d");

}

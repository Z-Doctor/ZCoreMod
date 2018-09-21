package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemAppleGold {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aik";
		else
			return "net/minecraft/item/ItemAppleGold";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aik";
		else
			return "ItemAppleGold";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laik;";
		else
			return "Lnet/minecraft/item/ItemAppleGold;";
	}

	/**
	 * <p>
	 * Name: getSubItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_150895_a = McMappingDatabase.getSRG("ItemAppleGold.func_150895_a");

	/**
	 * <p>
	 * Name: onFoodEaten
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_77849_c = McMappingDatabase.getSRG("ItemAppleGold.func_77849_c");

	/**
	 * <p>
	 * Name: getRarity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/EnumRarity;]
	 * </p>
	 */
	public static McObfPair func_77613_e = McMappingDatabase.getSRG("ItemAppleGold.func_77613_e");

	/**
	 * <p>
	 * Name: hasEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_77636_d = McMappingDatabase.getSRG("ItemAppleGold.func_77636_d");

}

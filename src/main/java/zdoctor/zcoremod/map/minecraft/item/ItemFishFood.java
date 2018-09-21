package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemFishFood {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aig";
		else
			return "net/minecraft/item/ItemFishFood";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aig";
		else
			return "ItemFishFood";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laig;";
		else
			return "Lnet/minecraft/item/ItemFishFood;";
	}

	/**
	 * <p>
	 * Name: cooked
	 * </p>
	 */
	public static McObfPair field_150907_b = McMappingDatabase.getSRG("field_150907_b");

	/**
	 * <p>
	 * Name: getSaturationModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)F]
	 * </p>
	 */
	public static McObfPair func_150906_h = McMappingDatabase.getSRG("ItemFishFood.func_150906_h");

	/**
	 * <p>
	 * Name: onFoodEaten
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_77849_c = McMappingDatabase.getSRG("ItemFishFood.func_77849_c");

	/**
	 * <p>
	 * Name: getSubItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_150895_a = McMappingDatabase.getSRG("ItemFishFood.func_150895_a");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77667_c = McMappingDatabase.getSRG("ItemFishFood.func_77667_c");

	/**
	 * <p>
	 * Name: getHealAmount
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_150905_g = McMappingDatabase.getSRG("ItemFishFood.func_150905_g");

}

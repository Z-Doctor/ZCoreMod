package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemBanner {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agz";
		else
			return "net/minecraft/item/ItemBanner";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agz";
		else
			return "ItemBanner";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagz;";
		else
			return "Lnet/minecraft/item/ItemBanner;";
	}

	/**
	 * <p>
	 * Name: getItemStackDisplayName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77653_i = McMappingDatabase.getSRG("ItemBanner.func_77653_i");

	/**
	 * <p>
	 * Name: onItemUse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_180614_a = McMappingDatabase.getSRG("ItemBanner.func_180614_a");

	/**
	 * <p>
	 * Name: getBaseColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/EnumDyeColor;]
	 * </p>
	 */
	public static McObfPair func_179225_h = McMappingDatabase.getSRG("ItemBanner.func_179225_h");

	/**
	 * <p>
	 * Name: addInformation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Ljava/util/List;Lnet/minecraft/client/util/ITooltipFlag;)V]
	 * </p>
	 */
	public static McObfPair func_77624_a = McMappingDatabase.getSRG("ItemBanner.func_77624_a");

	/**
	 * <p>
	 * Name: getSubItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_150895_a = McMappingDatabase.getSRG("ItemBanner.func_150895_a");

	/**
	 * <p>
	 * Name: makeBanner
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/EnumDyeColor;Lnet/minecraft/nbt/NBTTagList;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190910_a = McMappingDatabase.getSRG("ItemBanner.func_190910_a");

	/**
	 * <p>
	 * Name: appendHoverTextFromTileEntityTag
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_185054_a = McMappingDatabase.getSRG("ItemBanner.func_185054_a");

	/**
	 * <p>
	 * Name: getCreativeTab
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/creativetab/CreativeTabs;]
	 * </p>
	 */
	public static McObfPair func_77640_w = McMappingDatabase.getSRG("ItemBanner.func_77640_w");

}

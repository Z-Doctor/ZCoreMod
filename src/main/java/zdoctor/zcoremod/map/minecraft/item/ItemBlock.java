package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemBlock {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahb";
		else
			return "net/minecraft/item/ItemBlock";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahb";
		else
			return "ItemBlock";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lahb;";
		else
			return "Lnet/minecraft/item/ItemBlock;";
	}

	/**
	 * <p>
	 * Name: getSubItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_150895_a = McMappingDatabase.getSRG("ItemBlock.func_150895_a");

	/**
	 * <p>
	 * Name: onItemUse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_180614_a = McMappingDatabase.getSRG("ItemBlock.func_180614_a");

	/**
	 * <p>
	 * Name: getBlock
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_179223_d = McMappingDatabase.getSRG("ItemBlock.func_179223_d");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77658_a = McMappingDatabase.getSRG("ItemBlock.func_77658_a");

	/**
	 * <p>
	 * Name: setTileEntityNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_179224_a = McMappingDatabase.getSRG("ItemBlock.func_179224_a");

	/**
	 * <p>
	 * Name: addInformation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Ljava/util/List;Lnet/minecraft/client/util/ITooltipFlag;)V]
	 * </p>
	 */
	public static McObfPair func_77624_a = McMappingDatabase.getSRG("ItemBlock.func_77624_a");

	/**
	 * <p>
	 * Name: canPlaceBlockOnSide
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_179222_a = McMappingDatabase.getSRG("ItemBlock.func_179222_a");

	/**
	 * <p>
	 * Name: getCreativeTab
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/creativetab/CreativeTabs;]
	 * </p>
	 */
	public static McObfPair func_77640_w = McMappingDatabase.getSRG("ItemBlock.func_77640_w");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77667_c = McMappingDatabase.getSRG("ItemBlock.func_77667_c");

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_150939_a = McMappingDatabase.getSRG("field_150939_a");

}

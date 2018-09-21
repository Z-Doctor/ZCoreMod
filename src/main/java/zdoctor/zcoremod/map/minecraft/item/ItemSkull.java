package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemSkull {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajr";
		else
			return "net/minecraft/item/ItemSkull";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajr";
		else
			return "ItemSkull";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lajr;";
		else
			return "Lnet/minecraft/item/ItemSkull;";
	}

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77667_c = McMappingDatabase.getSRG("ItemSkull.func_77667_c");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77647_b = McMappingDatabase.getSRG("ItemSkull.func_77647_b");

	/**
	 * <p>
	 * Name: onItemUse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_180614_a = McMappingDatabase.getSRG("ItemSkull.func_180614_a");

	/**
	 * <p>
	 * Name: getItemStackDisplayName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77653_i = McMappingDatabase.getSRG("ItemSkull.func_77653_i");

	/**
	 * <p>
	 * Name: SKULL_TYPES
	 * </p>
	 */
	public static McObfPair field_82807_a = McMappingDatabase.getSRG("field_82807_a");

	/**
	 * <p>
	 * Name: getSubItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_150895_a = McMappingDatabase.getSRG("ItemSkull.func_150895_a");

	/**
	 * <p>
	 * Name: updateItemStackNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Z]
	 * </p>
	 */
	public static McObfPair func_179215_a = McMappingDatabase.getSRG("ItemSkull.func_179215_a");

}

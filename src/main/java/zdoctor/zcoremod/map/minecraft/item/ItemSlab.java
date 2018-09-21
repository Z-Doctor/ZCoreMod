package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemSlab {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajs";
		else
			return "net/minecraft/item/ItemSlab";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajs";
		else
			return "ItemSlab";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lajs;";
		else
			return "Lnet/minecraft/item/ItemSlab;";
	}

	/**
	 * <p>
	 * Name: onItemUse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_180614_a = McMappingDatabase.getSRG("ItemSlab.func_180614_a");

	/**
	 * <p>
	 * Name: tryPlace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/lang/Object;)Z]
	 * </p>
	 */
	public static McObfPair func_180615_a = McMappingDatabase.getSRG("ItemSlab.func_180615_a");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77647_b = McMappingDatabase.getSRG("ItemSlab.func_77647_b");

	/**
	 * <p>
	 * Name: singleSlab
	 * </p>
	 */
	public static McObfPair field_150949_c = McMappingDatabase.getSRG("field_150949_c");

	/**
	 * <p>
	 * Name: doubleSlab
	 * </p>
	 */
	public static McObfPair field_179226_c = McMappingDatabase.getSRG("field_179226_c");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77667_c = McMappingDatabase.getSRG("ItemSlab.func_77667_c");

	/**
	 * <p>
	 * Name: canPlaceBlockOnSide
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_179222_a = McMappingDatabase.getSRG("ItemSlab.func_179222_a");

	/**
	 * <p>
	 * Name: makeState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/properties/IProperty;Ljava/lang/Comparable;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185055_a = McMappingDatabase.getSRG("ItemSlab.func_185055_a");

}

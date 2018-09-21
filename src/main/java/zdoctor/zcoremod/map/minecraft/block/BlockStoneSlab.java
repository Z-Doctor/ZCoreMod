package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStoneSlab {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "auk";
		else
			return "net/minecraft/block/BlockStoneSlab";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "auk";
		else
			return "BlockStoneSlab";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lauk;";
		else
			return "Lnet/minecraft/block/BlockStoneSlab;";
	}

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150002_b = McMappingDatabase.getSRG("BlockStoneSlab.func_150002_b");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockStoneSlab.func_180661_e");

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_185473_a = McMappingDatabase.getSRG("BlockStoneSlab.func_185473_a");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockStoneSlab.func_176201_c");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockStoneSlab.func_176203_a");

	/**
	 * <p>
	 * Name: getTypeForItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/Comparable;]
	 * </p>
	 */
	public static McObfPair func_185674_a = McMappingDatabase.getSRG("BlockStoneSlab.func_185674_a");

	/**
	 * <p>
	 * Name: VARIANT
	 * </p>
	 */
	public static McObfPair field_176556_M = McMappingDatabase.getSRG("field_176556_M");

	/**
	 * <p>
	 * Name: SEAMLESS
	 * </p>
	 */
	public static McObfPair field_176555_b = McMappingDatabase.getSRG("field_176555_b");

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_180659_g = McMappingDatabase.getSRG("BlockStoneSlab.func_180659_g");

	/**
	 * <p>
	 * Name: getVariantProperty
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/properties/IProperty;]
	 * </p>
	 */
	public static McObfPair func_176551_l = McMappingDatabase.getSRG("BlockStoneSlab.func_176551_l");

	/**
	 * <p>
	 * Name: damageDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_180651_a = McMappingDatabase.getSRG("BlockStoneSlab.func_180651_a");

	/**
	 * <p>
	 * Name: getSubBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_149666_a = McMappingDatabase.getSRG("BlockStoneSlab.func_149666_a");

	/**
	 * <p>
	 * Name: getItemDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_180660_a = McMappingDatabase.getSRG("BlockStoneSlab.func_180660_a");

}

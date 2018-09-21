package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockTallGrass {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aun";
		else
			return "net/minecraft/block/BlockTallGrass";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aun";
		else
			return "BlockTallGrass";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laun;";
		else
			return "Lnet/minecraft/block/BlockTallGrass;";
	}

	/**
	 * <p>
	 * Name: harvestBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/tileentity/TileEntity;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_180657_a = McMappingDatabase.getSRG("BlockTallGrass.func_180657_a");

	/**
	 * <p>
	 * Name: canBlockStay
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_180671_f = McMappingDatabase.getSRG("BlockTallGrass.func_180671_f");

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_185473_a = McMappingDatabase.getSRG("BlockTallGrass.func_185473_a");

	/**
	 * <p>
	 * Name: isReplaceable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176200_f = McMappingDatabase.getSRG("BlockTallGrass.func_176200_f");

	/**
	 * <p>
	 * Name: grow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176474_b = McMappingDatabase.getSRG("BlockTallGrass.func_176474_b");

	/**
	 * <p>
	 * Name: TALL_GRASS_AABB
	 * </p>
	 */
	public static McObfPair field_185522_c = McMappingDatabase.getSRG("field_185522_c");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockTallGrass.func_176201_c");

	/**
	 * <p>
	 * Name: canUseBonemeal
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_180670_a = McMappingDatabase.getSRG("BlockTallGrass.func_180670_a");

	/**
	 * <p>
	 * Name: TYPE
	 * </p>
	 */
	public static McObfPair field_176497_a = McMappingDatabase.getSRG("field_176497_a");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockTallGrass.func_176203_a");

	/**
	 * <p>
	 * Name: canGrow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Z)Z]
	 * </p>
	 */
	public static McObfPair func_176473_a = McMappingDatabase.getSRG("BlockTallGrass.func_176473_a");

	/**
	 * <p>
	 * Name: quantityDroppedWithBonus
	 * </p>
	 * <p>
	 * Desc: [(ILjava/util/Random;)I]
	 * </p>
	 */
	public static McObfPair func_149679_a = McMappingDatabase.getSRG("BlockTallGrass.func_149679_a");

	/**
	 * <p>
	 * Name: getItemDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_180660_a = McMappingDatabase.getSRG("BlockTallGrass.func_180660_a");

	/**
	 * <p>
	 * Name: getOffsetType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/Block$EnumOffsetType;]
	 * </p>
	 */
	public static McObfPair func_176218_Q = McMappingDatabase.getSRG("BlockTallGrass.func_176218_Q");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockTallGrass.func_185496_a");

	/**
	 * <p>
	 * Name: getSubBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_149666_a = McMappingDatabase.getSRG("BlockTallGrass.func_149666_a");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockTallGrass.func_180661_e");

}

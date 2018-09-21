package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockDoublePlant {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqb";
		else
			return "net/minecraft/block/BlockDoublePlant";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqb";
		else
			return "BlockDoublePlant";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laqb;";
		else
			return "Lnet/minecraft/block/BlockDoublePlant;";
	}

	/**
	 * <p>
	 * Name: harvestBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/tileentity/TileEntity;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_180657_a = McMappingDatabase.getSRG("BlockDoublePlant.func_180657_a");

	/**
	 * <p>
	 * Name: FACING
	 * </p>
	 */
	public static McObfPair field_181084_N = McMappingDatabase.getSRG("field_181084_N");

	/**
	 * <p>
	 * Name: placeAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockDoublePlant$EnumPlantType;I)V]
	 * </p>
	 */
	public static McObfPair func_176491_a = McMappingDatabase.getSRG("BlockDoublePlant.func_176491_a");

	/**
	 * <p>
	 * Name: checkAndDropBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176475_e = McMappingDatabase.getSRG("BlockDoublePlant.func_176475_e");

	/**
	 * <p>
	 * Name: HALF
	 * </p>
	 */
	public static McObfPair field_176492_b = McMappingDatabase.getSRG("field_176492_b");

	/**
	 * <p>
	 * Name: getItemDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_180660_a = McMappingDatabase.getSRG("BlockDoublePlant.func_180660_a");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/block/BlockDoublePlant$EnumPlantType;]
	 * </p>
	 */
	public static McObfPair func_185517_a = McMappingDatabase.getSRG("BlockDoublePlant.func_185517_a");

	/**
	 * <p>
	 * Name: VARIANT
	 * </p>
	 */
	public static McObfPair field_176493_a = McMappingDatabase.getSRG("field_176493_a");

	/**
	 * <p>
	 * Name: getOffsetType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/Block$EnumOffsetType;]
	 * </p>
	 */
	public static McObfPair func_176218_Q = McMappingDatabase.getSRG("BlockDoublePlant.func_176218_Q");

	/**
	 * <p>
	 * Name: canBlockStay
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_180671_f = McMappingDatabase.getSRG("BlockDoublePlant.func_180671_f");

	/**
	 * <p>
	 * Name: damageDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_180651_a = McMappingDatabase.getSRG("BlockDoublePlant.func_180651_a");

	/**
	 * <p>
	 * Name: onBlockPlacedBy
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_180633_a = McMappingDatabase.getSRG("BlockDoublePlant.func_180633_a");

	/**
	 * <p>
	 * Name: canPlaceBlockAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176196_c = McMappingDatabase.getSRG("BlockDoublePlant.func_176196_c");

	/**
	 * <p>
	 * Name: canUseBonemeal
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_180670_a = McMappingDatabase.getSRG("BlockDoublePlant.func_180670_a");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockDoublePlant.func_185496_a");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockDoublePlant.func_180661_e");

	/**
	 * <p>
	 * Name: onBlockHarvested
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_176208_a = McMappingDatabase.getSRG("BlockDoublePlant.func_176208_a");

	/**
	 * <p>
	 * Name: getActualState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176221_a = McMappingDatabase.getSRG("BlockDoublePlant.func_176221_a");

	/**
	 * <p>
	 * Name: isReplaceable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176200_f = McMappingDatabase.getSRG("BlockDoublePlant.func_176200_f");

	/**
	 * <p>
	 * Name: getSubBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_149666_a = McMappingDatabase.getSRG("BlockDoublePlant.func_149666_a");

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_185473_a = McMappingDatabase.getSRG("BlockDoublePlant.func_185473_a");

	/**
	 * <p>
	 * Name: canGrow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Z)Z]
	 * </p>
	 */
	public static McObfPair func_176473_a = McMappingDatabase.getSRG("BlockDoublePlant.func_176473_a");

	/**
	 * <p>
	 * Name: grow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176474_b = McMappingDatabase.getSRG("BlockDoublePlant.func_176474_b");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockDoublePlant.func_176201_c");

	/**
	 * <p>
	 * Name: onHarvest
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_176489_b = McMappingDatabase.getSRG("BlockDoublePlant.func_176489_b");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockDoublePlant.func_176203_a");

}

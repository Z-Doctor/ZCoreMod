package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockRedstoneComparator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "app";
		else
			return "net/minecraft/block/BlockRedstoneComparator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "app";
		else
			return "BlockRedstoneComparator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lapp;";
		else
			return "Lnet/minecraft/block/BlockRedstoneComparator;";
	}

	/**
	 * <p>
	 * Name: POWERED
	 * </p>
	 */
	public static McObfPair field_176464_a = McMappingDatabase.getSRG("field_176464_a");

	/**
	 * <p>
	 * Name: getPoweredState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180674_e = McMappingDatabase.getSRG("BlockRedstoneComparator.func_180674_e");

	/**
	 * <p>
	 * Name: eventReceived
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;II)Z]
	 * </p>
	 */
	public static McObfPair func_189539_a = McMappingDatabase.getSRG("BlockRedstoneComparator.func_189539_a");

	/**
	 * <p>
	 * Name: withRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Rotation;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185499_a = McMappingDatabase.getSRG("BlockRedstoneComparator.func_185499_a");

	/**
	 * <p>
	 * Name: shouldBePowered
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_176404_e = McMappingDatabase.getSRG("BlockRedstoneComparator.func_176404_e");

	/**
	 * <p>
	 * Name: getStateFromMeta
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176203_a = McMappingDatabase.getSRG("BlockRedstoneComparator.func_176203_a");

	/**
	 * <p>
	 * Name: withMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/Mirror;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_185471_a = McMappingDatabase.getSRG("BlockRedstoneComparator.func_185471_a");

	/**
	 * <p>
	 * Name: updateTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180650_b = McMappingDatabase.getSRG("BlockRedstoneComparator.func_180650_b");

	/**
	 * <p>
	 * Name: breakBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_180663_b = McMappingDatabase.getSRG("BlockRedstoneComparator.func_180663_b");

	/**
	 * <p>
	 * Name: findItemFrame
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/entity/item/EntityItemFrame;]
	 * </p>
	 */
	public static McObfPair func_176461_a = McMappingDatabase.getSRG("BlockRedstoneComparator.func_176461_a");

	/**
	 * <p>
	 * Name: onBlockAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176213_c = McMappingDatabase.getSRG("BlockRedstoneComparator.func_176213_c");

	/**
	 * <p>
	 * Name: onStateChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176462_k = McMappingDatabase.getSRG("BlockRedstoneComparator.func_176462_k");

	/**
	 * <p>
	 * Name: isPowered
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_176406_l = McMappingDatabase.getSRG("BlockRedstoneComparator.func_176406_l");

	/**
	 * <p>
	 * Name: getUnpoweredState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180675_k = McMappingDatabase.getSRG("BlockRedstoneComparator.func_180675_k");

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_185473_a = McMappingDatabase.getSRG("BlockRedstoneComparator.func_185473_a");

	/**
	 * <p>
	 * Name: updateState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_176398_g = McMappingDatabase.getSRG("BlockRedstoneComparator.func_176398_g");

	/**
	 * <p>
	 * Name: calculateOutput
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176460_j = McMappingDatabase.getSRG("BlockRedstoneComparator.func_176460_j");

	/**
	 * <p>
	 * Name: getItemDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_180660_a = McMappingDatabase.getSRG("BlockRedstoneComparator.func_180660_a");

	/**
	 * <p>
	 * Name: createNewTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;I)Lnet/minecraft/tileentity/TileEntity;]
	 * </p>
	 */
	public static McObfPair func_149915_a = McMappingDatabase.getSRG("BlockRedstoneComparator.func_149915_a");

	/**
	 * <p>
	 * Name: createBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_180661_e = McMappingDatabase.getSRG("BlockRedstoneComparator.func_180661_e");

	/**
	 * <p>
	 * Name: getActiveSignal
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176408_a = McMappingDatabase.getSRG("BlockRedstoneComparator.func_176408_a");

	/**
	 * <p>
	 * Name: getLocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_149732_F = McMappingDatabase.getSRG("BlockRedstoneComparator.func_149732_F");

	/**
	 * <p>
	 * Name: getDelay
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176403_d = McMappingDatabase.getSRG("BlockRedstoneComparator.func_176403_d");

	/**
	 * <p>
	 * Name: MODE
	 * </p>
	 */
	public static McObfPair field_176463_b = McMappingDatabase.getSRG("field_176463_b");

	/**
	 * <p>
	 * Name: getStateForPlacement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFFILnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180642_a = McMappingDatabase.getSRG("BlockRedstoneComparator.func_180642_a");

	/**
	 * <p>
	 * Name: getMetaFromState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176201_c = McMappingDatabase.getSRG("BlockRedstoneComparator.func_176201_c");

	/**
	 * <p>
	 * Name: onBlockActivated
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Z]
	 * </p>
	 */
	public static McObfPair func_180639_a = McMappingDatabase.getSRG("BlockRedstoneComparator.func_180639_a");

	/**
	 * <p>
	 * Name: calculateInputStrength
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176397_f = McMappingDatabase.getSRG("BlockRedstoneComparator.func_176397_f");

}

package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityPiston {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awm";
		else
			return "net/minecraft/tileentity/TileEntityPiston";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awm";
		else
			return "TileEntityPiston";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawm;";
		else
			return "Lnet/minecraft/tileentity/TileEntityPiston;";
	}

	/**
	 * <p>
	 * Name: shouldHeadBeRendered
	 * </p>
	 */
	public static McObfPair field_145872_l = McMappingDatabase.getSRG("field_145872_l");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("TileEntityPiston.func_73660_a");

	/**
	 * <p>
	 * Name: isExtending
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145868_b = McMappingDatabase.getSRG("TileEntityPiston.func_145868_b");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityPiston.func_145839_a");

	/**
	 * <p>
	 * Name: getMinMaxPiecesAABB
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_191515_a = McMappingDatabase.getSRG("TileEntityPiston.func_191515_a");

	/**
	 * <p>
	 * Name: MOVING_ENTITY
	 * </p>
	 */
	public static McObfPair field_190613_i = McMappingDatabase.getSRG("field_190613_i");

	/**
	 * <p>
	 * Name: registerFixesPiston
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189685_a = McMappingDatabase.getSRG("TileEntityPiston.func_189685_a");

	/**
	 * <p>
	 * Name: getCollisionRelatedBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_190606_j = McMappingDatabase.getSRG("TileEntityPiston.func_190606_j");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityPiston.func_189515_b");

	/**
	 * <p>
	 * Name: getBlockMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_145832_p = McMappingDatabase.getSRG("TileEntityPiston.func_145832_p");

	/**
	 * <p>
	 * Name: getExtendedProgress
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_184320_e = McMappingDatabase.getSRG("TileEntityPiston.func_184320_e");

	/**
	 * <p>
	 * Name: getAABB
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;F)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_184319_a = McMappingDatabase.getSRG("TileEntityPiston.func_184319_a");

	/**
	 * <p>
	 * Name: moveByPositionAndProgress
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_190607_a = McMappingDatabase.getSRG("TileEntityPiston.func_190607_a");

	/**
	 * <p>
	 * Name: addCollissionAABBs
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_190609_a = McMappingDatabase.getSRG("TileEntityPiston.func_190609_a");

	/**
	 * <p>
	 * Name: clearPistonTileEntity
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145866_f = McMappingDatabase.getSRG("TileEntityPiston.func_145866_f");

	/**
	 * <p>
	 * Name: getDeltaX
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/AxisAlignedBB;)D]
	 * </p>
	 */
	public static McObfPair func_190611_b = McMappingDatabase.getSRG("TileEntityPiston.func_190611_b");

	/**
	 * <p>
	 * Name: getMovementArea
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;Lnet/minecraft/util/EnumFacing;D)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_190610_a = McMappingDatabase.getSRG("TileEntityPiston.func_190610_a");

	/**
	 * <p>
	 * Name: fixEntityWithinPistonBase
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/EnumFacing;D)V]
	 * </p>
	 */
	public static McObfPair func_190605_a = McMappingDatabase.getSRG("TileEntityPiston.func_190605_a");

	/**
	 * <p>
	 * Name: lastProgress
	 * </p>
	 */
	public static McObfPair field_145870_n = McMappingDatabase.getSRG("field_145870_n");

	/**
	 * <p>
	 * Name: getOffsetX
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_174929_b = McMappingDatabase.getSRG("TileEntityPiston.func_174929_b");

	/**
	 * <p>
	 * Name: pistonState
	 * </p>
	 */
	public static McObfPair field_174932_a = McMappingDatabase.getSRG("field_174932_a");

	/**
	 * <p>
	 * Name: moveCollidedEntities
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_184322_i = McMappingDatabase.getSRG("TileEntityPiston.func_184322_i");

	/**
	 * <p>
	 * Name: getAABB
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_184321_a = McMappingDatabase.getSRG("TileEntityPiston.func_184321_a");

	/**
	 * <p>
	 * Name: getOffsetZ
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_174926_d = McMappingDatabase.getSRG("TileEntityPiston.func_174926_d");

	/**
	 * <p>
	 * Name: extending
	 * </p>
	 */
	public static McObfPair field_145875_k = McMappingDatabase.getSRG("field_145875_k");

	/**
	 * <p>
	 * Name: getPistonState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_174927_b = McMappingDatabase.getSRG("TileEntityPiston.func_174927_b");

	/**
	 * <p>
	 * Name: progress
	 * </p>
	 */
	public static McObfPair field_145873_m = McMappingDatabase.getSRG("field_145873_m");

	/**
	 * <p>
	 * Name: shouldPistonHeadBeRendered
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145867_d = McMappingDatabase.getSRG("TileEntityPiston.func_145867_d");

	/**
	 * <p>
	 * Name: getOffsetY
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_174928_c = McMappingDatabase.getSRG("TileEntityPiston.func_174928_c");

	/**
	 * <p>
	 * Name: getDeltaZ
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/AxisAlignedBB;)D]
	 * </p>
	 */
	public static McObfPair func_190604_d = McMappingDatabase.getSRG("TileEntityPiston.func_190604_d");

	/**
	 * <p>
	 * Name: getFacing
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_174930_e = McMappingDatabase.getSRG("TileEntityPiston.func_174930_e");

	/**
	 * <p>
	 * Name: pistonFacing
	 * </p>
	 */
	public static McObfPair field_174931_f = McMappingDatabase.getSRG("field_174931_f");

	/**
	 * <p>
	 * Name: getProgress
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_145860_a = McMappingDatabase.getSRG("TileEntityPiston.func_145860_a");

	/**
	 * <p>
	 * Name: getMovement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/AxisAlignedBB;)D]
	 * </p>
	 */
	public static McObfPair func_190612_a = McMappingDatabase.getSRG("TileEntityPiston.func_190612_a");

	/**
	 * <p>
	 * Name: getUpdateTag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189517_E_ = McMappingDatabase.getSRG("TileEntityPiston.func_189517_E_");

	/**
	 * <p>
	 * Name: getDeltaY
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/math/AxisAlignedBB;)D]
	 * </p>
	 */
	public static McObfPair func_190608_c = McMappingDatabase.getSRG("TileEntityPiston.func_190608_c");

}

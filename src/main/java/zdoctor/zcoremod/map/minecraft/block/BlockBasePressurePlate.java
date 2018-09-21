package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockBasePressurePlate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aor";
		else
			return "net/minecraft/block/BlockBasePressurePlate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aor";
		else
			return "BlockBasePressurePlate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laor;";
		else
			return "Lnet/minecraft/block/BlockBasePressurePlate;";
	}

	/**
	 * <p>
	 * Name: getCollisionBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_180646_a = McMappingDatabase.getSRG("BlockBasePressurePlate.func_180646_a");

	/**
	 * <p>
	 * Name: neighborChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_189540_a = McMappingDatabase.getSRG("BlockBasePressurePlate.func_189540_a");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_185496_a = McMappingDatabase.getSRG("BlockBasePressurePlate.func_185496_a");

	/**
	 * <p>
	 * Name: computeRedstoneStrength
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_180669_e = McMappingDatabase.getSRG("BlockBasePressurePlate.func_180669_e");

	/**
	 * <p>
	 * Name: UNPRESSED_AABB
	 * </p>
	 */
	public static McObfPair field_185510_b = McMappingDatabase.getSRG("field_185510_b");

	/**
	 * <p>
	 * Name: updateState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V]
	 * </p>
	 */
	public static McObfPair func_180666_a = McMappingDatabase.getSRG("BlockBasePressurePlate.func_180666_a");

	/**
	 * <p>
	 * Name: setRedstoneStrength
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176575_a = McMappingDatabase.getSRG("BlockBasePressurePlate.func_176575_a");

	/**
	 * <p>
	 * Name: tickRate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)I]
	 * </p>
	 */
	public static McObfPair func_149738_a = McMappingDatabase.getSRG("BlockBasePressurePlate.func_149738_a");

	/**
	 * <p>
	 * Name: breakBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_180663_b = McMappingDatabase.getSRG("BlockBasePressurePlate.func_180663_b");

	/**
	 * <p>
	 * Name: updateNeighbors
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_176578_d = McMappingDatabase.getSRG("BlockBasePressurePlate.func_176578_d");

	/**
	 * <p>
	 * Name: getWeakPower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_180656_a = McMappingDatabase.getSRG("BlockBasePressurePlate.func_180656_a");

	/**
	 * <p>
	 * Name: randomTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180645_a = McMappingDatabase.getSRG("BlockBasePressurePlate.func_180645_a");

	/**
	 * <p>
	 * Name: getMobilityFlag
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/block/material/EnumPushReaction;]
	 * </p>
	 */
	public static McObfPair func_149656_h = McMappingDatabase.getSRG("BlockBasePressurePlate.func_149656_h");

	/**
	 * <p>
	 * Name: canPlaceBlockAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176196_c = McMappingDatabase.getSRG("BlockBasePressurePlate.func_176196_c");

	/**
	 * <p>
	 * Name: isFullCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149686_d = McMappingDatabase.getSRG("BlockBasePressurePlate.func_149686_d");

	/**
	 * <p>
	 * Name: onEntityCollidedWithBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_180634_a = McMappingDatabase.getSRG("BlockBasePressurePlate.func_180634_a");

	/**
	 * <p>
	 * Name: getStrongPower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_176211_b = McMappingDatabase.getSRG("BlockBasePressurePlate.func_176211_b");

	/**
	 * <p>
	 * Name: getBlockFaceShape
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/state/BlockFaceShape;]
	 * </p>
	 */
	public static McObfPair func_193383_a = McMappingDatabase.getSRG("BlockBasePressurePlate.func_193383_a");

	/**
	 * <p>
	 * Name: isPassable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176205_b = McMappingDatabase.getSRG("BlockBasePressurePlate.func_176205_b");

	/**
	 * <p>
	 * Name: playClickOffSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_185508_c = McMappingDatabase.getSRG("BlockBasePressurePlate.func_185508_c");

	/**
	 * <p>
	 * Name: isOpaqueCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149662_c = McMappingDatabase.getSRG("BlockBasePressurePlate.func_149662_c");

	/**
	 * <p>
	 * Name: canBePlacedOn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176577_m = McMappingDatabase.getSRG("BlockBasePressurePlate.func_176577_m");

	/**
	 * <p>
	 * Name: canSpawnInBlock
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_181623_g = McMappingDatabase.getSRG("BlockBasePressurePlate.func_181623_g");

	/**
	 * <p>
	 * Name: updateTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_180650_b = McMappingDatabase.getSRG("BlockBasePressurePlate.func_180650_b");

	/**
	 * <p>
	 * Name: PRESSURE_AABB
	 * </p>
	 */
	public static McObfPair field_185511_c = McMappingDatabase.getSRG("field_185511_c");

	/**
	 * <p>
	 * Name: canProvidePower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_149744_f = McMappingDatabase.getSRG("BlockBasePressurePlate.func_149744_f");

	/**
	 * <p>
	 * Name: PRESSED_AABB
	 * </p>
	 */
	public static McObfPair field_185509_a = McMappingDatabase.getSRG("field_185509_a");

	/**
	 * <p>
	 * Name: playClickOnSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_185507_b = McMappingDatabase.getSRG("BlockBasePressurePlate.func_185507_b");

	/**
	 * <p>
	 * Name: getRedstoneStrength
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_176576_e = McMappingDatabase.getSRG("BlockBasePressurePlate.func_176576_e");

}

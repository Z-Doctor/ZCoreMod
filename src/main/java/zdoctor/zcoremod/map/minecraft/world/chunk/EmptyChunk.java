package zdoctor.zcoremod.map.minecraft.world.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EmptyChunk {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axt";
		else
			return "net/minecraft/world/chunk/EmptyChunk";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axt";
		else
			return "EmptyChunk";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxt;";
		else
			return "Lnet/minecraft/world/chunk/EmptyChunk;";
	}

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_177435_g = McMappingDatabase.getSRG("EmptyChunk.func_177435_g");

	/**
	 * <p>
	 * Name: getLightFor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/EnumSkyBlock;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_177413_a = McMappingDatabase.getSRG("EmptyChunk.func_177413_a");

	/**
	 * <p>
	 * Name: removeTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_177425_e = McMappingDatabase.getSRG("EmptyChunk.func_177425_e");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76621_g = McMappingDatabase.getSRG("EmptyChunk.func_76621_g");

	/**
	 * <p>
	 * Name: markDirty
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76630_e = McMappingDatabase.getSRG("EmptyChunk.func_76630_e");

	/**
	 * <p>
	 * Name: getRandomWithSeed
	 * </p>
	 * <p>
	 * Desc: [(J)Ljava/util/Random;]
	 * </p>
	 */
	public static McObfPair func_76617_a = McMappingDatabase.getSRG("EmptyChunk.func_76617_a");

	/**
	 * <p>
	 * Name: canSeeSky
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_177444_d = McMappingDatabase.getSRG("EmptyChunk.func_177444_d");

	/**
	 * <p>
	 * Name: getHeightValue
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_76611_b = McMappingDatabase.getSRG("EmptyChunk.func_76611_b");

	/**
	 * <p>
	 * Name: generateHeightMap
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76590_a = McMappingDatabase.getSRG("EmptyChunk.func_76590_a");

	/**
	 * <p>
	 * Name: isEmptyBetween
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_76606_c = McMappingDatabase.getSRG("EmptyChunk.func_76606_c");

	/**
	 * <p>
	 * Name: removeEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_76622_b = McMappingDatabase.getSRG("EmptyChunk.func_76622_b");

	/**
	 * <p>
	 * Name: isAtLocation
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_76600_a = McMappingDatabase.getSRG("EmptyChunk.func_76600_a");

	/**
	 * <p>
	 * Name: getBlockLightOpacity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_177437_b = McMappingDatabase.getSRG("EmptyChunk.func_177437_b");

	/**
	 * <p>
	 * Name: getLightSubtracted
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;I)I]
	 * </p>
	 */
	public static McObfPair func_177443_a = McMappingDatabase.getSRG("EmptyChunk.func_177443_a");

	/**
	 * <p>
	 * Name: onUnload
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76623_d = McMappingDatabase.getSRG("EmptyChunk.func_76623_d");

	/**
	 * <p>
	 * Name: generateSkylightMap
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76603_b = McMappingDatabase.getSRG("EmptyChunk.func_76603_b");

	/**
	 * <p>
	 * Name: getEntitiesOfTypeWithinAABB
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lcom/google/common/base/Predicate;)V]
	 * </p>
	 */
	public static McObfPair func_177430_a = McMappingDatabase.getSRG("EmptyChunk.func_177430_a");

	/**
	 * <p>
	 * Name: removeEntityAtIndex
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;I)V]
	 * </p>
	 */
	public static McObfPair func_76608_a = McMappingDatabase.getSRG("EmptyChunk.func_76608_a");

	/**
	 * <p>
	 * Name: addTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/tileentity/TileEntity;)V]
	 * </p>
	 */
	public static McObfPair func_177426_a = McMappingDatabase.getSRG("EmptyChunk.func_177426_a");

	/**
	 * <p>
	 * Name: onLoad
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76631_c = McMappingDatabase.getSRG("EmptyChunk.func_76631_c");

	/**
	 * <p>
	 * Name: needsSaving
	 * </p>
	 * <p>
	 * Desc: [(Z)Z]
	 * </p>
	 */
	public static McObfPair func_76601_a = McMappingDatabase.getSRG("EmptyChunk.func_76601_a");

	/**
	 * <p>
	 * Name: addEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_76612_a = McMappingDatabase.getSRG("EmptyChunk.func_76612_a");

	/**
	 * <p>
	 * Name: getTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/chunk/Chunk$EnumCreateEntityType;)Lnet/minecraft/tileentity/TileEntity;]
	 * </p>
	 */
	public static McObfPair func_177424_a = McMappingDatabase.getSRG("EmptyChunk.func_177424_a");

	/**
	 * <p>
	 * Name: getEntitiesWithinAABBForEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lcom/google/common/base/Predicate;)V]
	 * </p>
	 */
	public static McObfPair func_177414_a = McMappingDatabase.getSRG("EmptyChunk.func_177414_a");

	/**
	 * <p>
	 * Name: setLightFor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/EnumSkyBlock;Lnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_177431_a = McMappingDatabase.getSRG("EmptyChunk.func_177431_a");

	/**
	 * <p>
	 * Name: addTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;)V]
	 * </p>
	 */
	public static McObfPair func_150813_a = McMappingDatabase.getSRG("EmptyChunk.func_150813_a");

}

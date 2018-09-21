package zdoctor.zcoremod.map.minecraft.world.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Chunk {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axw";
		else
			return "net/minecraft/world/chunk/Chunk";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axw";
		else
			return "Chunk";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxw;";
		else
			return "Lnet/minecraft/world/chunk/Chunk;";
	}

	/**
	 * <p>
	 * Name: setLightPopulated
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_177421_e = McMappingDatabase.getSRG("Chunk.func_177421_e");

	/**
	 * <p>
	 * Name: NULL_BLOCK_STORAGE
	 * </p>
	 */
	public static McObfPair field_186036_a = McMappingDatabase.getSRG("field_186036_a");

	/**
	 * <p>
	 * Name: storageArrays
	 * </p>
	 */
	public static McObfPair field_76652_q = McMappingDatabase.getSRG("field_76652_q");

	/**
	 * <p>
	 * Name: heightMapMinimum
	 * </p>
	 */
	public static McObfPair field_82912_p = McMappingDatabase.getSRG("field_82912_p");

	/**
	 * <p>
	 * Name: getLastExtendedBlockStorage
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/chunk/storage/ExtendedBlockStorage;]
	 * </p>
	 */
	public static McObfPair func_186031_y = McMappingDatabase.getSRG("Chunk.func_186031_y");

	/**
	 * <p>
	 * Name: getLightSubtracted
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;I)I]
	 * </p>
	 */
	public static McObfPair func_177443_a = McMappingDatabase.getSRG("Chunk.func_177443_a");

	/**
	 * <p>
	 * Name: checkLightSide
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_180700_a = McMappingDatabase.getSRG("Chunk.func_180700_a");

	/**
	 * <p>
	 * Name: getEntityLists
	 * </p>
	 * <p>
	 * Desc: [()[Lnet/minecraft/util/ClassInheritanceMultiMap;]
	 * </p>
	 */
	public static McObfPair func_177429_s = McMappingDatabase.getSRG("Chunk.func_177429_s");

	/**
	 * <p>
	 * Name: getInhabitedTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_177416_w = McMappingDatabase.getSRG("Chunk.func_177416_w");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_76647_h = McMappingDatabase.getSRG("field_76647_h");

	/**
	 * <p>
	 * Name: updateSkylightColumns
	 * </p>
	 */
	public static McObfPair field_76639_c = McMappingDatabase.getSRG("field_76639_c");

	/**
	 * <p>
	 * Name: isEmptyBetween
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_76606_c = McMappingDatabase.getSRG("Chunk.func_76606_c");

	/**
	 * <p>
	 * Name: isAtLocation
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_76600_a = McMappingDatabase.getSRG("Chunk.func_76600_a");

	/**
	 * <p>
	 * Name: getHeightMap
	 * </p>
	 * <p>
	 * Desc: [()[I]
	 * </p>
	 */
	public static McObfPair func_177445_q = McMappingDatabase.getSRG("Chunk.func_177445_q");

	/**
	 * <p>
	 * Name: isLightPopulated
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177423_u = McMappingDatabase.getSRG("Chunk.func_177423_u");

	/**
	 * <p>
	 * Name: setBiomeArray
	 * </p>
	 * <p>
	 * Desc: [([B)V]
	 * </p>
	 */
	public static McObfPair func_76616_a = McMappingDatabase.getSRG("Chunk.func_76616_a");

	/**
	 * <p>
	 * Name: isPopulated
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150802_k = McMappingDatabase.getSRG("Chunk.func_150802_k");

	/**
	 * <p>
	 * Name: getPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/ChunkPos;]
	 * </p>
	 */
	public static McObfPair func_76632_l = McMappingDatabase.getSRG("Chunk.func_76632_l");

	/**
	 * <p>
	 * Name: blockBiomeArray
	 * </p>
	 */
	public static McObfPair field_76651_r = McMappingDatabase.getSRG("field_76651_r");

	/**
	 * <p>
	 * Name: removeEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_76622_b = McMappingDatabase.getSRG("Chunk.func_76622_b");

	/**
	 * <p>
	 * Name: getEntitiesWithinAABBForEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lcom/google/common/base/Predicate;)V]
	 * </p>
	 */
	public static McObfPair func_177414_a = McMappingDatabase.getSRG("Chunk.func_177414_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_150817_t = McMappingDatabase.getSRG("field_150817_t");

	/**
	 * <p>
	 * Name: onUnload
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76623_d = McMappingDatabase.getSRG("Chunk.func_76623_d");

	/**
	 * <p>
	 * Name: generateHeightMap
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76590_a = McMappingDatabase.getSRG("Chunk.func_76590_a");

	/**
	 * <p>
	 * Name: setHasEntities
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_177409_g = McMappingDatabase.getSRG("Chunk.func_177409_g");

	/**
	 * <p>
	 * Name: canSeeSky
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_177444_d = McMappingDatabase.getSRG("Chunk.func_177444_d");

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_177435_g = McMappingDatabase.getSRG("Chunk.func_177435_g");

	/**
	 * <p>
	 * Name: markLoaded
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_177417_c = McMappingDatabase.getSRG("Chunk.func_177417_c");

	/**
	 * <p>
	 * Name: getBlockLightOpacity
	 * </p>
	 * <p>
	 * Desc: [(III)I]
	 * </p>
	 */
	public static McObfPair func_150808_b = McMappingDatabase.getSRG("Chunk.func_150808_b");

	/**
	 * <p>
	 * Name: checkLight
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_150811_f = McMappingDatabase.getSRG("Chunk.func_150811_f");

	/**
	 * <p>
	 * Name: queuedLightChecks
	 * </p>
	 */
	public static McObfPair field_76649_t = McMappingDatabase.getSRG("field_76649_t");

	/**
	 * <p>
	 * Name: getLightFor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/EnumSkyBlock;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_177413_a = McMappingDatabase.getSRG("Chunk.func_177413_a");

	/**
	 * <p>
	 * Name: tileEntityPosQueue
	 * </p>
	 */
	public static McObfPair field_177447_w = McMappingDatabase.getSRG("field_177447_w");

	/**
	 * <p>
	 * Name: isTerrainPopulated
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177419_t = McMappingDatabase.getSRG("Chunk.func_177419_t");

	/**
	 * <p>
	 * Name: getBlockStorageArray
	 * </p>
	 * <p>
	 * Desc: [()[Lnet/minecraft/world/chunk/storage/ExtendedBlockStorage;]
	 * </p>
	 */
	public static McObfPair func_76587_i = McMappingDatabase.getSRG("Chunk.func_76587_i");

	/**
	 * <p>
	 * Name: getWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_177412_p = McMappingDatabase.getSRG("Chunk.func_177412_p");

	/**
	 * <p>
	 * Name: setModified
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_177427_f = McMappingDatabase.getSRG("Chunk.func_177427_f");

	/**
	 * <p>
	 * Name: setStorageArrays
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/world/chunk/storage/ExtendedBlockStorage;)V]
	 * </p>
	 */
	public static McObfPair func_76602_a = McMappingDatabase.getSRG("Chunk.func_76602_a");

	/**
	 * <p>
	 * Name: propagateSkylightOcclusion
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_76595_e = McMappingDatabase.getSRG("Chunk.func_76595_e");

	/**
	 * <p>
	 * Name: precipitationHeightMap
	 * </p>
	 */
	public static McObfPair field_76638_b = McMappingDatabase.getSRG("field_76638_b");

	/**
	 * <p>
	 * Name: getTileEntityMap
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_177434_r = McMappingDatabase.getSRG("Chunk.func_177434_r");

	/**
	 * <p>
	 * Name: loaded
	 * </p>
	 */
	public static McObfPair field_76636_d = McMappingDatabase.getSRG("field_76636_d");

	/**
	 * <p>
	 * Name: onTick
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_150804_b = McMappingDatabase.getSRG("Chunk.func_150804_b");

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [(III)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_186032_a = McMappingDatabase.getSRG("Chunk.func_186032_a");

	/**
	 * <p>
	 * Name: wasTicked
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186035_j = McMappingDatabase.getSRG("Chunk.func_186035_j");

	/**
	 * <p>
	 * Name: isLoaded
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177410_o = McMappingDatabase.getSRG("Chunk.func_177410_o");

	/**
	 * <p>
	 * Name: getTopFilledSegment
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76625_h = McMappingDatabase.getSRG("Chunk.func_76625_h");

	/**
	 * <p>
	 * Name: populate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/IChunkProvider;Lnet/minecraft/world/gen/IChunkGenerator;)V]
	 * </p>
	 */
	public static McObfPair func_186030_a = McMappingDatabase.getSRG("Chunk.func_186030_a");

	/**
	 * <p>
	 * Name: recheckGaps
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_150803_c = McMappingDatabase.getSRG("Chunk.func_150803_c");

	/**
	 * <p>
	 * Name: removeTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_177425_e = McMappingDatabase.getSRG("Chunk.func_177425_e");

	/**
	 * <p>
	 * Name: setSkylightUpdated
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177441_y = McMappingDatabase.getSRG("Chunk.func_177441_y");

	/**
	 * <p>
	 * Name: checkSkylightNeighborHeight
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_76599_g = McMappingDatabase.getSRG("Chunk.func_76599_g");

	/**
	 * <p>
	 * Name: updateSkylightNeighborHeight
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_76609_d = McMappingDatabase.getSRG("Chunk.func_76609_d");

	/**
	 * <p>
	 * Name: getHeightValue
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_76611_b = McMappingDatabase.getSRG("Chunk.func_76611_b");

	/**
	 * <p>
	 * Name: isGapLightingUpdated
	 * </p>
	 */
	public static McObfPair field_76650_s = McMappingDatabase.getSRG("field_76650_s");

	/**
	 * <p>
	 * Name: tileEntities
	 * </p>
	 */
	public static McObfPair field_150816_i = McMappingDatabase.getSRG("field_150816_i");

	/**
	 * <p>
	 * Name: resetRelightChecks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76613_n = McMappingDatabase.getSRG("Chunk.func_76613_n");

	/**
	 * <p>
	 * Name: removeEntityAtIndex
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;I)V]
	 * </p>
	 */
	public static McObfPair func_76608_a = McMappingDatabase.getSRG("Chunk.func_76608_a");

	/**
	 * <p>
	 * Name: lastSaveTime
	 * </p>
	 */
	public static McObfPair field_76641_n = McMappingDatabase.getSRG("field_76641_n");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_76637_e = McMappingDatabase.getSRG("field_76637_e");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;IZ)V]
	 * </p>
	 */
	public static McObfPair func_186033_a = McMappingDatabase.getSRG("Chunk.func_186033_a");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76621_g = McMappingDatabase.getSRG("Chunk.func_76621_g");

	/**
	 * <p>
	 * Name: markDirty
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76630_e = McMappingDatabase.getSRG("Chunk.func_76630_e");

	/**
	 * <p>
	 * Name: setLastSaveTime
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_177432_b = McMappingDatabase.getSRG("Chunk.func_177432_b");

	/**
	 * <p>
	 * Name: enqueueRelightChecks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76594_o = McMappingDatabase.getSRG("Chunk.func_76594_o");

	/**
	 * <p>
	 * Name: unloadQueued
	 * </p>
	 */
	public static McObfPair field_189550_d = McMappingDatabase.getSRG("field_189550_d");

	/**
	 * <p>
	 * Name: getBlockLightOpacity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_177437_b = McMappingDatabase.getSRG("Chunk.func_177437_b");

	/**
	 * <p>
	 * Name: getPrecipitationHeight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177440_h = McMappingDatabase.getSRG("Chunk.func_177440_h");

	/**
	 * <p>
	 * Name: hasEntities
	 * </p>
	 */
	public static McObfPair field_76644_m = McMappingDatabase.getSRG("field_76644_m");

	/**
	 * <p>
	 * Name: getBiome
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/biome/BiomeProvider;)Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_177411_a = McMappingDatabase.getSRG("Chunk.func_177411_a");

	/**
	 * <p>
	 * Name: ticked
	 * </p>
	 */
	public static McObfPair field_150815_m = McMappingDatabase.getSRG("field_150815_m");

	/**
	 * <p>
	 * Name: getHeight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_177433_f = McMappingDatabase.getSRG("Chunk.func_177433_f");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_76635_g = McMappingDatabase.getSRG("field_76635_g");

	/**
	 * <p>
	 * Name: inhabitedTime
	 * </p>
	 */
	public static McObfPair field_111204_q = McMappingDatabase.getSRG("field_111204_q");

	/**
	 * <p>
	 * Name: setLightFor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/EnumSkyBlock;Lnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_177431_a = McMappingDatabase.getSRG("Chunk.func_177431_a");

	/**
	 * <p>
	 * Name: setInhabitedTime
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_177415_c = McMappingDatabase.getSRG("Chunk.func_177415_c");

	/**
	 * <p>
	 * Name: setHeightMap
	 * </p>
	 * <p>
	 * Desc: [([I)V]
	 * </p>
	 */
	public static McObfPair func_177420_a = McMappingDatabase.getSRG("Chunk.func_177420_a");

	/**
	 * <p>
	 * Name: getEntitiesOfTypeWithinAABB
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lcom/google/common/base/Predicate;)V]
	 * </p>
	 */
	public static McObfPair func_177430_a = McMappingDatabase.getSRG("Chunk.func_177430_a");

	/**
	 * <p>
	 * Name: populate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/IChunkGenerator;)V]
	 * </p>
	 */
	public static McObfPair func_186034_a = McMappingDatabase.getSRG("Chunk.func_186034_a");

	/**
	 * <p>
	 * Name: addEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_76612_a = McMappingDatabase.getSRG("Chunk.func_76612_a");

	/**
	 * <p>
	 * Name: setTerrainPopulated
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_177446_d = McMappingDatabase.getSRG("Chunk.func_177446_d");

	/**
	 * <p>
	 * Name: checkLight
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_150809_p = McMappingDatabase.getSRG("Chunk.func_150809_p");

	/**
	 * <p>
	 * Name: getTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/chunk/Chunk$EnumCreateEntityType;)Lnet/minecraft/tileentity/TileEntity;]
	 * </p>
	 */
	public static McObfPair func_177424_a = McMappingDatabase.getSRG("Chunk.func_177424_a");

	/**
	 * <p>
	 * Name: isTerrainPopulated
	 * </p>
	 */
	public static McObfPair field_76646_k = McMappingDatabase.getSRG("field_76646_k");

	/**
	 * <p>
	 * Name: addTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/tileentity/TileEntity;)V]
	 * </p>
	 */
	public static McObfPair func_177426_a = McMappingDatabase.getSRG("Chunk.func_177426_a");

	/**
	 * <p>
	 * Name: setBlockState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_177436_a = McMappingDatabase.getSRG("Chunk.func_177436_a");

	/**
	 * <p>
	 * Name: createNewTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/tileentity/TileEntity;]
	 * </p>
	 */
	public static McObfPair func_177422_i = McMappingDatabase.getSRG("Chunk.func_177422_i");

	/**
	 * <p>
	 * Name: isLightPopulated
	 * </p>
	 */
	public static McObfPair field_150814_l = McMappingDatabase.getSRG("field_150814_l");

	/**
	 * <p>
	 * Name: getLowestHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177442_v = McMappingDatabase.getSRG("Chunk.func_177442_v");

	/**
	 * <p>
	 * Name: heightMap
	 * </p>
	 */
	public static McObfPair field_76634_f = McMappingDatabase.getSRG("field_76634_f");

	/**
	 * <p>
	 * Name: getBiomeArray
	 * </p>
	 * <p>
	 * Desc: [()[B]
	 * </p>
	 */
	public static McObfPair func_76605_m = McMappingDatabase.getSRG("Chunk.func_76605_m");

	/**
	 * <p>
	 * Name: generateSkylightMap
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76603_b = McMappingDatabase.getSRG("Chunk.func_76603_b");

	/**
	 * <p>
	 * Name: entityLists
	 * </p>
	 */
	public static McObfPair field_76645_j = McMappingDatabase.getSRG("field_76645_j");

	/**
	 * <p>
	 * Name: addTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;)V]
	 * </p>
	 */
	public static McObfPair func_150813_a = McMappingDatabase.getSRG("Chunk.func_150813_a");

	/**
	 * <p>
	 * Name: needsSaving
	 * </p>
	 * <p>
	 * Desc: [(Z)Z]
	 * </p>
	 */
	public static McObfPair func_76601_a = McMappingDatabase.getSRG("Chunk.func_76601_a");

	/**
	 * <p>
	 * Name: relightBlock
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_76615_h = McMappingDatabase.getSRG("Chunk.func_76615_h");

	/**
	 * <p>
	 * Name: dirty
	 * </p>
	 */
	public static McObfPair field_76643_l = McMappingDatabase.getSRG("field_76643_l");

	/**
	 * <p>
	 * Name: onLoad
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76631_c = McMappingDatabase.getSRG("Chunk.func_76631_c");

	/**
	 * <p>
	 * Name: getRandomWithSeed
	 * </p>
	 * <p>
	 * Desc: [(J)Ljava/util/Random;]
	 * </p>
	 */
	public static McObfPair func_76617_a = McMappingDatabase.getSRG("Chunk.func_76617_a");

}

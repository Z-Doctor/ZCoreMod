package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class World {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amu";
		else
			return "net/minecraft/world/World";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amu";
		else
			return "World";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamu;";
		else
			return "Lnet/minecraft/world/World;";
	}

	/**
	 * <p>
	 * Name: loadData
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Ljava/lang/String;)Lnet/minecraft/world/storage/WorldSavedData;]
	 * </p>
	 */
	public static McObfPair func_72943_a = McMappingDatabase.getSRG("World.func_72943_a");

	/**
	 * <p>
	 * Name: setBlockToAir
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175698_g = McMappingDatabase.getSRG("World.func_175698_g");

	/**
	 * <p>
	 * Name: getLightBrightness
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)F]
	 * </p>
	 */
	public static McObfPair func_175724_o = McMappingDatabase.getSRG("World.func_175724_o");

	/**
	 * <p>
	 * Name: isInsideWorldBorder
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_191503_g = McMappingDatabase.getSRG("World.func_191503_g");

	/**
	 * <p>
	 * Name: joinEntityInSurroundings
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72897_h = McMappingDatabase.getSRG("World.func_72897_h");

	/**
	 * <p>
	 * Name: scheduledUpdatesAreImmediate
	 * </p>
	 */
	public static McObfPair field_72999_e = McMappingDatabase.getSRG("field_72999_e");

	/**
	 * <p>
	 * Name: scheduleBlockUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;II)V]
	 * </p>
	 */
	public static McObfPair func_180497_b = McMappingDatabase.getSRG("World.func_180497_b");

	/**
	 * <p>
	 * Name: checkSessionLock
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72906_B = McMappingDatabase.getSRG("World.func_72906_B");

	/**
	 * <p>
	 * Name: isRaining
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_72896_J = McMappingDatabase.getSRG("World.func_72896_J");

	/**
	 * <p>
	 * Name: getSkyColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;F)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_72833_a = McMappingDatabase.getSRG("World.func_72833_a");

	/**
	 * <p>
	 * Name: getSunBrightness
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_72971_b = McMappingDatabase.getSRG("World.func_72971_b");

	/**
	 * <p>
	 * Name: isValid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175701_a = McMappingDatabase.getSRG("World.func_175701_a");

	/**
	 * <p>
	 * Name: getMoonPhase
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_72853_d = McMappingDatabase.getSRG("World.func_72853_d");

	/**
	 * <p>
	 * Name: getChunkFromBlockCoords
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_175726_f = McMappingDatabase.getSRG("World.func_175726_f");

	/**
	 * <p>
	 * Name: getGameRules
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameRules;]
	 * </p>
	 */
	public static McObfPair func_82736_K = McMappingDatabase.getSRG("World.func_82736_K");

	/**
	 * <p>
	 * Name: scheduleUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;I)V]
	 * </p>
	 */
	public static McObfPair func_175684_a = McMappingDatabase.getSRG("World.func_175684_a");

	/**
	 * <p>
	 * Name: getCelestialAngle
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_72826_c = McMappingDatabase.getSRG("World.func_72826_c");

	/**
	 * <p>
	 * Name: getGroundAboveSeaLevel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_184141_c = McMappingDatabase.getSRG("World.func_184141_c");

	/**
	 * <p>
	 * Name: entitiesById
	 * </p>
	 */
	public static McObfPair field_175729_l = McMappingDatabase.getSRG("field_175729_l");

	/**
	 * <p>
	 * Name: isChunkLoaded
	 * </p>
	 * <p>
	 * Desc: [(IIZ)Z]
	 * </p>
	 */
	public static McObfPair func_175680_a = McMappingDatabase.getSRG("World.func_175680_a");

	/**
	 * <p>
	 * Name: eventListeners
	 * </p>
	 */
	public static McObfPair field_73021_x = McMappingDatabase.getSRG("field_73021_x");

	/**
	 * <p>
	 * Name: advancementManager
	 * </p>
	 */
	public static McObfPair field_191951_C = McMappingDatabase.getSRG("field_191951_C");

	/**
	 * <p>
	 * Name: rayTraceBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;Z)Lnet/minecraft/util/math/RayTraceResult;]
	 * </p>
	 */
	public static McObfPair func_72901_a = McMappingDatabase.getSRG("World.func_72901_a");

	/**
	 * <p>
	 * Name: isAnyPlayerWithinRangeAt
	 * </p>
	 * <p>
	 * Desc: [(DDDD)Z]
	 * </p>
	 */
	public static McObfPair func_175636_b = McMappingDatabase.getSRG("World.func_175636_b");

	/**
	 * <p>
	 * Name: getPlayerEntityByName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/entity/player/EntityPlayer;]
	 * </p>
	 */
	public static McObfPair func_72924_a = McMappingDatabase.getSRG("World.func_72924_a");

	/**
	 * <p>
	 * Name: playSound
	 * </p>
	 * <p>
	 * Desc: [(DDDLnet/minecraft/util/SoundEvent;Lnet/minecraft/util/SoundCategory;FFZ)V]
	 * </p>
	 */
	public static McObfPair func_184134_a = McMappingDatabase.getSRG("World.func_184134_a");

	/**
	 * <p>
	 * Name: chunkProvider
	 * </p>
	 */
	public static McObfPair field_73020_y = McMappingDatabase.getSRG("field_73020_y");

	/**
	 * <p>
	 * Name: addTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;)Z]
	 * </p>
	 */
	public static McObfPair func_175700_a = McMappingDatabase.getSRG("World.func_175700_a");

	/**
	 * <p>
	 * Name: getHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_72800_K = McMappingDatabase.getSRG("World.func_72800_K");

	/**
	 * <p>
	 * Name: findNearestStructure
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_190528_a = McMappingDatabase.getSRG("World.func_190528_a");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72835_b = McMappingDatabase.getSRG("World.func_72835_b");

	/**
	 * <p>
	 * Name: spawnParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumParticleTypes;ZDDDDDD[I)V]
	 * </p>
	 */
	public static McObfPair func_175682_a = McMappingDatabase.getSRG("World.func_175682_a");

	/**
	 * <p>
	 * Name: getSaveHandler
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/storage/ISaveHandler;]
	 * </p>
	 */
	public static McObfPair func_72860_G = McMappingDatabase.getSRG("World.func_72860_G");

	/**
	 * <p>
	 * Name: getStarBrightness
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_72880_h = McMappingDatabase.getSRG("World.func_72880_h");

	/**
	 * <p>
	 * Name: updateEntityWithOptionalForce
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Z)V]
	 * </p>
	 */
	public static McObfPair func_72866_a = McMappingDatabase.getSRG("World.func_72866_a");

	/**
	 * <p>
	 * Name: tickableTileEntities
	 * </p>
	 */
	public static McObfPair field_175730_i = McMappingDatabase.getSRG("field_175730_i");

	/**
	 * <p>
	 * Name: canBlockFreezeNoWater
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175662_w = McMappingDatabase.getSRG("World.func_175662_w");

	/**
	 * <p>
	 * Name: getRedstonePower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_175651_c = McMappingDatabase.getSRG("World.func_175651_c");

	/**
	 * <p>
	 * Name: getRawLight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/EnumSkyBlock;)I]
	 * </p>
	 */
	public static McObfPair func_175638_a = McMappingDatabase.getSRG("World.func_175638_a");

	/**
	 * <p>
	 * Name: canBlockSeeSky
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175710_j = McMappingDatabase.getSRG("World.func_175710_j");

	/**
	 * <p>
	 * Name: removeEntityDangerously
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72973_f = McMappingDatabase.getSRG("World.func_72973_f");

	/**
	 * <p>
	 * Name: unloadEntities
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Collection;)V]
	 * </p>
	 */
	public static McObfPair func_175681_c = McMappingDatabase.getSRG("World.func_175681_c");

	/**
	 * <p>
	 * Name: notifyNeighborsOfStateExcept
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_175695_a = McMappingDatabase.getSRG("World.func_175695_a");

	/**
	 * <p>
	 * Name: mayPlace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;ZLnet/minecraft/util/EnumFacing;Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_190527_a = McMappingDatabase.getSRG("World.func_190527_a");

	/**
	 * <p>
	 * Name: isBlockIndirectlyGettingPowered
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_175687_A = McMappingDatabase.getSRG("World.func_175687_A");

	/**
	 * <p>
	 * Name: getPlayerEntityByUUID
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayer;]
	 * </p>
	 */
	public static McObfPair func_152378_a = McMappingDatabase.getSRG("World.func_152378_a");

	/**
	 * <p>
	 * Name: getActualHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_72940_L = McMappingDatabase.getSRG("World.func_72940_L");

	/**
	 * <p>
	 * Name: getVillageCollection
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/village/VillageCollection;]
	 * </p>
	 */
	public static McObfPair func_175714_ae = McMappingDatabase.getSRG("World.func_175714_ae");

	/**
	 * <p>
	 * Name: worldScoreboard
	 * </p>
	 */
	public static McObfPair field_96442_D = McMappingDatabase.getSRG("field_96442_D");

	/**
	 * <p>
	 * Name: getEntities
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Lcom/google/common/base/Predicate;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_175644_a = McMappingDatabase.getSRG("World.func_175644_a");

	/**
	 * <p>
	 * Name: isAirBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175623_d = McMappingDatabase.getSRG("World.func_175623_d");

	/**
	 * <p>
	 * Name: isAreaLoaded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;I)Z]
	 * </p>
	 */
	public static McObfPair func_175697_a = McMappingDatabase.getSRG("World.func_175697_a");

	/**
	 * <p>
	 * Name: setLastLightningBolt
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_175702_c = McMappingDatabase.getSRG("World.func_175702_c");

	/**
	 * <p>
	 * Name: getEntitiesWithinAABB
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Lnet/minecraft/util/math/AxisAlignedBB;Lcom/google/common/base/Predicate;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_175647_a = McMappingDatabase.getSRG("World.func_175647_a");

	/**
	 * <p>
	 * Name: rayTraceBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult;]
	 * </p>
	 */
	public static McObfPair func_72933_a = McMappingDatabase.getSRG("World.func_72933_a");

	/**
	 * <p>
	 * Name: worldBorder
	 * </p>
	 */
	public static McObfPair field_175728_M = McMappingDatabase.getSRG("field_175728_M");

	/**
	 * <p>
	 * Name: isSpawnChunk
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_72916_c = McMappingDatabase.getSRG("World.func_72916_c");

	/**
	 * <p>
	 * Name: isBlockTickPending
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)Z]
	 * </p>
	 */
	public static McObfPair func_175691_a = McMappingDatabase.getSRG("World.func_175691_a");

	/**
	 * <p>
	 * Name: observedNeighborChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_190529_b = McMappingDatabase.getSRG("World.func_190529_b");

	/**
	 * <p>
	 * Name: markBlockRangeForRenderUpdate
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_147458_c = McMappingDatabase.getSRG("World.func_147458_c");

	/**
	 * <p>
	 * Name: lootTable
	 * </p>
	 */
	public static McObfPair field_184151_B = McMappingDatabase.getSRG("field_184151_B");

	/**
	 * <p>
	 * Name: isFlammableWithin
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;)Z]
	 * </p>
	 */
	public static McObfPair func_147470_e = McMappingDatabase.getSRG("World.func_147470_e");

	/**
	 * <p>
	 * Name: destroyBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Z)Z]
	 * </p>
	 */
	public static McObfPair func_175655_b = McMappingDatabase.getSRG("World.func_175655_b");

	/**
	 * <p>
	 * Name: setSpawnPoint
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_175652_B = McMappingDatabase.getSRG("World.func_175652_B");

	/**
	 * <p>
	 * Name: removeTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_175713_t = McMappingDatabase.getSRG("World.func_175713_t");

	/**
	 * <p>
	 * Name: getCombinedLight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;I)I]
	 * </p>
	 */
	public static McObfPair func_175626_b = McMappingDatabase.getSRG("World.func_175626_b");

	/**
	 * <p>
	 * Name: profiler
	 * </p>
	 */
	public static McObfPair field_72984_F = McMappingDatabase.getSRG("field_72984_F");

	/**
	 * <p>
	 * Name: rainingStrength
	 * </p>
	 */
	public static McObfPair field_73004_o = McMappingDatabase.getSRG("field_73004_o");

	/**
	 * <p>
	 * Name: getTopSolidOrLiquidBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_175672_r = McMappingDatabase.getSRG("World.func_175672_r");

	/**
	 * <p>
	 * Name: calendar
	 * </p>
	 */
	public static McObfPair field_83016_L = McMappingDatabase.getSRG("field_83016_L");

	/**
	 * <p>
	 * Name: getLightFromNeighborsFor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/EnumSkyBlock;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_175705_a = McMappingDatabase.getSRG("World.func_175705_a");

	/**
	 * <p>
	 * Name: isBlockNormalCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Z)Z]
	 * </p>
	 */
	public static McObfPair func_175677_d = McMappingDatabase.getSRG("World.func_175677_d");

	/**
	 * <p>
	 * Name: notifyNeighborsOfStateChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Z)V]
	 * </p>
	 */
	public static McObfPair func_175685_c = McMappingDatabase.getSRG("World.func_175685_c");

	/**
	 * <p>
	 * Name: isChunkGeneratedAt
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_190526_b = McMappingDatabase.getSRG("World.func_190526_b");

	/**
	 * <p>
	 * Name: notifyLightSet
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_175679_n = McMappingDatabase.getSRG("World.func_175679_n");

	/**
	 * <p>
	 * Name: setAllowedSpawnTypes
	 * </p>
	 * <p>
	 * Desc: [(ZZ)V]
	 * </p>
	 */
	public static McObfPair func_72891_a = McMappingDatabase.getSRG("World.func_72891_a");

	/**
	 * <p>
	 * Name: spawnHostileMobs
	 * </p>
	 */
	public static McObfPair field_72985_G = McMappingDatabase.getSRG("field_72985_G");

	/**
	 * <p>
	 * Name: spawnAlwaysVisibleParticle
	 * </p>
	 * <p>
	 * Desc: [(IDDDDDD[I)V]
	 * </p>
	 */
	public static McObfPair func_190523_a = McMappingDatabase.getSRG("World.func_190523_a");

	/**
	 * <p>
	 * Name: setTotalWorldTime
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_82738_a = McMappingDatabase.getSRG("World.func_82738_a");

	/**
	 * <p>
	 * Name: getCurrentMoonPhaseFactor
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_130001_d = McMappingDatabase.getSRG("World.func_130001_d");

	/**
	 * <p>
	 * Name: prevThunderingStrength
	 * </p>
	 */
	public static McObfPair field_73018_p = McMappingDatabase.getSRG("field_73018_p");

	/**
	 * <p>
	 * Name: getSkylightSubtracted
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_175657_ab = McMappingDatabase.getSRG("World.func_175657_ab");

	/**
	 * <p>
	 * Name: getCloudColour
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_72824_f = McMappingDatabase.getSRG("World.func_72824_f");

	/**
	 * <p>
	 * Name: isUpdateScheduled
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)Z]
	 * </p>
	 */
	public static McObfPair func_184145_b = McMappingDatabase.getSRG("World.func_184145_b");

	/**
	 * <p>
	 * Name: tickPlayers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184147_l = McMappingDatabase.getSRG("World.func_184147_l");

	/**
	 * <p>
	 * Name: notifyNeighborsRespectDebug
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Z)V]
	 * </p>
	 */
	public static McObfPair func_175722_b = McMappingDatabase.getSRG("World.func_175722_b");

	/**
	 * <p>
	 * Name: updateBlocks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147456_g = McMappingDatabase.getSRG("World.func_147456_g");

	/**
	 * <p>
	 * Name: getPendingBlockUpdates
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureBoundingBox;Z)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_175712_a = McMappingDatabase.getSRG("World.func_175712_a");

	/**
	 * <p>
	 * Name: spawnPeacefulMobs
	 * </p>
	 */
	public static McObfPair field_72992_H = McMappingDatabase.getSRG("field_72992_H");

	/**
	 * <p>
	 * Name: seaLevel
	 * </p>
	 */
	public static McObfPair field_181546_a = McMappingDatabase.getSRG("field_181546_a");

	/**
	 * <p>
	 * Name: isAreaLoaded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175707_a = McMappingDatabase.getSRG("World.func_175707_a");

	/**
	 * <p>
	 * Name: isAreaLoaded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;IZ)Z]
	 * </p>
	 */
	public static McObfPair func_175648_a = McMappingDatabase.getSRG("World.func_175648_a");

	/**
	 * <p>
	 * Name: getChunkProvider
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/chunk/IChunkProvider;]
	 * </p>
	 */
	public static McObfPair func_72863_F = McMappingDatabase.getSRG("World.func_72863_F");

	/**
	 * <p>
	 * Name: getLootTableManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/storage/loot/LootTableManager;]
	 * </p>
	 */
	public static McObfPair func_184146_ak = McMappingDatabase.getSRG("World.func_184146_ak");

	/**
	 * <p>
	 * Name: getBiomeProvider
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/biome/BiomeProvider;]
	 * </p>
	 */
	public static McObfPair func_72959_q = McMappingDatabase.getSRG("World.func_72959_q");

	/**
	 * <p>
	 * Name: markBlocksDirtyVertical
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_72975_g = McMappingDatabase.getSRG("World.func_72975_g");

	/**
	 * <p>
	 * Name: markChunkDirty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/tileentity/TileEntity;)V]
	 * </p>
	 */
	public static McObfPair func_175646_b = McMappingDatabase.getSRG("World.func_175646_b");

	/**
	 * <p>
	 * Name: isBlockFullCube
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175665_u = McMappingDatabase.getSRG("World.func_175665_u");

	/**
	 * <p>
	 * Name: worldInfo
	 * </p>
	 */
	public static McObfPair field_72986_A = McMappingDatabase.getSRG("field_72986_A");

	/**
	 * <p>
	 * Name: findingSpawnPoint
	 * </p>
	 */
	public static McObfPair field_72987_B = McMappingDatabase.getSRG("field_72987_B");

	/**
	 * <p>
	 * Name: playSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;DDDLnet/minecraft/util/SoundEvent;Lnet/minecraft/util/SoundCategory;FF)V]
	 * </p>
	 */
	public static McObfPair func_184148_a = McMappingDatabase.getSRG("World.func_184148_a");

	/**
	 * <p>
	 * Name: extinguishFire
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_175719_a = McMappingDatabase.getSRG("World.func_175719_a");

	/**
	 * <p>
	 * Name: neighborChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_190524_a = McMappingDatabase.getSRG("World.func_190524_a");

	/**
	 * <p>
	 * Name: calculateInitialSkylight
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72966_v = McMappingDatabase.getSRG("World.func_72966_v");

	/**
	 * <p>
	 * Name: getRainStrength
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_72867_j = McMappingDatabase.getSRG("World.func_72867_j");

	/**
	 * <p>
	 * Name: setSkylightSubtracted
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_175692_b = McMappingDatabase.getSRG("World.func_175692_b");

	/**
	 * <p>
	 * Name: prevRainingStrength
	 * </p>
	 */
	public static McObfPair field_73003_n = McMappingDatabase.getSRG("field_73003_n");

	/**
	 * <p>
	 * Name: setWorldTime
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_72877_b = McMappingDatabase.getSRG("World.func_72877_b");

	/**
	 * <p>
	 * Name: isDaytime
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_72935_r = McMappingDatabase.getSRG("World.func_72935_r");

	/**
	 * <p>
	 * Name: getCelestialAngleRadians
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_72929_e = McMappingDatabase.getSRG("World.func_72929_e");

	/**
	 * <p>
	 * Name: isBlockLoaded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175667_e = McMappingDatabase.getSRG("World.func_175667_e");

	/**
	 * <p>
	 * Name: getFogColor
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_72948_g = McMappingDatabase.getSRG("World.func_72948_g");

	/**
	 * <p>
	 * Name: processingLoadedTiles
	 * </p>
	 */
	public static McObfPair field_147481_N = McMappingDatabase.getSRG("field_147481_N");

	/**
	 * <p>
	 * Name: checkBlockCollision
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;)Z]
	 * </p>
	 */
	public static McObfPair func_72829_c = McMappingDatabase.getSRG("World.func_72829_c");

	/**
	 * <p>
	 * Name: getMapStorage
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/storage/MapStorage;]
	 * </p>
	 */
	public static McObfPair func_175693_T = McMappingDatabase.getSRG("World.func_175693_T");

	/**
	 * <p>
	 * Name: calculateSkylightSubtracted
	 * </p>
	 * <p>
	 * Desc: [(F)I]
	 * </p>
	 */
	public static McObfPair func_72967_a = McMappingDatabase.getSRG("World.func_72967_a");

	/**
	 * <p>
	 * Name: containsAnyLiquid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;)Z]
	 * </p>
	 */
	public static McObfPair func_72953_d = McMappingDatabase.getSRG("World.func_72953_d");

	/**
	 * <p>
	 * Name: newExplosion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDDFZZ)Lnet/minecraft/world/Explosion;]
	 * </p>
	 */
	public static McObfPair func_72885_a = McMappingDatabase.getSRG("World.func_72885_a");

	/**
	 * <p>
	 * Name: mapStorage
	 * </p>
	 */
	public static McObfPair field_72988_C = McMappingDatabase.getSRG("field_72988_C");

	/**
	 * <p>
	 * Name: thunderingStrength
	 * </p>
	 */
	public static McObfPair field_73017_q = McMappingDatabase.getSRG("field_73017_q");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_175643_b = McMappingDatabase.getSRG("World.func_175643_b");

	/**
	 * <p>
	 * Name: saveHandler
	 * </p>
	 */
	public static McObfPair field_73019_z = McMappingDatabase.getSRG("field_73019_z");

	/**
	 * <p>
	 * Name: countEntities
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;)I]
	 * </p>
	 */
	public static McObfPair func_72907_a = McMappingDatabase.getSRG("World.func_72907_a");

	/**
	 * <p>
	 * Name: isRemote
	 * </p>
	 */
	public static McObfPair field_72995_K = McMappingDatabase.getSRG("field_72995_K");

	/**
	 * <p>
	 * Name: getNearestAttackablePlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;DD)Lnet/minecraft/entity/player/EntityPlayer;]
	 * </p>
	 */
	public static McObfPair func_184139_a = McMappingDatabase.getSRG("World.func_184139_a");

	/**
	 * <p>
	 * Name: updateComparatorOutputLevel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_175666_e = McMappingDatabase.getSRG("World.func_175666_e");

	/**
	 * <p>
	 * Name: setBlockState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)Z]
	 * </p>
	 */
	public static McObfPair func_180501_a = McMappingDatabase.getSRG("World.func_180501_a");

	/**
	 * <p>
	 * Name: loadedTileEntityList
	 * </p>
	 */
	public static McObfPair field_147482_g = McMappingDatabase.getSRG("field_147482_g");

	/**
	 * <p>
	 * Name: setLightFor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/EnumSkyBlock;Lnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_175653_a = McMappingDatabase.getSRG("World.func_175653_a");

	/**
	 * <p>
	 * Name: updateBlockTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;II)V]
	 * </p>
	 */
	public static McObfPair func_175654_a = McMappingDatabase.getSRG("World.func_175654_a");

	/**
	 * <p>
	 * Name: getHorizon
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_72919_O = McMappingDatabase.getSRG("World.func_72919_O");

	/**
	 * <p>
	 * Name: checkLight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175664_x = McMappingDatabase.getSRG("World.func_175664_x");

	/**
	 * <p>
	 * Name: updateEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72870_g = McMappingDatabase.getSRG("World.func_72870_g");

	/**
	 * <p>
	 * Name: tileEntitiesToBeRemoved
	 * </p>
	 */
	public static McObfPair field_147483_b = McMappingDatabase.getSRG("field_147483_b");

	/**
	 * <p>
	 * Name: provider
	 * </p>
	 */
	public static McObfPair field_73011_w = McMappingDatabase.getSRG("field_73011_w");

	/**
	 * <p>
	 * Name: lightUpdateBlockList
	 * </p>
	 */
	public static McObfPair field_72994_J = McMappingDatabase.getSRG("field_72994_J");

	/**
	 * <p>
	 * Name: onEntityRemoved
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72847_b = McMappingDatabase.getSRG("World.func_72847_b");

	/**
	 * <p>
	 * Name: getThunderStrength
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_72819_i = McMappingDatabase.getSRG("World.func_72819_i");

	/**
	 * <p>
	 * Name: unloadedEntityList
	 * </p>
	 */
	public static McObfPair field_72997_g = McMappingDatabase.getSRG("field_72997_g");

	/**
	 * <p>
	 * Name: getLight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_175699_k = McMappingDatabase.getSRG("World.func_175699_k");

	/**
	 * <p>
	 * Name: rayTraceBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;ZZZ)Lnet/minecraft/util/math/RayTraceResult;]
	 * </p>
	 */
	public static McObfPair func_147447_a = McMappingDatabase.getSRG("World.func_147447_a");

	/**
	 * <p>
	 * Name: playMoodSoundAndCheckLight
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/world/chunk/Chunk;)V]
	 * </p>
	 */
	public static McObfPair func_147467_a = McMappingDatabase.getSRG("World.func_147467_a");

	/**
	 * <p>
	 * Name: addTileEntities
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Collection;)V]
	 * </p>
	 */
	public static McObfPair func_147448_a = McMappingDatabase.getSRG("World.func_147448_a");

	/**
	 * <p>
	 * Name: getMinecraftServer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/MinecraftServer;]
	 * </p>
	 */
	public static McObfPair func_73046_m = McMappingDatabase.getSRG("World.func_73046_m");

	/**
	 * <p>
	 * Name: sendPacketToServer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/Packet;)V]
	 * </p>
	 */
	public static McObfPair func_184135_a = McMappingDatabase.getSRG("World.func_184135_a");

	/**
	 * <p>
	 * Name: getWorldType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/WorldType;]
	 * </p>
	 */
	public static McObfPair func_175624_G = McMappingDatabase.getSRG("World.func_175624_G");

	/**
	 * <p>
	 * Name: tickUpdates
	 * </p>
	 * <p>
	 * Desc: [(Z)Z]
	 * </p>
	 */
	public static McObfPair func_72955_a = McMappingDatabase.getSRG("World.func_72955_a");

	/**
	 * <p>
	 * Name: playEvent
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_175718_b = McMappingDatabase.getSRG("World.func_175718_b");

	/**
	 * <p>
	 * Name: collidesWithAnyBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;)Z]
	 * </p>
	 */
	public static McObfPair func_184143_b = McMappingDatabase.getSRG("World.func_184143_b");

	/**
	 * <p>
	 * Name: markTileEntityForRemoval
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;)V]
	 * </p>
	 */
	public static McObfPair func_147457_a = McMappingDatabase.getSRG("World.func_147457_a");

	/**
	 * <p>
	 * Name: isBlockinHighHumidity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180502_D = McMappingDatabase.getSRG("World.func_180502_D");

	/**
	 * <p>
	 * Name: pathListener
	 * </p>
	 */
	public static McObfPair field_184152_t = McMappingDatabase.getSRG("field_184152_t");

	/**
	 * <p>
	 * Name: calculateInitialWeather
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72947_a = McMappingDatabase.getSRG("World.func_72947_a");

	/**
	 * <p>
	 * Name: updateAllPlayersSleepingFlag
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72854_c = McMappingDatabase.getSRG("World.func_72854_c");

	/**
	 * <p>
	 * Name: getPendingBlockUpdates
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;Z)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_72920_a = McMappingDatabase.getSRG("World.func_72920_a");

	/**
	 * <p>
	 * Name: updateLCG
	 * </p>
	 */
	public static McObfPair field_73005_l = McMappingDatabase.getSRG("field_73005_l");

	/**
	 * <p>
	 * Name: sendQuittingDisconnectingPacket
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72882_A = McMappingDatabase.getSRG("World.func_72882_A");

	/**
	 * <p>
	 * Name: getCurrentDate
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Calendar;]
	 * </p>
	 */
	public static McObfPair func_83015_S = McMappingDatabase.getSRG("World.func_83015_S");

	/**
	 * <p>
	 * Name: addEventListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IWorldEventListener;)V]
	 * </p>
	 */
	public static McObfPair func_72954_a = McMappingDatabase.getSRG("World.func_72954_a");

	/**
	 * <p>
	 * Name: createChunkProvider
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/chunk/IChunkProvider;]
	 * </p>
	 */
	public static McObfPair func_72970_h = McMappingDatabase.getSRG("World.func_72970_h");

	/**
	 * <p>
	 * Name: getWorldBorder
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/border/WorldBorder;]
	 * </p>
	 */
	public static McObfPair func_175723_af = McMappingDatabase.getSRG("World.func_175723_af");

	/**
	 * <p>
	 * Name: getDifficulty
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/EnumDifficulty;]
	 * </p>
	 */
	public static McObfPair func_175659_aa = McMappingDatabase.getSRG("World.func_175659_aa");

	/**
	 * <p>
	 * Name: playBroadcastSound
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_175669_a = McMappingDatabase.getSRG("World.func_175669_a");

	/**
	 * <p>
	 * Name: weatherEffects
	 * </p>
	 */
	public static McObfPair field_73007_j = McMappingDatabase.getSRG("field_73007_j");

	/**
	 * <p>
	 * Name: setEntityState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;B)V]
	 * </p>
	 */
	public static McObfPair func_72960_a = McMappingDatabase.getSRG("World.func_72960_a");

	/**
	 * <p>
	 * Name: getChunksLowestHorizon
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_82734_g = McMappingDatabase.getSRG("World.func_82734_g");

	/**
	 * <p>
	 * Name: addedTileEntityList
	 * </p>
	 */
	public static McObfPair field_147484_a = McMappingDatabase.getSRG("field_147484_a");

	/**
	 * <p>
	 * Name: updateWeather
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72979_l = McMappingDatabase.getSRG("World.func_72979_l");

	/**
	 * <p>
	 * Name: getPendingTileEntityAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/tileentity/TileEntity;]
	 * </p>
	 */
	public static McObfPair func_189508_F = McMappingDatabase.getSRG("World.func_189508_F");

	/**
	 * <p>
	 * Name: getClosestPlayer
	 * </p>
	 * <p>
	 * Desc: [(DDDDZ)Lnet/minecraft/entity/player/EntityPlayer;]
	 * </p>
	 */
	public static McObfPair func_184137_a = McMappingDatabase.getSRG("World.func_184137_a");

	/**
	 * <p>
	 * Name: getProviderName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_72827_u = McMappingDatabase.getSRG("World.func_72827_u");

	/**
	 * <p>
	 * Name: isOutsideBuildHeight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_189509_E = McMappingDatabase.getSRG("World.func_189509_E");

	/**
	 * <p>
	 * Name: getClosestPlayerToEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;D)Lnet/minecraft/entity/player/EntityPlayer;]
	 * </p>
	 */
	public static McObfPair func_72890_a = McMappingDatabase.getSRG("World.func_72890_a");

	/**
	 * <p>
	 * Name: findNearestEntityWithinAABB
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Lnet/minecraft/util/math/AxisAlignedBB;Lnet/minecraft/entity/Entity;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_72857_a = McMappingDatabase.getSRG("World.func_72857_a");

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180495_p = McMappingDatabase.getSRG("World.func_180495_p");

	/**
	 * <p>
	 * Name: setRainStrength
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_72894_k = McMappingDatabase.getSRG("World.func_72894_k");

	/**
	 * <p>
	 * Name: loadedEntityList
	 * </p>
	 */
	public static McObfPair field_72996_f = McMappingDatabase.getSRG("field_72996_f");

	/**
	 * <p>
	 * Name: getPrecipitationHeight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_175725_q = McMappingDatabase.getSRG("World.func_175725_q");

	/**
	 * <p>
	 * Name: getPlayers
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Lcom/google/common/base/Predicate;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_175661_b = McMappingDatabase.getSRG("World.func_175661_b");

	/**
	 * <p>
	 * Name: sendBlockBreakProgress
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_175715_c = McMappingDatabase.getSRG("World.func_175715_c");

	/**
	 * <p>
	 * Name: playerEntities
	 * </p>
	 */
	public static McObfPair field_73010_i = McMappingDatabase.getSRG("field_73010_i");

	/**
	 * <p>
	 * Name: getCollisionBoxes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;ZLjava/util/List;)Z]
	 * </p>
	 */
	public static McObfPair func_191504_a = McMappingDatabase.getSRG("World.func_191504_a");

	/**
	 * <p>
	 * Name: isRainingAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175727_C = McMappingDatabase.getSRG("World.func_175727_C");

	/**
	 * <p>
	 * Name: getCollisionBoxes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184144_a = McMappingDatabase.getSRG("World.func_184144_a");

	/**
	 * <p>
	 * Name: getUniqueDataId
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_72841_b = McMappingDatabase.getSRG("World.func_72841_b");

	/**
	 * <p>
	 * Name: addWorldInfoToCrashReport
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/crash/CrashReport;)Lnet/minecraft/crash/CrashReportCategory;]
	 * </p>
	 */
	public static McObfPair func_72914_a = McMappingDatabase.getSRG("World.func_72914_a");

	/**
	 * <p>
	 * Name: canSeeSky
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175678_i = McMappingDatabase.getSRG("World.func_175678_i");

	/**
	 * <p>
	 * Name: immediateBlockTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_189507_a = McMappingDatabase.getSRG("World.func_189507_a");

	/**
	 * <p>
	 * Name: notifyBlockUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/block/state/IBlockState;I)V]
	 * </p>
	 */
	public static McObfPair func_184138_a = McMappingDatabase.getSRG("World.func_184138_a");

	/**
	 * <p>
	 * Name: isMaterialInBB
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;Lnet/minecraft/block/material/Material;)Z]
	 * </p>
	 */
	public static McObfPair func_72875_a = McMappingDatabase.getSRG("World.func_72875_a");

	/**
	 * <p>
	 * Name: loadEntities
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Collection;)V]
	 * </p>
	 */
	public static McObfPair func_175650_b = McMappingDatabase.getSRG("World.func_175650_b");

	/**
	 * <p>
	 * Name: removeEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72900_e = McMappingDatabase.getSRG("World.func_72900_e");

	/**
	 * <p>
	 * Name: isThundering
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_72911_I = McMappingDatabase.getSRG("World.func_72911_I");

	/**
	 * <p>
	 * Name: lastLightningBolt
	 * </p>
	 */
	public static McObfPair field_73016_r = McMappingDatabase.getSRG("field_73016_r");

	/**
	 * <p>
	 * Name: updateEntities
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72939_s = McMappingDatabase.getSRG("World.func_72939_s");

	/**
	 * <p>
	 * Name: makeFireworks
	 * </p>
	 * <p>
	 * Desc: [(DDDDDDLnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_92088_a = McMappingDatabase.getSRG("World.func_92088_a");

	/**
	 * <p>
	 * Name: updateObservingBlocksAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_190522_c = McMappingDatabase.getSRG("World.func_190522_c");

	/**
	 * <p>
	 * Name: onEntityAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72923_a = McMappingDatabase.getSRG("World.func_72923_a");

	/**
	 * <p>
	 * Name: removeEventListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IWorldEventListener;)V]
	 * </p>
	 */
	public static McObfPair func_72848_b = McMappingDatabase.getSRG("World.func_72848_b");

	/**
	 * <p>
	 * Name: spawnParticle
	 * </p>
	 * <p>
	 * Desc: [(IZDDDDDD[I)V]
	 * </p>
	 */
	public static McObfPair func_175720_a = McMappingDatabase.getSRG("World.func_175720_a");

	/**
	 * <p>
	 * Name: getStrongPower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_175676_y = McMappingDatabase.getSRG("World.func_175676_y");

	/**
	 * <p>
	 * Name: checkNoEntityCollision
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;)Z]
	 * </p>
	 */
	public static McObfPair func_72855_b = McMappingDatabase.getSRG("World.func_72855_b");

	/**
	 * <p>
	 * Name: setSeaLevel
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_181544_b = McMappingDatabase.getSRG("World.func_181544_b");

	/**
	 * <p>
	 * Name: getLight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Z)I]
	 * </p>
	 */
	public static McObfPair func_175721_c = McMappingDatabase.getSRG("World.func_175721_c");

	/**
	 * <p>
	 * Name: getNearestAttackablePlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DD)Lnet/minecraft/entity/player/EntityPlayer;]
	 * </p>
	 */
	public static McObfPair func_184142_a = McMappingDatabase.getSRG("World.func_184142_a");

	/**
	 * <p>
	 * Name: addWeatherEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_72942_c = McMappingDatabase.getSRG("World.func_72942_c");

	/**
	 * <p>
	 * Name: getHeight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_175645_m = McMappingDatabase.getSRG("World.func_175645_m");

	/**
	 * <p>
	 * Name: createExplosion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDDFZ)Lnet/minecraft/world/Explosion;]
	 * </p>
	 */
	public static McObfPair func_72876_a = McMappingDatabase.getSRG("World.func_72876_a");

	/**
	 * <p>
	 * Name: getClosestPlayer
	 * </p>
	 * <p>
	 * Desc: [(DDDDLcom/google/common/base/Predicate;)Lnet/minecraft/entity/player/EntityPlayer;]
	 * </p>
	 */
	public static McObfPair func_190525_a = McMappingDatabase.getSRG("World.func_190525_a");

	/**
	 * <p>
	 * Name: setRandomSeed
	 * </p>
	 * <p>
	 * Desc: [(III)Ljava/util/Random;]
	 * </p>
	 */
	public static McObfPair func_72843_D = McMappingDatabase.getSRG("World.func_72843_D");

	/**
	 * <p>
	 * Name: initialize
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldSettings;)V]
	 * </p>
	 */
	public static McObfPair func_72963_a = McMappingDatabase.getSRG("World.func_72963_a");

	/**
	 * <p>
	 * Name: setInitialSpawnLocation
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72974_f = McMappingDatabase.getSRG("World.func_72974_f");

	/**
	 * <p>
	 * Name: setTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/tileentity/TileEntity;)V]
	 * </p>
	 */
	public static McObfPair func_175690_a = McMappingDatabase.getSRG("World.func_175690_a");

	/**
	 * <p>
	 * Name: functionManager
	 * </p>
	 */
	public static McObfPair field_193036_D = McMappingDatabase.getSRG("field_193036_D");

	/**
	 * <p>
	 * Name: playRecord
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/SoundEvent;)V]
	 * </p>
	 */
	public static McObfPair func_184149_a = McMappingDatabase.getSRG("World.func_184149_a");

	/**
	 * <p>
	 * Name: getLightFromNeighbors
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_175671_l = McMappingDatabase.getSRG("World.func_175671_l");

	/**
	 * <p>
	 * Name: getNearestAttackablePlayer
	 * </p>
	 * <p>
	 * Desc: [(DDDDDLcom/google/common/base/Function;Lcom/google/common/base/Predicate;)Lnet/minecraft/entity/player/EntityPlayer;]
	 * </p>
	 */
	public static McObfPair func_184150_a = McMappingDatabase.getSRG("World.func_184150_a");

	/**
	 * <p>
	 * Name: getHeight
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_189649_b = McMappingDatabase.getSRG("World.func_189649_b");

	/**
	 * <p>
	 * Name: getChunkFromChunkCoords
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_72964_e = McMappingDatabase.getSRG("World.func_72964_e");

	/**
	 * <p>
	 * Name: spawnParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumParticleTypes;DDDDDD[I)V]
	 * </p>
	 */
	public static McObfPair func_175688_a = McMappingDatabase.getSRG("World.func_175688_a");

	/**
	 * <p>
	 * Name: checkNoEntityCollision
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_72917_a = McMappingDatabase.getSRG("World.func_72917_a");

	/**
	 * <p>
	 * Name: getSeed
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_72905_C = McMappingDatabase.getSRG("World.func_72905_C");

	/**
	 * <p>
	 * Name: getWorldTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_72820_D = McMappingDatabase.getSRG("World.func_72820_D");

	/**
	 * <p>
	 * Name: isBlockModifiable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175660_a = McMappingDatabase.getSRG("World.func_175660_a");

	/**
	 * <p>
	 * Name: getTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/tileentity/TileEntity;]
	 * </p>
	 */
	public static McObfPair func_175625_s = McMappingDatabase.getSRG("World.func_175625_s");

	/**
	 * <p>
	 * Name: playEvent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_180498_a = McMappingDatabase.getSRG("World.func_180498_a");

	/**
	 * <p>
	 * Name: getDebugLoadedEntities
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_72981_t = McMappingDatabase.getSRG("World.func_72981_t");

	/**
	 * <p>
	 * Name: villageCollection
	 * </p>
	 */
	public static McObfPair field_72982_D = McMappingDatabase.getSRG("field_72982_D");

	/**
	 * <p>
	 * Name: getEntitiesWithinAABBExcludingEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_72839_b = McMappingDatabase.getSRG("World.func_72839_b");

	/**
	 * <p>
	 * Name: isAreaLoaded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureBoundingBox;Z)Z]
	 * </p>
	 */
	public static McObfPair func_175639_b = McMappingDatabase.getSRG("World.func_175639_b");

	/**
	 * <p>
	 * Name: getTotalWorldTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_82737_E = McMappingDatabase.getSRG("World.func_82737_E");

	/**
	 * <p>
	 * Name: isAreaLoaded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_175711_a = McMappingDatabase.getSRG("World.func_175711_a");

	/**
	 * <p>
	 * Name: handleMaterialAcceleration
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;Lnet/minecraft/block/material/Material;Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_72918_a = McMappingDatabase.getSRG("World.func_72918_a");

	/**
	 * <p>
	 * Name: setThunderStrength
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_147442_i = McMappingDatabase.getSRG("World.func_147442_i");

	/**
	 * <p>
	 * Name: getEntitiesInAABBexcluding
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;Lcom/google/common/base/Predicate;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_175674_a = McMappingDatabase.getSRG("World.func_175674_a");

	/**
	 * <p>
	 * Name: getLightFor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/EnumSkyBlock;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_175642_b = McMappingDatabase.getSRG("World.func_175642_b");

	/**
	 * <p>
	 * Name: getNearestPlayerNotCreative
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;D)Lnet/minecraft/entity/player/EntityPlayer;]
	 * </p>
	 */
	public static McObfPair func_184136_b = McMappingDatabase.getSRG("World.func_184136_b");

	/**
	 * <p>
	 * Name: getDifficultyForLocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/world/DifficultyInstance;]
	 * </p>
	 */
	public static McObfPair func_175649_E = McMappingDatabase.getSRG("World.func_175649_E");

	/**
	 * <p>
	 * Name: DIST_HASH_MAGIC
	 * </p>
	 */
	public static McObfPair field_73006_m = McMappingDatabase.getSRG("field_73006_m");

	/**
	 * <p>
	 * Name: getBiome
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_180494_b = McMappingDatabase.getSRG("World.func_180494_b");

	/**
	 * <p>
	 * Name: spawnEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_72838_d = McMappingDatabase.getSRG("World.func_72838_d");

	/**
	 * <p>
	 * Name: setData
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/world/storage/WorldSavedData;)V]
	 * </p>
	 */
	public static McObfPair func_72823_a = McMappingDatabase.getSRG("World.func_72823_a");

	/**
	 * <p>
	 * Name: getWorldInfo
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/storage/WorldInfo;]
	 * </p>
	 */
	public static McObfPair func_72912_H = McMappingDatabase.getSRG("World.func_72912_H");

	/**
	 * <p>
	 * Name: playSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/SoundEvent;Lnet/minecraft/util/SoundCategory;FF)V]
	 * </p>
	 */
	public static McObfPair func_184133_a = McMappingDatabase.getSRG("World.func_184133_a");

	/**
	 * <p>
	 * Name: getSeaLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_181545_F = McMappingDatabase.getSRG("World.func_181545_F");

	/**
	 * <p>
	 * Name: getEntityByID
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_73045_a = McMappingDatabase.getSRG("World.func_73045_a");

	/**
	 * <p>
	 * Name: getScoreboard
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/Scoreboard;]
	 * </p>
	 */
	public static McObfPair func_96441_U = McMappingDatabase.getSRG("World.func_96441_U");

	/**
	 * <p>
	 * Name: getBlockDensity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/AxisAlignedBB;)F]
	 * </p>
	 */
	public static McObfPair func_72842_a = McMappingDatabase.getSRG("World.func_72842_a");

	/**
	 * <p>
	 * Name: canBlockFreezeWater
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175675_v = McMappingDatabase.getSRG("World.func_175675_v");

	/**
	 * <p>
	 * Name: skylightSubtracted
	 * </p>
	 */
	public static McObfPair field_73008_k = McMappingDatabase.getSRG("field_73008_k");

	/**
	 * <p>
	 * Name: canSnowAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Z)Z]
	 * </p>
	 */
	public static McObfPair func_175708_f = McMappingDatabase.getSRG("World.func_175708_f");

	/**
	 * <p>
	 * Name: isBlockPowered
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175640_z = McMappingDatabase.getSRG("World.func_175640_z");

	/**
	 * <p>
	 * Name: canBlockFreeze
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Z)Z]
	 * </p>
	 */
	public static McObfPair func_175670_e = McMappingDatabase.getSRG("World.func_175670_e");

	/**
	 * <p>
	 * Name: setBlockState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_175656_a = McMappingDatabase.getSRG("World.func_175656_a");

	/**
	 * <p>
	 * Name: markBlockRangeForRenderUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_175704_b = McMappingDatabase.getSRG("World.func_175704_b");

	/**
	 * <p>
	 * Name: checkLightFor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/EnumSkyBlock;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180500_c = McMappingDatabase.getSRG("World.func_180500_c");

	/**
	 * <p>
	 * Name: isBlockLoaded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Z)Z]
	 * </p>
	 */
	public static McObfPair func_175668_a = McMappingDatabase.getSRG("World.func_175668_a");

	/**
	 * <p>
	 * Name: getStrongPower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_175627_a = McMappingDatabase.getSRG("World.func_175627_a");

	/**
	 * <p>
	 * Name: addBlockEvent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;II)V]
	 * </p>
	 */
	public static McObfPair func_175641_c = McMappingDatabase.getSRG("World.func_175641_c");

	/**
	 * <p>
	 * Name: getLastLightningBolt
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_175658_ac = McMappingDatabase.getSRG("World.func_175658_ac");

	/**
	 * <p>
	 * Name: isAreaLoaded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;Z)Z]
	 * </p>
	 */
	public static McObfPair func_175706_a = McMappingDatabase.getSRG("World.func_175706_a");

	/**
	 * <p>
	 * Name: isAreaLoaded
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIZ)Z]
	 * </p>
	 */
	public static McObfPair func_175663_a = McMappingDatabase.getSRG("World.func_175663_a");

	/**
	 * <p>
	 * Name: getEntitiesWithinAABB
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_72872_a = McMappingDatabase.getSRG("World.func_72872_a");

	/**
	 * <p>
	 * Name: cloudColour
	 * </p>
	 */
	public static McObfPair field_73001_c = McMappingDatabase.getSRG("field_73001_c");

	/**
	 * <p>
	 * Name: getLoadedEntityList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_72910_y = McMappingDatabase.getSRG("World.func_72910_y");

	/**
	 * <p>
	 * Name: isSidePowered
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_175709_b = McMappingDatabase.getSRG("World.func_175709_b");

	/**
	 * <p>
	 * Name: getSpawnPoint
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_175694_M = McMappingDatabase.getSRG("World.func_175694_M");

	/**
	 * <p>
	 * Name: rand
	 * </p>
	 */
	public static McObfPair field_73012_v = McMappingDatabase.getSRG("field_73012_v");

	/**
	 * <p>
	 * Name: isWater
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175696_F = McMappingDatabase.getSRG("World.func_175696_F");

}

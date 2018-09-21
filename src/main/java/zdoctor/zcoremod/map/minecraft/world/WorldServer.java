package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oo";
		else
			return "net/minecraft/world/WorldServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oo";
		else
			return "WorldServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Loo;";
		else
			return "Lnet/minecraft/world/WorldServer;";
	}

	/**
	 * <p>
	 * Name: setInitialSpawnLocation
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72974_f = McMappingDatabase.getSRG("WorldServer.func_72974_f");

	/**
	 * <p>
	 * Name: isCallingFromMinecraftThread
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_152345_ab = McMappingDatabase.getSRG("WorldServer.func_152345_ab");

	/**
	 * <p>
	 * Name: flushToDisk
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_104140_m = McMappingDatabase.getSRG("WorldServer.func_104140_m");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_175643_b = McMappingDatabase.getSRG("WorldServer.func_175643_b");

	/**
	 * <p>
	 * Name: addWeatherEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_72942_c = McMappingDatabase.getSRG("WorldServer.func_72942_c");

	/**
	 * <p>
	 * Name: canAddEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_184165_i = McMappingDatabase.getSRG("WorldServer.func_184165_i");

	/**
	 * <p>
	 * Name: createBonusChest
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73047_i = McMappingDatabase.getSRG("WorldServer.func_73047_i");

	/**
	 * <p>
	 * Name: isChunkLoaded
	 * </p>
	 * <p>
	 * Desc: [(IIZ)Z]
	 * </p>
	 */
	public static McObfPair func_175680_a = McMappingDatabase.getSRG("WorldServer.func_175680_a");

	/**
	 * <p>
	 * Name: initialize
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldSettings;)V]
	 * </p>
	 */
	public static McObfPair func_72963_a = McMappingDatabase.getSRG("WorldServer.func_72963_a");

	/**
	 * <p>
	 * Name: wakeAllPlayers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73053_d = McMappingDatabase.getSRG("WorldServer.func_73053_d");

	/**
	 * <p>
	 * Name: canSpawnAnimals
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175735_ai = McMappingDatabase.getSRG("WorldServer.func_175735_ai");

	/**
	 * <p>
	 * Name: createSpawnPosition
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldSettings;)V]
	 * </p>
	 */
	public static McObfPair func_73052_b = McMappingDatabase.getSRG("WorldServer.func_73052_b");

	/**
	 * <p>
	 * Name: saveLevel
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73042_a = McMappingDatabase.getSRG("WorldServer.func_73042_a");

	/**
	 * <p>
	 * Name: getDefaultTeleporter
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/Teleporter;]
	 * </p>
	 */
	public static McObfPair func_85176_s = McMappingDatabase.getSRG("WorldServer.func_85176_s");

	/**
	 * <p>
	 * Name: canSpawnNPCs
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175738_ah = McMappingDatabase.getSRG("WorldServer.func_175738_ah");

	/**
	 * <p>
	 * Name: mcServer
	 * </p>
	 */
	public static McObfPair field_73061_a = McMappingDatabase.getSRG("field_73061_a");

	/**
	 * <p>
	 * Name: pendingTickListEntriesHashSet
	 * </p>
	 */
	public static McObfPair field_73064_N = McMappingDatabase.getSRG("field_73064_N");

	/**
	 * <p>
	 * Name: allPlayersSleeping
	 * </p>
	 */
	public static McObfPair field_73068_P = McMappingDatabase.getSRG("field_73068_P");

	/**
	 * <p>
	 * Name: setDebugWorldSettings
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175737_aj = McMappingDatabase.getSRG("WorldServer.func_175737_aj");

	/**
	 * <p>
	 * Name: getStructureTemplateManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/gen/structure/template/TemplateManager;]
	 * </p>
	 */
	public static McObfPair func_184163_y = McMappingDatabase.getSRG("WorldServer.func_184163_y");

	/**
	 * <p>
	 * Name: sendQueuedBlockEvents
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147488_Z = McMappingDatabase.getSRG("WorldServer.func_147488_Z");

	/**
	 * <p>
	 * Name: getSpawnCoordinate
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180504_m = McMappingDatabase.getSRG("WorldServer.func_180504_m");

	/**
	 * <p>
	 * Name: getAdvancementManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/advancements/AdvancementManager;]
	 * </p>
	 */
	public static McObfPair func_191952_z = McMappingDatabase.getSRG("WorldServer.func_191952_z");

	/**
	 * <p>
	 * Name: pendingTickListEntriesTreeSet
	 * </p>
	 */
	public static McObfPair field_73065_O = McMappingDatabase.getSRG("field_73065_O");

	/**
	 * <p>
	 * Name: flush
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73041_k = McMappingDatabase.getSRG("WorldServer.func_73041_k");

	/**
	 * <p>
	 * Name: getEntityTracker
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EntityTracker;]
	 * </p>
	 */
	public static McObfPair func_73039_n = McMappingDatabase.getSRG("WorldServer.func_73039_n");

	/**
	 * <p>
	 * Name: sendPacketWithinDistance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;ZDDDLnet/minecraft/network/Packet;)V]
	 * </p>
	 */
	public static McObfPair func_184159_a = McMappingDatabase.getSRG("WorldServer.func_184159_a");

	/**
	 * <p>
	 * Name: isUpdateScheduled
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)Z]
	 * </p>
	 */
	public static McObfPair func_184145_b = McMappingDatabase.getSRG("WorldServer.func_184145_b");

	/**
	 * <p>
	 * Name: saveAllChunks
	 * </p>
	 * <p>
	 * Desc: [(ZLnet/minecraft/util/IProgressUpdate;)V]
	 * </p>
	 */
	public static McObfPair func_73044_a = McMappingDatabase.getSRG("WorldServer.func_73044_a");

	/**
	 * <p>
	 * Name: onEntityAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72923_a = McMappingDatabase.getSRG("WorldServer.func_72923_a");

	/**
	 * <p>
	 * Name: spawnEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_72838_d = McMappingDatabase.getSRG("WorldServer.func_72838_d");

	/**
	 * <p>
	 * Name: resetUpdateEntityTick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_82742_i = McMappingDatabase.getSRG("WorldServer.func_82742_i");

	/**
	 * <p>
	 * Name: tickUpdates
	 * </p>
	 * <p>
	 * Desc: [(Z)Z]
	 * </p>
	 */
	public static McObfPair func_72955_a = McMappingDatabase.getSRG("WorldServer.func_72955_a");

	/**
	 * <p>
	 * Name: updateWeather
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72979_l = McMappingDatabase.getSRG("WorldServer.func_72979_l");

	/**
	 * <p>
	 * Name: playerChunkMap
	 * </p>
	 */
	public static McObfPair field_73063_M = McMappingDatabase.getSRG("field_73063_M");

	/**
	 * <p>
	 * Name: villageSiege
	 * </p>
	 */
	public static McObfPair field_175740_d = McMappingDatabase.getSRG("field_175740_d");

	/**
	 * <p>
	 * Name: getFunctionManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/advancements/FunctionManager;]
	 * </p>
	 */
	public static McObfPair func_193037_A = McMappingDatabase.getSRG("WorldServer.func_193037_A");

	/**
	 * <p>
	 * Name: getChunkProvider
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/chunk/IChunkProvider;, ()Lnet/minecraft/world/gen/ChunkProviderServer;]
	 * </p>
	 */
	public static McObfPair func_72863_F = McMappingDatabase.getSRG("WorldServer.func_72863_F");

	/**
	 * <p>
	 * Name: blockEventQueue
	 * </p>
	 */
	public static McObfPair field_147490_S = McMappingDatabase.getSRG("field_147490_S");

	/**
	 * <p>
	 * Name: getPendingBlockUpdates
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureBoundingBox;Z)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_175712_a = McMappingDatabase.getSRG("WorldServer.func_175712_a");

	/**
	 * <p>
	 * Name: areAllPlayersAsleep
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73056_e = McMappingDatabase.getSRG("WorldServer.func_73056_e");

	/**
	 * <p>
	 * Name: scheduleUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;I)V]
	 * </p>
	 */
	public static McObfPair func_175684_a = McMappingDatabase.getSRG("WorldServer.func_175684_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147491_a = McMappingDatabase.getSRG("field_147491_a");

	/**
	 * <p>
	 * Name: updateEntityWithOptionalForce
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Z)V]
	 * </p>
	 */
	public static McObfPair func_72866_a = McMappingDatabase.getSRG("WorldServer.func_72866_a");

	/**
	 * <p>
	 * Name: getPendingBlockUpdates
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;Z)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_72920_a = McMappingDatabase.getSRG("WorldServer.func_72920_a");

	/**
	 * <p>
	 * Name: entitySpawner
	 * </p>
	 */
	public static McObfPair field_175742_R = McMappingDatabase.getSRG("field_175742_R");

	/**
	 * <p>
	 * Name: updateBlocks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147456_g = McMappingDatabase.getSRG("WorldServer.func_147456_g");

	/**
	 * <p>
	 * Name: canCreatureTypeSpawnHere
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EnumCreatureType;Lnet/minecraft/world/biome/Biome$SpawnListEntry;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175732_a = McMappingDatabase.getSRG("WorldServer.func_175732_a");

	/**
	 * <p>
	 * Name: updateBlockTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;II)V]
	 * </p>
	 */
	public static McObfPair func_175654_a = McMappingDatabase.getSRG("WorldServer.func_175654_a");

	/**
	 * <p>
	 * Name: isBlockModifiable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175660_a = McMappingDatabase.getSRG("WorldServer.func_175660_a");

	/**
	 * <p>
	 * Name: getSpawnListEntryForTypeAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EnumCreatureType;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/world/biome/Biome$SpawnListEntry;]
	 * </p>
	 */
	public static McObfPair func_175734_a = McMappingDatabase.getSRG("WorldServer.func_175734_a");

	/**
	 * <p>
	 * Name: loadEntities
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Collection;)V]
	 * </p>
	 */
	public static McObfPair func_175650_b = McMappingDatabase.getSRG("WorldServer.func_175650_b");

	/**
	 * <p>
	 * Name: spawnParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumParticleTypes;ZDDDIDDDD[I)V]
	 * </p>
	 */
	public static McObfPair func_180505_a = McMappingDatabase.getSRG("WorldServer.func_180505_a");

	/**
	 * <p>
	 * Name: entityTracker
	 * </p>
	 */
	public static McObfPair field_73062_L = McMappingDatabase.getSRG("field_73062_L");

	/**
	 * <p>
	 * Name: updateAllPlayersSleepingFlag
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72854_c = McMappingDatabase.getSRG("WorldServer.func_72854_c");

	/**
	 * <p>
	 * Name: getEntityFromUuid
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_175733_a = McMappingDatabase.getSRG("WorldServer.func_175733_a");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72835_b = McMappingDatabase.getSRG("WorldServer.func_72835_b");

	/**
	 * <p>
	 * Name: fireBlockEvent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/BlockEventData;)Z]
	 * </p>
	 */
	public static McObfPair func_147485_a = McMappingDatabase.getSRG("WorldServer.func_147485_a");

	/**
	 * <p>
	 * Name: setEntityState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;B)V]
	 * </p>
	 */
	public static McObfPair func_72960_a = McMappingDatabase.getSRG("WorldServer.func_72960_a");

	/**
	 * <p>
	 * Name: resetRainAndThunder
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73051_P = McMappingDatabase.getSRG("WorldServer.func_73051_P");

	/**
	 * <p>
	 * Name: isBlockTickPending
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)Z]
	 * </p>
	 */
	public static McObfPair func_175691_a = McMappingDatabase.getSRG("WorldServer.func_175691_a");

	/**
	 * <p>
	 * Name: getPlayerChunkMap
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/management/PlayerChunkMap;]
	 * </p>
	 */
	public static McObfPair func_184164_w = McMappingDatabase.getSRG("WorldServer.func_184164_w");

	/**
	 * <p>
	 * Name: getMinecraftServer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/MinecraftServer;]
	 * </p>
	 */
	public static McObfPair func_73046_m = McMappingDatabase.getSRG("WorldServer.func_73046_m");

	/**
	 * <p>
	 * Name: blockEventCacheIndex
	 * </p>
	 */
	public static McObfPair field_147489_T = McMappingDatabase.getSRG("field_147489_T");

	/**
	 * <p>
	 * Name: spawnParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumParticleTypes;DDDIDDDD[I)V]
	 * </p>
	 */
	public static McObfPair func_175739_a = McMappingDatabase.getSRG("WorldServer.func_175739_a");

	/**
	 * <p>
	 * Name: onEntityRemoved
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72847_b = McMappingDatabase.getSRG("WorldServer.func_72847_b");

	/**
	 * <p>
	 * Name: spawnParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/util/EnumParticleTypes;ZDDDIDDDD[I)V]
	 * </p>
	 */
	public static McObfPair func_184161_a = McMappingDatabase.getSRG("WorldServer.func_184161_a");

	/**
	 * <p>
	 * Name: findNearestStructure
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_190528_a = McMappingDatabase.getSRG("WorldServer.func_190528_a");

	/**
	 * <p>
	 * Name: worldTeleporter
	 * </p>
	 */
	public static McObfPair field_85177_Q = McMappingDatabase.getSRG("field_85177_Q");

	/**
	 * <p>
	 * Name: disableLevelSaving
	 * </p>
	 */
	public static McObfPair field_73058_d = McMappingDatabase.getSRG("field_73058_d");

	/**
	 * <p>
	 * Name: pendingTickListEntriesThisTick
	 * </p>
	 */
	public static McObfPair field_94579_S = McMappingDatabase.getSRG("field_94579_S");

	/**
	 * <p>
	 * Name: tickPlayers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184147_l = McMappingDatabase.getSRG("WorldServer.func_184147_l");

	/**
	 * <p>
	 * Name: scheduleBlockUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;II)V]
	 * </p>
	 */
	public static McObfPair func_180497_b = McMappingDatabase.getSRG("WorldServer.func_180497_b");

	/**
	 * <p>
	 * Name: addBlockEvent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;II)V]
	 * </p>
	 */
	public static McObfPair func_175641_c = McMappingDatabase.getSRG("WorldServer.func_175641_c");

	/**
	 * <p>
	 * Name: entitiesByUuid
	 * </p>
	 */
	public static McObfPair field_175741_N = McMappingDatabase.getSRG("field_175741_N");

	/**
	 * <p>
	 * Name: updateEntities
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72939_s = McMappingDatabase.getSRG("WorldServer.func_72939_s");

	/**
	 * <p>
	 * Name: createChunkProvider
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/chunk/IChunkProvider;]
	 * </p>
	 */
	public static McObfPair func_72970_h = McMappingDatabase.getSRG("WorldServer.func_72970_h");

	/**
	 * <p>
	 * Name: updateEntityTick
	 * </p>
	 */
	public static McObfPair field_80004_Q = McMappingDatabase.getSRG("field_80004_Q");

	/**
	 * <p>
	 * Name: newExplosion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDDFZZ)Lnet/minecraft/world/Explosion;]
	 * </p>
	 */
	public static McObfPair func_72885_a = McMappingDatabase.getSRG("WorldServer.func_72885_a");

	/**
	 * <p>
	 * Name: adjustPosToNearbyEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_175736_a = McMappingDatabase.getSRG("WorldServer.func_175736_a");

	/**
	 * <p>
	 * Name: playerCheckLight
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184162_i = McMappingDatabase.getSRG("WorldServer.func_184162_i");

	/**
	 * <p>
	 * Name: addScheduledTask
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;]
	 * </p>
	 */
	public static McObfPair func_152344_a = McMappingDatabase.getSRG("WorldServer.func_152344_a");

}

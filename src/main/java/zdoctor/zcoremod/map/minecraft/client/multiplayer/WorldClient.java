package zdoctor.zcoremod.map.minecraft.client.multiplayer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldClient {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsb";
		else
			return "net/minecraft/client/multiplayer/WorldClient";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsb";
		else
			return "WorldClient";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsb;";
		else
			return "Lnet/minecraft/client/multiplayer/WorldClient;";
	}

	/**
	 * <p>
	 * Name: isChunkLoaded
	 * </p>
	 * <p>
	 * Desc: [(IIZ)Z]
	 * </p>
	 */
	public static McObfPair func_175680_a = McMappingDatabase.getSRG("WorldClient.func_175680_a");

	/**
	 * <p>
	 * Name: entityList
	 * </p>
	 */
	public static McObfPair field_73032_d = McMappingDatabase.getSRG("field_73032_d");

	/**
	 * <p>
	 * Name: invalidateRegionAndSetBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_180503_b = McMappingDatabase.getSRG("WorldClient.func_180503_b");

	/**
	 * <p>
	 * Name: sendQuittingDisconnectingPacket
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72882_A = McMappingDatabase.getSRG("WorldClient.func_72882_A");

	/**
	 * <p>
	 * Name: removeEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72900_e = McMappingDatabase.getSRG("WorldClient.func_72900_e");

	/**
	 * <p>
	 * Name: addEntityToWorld
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_73027_a = McMappingDatabase.getSRG("WorldClient.func_73027_a");

	/**
	 * <p>
	 * Name: getChunkProvider
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/chunk/IChunkProvider;, ()Lnet/minecraft/client/multiplayer/ChunkProviderClient;]
	 * </p>
	 */
	public static McObfPair func_72863_F = McMappingDatabase.getSRG("WorldClient.func_72863_F");

	/**
	 * <p>
	 * Name: ambienceTicks
	 * </p>
	 */
	public static McObfPair field_184158_M = McMappingDatabase.getSRG("field_184158_M");

	/**
	 * <p>
	 * Name: visibleChunks
	 * </p>
	 */
	public static McObfPair field_184157_a = McMappingDatabase.getSRG("field_184157_a");

	/**
	 * <p>
	 * Name: addWorldInfoToCrashReport
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/crash/CrashReport;)Lnet/minecraft/crash/CrashReportCategory;]
	 * </p>
	 */
	public static McObfPair func_72914_a = McMappingDatabase.getSRG("WorldClient.func_72914_a");

	/**
	 * <p>
	 * Name: updateBlocks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147456_g = McMappingDatabase.getSRG("WorldClient.func_147456_g");

	/**
	 * <p>
	 * Name: onEntityRemoved
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72847_b = McMappingDatabase.getSRG("WorldClient.func_72847_b");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_73037_M = McMappingDatabase.getSRG("field_73037_M");

	/**
	 * <p>
	 * Name: playMoodSoundAndCheckLight
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/world/chunk/Chunk;)V]
	 * </p>
	 */
	public static McObfPair func_147467_a = McMappingDatabase.getSRG("WorldClient.func_147467_a");

	/**
	 * <p>
	 * Name: showBarrierParticles
	 * </p>
	 * <p>
	 * Desc: [(IIIILjava/util/Random;ZLnet/minecraft/util/math/BlockPos$MutableBlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184153_a = McMappingDatabase.getSRG("WorldClient.func_184153_a");

	/**
	 * <p>
	 * Name: getEntityByID
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_73045_a = McMappingDatabase.getSRG("WorldClient.func_73045_a");

	/**
	 * <p>
	 * Name: clientChunkProvider
	 * </p>
	 */
	public static McObfPair field_73033_b = McMappingDatabase.getSRG("field_73033_b");

	/**
	 * <p>
	 * Name: doPreChunk
	 * </p>
	 * <p>
	 * Desc: [(IIZ)V]
	 * </p>
	 */
	public static McObfPair func_73025_a = McMappingDatabase.getSRG("WorldClient.func_73025_a");

	/**
	 * <p>
	 * Name: entitySpawnQueue
	 * </p>
	 */
	public static McObfPair field_73036_L = McMappingDatabase.getSRG("field_73036_L");

	/**
	 * <p>
	 * Name: playSound
	 * </p>
	 * <p>
	 * Desc: [(DDDLnet/minecraft/util/SoundEvent;Lnet/minecraft/util/SoundCategory;FFZ)V]
	 * </p>
	 */
	public static McObfPair func_184134_a = McMappingDatabase.getSRG("WorldClient.func_184134_a");

	/**
	 * <p>
	 * Name: onEntityAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72923_a = McMappingDatabase.getSRG("WorldClient.func_72923_a");

	/**
	 * <p>
	 * Name: spawnEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_72838_d = McMappingDatabase.getSRG("WorldClient.func_72838_d");

	/**
	 * <p>
	 * Name: doVoidFogParticles
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73029_E = McMappingDatabase.getSRG("WorldClient.func_73029_E");

	/**
	 * <p>
	 * Name: makeFireworks
	 * </p>
	 * <p>
	 * Desc: [(DDDDDDLnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_92088_a = McMappingDatabase.getSRG("WorldClient.func_92088_a");

	/**
	 * <p>
	 * Name: updateWeather
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72979_l = McMappingDatabase.getSRG("WorldClient.func_72979_l");

	/**
	 * <p>
	 * Name: createChunkProvider
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/chunk/IChunkProvider;]
	 * </p>
	 */
	public static McObfPair func_72970_h = McMappingDatabase.getSRG("WorldClient.func_72970_h");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72835_b = McMappingDatabase.getSRG("WorldClient.func_72835_b");

	/**
	 * <p>
	 * Name: removeEntityFromWorld
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_73028_b = McMappingDatabase.getSRG("WorldClient.func_73028_b");

	/**
	 * <p>
	 * Name: sendPacketToServer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/Packet;)V]
	 * </p>
	 */
	public static McObfPair func_184135_a = McMappingDatabase.getSRG("WorldClient.func_184135_a");

	/**
	 * <p>
	 * Name: setWorldScoreboard
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/Scoreboard;)V]
	 * </p>
	 */
	public static McObfPair func_96443_a = McMappingDatabase.getSRG("WorldClient.func_96443_a");

	/**
	 * <p>
	 * Name: refreshVisibleChunks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184154_a = McMappingDatabase.getSRG("WorldClient.func_184154_a");

	/**
	 * <p>
	 * Name: setWorldTime
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_72877_b = McMappingDatabase.getSRG("WorldClient.func_72877_b");

	/**
	 * <p>
	 * Name: invalidateBlockReceiveRegion
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_73031_a = McMappingDatabase.getSRG("WorldClient.func_73031_a");

	/**
	 * <p>
	 * Name: removeAllEntities
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73022_a = McMappingDatabase.getSRG("WorldClient.func_73022_a");

	/**
	 * <p>
	 * Name: playSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;DDDLnet/minecraft/util/SoundEvent;Lnet/minecraft/util/SoundCategory;FF)V]
	 * </p>
	 */
	public static McObfPair func_184148_a = McMappingDatabase.getSRG("WorldClient.func_184148_a");

	/**
	 * <p>
	 * Name: previousActiveChunkSet
	 * </p>
	 */
	public static McObfPair field_73038_N = McMappingDatabase.getSRG("field_73038_N");

	/**
	 * <p>
	 * Name: playSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/SoundEvent;Lnet/minecraft/util/SoundCategory;FFZ)V]
	 * </p>
	 */
	public static McObfPair func_184156_a = McMappingDatabase.getSRG("WorldClient.func_184156_a");

	/**
	 * <p>
	 * Name: connection
	 * </p>
	 */
	public static McObfPair field_73035_a = McMappingDatabase.getSRG("field_73035_a");

}

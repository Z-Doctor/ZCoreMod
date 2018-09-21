package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlayerChunkMap {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ou";
		else
			return "net/minecraft/server/management/PlayerChunkMap";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ou";
		else
			return "PlayerChunkMap";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lou;";
		else
			return "Lnet/minecraft/server/management/PlayerChunkMap;";
	}

	/**
	 * <p>
	 * Name: getIndex
	 * </p>
	 * <p>
	 * Desc: [(II)J]
	 * </p>
	 */
	public static McObfPair func_187307_d = McMappingDatabase.getSRG("PlayerChunkMap.func_187307_d");

	/**
	 * <p>
	 * Name: playerViewRadius
	 * </p>
	 */
	public static McObfPair field_72698_e = McMappingDatabase.getSRG("field_72698_e");

	/**
	 * <p>
	 * Name: players
	 * </p>
	 */
	public static McObfPair field_72699_b = McMappingDatabase.getSRG("field_72699_b");

	/**
	 * <p>
	 * Name: previousTotalWorldTime
	 * </p>
	 */
	public static McObfPair field_111192_g = McMappingDatabase.getSRG("field_111192_g");

	/**
	 * <p>
	 * Name: markBlockForUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180244_a = McMappingDatabase.getSRG("PlayerChunkMap.func_180244_a");

	/**
	 * <p>
	 * Name: addPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_72683_a = McMappingDatabase.getSRG("PlayerChunkMap.func_72683_a");

	/**
	 * <p>
	 * Name: getChunkIterator
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Iterator;]
	 * </p>
	 */
	public static McObfPair func_187300_b = McMappingDatabase.getSRG("PlayerChunkMap.func_187300_b");

	/**
	 * <p>
	 * Name: getOrCreateEntry
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/server/management/PlayerChunkMapEntry;]
	 * </p>
	 */
	public static McObfPair func_187302_c = McMappingDatabase.getSRG("PlayerChunkMap.func_187302_c");

	/**
	 * <p>
	 * Name: CAN_GENERATE_CHUNKS
	 * </p>
	 */
	public static McObfPair field_187309_b = McMappingDatabase.getSRG("field_187309_b");

	/**
	 * <p>
	 * Name: overlaps
	 * </p>
	 * <p>
	 * Desc: [(IIIII)Z]
	 * </p>
	 */
	public static McObfPair func_72684_a = McMappingDatabase.getSRG("PlayerChunkMap.func_72684_a");

	/**
	 * <p>
	 * Name: markSortPending
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187306_e = McMappingDatabase.getSRG("PlayerChunkMap.func_187306_e");

	/**
	 * <p>
	 * Name: entryMap
	 * </p>
	 */
	public static McObfPair field_72700_c = McMappingDatabase.getSRG("field_72700_c");

	/**
	 * <p>
	 * Name: getEntry
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/server/management/PlayerChunkMapEntry;]
	 * </p>
	 */
	public static McObfPair func_187301_b = McMappingDatabase.getSRG("PlayerChunkMap.func_187301_b");

	/**
	 * <p>
	 * Name: getWorldServer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/WorldServer;]
	 * </p>
	 */
	public static McObfPair func_72688_a = McMappingDatabase.getSRG("PlayerChunkMap.func_72688_a");

	/**
	 * <p>
	 * Name: entriesWithoutChunks
	 * </p>
	 */
	public static McObfPair field_187311_h = McMappingDatabase.getSRG("field_187311_h");

	/**
	 * <p>
	 * Name: getFurthestViewableBlock
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_72686_a = McMappingDatabase.getSRG("PlayerChunkMap.func_72686_a");

	/**
	 * <p>
	 * Name: isPlayerWatchingChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;II)Z]
	 * </p>
	 */
	public static McObfPair func_72694_a = McMappingDatabase.getSRG("PlayerChunkMap.func_72694_a");

	/**
	 * <p>
	 * Name: entries
	 * </p>
	 */
	public static McObfPair field_111193_e = McMappingDatabase.getSRG("field_111193_e");

	/**
	 * <p>
	 * Name: NOT_SPECTATOR
	 * </p>
	 */
	public static McObfPair field_187308_a = McMappingDatabase.getSRG("field_187308_a");

	/**
	 * <p>
	 * Name: contains
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_152621_a = McMappingDatabase.getSRG("PlayerChunkMap.func_152621_a");

	/**
	 * <p>
	 * Name: removePlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_72695_c = McMappingDatabase.getSRG("PlayerChunkMap.func_72695_c");

	/**
	 * <p>
	 * Name: sortSendToPlayers
	 * </p>
	 */
	public static McObfPair field_187313_m = McMappingDatabase.getSRG("field_187313_m");

	/**
	 * <p>
	 * Name: dirtyEntries
	 * </p>
	 */
	public static McObfPair field_72697_d = McMappingDatabase.getSRG("field_72697_d");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_72701_a = McMappingDatabase.getSRG("field_72701_a");

	/**
	 * <p>
	 * Name: setPlayerViewRadius
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_152622_a = McMappingDatabase.getSRG("PlayerChunkMap.func_152622_a");

	/**
	 * <p>
	 * Name: pendingSendToPlayers
	 * </p>
	 */
	public static McObfPair field_187310_g = McMappingDatabase.getSRG("field_187310_g");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72693_b = McMappingDatabase.getSRG("PlayerChunkMap.func_72693_b");

	/**
	 * <p>
	 * Name: sortMissingChunks
	 * </p>
	 */
	public static McObfPair field_187312_l = McMappingDatabase.getSRG("field_187312_l");

	/**
	 * <p>
	 * Name: updateMovingPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_72685_d = McMappingDatabase.getSRG("PlayerChunkMap.func_72685_d");

	/**
	 * <p>
	 * Name: entryChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/management/PlayerChunkMapEntry;)V]
	 * </p>
	 */
	public static McObfPair func_187304_a = McMappingDatabase.getSRG("PlayerChunkMap.func_187304_a");

	/**
	 * <p>
	 * Name: removeEntry
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/management/PlayerChunkMapEntry;)V]
	 * </p>
	 */
	public static McObfPair func_187305_b = McMappingDatabase.getSRG("PlayerChunkMap.func_187305_b");

}

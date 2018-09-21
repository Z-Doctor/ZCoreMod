package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlayerChunkMapEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ot";
		else
			return "net/minecraft/server/management/PlayerChunkMapEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ot";
		else
			return "PlayerChunkMapEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lot;";
		else
			return "Lnet/minecraft/server/management/PlayerChunkMapEntry;";
	}

	/**
	 * <p>
	 * Name: providePlayerChunk
	 * </p>
	 * <p>
	 * Desc: [(Z)Z]
	 * </p>
	 */
	public static McObfPair func_187268_a = McMappingDatabase.getSRG("PlayerChunkMapEntry.func_187268_a");

	/**
	 * <p>
	 * Name: changedSectionFilter
	 * </p>
	 */
	public static McObfPair field_187288_h = McMappingDatabase.getSRG("field_187288_h");

	/**
	 * <p>
	 * Name: removePlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_187277_b = McMappingDatabase.getSRG("PlayerChunkMapEntry.func_187277_b");

	/**
	 * <p>
	 * Name: isSentToPlayers
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_187274_e = McMappingDatabase.getSRG("PlayerChunkMapEntry.func_187274_e");

	/**
	 * <p>
	 * Name: sendBlockEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;)V]
	 * </p>
	 */
	public static McObfPair func_187273_a = McMappingDatabase.getSRG("PlayerChunkMapEntry.func_187273_a");

	/**
	 * <p>
	 * Name: containsPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)Z]
	 * </p>
	 */
	public static McObfPair func_187275_d = McMappingDatabase.getSRG("PlayerChunkMapEntry.func_187275_d");

	/**
	 * <p>
	 * Name: sendToPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_187278_c = McMappingDatabase.getSRG("PlayerChunkMapEntry.func_187278_c");

	/**
	 * <p>
	 * Name: getPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/ChunkPos;]
	 * </p>
	 */
	public static McObfPair func_187264_a = McMappingDatabase.getSRG("PlayerChunkMapEntry.func_187264_a");

	/**
	 * <p>
	 * Name: sendPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/Packet;)V]
	 * </p>
	 */
	public static McObfPair func_187267_a = McMappingDatabase.getSRG("PlayerChunkMapEntry.func_187267_a");

	/**
	 * <p>
	 * Name: getClosestPlayerDistance
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_187270_g = McMappingDatabase.getSRG("PlayerChunkMapEntry.func_187270_g");

	/**
	 * <p>
	 * Name: playerChunkMap
	 * </p>
	 */
	public static McObfPair field_187282_b = McMappingDatabase.getSRG("field_187282_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_187281_a = McMappingDatabase.getSRG("field_187281_a");

	/**
	 * <p>
	 * Name: changes
	 * </p>
	 */
	public static McObfPair field_187287_g = McMappingDatabase.getSRG("field_187287_g");

	/**
	 * <p>
	 * Name: blockChanged
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_187265_a = McMappingDatabase.getSRG("PlayerChunkMapEntry.func_187265_a");

	/**
	 * <p>
	 * Name: updateChunkInhabitedTime
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187279_c = McMappingDatabase.getSRG("PlayerChunkMapEntry.func_187279_c");

	/**
	 * <p>
	 * Name: sendToPlayers
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_187272_b = McMappingDatabase.getSRG("PlayerChunkMapEntry.func_187272_b");

	/**
	 * <p>
	 * Name: hasPlayerMatchingInRange
	 * </p>
	 * <p>
	 * Desc: [(DLcom/google/common/base/Predicate;)Z]
	 * </p>
	 */
	public static McObfPair func_187271_a = McMappingDatabase.getSRG("PlayerChunkMapEntry.func_187271_a");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187280_d = McMappingDatabase.getSRG("PlayerChunkMapEntry.func_187280_d");

	/**
	 * <p>
	 * Name: sentToPlayers
	 * </p>
	 */
	public static McObfPair field_187290_j = McMappingDatabase.getSRG("field_187290_j");

	/**
	 * <p>
	 * Name: changedBlocks
	 * </p>
	 */
	public static McObfPair field_187285_e = McMappingDatabase.getSRG("field_187285_e");

	/**
	 * <p>
	 * Name: getChunk
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_187266_f = McMappingDatabase.getSRG("PlayerChunkMapEntry.func_187266_f");

	/**
	 * <p>
	 * Name: players
	 * </p>
	 */
	public static McObfPair field_187283_c = McMappingDatabase.getSRG("field_187283_c");

	/**
	 * <p>
	 * Name: pos
	 * </p>
	 */
	public static McObfPair field_187284_d = McMappingDatabase.getSRG("field_187284_d");

	/**
	 * <p>
	 * Name: hasPlayerMatching
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/common/base/Predicate;)Z]
	 * </p>
	 */
	public static McObfPair func_187269_a = McMappingDatabase.getSRG("PlayerChunkMapEntry.func_187269_a");

	/**
	 * <p>
	 * Name: addPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_187276_a = McMappingDatabase.getSRG("PlayerChunkMapEntry.func_187276_a");

	/**
	 * <p>
	 * Name: chunk
	 * </p>
	 */
	public static McObfPair field_187286_f = McMappingDatabase.getSRG("field_187286_f");

	/**
	 * <p>
	 * Name: lastUpdateInhabitedTime
	 * </p>
	 */
	public static McObfPair field_187289_i = McMappingDatabase.getSRG("field_187289_i");

}

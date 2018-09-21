package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityTrackerEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "os";
		else
			return "net/minecraft/entity/EntityTrackerEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "os";
		else
			return "EntityTrackerEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Los;";
		else
			return "Lnet/minecraft/entity/EntityTrackerEntry;";
	}

	/**
	 * <p>
	 * Name: setMaxRange
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_187259_a = McMappingDatabase.getSRG("EntityTrackerEntry.func_187259_a");

	/**
	 * <p>
	 * Name: motionZ
	 * </p>
	 */
	public static McObfPair field_73135_l = McMappingDatabase.getSRG("field_73135_l");

	/**
	 * <p>
	 * Name: sendVelocityUpdates
	 * </p>
	 */
	public static McObfPair field_73143_t = McMappingDatabase.getSRG("field_73143_t");

	/**
	 * <p>
	 * Name: removeFromTrackedPlayers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_73118_a = McMappingDatabase.getSRG("EntityTrackerEntry.func_73118_a");

	/**
	 * <p>
	 * Name: encodedPosZ
	 * </p>
	 */
	public static McObfPair field_73126_f = McMappingDatabase.getSRG("field_73126_f");

	/**
	 * <p>
	 * Name: sendPacketToTrackedPlayers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/Packet;)V]
	 * </p>
	 */
	public static McObfPair func_151259_a = McMappingDatabase.getSRG("EntityTrackerEntry.func_151259_a");

	/**
	 * <p>
	 * Name: encodedRotationPitch
	 * </p>
	 */
	public static McObfPair field_73139_h = McMappingDatabase.getSRG("field_73139_h");

	/**
	 * <p>
	 * Name: lastTrackedEntityPosZ
	 * </p>
	 */
	public static McObfPair field_73145_r = McMappingDatabase.getSRG("field_73145_r");

	/**
	 * <p>
	 * Name: encodedPosX
	 * </p>
	 */
	public static McObfPair field_73128_d = McMappingDatabase.getSRG("field_73128_d");

	/**
	 * <p>
	 * Name: resetPlayerVisibility
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187261_c = McMappingDatabase.getSRG("EntityTrackerEntry.func_187261_c");

	/**
	 * <p>
	 * Name: range
	 * </p>
	 */
	public static McObfPair field_73130_b = McMappingDatabase.getSRG("field_73130_b");

	/**
	 * <p>
	 * Name: removeTrackedPlayerSymmetric
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_73123_c = McMappingDatabase.getSRG("EntityTrackerEntry.func_73123_c");

	/**
	 * <p>
	 * Name: lastTrackedEntityMotionY
	 * </p>
	 */
	public static McObfPair field_73138_k = McMappingDatabase.getSRG("field_73138_k");

	/**
	 * <p>
	 * Name: getTrackedEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_187260_b = McMappingDatabase.getSRG("EntityTrackerEntry.func_187260_b");

	/**
	 * <p>
	 * Name: trackedEntity
	 * </p>
	 */
	public static McObfPair field_73132_a = McMappingDatabase.getSRG("field_73132_a");

	/**
	 * <p>
	 * Name: passengers
	 * </p>
	 */
	public static McObfPair field_187263_w = McMappingDatabase.getSRG("field_187263_w");

	/**
	 * <p>
	 * Name: ticksSinceLastForcedTeleport
	 * </p>
	 */
	public static McObfPair field_73142_u = McMappingDatabase.getSRG("field_73142_u");

	/**
	 * <p>
	 * Name: playerEntitiesUpdated
	 * </p>
	 */
	public static McObfPair field_73133_n = McMappingDatabase.getSRG("field_73133_n");

	/**
	 * <p>
	 * Name: updateFrequency
	 * </p>
	 */
	public static McObfPair field_73131_c = McMappingDatabase.getSRG("field_73131_c");

	/**
	 * <p>
	 * Name: updatedPlayerVisibility
	 * </p>
	 */
	public static McObfPair field_73144_s = McMappingDatabase.getSRG("field_73144_s");

	/**
	 * <p>
	 * Name: lastTrackedEntityPosX
	 * </p>
	 */
	public static McObfPair field_73147_p = McMappingDatabase.getSRG("field_73147_p");

	/**
	 * <p>
	 * Name: updatePlayerEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_73117_b = McMappingDatabase.getSRG("EntityTrackerEntry.func_73117_b");

	/**
	 * <p>
	 * Name: encodedRotationYaw
	 * </p>
	 */
	public static McObfPair field_73127_g = McMappingDatabase.getSRG("field_73127_g");

	/**
	 * <p>
	 * Name: trackingPlayers
	 * </p>
	 */
	public static McObfPair field_73134_o = McMappingDatabase.getSRG("field_73134_o");

	/**
	 * <p>
	 * Name: onGround
	 * </p>
	 */
	public static McObfPair field_180234_y = McMappingDatabase.getSRG("field_180234_y");

	/**
	 * <p>
	 * Name: createSpawnPacket
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/Packet;]
	 * </p>
	 */
	public static McObfPair func_151260_c = McMappingDatabase.getSRG("EntityTrackerEntry.func_151260_c");

	/**
	 * <p>
	 * Name: lastTrackedEntityPosY
	 * </p>
	 */
	public static McObfPair field_73146_q = McMappingDatabase.getSRG("field_73146_q");

	/**
	 * <p>
	 * Name: encodedPosY
	 * </p>
	 */
	public static McObfPair field_73129_e = McMappingDatabase.getSRG("field_73129_e");

	/**
	 * <p>
	 * Name: sendDestroyEntityPacketToTrackedPlayers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73119_a = McMappingDatabase.getSRG("EntityTrackerEntry.func_73119_a");

	/**
	 * <p>
	 * Name: updateCounter
	 * </p>
	 */
	public static McObfPair field_73136_m = McMappingDatabase.getSRG("field_73136_m");

	/**
	 * <p>
	 * Name: sendMetadata
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_111190_b = McMappingDatabase.getSRG("EntityTrackerEntry.func_111190_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_151262_p = McMappingDatabase.getSRG("field_151262_p");

	/**
	 * <p>
	 * Name: maxRange
	 * </p>
	 */
	public static McObfPair field_187262_f = McMappingDatabase.getSRG("field_187262_f");

	/**
	 * <p>
	 * Name: updatePlayerEntities
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_73125_b = McMappingDatabase.getSRG("EntityTrackerEntry.func_73125_b");

	/**
	 * <p>
	 * Name: ridingEntity
	 * </p>
	 */
	public static McObfPair field_73141_v = McMappingDatabase.getSRG("field_73141_v");

	/**
	 * <p>
	 * Name: lastHeadMotion
	 * </p>
	 */
	public static McObfPair field_73140_i = McMappingDatabase.getSRG("field_73140_i");

	/**
	 * <p>
	 * Name: updatePlayerList
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_73122_a = McMappingDatabase.getSRG("EntityTrackerEntry.func_73122_a");

	/**
	 * <p>
	 * Name: lastTrackedEntityMotionX
	 * </p>
	 */
	public static McObfPair field_73137_j = McMappingDatabase.getSRG("field_73137_j");

	/**
	 * <p>
	 * Name: sendToTrackingAndSelf
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/Packet;)V]
	 * </p>
	 */
	public static McObfPair func_151261_b = McMappingDatabase.getSRG("EntityTrackerEntry.func_151261_b");

	/**
	 * <p>
	 * Name: isPlayerWatchingThisChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)Z]
	 * </p>
	 */
	public static McObfPair func_73121_d = McMappingDatabase.getSRG("EntityTrackerEntry.func_73121_d");

	/**
	 * <p>
	 * Name: isVisibleTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)Z]
	 * </p>
	 */
	public static McObfPair func_180233_c = McMappingDatabase.getSRG("EntityTrackerEntry.func_180233_c");

}

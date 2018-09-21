package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityTracker {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ol";
		else
			return "net/minecraft/entity/EntityTracker";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ol";
		else
			return "EntityTracker";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lol;";
		else
			return "Lnet/minecraft/entity/EntityTracker;";
	}

	/**
	 * <p>
	 * Name: entries
	 * </p>
	 */
	public static McObfPair field_72793_b = McMappingDatabase.getSRG("field_72793_b");

	/**
	 * <p>
	 * Name: sendLeashedEntitiesInChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/world/chunk/Chunk;)V]
	 * </p>
	 */
	public static McObfPair func_85172_a = McMappingDatabase.getSRG("EntityTracker.func_85172_a");

	/**
	 * <p>
	 * Name: setViewDistance
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_187252_a = McMappingDatabase.getSRG("EntityTracker.func_187252_a");

	/**
	 * <p>
	 * Name: track
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;II)V]
	 * </p>
	 */
	public static McObfPair func_72791_a = McMappingDatabase.getSRG("EntityTracker.func_72791_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_151249_a = McMappingDatabase.getSRG("field_151249_a");

	/**
	 * <p>
	 * Name: untrack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72790_b = McMappingDatabase.getSRG("EntityTracker.func_72790_b");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72788_a = McMappingDatabase.getSRG("EntityTracker.func_72788_a");

	/**
	 * <p>
	 * Name: track
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;IIZ)V]
	 * </p>
	 */
	public static McObfPair func_72785_a = McMappingDatabase.getSRG("EntityTracker.func_72785_a");

	/**
	 * <p>
	 * Name: updateServerPosition
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDD)V]
	 * </p>
	 */
	public static McObfPair func_187254_a = McMappingDatabase.getSRG("EntityTracker.func_187254_a");

	/**
	 * <p>
	 * Name: sendToTracking
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/network/Packet;)V]
	 * </p>
	 */
	public static McObfPair func_151247_a = McMappingDatabase.getSRG("EntityTracker.func_151247_a");

	/**
	 * <p>
	 * Name: maxTrackingDistanceThreshold
	 * </p>
	 */
	public static McObfPair field_72792_d = McMappingDatabase.getSRG("field_72792_d");

	/**
	 * <p>
	 * Name: removePlayerFromTrackers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_72787_a = McMappingDatabase.getSRG("EntityTracker.func_72787_a");

	/**
	 * <p>
	 * Name: getPositionLong
	 * </p>
	 * <p>
	 * Desc: [(D)J]
	 * </p>
	 */
	public static McObfPair func_187253_a = McMappingDatabase.getSRG("EntityTracker.func_187253_a");

	/**
	 * <p>
	 * Name: updateVisibility
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_180245_a = McMappingDatabase.getSRG("EntityTracker.func_180245_a");

	/**
	 * <p>
	 * Name: trackedEntityHashTable
	 * </p>
	 */
	public static McObfPair field_72794_c = McMappingDatabase.getSRG("field_72794_c");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_72795_a = McMappingDatabase.getSRG("field_72795_a");

	/**
	 * <p>
	 * Name: track
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72786_a = McMappingDatabase.getSRG("EntityTracker.func_72786_a");

	/**
	 * <p>
	 * Name: sendToTrackingAndSelf
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/network/Packet;)V]
	 * </p>
	 */
	public static McObfPair func_151248_b = McMappingDatabase.getSRG("EntityTracker.func_151248_b");

}

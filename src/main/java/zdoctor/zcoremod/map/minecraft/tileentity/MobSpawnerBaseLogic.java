package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MobSpawnerBaseLogic {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amk";
		else
			return "net/minecraft/tileentity/MobSpawnerBaseLogic";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amk";
		else
			return "MobSpawnerBaseLogic";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamk;";
		else
			return "Lnet/minecraft/tileentity/MobSpawnerBaseLogic;";
	}

	/**
	 * <p>
	 * Name: prevMobRotation
	 * </p>
	 */
	public static McObfPair field_98284_d = McMappingDatabase.getSRG("field_98284_d");

	/**
	 * <p>
	 * Name: getPrevMobRotation
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_177223_e = McMappingDatabase.getSRG("MobSpawnerBaseLogic.func_177223_e");

	/**
	 * <p>
	 * Name: spawnRange
	 * </p>
	 */
	public static McObfPair field_98290_m = McMappingDatabase.getSRG("field_98290_m");

	/**
	 * <p>
	 * Name: getEntityId
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_190895_g = McMappingDatabase.getSRG("MobSpawnerBaseLogic.func_190895_g");

	/**
	 * <p>
	 * Name: minSpawnDelay
	 * </p>
	 */
	public static McObfPair field_98283_g = McMappingDatabase.getSRG("field_98283_g");

	/**
	 * <p>
	 * Name: updateSpawner
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_98278_g = McMappingDatabase.getSRG("MobSpawnerBaseLogic.func_98278_g");

	/**
	 * <p>
	 * Name: getCachedEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_184994_d = McMappingDatabase.getSRG("MobSpawnerBaseLogic.func_184994_d");

	/**
	 * <p>
	 * Name: cachedEntity
	 * </p>
	 */
	public static McObfPair field_98291_j = McMappingDatabase.getSRG("field_98291_j");

	/**
	 * <p>
	 * Name: getSpawnerWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_98271_a = McMappingDatabase.getSRG("MobSpawnerBaseLogic.func_98271_a");

	/**
	 * <p>
	 * Name: potentialSpawns
	 * </p>
	 */
	public static McObfPair field_98285_e = McMappingDatabase.getSRG("field_98285_e");

	/**
	 * <p>
	 * Name: broadcastEvent
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_98267_a = McMappingDatabase.getSRG("MobSpawnerBaseLogic.func_98267_a");

	/**
	 * <p>
	 * Name: mobRotation
	 * </p>
	 */
	public static McObfPair field_98287_c = McMappingDatabase.getSRG("field_98287_c");

	/**
	 * <p>
	 * Name: isActivated
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_98279_f = McMappingDatabase.getSRG("MobSpawnerBaseLogic.func_98279_f");

	/**
	 * <p>
	 * Name: resetTimer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_98273_j = McMappingDatabase.getSRG("MobSpawnerBaseLogic.func_98273_j");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189530_b = McMappingDatabase.getSRG("MobSpawnerBaseLogic.func_189530_b");

	/**
	 * <p>
	 * Name: getMobRotation
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_177222_d = McMappingDatabase.getSRG("MobSpawnerBaseLogic.func_177222_d");

	/**
	 * <p>
	 * Name: setNextSpawnData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/WeightedSpawnerEntity;)V]
	 * </p>
	 */
	public static McObfPair func_184993_a = McMappingDatabase.getSRG("MobSpawnerBaseLogic.func_184993_a");

	/**
	 * <p>
	 * Name: maxNearbyEntities
	 * </p>
	 */
	public static McObfPair field_98292_k = McMappingDatabase.getSRG("field_98292_k");

	/**
	 * <p>
	 * Name: spawnData
	 * </p>
	 */
	public static McObfPair field_98282_f = McMappingDatabase.getSRG("field_98282_f");

	/**
	 * <p>
	 * Name: setEntityId
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)V]
	 * </p>
	 */
	public static McObfPair func_190894_a = McMappingDatabase.getSRG("MobSpawnerBaseLogic.func_190894_a");

	/**
	 * <p>
	 * Name: spawnDelay
	 * </p>
	 */
	public static McObfPair field_98286_b = McMappingDatabase.getSRG("field_98286_b");

	/**
	 * <p>
	 * Name: maxSpawnDelay
	 * </p>
	 */
	public static McObfPair field_98293_h = McMappingDatabase.getSRG("field_98293_h");

	/**
	 * <p>
	 * Name: spawnCount
	 * </p>
	 */
	public static McObfPair field_98294_i = McMappingDatabase.getSRG("field_98294_i");

	/**
	 * <p>
	 * Name: activatingRangeFromPlayer
	 * </p>
	 */
	public static McObfPair field_98289_l = McMappingDatabase.getSRG("field_98289_l");

	/**
	 * <p>
	 * Name: setDelayToMin
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_98268_b = McMappingDatabase.getSRG("MobSpawnerBaseLogic.func_98268_b");

	/**
	 * <p>
	 * Name: getSpawnerPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177221_b = McMappingDatabase.getSRG("MobSpawnerBaseLogic.func_177221_b");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_98270_a = McMappingDatabase.getSRG("MobSpawnerBaseLogic.func_98270_a");

}

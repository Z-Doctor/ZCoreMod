package zdoctor.zcoremod.map.minecraft.world.end;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DragonFightManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayr";
		else
			return "net/minecraft/world/end/DragonFightManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayr";
		else
			return "DragonFightManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layr;";
		else
			return "Lnet/minecraft/world/end/DragonFightManager;";
	}

	/**
	 * <p>
	 * Name: getNumAliveCrystals
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186092_c = McMappingDatabase.getSRG("DragonFightManager.func_186092_c");

	/**
	 * <p>
	 * Name: hasPreviouslyKilledDragon
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186102_d = McMappingDatabase.getSRG("DragonFightManager.func_186102_d");

	/**
	 * <p>
	 * Name: processDragonDeath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/boss/EntityDragon;)V]
	 * </p>
	 */
	public static McObfPair func_186096_a = McMappingDatabase.getSRG("DragonFightManager.func_186096_a");

	/**
	 * <p>
	 * Name: VALID_PLAYER
	 * </p>
	 */
	public static McObfPair field_186108_b = McMappingDatabase.getSRG("field_186108_b");

	/**
	 * <p>
	 * Name: gateways
	 * </p>
	 */
	public static McObfPair field_186111_e = McMappingDatabase.getSRG("field_186111_e");

	/**
	 * <p>
	 * Name: crystals
	 * </p>
	 */
	public static McObfPair field_186124_r = McMappingDatabase.getSRG("field_186124_r");

	/**
	 * <p>
	 * Name: dragonKilled
	 * </p>
	 */
	public static McObfPair field_186117_k = McMappingDatabase.getSRG("field_186117_k");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_186110_d = McMappingDatabase.getSRG("field_186110_d");

	/**
	 * <p>
	 * Name: onCrystalDestroyed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityEnderCrystal;Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_186090_a = McMappingDatabase.getSRG("DragonFightManager.func_186090_a");

	/**
	 * <p>
	 * Name: respawnState
	 * </p>
	 */
	public static McObfPair field_186122_p = McMappingDatabase.getSRG("field_186122_p");

	/**
	 * <p>
	 * Name: findAliveCrystals
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186101_k = McMappingDatabase.getSRG("DragonFightManager.func_186101_k");

	/**
	 * <p>
	 * Name: respawnDragon
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186106_e = McMappingDatabase.getSRG("DragonFightManager.func_186106_e");

	/**
	 * <p>
	 * Name: spawnNewGateway
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186097_l = McMappingDatabase.getSRG("DragonFightManager.func_186097_l");

	/**
	 * <p>
	 * Name: resetSpikeCrystals
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186087_f = McMappingDatabase.getSRG("DragonFightManager.func_186087_f");

	/**
	 * <p>
	 * Name: hasDragonBeenKilled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186104_g = McMappingDatabase.getSRG("DragonFightManager.func_186104_g");

	/**
	 * <p>
	 * Name: loadChunks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186103_i = McMappingDatabase.getSRG("DragonFightManager.func_186103_i");

	/**
	 * <p>
	 * Name: generatePortal
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_186094_a = McMappingDatabase.getSRG("DragonFightManager.func_186094_a");

	/**
	 * <p>
	 * Name: respawnDragon
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_186093_a = McMappingDatabase.getSRG("DragonFightManager.func_186093_a");

	/**
	 * <p>
	 * Name: dragonUniqueId
	 * </p>
	 */
	public static McObfPair field_186119_m = McMappingDatabase.getSRG("field_186119_m");

	/**
	 * <p>
	 * Name: setRespawnState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/end/DragonSpawnManager;)V]
	 * </p>
	 */
	public static McObfPair func_186095_a = McMappingDatabase.getSRG("DragonFightManager.func_186095_a");

	/**
	 * <p>
	 * Name: updateplayers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186100_j = McMappingDatabase.getSRG("DragonFightManager.func_186100_j");

	/**
	 * <p>
	 * Name: ticksSinceLastPlayerScan
	 * </p>
	 */
	public static McObfPair field_186116_j = McMappingDatabase.getSRG("field_186116_j");

	/**
	 * <p>
	 * Name: ticksSinceCrystalsScanned
	 * </p>
	 */
	public static McObfPair field_186115_i = McMappingDatabase.getSRG("field_186115_i");

	/**
	 * <p>
	 * Name: findExitPortal
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/pattern/BlockPattern$PatternHelper;]
	 * </p>
	 */
	public static McObfPair func_186091_h = McMappingDatabase.getSRG("DragonFightManager.func_186091_h");

	/**
	 * <p>
	 * Name: aliveCrystals
	 * </p>
	 */
	public static McObfPair field_186114_h = McMappingDatabase.getSRG("field_186114_h");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_186107_a = McMappingDatabase.getSRG("field_186107_a");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186105_b = McMappingDatabase.getSRG("DragonFightManager.func_186105_b");

	/**
	 * <p>
	 * Name: exitPortalLocation
	 * </p>
	 */
	public static McObfPair field_186121_o = McMappingDatabase.getSRG("field_186121_o");

	/**
	 * <p>
	 * Name: dragonUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/boss/EntityDragon;)V]
	 * </p>
	 */
	public static McObfPair func_186099_b = McMappingDatabase.getSRG("DragonFightManager.func_186099_b");

	/**
	 * <p>
	 * Name: portalPattern
	 * </p>
	 */
	public static McObfPair field_186112_f = McMappingDatabase.getSRG("field_186112_f");

	/**
	 * <p>
	 * Name: scanForLegacyFight
	 * </p>
	 */
	public static McObfPair field_186120_n = McMappingDatabase.getSRG("field_186120_n");

	/**
	 * <p>
	 * Name: createNewDragon
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/boss/EntityDragon;]
	 * </p>
	 */
	public static McObfPair func_192445_m = McMappingDatabase.getSRG("DragonFightManager.func_192445_m");

	/**
	 * <p>
	 * Name: getCompound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_186088_a = McMappingDatabase.getSRG("DragonFightManager.func_186088_a");

	/**
	 * <p>
	 * Name: previouslyKilled
	 * </p>
	 */
	public static McObfPair field_186118_l = McMappingDatabase.getSRG("field_186118_l");

	/**
	 * <p>
	 * Name: respawnStateTicks
	 * </p>
	 */
	public static McObfPair field_186123_q = McMappingDatabase.getSRG("field_186123_q");

	/**
	 * <p>
	 * Name: bossInfo
	 * </p>
	 */
	public static McObfPair field_186109_c = McMappingDatabase.getSRG("field_186109_c");

	/**
	 * <p>
	 * Name: generateGateway
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_186089_a = McMappingDatabase.getSRG("DragonFightManager.func_186089_a");

	/**
	 * <p>
	 * Name: ticksSinceDragonSeen
	 * </p>
	 */
	public static McObfPair field_186113_g = McMappingDatabase.getSRG("field_186113_g");

}

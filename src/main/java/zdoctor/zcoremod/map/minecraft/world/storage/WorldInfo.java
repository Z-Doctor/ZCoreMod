package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfd";
		else
			return "net/minecraft/world/storage/WorldInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfd";
		else
			return "WorldInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfd;";
		else
			return "Lnet/minecraft/world/storage/WorldInfo;";
	}

	/**
	 * <p>
	 * Name: setMapFeaturesEnabled
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_176128_f = McMappingDatabase.getSRG("WorldInfo.func_176128_f");

	/**
	 * <p>
	 * Name: setBorderDamagePerBlock
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_176125_f = McMappingDatabase.getSRG("WorldInfo.func_176125_f");

	/**
	 * <p>
	 * Name: borderSizeLerpTime
	 * </p>
	 */
	public static McObfPair field_176147_E = McMappingDatabase.getSRG("field_176147_E");

	/**
	 * <p>
	 * Name: setBorderLerpTime
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_176135_e = McMappingDatabase.getSRG("WorldInfo.func_176135_e");

	/**
	 * <p>
	 * Name: getPlayerNBTTagCompound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_76072_h = McMappingDatabase.getSRG("WorldInfo.func_76072_h");

	/**
	 * <p>
	 * Name: cloneNBTCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_76082_a = McMappingDatabase.getSRG("WorldInfo.func_76082_a");

	/**
	 * <p>
	 * Name: getSpawnZ
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76074_e = McMappingDatabase.getSRG("WorldInfo.func_76074_e");

	/**
	 * <p>
	 * Name: getGameRulesInstance
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameRules;]
	 * </p>
	 */
	public static McObfPair func_82574_x = McMappingDatabase.getSRG("WorldInfo.func_82574_x");

	/**
	 * <p>
	 * Name: spawnX
	 * </p>
	 */
	public static McObfPair field_76099_c = McMappingDatabase.getSRG("field_76099_c");

	/**
	 * <p>
	 * Name: getDimensionData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DimensionType;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_186347_a = McMappingDatabase.getSRG("WorldInfo.func_186347_a");

	/**
	 * <p>
	 * Name: versionSnapshot
	 * </p>
	 */
	public static McObfPair field_186351_d = McMappingDatabase.getSRG("field_186351_d");

	/**
	 * <p>
	 * Name: generatorOptions
	 * </p>
	 */
	public static McObfPair field_82576_c = McMappingDatabase.getSRG("field_82576_c");

	/**
	 * <p>
	 * Name: rainTime
	 * </p>
	 */
	public static McObfPair field_76101_n = McMappingDatabase.getSRG("field_76101_n");

	/**
	 * <p>
	 * Name: setSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_176143_a = McMappingDatabase.getSRG("WorldInfo.func_176143_a");

	/**
	 * <p>
	 * Name: setAllowCommands
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_176121_c = McMappingDatabase.getSRG("WorldInfo.func_176121_c");

	/**
	 * <p>
	 * Name: setWorldName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_76062_a = McMappingDatabase.getSRG("WorldInfo.func_76062_a");

	/**
	 * <p>
	 * Name: lastTimePlayed
	 * </p>
	 */
	public static McObfPair field_76095_g = McMappingDatabase.getSRG("field_76095_g");

	/**
	 * <p>
	 * Name: borderSafeZone
	 * </p>
	 */
	public static McObfPair field_176149_G = McMappingDatabase.getSRG("field_176149_G");

	/**
	 * <p>
	 * Name: terrainType
	 * </p>
	 */
	public static McObfPair field_76098_b = McMappingDatabase.getSRG("field_76098_b");

	/**
	 * <p>
	 * Name: updateTagCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_76064_a = McMappingDatabase.getSRG("WorldInfo.func_76064_a");

	/**
	 * <p>
	 * Name: getWorldTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_76073_f = McMappingDatabase.getSRG("WorldInfo.func_76073_f");

	/**
	 * <p>
	 * Name: setGameType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/GameType;)V]
	 * </p>
	 */
	public static McObfPair func_76060_a = McMappingDatabase.getSRG("WorldInfo.func_76060_a");

	/**
	 * <p>
	 * Name: cleanWeatherTime
	 * </p>
	 */
	public static McObfPair field_176157_p = McMappingDatabase.getSRG("field_176157_p");

	/**
	 * <p>
	 * Name: raining
	 * </p>
	 */
	public static McObfPair field_76104_m = McMappingDatabase.getSRG("field_76104_m");

	/**
	 * <p>
	 * Name: setBorderWarningTime
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_176136_k = McMappingDatabase.getSRG("WorldInfo.func_176136_k");

	/**
	 * <p>
	 * Name: getBorderLerpTarget
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_176132_G = McMappingDatabase.getSRG("WorldInfo.func_176132_G");

	/**
	 * <p>
	 * Name: setBorderWarningDistance
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_176122_j = McMappingDatabase.getSRG("WorldInfo.func_176122_j");

	/**
	 * <p>
	 * Name: getBorderSize
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_176137_E = McMappingDatabase.getSRG("WorldInfo.func_176137_E");

	/**
	 * <p>
	 * Name: getBorderDamagePerBlock
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_176140_I = McMappingDatabase.getSRG("WorldInfo.func_176140_I");

	/**
	 * <p>
	 * Name: setSpawnZ
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_76087_c = McMappingDatabase.getSRG("WorldInfo.func_76087_c");

	/**
	 * <p>
	 * Name: saveVersion
	 * </p>
	 */
	public static McObfPair field_76103_l = McMappingDatabase.getSRG("field_76103_l");

	/**
	 * <p>
	 * Name: setDifficulty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/EnumDifficulty;)V]
	 * </p>
	 */
	public static McObfPair func_176144_a = McMappingDatabase.getSRG("WorldInfo.func_176144_a");

	/**
	 * <p>
	 * Name: gameRules
	 * </p>
	 */
	public static McObfPair field_82577_x = McMappingDatabase.getSRG("field_82577_x");

	/**
	 * <p>
	 * Name: getSizeOnDisk
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_76092_g = McMappingDatabase.getSRG("WorldInfo.func_76092_g");

	/**
	 * <p>
	 * Name: difficulty
	 * </p>
	 */
	public static McObfPair field_176158_z = McMappingDatabase.getSRG("field_176158_z");

	/**
	 * <p>
	 * Name: initialized
	 * </p>
	 */
	public static McObfPair field_76109_u = McMappingDatabase.getSRG("field_76109_u");

	/**
	 * <p>
	 * Name: getBorderCenterX
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_176124_d = McMappingDatabase.getSRG("WorldInfo.func_176124_d");

	/**
	 * <p>
	 * Name: setServerInitialized
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_76091_d = McMappingDatabase.getSRG("WorldInfo.func_76091_d");

	/**
	 * <p>
	 * Name: playerTag
	 * </p>
	 */
	public static McObfPair field_76108_i = McMappingDatabase.getSRG("field_76108_i");

	/**
	 * <p>
	 * Name: populateFromWorldSettings
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldSettings;)V]
	 * </p>
	 */
	public static McObfPair func_176127_a = McMappingDatabase.getSRG("WorldInfo.func_176127_a");

	/**
	 * <p>
	 * Name: setWorldTotalTime
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_82572_b = McMappingDatabase.getSRG("WorldInfo.func_82572_b");

	/**
	 * <p>
	 * Name: setSpawnY
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_76056_b = McMappingDatabase.getSRG("WorldInfo.func_76056_b");

	/**
	 * <p>
	 * Name: gameType
	 * </p>
	 */
	public static McObfPair field_76113_q = McMappingDatabase.getSRG("field_76113_q");

	/**
	 * <p>
	 * Name: getDifficulty
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/EnumDifficulty;]
	 * </p>
	 */
	public static McObfPair func_176130_y = McMappingDatabase.getSRG("WorldInfo.func_176130_y");

	/**
	 * <p>
	 * Name: isHardcoreModeEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76093_s = McMappingDatabase.getSRG("WorldInfo.func_76093_s");

	/**
	 * <p>
	 * Name: isMapFeaturesEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76089_r = McMappingDatabase.getSRG("WorldInfo.func_76089_r");

	/**
	 * <p>
	 * Name: setRainTime
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_76080_g = McMappingDatabase.getSRG("WorldInfo.func_76080_g");

	/**
	 * <p>
	 * Name: borderWarningTime
	 * </p>
	 */
	public static McObfPair field_176155_J = McMappingDatabase.getSRG("field_176155_J");

	/**
	 * <p>
	 * Name: randomSeed
	 * </p>
	 */
	public static McObfPair field_76100_a = McMappingDatabase.getSRG("field_76100_a");

	/**
	 * <p>
	 * Name: versionId
	 * </p>
	 */
	public static McObfPair field_186350_c = McMappingDatabase.getSRG("field_186350_c");

	/**
	 * <p>
	 * Name: borderSize
	 * </p>
	 */
	public static McObfPair field_176146_D = McMappingDatabase.getSRG("field_176146_D");

	/**
	 * <p>
	 * Name: getThunderTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76071_n = McMappingDatabase.getSRG("WorldInfo.func_76071_n");

	/**
	 * <p>
	 * Name: isDifficultyLocked
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_176123_z = McMappingDatabase.getSRG("WorldInfo.func_176123_z");

	/**
	 * <p>
	 * Name: setThundering
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_76069_a = McMappingDatabase.getSRG("WorldInfo.func_76069_a");

	/**
	 * <p>
	 * Name: getTerrainType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/WorldType;]
	 * </p>
	 */
	public static McObfPair func_76067_t = McMappingDatabase.getSRG("WorldInfo.func_76067_t");

	/**
	 * <p>
	 * Name: setWorldTime
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_76068_b = McMappingDatabase.getSRG("WorldInfo.func_76068_b");

	/**
	 * <p>
	 * Name: setCleanWeatherTime
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_176142_i = McMappingDatabase.getSRG("WorldInfo.func_176142_i");

	/**
	 * <p>
	 * Name: getBorderCenterZ
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_176141_c = McMappingDatabase.getSRG("WorldInfo.func_176141_c");

	/**
	 * <p>
	 * Name: allowCommands
	 * </p>
	 */
	public static McObfPair field_76110_t = McMappingDatabase.getSRG("field_76110_t");

	/**
	 * <p>
	 * Name: getVersionName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_186346_M = McMappingDatabase.getSRG("WorldInfo.func_186346_M");

	/**
	 * <p>
	 * Name: getWorldTotalTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_82573_f = McMappingDatabase.getSRG("WorldInfo.func_82573_f");

	/**
	 * <p>
	 * Name: areCommandsAllowed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76086_u = McMappingDatabase.getSRG("WorldInfo.func_76086_u");

	/**
	 * <p>
	 * Name: thunderTime
	 * </p>
	 */
	public static McObfPair field_76114_p = McMappingDatabase.getSRG("field_76114_p");

	/**
	 * <p>
	 * Name: setThunderTime
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_76090_f = McMappingDatabase.getSRG("WorldInfo.func_76090_f");

	/**
	 * <p>
	 * Name: addToCrashReport
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/crash/CrashReportCategory;)V]
	 * </p>
	 */
	public static McObfPair func_85118_a = McMappingDatabase.getSRG("WorldInfo.func_85118_a");

	/**
	 * <p>
	 * Name: mapFeaturesEnabled
	 * </p>
	 */
	public static McObfPair field_76112_r = McMappingDatabase.getSRG("field_76112_r");

	/**
	 * <p>
	 * Name: getWorldName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_76065_j = McMappingDatabase.getSRG("WorldInfo.func_76065_j");

	/**
	 * <p>
	 * Name: getBorderSafeZone
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_176138_H = McMappingDatabase.getSRG("WorldInfo.func_176138_H");

	/**
	 * <p>
	 * Name: borderSizeLerpTarget
	 * </p>
	 */
	public static McObfPair field_176148_F = McMappingDatabase.getSRG("field_176148_F");

	/**
	 * <p>
	 * Name: getLastTimePlayed
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_76057_l = McMappingDatabase.getSRG("WorldInfo.func_76057_l");

	/**
	 * <p>
	 * Name: getGameType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_76077_q = McMappingDatabase.getSRG("WorldInfo.func_76077_q");

	/**
	 * <p>
	 * Name: borderWarningDistance
	 * </p>
	 */
	public static McObfPair field_176154_I = McMappingDatabase.getSRG("field_176154_I");

	/**
	 * <p>
	 * Name: sizeOnDisk
	 * </p>
	 */
	public static McObfPair field_76107_h = McMappingDatabase.getSRG("field_76107_h");

	/**
	 * <p>
	 * Name: getRainTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76083_p = McMappingDatabase.getSRG("WorldInfo.func_76083_p");

	/**
	 * <p>
	 * Name: getBorderWarningDistance
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176131_J = McMappingDatabase.getSRG("WorldInfo.func_176131_J");

	/**
	 * <p>
	 * Name: thundering
	 * </p>
	 */
	public static McObfPair field_76102_o = McMappingDatabase.getSRG("field_76102_o");

	/**
	 * <p>
	 * Name: getSeed
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_76063_b = McMappingDatabase.getSRG("WorldInfo.func_76063_b");

	/**
	 * <p>
	 * Name: getBorderCenterZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_176126_D = McMappingDatabase.getSRG("WorldInfo.func_176126_D");

	/**
	 * <p>
	 * Name: getBorderCenterX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_176120_C = McMappingDatabase.getSRG("WorldInfo.func_176120_C");

	/**
	 * <p>
	 * Name: setBorderSize
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_176145_a = McMappingDatabase.getSRG("WorldInfo.func_176145_a");

	/**
	 * <p>
	 * Name: getBorderWarningTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176139_K = McMappingDatabase.getSRG("WorldInfo.func_176139_K");

	/**
	 * <p>
	 * Name: levelName
	 * </p>
	 */
	public static McObfPair field_76106_k = McMappingDatabase.getSRG("field_76106_k");

	/**
	 * <p>
	 * Name: spawnY
	 * </p>
	 */
	public static McObfPair field_76096_d = McMappingDatabase.getSRG("field_76096_d");

	/**
	 * <p>
	 * Name: getCleanWeatherTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176133_A = McMappingDatabase.getSRG("WorldInfo.func_176133_A");

	/**
	 * <p>
	 * Name: setRaining
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_76084_b = McMappingDatabase.getSRG("WorldInfo.func_76084_b");

	/**
	 * <p>
	 * Name: worldTime
	 * </p>
	 */
	public static McObfPair field_76094_f = McMappingDatabase.getSRG("field_76094_f");

	/**
	 * <p>
	 * Name: setSpawnX
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_76058_a = McMappingDatabase.getSRG("WorldInfo.func_76058_a");

	/**
	 * <p>
	 * Name: dimension
	 * </p>
	 */
	public static McObfPair field_76105_j = McMappingDatabase.getSRG("field_76105_j");

	/**
	 * <p>
	 * Name: getGeneratorOptions
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_82571_y = McMappingDatabase.getSRG("WorldInfo.func_82571_y");

	/**
	 * <p>
	 * Name: spawnZ
	 * </p>
	 */
	public static McObfPair field_76097_e = McMappingDatabase.getSRG("field_76097_e");

	/**
	 * <p>
	 * Name: registerFixes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189967_a = McMappingDatabase.getSRG("WorldInfo.func_189967_a");

	/**
	 * <p>
	 * Name: borderCenterX
	 * </p>
	 */
	public static McObfPair field_176151_B = McMappingDatabase.getSRG("field_176151_B");

	/**
	 * <p>
	 * Name: setDifficultyLocked
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_180783_e = McMappingDatabase.getSRG("WorldInfo.func_180783_e");

	/**
	 * <p>
	 * Name: getBorderLerpTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_176134_F = McMappingDatabase.getSRG("WorldInfo.func_176134_F");

	/**
	 * <p>
	 * Name: dimensionData
	 * </p>
	 */
	public static McObfPair field_186348_N = McMappingDatabase.getSRG("field_186348_N");

	/**
	 * <p>
	 * Name: setBorderSafeZone
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_176129_e = McMappingDatabase.getSRG("WorldInfo.func_176129_e");

	/**
	 * <p>
	 * Name: setSaveVersion
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_76078_e = McMappingDatabase.getSRG("WorldInfo.func_76078_e");

	/**
	 * <p>
	 * Name: setHardcore
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_176119_g = McMappingDatabase.getSRG("WorldInfo.func_176119_g");

	/**
	 * <p>
	 * Name: isThundering
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76061_m = McMappingDatabase.getSRG("WorldInfo.func_76061_m");

	/**
	 * <p>
	 * Name: versionName
	 * </p>
	 */
	public static McObfPair field_186349_b = McMappingDatabase.getSRG("field_186349_b");

	/**
	 * <p>
	 * Name: difficultyLocked
	 * </p>
	 */
	public static McObfPair field_176150_A = McMappingDatabase.getSRG("field_176150_A");

	/**
	 * <p>
	 * Name: borderCenterZ
	 * </p>
	 */
	public static McObfPair field_176152_C = McMappingDatabase.getSRG("field_176152_C");

	/**
	 * <p>
	 * Name: getSaveVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76088_k = McMappingDatabase.getSRG("WorldInfo.func_76088_k");

	/**
	 * <p>
	 * Name: setTerrainType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldType;)V]
	 * </p>
	 */
	public static McObfPair func_76085_a = McMappingDatabase.getSRG("WorldInfo.func_76085_a");

	/**
	 * <p>
	 * Name: isVersionSnapshot
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186343_L = McMappingDatabase.getSRG("WorldInfo.func_186343_L");

	/**
	 * <p>
	 * Name: getVersionId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186344_K = McMappingDatabase.getSRG("WorldInfo.func_186344_K");

	/**
	 * <p>
	 * Name: setBorderLerpTarget
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_176118_b = McMappingDatabase.getSRG("WorldInfo.func_176118_b");

	/**
	 * <p>
	 * Name: setDimensionData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DimensionType;Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_186345_a = McMappingDatabase.getSRG("WorldInfo.func_186345_a");

	/**
	 * <p>
	 * Name: getSpawnX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76079_c = McMappingDatabase.getSRG("WorldInfo.func_76079_c");

	/**
	 * <p>
	 * Name: isRaining
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76059_o = McMappingDatabase.getSRG("WorldInfo.func_76059_o");

	/**
	 * <p>
	 * Name: borderDamagePerBlock
	 * </p>
	 */
	public static McObfPair field_176153_H = McMappingDatabase.getSRG("field_176153_H");

	/**
	 * <p>
	 * Name: DEFAULT_DIFFICULTY
	 * </p>
	 */
	public static McObfPair field_176156_a = McMappingDatabase.getSRG("field_176156_a");

	/**
	 * <p>
	 * Name: hardcore
	 * </p>
	 */
	public static McObfPair field_76111_s = McMappingDatabase.getSRG("field_76111_s");

	/**
	 * <p>
	 * Name: totalTime
	 * </p>
	 */
	public static McObfPair field_82575_g = McMappingDatabase.getSRG("field_82575_g");

	/**
	 * <p>
	 * Name: getSpawnY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76075_d = McMappingDatabase.getSRG("WorldInfo.func_76075_d");

	/**
	 * <p>
	 * Name: isInitialized
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76070_v = McMappingDatabase.getSRG("WorldInfo.func_76070_v");

}

package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DerivedWorldInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfa";
		else
			return "net/minecraft/world/storage/DerivedWorldInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfa";
		else
			return "DerivedWorldInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfa;";
		else
			return "Lnet/minecraft/world/storage/DerivedWorldInfo;";
	}

	/**
	 * <p>
	 * Name: isMapFeaturesEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76089_r = McMappingDatabase.getSRG("DerivedWorldInfo.func_76089_r");

	/**
	 * <p>
	 * Name: getSpawnZ
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76074_e = McMappingDatabase.getSRG("DerivedWorldInfo.func_76074_e");

	/**
	 * <p>
	 * Name: setThunderTime
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_76090_f = McMappingDatabase.getSRG("DerivedWorldInfo.func_76090_f");

	/**
	 * <p>
	 * Name: getDifficulty
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/EnumDifficulty;]
	 * </p>
	 */
	public static McObfPair func_176130_y = McMappingDatabase.getSRG("DerivedWorldInfo.func_176130_y");

	/**
	 * <p>
	 * Name: isInitialized
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76070_v = McMappingDatabase.getSRG("DerivedWorldInfo.func_76070_v");

	/**
	 * <p>
	 * Name: setRaining
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_76084_b = McMappingDatabase.getSRG("DerivedWorldInfo.func_76084_b");

	/**
	 * <p>
	 * Name: getLastTimePlayed
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_76057_l = McMappingDatabase.getSRG("DerivedWorldInfo.func_76057_l");

	/**
	 * <p>
	 * Name: getSizeOnDisk
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_76092_g = McMappingDatabase.getSRG("DerivedWorldInfo.func_76092_g");

	/**
	 * <p>
	 * Name: getThunderTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76071_n = McMappingDatabase.getSRG("DerivedWorldInfo.func_76071_n");

	/**
	 * <p>
	 * Name: setWorldName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_76062_a = McMappingDatabase.getSRG("DerivedWorldInfo.func_76062_a");

	/**
	 * <p>
	 * Name: getWorldName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_76065_j = McMappingDatabase.getSRG("DerivedWorldInfo.func_76065_j");

	/**
	 * <p>
	 * Name: isThundering
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76061_m = McMappingDatabase.getSRG("DerivedWorldInfo.func_76061_m");

	/**
	 * <p>
	 * Name: isHardcoreModeEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76093_s = McMappingDatabase.getSRG("DerivedWorldInfo.func_76093_s");

	/**
	 * <p>
	 * Name: setWorldTotalTime
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_82572_b = McMappingDatabase.getSRG("DerivedWorldInfo.func_82572_b");

	/**
	 * <p>
	 * Name: setServerInitialized
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_76091_d = McMappingDatabase.getSRG("DerivedWorldInfo.func_76091_d");

	/**
	 * <p>
	 * Name: setRainTime
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_76080_g = McMappingDatabase.getSRG("DerivedWorldInfo.func_76080_g");

	/**
	 * <p>
	 * Name: getDimensionData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DimensionType;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_186347_a = McMappingDatabase.getSRG("DerivedWorldInfo.func_186347_a");

	/**
	 * <p>
	 * Name: getSeed
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_76063_b = McMappingDatabase.getSRG("DerivedWorldInfo.func_76063_b");

	/**
	 * <p>
	 * Name: setSaveVersion
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_76078_e = McMappingDatabase.getSRG("DerivedWorldInfo.func_76078_e");

	/**
	 * <p>
	 * Name: setTerrainType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldType;)V]
	 * </p>
	 */
	public static McObfPair func_76085_a = McMappingDatabase.getSRG("DerivedWorldInfo.func_76085_a");

	/**
	 * <p>
	 * Name: setDimensionData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DimensionType;Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_186345_a = McMappingDatabase.getSRG("DerivedWorldInfo.func_186345_a");

	/**
	 * <p>
	 * Name: getGameRulesInstance
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameRules;]
	 * </p>
	 */
	public static McObfPair func_82574_x = McMappingDatabase.getSRG("DerivedWorldInfo.func_82574_x");

	/**
	 * <p>
	 * Name: getGameType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_76077_q = McMappingDatabase.getSRG("DerivedWorldInfo.func_76077_q");

	/**
	 * <p>
	 * Name: getWorldTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_76073_f = McMappingDatabase.getSRG("DerivedWorldInfo.func_76073_f");

	/**
	 * <p>
	 * Name: getTerrainType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/WorldType;]
	 * </p>
	 */
	public static McObfPair func_76067_t = McMappingDatabase.getSRG("DerivedWorldInfo.func_76067_t");

	/**
	 * <p>
	 * Name: setDifficulty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/EnumDifficulty;)V]
	 * </p>
	 */
	public static McObfPair func_176144_a = McMappingDatabase.getSRG("DerivedWorldInfo.func_176144_a");

	/**
	 * <p>
	 * Name: setDifficultyLocked
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_180783_e = McMappingDatabase.getSRG("DerivedWorldInfo.func_180783_e");

	/**
	 * <p>
	 * Name: delegate
	 * </p>
	 */
	public static McObfPair field_76115_a = McMappingDatabase.getSRG("field_76115_a");

	/**
	 * <p>
	 * Name: getSpawnY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76075_d = McMappingDatabase.getSRG("DerivedWorldInfo.func_76075_d");

	/**
	 * <p>
	 * Name: setAllowCommands
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_176121_c = McMappingDatabase.getSRG("DerivedWorldInfo.func_176121_c");

	/**
	 * <p>
	 * Name: setWorldTime
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_76068_b = McMappingDatabase.getSRG("DerivedWorldInfo.func_76068_b");

	/**
	 * <p>
	 * Name: isRaining
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76059_o = McMappingDatabase.getSRG("DerivedWorldInfo.func_76059_o");

	/**
	 * <p>
	 * Name: setThundering
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_76069_a = McMappingDatabase.getSRG("DerivedWorldInfo.func_76069_a");

	/**
	 * <p>
	 * Name: getRainTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76083_p = McMappingDatabase.getSRG("DerivedWorldInfo.func_76083_p");

	/**
	 * <p>
	 * Name: getPlayerNBTTagCompound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_76072_h = McMappingDatabase.getSRG("DerivedWorldInfo.func_76072_h");

	/**
	 * <p>
	 * Name: isDifficultyLocked
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_176123_z = McMappingDatabase.getSRG("DerivedWorldInfo.func_176123_z");

	/**
	 * <p>
	 * Name: areCommandsAllowed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76086_u = McMappingDatabase.getSRG("DerivedWorldInfo.func_76086_u");

	/**
	 * <p>
	 * Name: setSpawnY
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_76056_b = McMappingDatabase.getSRG("DerivedWorldInfo.func_76056_b");

	/**
	 * <p>
	 * Name: getSaveVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76088_k = McMappingDatabase.getSRG("DerivedWorldInfo.func_76088_k");

	/**
	 * <p>
	 * Name: setSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_176143_a = McMappingDatabase.getSRG("DerivedWorldInfo.func_176143_a");

	/**
	 * <p>
	 * Name: setSpawnX
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_76058_a = McMappingDatabase.getSRG("DerivedWorldInfo.func_76058_a");

	/**
	 * <p>
	 * Name: setSpawnZ
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_76087_c = McMappingDatabase.getSRG("DerivedWorldInfo.func_76087_c");

	/**
	 * <p>
	 * Name: cloneNBTCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_76082_a = McMappingDatabase.getSRG("DerivedWorldInfo.func_76082_a");

	/**
	 * <p>
	 * Name: getWorldTotalTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_82573_f = McMappingDatabase.getSRG("DerivedWorldInfo.func_82573_f");

	/**
	 * <p>
	 * Name: getSpawnX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76079_c = McMappingDatabase.getSRG("DerivedWorldInfo.func_76079_c");

}

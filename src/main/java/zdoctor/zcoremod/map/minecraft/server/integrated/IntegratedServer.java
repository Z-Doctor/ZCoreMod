package zdoctor.zcoremod.map.minecraft.server.integrated;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IntegratedServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chd";
		else
			return "net/minecraft/server/integrated/IntegratedServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chd";
		else
			return "IntegratedServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchd;";
		else
			return "Lnet/minecraft/server/integrated/IntegratedServer;";
	}

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_71349_l = McMappingDatabase.getSRG("field_71349_l");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71217_p = McMappingDatabase.getSRG("IntegratedServer.func_71217_p");

	/**
	 * <p>
	 * Name: shouldBroadcastConsoleToOps
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_183002_r = McMappingDatabase.getSRG("IntegratedServer.func_183002_r");

	/**
	 * <p>
	 * Name: getDataDirectory
	 * </p>
	 * <p>
	 * Desc: [()Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_71238_n = McMappingDatabase.getSRG("IntegratedServer.func_71238_n");

	/**
	 * <p>
	 * Name: addServerStatsToSnooper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/profiler/Snooper;)V]
	 * </p>
	 */
	public static McObfPair func_70000_a = McMappingDatabase.getSRG("IntegratedServer.func_70000_a");

	/**
	 * <p>
	 * Name: isSnooperEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70002_Q = McMappingDatabase.getSRG("IntegratedServer.func_70002_Q");

	/**
	 * <p>
	 * Name: stopServer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71260_j = McMappingDatabase.getSRG("IntegratedServer.func_71260_j");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71197_b = McMappingDatabase.getSRG("IntegratedServer.func_71197_b");

	/**
	 * <p>
	 * Name: addServerInfoToCrashReport
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/crash/CrashReport;)Lnet/minecraft/crash/CrashReport;]
	 * </p>
	 */
	public static McObfPair func_71230_b = McMappingDatabase.getSRG("IntegratedServer.func_71230_b");

	/**
	 * <p>
	 * Name: saveAllWorlds
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_71267_a = McMappingDatabase.getSRG("IntegratedServer.func_71267_a");

	/**
	 * <p>
	 * Name: getDifficulty
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/EnumDifficulty;]
	 * </p>
	 */
	public static McObfPair func_147135_j = McMappingDatabase.getSRG("IntegratedServer.func_147135_j");

	/**
	 * <p>
	 * Name: isGamePaused
	 * </p>
	 */
	public static McObfPair field_71348_o = McMappingDatabase.getSRG("field_71348_o");

	/**
	 * <p>
	 * Name: shouldUseNativeTransport
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_181035_ah = McMappingDatabase.getSRG("IntegratedServer.func_181035_ah");

	/**
	 * <p>
	 * Name: initiateShutdown
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71263_m = McMappingDatabase.getSRG("IntegratedServer.func_71263_m");

	/**
	 * <p>
	 * Name: isCommandBlockEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82356_Z = McMappingDatabase.getSRG("IntegratedServer.func_82356_Z");

	/**
	 * <p>
	 * Name: isHardcore
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71199_h = McMappingDatabase.getSRG("IntegratedServer.func_71199_h");

	/**
	 * <p>
	 * Name: setDifficultyForAllWorlds
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/EnumDifficulty;)V]
	 * </p>
	 */
	public static McObfPair func_147139_a = McMappingDatabase.getSRG("IntegratedServer.func_147139_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147148_h = McMappingDatabase.getSRG("field_147148_h");

	/**
	 * <p>
	 * Name: finalTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/crash/CrashReport;)V]
	 * </p>
	 */
	public static McObfPair func_71228_a = McMappingDatabase.getSRG("IntegratedServer.func_71228_a");

	/**
	 * <p>
	 * Name: isDedicatedServer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71262_S = McMappingDatabase.getSRG("IntegratedServer.func_71262_S");

	/**
	 * <p>
	 * Name: setGameType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/GameType;)V]
	 * </p>
	 */
	public static McObfPair func_71235_a = McMappingDatabase.getSRG("IntegratedServer.func_71235_a");

	/**
	 * <p>
	 * Name: canStructuresSpawn
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71225_e = McMappingDatabase.getSRG("IntegratedServer.func_71225_e");

	/**
	 * <p>
	 * Name: createCommandManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/command/ServerCommandManager;]
	 * </p>
	 */
	public static McObfPair func_175582_h = McMappingDatabase.getSRG("IntegratedServer.func_175582_h");

	/**
	 * <p>
	 * Name: lanServerPing
	 * </p>
	 */
	public static McObfPair field_71345_q = McMappingDatabase.getSRG("field_71345_q");

	/**
	 * <p>
	 * Name: worldSettings
	 * </p>
	 */
	public static McObfPair field_71350_m = McMappingDatabase.getSRG("field_71350_m");

	/**
	 * <p>
	 * Name: getGameType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_71265_f = McMappingDatabase.getSRG("IntegratedServer.func_71265_f");

	/**
	 * <p>
	 * Name: isPublic
	 * </p>
	 */
	public static McObfPair field_71346_p = McMappingDatabase.getSRG("field_71346_p");

	/**
	 * <p>
	 * Name: getPublic
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71344_c = McMappingDatabase.getSRG("IntegratedServer.func_71344_c");

	/**
	 * <p>
	 * Name: loadAllWorlds
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;JLnet/minecraft/world/WorldType;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71247_a = McMappingDatabase.getSRG("IntegratedServer.func_71247_a");

	/**
	 * <p>
	 * Name: shouldBroadcastRconToOps
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_181034_q = McMappingDatabase.getSRG("IntegratedServer.func_181034_q");

	/**
	 * <p>
	 * Name: getOpPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110455_j = McMappingDatabase.getSRG("IntegratedServer.func_110455_j");

	/**
	 * <p>
	 * Name: shareToLAN
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/GameType;Z)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71206_a = McMappingDatabase.getSRG("IntegratedServer.func_71206_a");

}

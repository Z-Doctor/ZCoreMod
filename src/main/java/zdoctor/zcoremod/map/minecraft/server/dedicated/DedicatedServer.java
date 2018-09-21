package zdoctor.zcoremod.map.minecraft.server.dedicated;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DedicatedServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nz";
		else
			return "net/minecraft/server/dedicated/DedicatedServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nz";
		else
			return "DedicatedServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnz;";
		else
			return "Lnet/minecraft/server/dedicated/DedicatedServer;";
	}

	/**
	 * <p>
	 * Name: updateTimeLightAndEntities
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71190_q = McMappingDatabase.getSRG("DedicatedServer.func_71190_q");

	/**
	 * <p>
	 * Name: getGameType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_71265_f = McMappingDatabase.getSRG("DedicatedServer.func_71265_f");

	/**
	 * <p>
	 * Name: pendingCommandList
	 * </p>
	 */
	public static McObfPair field_71341_l = McMappingDatabase.getSRG("field_71341_l");

	/**
	 * <p>
	 * Name: getIntProperty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)I]
	 * </p>
	 */
	public static McObfPair func_71327_a = McMappingDatabase.getSRG("DedicatedServer.func_71327_a");

	/**
	 * <p>
	 * Name: shareToLAN
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/GameType;Z)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71206_a = McMappingDatabase.getSRG("DedicatedServer.func_71206_a");

	/**
	 * <p>
	 * Name: getMaxWorldSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_175580_aG = McMappingDatabase.getSRG("DedicatedServer.func_175580_aG");

	/**
	 * <p>
	 * Name: getMotd
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71274_v = McMappingDatabase.getSRG("DedicatedServer.func_71274_v");

	/**
	 * <p>
	 * Name: getBooleanProperty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Z)Z]
	 * </p>
	 */
	public static McObfPair func_71332_a = McMappingDatabase.getSRG("DedicatedServer.func_71332_a");

	/**
	 * <p>
	 * Name: addServerStatsToSnooper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/profiler/Snooper;)V]
	 * </p>
	 */
	public static McObfPair func_70000_a = McMappingDatabase.getSRG("DedicatedServer.func_70000_a");

	/**
	 * <p>
	 * Name: getMaxTickTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_175593_aQ = McMappingDatabase.getSRG("DedicatedServer.func_175593_aQ");

	/**
	 * <p>
	 * Name: getSpawnProtectionSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82357_ak = McMappingDatabase.getSRG("DedicatedServer.func_82357_ak");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_155771_h = McMappingDatabase.getSRG("field_155771_h");

	/**
	 * <p>
	 * Name: setPlayerIdleTimeout
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_143006_e = McMappingDatabase.getSRG("DedicatedServer.func_143006_e");

	/**
	 * <p>
	 * Name: executePendingCommands
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71333_ah = McMappingDatabase.getSRG("DedicatedServer.func_71333_ah");

	/**
	 * <p>
	 * Name: isHardcore
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71199_h = McMappingDatabase.getSRG("DedicatedServer.func_71199_h");

	/**
	 * <p>
	 * Name: isDedicatedServer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71262_S = McMappingDatabase.getSRG("DedicatedServer.func_71262_S");

	/**
	 * <p>
	 * Name: getNetworkCompressionThreshold
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_175577_aI = McMappingDatabase.getSRG("DedicatedServer.func_175577_aI");

	/**
	 * <p>
	 * Name: canSpawnStructures
	 * </p>
	 */
	public static McObfPair field_71338_p = McMappingDatabase.getSRG("field_71338_p");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71197_b = McMappingDatabase.getSRG("DedicatedServer.func_71197_b");

	/**
	 * <p>
	 * Name: canStructuresSpawn
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71225_e = McMappingDatabase.getSRG("DedicatedServer.func_71225_e");

	/**
	 * <p>
	 * Name: settings
	 * </p>
	 */
	public static McObfPair field_71340_o = McMappingDatabase.getSRG("field_71340_o");

	/**
	 * <p>
	 * Name: getPort
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_71234_u = McMappingDatabase.getSRG("DedicatedServer.func_71234_u");

	/**
	 * <p>
	 * Name: sleepFiveSeconds
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_152369_aG = McMappingDatabase.getSRG("DedicatedServer.func_152369_aG");

	/**
	 * <p>
	 * Name: getStringProperty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71330_a = McMappingDatabase.getSRG("DedicatedServer.func_71330_a");

	/**
	 * <p>
	 * Name: setGameType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/GameType;)V]
	 * </p>
	 */
	public static McObfPair func_71235_a = McMappingDatabase.getSRG("DedicatedServer.func_71235_a");

	/**
	 * <p>
	 * Name: setProperty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_71328_a = McMappingDatabase.getSRG("DedicatedServer.func_71328_a");

	/**
	 * <p>
	 * Name: eula
	 * </p>
	 */
	public static McObfPair field_154332_n = McMappingDatabase.getSRG("field_154332_n");

	/**
	 * <p>
	 * Name: gameType
	 * </p>
	 */
	public static McObfPair field_71337_q = McMappingDatabase.getSRG("field_71337_q");

	/**
	 * <p>
	 * Name: getOpPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110455_j = McMappingDatabase.getSRG("DedicatedServer.func_110455_j");

	/**
	 * <p>
	 * Name: getPlugins
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71258_A = McMappingDatabase.getSRG("DedicatedServer.func_71258_A");

	/**
	 * <p>
	 * Name: getDifficulty
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/EnumDifficulty;]
	 * </p>
	 */
	public static McObfPair func_147135_j = McMappingDatabase.getSRG("DedicatedServer.func_147135_j");

	/**
	 * <p>
	 * Name: getGuiEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71279_ae = McMappingDatabase.getSRG("DedicatedServer.func_71279_ae");

	/**
	 * <p>
	 * Name: allowSpawnMonsters
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71193_K = McMappingDatabase.getSRG("DedicatedServer.func_71193_K");

	/**
	 * <p>
	 * Name: addPendingCommand
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/command/ICommandSender;)V]
	 * </p>
	 */
	public static McObfPair func_71331_a = McMappingDatabase.getSRG("DedicatedServer.func_71331_a");

	/**
	 * <p>
	 * Name: systemExitNow
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71240_o = McMappingDatabase.getSRG("DedicatedServer.func_71240_o");

	/**
	 * <p>
	 * Name: setGuiEnabled
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_120011_ar = McMappingDatabase.getSRG("DedicatedServer.func_120011_ar");

	/**
	 * <p>
	 * Name: getHostname
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71277_t = McMappingDatabase.getSRG("DedicatedServer.func_71277_t");

	/**
	 * <p>
	 * Name: saveProperties
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71326_a = McMappingDatabase.getSRG("DedicatedServer.func_71326_a");

	/**
	 * <p>
	 * Name: convertFiles
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_152368_aE = McMappingDatabase.getSRG("DedicatedServer.func_152368_aE");

	/**
	 * <p>
	 * Name: getAllowNether
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71255_r = McMappingDatabase.getSRG("DedicatedServer.func_71255_r");

	/**
	 * <p>
	 * Name: shouldBroadcastRconToOps
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_181034_q = McMappingDatabase.getSRG("DedicatedServer.func_181034_q");

	/**
	 * <p>
	 * Name: rconThread
	 * </p>
	 */
	public static McObfPair field_71339_n = McMappingDatabase.getSRG("field_71339_n");

	/**
	 * <p>
	 * Name: guiIsEnabled
	 * </p>
	 */
	public static McObfPair field_71335_s = McMappingDatabase.getSRG("field_71335_s");

	/**
	 * <p>
	 * Name: RESOURCE_PACK_SHA1_PATTERN
	 * </p>
	 */
	public static McObfPair field_189647_l = McMappingDatabase.getSRG("field_189647_l");

	/**
	 * <p>
	 * Name: getPlayerList
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/dedicated/DedicatedPlayerList;, ()Lnet/minecraft/server/management/PlayerList;]
	 * </p>
	 */
	public static McObfPair func_184103_al = McMappingDatabase.getSRG("DedicatedServer.func_184103_al");

	/**
	 * <p>
	 * Name: isCommandBlockEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82356_Z = McMappingDatabase.getSRG("DedicatedServer.func_82356_Z");

	/**
	 * <p>
	 * Name: getSettingsFilename
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71329_c = McMappingDatabase.getSRG("DedicatedServer.func_71329_c");

	/**
	 * <p>
	 * Name: loadResourcePackSHA
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_184113_aK = McMappingDatabase.getSRG("DedicatedServer.func_184113_aK");

	/**
	 * <p>
	 * Name: isBlockProtected
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_175579_a = McMappingDatabase.getSRG("DedicatedServer.func_175579_a");

	/**
	 * <p>
	 * Name: handleRConCommand
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71252_i = McMappingDatabase.getSRG("DedicatedServer.func_71252_i");

	/**
	 * <p>
	 * Name: shouldUseNativeTransport
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_181035_ah = McMappingDatabase.getSRG("DedicatedServer.func_181035_ah");

	/**
	 * <p>
	 * Name: isSnooperEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70002_Q = McMappingDatabase.getSRG("DedicatedServer.func_70002_Q");

	/**
	 * <p>
	 * Name: shouldBroadcastConsoleToOps
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_183002_r = McMappingDatabase.getSRG("DedicatedServer.func_183002_r");

	/**
	 * <p>
	 * Name: rconConsoleSource
	 * </p>
	 */
	public static McObfPair field_184115_n = McMappingDatabase.getSRG("field_184115_n");

	/**
	 * <p>
	 * Name: rconQueryThread
	 * </p>
	 */
	public static McObfPair field_71342_m = McMappingDatabase.getSRG("field_71342_m");

	/**
	 * <p>
	 * Name: addServerInfoToCrashReport
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/crash/CrashReport;)Lnet/minecraft/crash/CrashReport;]
	 * </p>
	 */
	public static McObfPair func_71230_b = McMappingDatabase.getSRG("DedicatedServer.func_71230_b");

}

package zdoctor.zcoremod.map.minecraft.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MinecraftServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "net/minecraft/server/MinecraftServer";
		else
			return "net/minecraft/server/MinecraftServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "MinecraftServer";
		else
			return "MinecraftServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnet/minecraft/server/MinecraftServer;";
		else
			return "Lnet/minecraft/server/MinecraftServer;";
	}

	/**
	 * <p>
	 * Name: buildLimit
	 * </p>
	 */
	public static McObfPair field_71280_D = McMappingDatabase.getSRG("field_71280_D");

	/**
	 * <p>
	 * Name: isSnooperEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70002_Q = McMappingDatabase.getSRG("MinecraftServer.func_70002_Q");

	/**
	 * <p>
	 * Name: isServerStopped
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71241_aa = McMappingDatabase.getSRG("MinecraftServer.func_71241_aa");

	/**
	 * <p>
	 * Name: setPlayerIdleTimeout
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_143006_e = McMappingDatabase.getSRG("MinecraftServer.func_143006_e");

	/**
	 * <p>
	 * Name: getMaxPlayers
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_71275_y = McMappingDatabase.getSRG("MinecraftServer.func_71275_y");

	/**
	 * <p>
	 * Name: getActiveAnvilConverter
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/storage/ISaveFormat;]
	 * </p>
	 */
	public static McObfPair func_71254_M = McMappingDatabase.getSRG("MinecraftServer.func_71254_M");

	/**
	 * <p>
	 * Name: isAnvilFileSet
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175578_N = McMappingDatabase.getSRG("MinecraftServer.func_175578_N");

	/**
	 * <p>
	 * Name: getOpPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110455_j = McMappingDatabase.getSRG("MinecraftServer.func_110455_j");

	/**
	 * <p>
	 * Name: getEntityWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_130014_f_ = McMappingDatabase.getSRG("MinecraftServer.func_130014_f_");

	/**
	 * <p>
	 * Name: isBlockProtected
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_175579_a = McMappingDatabase.getSRG("MinecraftServer.func_175579_a");

	/**
	 * <p>
	 * Name: logInfo
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71244_g = McMappingDatabase.getSRG("MinecraftServer.func_71244_g");

	/**
	 * <p>
	 * Name: initialWorldChunkLoad
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71222_d = McMappingDatabase.getSRG("MinecraftServer.func_71222_d");

	/**
	 * <p>
	 * Name: convertMapIfNeeded
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71237_c = McMappingDatabase.getSRG("MinecraftServer.func_71237_c");

	/**
	 * <p>
	 * Name: profiler
	 * </p>
	 */
	public static McObfPair field_71304_b = McMappingDatabase.getSRG("field_71304_b");

	/**
	 * <p>
	 * Name: getAdvancementManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/advancements/AdvancementManager;]
	 * </p>
	 */
	public static McObfPair func_191949_aK = McMappingDatabase.getSRG("MinecraftServer.func_191949_aK");

	/**
	 * <p>
	 * Name: currentTime
	 * </p>
	 */
	public static McObfPair field_175591_ab = McMappingDatabase.getSRG("field_175591_ab");

	/**
	 * <p>
	 * Name: getGameType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_71265_f = McMappingDatabase.getSRG("MinecraftServer.func_71265_f");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71197_b = McMappingDatabase.getSRG("MinecraftServer.func_71197_b");

	/**
	 * <p>
	 * Name: isCommandBlockEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82356_Z = McMappingDatabase.getSRG("MinecraftServer.func_82356_Z");

	/**
	 * <p>
	 * Name: getServerStatusResponse
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/ServerStatusResponse;]
	 * </p>
	 */
	public static McObfPair func_147134_at = McMappingDatabase.getSRG("MinecraftServer.func_147134_at");

	/**
	 * <p>
	 * Name: serverPort
	 * </p>
	 */
	public static McObfPair field_71319_s = McMappingDatabase.getSRG("field_71319_s");

	/**
	 * <p>
	 * Name: getNetworkSystem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/NetworkSystem;]
	 * </p>
	 */
	public static McObfPair func_147137_ag = McMappingDatabase.getSRG("MinecraftServer.func_147137_ag");

	/**
	 * <p>
	 * Name: startProfiling
	 * </p>
	 */
	public static McObfPair field_71295_T = McMappingDatabase.getSRG("field_71295_T");

	/**
	 * <p>
	 * Name: serverProxy
	 * </p>
	 */
	public static McObfPair field_110456_c = McMappingDatabase.getSRG("field_110456_c");

	/**
	 * <p>
	 * Name: getServerThread
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Thread;]
	 * </p>
	 */
	public static McObfPair func_175583_aK = McMappingDatabase.getSRG("MinecraftServer.func_175583_aK");

	/**
	 * <p>
	 * Name: authService
	 * </p>
	 */
	public static McObfPair field_152364_T = McMappingDatabase.getSRG("field_152364_T");

	/**
	 * <p>
	 * Name: userMessage
	 * </p>
	 */
	public static McObfPair field_71298_S = McMappingDatabase.getSRG("field_71298_S");

	/**
	 * <p>
	 * Name: stopServer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71260_j = McMappingDatabase.getSRG("MinecraftServer.func_71260_j");

	/**
	 * <p>
	 * Name: getOnlinePlayerProfiles
	 * </p>
	 * <p>
	 * Desc: [()[Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_152357_F = McMappingDatabase.getSRG("MinecraftServer.func_152357_F");

	/**
	 * <p>
	 * Name: serverStopped
	 * </p>
	 */
	public static McObfPair field_71316_v = McMappingDatabase.getSRG("field_71316_v");

	/**
	 * <p>
	 * Name: initiateShutdown
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71263_m = McMappingDatabase.getSRG("MinecraftServer.func_71263_m");

	/**
	 * <p>
	 * Name: setResourcePack
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_180507_a_ = McMappingDatabase.getSRG("MinecraftServer.func_180507_a_");

	/**
	 * <p>
	 * Name: createCommandManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/command/ServerCommandManager;]
	 * </p>
	 */
	public static McObfPair func_175582_h = McMappingDatabase.getSRG("MinecraftServer.func_175582_h");

	/**
	 * <p>
	 * Name: setServerOwner
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71224_l = McMappingDatabase.getSRG("MinecraftServer.func_71224_l");

	/**
	 * <p>
	 * Name: getGameProfileRepository
	 * </p>
	 * <p>
	 * Desc: [()Lcom/mojang/authlib/GameProfileRepository;]
	 * </p>
	 */
	public static McObfPair func_152359_aw = McMappingDatabase.getSRG("MinecraftServer.func_152359_aw");

	/**
	 * <p>
	 * Name: setWorldName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71246_n = McMappingDatabase.getSRG("MinecraftServer.func_71246_n");

	/**
	 * <p>
	 * Name: isDedicatedServer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71262_S = McMappingDatabase.getSRG("MinecraftServer.func_71262_S");

	/**
	 * <p>
	 * Name: isServerInOnlineMode
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71266_T = McMappingDatabase.getSRG("MinecraftServer.func_71266_T");

	/**
	 * <p>
	 * Name: pvpEnabled
	 * </p>
	 */
	public static McObfPair field_71284_A = McMappingDatabase.getSRG("field_71284_A");

	/**
	 * <p>
	 * Name: setUserMessage
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71192_d = McMappingDatabase.getSRG("MinecraftServer.func_71192_d");

	/**
	 * <p>
	 * Name: getGuiEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71279_ae = McMappingDatabase.getSRG("MinecraftServer.func_71279_ae");

	/**
	 * <p>
	 * Name: setAllowFlight
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_71245_h = McMappingDatabase.getSRG("MinecraftServer.func_71245_h");

	/**
	 * <p>
	 * Name: serverRunning
	 * </p>
	 */
	public static McObfPair field_71317_u = McMappingDatabase.getSRG("field_71317_u");

	/**
	 * <p>
	 * Name: setGameType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/GameType;)V]
	 * </p>
	 */
	public static McObfPair func_71235_a = McMappingDatabase.getSRG("MinecraftServer.func_71235_a");

	/**
	 * <p>
	 * Name: getTickCounter
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_71259_af = McMappingDatabase.getSRG("MinecraftServer.func_71259_af");

	/**
	 * <p>
	 * Name: serverThread
	 * </p>
	 */
	public static McObfPair field_175590_aa = McMappingDatabase.getSRG("field_175590_aa");

	/**
	 * <p>
	 * Name: isHardcore
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71199_h = McMappingDatabase.getSRG("MinecraftServer.func_71199_h");

	/**
	 * <p>
	 * Name: setServerPort
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_71208_b = McMappingDatabase.getSRG("MinecraftServer.func_71208_b");

	/**
	 * <p>
	 * Name: isSinglePlayer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71264_H = McMappingDatabase.getSRG("MinecraftServer.func_71264_H");

	/**
	 * <p>
	 * Name: profileCache
	 * </p>
	 */
	public static McObfPair field_152366_X = McMappingDatabase.getSRG("field_152366_X");

	/**
	 * <p>
	 * Name: allowSpawnMonsters
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71193_K = McMappingDatabase.getSRG("MinecraftServer.func_71193_K");

	/**
	 * <p>
	 * Name: random
	 * </p>
	 */
	public static McObfPair field_147146_q = McMappingDatabase.getSRG("field_147146_q");

	/**
	 * <p>
	 * Name: registerTickable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ITickable;)V]
	 * </p>
	 */
	public static McObfPair func_82010_a = McMappingDatabase.getSRG("MinecraftServer.func_82010_a");

	/**
	 * <p>
	 * Name: clearCurrentTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71243_i = McMappingDatabase.getSRG("MinecraftServer.func_71243_i");

	/**
	 * <p>
	 * Name: isCallingFromMinecraftThread
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_152345_ab = McMappingDatabase.getSRG("MinecraftServer.func_152345_ab");

	/**
	 * <p>
	 * Name: getForceGamemode
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_104056_am = McMappingDatabase.getSRG("MinecraftServer.func_104056_am");

	/**
	 * <p>
	 * Name: setKeyPair
	 * </p>
	 * <p>
	 * Desc: [(Ljava/security/KeyPair;)V]
	 * </p>
	 */
	public static McObfPair func_71253_a = McMappingDatabase.getSRG("MinecraftServer.func_71253_a");

	/**
	 * <p>
	 * Name: getMaxPlayerIdleMinutes
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_143007_ar = McMappingDatabase.getSRG("MinecraftServer.func_143007_ar");

	/**
	 * <p>
	 * Name: setDifficultyForAllWorlds
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/EnumDifficulty;)V]
	 * </p>
	 */
	public static McObfPair func_147139_a = McMappingDatabase.getSRG("MinecraftServer.func_147139_a");

	/**
	 * <p>
	 * Name: statusResponse
	 * </p>
	 */
	public static McObfPair field_147147_p = McMappingDatabase.getSRG("field_147147_p");

	/**
	 * <p>
	 * Name: futureTaskQueue
	 * </p>
	 */
	public static McObfPair field_175589_i = McMappingDatabase.getSRG("field_175589_i");

	/**
	 * <p>
	 * Name: shouldBroadcastConsoleToOps
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_183002_r = McMappingDatabase.getSRG("MinecraftServer.func_183002_r");

	/**
	 * <p>
	 * Name: sendCommandFeedback
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174792_t_ = McMappingDatabase.getSRG("MinecraftServer.func_174792_t_");

	/**
	 * <p>
	 * Name: percentDone
	 * </p>
	 */
	public static McObfPair field_71303_e = McMappingDatabase.getSRG("field_71303_e");

	/**
	 * <p>
	 * Name: getDataDirectory
	 * </p>
	 * <p>
	 * Desc: [()Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_71238_n = McMappingDatabase.getSRG("MinecraftServer.func_71238_n");

	/**
	 * <p>
	 * Name: resourcePackHash
	 * </p>
	 */
	public static McObfPair field_175588_P = McMappingDatabase.getSRG("field_175588_P");

	/**
	 * <p>
	 * Name: resourcePackUrl
	 * </p>
	 */
	public static McObfPair field_147141_M = McMappingDatabase.getSRG("field_147141_M");

	/**
	 * <p>
	 * Name: getMinecraftVersion
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71249_w = McMappingDatabase.getSRG("MinecraftServer.func_71249_w");

	/**
	 * <p>
	 * Name: allowFlight
	 * </p>
	 */
	public static McObfPair field_71285_B = McMappingDatabase.getSRG("field_71285_B");

	/**
	 * <p>
	 * Name: serverIsInRunLoop
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71200_ad = McMappingDatabase.getSRG("MinecraftServer.func_71200_ad");

	/**
	 * <p>
	 * Name: canSpawnNPCs
	 * </p>
	 */
	public static McObfPair field_71323_z = McMappingDatabase.getSRG("field_71323_z");

	/**
	 * <p>
	 * Name: getMinecraftSessionService
	 * </p>
	 * <p>
	 * Desc: [()Lcom/mojang/authlib/minecraft/MinecraftSessionService;]
	 * </p>
	 */
	public static McObfPair func_147130_as = McMappingDatabase.getSRG("MinecraftServer.func_147130_as");

	/**
	 * <p>
	 * Name: currentTask
	 * </p>
	 */
	public static McObfPair field_71302_d = McMappingDatabase.getSRG("field_71302_d");

	/**
	 * <p>
	 * Name: setForceGamemode
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_104055_i = McMappingDatabase.getSRG("MinecraftServer.func_104055_i");

	/**
	 * <p>
	 * Name: getCurrentTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_175587_aJ = McMappingDatabase.getSRG("MinecraftServer.func_175587_aJ");

	/**
	 * <p>
	 * Name: worldIconSet
	 * </p>
	 */
	public static McObfPair field_184111_ab = McMappingDatabase.getSRG("field_184111_ab");

	/**
	 * <p>
	 * Name: logSevere
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71201_j = McMappingDatabase.getSRG("MinecraftServer.func_71201_j");

	/**
	 * <p>
	 * Name: canStructuresSpawn
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71225_e = McMappingDatabase.getSRG("MinecraftServer.func_71225_e");

	/**
	 * <p>
	 * Name: getPlayerProfileCache
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/management/PlayerProfileCache;]
	 * </p>
	 */
	public static McObfPair func_152358_ax = McMappingDatabase.getSRG("MinecraftServer.func_152358_ax");

	/**
	 * <p>
	 * Name: setResourcePackFromWorld
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/world/storage/ISaveHandler;)V]
	 * </p>
	 */
	public static McObfPair func_175584_a = McMappingDatabase.getSRG("MinecraftServer.func_175584_a");

	/**
	 * <p>
	 * Name: getResourcePackHash
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_175581_ab = McMappingDatabase.getSRG("MinecraftServer.func_175581_ab");

	/**
	 * <p>
	 * Name: isDemo
	 * </p>
	 */
	public static McObfPair field_71288_M = McMappingDatabase.getSRG("field_71288_M");

	/**
	 * <p>
	 * Name: tickables
	 * </p>
	 */
	public static McObfPair field_71322_p = McMappingDatabase.getSRG("field_71322_p");

	/**
	 * <p>
	 * Name: commandManager
	 * </p>
	 */
	public static McObfPair field_71321_q = McMappingDatabase.getSRG("field_71321_q");

	/**
	 * <p>
	 * Name: isWorldIconSet
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184106_y = McMappingDatabase.getSRG("MinecraftServer.func_184106_y");

	/**
	 * <p>
	 * Name: isServerRunning
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71278_l = McMappingDatabase.getSRG("MinecraftServer.func_71278_l");

	/**
	 * <p>
	 * Name: getCurrentPlayerCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_71233_x = McMappingDatabase.getSRG("MinecraftServer.func_71233_x");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71217_p = McMappingDatabase.getSRG("MinecraftServer.func_71217_p");

	/**
	 * <p>
	 * Name: getServerHostname
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71211_k = McMappingDatabase.getSRG("MinecraftServer.func_71211_k");

	/**
	 * <p>
	 * Name: sendMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_145747_a = McMappingDatabase.getSRG("MinecraftServer.func_145747_a");

	/**
	 * <p>
	 * Name: getPlayerList
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/management/PlayerList;]
	 * </p>
	 */
	public static McObfPair func_184103_al = McMappingDatabase.getSRG("MinecraftServer.func_184103_al");

	/**
	 * <p>
	 * Name: getResourcePackUrl
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_147133_T = McMappingDatabase.getSRG("MinecraftServer.func_147133_T");

	/**
	 * <p>
	 * Name: getOnlinePlayerNames
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71213_z = McMappingDatabase.getSRG("MinecraftServer.func_71213_z");

	/**
	 * <p>
	 * Name: canSpawnAnimals
	 * </p>
	 */
	public static McObfPair field_71324_y = McMappingDatabase.getSRG("field_71324_y");

	/**
	 * <p>
	 * Name: getMOTD
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71273_Y = McMappingDatabase.getSRG("MinecraftServer.func_71273_Y");

	/**
	 * <p>
	 * Name: tickTimeArray
	 * </p>
	 */
	public static McObfPair field_71311_j = McMappingDatabase.getSRG("field_71311_j");

	/**
	 * <p>
	 * Name: callFromMainThread
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/ListenableFuture;]
	 * </p>
	 */
	public static McObfPair func_175586_a = McMappingDatabase.getSRG("MinecraftServer.func_175586_a");

	/**
	 * <p>
	 * Name: getEntityFromUuid
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_175576_a = McMappingDatabase.getSRG("MinecraftServer.func_175576_a");

	/**
	 * <p>
	 * Name: setBuildLimit
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_71191_d = McMappingDatabase.getSRG("MinecraftServer.func_71191_d");

	/**
	 * <p>
	 * Name: getServerPort
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_71215_F = McMappingDatabase.getSRG("MinecraftServer.func_71215_F");

	/**
	 * <p>
	 * Name: addServerTypeToSnooper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/profiler/Snooper;)V]
	 * </p>
	 */
	public static McObfPair func_70001_b = McMappingDatabase.getSRG("MinecraftServer.func_70001_b");

	/**
	 * <p>
	 * Name: isPVPEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71219_W = McMappingDatabase.getSRG("MinecraftServer.func_71219_W");

	/**
	 * <p>
	 * Name: serverKeyPair
	 * </p>
	 */
	public static McObfPair field_71292_I = McMappingDatabase.getSRG("field_71292_I");

	/**
	 * <p>
	 * Name: getWorld
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/world/WorldServer;]
	 * </p>
	 */
	public static McObfPair func_71218_a = McMappingDatabase.getSRG("MinecraftServer.func_71218_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("MinecraftServer.func_70005_c_");

	/**
	 * <p>
	 * Name: getAllowNether
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71255_r = McMappingDatabase.getSRG("MinecraftServer.func_71255_r");

	/**
	 * <p>
	 * Name: logDebug
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71198_k = McMappingDatabase.getSRG("MinecraftServer.func_71198_k");

	/**
	 * <p>
	 * Name: setHostname
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71189_e = McMappingDatabase.getSRG("MinecraftServer.func_71189_e");

	/**
	 * <p>
	 * Name: shouldUseNativeTransport
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_181035_ah = McMappingDatabase.getSRG("MinecraftServer.func_181035_ah");

	/**
	 * <p>
	 * Name: getDifficulty
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/EnumDifficulty;]
	 * </p>
	 */
	public static McObfPair func_147135_j = McMappingDatabase.getSRG("MinecraftServer.func_147135_j");

	/**
	 * <p>
	 * Name: getFunctionManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/advancements/FunctionManager;]
	 * </p>
	 */
	public static McObfPair func_193030_aL = McMappingDatabase.getSRG("MinecraftServer.func_193030_aL");

	/**
	 * <p>
	 * Name: canUseCommand
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_70003_b = McMappingDatabase.getSRG("MinecraftServer.func_70003_b");

	/**
	 * <p>
	 * Name: finalTick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/crash/CrashReport;)V]
	 * </p>
	 */
	public static McObfPair func_71228_a = McMappingDatabase.getSRG("MinecraftServer.func_71228_a");

	/**
	 * <p>
	 * Name: serverOwner
	 * </p>
	 */
	public static McObfPair field_71293_J = McMappingDatabase.getSRG("field_71293_J");

	/**
	 * <p>
	 * Name: logWarning
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71236_h = McMappingDatabase.getSRG("MinecraftServer.func_71236_h");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147145_h = McMappingDatabase.getSRG("field_147145_h");

	/**
	 * <p>
	 * Name: reload
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193031_aM = McMappingDatabase.getSRG("MinecraftServer.func_193031_aM");

	/**
	 * <p>
	 * Name: shouldBroadcastRconToOps
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_181034_q = McMappingDatabase.getSRG("MinecraftServer.func_181034_q");

	/**
	 * <p>
	 * Name: onlineMode
	 * </p>
	 */
	public static McObfPair field_71325_x = McMappingDatabase.getSRG("field_71325_x");

	/**
	 * <p>
	 * Name: serverIsRunning
	 * </p>
	 */
	public static McObfPair field_71296_Q = McMappingDatabase.getSRG("field_71296_Q");

	/**
	 * <p>
	 * Name: networkSystem
	 * </p>
	 */
	public static McObfPair field_147144_o = McMappingDatabase.getSRG("field_147144_o");

	/**
	 * <p>
	 * Name: USER_CACHE_FILE
	 * </p>
	 */
	public static McObfPair field_152367_a = McMappingDatabase.getSRG("field_152367_a");

	/**
	 * <p>
	 * Name: canCreateBonusChest
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_71194_c = McMappingDatabase.getSRG("MinecraftServer.func_71194_c");

	/**
	 * <p>
	 * Name: setFolderName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71261_m = McMappingDatabase.getSRG("MinecraftServer.func_71261_m");

	/**
	 * <p>
	 * Name: folderName
	 * </p>
	 */
	public static McObfPair field_71294_K = McMappingDatabase.getSRG("field_71294_K");

	/**
	 * <p>
	 * Name: worlds
	 * </p>
	 */
	public static McObfPair field_71305_c = McMappingDatabase.getSRG("field_71305_c");

	/**
	 * <p>
	 * Name: shareToLAN
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/GameType;Z)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71206_a = McMappingDatabase.getSRG("MinecraftServer.func_71206_a");

	/**
	 * <p>
	 * Name: getSpawnProtectionSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82357_ak = McMappingDatabase.getSRG("MinecraftServer.func_82357_ak");

	/**
	 * <p>
	 * Name: worldName
	 * </p>
	 */
	public static McObfPair field_71287_L = McMappingDatabase.getSRG("field_71287_L");

	/**
	 * <p>
	 * Name: getFolderName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71270_I = McMappingDatabase.getSRG("MinecraftServer.func_71270_I");

	/**
	 * <p>
	 * Name: hostname
	 * </p>
	 */
	public static McObfPair field_71320_r = McMappingDatabase.getSRG("field_71320_r");

	/**
	 * <p>
	 * Name: timeOfLastDimensionTick
	 * </p>
	 */
	public static McObfPair field_71312_k = McMappingDatabase.getSRG("field_71312_k");

	/**
	 * <p>
	 * Name: getMaxWorldSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_175580_aG = McMappingDatabase.getSRG("MinecraftServer.func_175580_aG");

	/**
	 * <p>
	 * Name: setCanSpawnAnimals
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_71251_e = McMappingDatabase.getSRG("MinecraftServer.func_71251_e");

	/**
	 * <p>
	 * Name: getWorldIconFile
	 * </p>
	 * <p>
	 * Desc: [()Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_184109_z = McMappingDatabase.getSRG("MinecraftServer.func_184109_z");

	/**
	 * <p>
	 * Name: getServerOwner
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71214_G = McMappingDatabase.getSRG("MinecraftServer.func_71214_G");

	/**
	 * <p>
	 * Name: isDemo
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71242_L = McMappingDatabase.getSRG("MinecraftServer.func_71242_L");

	/**
	 * <p>
	 * Name: getCurrentTimeMillis
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_130071_aq = McMappingDatabase.getSRG("MinecraftServer.func_130071_aq");

	/**
	 * <p>
	 * Name: getCommandManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/command/ICommandManager;]
	 * </p>
	 */
	public static McObfPair func_71187_D = McMappingDatabase.getSRG("MinecraftServer.func_71187_D");

	/**
	 * <p>
	 * Name: getPlayerUsageSnooper
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/profiler/Snooper;]
	 * </p>
	 */
	public static McObfPair func_80003_ah = McMappingDatabase.getSRG("MinecraftServer.func_80003_ah");

	/**
	 * <p>
	 * Name: setOnlineMode
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_71229_d = McMappingDatabase.getSRG("MinecraftServer.func_71229_d");

	/**
	 * <p>
	 * Name: refreshStatusNextTick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147132_au = McMappingDatabase.getSRG("MinecraftServer.func_147132_au");

	/**
	 * <p>
	 * Name: getFile
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_71209_f = McMappingDatabase.getSRG("MinecraftServer.func_71209_f");

	/**
	 * <p>
	 * Name: getTabCompletions
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;Z)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184104_a = McMappingDatabase.getSRG("MinecraftServer.func_184104_a");

	/**
	 * <p>
	 * Name: setAllowPvp
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_71188_g = McMappingDatabase.getSRG("MinecraftServer.func_71188_g");

	/**
	 * <p>
	 * Name: updateTimeLightAndEntities
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71190_q = McMappingDatabase.getSRG("MinecraftServer.func_71190_q");

	/**
	 * <p>
	 * Name: systemExitNow
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71240_o = McMappingDatabase.getSRG("MinecraftServer.func_71240_o");

	/**
	 * <p>
	 * Name: anvilFile
	 * </p>
	 */
	public static McObfPair field_71308_o = McMappingDatabase.getSRG("field_71308_o");

	/**
	 * <p>
	 * Name: getUserMessage
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71195_b_ = McMappingDatabase.getSRG("MinecraftServer.func_71195_b_");

	/**
	 * <p>
	 * Name: enableProfiling
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71223_ag = McMappingDatabase.getSRG("MinecraftServer.func_71223_ag");

	/**
	 * <p>
	 * Name: sessionService
	 * </p>
	 */
	public static McObfPair field_147143_S = McMappingDatabase.getSRG("field_147143_S");

	/**
	 * <p>
	 * Name: getKeyPair
	 * </p>
	 * <p>
	 * Desc: [()Ljava/security/KeyPair;]
	 * </p>
	 */
	public static McObfPair func_71250_E = McMappingDatabase.getSRG("MinecraftServer.func_71250_E");

	/**
	 * <p>
	 * Name: preventProxyConnections
	 * </p>
	 */
	public static McObfPair field_190519_A = McMappingDatabase.getSRG("field_190519_A");

	/**
	 * <p>
	 * Name: getWorldName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71221_J = McMappingDatabase.getSRG("MinecraftServer.func_71221_J");

	/**
	 * <p>
	 * Name: applyServerIconToResponse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/ServerStatusResponse;)V]
	 * </p>
	 */
	public static McObfPair func_184107_a = McMappingDatabase.getSRG("MinecraftServer.func_184107_a");

	/**
	 * <p>
	 * Name: addServerInfoToCrashReport
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/crash/CrashReport;)Lnet/minecraft/crash/CrashReport;]
	 * </p>
	 */
	public static McObfPair func_71230_b = McMappingDatabase.getSRG("MinecraftServer.func_71230_b");

	/**
	 * <p>
	 * Name: saveAllWorlds
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_71267_a = McMappingDatabase.getSRG("MinecraftServer.func_71267_a");

	/**
	 * <p>
	 * Name: nanoTimeSinceStatusRefresh
	 * </p>
	 */
	public static McObfPair field_147142_T = McMappingDatabase.getSRG("field_147142_T");

	/**
	 * <p>
	 * Name: getServer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/MinecraftServer;]
	 * </p>
	 */
	public static McObfPair func_184102_h = McMappingDatabase.getSRG("MinecraftServer.func_184102_h");

	/**
	 * <p>
	 * Name: addServerStatsToSnooper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/profiler/Snooper;)V]
	 * </p>
	 */
	public static McObfPair func_70000_a = McMappingDatabase.getSRG("MinecraftServer.func_70000_a");

	/**
	 * <p>
	 * Name: timeOfLastWarning
	 * </p>
	 */
	public static McObfPair field_71299_R = McMappingDatabase.getSRG("field_71299_R");

	/**
	 * <p>
	 * Name: motd
	 * </p>
	 */
	public static McObfPair field_71286_C = McMappingDatabase.getSRG("field_71286_C");

	/**
	 * <p>
	 * Name: getNetworkCompressionThreshold
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_175577_aI = McMappingDatabase.getSRG("MinecraftServer.func_175577_aI");

	/**
	 * <p>
	 * Name: isDebuggingEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71239_B = McMappingDatabase.getSRG("MinecraftServer.func_71239_B");

	/**
	 * <p>
	 * Name: outputPercentRemaining
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)V]
	 * </p>
	 */
	public static McObfPair func_71216_a_ = McMappingDatabase.getSRG("MinecraftServer.func_71216_a_");

	/**
	 * <p>
	 * Name: addScheduledTask
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;]
	 * </p>
	 */
	public static McObfPair func_152344_a = McMappingDatabase.getSRG("MinecraftServer.func_152344_a");

	/**
	 * <p>
	 * Name: getServerProxy
	 * </p>
	 * <p>
	 * Desc: [()Ljava/net/Proxy;]
	 * </p>
	 */
	public static McObfPair func_110454_ao = McMappingDatabase.getSRG("MinecraftServer.func_110454_ao");

	/**
	 * <p>
	 * Name: setDemo
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_71204_b = McMappingDatabase.getSRG("MinecraftServer.func_71204_b");

	/**
	 * <p>
	 * Name: enableBonusChest
	 * </p>
	 */
	public static McObfPair field_71289_N = McMappingDatabase.getSRG("field_71289_N");

	/**
	 * <p>
	 * Name: playerList
	 * </p>
	 */
	public static McObfPair field_71318_t = McMappingDatabase.getSRG("field_71318_t");

	/**
	 * <p>
	 * Name: getBuildLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_71207_Z = McMappingDatabase.getSRG("MinecraftServer.func_71207_Z");

	/**
	 * <p>
	 * Name: loadAllWorlds
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;JLnet/minecraft/world/WorldType;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71247_a = McMappingDatabase.getSRG("MinecraftServer.func_71247_a");

	/**
	 * <p>
	 * Name: isGamemodeForced
	 * </p>
	 */
	public static McObfPair field_104057_T = McMappingDatabase.getSRG("field_104057_T");

	/**
	 * <p>
	 * Name: getCanSpawnAnimals
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71268_U = McMappingDatabase.getSRG("MinecraftServer.func_71268_U");

	/**
	 * <p>
	 * Name: anvilConverterForAnvilFile
	 * </p>
	 */
	public static McObfPair field_71310_m = McMappingDatabase.getSRG("field_71310_m");

	/**
	 * <p>
	 * Name: setPlayerList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/management/PlayerList;)V]
	 * </p>
	 */
	public static McObfPair func_184105_a = McMappingDatabase.getSRG("MinecraftServer.func_184105_a");

	/**
	 * <p>
	 * Name: maxPlayerIdleMinutes
	 * </p>
	 */
	public static McObfPair field_143008_E = McMappingDatabase.getSRG("field_143008_E");

	/**
	 * <p>
	 * Name: getCanSpawnNPCs
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71220_V = McMappingDatabase.getSRG("MinecraftServer.func_71220_V");

	/**
	 * <p>
	 * Name: setPreventProxyConnections
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_190517_e = McMappingDatabase.getSRG("MinecraftServer.func_190517_e");

	/**
	 * <p>
	 * Name: isFlightAllowed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71231_X = McMappingDatabase.getSRG("MinecraftServer.func_71231_X");

	/**
	 * <p>
	 * Name: setMOTD
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71205_p = McMappingDatabase.getSRG("MinecraftServer.func_71205_p");

	/**
	 * <p>
	 * Name: startServerThread
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71256_s = McMappingDatabase.getSRG("MinecraftServer.func_71256_s");

	/**
	 * <p>
	 * Name: profileRepo
	 * </p>
	 */
	public static McObfPair field_152365_W = McMappingDatabase.getSRG("field_152365_W");

	/**
	 * <p>
	 * Name: getPreventProxyConnections
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190518_ac = McMappingDatabase.getSRG("MinecraftServer.func_190518_ac");

	/**
	 * <p>
	 * Name: tickCounter
	 * </p>
	 */
	public static McObfPair field_71315_w = McMappingDatabase.getSRG("field_71315_w");

	/**
	 * <p>
	 * Name: dataFixer
	 * </p>
	 */
	public static McObfPair field_184112_s = McMappingDatabase.getSRG("field_184112_s");

	/**
	 * <p>
	 * Name: setCanSpawnNPCs
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_71257_f = McMappingDatabase.getSRG("MinecraftServer.func_71257_f");

	/**
	 * <p>
	 * Name: getSpawnRadius
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldServer;)I]
	 * </p>
	 */
	public static McObfPair func_184108_a = McMappingDatabase.getSRG("MinecraftServer.func_184108_a");

	/**
	 * <p>
	 * Name: usageSnooper
	 * </p>
	 */
	public static McObfPair field_71307_n = McMappingDatabase.getSRG("field_71307_n");

}

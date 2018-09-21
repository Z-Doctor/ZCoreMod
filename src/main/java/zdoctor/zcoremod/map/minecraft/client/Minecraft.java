package zdoctor.zcoremod.map.minecraft.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Minecraft {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bib";
		else
			return "net/minecraft/client/Minecraft";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bib";
		else
			return "Minecraft";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbib;";
		else
			return "Lnet/minecraft/client/Minecraft;";
	}

	/**
	 * <p>
	 * Name: isGamePaused
	 * </p>
	 */
	public static McObfPair field_71445_n = McMappingDatabase.getSRG("field_71445_n");

	/**
	 * <p>
	 * Name: getItemRenderer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/ItemRenderer;]
	 * </p>
	 */
	public static McObfPair func_175597_ag = McMappingDatabase.getSRG("Minecraft.func_175597_ag");

	/**
	 * <p>
	 * Name: rightClickMouse
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147121_ag = McMappingDatabase.getSRG("Minecraft.func_147121_ag");

	/**
	 * <p>
	 * Name: mcResourcePackRepository
	 * </p>
	 */
	public static McObfPair field_110448_aq = McMappingDatabase.getSRG("field_110448_aq");

	/**
	 * <p>
	 * Name: getConnection
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/network/NetHandlerPlayClient;]
	 * </p>
	 */
	public static McObfPair func_147114_u = McMappingDatabase.getSRG("Minecraft.func_147114_u");

	/**
	 * <p>
	 * Name: renderPartialTicksPaused
	 * </p>
	 */
	public static McObfPair field_193996_ah = McMappingDatabase.getSRG("field_193996_ah");

	/**
	 * <p>
	 * Name: actionKeyF3
	 * </p>
	 */
	public static McObfPair field_184129_aV = McMappingDatabase.getSRG("field_184129_aV");

	/**
	 * <p>
	 * Name: populateSearchTreeManager
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193986_ar = McMappingDatabase.getSRG("Minecraft.func_193986_ar");

	/**
	 * <p>
	 * Name: debugCrashKeyPressTime
	 * </p>
	 */
	public static McObfPair field_83002_am = McMappingDatabase.getSRG("field_83002_am");

	/**
	 * <p>
	 * Name: skipRenderWorld
	 * </p>
	 */
	public static McObfPair field_71454_w = McMappingDatabase.getSRG("field_71454_w");

	/**
	 * <p>
	 * Name: getSoundHandler
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/audio/SoundHandler;]
	 * </p>
	 */
	public static McObfPair func_147118_V = McMappingDatabase.getSRG("Minecraft.func_147118_V");

	/**
	 * <p>
	 * Name: displayInGameMenu
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71385_j = McMappingDatabase.getSRG("Minecraft.func_71385_j");

	/**
	 * <p>
	 * Name: middleClickMouse
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147112_ai = McMappingDatabase.getSRG("Minecraft.func_147112_ai");

	/**
	 * <p>
	 * Name: isAmbientOcclusionEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71379_u = McMappingDatabase.getSRG("Minecraft.func_71379_u");

	/**
	 * <p>
	 * Name: toastGui
	 * </p>
	 */
	public static McObfPair field_193034_aS = McMappingDatabase.getSRG("field_193034_aS");

	/**
	 * <p>
	 * Name: framebufferMc
	 * </p>
	 */
	public static McObfPair field_147124_at = McMappingDatabase.getSRG("field_147124_at");

	/**
	 * <p>
	 * Name: gameSettings
	 * </p>
	 */
	public static McObfPair field_71474_y = McMappingDatabase.getSRG("field_71474_y");

	/**
	 * <p>
	 * Name: loadingScreen
	 * </p>
	 */
	public static McObfPair field_71461_s = McMappingDatabase.getSRG("field_71461_s");

	/**
	 * <p>
	 * Name: itemRenderer
	 * </p>
	 */
	public static McObfPair field_175620_Y = McMappingDatabase.getSRG("field_175620_Y");

	/**
	 * <p>
	 * Name: session
	 * </p>
	 */
	public static McObfPair field_71449_j = McMappingDatabase.getSRG("field_71449_j");

	/**
	 * <p>
	 * Name: fileAssets
	 * </p>
	 */
	public static McObfPair field_110446_Y = McMappingDatabase.getSRG("field_110446_Y");

	/**
	 * <p>
	 * Name: inGameHasFocus
	 * </p>
	 */
	public static McObfPair field_71415_G = McMappingDatabase.getSRG("field_71415_G");

	/**
	 * <p>
	 * Name: fontRenderer
	 * </p>
	 */
	public static McObfPair field_71466_p = McMappingDatabase.getSRG("field_71466_p");

	/**
	 * <p>
	 * Name: serverName
	 * </p>
	 */
	public static McObfPair field_71475_ae = McMappingDatabase.getSRG("field_71475_ae");

	/**
	 * <p>
	 * Name: dataFixer
	 * </p>
	 */
	public static McObfPair field_184131_U = McMappingDatabase.getSRG("field_184131_U");

	/**
	 * <p>
	 * Name: runTickMouse
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184124_aB = McMappingDatabase.getSRG("Minecraft.func_184124_aB");

	/**
	 * <p>
	 * Name: LOCATION_MOJANG_PNG
	 * </p>
	 */
	public static McObfPair field_110444_H = McMappingDatabase.getSRG("field_110444_H");

	/**
	 * <p>
	 * Name: getDebugFPS
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_175610_ah = McMappingDatabase.getSRG("Minecraft.func_175610_ah");

	/**
	 * <p>
	 * Name: mcProfiler
	 * </p>
	 */
	public static McObfPair field_71424_I = McMappingDatabase.getSRG("field_71424_I");

	/**
	 * <p>
	 * Name: MAC_DISPLAY_MODES
	 * </p>
	 */
	public static McObfPair field_110445_I = McMappingDatabase.getSRG("field_110445_I");

	/**
	 * <p>
	 * Name: versionType
	 * </p>
	 */
	public static McObfPair field_184130_ao = McMappingDatabase.getSRG("field_184130_ao");

	/**
	 * <p>
	 * Name: getResourcePackRepository
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/resources/ResourcePackRepository;]
	 * </p>
	 */
	public static McObfPair func_110438_M = McMappingDatabase.getSRG("Minecraft.func_110438_M");

	/**
	 * <p>
	 * Name: debugFeedbackTranslated
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;[Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_190521_a = McMappingDatabase.getSRG("Minecraft.func_190521_a");

	/**
	 * <p>
	 * Name: saveLoader
	 * </p>
	 */
	public static McObfPair field_71469_aa = McMappingDatabase.getSRG("field_71469_aa");

	/**
	 * <p>
	 * Name: mouseHelper
	 * </p>
	 */
	public static McObfPair field_71417_B = McMappingDatabase.getSRG("field_71417_B");

	/**
	 * <p>
	 * Name: isIntegratedServerRunning
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71387_A = McMappingDatabase.getSRG("Minecraft.func_71387_A");

	/**
	 * <p>
	 * Name: debug
	 * </p>
	 */
	public static McObfPair field_71426_K = McMappingDatabase.getSRG("field_71426_K");

	/**
	 * <p>
	 * Name: getTutorial
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/tutorial/Tutorial;]
	 * </p>
	 */
	public static McObfPair func_193032_ao = McMappingDatabase.getSRG("Minecraft.func_193032_ao");

	/**
	 * <p>
	 * Name: modelManager
	 * </p>
	 */
	public static McObfPair field_175617_aL = McMappingDatabase.getSRG("field_175617_aL");

	/**
	 * <p>
	 * Name: debugFPS
	 * </p>
	 */
	public static McObfPair field_71470_ab = McMappingDatabase.getSRG("field_71470_ab");

	/**
	 * <p>
	 * Name: mcMusicTicker
	 * </p>
	 */
	public static McObfPair field_147126_aw = McMappingDatabase.getSRG("field_147126_aw");

	/**
	 * <p>
	 * Name: getRenderItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/RenderItem;]
	 * </p>
	 */
	public static McObfPair func_175599_af = McMappingDatabase.getSRG("Minecraft.func_175599_af");

	/**
	 * <p>
	 * Name: setInitialDisplayMode
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175605_an = McMappingDatabase.getSRG("Minecraft.func_175605_an");

	/**
	 * <p>
	 * Name: isSingleplayer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71356_B = McMappingDatabase.getSRG("Minecraft.func_71356_B");

	/**
	 * <p>
	 * Name: startNanoTime
	 * </p>
	 */
	public static McObfPair field_181543_z = McMappingDatabase.getSRG("field_181543_z");

	/**
	 * <p>
	 * Name: run
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_99999_d = McMappingDatabase.getSRG("Minecraft.func_99999_d");

	/**
	 * <p>
	 * Name: setConnectedToRealms
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_181537_a = McMappingDatabase.getSRG("Minecraft.func_181537_a");

	/**
	 * <p>
	 * Name: addScheduledTask
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;]
	 * </p>
	 */
	public static McObfPair func_152344_a = McMappingDatabase.getSRG("Minecraft.func_152344_a");

	/**
	 * <p>
	 * Name: getLanguageManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/resources/LanguageManager;]
	 * </p>
	 */
	public static McObfPair func_135016_M = McMappingDatabase.getSRG("Minecraft.func_135016_M");

	/**
	 * <p>
	 * Name: getRenderViewEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_175606_aa = McMappingDatabase.getSRG("Minecraft.func_175606_aa");

	/**
	 * <p>
	 * Name: creativeSettings
	 * </p>
	 */
	public static McObfPair field_191950_u = McMappingDatabase.getSRG("field_191950_u");

	/**
	 * <p>
	 * Name: freeMemory
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71398_f = McMappingDatabase.getSRG("Minecraft.func_71398_f");

	/**
	 * <p>
	 * Name: mcThread
	 * </p>
	 */
	public static McObfPair field_152352_aC = McMappingDatabase.getSRG("field_152352_aC");

	/**
	 * <p>
	 * Name: addServerStatsToSnooper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/profiler/Snooper;)V]
	 * </p>
	 */
	public static McObfPair func_70000_a = McMappingDatabase.getSRG("Minecraft.func_70000_a");

	/**
	 * <p>
	 * Name: currentServerData
	 * </p>
	 */
	public static McObfPair field_71422_O = McMappingDatabase.getSRG("field_71422_O");

	/**
	 * <p>
	 * Name: renderChunksMany
	 * </p>
	 */
	public static McObfPair field_175612_E = McMappingDatabase.getSRG("field_175612_E");

	/**
	 * <p>
	 * Name: connectedToRealms
	 * </p>
	 */
	public static McObfPair field_181541_X = McMappingDatabase.getSRG("field_181541_X");

	/**
	 * <p>
	 * Name: setWindowIcon
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175594_ao = McMappingDatabase.getSRG("Minecraft.func_175594_ao");

	/**
	 * <p>
	 * Name: sendClickBlockToController
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_147115_a = McMappingDatabase.getSRG("Minecraft.func_147115_a");

	/**
	 * <p>
	 * Name: integratedServer
	 * </p>
	 */
	public static McObfPair field_71437_Z = McMappingDatabase.getSRG("field_71437_Z");

	/**
	 * <p>
	 * Name: getSaveLoader
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/storage/ISaveFormat;]
	 * </p>
	 */
	public static McObfPair func_71359_d = McMappingDatabase.getSRG("Minecraft.func_71359_d");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_71441_e = McMappingDatabase.getSRG("field_71441_e");

	/**
	 * <p>
	 * Name: setDimensionAndSpawnPlayer
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_71354_a = McMappingDatabase.getSRG("Minecraft.func_71354_a");

	/**
	 * <p>
	 * Name: getBlockRendererDispatcher
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/BlockRendererDispatcher;]
	 * </p>
	 */
	public static McObfPair func_175602_ab = McMappingDatabase.getSRG("Minecraft.func_175602_ab");

	/**
	 * <p>
	 * Name: renderGlobal
	 * </p>
	 */
	public static McObfPair field_71438_f = McMappingDatabase.getSRG("field_71438_f");

	/**
	 * <p>
	 * Name: running
	 * </p>
	 */
	public static McObfPair field_71425_J = McMappingDatabase.getSRG("field_71425_J");

	/**
	 * <p>
	 * Name: blockRenderDispatcher
	 * </p>
	 */
	public static McObfPair field_175618_aM = McMappingDatabase.getSRG("field_175618_aM");

	/**
	 * <p>
	 * Name: getProxy
	 * </p>
	 * <p>
	 * Desc: [()Ljava/net/Proxy;]
	 * </p>
	 */
	public static McObfPair func_110437_J = McMappingDatabase.getSRG("Minecraft.func_110437_J");

	/**
	 * <p>
	 * Name: itemColors
	 * </p>
	 */
	public static McObfPair field_184128_aI = McMappingDatabase.getSRG("field_184128_aI");

	/**
	 * <p>
	 * Name: getResourceManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/resources/IResourceManager;]
	 * </p>
	 */
	public static McObfPair func_110442_L = McMappingDatabase.getSRG("Minecraft.func_110442_L");

	/**
	 * <p>
	 * Name: clickMouse
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147116_af = McMappingDatabase.getSRG("Minecraft.func_147116_af");

	/**
	 * <p>
	 * Name: getVersionType
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_184123_d = McMappingDatabase.getSRG("Minecraft.func_184123_d");

	/**
	 * <p>
	 * Name: getTextureMapBlocks
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/texture/TextureMap;]
	 * </p>
	 */
	public static McObfPair func_147117_R = McMappingDatabase.getSRG("Minecraft.func_147117_R");

	/**
	 * <p>
	 * Name: proxy
	 * </p>
	 */
	public static McObfPair field_110453_aa = McMappingDatabase.getSRG("field_110453_aa");

	/**
	 * <p>
	 * Name: displayCrashReport
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/crash/CrashReport;)V]
	 * </p>
	 */
	public static McObfPair func_71377_b = McMappingDatabase.getSRG("Minecraft.func_71377_b");

	/**
	 * <p>
	 * Name: renderItem
	 * </p>
	 */
	public static McObfPair field_175621_X = McMappingDatabase.getSRG("field_175621_X");

	/**
	 * <p>
	 * Name: getAmbientMusicType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/audio/MusicTicker$MusicType;]
	 * </p>
	 */
	public static McObfPair func_147109_W = McMappingDatabase.getSRG("Minecraft.func_147109_W");

	/**
	 * <p>
	 * Name: getFramebuffer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/shader/Framebuffer;]
	 * </p>
	 */
	public static McObfPair func_147110_a = McMappingDatabase.getSRG("Minecraft.func_147110_a");

	/**
	 * <p>
	 * Name: addScheduledTask
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/ListenableFuture;]
	 * </p>
	 */
	public static McObfPair func_152343_a = McMappingDatabase.getSRG("Minecraft.func_152343_a");

	/**
	 * <p>
	 * Name: debugRenderer
	 * </p>
	 */
	public static McObfPair field_184132_p = McMappingDatabase.getSRG("field_184132_p");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_71439_g = McMappingDatabase.getSRG("field_71439_g");

	/**
	 * <p>
	 * Name: runTick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71407_l = McMappingDatabase.getSRG("Minecraft.func_71407_l");

	/**
	 * <p>
	 * Name: memoryReserve
	 * </p>
	 */
	public static McObfPair field_71444_a = McMappingDatabase.getSRG("field_71444_a");

	/**
	 * <p>
	 * Name: fileResourcepacks
	 * </p>
	 */
	public static McObfPair field_130070_K = McMappingDatabase.getSRG("field_130070_K");

	/**
	 * <p>
	 * Name: draw
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIIIII)V]
	 * </p>
	 */
	public static McObfPair func_181536_a = McMappingDatabase.getSRG("Minecraft.func_181536_a");

	/**
	 * <p>
	 * Name: updateDisplayMode
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110441_Q = McMappingDatabase.getSRG("Minecraft.func_110441_Q");

	/**
	 * <p>
	 * Name: mcResourceManager
	 * </p>
	 */
	public static McObfPair field_110451_am = McMappingDatabase.getSRG("field_110451_am");

	/**
	 * <p>
	 * Name: getSessionService
	 * </p>
	 * <p>
	 * Desc: [()Lcom/mojang/authlib/minecraft/MinecraftSessionService;]
	 * </p>
	 */
	public static McObfPair func_152347_ac = McMappingDatabase.getSRG("Minecraft.func_152347_ac");

	/**
	 * <p>
	 * Name: getVersion
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_175600_c = McMappingDatabase.getSRG("Minecraft.func_175600_c");

	/**
	 * <p>
	 * Name: myNetworkManager
	 * </p>
	 */
	public static McObfPair field_71453_ak = McMappingDatabase.getSRG("field_71453_ak");

	/**
	 * <p>
	 * Name: loadWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71353_a = McMappingDatabase.getSRG("Minecraft.func_71353_a");

	/**
	 * <p>
	 * Name: hasCrashed
	 * </p>
	 */
	public static McObfPair field_71434_R = McMappingDatabase.getSRG("field_71434_R");

	/**
	 * <p>
	 * Name: textureMapBlocks
	 * </p>
	 */
	public static McObfPair field_147128_au = McMappingDatabase.getSRG("field_147128_au");

	/**
	 * <p>
	 * Name: launchedVersion
	 * </p>
	 */
	public static McObfPair field_110447_Z = McMappingDatabase.getSRG("field_110447_Z");

	/**
	 * <p>
	 * Name: checkGLError
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71361_d = McMappingDatabase.getSRG("Minecraft.func_71361_d");

	/**
	 * <p>
	 * Name: isSnooperEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70002_Q = McMappingDatabase.getSRG("Minecraft.func_70002_Q");

	/**
	 * <p>
	 * Name: displayDebugInfo
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_71366_a = McMappingDatabase.getSRG("Minecraft.func_71366_a");

	/**
	 * <p>
	 * Name: debugUpdateTime
	 * </p>
	 */
	public static McObfPair field_71419_L = McMappingDatabase.getSRG("field_71419_L");

	/**
	 * <p>
	 * Name: renderManager
	 * </p>
	 */
	public static McObfPair field_175616_W = McMappingDatabase.getSRG("field_175616_W");

	/**
	 * <p>
	 * Name: getRenderManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/entity/RenderManager;]
	 * </p>
	 */
	public static McObfPair func_175598_ae = McMappingDatabase.getSRG("Minecraft.func_175598_ae");

	/**
	 * <p>
	 * Name: isReducedDebug
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_189648_am = McMappingDatabase.getSRG("Minecraft.func_189648_am");

	/**
	 * <p>
	 * Name: getCurrentServerData
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/multiplayer/ServerData;]
	 * </p>
	 */
	public static McObfPair func_147104_D = McMappingDatabase.getSRG("Minecraft.func_147104_D");

	/**
	 * <p>
	 * Name: IS_RUNNING_ON_MAC
	 * </p>
	 */
	public static McObfPair field_142025_a = McMappingDatabase.getSRG("field_142025_a");

	/**
	 * <p>
	 * Name: tempDisplayWidth
	 * </p>
	 */
	public static McObfPair field_71436_X = McMappingDatabase.getSRG("field_71436_X");

	/**
	 * <p>
	 * Name: crashReporter
	 * </p>
	 */
	public static McObfPair field_71433_S = McMappingDatabase.getSRG("field_71433_S");

	/**
	 * <p>
	 * Name: updateDebugProfilerName
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_71383_b = McMappingDatabase.getSRG("Minecraft.func_71383_b");

	/**
	 * <p>
	 * Name: objectMouseOver
	 * </p>
	 */
	public static McObfPair field_71476_x = McMappingDatabase.getSRG("field_71476_x");

	/**
	 * <p>
	 * Name: startTimerHackThread
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71389_H = McMappingDatabase.getSRG("Minecraft.func_71389_H");

	/**
	 * <p>
	 * Name: createDisplay
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175609_am = McMappingDatabase.getSRG("Minecraft.func_175609_am");

	/**
	 * <p>
	 * Name: dispatchKeypresses
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_152348_aa = McMappingDatabase.getSRG("Minecraft.func_152348_aa");

	/**
	 * <p>
	 * Name: scheduledTasks
	 * </p>
	 */
	public static McObfPair field_152351_aB = McMappingDatabase.getSRG("field_152351_aB");

	/**
	 * <p>
	 * Name: instance
	 * </p>
	 */
	public static McObfPair field_71432_P = McMappingDatabase.getSRG("field_71432_P");

	/**
	 * <p>
	 * Name: refreshResources
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110436_a = McMappingDatabase.getSRG("Minecraft.func_110436_a");

	/**
	 * <p>
	 * Name: mcSoundHandler
	 * </p>
	 */
	public static McObfPair field_147127_av = McMappingDatabase.getSRG("field_147127_av");

	/**
	 * <p>
	 * Name: renderViewEntity
	 * </p>
	 */
	public static McObfPair field_175622_Z = McMappingDatabase.getSRG("field_175622_Z");

	/**
	 * <p>
	 * Name: enableGLErrorChecking
	 * </p>
	 */
	public static McObfPair field_175619_R = McMappingDatabase.getSRG("field_175619_R");

	/**
	 * <p>
	 * Name: getMinecraft
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/Minecraft;]
	 * </p>
	 */
	public static McObfPair func_71410_x = McMappingDatabase.getSRG("Minecraft.func_71410_x");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147123_G = McMappingDatabase.getSRG("field_147123_G");

	/**
	 * <p>
	 * Name: getPlayerUsageSnooper
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/profiler/Snooper;]
	 * </p>
	 */
	public static McObfPair func_71378_E = McMappingDatabase.getSRG("Minecraft.func_71378_E");

	/**
	 * <p>
	 * Name: loadWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/WorldClient;)V]
	 * </p>
	 */
	public static McObfPair func_71403_a = McMappingDatabase.getSRG("Minecraft.func_71403_a");

	/**
	 * <p>
	 * Name: shutdownMinecraftApplet
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71405_e = McMappingDatabase.getSRG("Minecraft.func_71405_e");

	/**
	 * <p>
	 * Name: systemTime
	 * </p>
	 */
	public static McObfPair field_71423_H = McMappingDatabase.getSRG("field_71423_H");

	/**
	 * <p>
	 * Name: isFullScreen
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71372_G = McMappingDatabase.getSRG("Minecraft.func_71372_G");

	/**
	 * <p>
	 * Name: shutdown
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71400_g = McMappingDatabase.getSRG("Minecraft.func_71400_g");

	/**
	 * <p>
	 * Name: checkWindowResize
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175604_i = McMappingDatabase.getSRG("Minecraft.func_175604_i");

	/**
	 * <p>
	 * Name: getSkinManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/resources/SkinManager;]
	 * </p>
	 */
	public static McObfPair func_152342_ad = McMappingDatabase.getSRG("Minecraft.func_152342_ad");

	/**
	 * <p>
	 * Name: setServerData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/ServerData;)V]
	 * </p>
	 */
	public static McObfPair func_71351_a = McMappingDatabase.getSRG("Minecraft.func_71351_a");

	/**
	 * <p>
	 * Name: getProfileProperties
	 * </p>
	 * <p>
	 * Desc: [()Lcom/mojang/authlib/properties/PropertyMap;]
	 * </p>
	 */
	public static McObfPair func_181037_M = McMappingDatabase.getSRG("Minecraft.func_181037_M");

	/**
	 * <p>
	 * Name: debugProfilerName
	 * </p>
	 */
	public static McObfPair field_71465_an = McMappingDatabase.getSRG("field_71465_an");

	/**
	 * <p>
	 * Name: usageSnooper
	 * </p>
	 */
	public static McObfPair field_71427_U = McMappingDatabase.getSRG("field_71427_U");

	/**
	 * <p>
	 * Name: toggleFullscreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71352_k = McMappingDatabase.getSRG("Minecraft.func_71352_k");

	/**
	 * <p>
	 * Name: mojangLogo
	 * </p>
	 */
	public static McObfPair field_152354_ay = McMappingDatabase.getSRG("field_152354_ay");

	/**
	 * <p>
	 * Name: fullscreen
	 * </p>
	 */
	public static McObfPair field_71431_Q = McMappingDatabase.getSRG("field_71431_Q");

	/**
	 * <p>
	 * Name: getDataFixer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/datafix/DataFixer;]
	 * </p>
	 */
	public static McObfPair func_184126_aj = McMappingDatabase.getSRG("Minecraft.func_184126_aj");

	/**
	 * <p>
	 * Name: pointedEntity
	 * </p>
	 */
	public static McObfPair field_147125_j = McMappingDatabase.getSRG("field_147125_j");

	/**
	 * <p>
	 * Name: currentScreen
	 * </p>
	 */
	public static McObfPair field_71462_r = McMappingDatabase.getSRG("field_71462_r");

	/**
	 * <p>
	 * Name: standardGalacticFontRenderer
	 * </p>
	 */
	public static McObfPair field_71464_q = McMappingDatabase.getSRG("field_71464_q");

	/**
	 * <p>
	 * Name: displayGuiScreen
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiScreen;)V]
	 * </p>
	 */
	public static McObfPair func_147108_a = McMappingDatabase.getSRG("Minecraft.func_147108_a");

	/**
	 * <p>
	 * Name: sessionService
	 * </p>
	 */
	public static McObfPair field_152355_az = McMappingDatabase.getSRG("field_152355_az");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71384_a = McMappingDatabase.getSRG("Minecraft.func_71384_a");

	/**
	 * <p>
	 * Name: addGraphicsAndWorldToCrashReport
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/crash/CrashReport;)Lnet/minecraft/crash/CrashReport;]
	 * </p>
	 */
	public static McObfPair func_71396_d = McMappingDatabase.getSRG("Minecraft.func_71396_d");

	/**
	 * <p>
	 * Name: isGuiEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71382_s = McMappingDatabase.getSRG("Minecraft.func_71382_s");

	/**
	 * <p>
	 * Name: tutorial
	 * </p>
	 */
	public static McObfPair field_193035_aW = McMappingDatabase.getSRG("field_193035_aW");

	/**
	 * <p>
	 * Name: searchTreeManager
	 * </p>
	 */
	public static McObfPair field_193995_ae = McMappingDatabase.getSRG("field_193995_ae");

	/**
	 * <p>
	 * Name: entityRenderer
	 * </p>
	 */
	public static McObfPair field_71460_t = McMappingDatabase.getSRG("field_71460_t");

	/**
	 * <p>
	 * Name: getMusicTicker
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/audio/MusicTicker;]
	 * </p>
	 */
	public static McObfPair func_181535_r = McMappingDatabase.getSRG("Minecraft.func_181535_r");

	/**
	 * <p>
	 * Name: runGameLoop
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71411_J = McMappingDatabase.getSRG("Minecraft.func_71411_J");

	/**
	 * <p>
	 * Name: playerController
	 * </p>
	 */
	public static McObfPair field_71442_b = McMappingDatabase.getSRG("field_71442_b");

	/**
	 * <p>
	 * Name: rightClickDelayTimer
	 * </p>
	 */
	public static McObfPair field_71467_ac = McMappingDatabase.getSRG("field_71467_ac");

	/**
	 * <p>
	 * Name: getToastGui
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/toasts/GuiToast;]
	 * </p>
	 */
	public static McObfPair func_193033_an = McMappingDatabase.getSRG("Minecraft.func_193033_an");

	/**
	 * <p>
	 * Name: frameTimer
	 * </p>
	 */
	public static McObfPair field_181542_y = McMappingDatabase.getSRG("field_181542_y");

	/**
	 * <p>
	 * Name: serverPort
	 * </p>
	 */
	public static McObfPair field_71477_af = McMappingDatabase.getSRG("field_71477_af");

	/**
	 * <p>
	 * Name: stopIntegratedServer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71363_D = McMappingDatabase.getSRG("Minecraft.func_71363_D");

	/**
	 * <p>
	 * Name: getSession
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/Session;]
	 * </p>
	 */
	public static McObfPair func_110432_I = McMappingDatabase.getSRG("Minecraft.func_110432_I");

	/**
	 * <p>
	 * Name: scheduleResourcesRefresh
	 * </p>
	 * <p>
	 * Desc: [()Lcom/google/common/util/concurrent/ListenableFuture;]
	 * </p>
	 */
	public static McObfPair func_175603_A = McMappingDatabase.getSRG("Minecraft.func_175603_A");

	/**
	 * <p>
	 * Name: updateFramebufferSize
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147119_ah = McMappingDatabase.getSRG("Minecraft.func_147119_ah");

	/**
	 * <p>
	 * Name: setRenderViewEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_175607_a = McMappingDatabase.getSRG("Minecraft.func_175607_a");

	/**
	 * <p>
	 * Name: getCurrentAction
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_181538_aA = McMappingDatabase.getSRG("Minecraft.func_181538_aA");

	/**
	 * <p>
	 * Name: prevFrameTime
	 * </p>
	 */
	public static McObfPair field_71421_N = McMappingDatabase.getSRG("field_71421_N");

	/**
	 * <p>
	 * Name: getLimitFramerate
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_90020_K = McMappingDatabase.getSRG("Minecraft.func_90020_K");

	/**
	 * <p>
	 * Name: getIntegratedServer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/integrated/IntegratedServer;]
	 * </p>
	 */
	public static McObfPair func_71401_C = McMappingDatabase.getSRG("Minecraft.func_71401_C");

	/**
	 * <p>
	 * Name: metadataSerializer_
	 * </p>
	 */
	public static McObfPair field_110452_an = McMappingDatabase.getSRG("field_110452_an");

	/**
	 * <p>
	 * Name: ingameGUI
	 * </p>
	 */
	public static McObfPair field_71456_v = McMappingDatabase.getSRG("field_71456_v");

	/**
	 * <p>
	 * Name: effectRenderer
	 * </p>
	 */
	public static McObfPair field_71452_i = McMappingDatabase.getSRG("field_71452_i");

	/**
	 * <p>
	 * Name: defaultResourcePacks
	 * </p>
	 */
	public static McObfPair field_110449_ao = McMappingDatabase.getSRG("field_110449_ao");

	/**
	 * <p>
	 * Name: timer
	 * </p>
	 */
	public static McObfPair field_71428_T = McMappingDatabase.getSRG("field_71428_T");

	/**
	 * <p>
	 * Name: processKeyF3
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_184122_c = McMappingDatabase.getSRG("Minecraft.func_184122_c");

	/**
	 * <p>
	 * Name: joinPlayerCounter
	 * </p>
	 */
	public static McObfPair field_71457_ai = McMappingDatabase.getSRG("field_71457_ai");

	/**
	 * <p>
	 * Name: integratedServerIsRunning
	 * </p>
	 */
	public static McObfPair field_71455_al = McMappingDatabase.getSRG("field_71455_al");

	/**
	 * <p>
	 * Name: storeTEInStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/tileentity/TileEntity;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_184119_a = McMappingDatabase.getSRG("Minecraft.func_184119_a");

	/**
	 * <p>
	 * Name: getSearchTree
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/util/SearchTreeManager$Key;)Lnet/minecraft/client/util/ISearchTree;]
	 * </p>
	 */
	public static McObfPair func_193987_a = McMappingDatabase.getSRG("Minecraft.func_193987_a");

	/**
	 * <p>
	 * Name: addServerTypeToSnooper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/profiler/Snooper;)V]
	 * </p>
	 */
	public static McObfPair func_70001_b = McMappingDatabase.getSRG("Minecraft.func_70001_b");

	/**
	 * <p>
	 * Name: isDemo
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71355_q = McMappingDatabase.getSRG("Minecraft.func_71355_q");

	/**
	 * <p>
	 * Name: isUnicode
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_152349_b = McMappingDatabase.getSRG("Minecraft.func_152349_b");

	/**
	 * <p>
	 * Name: isGamePaused
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_147113_T = McMappingDatabase.getSRG("Minecraft.func_147113_T");

	/**
	 * <p>
	 * Name: mcDataDir
	 * </p>
	 */
	public static McObfPair field_71412_D = McMappingDatabase.getSRG("field_71412_D");

	/**
	 * <p>
	 * Name: getFrameTimer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/FrameTimer;]
	 * </p>
	 */
	public static McObfPair func_181539_aj = McMappingDatabase.getSRG("Minecraft.func_181539_aj");

	/**
	 * <p>
	 * Name: isFramerateLimitBelowMax
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_147107_h = McMappingDatabase.getSRG("Minecraft.func_147107_h");

	/**
	 * <p>
	 * Name: registerMetadataSerializers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175608_ak = McMappingDatabase.getSRG("Minecraft.func_175608_ak");

	/**
	 * <p>
	 * Name: readImageToBuffer
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/InputStream;)Ljava/nio/ByteBuffer;]
	 * </p>
	 */
	public static McObfPair func_152340_a = McMappingDatabase.getSRG("Minecraft.func_152340_a");

	/**
	 * <p>
	 * Name: getRenderPartialTicks
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_184121_ak = McMappingDatabase.getSRG("Minecraft.func_184121_ak");

	/**
	 * <p>
	 * Name: getSystemTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_71386_F = McMappingDatabase.getSRG("Minecraft.func_71386_F");

	/**
	 * <p>
	 * Name: getTextureManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/texture/TextureManager;]
	 * </p>
	 */
	public static McObfPair func_110434_K = McMappingDatabase.getSRG("Minecraft.func_110434_K");

	/**
	 * <p>
	 * Name: crashed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/crash/CrashReport;)V]
	 * </p>
	 */
	public static McObfPair func_71404_a = McMappingDatabase.getSRG("Minecraft.func_71404_a");

	/**
	 * <p>
	 * Name: jvm64bit
	 * </p>
	 */
	public static McObfPair field_147129_ai = McMappingDatabase.getSRG("field_147129_ai");

	/**
	 * <p>
	 * Name: isConnectedToRealms
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_181540_al = McMappingDatabase.getSRG("Minecraft.func_181540_al");

	/**
	 * <p>
	 * Name: runTickKeyboard
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184118_az = McMappingDatabase.getSRG("Minecraft.func_184118_az");

	/**
	 * <p>
	 * Name: getGLMaximumTextureSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_71369_N = McMappingDatabase.getSRG("Minecraft.func_71369_N");

	/**
	 * <p>
	 * Name: resize
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_71370_a = McMappingDatabase.getSRG("Minecraft.func_71370_a");

	/**
	 * <p>
	 * Name: profileProperties
	 * </p>
	 */
	public static McObfPair field_181038_N = McMappingDatabase.getSRG("field_181038_N");

	/**
	 * <p>
	 * Name: leftClickCounter
	 * </p>
	 */
	public static McObfPair field_71429_W = McMappingDatabase.getSRG("field_71429_W");

	/**
	 * <p>
	 * Name: displayHeight
	 * </p>
	 */
	public static McObfPair field_71440_d = McMappingDatabase.getSRG("field_71440_d");

	/**
	 * <p>
	 * Name: isJava64bit
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_147111_S = McMappingDatabase.getSRG("Minecraft.func_147111_S");

	/**
	 * <p>
	 * Name: launchIntegratedServer
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/world/WorldSettings;)V]
	 * </p>
	 */
	public static McObfPair func_71371_a = McMappingDatabase.getSRG("Minecraft.func_71371_a");

	/**
	 * <p>
	 * Name: fpsCounter
	 * </p>
	 */
	public static McObfPair field_71420_M = McMappingDatabase.getSRG("field_71420_M");

	/**
	 * <p>
	 * Name: blockColors
	 * </p>
	 */
	public static McObfPair field_184127_aH = McMappingDatabase.getSRG("field_184127_aH");

	/**
	 * <p>
	 * Name: setIngameFocus
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71381_h = McMappingDatabase.getSRG("Minecraft.func_71381_h");

	/**
	 * <p>
	 * Name: processKeyBinds
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184117_aA = McMappingDatabase.getSRG("Minecraft.func_184117_aA");

	/**
	 * <p>
	 * Name: skinManager
	 * </p>
	 */
	public static McObfPair field_152350_aA = McMappingDatabase.getSRG("field_152350_aA");

	/**
	 * <p>
	 * Name: twitchDetails
	 * </p>
	 */
	public static McObfPair field_152356_J = McMappingDatabase.getSRG("field_152356_J");

	/**
	 * <p>
	 * Name: getTickLength
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_193989_ak = McMappingDatabase.getSRG("Minecraft.func_193989_ak");

	/**
	 * <p>
	 * Name: setIngameNotInFocus
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71364_i = McMappingDatabase.getSRG("Minecraft.func_71364_i");

	/**
	 * <p>
	 * Name: getBlockColors
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/color/BlockColors;]
	 * </p>
	 */
	public static McObfPair func_184125_al = McMappingDatabase.getSRG("Minecraft.func_184125_al");

	/**
	 * <p>
	 * Name: tempDisplayHeight
	 * </p>
	 */
	public static McObfPair field_71435_Y = McMappingDatabase.getSRG("field_71435_Y");

	/**
	 * <p>
	 * Name: renderEngine
	 * </p>
	 */
	public static McObfPair field_71446_o = McMappingDatabase.getSRG("field_71446_o");

	/**
	 * <p>
	 * Name: mcLanguageManager
	 * </p>
	 */
	public static McObfPair field_135017_as = McMappingDatabase.getSRG("field_135017_as");

	/**
	 * <p>
	 * Name: drawSplashScreen
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/TextureManager;)V]
	 * </p>
	 */
	public static McObfPair func_180510_a = McMappingDatabase.getSRG("Minecraft.func_180510_a");

	/**
	 * <p>
	 * Name: updateDisplay
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175601_h = McMappingDatabase.getSRG("Minecraft.func_175601_h");

	/**
	 * <p>
	 * Name: isFancyGraphicsEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71375_t = McMappingDatabase.getSRG("Minecraft.func_71375_t");

	/**
	 * <p>
	 * Name: isDemo
	 * </p>
	 */
	public static McObfPair field_71459_aj = McMappingDatabase.getSRG("field_71459_aj");

	/**
	 * <p>
	 * Name: displayWidth
	 * </p>
	 */
	public static McObfPair field_71443_c = McMappingDatabase.getSRG("field_71443_c");

	/**
	 * <p>
	 * Name: isJvm64bit
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_147122_X = McMappingDatabase.getSRG("Minecraft.func_147122_X");

	/**
	 * <p>
	 * Name: isCallingFromMinecraftThread
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_152345_ab = McMappingDatabase.getSRG("Minecraft.func_152345_ab");

	/**
	 * <p>
	 * Name: mcDefaultResourcePack
	 * </p>
	 */
	public static McObfPair field_110450_ap = McMappingDatabase.getSRG("field_110450_ap");

}

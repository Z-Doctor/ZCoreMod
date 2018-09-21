package zdoctor.zcoremod.map.minecraft.network.play;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class INetHandlerPlayClient {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hw";
		else
			return "net/minecraft/network/play/INetHandlerPlayClient";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hw";
		else
			return "INetHandlerPlayClient";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhw;";
		else
			return "Lnet/minecraft/network/play/INetHandlerPlayClient;";
	}

	/**
	 * <p>
	 * Name: handleUpdateHealth
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketUpdateHealth;)V]
	 * </p>
	 */
	public static McObfPair func_147249_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147249_a");

	/**
	 * <p>
	 * Name: handleMaps
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketMaps;)V]
	 * </p>
	 */
	public static McObfPair func_147264_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147264_a");

	/**
	 * <p>
	 * Name: handleWorldBorder
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketWorldBorder;)V]
	 * </p>
	 */
	public static McObfPair func_175093_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_175093_a");

	/**
	 * <p>
	 * Name: handleCustomPayload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketCustomPayload;)V]
	 * </p>
	 */
	public static McObfPair func_147240_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147240_a");

	/**
	 * <p>
	 * Name: handleEntityEquipment
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketEntityEquipment;)V]
	 * </p>
	 */
	public static McObfPair func_147242_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147242_a");

	/**
	 * <p>
	 * Name: handleSpawnPainting
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketSpawnPainting;)V]
	 * </p>
	 */
	public static McObfPair func_147288_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147288_a");

	/**
	 * <p>
	 * Name: handleMoveVehicle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketMoveVehicle;)V]
	 * </p>
	 */
	public static McObfPair func_184323_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_184323_a");

	/**
	 * <p>
	 * Name: handleEntityAttach
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketEntityAttach;)V]
	 * </p>
	 */
	public static McObfPair func_147243_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147243_a");

	/**
	 * <p>
	 * Name: handleSelectAdvancementsTab
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketSelectAdvancementsTab;)V]
	 * </p>
	 */
	public static McObfPair func_194022_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_194022_a");

	/**
	 * <p>
	 * Name: processChunkUnload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketUnloadChunk;)V]
	 * </p>
	 */
	public static McObfPair func_184326_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_184326_a");

	/**
	 * <p>
	 * Name: handleTitle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketTitle;)V]
	 * </p>
	 */
	public static McObfPair func_175099_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_175099_a");

	/**
	 * <p>
	 * Name: handleUpdateTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketUpdateTileEntity;)V]
	 * </p>
	 */
	public static McObfPair func_147273_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147273_a");

	/**
	 * <p>
	 * Name: handleAdvancementInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketAdvancementInfo;)V]
	 * </p>
	 */
	public static McObfPair func_191981_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_191981_a");

	/**
	 * <p>
	 * Name: handleUseBed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketUseBed;)V]
	 * </p>
	 */
	public static McObfPair func_147278_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147278_a");

	/**
	 * <p>
	 * Name: handleExplosion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketExplosion;)V]
	 * </p>
	 */
	public static McObfPair func_147283_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147283_a");

	/**
	 * <p>
	 * Name: handleSpawnMob
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketSpawnMob;)V]
	 * </p>
	 */
	public static McObfPair func_147281_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147281_a");

	/**
	 * <p>
	 * Name: handleWindowItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketWindowItems;)V]
	 * </p>
	 */
	public static McObfPair func_147241_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147241_a");

	/**
	 * <p>
	 * Name: handleCollectItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketCollectItem;)V]
	 * </p>
	 */
	public static McObfPair func_147246_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147246_a");

	/**
	 * <p>
	 * Name: handleCustomSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketCustomSound;)V]
	 * </p>
	 */
	public static McObfPair func_184329_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_184329_a");

	/**
	 * <p>
	 * Name: handleSetSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketSetSlot;)V]
	 * </p>
	 */
	public static McObfPair func_147266_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147266_a");

	/**
	 * <p>
	 * Name: handleScoreboardObjective
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketScoreboardObjective;)V]
	 * </p>
	 */
	public static McObfPair func_147291_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147291_a");

	/**
	 * <p>
	 * Name: handleBlockAction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketBlockAction;)V]
	 * </p>
	 */
	public static McObfPair func_147261_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147261_a");

	/**
	 * <p>
	 * Name: handleOpenWindow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketOpenWindow;)V]
	 * </p>
	 */
	public static McObfPair func_147265_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147265_a");

	/**
	 * <p>
	 * Name: handleCamera
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketCamera;)V]
	 * </p>
	 */
	public static McObfPair func_175094_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_175094_a");

	/**
	 * <p>
	 * Name: handleCombatEvent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketCombatEvent;)V]
	 * </p>
	 */
	public static McObfPair func_175098_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_175098_a");

	/**
	 * <p>
	 * Name: handlePlayerListItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketPlayerListItem;)V]
	 * </p>
	 */
	public static McObfPair func_147256_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147256_a");

	/**
	 * <p>
	 * Name: handleSpawnPosition
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketSpawnPosition;)V]
	 * </p>
	 */
	public static McObfPair func_147271_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147271_a");

	/**
	 * <p>
	 * Name: handleEntityVelocity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketEntityVelocity;)V]
	 * </p>
	 */
	public static McObfPair func_147244_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147244_a");

	/**
	 * <p>
	 * Name: handleChangeGameState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketChangeGameState;)V]
	 * </p>
	 */
	public static McObfPair func_147252_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147252_a");

	/**
	 * <p>
	 * Name: handleJoinGame
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketJoinGame;)V]
	 * </p>
	 */
	public static McObfPair func_147282_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147282_a");

	/**
	 * <p>
	 * Name: handleSoundEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketSoundEffect;)V]
	 * </p>
	 */
	public static McObfPair func_184327_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_184327_a");

	/**
	 * <p>
	 * Name: handleHeldItemChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketHeldItemChange;)V]
	 * </p>
	 */
	public static McObfPair func_147257_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147257_a");

	/**
	 * <p>
	 * Name: handleSpawnObject
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketSpawnObject;)V]
	 * </p>
	 */
	public static McObfPair func_147235_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147235_a");

	/**
	 * <p>
	 * Name: handleUpdateScore
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketUpdateScore;)V]
	 * </p>
	 */
	public static McObfPair func_147250_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147250_a");

	/**
	 * <p>
	 * Name: handleEntityHeadLook
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketEntityHeadLook;)V]
	 * </p>
	 */
	public static McObfPair func_147267_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147267_a");

	/**
	 * <p>
	 * Name: handlePlayerPosLook
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketPlayerPosLook;)V]
	 * </p>
	 */
	public static McObfPair func_184330_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_184330_a");

	/**
	 * <p>
	 * Name: handleWindowProperty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketWindowProperty;)V]
	 * </p>
	 */
	public static McObfPair func_147245_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147245_a");

	/**
	 * <p>
	 * Name: handleEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketEffect;)V]
	 * </p>
	 */
	public static McObfPair func_147277_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147277_a");

	/**
	 * <p>
	 * Name: handleTeams
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketTeams;)V]
	 * </p>
	 */
	public static McObfPair func_147247_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147247_a");

	/**
	 * <p>
	 * Name: handleUpdateBossInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketUpdateBossInfo;)V]
	 * </p>
	 */
	public static McObfPair func_184325_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_184325_a");

	/**
	 * <p>
	 * Name: handleChat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketChat;)V]
	 * </p>
	 */
	public static McObfPair func_147251_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147251_a");

	/**
	 * <p>
	 * Name: handleEntityMovement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketEntity;)V]
	 * </p>
	 */
	public static McObfPair func_147259_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147259_a");

	/**
	 * <p>
	 * Name: handleDestroyEntities
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketDestroyEntities;)V]
	 * </p>
	 */
	public static McObfPair func_147238_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147238_a");

	/**
	 * <p>
	 * Name: handleServerDifficulty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketServerDifficulty;)V]
	 * </p>
	 */
	public static McObfPair func_175101_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_175101_a");

	/**
	 * <p>
	 * Name: handleSignEditorOpen
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketSignEditorOpen;)V]
	 * </p>
	 */
	public static McObfPair func_147268_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147268_a");

	/**
	 * <p>
	 * Name: handleCloseWindow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketCloseWindow;)V]
	 * </p>
	 */
	public static McObfPair func_147276_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147276_a");

	/**
	 * <p>
	 * Name: handleSetPassengers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketSetPassengers;)V]
	 * </p>
	 */
	public static McObfPair func_184328_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_184328_a");

	/**
	 * <p>
	 * Name: handleSpawnGlobalEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketSpawnGlobalEntity;)V]
	 * </p>
	 */
	public static McObfPair func_147292_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147292_a");

	/**
	 * <p>
	 * Name: handleEntityProperties
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketEntityProperties;)V]
	 * </p>
	 */
	public static McObfPair func_147290_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147290_a");

	/**
	 * <p>
	 * Name: handleMultiBlockChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketMultiBlockChange;)V]
	 * </p>
	 */
	public static McObfPair func_147287_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147287_a");

	/**
	 * <p>
	 * Name: handleConfirmTransaction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketConfirmTransaction;)V]
	 * </p>
	 */
	public static McObfPair func_147239_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147239_a");

	/**
	 * <p>
	 * Name: handleRemoveEntityEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketRemoveEntityEffect;)V]
	 * </p>
	 */
	public static McObfPair func_147262_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147262_a");

	/**
	 * <p>
	 * Name: handleKeepAlive
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketKeepAlive;)V]
	 * </p>
	 */
	public static McObfPair func_147272_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147272_a");

	/**
	 * <p>
	 * Name: handleTimeUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketTimeUpdate;)V]
	 * </p>
	 */
	public static McObfPair func_147285_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147285_a");

	/**
	 * <p>
	 * Name: handleBlockChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketBlockChange;)V]
	 * </p>
	 */
	public static McObfPair func_147234_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147234_a");

	/**
	 * <p>
	 * Name: handleStatistics
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketStatistics;)V]
	 * </p>
	 */
	public static McObfPair func_147293_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147293_a");

	/**
	 * <p>
	 * Name: handlePlayerListHeaderFooter
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketPlayerListHeaderFooter;)V]
	 * </p>
	 */
	public static McObfPair func_175096_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_175096_a");

	/**
	 * <p>
	 * Name: handleResourcePack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketResourcePackSend;)V]
	 * </p>
	 */
	public static McObfPair func_175095_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_175095_a");

	/**
	 * <p>
	 * Name: handleEntityStatus
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketEntityStatus;)V]
	 * </p>
	 */
	public static McObfPair func_147236_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147236_a");

	/**
	 * <p>
	 * Name: handleRecipeBook
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketRecipeBook;)V]
	 * </p>
	 */
	public static McObfPair func_191980_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_191980_a");

	/**
	 * <p>
	 * Name: handleChunkData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketChunkData;)V]
	 * </p>
	 */
	public static McObfPair func_147263_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147263_a");

	/**
	 * <p>
	 * Name: handleSetExperience
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketSetExperience;)V]
	 * </p>
	 */
	public static McObfPair func_147295_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147295_a");

	/**
	 * <p>
	 * Name: handleSpawnExperienceOrb
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketSpawnExperienceOrb;)V]
	 * </p>
	 */
	public static McObfPair func_147286_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147286_a");

	/**
	 * <p>
	 * Name: handleParticles
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketParticles;)V]
	 * </p>
	 */
	public static McObfPair func_147289_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147289_a");

	/**
	 * <p>
	 * Name: handleEntityMetadata
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketEntityMetadata;)V]
	 * </p>
	 */
	public static McObfPair func_147284_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147284_a");

	/**
	 * <p>
	 * Name: handleRespawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketRespawn;)V]
	 * </p>
	 */
	public static McObfPair func_147280_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147280_a");

	/**
	 * <p>
	 * Name: handleDisconnect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketDisconnect;)V]
	 * </p>
	 */
	public static McObfPair func_147253_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147253_a");

	/**
	 * <p>
	 * Name: handleDisplayObjective
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketDisplayObjective;)V]
	 * </p>
	 */
	public static McObfPair func_147254_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147254_a");

	/**
	 * <p>
	 * Name: handleCooldown
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketCooldown;)V]
	 * </p>
	 */
	public static McObfPair func_184324_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_184324_a");

	/**
	 * <p>
	 * Name: handleEntityEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketEntityEffect;)V]
	 * </p>
	 */
	public static McObfPair func_147260_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147260_a");

	/**
	 * <p>
	 * Name: handleSpawnPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketSpawnPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_147237_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147237_a");

	/**
	 * <p>
	 * Name: handlePlayerAbilities
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketPlayerAbilities;)V]
	 * </p>
	 */
	public static McObfPair func_147270_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147270_a");

	/**
	 * <p>
	 * Name: handleAnimation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketAnimation;)V]
	 * </p>
	 */
	public static McObfPair func_147279_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147279_a");

	/**
	 * <p>
	 * Name: handleTabComplete
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketTabComplete;)V]
	 * </p>
	 */
	public static McObfPair func_147274_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147274_a");

	/**
	 * <p>
	 * Name: handleBlockBreakAnim
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketBlockBreakAnim;)V]
	 * </p>
	 */
	public static McObfPair func_147294_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147294_a");

	/**
	 * <p>
	 * Name: handleEntityTeleport
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketEntityTeleport;)V]
	 * </p>
	 */
	public static McObfPair func_147275_a = McMappingDatabase.getSRG("INetHandlerPlayClient.func_147275_a");

}

package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetHandlerPlayServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pa";
		else
			return "net/minecraft/network/NetHandlerPlayServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pa";
		else
			return "NetHandlerPlayServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpa;";
		else
			return "Lnet/minecraft/network/NetHandlerPlayServer;";
	}

	/**
	 * <p>
	 * Name: lowestRiddenEnt
	 * </p>
	 */
	public static McObfPair field_184355_r = McMappingDatabase.getSRG("field_184355_r");

	/**
	 * <p>
	 * Name: processTryUseItemOnBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock;)V]
	 * </p>
	 */
	public static McObfPair func_184337_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_184337_a");

	/**
	 * <p>
	 * Name: vehicleFloating
	 * </p>
	 */
	public static McObfPair field_184345_D = McMappingDatabase.getSRG("field_184345_D");

	/**
	 * <p>
	 * Name: lowestRiddenY1
	 * </p>
	 */
	public static McObfPair field_184360_w = McMappingDatabase.getSRG("field_184360_w");

	/**
	 * <p>
	 * Name: processChatMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketChatMessage;)V]
	 * </p>
	 */
	public static McObfPair func_147354_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147354_a");

	/**
	 * <p>
	 * Name: vehicleFloatingTickCount
	 * </p>
	 */
	public static McObfPair field_184346_E = McMappingDatabase.getSRG("field_184346_E");

	/**
	 * <p>
	 * Name: handleSpectate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketSpectate;)V]
	 * </p>
	 */
	public static McObfPair func_175088_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_175088_a");

	/**
	 * <p>
	 * Name: processCreativeInventoryAction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketCreativeInventoryAction;)V]
	 * </p>
	 */
	public static McObfPair func_147344_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147344_a");

	/**
	 * <p>
	 * Name: processConfirmTeleport
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketConfirmTeleport;)V]
	 * </p>
	 */
	public static McObfPair func_184339_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_184339_a");

	/**
	 * <p>
	 * Name: lowestRiddenX1
	 * </p>
	 */
	public static McObfPair field_184359_v = McMappingDatabase.getSRG("field_184359_v");

	/**
	 * <p>
	 * Name: isMoveVehiclePacketInvalid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketVehicleMove;)Z]
	 * </p>
	 */
	public static McObfPair func_184341_b = McMappingDatabase.getSRG("NetHandlerPlayServer.func_184341_b");

	/**
	 * <p>
	 * Name: chatSpamThresholdCount
	 * </p>
	 */
	public static McObfPair field_147374_l = McMappingDatabase.getSRG("field_147374_l");

	/**
	 * <p>
	 * Name: isMovePlayerPacketInvalid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_183006_b = McMappingDatabase.getSRG("NetHandlerPlayServer.func_183006_b");

	/**
	 * <p>
	 * Name: lowestRiddenX
	 * </p>
	 */
	public static McObfPair field_184356_s = McMappingDatabase.getSRG("field_184356_s");

	/**
	 * <p>
	 * Name: disconnect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_194028_b = McMappingDatabase.getSRG("NetHandlerPlayServer.func_194028_b");

	/**
	 * <p>
	 * Name: processCustomPayload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketCustomPayload;)V]
	 * </p>
	 */
	public static McObfPair func_147349_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147349_a");

	/**
	 * <p>
	 * Name: firstGoodY
	 * </p>
	 */
	public static McObfPair field_184350_m = McMappingDatabase.getSRG("field_184350_m");

	/**
	 * <p>
	 * Name: processPlayerAbilities
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketPlayerAbilities;)V]
	 * </p>
	 */
	public static McObfPair func_147348_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147348_a");

	/**
	 * <p>
	 * Name: processHeldItemChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketHeldItemChange;)V]
	 * </p>
	 */
	public static McObfPair func_147355_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147355_a");

	/**
	 * <p>
	 * Name: itemDropThreshold
	 * </p>
	 */
	public static McObfPair field_147375_m = McMappingDatabase.getSRG("field_147375_m");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147370_c = McMappingDatabase.getSRG("field_147370_c");

	/**
	 * <p>
	 * Name: firstGoodZ
	 * </p>
	 */
	public static McObfPair field_184351_n = McMappingDatabase.getSRG("field_184351_n");

	/**
	 * <p>
	 * Name: processUseEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketUseEntity;)V]
	 * </p>
	 */
	public static McObfPair func_147340_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147340_a");

	/**
	 * <p>
	 * Name: setPlayerLocation
	 * </p>
	 * <p>
	 * Desc: [(DDDFFLjava/util/Set;)V]
	 * </p>
	 */
	public static McObfPair func_175089_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_175089_a");

	/**
	 * <p>
	 * Name: setPlayerLocation
	 * </p>
	 * <p>
	 * Desc: [(DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_147364_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147364_a");

	/**
	 * <p>
	 * Name: processClickWindow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketClickWindow;)V]
	 * </p>
	 */
	public static McObfPair func_147351_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147351_a");

	/**
	 * <p>
	 * Name: processConfirmTransaction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketConfirmTransaction;)V]
	 * </p>
	 */
	public static McObfPair func_147339_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147339_a");

	/**
	 * <p>
	 * Name: lastGoodX
	 * </p>
	 */
	public static McObfPair field_184352_o = McMappingDatabase.getSRG("field_184352_o");

	/**
	 * <p>
	 * Name: lowestRiddenZ
	 * </p>
	 */
	public static McObfPair field_184358_u = McMappingDatabase.getSRG("field_184358_u");

	/**
	 * <p>
	 * Name: lastGoodZ
	 * </p>
	 */
	public static McObfPair field_184354_q = McMappingDatabase.getSRG("field_184354_q");

	/**
	 * <p>
	 * Name: lastPositionUpdate
	 * </p>
	 */
	public static McObfPair field_184343_A = McMappingDatabase.getSRG("field_184343_A");

	/**
	 * <p>
	 * Name: processCloseWindow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketCloseWindow;)V]
	 * </p>
	 */
	public static McObfPair func_147356_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147356_a");

	/**
	 * <p>
	 * Name: handleSeenAdvancements
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketSeenAdvancements;)V]
	 * </p>
	 */
	public static McObfPair func_194027_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_194027_a");

	/**
	 * <p>
	 * Name: processTryUseItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketPlayerTryUseItem;)V]
	 * </p>
	 */
	public static McObfPair func_147346_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147346_a");

	/**
	 * <p>
	 * Name: handleRecipeBookUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketRecipeInfo;)V]
	 * </p>
	 */
	public static McObfPair func_191984_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_191984_a");

	/**
	 * <p>
	 * Name: processTabComplete
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketTabComplete;)V]
	 * </p>
	 */
	public static McObfPair func_147341_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147341_a");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_73660_a");

	/**
	 * <p>
	 * Name: processUpdateSign
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketUpdateSign;)V]
	 * </p>
	 */
	public static McObfPair func_147343_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147343_a");

	/**
	 * <p>
	 * Name: processEnchantItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketEnchantItem;)V]
	 * </p>
	 */
	public static McObfPair func_147338_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147338_a");

	/**
	 * <p>
	 * Name: currentTimeMillis
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_147363_d = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147363_d");

	/**
	 * <p>
	 * Name: movePacketCounter
	 * </p>
	 */
	public static McObfPair field_184347_F = McMappingDatabase.getSRG("field_184347_F");

	/**
	 * <p>
	 * Name: sendPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/Packet;)V]
	 * </p>
	 */
	public static McObfPair func_147359_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147359_a");

	/**
	 * <p>
	 * Name: processVehicleMove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketVehicleMove;)V]
	 * </p>
	 */
	public static McObfPair func_184338_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_184338_a");

	/**
	 * <p>
	 * Name: targetPos
	 * </p>
	 */
	public static McObfPair field_184362_y = McMappingDatabase.getSRG("field_184362_y");

	/**
	 * <p>
	 * Name: pendingTransactions
	 * </p>
	 */
	public static McObfPair field_147372_n = McMappingDatabase.getSRG("field_147372_n");

	/**
	 * <p>
	 * Name: floating
	 * </p>
	 */
	public static McObfPair field_184344_B = McMappingDatabase.getSRG("field_184344_B");

	/**
	 * <p>
	 * Name: onDisconnect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_147231_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147231_a");

	/**
	 * <p>
	 * Name: processClientSettings
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketClientSettings;)V]
	 * </p>
	 */
	public static McObfPair func_147352_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147352_a");

	/**
	 * <p>
	 * Name: floatingTickCount
	 * </p>
	 */
	public static McObfPair field_147365_f = McMappingDatabase.getSRG("field_147365_f");

	/**
	 * <p>
	 * Name: handleResourcePackStatus
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketResourcePackStatus;)V]
	 * </p>
	 */
	public static McObfPair func_175086_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_175086_a");

	/**
	 * <p>
	 * Name: networkTickCount
	 * </p>
	 */
	public static McObfPair field_147368_e = McMappingDatabase.getSRG("field_147368_e");

	/**
	 * <p>
	 * Name: firstGoodX
	 * </p>
	 */
	public static McObfPair field_184349_l = McMappingDatabase.getSRG("field_184349_l");

	/**
	 * <p>
	 * Name: processClientStatus
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketClientStatus;)V]
	 * </p>
	 */
	public static McObfPair func_147342_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147342_a");

	/**
	 * <p>
	 * Name: processInput
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketInput;)V]
	 * </p>
	 */
	public static McObfPair func_147358_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147358_a");

	/**
	 * <p>
	 * Name: processEntityAction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketEntityAction;)V]
	 * </p>
	 */
	public static McObfPair func_147357_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147357_a");

	/**
	 * <p>
	 * Name: captureCurrentPosition
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184342_d = McMappingDatabase.getSRG("NetHandlerPlayServer.func_184342_d");

	/**
	 * <p>
	 * Name: processPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_147347_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147347_a");

	/**
	 * <p>
	 * Name: netManager
	 * </p>
	 */
	public static McObfPair field_147371_a = McMappingDatabase.getSRG("field_147371_a");

	/**
	 * <p>
	 * Name: lastMovePacketCounter
	 * </p>
	 */
	public static McObfPair field_184348_G = McMappingDatabase.getSRG("field_184348_G");

	/**
	 * <p>
	 * Name: serverController
	 * </p>
	 */
	public static McObfPair field_147367_d = McMappingDatabase.getSRG("field_147367_d");

	/**
	 * <p>
	 * Name: lowestRiddenY
	 * </p>
	 */
	public static McObfPair field_184357_t = McMappingDatabase.getSRG("field_184357_t");

	/**
	 * <p>
	 * Name: teleportId
	 * </p>
	 */
	public static McObfPair field_184363_z = McMappingDatabase.getSRG("field_184363_z");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_147369_b = McMappingDatabase.getSRG("field_147369_b");

	/**
	 * <p>
	 * Name: handleSlashCommand
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_147361_d = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147361_d");

	/**
	 * <p>
	 * Name: getNetworkManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/NetworkManager;]
	 * </p>
	 */
	public static McObfPair func_147362_b = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147362_b");

	/**
	 * <p>
	 * Name: processSteerBoat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketSteerBoat;)V]
	 * </p>
	 */
	public static McObfPair func_184340_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_184340_a");

	/**
	 * <p>
	 * Name: lastGoodY
	 * </p>
	 */
	public static McObfPair field_184353_p = McMappingDatabase.getSRG("field_184353_p");

	/**
	 * <p>
	 * Name: processPlayerDigging
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketPlayerDigging;)V]
	 * </p>
	 */
	public static McObfPair func_147345_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147345_a");

	/**
	 * <p>
	 * Name: processKeepAlive
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketKeepAlive;)V]
	 * </p>
	 */
	public static McObfPair func_147353_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_147353_a");

	/**
	 * <p>
	 * Name: lowestRiddenZ1
	 * </p>
	 */
	public static McObfPair field_184361_x = McMappingDatabase.getSRG("field_184361_x");

	/**
	 * <p>
	 * Name: handleAnimation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketAnimation;)V]
	 * </p>
	 */
	public static McObfPair func_175087_a = McMappingDatabase.getSRG("NetHandlerPlayServer.func_175087_a");

}

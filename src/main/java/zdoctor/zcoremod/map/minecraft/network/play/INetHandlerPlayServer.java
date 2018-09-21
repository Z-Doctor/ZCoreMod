package zdoctor.zcoremod.map.minecraft.network.play;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class INetHandlerPlayServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kx";
		else
			return "net/minecraft/network/play/INetHandlerPlayServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "kx";
		else
			return "INetHandlerPlayServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lkx;";
		else
			return "Lnet/minecraft/network/play/INetHandlerPlayServer;";
	}

	/**
	 * <p>
	 * Name: handleSeenAdvancements
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketSeenAdvancements;)V]
	 * </p>
	 */
	public static McObfPair func_194027_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_194027_a");

	/**
	 * <p>
	 * Name: processVehicleMove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketVehicleMove;)V]
	 * </p>
	 */
	public static McObfPair func_184338_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_184338_a");

	/**
	 * <p>
	 * Name: processClientStatus
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketClientStatus;)V]
	 * </p>
	 */
	public static McObfPair func_147342_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147342_a");

	/**
	 * <p>
	 * Name: handleResourcePackStatus
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketResourcePackStatus;)V]
	 * </p>
	 */
	public static McObfPair func_175086_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_175086_a");

	/**
	 * <p>
	 * Name: processConfirmTeleport
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketConfirmTeleport;)V]
	 * </p>
	 */
	public static McObfPair func_184339_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_184339_a");

	/**
	 * <p>
	 * Name: processPlayerAbilities
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketPlayerAbilities;)V]
	 * </p>
	 */
	public static McObfPair func_147348_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147348_a");

	/**
	 * <p>
	 * Name: handleRecipeBookUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketRecipeInfo;)V]
	 * </p>
	 */
	public static McObfPair func_191984_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_191984_a");

	/**
	 * <p>
	 * Name: processTryUseItemOnBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock;)V]
	 * </p>
	 */
	public static McObfPair func_184337_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_184337_a");

	/**
	 * <p>
	 * Name: processPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_147347_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147347_a");

	/**
	 * <p>
	 * Name: processUpdateSign
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketUpdateSign;)V]
	 * </p>
	 */
	public static McObfPair func_147343_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147343_a");

	/**
	 * <p>
	 * Name: processTryUseItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketPlayerTryUseItem;)V]
	 * </p>
	 */
	public static McObfPair func_147346_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147346_a");

	/**
	 * <p>
	 * Name: processCustomPayload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketCustomPayload;)V]
	 * </p>
	 */
	public static McObfPair func_147349_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147349_a");

	/**
	 * <p>
	 * Name: processCreativeInventoryAction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketCreativeInventoryAction;)V]
	 * </p>
	 */
	public static McObfPair func_147344_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147344_a");

	/**
	 * <p>
	 * Name: processEnchantItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketEnchantItem;)V]
	 * </p>
	 */
	public static McObfPair func_147338_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147338_a");

	/**
	 * <p>
	 * Name: processChatMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketChatMessage;)V]
	 * </p>
	 */
	public static McObfPair func_147354_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147354_a");

	/**
	 * <p>
	 * Name: processTabComplete
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketTabComplete;)V]
	 * </p>
	 */
	public static McObfPair func_147341_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147341_a");

	/**
	 * <p>
	 * Name: processUseEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketUseEntity;)V]
	 * </p>
	 */
	public static McObfPair func_147340_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147340_a");

	/**
	 * <p>
	 * Name: handleAnimation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketAnimation;)V]
	 * </p>
	 */
	public static McObfPair func_175087_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_175087_a");

	/**
	 * <p>
	 * Name: processInput
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketInput;)V]
	 * </p>
	 */
	public static McObfPair func_147358_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147358_a");

	/**
	 * <p>
	 * Name: handleSpectate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketSpectate;)V]
	 * </p>
	 */
	public static McObfPair func_175088_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_175088_a");

	/**
	 * <p>
	 * Name: processSteerBoat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketSteerBoat;)V]
	 * </p>
	 */
	public static McObfPair func_184340_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_184340_a");

	/**
	 * <p>
	 * Name: processKeepAlive
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketKeepAlive;)V]
	 * </p>
	 */
	public static McObfPair func_147353_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147353_a");

	/**
	 * <p>
	 * Name: processClickWindow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketClickWindow;)V]
	 * </p>
	 */
	public static McObfPair func_147351_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147351_a");

	/**
	 * <p>
	 * Name: processPlayerDigging
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketPlayerDigging;)V]
	 * </p>
	 */
	public static McObfPair func_147345_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147345_a");

	/**
	 * <p>
	 * Name: processClientSettings
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketClientSettings;)V]
	 * </p>
	 */
	public static McObfPair func_147352_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147352_a");

	/**
	 * <p>
	 * Name: processCloseWindow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketCloseWindow;)V]
	 * </p>
	 */
	public static McObfPair func_147356_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147356_a");

	/**
	 * <p>
	 * Name: processEntityAction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketEntityAction;)V]
	 * </p>
	 */
	public static McObfPair func_147357_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147357_a");

	/**
	 * <p>
	 * Name: processHeldItemChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketHeldItemChange;)V]
	 * </p>
	 */
	public static McObfPair func_147355_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147355_a");

	/**
	 * <p>
	 * Name: processConfirmTransaction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/client/CPacketConfirmTransaction;)V]
	 * </p>
	 */
	public static McObfPair func_147339_a = McMappingDatabase.getSRG("INetHandlerPlayServer.func_147339_a");

}

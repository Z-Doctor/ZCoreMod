package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlayerList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pl";
		else
			return "net/minecraft/server/management/PlayerList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pl";
		else
			return "PlayerList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpl;";
		else
			return "Lnet/minecraft/server/management/PlayerList;";
	}

	/**
	 * <p>
	 * Name: allowUserToConnect
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/SocketAddress;Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148542_a = McMappingDatabase.getSRG("PlayerList.func_148542_a");

	/**
	 * <p>
	 * Name: removeOp
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)V]
	 * </p>
	 */
	public static McObfPair func_152610_b = McMappingDatabase.getSRG("PlayerList.func_152610_b");

	/**
	 * <p>
	 * Name: getHostPlayerData
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_72378_q = McMappingDatabase.getSRG("PlayerList.func_72378_q");

	/**
	 * <p>
	 * Name: getPlayerByUsername
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/entity/player/EntityPlayerMP;]
	 * </p>
	 */
	public static McObfPair func_152612_a = McMappingDatabase.getSRG("PlayerList.func_152612_a");

	/**
	 * <p>
	 * Name: isWhiteListEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_72383_n = McMappingDatabase.getSRG("PlayerList.func_72383_n");

	/**
	 * <p>
	 * Name: getPlayerAdvancements
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)Lnet/minecraft/advancements/PlayerAdvancements;]
	 * </p>
	 */
	public static McObfPair func_192054_h = McMappingDatabase.getSRG("PlayerList.func_192054_h");

	/**
	 * <p>
	 * Name: playerLoggedOut
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_72367_e = McMappingDatabase.getSRG("PlayerList.func_72367_e");

	/**
	 * <p>
	 * Name: getPlayerStatsFile
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/stats/StatisticsManagerServer;]
	 * </p>
	 */
	public static McObfPair func_152602_a = McMappingDatabase.getSRG("PlayerList.func_152602_a");

	/**
	 * <p>
	 * Name: setViewDistance
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_152611_a = McMappingDatabase.getSRG("PlayerList.func_152611_a");

	/**
	 * <p>
	 * Name: updatePermissionLevel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_187243_f = McMappingDatabase.getSRG("PlayerList.func_187243_f");

	/**
	 * <p>
	 * Name: FILE_WHITELIST
	 * </p>
	 */
	public static McObfPair field_152616_d = McMappingDatabase.getSRG("field_152616_d");

	/**
	 * <p>
	 * Name: addOp
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)V]
	 * </p>
	 */
	public static McObfPair func_152605_a = McMappingDatabase.getSRG("PlayerList.func_152605_a");

	/**
	 * <p>
	 * Name: recreatePlayerEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;IZ)Lnet/minecraft/entity/player/EntityPlayerMP;]
	 * </p>
	 */
	public static McObfPair func_72368_a = McMappingDatabase.getSRG("PlayerList.func_72368_a");

	/**
	 * <p>
	 * Name: getCurrentPlayerCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_72394_k = McMappingDatabase.getSRG("PlayerList.func_72394_k");

	/**
	 * <p>
	 * Name: playerLoggedIn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_72377_c = McMappingDatabase.getSRG("PlayerList.func_72377_c");

	/**
	 * <p>
	 * Name: reloadResources
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193244_w = McMappingDatabase.getSRG("PlayerList.func_193244_w");

	/**
	 * <p>
	 * Name: viewDistance
	 * </p>
	 */
	public static McObfPair field_72402_d = McMappingDatabase.getSRG("field_72402_d");

	/**
	 * <p>
	 * Name: getAvailablePlayerDat
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_72373_m = McMappingDatabase.getSRG("PlayerList.func_72373_m");

	/**
	 * <p>
	 * Name: canSendCommands
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)Z]
	 * </p>
	 */
	public static McObfPair func_152596_g = McMappingDatabase.getSRG("PlayerList.func_152596_g");

	/**
	 * <p>
	 * Name: canJoin
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)Z]
	 * </p>
	 */
	public static McObfPair func_152607_e = McMappingDatabase.getSRG("PlayerList.func_152607_e");

	/**
	 * <p>
	 * Name: initializeConnectionToPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/NetworkManager;Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_72355_a = McMappingDatabase.getSRG("PlayerList.func_72355_a");

	/**
	 * <p>
	 * Name: getOppedPlayerNames
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_152606_n = McMappingDatabase.getSRG("PlayerList.func_152606_n");

	/**
	 * <p>
	 * Name: getBannedPlayers
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/management/UserListBans;]
	 * </p>
	 */
	public static McObfPair func_152608_h = McMappingDatabase.getSRG("PlayerList.func_152608_h");

	/**
	 * <p>
	 * Name: getPlayers
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_181057_v = McMappingDatabase.getSRG("PlayerList.func_181057_v");

	/**
	 * <p>
	 * Name: getOppedPlayers
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/management/UserListOps;]
	 * </p>
	 */
	public static McObfPair func_152603_m = McMappingDatabase.getSRG("PlayerList.func_152603_m");

	/**
	 * <p>
	 * Name: setWhiteListEnabled
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_72371_a = McMappingDatabase.getSRG("PlayerList.func_72371_a");

	/**
	 * <p>
	 * Name: getViewDistance
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_72395_o = McMappingDatabase.getSRG("PlayerList.func_72395_o");

	/**
	 * <p>
	 * Name: writePlayerData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_72391_b = McMappingDatabase.getSRG("PlayerList.func_72391_b");

	/**
	 * <p>
	 * Name: getPlayerByUUID
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)Lnet/minecraft/entity/player/EntityPlayerMP;]
	 * </p>
	 */
	public static McObfPair func_177451_a = McMappingDatabase.getSRG("PlayerList.func_177451_a");

	/**
	 * <p>
	 * Name: serverUpdateMovingPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_72358_d = McMappingDatabase.getSRG("PlayerList.func_72358_d");

	/**
	 * <p>
	 * Name: playerStatFiles
	 * </p>
	 */
	public static McObfPair field_148547_k = McMappingDatabase.getSRG("field_148547_k");

	/**
	 * <p>
	 * Name: gameType
	 * </p>
	 */
	public static McObfPair field_72410_m = McMappingDatabase.getSRG("field_72410_m");

	/**
	 * <p>
	 * Name: createPlayerForUser
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)Lnet/minecraft/entity/player/EntityPlayerMP;]
	 * </p>
	 */
	public static McObfPair func_148545_a = McMappingDatabase.getSRG("PlayerList.func_148545_a");

	/**
	 * <p>
	 * Name: updateTimeAndWeatherForPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/world/WorldServer;)V]
	 * </p>
	 */
	public static McObfPair func_72354_b = McMappingDatabase.getSRG("PlayerList.func_72354_b");

	/**
	 * <p>
	 * Name: getBannedIPs
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/management/UserListIPBans;]
	 * </p>
	 */
	public static McObfPair func_72363_f = McMappingDatabase.getSRG("PlayerList.func_72363_f");

	/**
	 * <p>
	 * Name: whiteListedPlayers
	 * </p>
	 */
	public static McObfPair field_72411_j = McMappingDatabase.getSRG("field_72411_j");

	/**
	 * <p>
	 * Name: getEntityViewDistance
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_72372_a = McMappingDatabase.getSRG("PlayerList.func_72372_a");

	/**
	 * <p>
	 * Name: maxPlayers
	 * </p>
	 */
	public static McObfPair field_72405_c = McMappingDatabase.getSRG("field_72405_c");

	/**
	 * <p>
	 * Name: advancements
	 * </p>
	 */
	public static McObfPair field_192055_p = McMappingDatabase.getSRG("field_192055_p");

	/**
	 * <p>
	 * Name: setPlayerGameTypeBasedOnOther
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/world/World;)V]
	 * </p>
	 */
	public static McObfPair func_72381_a = McMappingDatabase.getSRG("PlayerList.func_72381_a");

	/**
	 * <p>
	 * Name: syncPlayerInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_72385_f = McMappingDatabase.getSRG("PlayerList.func_72385_f");

	/**
	 * <p>
	 * Name: DATE_FORMAT
	 * </p>
	 */
	public static McObfPair field_72403_e = McMappingDatabase.getSRG("field_72403_e");

	/**
	 * <p>
	 * Name: playerDataManager
	 * </p>
	 */
	public static McObfPair field_72412_k = McMappingDatabase.getSRG("field_72412_k");

	/**
	 * <p>
	 * Name: setGameType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/GameType;)V]
	 * </p>
	 */
	public static McObfPair func_152604_a = McMappingDatabase.getSRG("PlayerList.func_152604_a");

	/**
	 * <p>
	 * Name: ops
	 * </p>
	 */
	public static McObfPair field_72414_i = McMappingDatabase.getSRG("field_72414_i");

	/**
	 * <p>
	 * Name: sendScoreboard
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ServerScoreboard;Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_96456_a = McMappingDatabase.getSRG("PlayerList.func_96456_a");

	/**
	 * <p>
	 * Name: getMaxPlayers
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_72352_l = McMappingDatabase.getSRG("PlayerList.func_72352_l");

	/**
	 * <p>
	 * Name: sendMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_148539_a = McMappingDatabase.getSRG("PlayerList.func_148539_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_148546_d = McMappingDatabase.getSRG("field_148546_d");

	/**
	 * <p>
	 * Name: changePlayerDimension
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;I)V]
	 * </p>
	 */
	public static McObfPair func_187242_a = McMappingDatabase.getSRG("PlayerList.func_187242_a");

	/**
	 * <p>
	 * Name: getServerInstance
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/MinecraftServer;]
	 * </p>
	 */
	public static McObfPair func_72365_p = McMappingDatabase.getSRG("PlayerList.func_72365_p");

	/**
	 * <p>
	 * Name: commandsAllowedForAll
	 * </p>
	 */
	public static McObfPair field_72407_n = McMappingDatabase.getSRG("field_72407_n");

	/**
	 * <p>
	 * Name: sendMessageToAllTeamMembers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_177453_a = McMappingDatabase.getSRG("PlayerList.func_177453_a");

	/**
	 * <p>
	 * Name: setCommandsAllowedForAll
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_72387_b = McMappingDatabase.getSRG("PlayerList.func_72387_b");

	/**
	 * <p>
	 * Name: uuidToPlayerMap
	 * </p>
	 */
	public static McObfPair field_177454_f = McMappingDatabase.getSRG("field_177454_f");

	/**
	 * <p>
	 * Name: sendPlayerPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;I)V]
	 * </p>
	 */
	public static McObfPair func_187245_a = McMappingDatabase.getSRG("PlayerList.func_187245_a");

	/**
	 * <p>
	 * Name: getWhitelistedPlayerNames
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_152598_l = McMappingDatabase.getSRG("PlayerList.func_152598_l");

	/**
	 * <p>
	 * Name: whiteListEnforced
	 * </p>
	 */
	public static McObfPair field_72409_l = McMappingDatabase.getSRG("field_72409_l");

	/**
	 * <p>
	 * Name: getPlayersMatchingAddress
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_72382_j = McMappingDatabase.getSRG("PlayerList.func_72382_j");

	/**
	 * <p>
	 * Name: getWhitelistedPlayers
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/management/UserListWhitelist;]
	 * </p>
	 */
	public static McObfPair func_152599_k = McMappingDatabase.getSRG("PlayerList.func_152599_k");

	/**
	 * <p>
	 * Name: removeAllPlayers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72392_r = McMappingDatabase.getSRG("PlayerList.func_72392_r");

	/**
	 * <p>
	 * Name: bypassesPlayerLimit
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)Z]
	 * </p>
	 */
	public static McObfPair func_183023_f = McMappingDatabase.getSRG("PlayerList.func_183023_f");

	/**
	 * <p>
	 * Name: addWhitelistedPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)V]
	 * </p>
	 */
	public static McObfPair func_152601_d = McMappingDatabase.getSRG("PlayerList.func_152601_d");

	/**
	 * <p>
	 * Name: getOnlinePlayerNames
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_72369_d = McMappingDatabase.getSRG("PlayerList.func_72369_d");

	/**
	 * <p>
	 * Name: sendToAllNearExcept
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;DDDDILnet/minecraft/network/Packet;)V]
	 * </p>
	 */
	public static McObfPair func_148543_a = McMappingDatabase.getSRG("PlayerList.func_148543_a");

	/**
	 * <p>
	 * Name: preparePlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/world/WorldServer;)V]
	 * </p>
	 */
	public static McObfPair func_72375_a = McMappingDatabase.getSRG("PlayerList.func_72375_a");

	/**
	 * <p>
	 * Name: playerPingIndex
	 * </p>
	 */
	public static McObfPair field_72408_o = McMappingDatabase.getSRG("field_72408_o");

	/**
	 * <p>
	 * Name: getFormattedListOfPlayers
	 * </p>
	 * <p>
	 * Desc: [(Z)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_181058_b = McMappingDatabase.getSRG("PlayerList.func_181058_b");

	/**
	 * <p>
	 * Name: FILE_IPBANS
	 * </p>
	 */
	public static McObfPair field_152614_b = McMappingDatabase.getSRG("field_152614_b");

	/**
	 * <p>
	 * Name: bannedIPs
	 * </p>
	 */
	public static McObfPair field_72413_h = McMappingDatabase.getSRG("field_72413_h");

	/**
	 * <p>
	 * Name: transferEntityToWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;ILnet/minecraft/world/WorldServer;Lnet/minecraft/world/WorldServer;)V]
	 * </p>
	 */
	public static McObfPair func_82448_a = McMappingDatabase.getSRG("PlayerList.func_82448_a");

	/**
	 * <p>
	 * Name: getOnlinePlayerProfiles
	 * </p>
	 * <p>
	 * Desc: [()[Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_152600_g = McMappingDatabase.getSRG("PlayerList.func_152600_g");

	/**
	 * <p>
	 * Name: setPlayerManager
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/world/WorldServer;)V]
	 * </p>
	 */
	public static McObfPair func_72364_a = McMappingDatabase.getSRG("PlayerList.func_72364_a");

	/**
	 * <p>
	 * Name: mcServer
	 * </p>
	 */
	public static McObfPair field_72400_f = McMappingDatabase.getSRG("field_72400_f");

	/**
	 * <p>
	 * Name: playerEntityList
	 * </p>
	 */
	public static McObfPair field_72404_b = McMappingDatabase.getSRG("field_72404_b");

	/**
	 * <p>
	 * Name: bannedPlayers
	 * </p>
	 */
	public static McObfPair field_72401_g = McMappingDatabase.getSRG("field_72401_g");

	/**
	 * <p>
	 * Name: saveAllPlayerData
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72389_g = McMappingDatabase.getSRG("PlayerList.func_72389_g");

	/**
	 * <p>
	 * Name: readPlayerDataFromFile
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_72380_a = McMappingDatabase.getSRG("PlayerList.func_72380_a");

	/**
	 * <p>
	 * Name: onTick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72374_b = McMappingDatabase.getSRG("PlayerList.func_72374_b");

	/**
	 * <p>
	 * Name: sendPacketToAllPlayers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/Packet;)V]
	 * </p>
	 */
	public static McObfPair func_148540_a = McMappingDatabase.getSRG("PlayerList.func_148540_a");

	/**
	 * <p>
	 * Name: sendMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;Z)V]
	 * </p>
	 */
	public static McObfPair func_148544_a = McMappingDatabase.getSRG("PlayerList.func_148544_a");

	/**
	 * <p>
	 * Name: FILE_OPS
	 * </p>
	 */
	public static McObfPair field_152615_c = McMappingDatabase.getSRG("field_152615_c");

	/**
	 * <p>
	 * Name: FILE_PLAYERBANS
	 * </p>
	 */
	public static McObfPair field_152613_a = McMappingDatabase.getSRG("field_152613_a");

	/**
	 * <p>
	 * Name: removePlayerFromWhitelist
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)V]
	 * </p>
	 */
	public static McObfPair func_152597_c = McMappingDatabase.getSRG("PlayerList.func_152597_c");

	/**
	 * <p>
	 * Name: reloadWhitelist
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187244_a = McMappingDatabase.getSRG("PlayerList.func_187244_a");

	/**
	 * <p>
	 * Name: sendMessageToTeamOrAllPlayers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_177452_b = McMappingDatabase.getSRG("PlayerList.func_177452_b");

	/**
	 * <p>
	 * Name: sendPacketToAllPlayersInDimension
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/Packet;I)V]
	 * </p>
	 */
	public static McObfPair func_148537_a = McMappingDatabase.getSRG("PlayerList.func_148537_a");

}

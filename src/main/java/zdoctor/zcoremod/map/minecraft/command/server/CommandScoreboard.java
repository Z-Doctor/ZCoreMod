package zdoctor.zcoremod.map.minecraft.command.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandScoreboard {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "dg";
		else
			return "net/minecraft/command/server/CommandScoreboard";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "dg";
		else
			return "CommandScoreboard";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ldg;";
		else
			return "Lnet/minecraft/command/server/CommandScoreboard;";
	}

	/**
	 * <p>
	 * Name: getObjectiveNames
	 * </p>
	 * <p>
	 * Desc: [(ZLnet/minecraft/server/MinecraftServer;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184926_a = McMappingDatabase.getSRG("CommandScoreboard.func_184926_a");

	/**
	 * <p>
	 * Name: getRequiredPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82362_a = McMappingDatabase.getSRG("CommandScoreboard.func_82362_a");

	/**
	 * <p>
	 * Name: getTriggerNames
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184904_b = McMappingDatabase.getSRG("CommandScoreboard.func_184904_b");

	/**
	 * <p>
	 * Name: setTeamOption
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;ILnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184923_c = McMappingDatabase.getSRG("CommandScoreboard.func_184923_c");

	/**
	 * <p>
	 * Name: addObjective
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;ILnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184908_a = McMappingDatabase.getSRG("CommandScoreboard.func_184908_a");

	/**
	 * <p>
	 * Name: handleUserWildcards
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_184909_b = McMappingDatabase.getSRG("CommandScoreboard.func_184909_b");

	/**
	 * <p>
	 * Name: enablePlayerTrigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;ILnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184914_m = McMappingDatabase.getSRG("CommandScoreboard.func_184914_m");

	/**
	 * <p>
	 * Name: getScoreboard
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;)Lnet/minecraft/scoreboard/Scoreboard;]
	 * </p>
	 */
	public static McObfPair func_184913_a = McMappingDatabase.getSRG("CommandScoreboard.func_184913_a");

	/**
	 * <p>
	 * Name: addPlayerScore
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;ILnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184918_k = McMappingDatabase.getSRG("CommandScoreboard.func_184918_k");

	/**
	 * <p>
	 * Name: removeObjective
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Ljava/lang/String;Lnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184905_a = McMappingDatabase.getSRG("CommandScoreboard.func_184905_a");

	/**
	 * <p>
	 * Name: addTeam
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;ILnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184910_b = McMappingDatabase.getSRG("CommandScoreboard.func_184910_b");

	/**
	 * <p>
	 * Name: setDisplayObjective
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;ILnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184919_i = McMappingDatabase.getSRG("CommandScoreboard.func_184919_i");

	/**
	 * <p>
	 * Name: testPlayerScore
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;ILnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184907_n = McMappingDatabase.getSRG("CommandScoreboard.func_184907_n");

	/**
	 * <p>
	 * Name: emptyTeam
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;ILnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184917_h = McMappingDatabase.getSRG("CommandScoreboard.func_184917_h");

	/**
	 * <p>
	 * Name: resetPlayerScore
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;ILnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184912_l = McMappingDatabase.getSRG("CommandScoreboard.func_184912_l");

	/**
	 * <p>
	 * Name: listTeams
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;ILnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184922_e = McMappingDatabase.getSRG("CommandScoreboard.func_184922_e");

	/**
	 * <p>
	 * Name: convertToTeam
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/server/MinecraftServer;)Lnet/minecraft/scoreboard/ScorePlayerTeam;]
	 * </p>
	 */
	public static McObfPair func_184915_a = McMappingDatabase.getSRG("CommandScoreboard.func_184915_a");

	/**
	 * <p>
	 * Name: execute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_184881_a = McMappingDatabase.getSRG("CommandScoreboard.func_184881_a");

	/**
	 * <p>
	 * Name: applyPlayerTag
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;I)V]
	 * </p>
	 */
	public static McObfPair func_184924_a = McMappingDatabase.getSRG("CommandScoreboard.func_184924_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71517_b = McMappingDatabase.getSRG("CommandScoreboard.func_71517_b");

	/**
	 * <p>
	 * Name: getTabCompletions
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184883_a = McMappingDatabase.getSRG("CommandScoreboard.func_184883_a");

	/**
	 * <p>
	 * Name: getUsage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71518_a = McMappingDatabase.getSRG("CommandScoreboard.func_71518_a");

	/**
	 * <p>
	 * Name: joinTeam
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;ILnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184916_f = McMappingDatabase.getSRG("CommandScoreboard.func_184916_f");

	/**
	 * <p>
	 * Name: listPlayers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;ILnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184920_j = McMappingDatabase.getSRG("CommandScoreboard.func_184920_j");

	/**
	 * <p>
	 * Name: isUsernameIndex
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;I)Z]
	 * </p>
	 */
	public static McObfPair func_82358_a = McMappingDatabase.getSRG("CommandScoreboard.func_82358_a");

	/**
	 * <p>
	 * Name: applyPlayerOperation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;ILnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184906_o = McMappingDatabase.getSRG("CommandScoreboard.func_184906_o");

	/**
	 * <p>
	 * Name: listObjectives
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184925_a = McMappingDatabase.getSRG("CommandScoreboard.func_184925_a");

	/**
	 * <p>
	 * Name: leaveTeam
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;ILnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184911_g = McMappingDatabase.getSRG("CommandScoreboard.func_184911_g");

	/**
	 * <p>
	 * Name: removeTeam
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;ILnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184921_d = McMappingDatabase.getSRG("CommandScoreboard.func_184921_d");

	/**
	 * <p>
	 * Name: convertToObjective
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;ZLnet/minecraft/server/MinecraftServer;)Lnet/minecraft/scoreboard/ScoreObjective;]
	 * </p>
	 */
	public static McObfPair func_184903_a = McMappingDatabase.getSRG("CommandScoreboard.func_184903_a");

}

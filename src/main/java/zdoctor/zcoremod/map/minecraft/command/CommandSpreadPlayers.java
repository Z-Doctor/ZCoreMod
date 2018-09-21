package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandSpreadPlayers {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "dn";
		else
			return "net/minecraft/command/CommandSpreadPlayers";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "dn";
		else
			return "CommandSpreadPlayers";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ldn;";
		else
			return "Lnet/minecraft/command/CommandSpreadPlayers;";
	}

	/**
	 * <p>
	 * Name: getTabCompletions
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184883_a = McMappingDatabase.getSRG("CommandSpreadPlayers.func_184883_a");

	/**
	 * <p>
	 * Name: getUsage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71518_a = McMappingDatabase.getSRG("CommandSpreadPlayers.func_71518_a");

	/**
	 * <p>
	 * Name: spreadPositions
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/CommandSpreadPlayers$Position;DLnet/minecraft/world/World;Ljava/util/Random;DDDD[Lnet/minecraft/command/CommandSpreadPlayers$Position;Z)I]
	 * </p>
	 */
	public static McObfPair func_110668_a = McMappingDatabase.getSRG("CommandSpreadPlayers.func_110668_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71517_b = McMappingDatabase.getSRG("CommandSpreadPlayers.func_71517_b");

	/**
	 * <p>
	 * Name: execute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_184881_a = McMappingDatabase.getSRG("CommandSpreadPlayers.func_184881_a");

	/**
	 * <p>
	 * Name: createInitialPositions
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;IDDDD)[Lnet/minecraft/command/CommandSpreadPlayers$Position;]
	 * </p>
	 */
	public static McObfPair func_110670_a = McMappingDatabase.getSRG("CommandSpreadPlayers.func_110670_a");

	/**
	 * <p>
	 * Name: spread
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Ljava/util/List;Lnet/minecraft/command/CommandSpreadPlayers$Position;DDLnet/minecraft/world/World;Z)V]
	 * </p>
	 */
	public static McObfPair func_110669_a = McMappingDatabase.getSRG("CommandSpreadPlayers.func_110669_a");

	/**
	 * <p>
	 * Name: setPlayerPositions
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/world/World;[Lnet/minecraft/command/CommandSpreadPlayers$Position;Z)D]
	 * </p>
	 */
	public static McObfPair func_110671_a = McMappingDatabase.getSRG("CommandSpreadPlayers.func_110671_a");

	/**
	 * <p>
	 * Name: getNumberOfTeams
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)I]
	 * </p>
	 */
	public static McObfPair func_110667_a = McMappingDatabase.getSRG("CommandSpreadPlayers.func_110667_a");

	/**
	 * <p>
	 * Name: getRequiredPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82362_a = McMappingDatabase.getSRG("CommandSpreadPlayers.func_82362_a");

}

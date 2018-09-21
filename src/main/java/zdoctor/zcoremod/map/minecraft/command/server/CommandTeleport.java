package zdoctor.zcoremod.map.minecraft.command.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandTeleport {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "dt";
		else
			return "net/minecraft/command/server/CommandTeleport";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "dt";
		else
			return "CommandTeleport";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ldt;";
		else
			return "Lnet/minecraft/command/server/CommandTeleport;";
	}

	/**
	 * <p>
	 * Name: getRequiredPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82362_a = McMappingDatabase.getSRG("CommandTeleport.func_82362_a");

	/**
	 * <p>
	 * Name: isUsernameIndex
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;I)Z]
	 * </p>
	 */
	public static McObfPair func_82358_a = McMappingDatabase.getSRG("CommandTeleport.func_82358_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71517_b = McMappingDatabase.getSRG("CommandTeleport.func_71517_b");

	/**
	 * <p>
	 * Name: getTabCompletions
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184883_a = McMappingDatabase.getSRG("CommandTeleport.func_184883_a");

	/**
	 * <p>
	 * Name: doTeleport
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/command/CommandBase$CoordinateArg;Lnet/minecraft/command/CommandBase$CoordinateArg;Lnet/minecraft/command/CommandBase$CoordinateArg;Lnet/minecraft/command/CommandBase$CoordinateArg;Lnet/minecraft/command/CommandBase$CoordinateArg;)V]
	 * </p>
	 */
	public static McObfPair func_189862_a = McMappingDatabase.getSRG("CommandTeleport.func_189862_a");

	/**
	 * <p>
	 * Name: getUsage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71518_a = McMappingDatabase.getSRG("CommandTeleport.func_71518_a");

	/**
	 * <p>
	 * Name: execute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_184881_a = McMappingDatabase.getSRG("CommandTeleport.func_184881_a");

}

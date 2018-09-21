package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ICommand {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bk";
		else
			return "net/minecraft/command/ICommand";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bk";
		else
			return "ICommand";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbk;";
		else
			return "Lnet/minecraft/command/ICommand;";
	}

	/**
	 * <p>
	 * Name: getUsage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71518_a = McMappingDatabase.getSRG("ICommand.func_71518_a");

	/**
	 * <p>
	 * Name: getAliases
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_71514_a = McMappingDatabase.getSRG("ICommand.func_71514_a");

	/**
	 * <p>
	 * Name: getTabCompletions
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184883_a = McMappingDatabase.getSRG("ICommand.func_184883_a");

	/**
	 * <p>
	 * Name: checkPermission
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;)Z]
	 * </p>
	 */
	public static McObfPair func_184882_a = McMappingDatabase.getSRG("ICommand.func_184882_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71517_b = McMappingDatabase.getSRG("ICommand.func_71517_b");

	/**
	 * <p>
	 * Name: isUsernameIndex
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;I)Z]
	 * </p>
	 */
	public static McObfPair func_82358_a = McMappingDatabase.getSRG("ICommand.func_82358_a");

	/**
	 * <p>
	 * Name: execute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_184881_a = McMappingDatabase.getSRG("ICommand.func_184881_a");

}

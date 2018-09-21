package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandHandler {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bj";
		else
			return "net/minecraft/command/CommandHandler";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bj";
		else
			return "CommandHandler";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbj;";
		else
			return "Lnet/minecraft/command/CommandHandler;";
	}

	/**
	 * <p>
	 * Name: getServer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/MinecraftServer;]
	 * </p>
	 */
	public static McObfPair func_184879_a = McMappingDatabase.getSRG("CommandHandler.func_184879_a");

	/**
	 * <p>
	 * Name: getPossibleCommands
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_71557_a = McMappingDatabase.getSRG("CommandHandler.func_71557_a");

	/**
	 * <p>
	 * Name: getUsernameIndex
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommand;[Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_82370_a = McMappingDatabase.getSRG("CommandHandler.func_82370_a");

	/**
	 * <p>
	 * Name: tryExecute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;Lnet/minecraft/command/ICommand;Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_175786_a = McMappingDatabase.getSRG("CommandHandler.func_175786_a");

	/**
	 * <p>
	 * Name: getCommands
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_71555_a = McMappingDatabase.getSRG("CommandHandler.func_71555_a");

	/**
	 * <p>
	 * Name: registerCommand
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommand;)Lnet/minecraft/command/ICommand;]
	 * </p>
	 */
	public static McObfPair func_71560_a = McMappingDatabase.getSRG("CommandHandler.func_71560_a");

	/**
	 * <p>
	 * Name: dropFirstString
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;)[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71559_a = McMappingDatabase.getSRG("CommandHandler.func_71559_a");

	/**
	 * <p>
	 * Name: executeCommand
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_71556_a = McMappingDatabase.getSRG("CommandHandler.func_71556_a");

	/**
	 * <p>
	 * Name: commandMap
	 * </p>
	 */
	public static McObfPair field_71562_a = McMappingDatabase.getSRG("field_71562_a");

	/**
	 * <p>
	 * Name: commandSet
	 * </p>
	 */
	public static McObfPair field_71561_b = McMappingDatabase.getSRG("field_71561_b");

	/**
	 * <p>
	 * Name: getTabCompletions
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_180524_a = McMappingDatabase.getSRG("CommandHandler.func_180524_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147175_a = McMappingDatabase.getSRG("field_147175_a");

}

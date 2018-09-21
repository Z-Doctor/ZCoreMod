package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandHelp {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cn";
		else
			return "net/minecraft/command/CommandHelp";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cn";
		else
			return "CommandHelp";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcn;";
		else
			return "Lnet/minecraft/command/CommandHelp;";
	}

	/**
	 * <p>
	 * Name: getTabCompletions
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184883_a = McMappingDatabase.getSRG("CommandHelp.func_184883_a");

	/**
	 * <p>
	 * Name: getSortedPossibleCommands
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/server/MinecraftServer;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184900_a = McMappingDatabase.getSRG("CommandHelp.func_184900_a");

	/**
	 * <p>
	 * Name: rand
	 * </p>
	 */
	public static McObfPair field_184902_b = McMappingDatabase.getSRG("field_184902_b");

	/**
	 * <p>
	 * Name: getAliases
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_71514_a = McMappingDatabase.getSRG("CommandHelp.func_71514_a");

	/**
	 * <p>
	 * Name: execute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_184881_a = McMappingDatabase.getSRG("CommandHelp.func_184881_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71517_b = McMappingDatabase.getSRG("CommandHelp.func_71517_b");

	/**
	 * <p>
	 * Name: SEARGE_SAYS
	 * </p>
	 */
	public static McObfPair field_184901_a = McMappingDatabase.getSRG("field_184901_a");

	/**
	 * <p>
	 * Name: getCommandMap
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_184899_a = McMappingDatabase.getSRG("CommandHelp.func_184899_a");

	/**
	 * <p>
	 * Name: getRequiredPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82362_a = McMappingDatabase.getSRG("CommandHelp.func_82362_a");

	/**
	 * <p>
	 * Name: getUsage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71518_a = McMappingDatabase.getSRG("CommandHelp.func_71518_a");

}

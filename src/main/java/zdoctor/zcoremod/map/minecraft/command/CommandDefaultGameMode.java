package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandDefaultGameMode {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ca";
		else
			return "net/minecraft/command/CommandDefaultGameMode";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ca";
		else
			return "CommandDefaultGameMode";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lca;";
		else
			return "Lnet/minecraft/command/CommandDefaultGameMode;";
	}

	/**
	 * <p>
	 * Name: getUsage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71518_a = McMappingDatabase.getSRG("CommandDefaultGameMode.func_71518_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71517_b = McMappingDatabase.getSRG("CommandDefaultGameMode.func_71517_b");

	/**
	 * <p>
	 * Name: execute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_184881_a = McMappingDatabase.getSRG("CommandDefaultGameMode.func_184881_a");

	/**
	 * <p>
	 * Name: setDefaultGameType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/GameType;Lnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184896_a = McMappingDatabase.getSRG("CommandDefaultGameMode.func_184896_a");

}

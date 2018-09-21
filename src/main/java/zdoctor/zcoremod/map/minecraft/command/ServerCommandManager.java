package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerCommandManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "dh";
		else
			return "net/minecraft/command/ServerCommandManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "dh";
		else
			return "ServerCommandManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ldh;";
		else
			return "Lnet/minecraft/command/ServerCommandManager;";
	}

	/**
	 * <p>
	 * Name: getServer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/MinecraftServer;]
	 * </p>
	 */
	public static McObfPair func_184879_a = McMappingDatabase.getSRG("ServerCommandManager.func_184879_a");

	/**
	 * <p>
	 * Name: notifyListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/command/ICommand;ILjava/lang/String;[Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_152372_a = McMappingDatabase.getSRG("ServerCommandManager.func_152372_a");

	/**
	 * <p>
	 * Name: server
	 * </p>
	 */
	public static McObfPair field_184880_a = McMappingDatabase.getSRG("field_184880_a");

}

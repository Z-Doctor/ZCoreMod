package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandBlockData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bv";
		else
			return "net/minecraft/command/CommandBlockData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bv";
		else
			return "CommandBlockData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbv;";
		else
			return "Lnet/minecraft/command/CommandBlockData;";
	}

	/**
	 * <p>
	 * Name: execute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_184881_a = McMappingDatabase.getSRG("CommandBlockData.func_184881_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71517_b = McMappingDatabase.getSRG("CommandBlockData.func_71517_b");

	/**
	 * <p>
	 * Name: getRequiredPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82362_a = McMappingDatabase.getSRG("CommandBlockData.func_82362_a");

	/**
	 * <p>
	 * Name: getTabCompletions
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184883_a = McMappingDatabase.getSRG("CommandBlockData.func_184883_a");

	/**
	 * <p>
	 * Name: getUsage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71518_a = McMappingDatabase.getSRG("CommandBlockData.func_71518_a");

}

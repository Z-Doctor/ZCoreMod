package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandDebug {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bz";
		else
			return "net/minecraft/command/CommandDebug";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bz";
		else
			return "CommandDebug";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbz;";
		else
			return "Lnet/minecraft/command/CommandDebug;";
	}

	/**
	 * <p>
	 * Name: getWittyComment
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_147203_d = McMappingDatabase.getSRG("CommandDebug.func_147203_d");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71517_b = McMappingDatabase.getSRG("CommandDebug.func_71517_b");

	/**
	 * <p>
	 * Name: profileStartTime
	 * </p>
	 */
	public static McObfPair field_147206_b = McMappingDatabase.getSRG("field_147206_b");

	/**
	 * <p>
	 * Name: profileStartTick
	 * </p>
	 */
	public static McObfPair field_147207_c = McMappingDatabase.getSRG("field_147207_c");

	/**
	 * <p>
	 * Name: getProfilerResults
	 * </p>
	 * <p>
	 * Desc: [(JILnet/minecraft/server/MinecraftServer;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_184893_b = McMappingDatabase.getSRG("CommandDebug.func_184893_b");

	/**
	 * <p>
	 * Name: getRequiredPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82362_a = McMappingDatabase.getSRG("CommandDebug.func_82362_a");

	/**
	 * <p>
	 * Name: getTabCompletions
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184883_a = McMappingDatabase.getSRG("CommandDebug.func_184883_a");

	/**
	 * <p>
	 * Name: execute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_184881_a = McMappingDatabase.getSRG("CommandDebug.func_184881_a");

	/**
	 * <p>
	 * Name: appendProfilerResults
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;Ljava/lang/StringBuilder;Lnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184895_a = McMappingDatabase.getSRG("CommandDebug.func_184895_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147208_a = McMappingDatabase.getSRG("field_147208_a");

	/**
	 * <p>
	 * Name: getUsage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71518_a = McMappingDatabase.getSRG("CommandDebug.func_71518_a");

	/**
	 * <p>
	 * Name: saveProfilerResults
	 * </p>
	 * <p>
	 * Desc: [(JILnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184894_a = McMappingDatabase.getSRG("CommandDebug.func_184894_a");

}

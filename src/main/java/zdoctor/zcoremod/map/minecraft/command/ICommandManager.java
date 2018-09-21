package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ICommandManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bl";
		else
			return "net/minecraft/command/ICommandManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bl";
		else
			return "ICommandManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbl;";
		else
			return "Lnet/minecraft/command/ICommandManager;";
	}

	/**
	 * <p>
	 * Name: getPossibleCommands
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_71557_a = McMappingDatabase.getSRG("ICommandManager.func_71557_a");

	/**
	 * <p>
	 * Name: getCommands
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_71555_a = McMappingDatabase.getSRG("ICommandManager.func_71555_a");

	/**
	 * <p>
	 * Name: executeCommand
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_71556_a = McMappingDatabase.getSRG("ICommandManager.func_71556_a");

	/**
	 * <p>
	 * Name: getTabCompletions
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_180524_a = McMappingDatabase.getSRG("ICommandManager.func_180524_a");

}

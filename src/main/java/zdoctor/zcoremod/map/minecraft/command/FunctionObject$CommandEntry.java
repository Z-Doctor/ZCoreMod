package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FunctionObject$CommandEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bm$b";
		else
			return "net/minecraft/command/FunctionObject$CommandEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bm$b";
		else
			return "FunctionObject$CommandEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbm$b;";
		else
			return "Lnet/minecraft/command/FunctionObject$CommandEntry;";
	}

	/**
	 * <p>
	 * Name: execute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/FunctionManager;Lnet/minecraft/command/ICommandSender;Ljava/util/ArrayDeque;I)V]
	 * </p>
	 */
	public static McObfPair func_194145_a = McMappingDatabase.getSRG("FunctionObject$CommandEntry.func_194145_a");

	/**
	 * <p>
	 * Name: command
	 * </p>
	 */
	public static McObfPair field_193525_a = McMappingDatabase.getSRG("field_193525_a");

}

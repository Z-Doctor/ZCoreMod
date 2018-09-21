package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FunctionObject$FunctionEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bm$d";
		else
			return "net/minecraft/command/FunctionObject$FunctionEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bm$d";
		else
			return "FunctionObject$FunctionEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbm$d;";
		else
			return "Lnet/minecraft/command/FunctionObject$FunctionEntry;";
	}

	/**
	 * <p>
	 * Name: function
	 * </p>
	 */
	public static McObfPair field_193524_a = McMappingDatabase.getSRG("field_193524_a");

	/**
	 * <p>
	 * Name: execute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/FunctionManager;Lnet/minecraft/command/ICommandSender;Ljava/util/ArrayDeque;I)V]
	 * </p>
	 */
	public static McObfPair func_194145_a = McMappingDatabase.getSRG("FunctionObject$FunctionEntry.func_194145_a");

}

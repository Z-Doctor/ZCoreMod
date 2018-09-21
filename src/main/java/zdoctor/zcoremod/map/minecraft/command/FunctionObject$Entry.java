package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FunctionObject$Entry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bm$c";
		else
			return "net/minecraft/command/FunctionObject$Entry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bm$c";
		else
			return "FunctionObject$Entry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbm$c;";
		else
			return "Lnet/minecraft/command/FunctionObject$Entry;";
	}

	/**
	 * <p>
	 * Name: execute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/FunctionManager;Lnet/minecraft/command/ICommandSender;Ljava/util/ArrayDeque;I)V]
	 * </p>
	 */
	public static McObfPair func_194145_a = McMappingDatabase.getSRG("FunctionObject$Entry.func_194145_a");

}

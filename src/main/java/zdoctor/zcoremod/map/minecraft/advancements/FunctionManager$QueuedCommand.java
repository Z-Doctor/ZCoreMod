package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FunctionManager$QueuedCommand {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nt$a";
		else
			return "net/minecraft/advancements/FunctionManager$QueuedCommand";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nt$a";
		else
			return "FunctionManager$QueuedCommand";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnt$a;";
		else
			return "Lnet/minecraft/advancements/FunctionManager$QueuedCommand;";
	}

	/**
	 * <p>
	 * Name: execute
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/ArrayDeque;I)V]
	 * </p>
	 */
	public static McObfPair func_194222_a = McMappingDatabase.getSRG("FunctionManager$QueuedCommand.func_194222_a");

	/**
	 * <p>
	 * Name: entry
	 * </p>
	 */
	public static McObfPair field_194225_c = McMappingDatabase.getSRG("field_194225_c");

	/**
	 * <p>
	 * Name: functionManager
	 * </p>
	 */
	public static McObfPair field_194223_a = McMappingDatabase.getSRG("field_194223_a");

	/**
	 * <p>
	 * Name: sender
	 * </p>
	 */
	public static McObfPair field_194224_b = McMappingDatabase.getSRG("field_194224_b");

}

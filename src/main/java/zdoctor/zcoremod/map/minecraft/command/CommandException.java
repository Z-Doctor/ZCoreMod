package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ei";
		else
			return "net/minecraft/command/CommandException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ei";
		else
			return "CommandException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lei;";
		else
			return "Lnet/minecraft/command/CommandException;";
	}

	/**
	 * <p>
	 * Name: getErrorObjects
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_74844_a = McMappingDatabase.getSRG("CommandException.func_74844_a");

	/**
	 * <p>
	 * Name: errorObjects
	 * </p>
	 */
	public static McObfPair field_74845_a = McMappingDatabase.getSRG("field_74845_a");

}

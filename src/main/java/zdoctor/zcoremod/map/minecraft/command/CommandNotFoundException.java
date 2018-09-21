package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandNotFoundException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "eo";
		else
			return "net/minecraft/command/CommandNotFoundException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "eo";
		else
			return "CommandNotFoundException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Leo;";
		else
			return "Lnet/minecraft/command/CommandNotFoundException;";
	}

}

package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class InvalidBlockStateException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ek";
		else
			return "net/minecraft/command/InvalidBlockStateException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ek";
		else
			return "InvalidBlockStateException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lek;";
		else
			return "Lnet/minecraft/command/InvalidBlockStateException;";
	}

}

package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SyntaxErrorException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "em";
		else
			return "net/minecraft/command/SyntaxErrorException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "em";
		else
			return "SyntaxErrorException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lem;";
		else
			return "Lnet/minecraft/command/SyntaxErrorException;";
	}

}

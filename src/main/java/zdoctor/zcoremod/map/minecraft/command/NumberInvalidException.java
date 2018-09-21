package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NumberInvalidException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "el";
		else
			return "net/minecraft/command/NumberInvalidException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "el";
		else
			return "NumberInvalidException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lel;";
		else
			return "Lnet/minecraft/command/NumberInvalidException;";
	}

}

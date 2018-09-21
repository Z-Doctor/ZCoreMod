package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WrongUsageException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ep";
		else
			return "net/minecraft/command/WrongUsageException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ep";
		else
			return "WrongUsageException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lep;";
		else
			return "Lnet/minecraft/command/WrongUsageException;";
	}

}

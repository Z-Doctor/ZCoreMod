package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlayerNotFoundException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "en";
		else
			return "net/minecraft/command/PlayerNotFoundException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "en";
		else
			return "PlayerNotFoundException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Len;";
		else
			return "Lnet/minecraft/command/PlayerNotFoundException;";
	}

}

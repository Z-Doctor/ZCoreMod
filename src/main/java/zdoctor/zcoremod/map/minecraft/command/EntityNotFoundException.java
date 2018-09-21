package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityNotFoundException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ej";
		else
			return "net/minecraft/command/EntityNotFoundException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ej";
		else
			return "EntityNotFoundException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lej;";
		else
			return "Lnet/minecraft/command/EntityNotFoundException;";
	}

}

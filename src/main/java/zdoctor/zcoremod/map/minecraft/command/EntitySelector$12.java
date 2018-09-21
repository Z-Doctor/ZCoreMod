package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySelector$12 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bq$4";
		else
			return "net/minecraft/command/EntitySelector$12";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bq$4";
		else
			return "EntitySelector$12";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbq$4;";
		else
			return "Lnet/minecraft/command/EntitySelector$12;";
	}

}

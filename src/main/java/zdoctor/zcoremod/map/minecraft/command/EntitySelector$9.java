package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySelector$9 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bq$14";
		else
			return "net/minecraft/command/EntitySelector$9";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bq$14";
		else
			return "EntitySelector$9";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbq$14;";
		else
			return "Lnet/minecraft/command/EntitySelector$9;";
	}

}

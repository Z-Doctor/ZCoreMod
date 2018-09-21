package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PreYggdrasilConverter$ConversionError {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pk$a";
		else
			return "net/minecraft/server/management/PreYggdrasilConverter$ConversionError";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pk$a";
		else
			return "PreYggdrasilConverter$ConversionError";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpk$a;";
		else
			return "Lnet/minecraft/server/management/PreYggdrasilConverter$ConversionError;";
	}

}

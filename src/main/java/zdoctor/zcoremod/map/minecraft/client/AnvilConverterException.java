package zdoctor.zcoremod.map.minecraft.client;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AnvilConverterException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bff";
		else
			return "net/minecraft/client/AnvilConverterException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bff";
		else
			return "AnvilConverterException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbff;";
		else
			return "Lnet/minecraft/client/AnvilConverterException;";
	}

}

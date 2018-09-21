package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumActionResult {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ud";
		else
			return "net/minecraft/util/EnumActionResult";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ud";
		else
			return "EnumActionResult";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lud;";
		else
			return "Lnet/minecraft/util/EnumActionResult;";
	}

}

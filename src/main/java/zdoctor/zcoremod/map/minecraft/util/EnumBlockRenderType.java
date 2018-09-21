package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumBlockRenderType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atj";
		else
			return "net/minecraft/util/EnumBlockRenderType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atj";
		else
			return "EnumBlockRenderType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Latj;";
		else
			return "Lnet/minecraft/util/EnumBlockRenderType;";
	}

}

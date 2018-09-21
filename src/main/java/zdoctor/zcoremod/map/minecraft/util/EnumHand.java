package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumHand {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ub";
		else
			return "net/minecraft/util/EnumHand";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ub";
		else
			return "EnumHand";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lub;";
		else
			return "Lnet/minecraft/util/EnumHand;";
	}

}

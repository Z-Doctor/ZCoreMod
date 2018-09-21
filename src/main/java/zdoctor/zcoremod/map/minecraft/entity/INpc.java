package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class INpc {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adx";
		else
			return "net/minecraft/entity/INpc";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adx";
		else
			return "INpc";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladx;";
		else
			return "Lnet/minecraft/entity/INpc;";
	}

}

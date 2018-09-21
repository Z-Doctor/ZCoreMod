package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MoverType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vv";
		else
			return "net/minecraft/entity/MoverType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vv";
		else
			return "MoverType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvv;";
		else
			return "Lnet/minecraft/entity/MoverType;";
	}

}

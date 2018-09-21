package zdoctor.zcoremod.map.minecraft.util.math;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Cartesian$GetList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ew$a";
		else
			return "net/minecraft/util/math/Cartesian$GetList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ew$a";
		else
			return "Cartesian$GetList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lew$a;";
		else
			return "Lnet/minecraft/util/math/Cartesian$GetList;";
	}

}

package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IAnimals {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vf";
		else
			return "net/minecraft/entity/passive/IAnimals";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vf";
		else
			return "IAnimals";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvf;";
		else
			return "Lnet/minecraft/entity/passive/IAnimals;";
	}

}

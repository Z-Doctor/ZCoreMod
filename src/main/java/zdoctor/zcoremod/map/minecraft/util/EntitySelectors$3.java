package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySelectors$3 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vk$3";
		else
			return "net/minecraft/util/EntitySelectors$3";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vk$3";
		else
			return "EntitySelectors$3";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvk$3;";
		else
			return "Lnet/minecraft/util/EntitySelectors$3;";
	}

}

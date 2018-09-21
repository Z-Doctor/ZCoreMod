package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySelectors$8 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vk$8";
		else
			return "net/minecraft/util/EntitySelectors$8";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vk$8";
		else
			return "EntitySelectors$8";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvk$8;";
		else
			return "Lnet/minecraft/util/EntitySelectors$8;";
	}

}

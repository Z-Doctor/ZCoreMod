package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIWatchClosest2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xh";
		else
			return "net/minecraft/entity/ai/EntityAIWatchClosest2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xh";
		else
			return "EntityAIWatchClosest2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxh;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIWatchClosest2;";
	}

}

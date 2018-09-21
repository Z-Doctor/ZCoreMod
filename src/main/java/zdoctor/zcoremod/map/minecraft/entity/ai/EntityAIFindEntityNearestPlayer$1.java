package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIFindEntityNearestPlayer$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yv$1";
		else
			return "net/minecraft/entity/ai/EntityAIFindEntityNearestPlayer$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yv$1";
		else
			return "EntityAIFindEntityNearestPlayer$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyv$1;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIFindEntityNearestPlayer$1;";
	}

}

package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIFindEntityNearest$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yu$1";
		else
			return "net/minecraft/entity/ai/EntityAIFindEntityNearest$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yu$1";
		else
			return "EntityAIFindEntityNearest$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyu$1;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIFindEntityNearest$1;";
	}

}

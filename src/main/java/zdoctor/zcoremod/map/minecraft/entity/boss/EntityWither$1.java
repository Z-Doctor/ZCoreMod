package zdoctor.zcoremod.map.minecraft.entity.boss;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityWither$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abx$1";
		else
			return "net/minecraft/entity/boss/EntityWither$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abx$1";
		else
			return "EntityWither$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labx$1;";
		else
			return "Lnet/minecraft/entity/boss/EntityWither$1;";
	}

}

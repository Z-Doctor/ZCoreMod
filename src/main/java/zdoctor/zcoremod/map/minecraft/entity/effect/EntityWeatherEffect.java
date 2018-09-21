package zdoctor.zcoremod.map.minecraft.entity.effect;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityWeatherEffect {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ach";
		else
			return "net/minecraft/entity/effect/EntityWeatherEffect";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ach";
		else
			return "EntityWeatherEffect";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lach;";
		else
			return "Lnet/minecraft/entity/effect/EntityWeatherEffect;";
	}

}

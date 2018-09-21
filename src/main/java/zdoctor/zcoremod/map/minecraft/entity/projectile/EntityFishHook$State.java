package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityFishHook$State {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acf$a";
		else
			return "net/minecraft/entity/projectile/EntityFishHook$State";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acf$a";
		else
			return "EntityFishHook$State";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacf$a;";
		else
			return "Lnet/minecraft/entity/projectile/EntityFishHook$State;";
	}

}

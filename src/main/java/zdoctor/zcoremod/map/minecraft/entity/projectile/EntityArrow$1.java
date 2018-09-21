package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityArrow$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aeh$1";
		else
			return "net/minecraft/entity/projectile/EntityArrow$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aeh$1";
		else
			return "EntityArrow$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laeh$1;";
		else
			return "Lnet/minecraft/entity/projectile/EntityArrow$1;";
	}

}

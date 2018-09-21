package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityBoat$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afd$1";
		else
			return "net/minecraft/entity/item/EntityBoat$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afd$1";
		else
			return "EntityBoat$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafd$1;";
		else
			return "Lnet/minecraft/entity/item/EntityBoat$1;";
	}

}

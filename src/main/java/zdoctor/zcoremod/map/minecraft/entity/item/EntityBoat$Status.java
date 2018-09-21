package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityBoat$Status {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afd$a";
		else
			return "net/minecraft/entity/item/EntityBoat$Status";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afd$a";
		else
			return "EntityBoat$Status";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafd$a;";
		else
			return "Lnet/minecraft/entity/item/EntityBoat$Status;";
	}

}

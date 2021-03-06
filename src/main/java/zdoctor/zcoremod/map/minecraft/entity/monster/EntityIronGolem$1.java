package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityIronGolem$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aak$1";
		else
			return "net/minecraft/entity/monster/EntityIronGolem$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aak$1";
		else
			return "EntityIronGolem$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laak$1;";
		else
			return "Lnet/minecraft/entity/monster/EntityIronGolem$1;";
	}

}

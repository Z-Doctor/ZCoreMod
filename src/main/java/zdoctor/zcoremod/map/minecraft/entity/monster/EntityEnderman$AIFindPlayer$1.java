package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityEnderman$AIFindPlayer$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acu$b$1";
		else
			return "net/minecraft/entity/monster/EntityEnderman$AIFindPlayer$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acu$b$1";
		else
			return "EntityEnderman$AIFindPlayer$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacu$b$1;";
		else
			return "Lnet/minecraft/entity/monster/EntityEnderman$AIFindPlayer$1;";
	}

}

package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityEvoker$AIWololoSpell$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acx$d$1";
		else
			return "net/minecraft/entity/monster/EntityEvoker$AIWololoSpell$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acx$d$1";
		else
			return "EntityEvoker$AIWololoSpell$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacx$d$1;";
		else
			return "Lnet/minecraft/entity/monster/EntityEvoker$AIWololoSpell$1;";
	}

}

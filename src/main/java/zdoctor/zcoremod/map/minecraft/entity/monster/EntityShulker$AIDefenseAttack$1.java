package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityShulker$AIDefenseAttack$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adi$c$1";
		else
			return "net/minecraft/entity/monster/EntityShulker$AIDefenseAttack$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adi$c$1";
		else
			return "EntityShulker$AIDefenseAttack$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladi$c$1;";
		else
			return "Lnet/minecraft/entity/monster/EntityShulker$AIDefenseAttack$1;";
	}

}
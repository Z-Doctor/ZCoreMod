package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySelectors$ArmoredMob {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vk$a";
		else
			return "net/minecraft/util/EntitySelectors$ArmoredMob";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vk$a";
		else
			return "EntitySelectors$ArmoredMob";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvk$a;";
		else
			return "Lnet/minecraft/util/EntitySelectors$ArmoredMob;";
	}

	/**
	 * <p>
	 * Name: armor
	 * </p>
	 */
	public static McObfPair field_96567_c = McMappingDatabase.getSRG("field_96567_c");

}

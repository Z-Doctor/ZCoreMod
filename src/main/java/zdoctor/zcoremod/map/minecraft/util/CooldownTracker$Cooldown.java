package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CooldownTracker$Cooldown {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aio$a";
		else
			return "net/minecraft/util/CooldownTracker$Cooldown";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aio$a";
		else
			return "CooldownTracker$Cooldown";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laio$a;";
		else
			return "Lnet/minecraft/util/CooldownTracker$Cooldown;";
	}

	/**
	 * <p>
	 * Name: createTicks
	 * </p>
	 */
	public static McObfPair field_185137_a = McMappingDatabase.getSRG("field_185137_a");

	/**
	 * <p>
	 * Name: expireTicks
	 * </p>
	 */
	public static McObfPair field_185138_b = McMappingDatabase.getSRG("field_185138_b");

}

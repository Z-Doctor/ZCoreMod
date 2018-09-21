package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ITabCompleter {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blp";
		else
			return "net/minecraft/util/ITabCompleter";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blp";
		else
			return "ITabCompleter";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblp;";
		else
			return "Lnet/minecraft/util/ITabCompleter;";
	}

	/**
	 * <p>
	 * Name: setCompletions
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_184072_a = McMappingDatabase.getSRG("ITabCompleter.func_184072_a");

}

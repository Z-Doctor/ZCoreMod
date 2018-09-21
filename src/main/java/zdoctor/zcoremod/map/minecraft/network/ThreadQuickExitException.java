package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ThreadQuickExitException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nr";
		else
			return "net/minecraft/network/ThreadQuickExitException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nr";
		else
			return "ThreadQuickExitException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnr;";
		else
			return "Lnet/minecraft/network/ThreadQuickExitException;";
	}

	/**
	 * <p>
	 * Name: INSTANCE
	 * </p>
	 */
	public static McObfPair field_179886_a = McMappingDatabase.getSRG("field_179886_a");

}

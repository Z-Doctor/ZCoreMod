package zdoctor.zcoremod.map.minecraft.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DebugLoggingPrintStream {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nm";
		else
			return "net/minecraft/server/DebugLoggingPrintStream";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nm";
		else
			return "DebugLoggingPrintStream";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnm;";
		else
			return "Lnet/minecraft/server/DebugLoggingPrintStream;";
	}

	/**
	 * <p>
	 * Name: logString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_179882_a = McMappingDatabase.getSRG("DebugLoggingPrintStream.func_179882_a");

}

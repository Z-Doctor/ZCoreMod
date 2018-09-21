package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LoggingPrintStream {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "no";
		else
			return "net/minecraft/util/LoggingPrintStream";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "no";
		else
			return "LoggingPrintStream";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lno;";
		else
			return "Lnet/minecraft/util/LoggingPrintStream;";
	}

	/**
	 * <p>
	 * Name: logString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_179882_a = McMappingDatabase.getSRG("LoggingPrintStream.func_179882_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_179884_a = McMappingDatabase.getSRG("field_179884_a");

	/**
	 * <p>
	 * Name: domain
	 * </p>
	 */
	public static McObfPair field_179883_b = McMappingDatabase.getSRG("field_179883_b");

}

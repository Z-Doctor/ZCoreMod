package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Session$Type {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bii$a";
		else
			return "net/minecraft/util/Session$Type";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bii$a";
		else
			return "Session$Type";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbii$a;";
		else
			return "Lnet/minecraft/util/Session$Type;";
	}

	/**
	 * <p>
	 * Name: SESSION_TYPES
	 * </p>
	 */
	public static McObfPair field_152425_c = McMappingDatabase.getSRG("field_152425_c");

	/**
	 * <p>
	 * Name: setSessionType
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/Session$Type;]
	 * </p>
	 */
	public static McObfPair func_152421_a = McMappingDatabase.getSRG("Session$Type.func_152421_a");

	/**
	 * <p>
	 * Name: sessionType
	 * </p>
	 */
	public static McObfPair field_152426_d = McMappingDatabase.getSRG("field_152426_d");

}

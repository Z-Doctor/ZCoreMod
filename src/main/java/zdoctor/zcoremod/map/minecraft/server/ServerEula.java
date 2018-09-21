package zdoctor.zcoremod.map.minecraft.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerEula {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nn";
		else
			return "net/minecraft/server/ServerEula";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nn";
		else
			return "ServerEula";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnn;";
		else
			return "Lnet/minecraft/server/ServerEula;";
	}

	/**
	 * <p>
	 * Name: createEULAFile
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_154348_b = McMappingDatabase.getSRG("ServerEula.func_154348_b");

	/**
	 * <p>
	 * Name: LOG
	 * </p>
	 */
	public static McObfPair field_154349_a = McMappingDatabase.getSRG("field_154349_a");

	/**
	 * <p>
	 * Name: hasAcceptedEULA
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_154346_a = McMappingDatabase.getSRG("ServerEula.func_154346_a");

	/**
	 * <p>
	 * Name: eulaFile
	 * </p>
	 */
	public static McObfPair field_154350_b = McMappingDatabase.getSRG("field_154350_b");

	/**
	 * <p>
	 * Name: acceptedEULA
	 * </p>
	 */
	public static McObfPair field_154351_c = McMappingDatabase.getSRG("field_154351_c");

	/**
	 * <p>
	 * Name: loadEULAFile
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;)Z]
	 * </p>
	 */
	public static McObfPair func_154347_a = McMappingDatabase.getSRG("ServerEula.func_154347_a");

}

package zdoctor.zcoremod.map.minecraft.init;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Bootstrap {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ni";
		else
			return "net/minecraft/init/Bootstrap";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ni";
		else
			return "Bootstrap";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lni;";
		else
			return "Lnet/minecraft/init/Bootstrap;";
	}

	/**
	 * <p>
	 * Name: SYSOUT
	 * </p>
	 */
	public static McObfPair field_179872_a = McMappingDatabase.getSRG("field_179872_a");

	/**
	 * <p>
	 * Name: alreadyRegistered
	 * </p>
	 */
	public static McObfPair field_151355_a = McMappingDatabase.getSRG("field_151355_a");

	/**
	 * <p>
	 * Name: redirectOutputToLog
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179868_d = McMappingDatabase.getSRG("Bootstrap.func_179868_d");

	/**
	 * <p>
	 * Name: hasErrored
	 * </p>
	 */
	public static McObfPair field_194219_b = McMappingDatabase.getSRG("field_194219_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_179871_c = McMappingDatabase.getSRG("field_179871_c");

	/**
	 * <p>
	 * Name: printToSYSOUT
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_179870_a = McMappingDatabase.getSRG("Bootstrap.func_179870_a");

	/**
	 * <p>
	 * Name: registerDispenserBehaviors
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_151353_a = McMappingDatabase.getSRG("Bootstrap.func_151353_a");

	/**
	 * <p>
	 * Name: isRegistered
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_179869_a = McMappingDatabase.getSRG("Bootstrap.func_179869_a");

	/**
	 * <p>
	 * Name: register
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_151354_b = McMappingDatabase.getSRG("Bootstrap.func_151354_b");

}

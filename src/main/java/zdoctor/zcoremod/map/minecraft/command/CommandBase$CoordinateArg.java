package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandBase$CoordinateArg {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bi$a";
		else
			return "net/minecraft/command/CommandBase$CoordinateArg";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bi$a";
		else
			return "CommandBase$CoordinateArg";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbi$a;";
		else
			return "Lnet/minecraft/command/CommandBase$CoordinateArg;";
	}

	/**
	 * <p>
	 * Name: result
	 * </p>
	 */
	public static McObfPair field_179633_a = McMappingDatabase.getSRG("field_179633_a");

	/**
	 * <p>
	 * Name: amount
	 * </p>
	 */
	public static McObfPair field_179631_b = McMappingDatabase.getSRG("field_179631_b");

	/**
	 * <p>
	 * Name: isRelative
	 * </p>
	 */
	public static McObfPair field_179632_c = McMappingDatabase.getSRG("field_179632_c");

	/**
	 * <p>
	 * Name: getResult
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_179628_a = McMappingDatabase.getSRG("CommandBase$CoordinateArg.func_179628_a");

	/**
	 * <p>
	 * Name: getAmount
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_179629_b = McMappingDatabase.getSRG("CommandBase$CoordinateArg.func_179629_b");

	/**
	 * <p>
	 * Name: isRelative
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_179630_c = McMappingDatabase.getSRG("CommandBase$CoordinateArg.func_179630_c");

}

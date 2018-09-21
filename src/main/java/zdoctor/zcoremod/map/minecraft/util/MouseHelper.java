package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MouseHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bic";
		else
			return "net/minecraft/util/MouseHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bic";
		else
			return "MouseHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbic;";
		else
			return "Lnet/minecraft/util/MouseHelper;";
	}

	/**
	 * <p>
	 * Name: ungrabMouseCursor
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_74373_b = McMappingDatabase.getSRG("MouseHelper.func_74373_b");

	/**
	 * <p>
	 * Name: mouseXYChange
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_74374_c = McMappingDatabase.getSRG("MouseHelper.func_74374_c");

	/**
	 * <p>
	 * Name: deltaX
	 * </p>
	 */
	public static McObfPair field_74377_a = McMappingDatabase.getSRG("field_74377_a");

	/**
	 * <p>
	 * Name: grabMouseCursor
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_74372_a = McMappingDatabase.getSRG("MouseHelper.func_74372_a");

	/**
	 * <p>
	 * Name: deltaY
	 * </p>
	 */
	public static McObfPair field_74375_b = McMappingDatabase.getSRG("field_74375_b");

}

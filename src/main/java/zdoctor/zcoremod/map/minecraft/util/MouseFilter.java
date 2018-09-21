package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MouseFilter {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rn";
		else
			return "net/minecraft/util/MouseFilter";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rn";
		else
			return "MouseFilter";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrn;";
		else
			return "Lnet/minecraft/util/MouseFilter;";
	}

	/**
	 * <p>
	 * Name: smooth
	 * </p>
	 * <p>
	 * Desc: [(FF)F]
	 * </p>
	 */
	public static McObfPair func_76333_a = McMappingDatabase.getSRG("MouseFilter.func_76333_a");

	/**
	 * <p>
	 * Name: lastAmount
	 * </p>
	 */
	public static McObfPair field_76335_c = McMappingDatabase.getSRG("field_76335_c");

	/**
	 * <p>
	 * Name: targetValue
	 * </p>
	 */
	public static McObfPair field_76336_a = McMappingDatabase.getSRG("field_76336_a");

	/**
	 * <p>
	 * Name: remainingValue
	 * </p>
	 */
	public static McObfPair field_76334_b = McMappingDatabase.getSRG("field_76334_b");

	/**
	 * <p>
	 * Name: reset
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_180179_a = McMappingDatabase.getSRG("MouseFilter.func_180179_a");

}

package zdoctor.zcoremod.map.minecraft.util.math;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Cartesian$Product {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ew$b";
		else
			return "net/minecraft/util/math/Cartesian$Product";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ew$b";
		else
			return "Cartesian$Product";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lew$b;";
		else
			return "Lnet/minecraft/util/math/Cartesian$Product;";
	}

	/**
	 * <p>
	 * Name: iterables
	 * </p>
	 */
	public static McObfPair field_179428_b = McMappingDatabase.getSRG("field_179428_b");

	/**
	 * <p>
	 * Name: clazz
	 * </p>
	 */
	public static McObfPair field_179429_a = McMappingDatabase.getSRG("field_179429_a");

}

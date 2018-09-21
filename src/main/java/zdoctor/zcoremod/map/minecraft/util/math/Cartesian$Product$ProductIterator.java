package zdoctor.zcoremod.map.minecraft.util.math;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Cartesian$Product$ProductIterator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ew$b$a";
		else
			return "net/minecraft/util/math/Cartesian$Product$ProductIterator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ew$b$a";
		else
			return "Cartesian$Product$ProductIterator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lew$b$a;";
		else
			return "Lnet/minecraft/util/math/Cartesian$Product$ProductIterator;";
	}

	/**
	 * <p>
	 * Name: index
	 * </p>
	 */
	public static McObfPair field_179426_a = McMappingDatabase.getSRG("field_179426_a");

	/**
	 * <p>
	 * Name: results
	 * </p>
	 */
	public static McObfPair field_179423_d = McMappingDatabase.getSRG("field_179423_d");

	/**
	 * <p>
	 * Name: endOfData
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179422_b = McMappingDatabase.getSRG("Cartesian$Product$ProductIterator.func_179422_b");

	/**
	 * <p>
	 * Name: iterators
	 * </p>
	 */
	public static McObfPair field_179425_c = McMappingDatabase.getSRG("field_179425_c");

	/**
	 * <p>
	 * Name: iterables
	 * </p>
	 */
	public static McObfPair field_179424_b = McMappingDatabase.getSRG("field_179424_b");

}

package zdoctor.zcoremod.map.minecraft.util.math;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Vec2f {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhd";
		else
			return "net/minecraft/util/math/Vec2f";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhd";
		else
			return "Vec2f";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhd;";
		else
			return "Lnet/minecraft/util/math/Vec2f;";
	}

	/**
	 * <p>
	 * Name: NEGATIVE_UNIT_Y
	 * </p>
	 */
	public static McObfPair field_189979_f = McMappingDatabase.getSRG("field_189979_f");

	/**
	 * <p>
	 * Name: MAX
	 * </p>
	 */
	public static McObfPair field_189980_g = McMappingDatabase.getSRG("field_189980_g");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_189983_j = McMappingDatabase.getSRG("field_189983_j");

	/**
	 * <p>
	 * Name: MIN
	 * </p>
	 */
	public static McObfPair field_189981_h = McMappingDatabase.getSRG("field_189981_h");

	/**
	 * <p>
	 * Name: ZERO
	 * </p>
	 */
	public static McObfPair field_189974_a = McMappingDatabase.getSRG("field_189974_a");

	/**
	 * <p>
	 * Name: ONE
	 * </p>
	 */
	public static McObfPair field_189975_b = McMappingDatabase.getSRG("field_189975_b");

	/**
	 * <p>
	 * Name: NEGATIVE_UNIT_X
	 * </p>
	 */
	public static McObfPair field_189977_d = McMappingDatabase.getSRG("field_189977_d");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_189982_i = McMappingDatabase.getSRG("field_189982_i");

	/**
	 * <p>
	 * Name: UNIT_X
	 * </p>
	 */
	public static McObfPair field_189976_c = McMappingDatabase.getSRG("field_189976_c");

	/**
	 * <p>
	 * Name: UNIT_Y
	 * </p>
	 */
	public static McObfPair field_189978_e = McMappingDatabase.getSRG("field_189978_e");

}

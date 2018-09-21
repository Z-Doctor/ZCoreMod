package zdoctor.zcoremod.map.minecraft.nbt;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NBTPrimitive {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gk";
		else
			return "net/minecraft/nbt/NBTPrimitive";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gk";
		else
			return "NBTPrimitive";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgk;";
		else
			return "Lnet/minecraft/nbt/NBTPrimitive;";
	}

	/**
	 * <p>
	 * Name: getShort
	 * </p>
	 * <p>
	 * Desc: [()S]
	 * </p>
	 */
	public static McObfPair func_150289_e = McMappingDatabase.getSRG("NBTPrimitive.func_150289_e");

	/**
	 * <p>
	 * Name: getDouble
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_150286_g = McMappingDatabase.getSRG("NBTPrimitive.func_150286_g");

	/**
	 * <p>
	 * Name: getFloat
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_150288_h = McMappingDatabase.getSRG("NBTPrimitive.func_150288_h");

	/**
	 * <p>
	 * Name: getLong
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_150291_c = McMappingDatabase.getSRG("NBTPrimitive.func_150291_c");

	/**
	 * <p>
	 * Name: getInt
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_150287_d = McMappingDatabase.getSRG("NBTPrimitive.func_150287_d");

	/**
	 * <p>
	 * Name: getByte
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_150290_f = McMappingDatabase.getSRG("NBTPrimitive.func_150290_f");

}

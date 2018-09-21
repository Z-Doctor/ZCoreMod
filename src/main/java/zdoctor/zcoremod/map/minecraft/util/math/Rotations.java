package zdoctor.zcoremod.map.minecraft.util.math;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Rotations {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fn";
		else
			return "net/minecraft/util/math/Rotations";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fn";
		else
			return "Rotations";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfn;";
		else
			return "Lnet/minecraft/util/math/Rotations;";
	}

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_179416_c = McMappingDatabase.getSRG("Rotations.func_179416_c");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagList;]
	 * </p>
	 */
	public static McObfPair func_179414_a = McMappingDatabase.getSRG("Rotations.func_179414_a");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_179419_a = McMappingDatabase.getSRG("field_179419_a");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_179413_d = McMappingDatabase.getSRG("Rotations.func_179413_d");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_179418_c = McMappingDatabase.getSRG("field_179418_c");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_179415_b = McMappingDatabase.getSRG("Rotations.func_179415_b");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_179417_b = McMappingDatabase.getSRG("field_179417_b");

}

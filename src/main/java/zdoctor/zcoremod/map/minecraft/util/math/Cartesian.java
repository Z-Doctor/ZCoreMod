package zdoctor.zcoremod.map.minecraft.util.math;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Cartesian {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ew";
		else
			return "net/minecraft/util/math/Cartesian";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ew";
		else
			return "Cartesian";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lew;";
		else
			return "Lnet/minecraft/util/math/Cartesian;";
	}

	/**
	 * <p>
	 * Name: cartesianProduct
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Iterable;)Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_179321_a = McMappingDatabase.getSRG("Cartesian.func_179321_a");

	/**
	 * <p>
	 * Name: toArray
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Ljava/lang/Iterable;)[Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_179322_b = McMappingDatabase.getSRG("Cartesian.func_179322_b");

	/**
	 * <p>
	 * Name: cartesianProduct
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Ljava/lang/Iterable;)Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_179318_a = McMappingDatabase.getSRG("Cartesian.func_179318_a");

	/**
	 * <p>
	 * Name: arraysAsLists
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Iterable;)Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_179323_b = McMappingDatabase.getSRG("Cartesian.func_179323_b");

	/**
	 * <p>
	 * Name: createArray
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;I)[Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_179319_b = McMappingDatabase.getSRG("Cartesian.func_179319_b");

}

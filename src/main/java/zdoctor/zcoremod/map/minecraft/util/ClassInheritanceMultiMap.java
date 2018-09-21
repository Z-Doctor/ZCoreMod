package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ClassInheritanceMultiMap {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qx";
		else
			return "net/minecraft/util/ClassInheritanceMultiMap";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qx";
		else
			return "ClassInheritanceMultiMap";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqx;";
		else
			return "Lnet/minecraft/util/ClassInheritanceMultiMap;";
	}

	/**
	 * <p>
	 * Name: getByClass
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;)Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_180215_b = McMappingDatabase.getSRG("ClassInheritanceMultiMap.func_180215_b");

	/**
	 * <p>
	 * Name: baseClass
	 * </p>
	 */
	public static McObfPair field_180217_c = McMappingDatabase.getSRG("field_180217_c");

	/**
	 * <p>
	 * Name: initializeClassLookup
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;)Ljava/lang/Class;]
	 * </p>
	 */
	public static McObfPair func_181157_b = McMappingDatabase.getSRG("ClassInheritanceMultiMap.func_181157_b");

	/**
	 * <p>
	 * Name: addForClass
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;Ljava/lang/Class;)V]
	 * </p>
	 */
	public static McObfPair func_181743_a = McMappingDatabase.getSRG("ClassInheritanceMultiMap.func_181743_a");

	/**
	 * <p>
	 * Name: knownKeys
	 * </p>
	 */
	public static McObfPair field_180216_b = McMappingDatabase.getSRG("field_180216_b");

	/**
	 * <p>
	 * Name: createLookup
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;)V]
	 * </p>
	 */
	public static McObfPair func_180213_a = McMappingDatabase.getSRG("ClassInheritanceMultiMap.func_180213_a");

	/**
	 * <p>
	 * Name: map
	 * </p>
	 */
	public static McObfPair field_180218_a = McMappingDatabase.getSRG("field_180218_a");

	/**
	 * <p>
	 * Name: values
	 * </p>
	 */
	public static McObfPair field_181745_e = McMappingDatabase.getSRG("field_181745_e");

	/**
	 * <p>
	 * Name: ALL_KNOWN
	 * </p>
	 */
	public static McObfPair field_181158_a = McMappingDatabase.getSRG("field_181158_a");

}

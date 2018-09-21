package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IntHashMap {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rg";
		else
			return "net/minecraft/util/IntHashMap";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rg";
		else
			return "IntHashMap";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrg;";
		else
			return "Lnet/minecraft/util/IntHashMap;";
	}

	/**
	 * <p>
	 * Name: grow
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_76047_h = McMappingDatabase.getSRG("IntHashMap.func_76047_h");

	/**
	 * <p>
	 * Name: threshold
	 * </p>
	 */
	public static McObfPair field_76054_c = McMappingDatabase.getSRG("field_76054_c");

	/**
	 * <p>
	 * Name: clearMap
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76046_c = McMappingDatabase.getSRG("IntHashMap.func_76046_c");

	/**
	 * <p>
	 * Name: growFactor
	 * </p>
	 */
	public static McObfPair field_76051_d = McMappingDatabase.getSRG("field_76051_d");

	/**
	 * <p>
	 * Name: getSlotIndex
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_76043_a = McMappingDatabase.getSRG("IntHashMap.func_76043_a");

	/**
	 * <p>
	 * Name: count
	 * </p>
	 */
	public static McObfPair field_76053_b = McMappingDatabase.getSRG("field_76053_b");

	/**
	 * <p>
	 * Name: insert
	 * </p>
	 * <p>
	 * Desc: [(IILjava/lang/Object;I)V]
	 * </p>
	 */
	public static McObfPair func_76040_a = McMappingDatabase.getSRG("IntHashMap.func_76040_a");

	/**
	 * <p>
	 * Name: addKey
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_76038_a = McMappingDatabase.getSRG("IntHashMap.func_76038_a");

	/**
	 * <p>
	 * Name: containsItem
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_76037_b = McMappingDatabase.getSRG("IntHashMap.func_76037_b");

	/**
	 * <p>
	 * Name: removeEntry
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/IntHashMap$Entry;]
	 * </p>
	 */
	public static McObfPair func_76036_e = McMappingDatabase.getSRG("IntHashMap.func_76036_e");

	/**
	 * <p>
	 * Name: slots
	 * </p>
	 */
	public static McObfPair field_76055_a = McMappingDatabase.getSRG("field_76055_a");

	/**
	 * <p>
	 * Name: lookup
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_76041_a = McMappingDatabase.getSRG("IntHashMap.func_76041_a");

	/**
	 * <p>
	 * Name: removeObject
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_76049_d = McMappingDatabase.getSRG("IntHashMap.func_76049_d");

	/**
	 * <p>
	 * Name: computeHash
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_76044_g = McMappingDatabase.getSRG("IntHashMap.func_76044_g");

	/**
	 * <p>
	 * Name: lookupEntry
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/IntHashMap$Entry;]
	 * </p>
	 */
	public static McObfPair func_76045_c = McMappingDatabase.getSRG("IntHashMap.func_76045_c");

	/**
	 * <p>
	 * Name: copyTo
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/util/IntHashMap$Entry;)V]
	 * </p>
	 */
	public static McObfPair func_76048_a = McMappingDatabase.getSRG("IntHashMap.func_76048_a");

}

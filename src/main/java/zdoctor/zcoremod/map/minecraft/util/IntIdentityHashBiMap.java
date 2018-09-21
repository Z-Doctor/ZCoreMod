package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IntIdentityHashBiMap {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qz";
		else
			return "net/minecraft/util/IntIdentityHashBiMap";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qz";
		else
			return "IntIdentityHashBiMap";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqz;";
		else
			return "Lnet/minecraft/util/IntIdentityHashBiMap;";
	}

	/**
	 * <p>
	 * Name: EMPTY
	 * </p>
	 */
	public static McObfPair field_186817_a = McMappingDatabase.getSRG("field_186817_a");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)I]
	 * </p>
	 */
	public static McObfPair func_186808_c = McMappingDatabase.getSRG("IntIdentityHashBiMap.func_186808_c");

	/**
	 * <p>
	 * Name: size
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186810_b = McMappingDatabase.getSRG("IntIdentityHashBiMap.func_186810_b");

	/**
	 * <p>
	 * Name: getIndex
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;I)I]
	 * </p>
	 */
	public static McObfPair func_186816_b = McMappingDatabase.getSRG("IntIdentityHashBiMap.func_186816_b");

	/**
	 * <p>
	 * Name: put
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;I)V]
	 * </p>
	 */
	public static McObfPair func_186814_a = McMappingDatabase.getSRG("IntIdentityHashBiMap.func_186814_a");

	/**
	 * <p>
	 * Name: mapSize
	 * </p>
	 */
	public static McObfPair field_186822_f = McMappingDatabase.getSRG("field_186822_f");

	/**
	 * <p>
	 * Name: nextId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186809_c = McMappingDatabase.getSRG("IntIdentityHashBiMap.func_186809_c");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)I]
	 * </p>
	 */
	public static McObfPair func_186815_a = McMappingDatabase.getSRG("IntIdentityHashBiMap.func_186815_a");

	/**
	 * <p>
	 * Name: hashObject
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)I]
	 * </p>
	 */
	public static McObfPair func_186811_d = McMappingDatabase.getSRG("IntIdentityHashBiMap.func_186811_d");

	/**
	 * <p>
	 * Name: get
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_186813_a = McMappingDatabase.getSRG("IntIdentityHashBiMap.func_186813_a");

	/**
	 * <p>
	 * Name: byId
	 * </p>
	 */
	public static McObfPair field_186820_d = McMappingDatabase.getSRG("field_186820_d");

	/**
	 * <p>
	 * Name: grow
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_186807_d = McMappingDatabase.getSRG("IntIdentityHashBiMap.func_186807_d");

	/**
	 * <p>
	 * Name: findEmpty
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_186806_e = McMappingDatabase.getSRG("IntIdentityHashBiMap.func_186806_e");

	/**
	 * <p>
	 * Name: intKeys
	 * </p>
	 */
	public static McObfPair field_186819_c = McMappingDatabase.getSRG("field_186819_c");

	/**
	 * <p>
	 * Name: getValue
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_186805_c = McMappingDatabase.getSRG("IntIdentityHashBiMap.func_186805_c");

	/**
	 * <p>
	 * Name: values
	 * </p>
	 */
	public static McObfPair field_186818_b = McMappingDatabase.getSRG("field_186818_b");

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186812_a = McMappingDatabase.getSRG("IntIdentityHashBiMap.func_186812_a");

	/**
	 * <p>
	 * Name: nextFreeIndex
	 * </p>
	 */
	public static McObfPair field_186821_e = McMappingDatabase.getSRG("field_186821_e");

}

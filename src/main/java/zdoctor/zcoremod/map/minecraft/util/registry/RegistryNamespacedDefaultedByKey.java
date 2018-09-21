package zdoctor.zcoremod.map.minecraft.util.registry;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RegistryNamespacedDefaultedByKey {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ey";
		else
			return "net/minecraft/util/registry/RegistryNamespacedDefaultedByKey";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ey";
		else
			return "RegistryNamespacedDefaultedByKey";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ley;";
		else
			return "Lnet/minecraft/util/registry/RegistryNamespacedDefaultedByKey;";
	}

	/**
	 * <p>
	 * Name: validateKey
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177776_a = McMappingDatabase.getSRG("RegistryNamespacedDefaultedByKey.func_177776_a");

	/**
	 * <p>
	 * Name: getObject
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_82594_a = McMappingDatabase.getSRG("RegistryNamespacedDefaultedByKey.func_82594_a");

	/**
	 * <p>
	 * Name: getNameForObject
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_177774_c = McMappingDatabase.getSRG("RegistryNamespacedDefaultedByKey.func_177774_c");

	/**
	 * <p>
	 * Name: getRandomObject
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_186801_a = McMappingDatabase.getSRG("RegistryNamespacedDefaultedByKey.func_186801_a");

	/**
	 * <p>
	 * Name: getIDForObject
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)I]
	 * </p>
	 */
	public static McObfPair func_148757_b = McMappingDatabase.getSRG("RegistryNamespacedDefaultedByKey.func_148757_b");

	/**
	 * <p>
	 * Name: getObjectById
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_148754_a = McMappingDatabase.getSRG("RegistryNamespacedDefaultedByKey.func_148754_a");

	/**
	 * <p>
	 * Name: defaultValue
	 * </p>
	 */
	public static McObfPair field_148761_e = McMappingDatabase.getSRG("field_148761_e");

	/**
	 * <p>
	 * Name: defaultValueKey
	 * </p>
	 */
	public static McObfPair field_148760_d = McMappingDatabase.getSRG("field_148760_d");

	/**
	 * <p>
	 * Name: register
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/Object;Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_177775_a = McMappingDatabase.getSRG("RegistryNamespacedDefaultedByKey.func_177775_a");

}

package zdoctor.zcoremod.map.minecraft.util.registry;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RegistryNamespaced {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fh";
		else
			return "net/minecraft/util/registry/RegistryNamespaced";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fh";
		else
			return "RegistryNamespaced";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfh;";
		else
			return "Lnet/minecraft/util/registry/RegistryNamespaced;";
	}

	/**
	 * <p>
	 * Name: getIDForObject
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)I]
	 * </p>
	 */
	public static McObfPair func_148757_b = McMappingDatabase.getSRG("RegistryNamespaced.func_148757_b");

	/**
	 * <p>
	 * Name: getObjectById
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_148754_a = McMappingDatabase.getSRG("RegistryNamespaced.func_148754_a");

	/**
	 * <p>
	 * Name: getObject
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_82594_a = McMappingDatabase.getSRG("RegistryNamespaced.func_82594_a");

	/**
	 * <p>
	 * Name: register
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/Object;Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_177775_a = McMappingDatabase.getSRG("RegistryNamespaced.func_177775_a");

	/**
	 * <p>
	 * Name: createUnderlyingMap
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_148740_a = McMappingDatabase.getSRG("RegistryNamespaced.func_148740_a");

	/**
	 * <p>
	 * Name: inverseObjectRegistry
	 * </p>
	 */
	public static McObfPair field_148758_b = McMappingDatabase.getSRG("field_148758_b");

	/**
	 * <p>
	 * Name: getNameForObject
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_177774_c = McMappingDatabase.getSRG("RegistryNamespaced.func_177774_c");

	/**
	 * <p>
	 * Name: containsKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)Z]
	 * </p>
	 */
	public static McObfPair func_148741_d = McMappingDatabase.getSRG("RegistryNamespaced.func_148741_d");

	/**
	 * <p>
	 * Name: underlyingIntegerMap
	 * </p>
	 */
	public static McObfPair field_148759_a = McMappingDatabase.getSRG("field_148759_a");

}

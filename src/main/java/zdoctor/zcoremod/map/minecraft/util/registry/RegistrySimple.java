package zdoctor.zcoremod.map.minecraft.util.registry;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RegistrySimple {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fo";
		else
			return "net/minecraft/util/registry/RegistrySimple";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fo";
		else
			return "RegistrySimple";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfo;";
		else
			return "Lnet/minecraft/util/registry/RegistrySimple;";
	}

	/**
	 * <p>
	 * Name: getKeys
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_148742_b = McMappingDatabase.getSRG("RegistrySimple.func_148742_b");

	/**
	 * <p>
	 * Name: getRandomObject
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_186801_a = McMappingDatabase.getSRG("RegistrySimple.func_186801_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_148743_a = McMappingDatabase.getSRG("field_148743_a");

	/**
	 * <p>
	 * Name: createUnderlyingMap
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_148740_a = McMappingDatabase.getSRG("RegistrySimple.func_148740_a");

	/**
	 * <p>
	 * Name: getObject
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_82594_a = McMappingDatabase.getSRG("RegistrySimple.func_82594_a");

	/**
	 * <p>
	 * Name: containsKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)Z]
	 * </p>
	 */
	public static McObfPair func_148741_d = McMappingDatabase.getSRG("RegistrySimple.func_148741_d");

	/**
	 * <p>
	 * Name: values
	 * </p>
	 */
	public static McObfPair field_186802_b = McMappingDatabase.getSRG("field_186802_b");

	/**
	 * <p>
	 * Name: putObject
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_82595_a = McMappingDatabase.getSRG("RegistrySimple.func_82595_a");

	/**
	 * <p>
	 * Name: registryObjects
	 * </p>
	 */
	public static McObfPair field_82596_a = McMappingDatabase.getSRG("field_82596_a");

}

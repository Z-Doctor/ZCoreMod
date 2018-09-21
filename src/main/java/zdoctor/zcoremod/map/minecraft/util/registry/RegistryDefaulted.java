package zdoctor.zcoremod.map.minecraft.util.registry;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RegistryDefaulted {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ez";
		else
			return "net/minecraft/util/registry/RegistryDefaulted";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ez";
		else
			return "RegistryDefaulted";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lez;";
		else
			return "Lnet/minecraft/util/registry/RegistryDefaulted;";
	}

	/**
	 * <p>
	 * Name: defaultObject
	 * </p>
	 */
	public static McObfPair field_82597_b = McMappingDatabase.getSRG("field_82597_b");

	/**
	 * <p>
	 * Name: getObject
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_82594_a = McMappingDatabase.getSRG("RegistryDefaulted.func_82594_a");

}

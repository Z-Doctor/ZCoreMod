package zdoctor.zcoremod.map.minecraft.util.registry;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IRegistry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fm";
		else
			return "net/minecraft/util/registry/IRegistry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fm";
		else
			return "IRegistry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfm;";
		else
			return "Lnet/minecraft/util/registry/IRegistry;";
	}

	/**
	 * <p>
	 * Name: putObject
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_82595_a = McMappingDatabase.getSRG("IRegistry.func_82595_a");

	/**
	 * <p>
	 * Name: getKeys
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_148742_b = McMappingDatabase.getSRG("IRegistry.func_148742_b");

	/**
	 * <p>
	 * Name: getObject
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_82594_a = McMappingDatabase.getSRG("IRegistry.func_82594_a");

}

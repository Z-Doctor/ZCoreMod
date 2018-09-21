package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IReloadableResourceManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cen";
		else
			return "net/minecraft/client/resources/IReloadableResourceManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cen";
		else
			return "IReloadableResourceManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcen;";
		else
			return "Lnet/minecraft/client/resources/IReloadableResourceManager;";
	}

	/**
	 * <p>
	 * Name: reloadResources
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_110541_a = McMappingDatabase.getSRG("IReloadableResourceManager.func_110541_a");

	/**
	 * <p>
	 * Name: registerReloadListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManagerReloadListener;)V]
	 * </p>
	 */
	public static McObfPair func_110542_a = McMappingDatabase.getSRG("IReloadableResourceManager.func_110542_a");

}

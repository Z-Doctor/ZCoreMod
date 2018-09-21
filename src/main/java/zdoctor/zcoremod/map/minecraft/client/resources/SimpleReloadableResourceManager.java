package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SimpleReloadableResourceManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cev";
		else
			return "net/minecraft/client/resources/SimpleReloadableResourceManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cev";
		else
			return "SimpleReloadableResourceManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcev;";
		else
			return "Lnet/minecraft/client/resources/SimpleReloadableResourceManager;";
	}

	/**
	 * <p>
	 * Name: getAllResources
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_135056_b = McMappingDatabase.getSRG("SimpleReloadableResourceManager.func_135056_b");

	/**
	 * <p>
	 * Name: reloadResources
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_110541_a = McMappingDatabase.getSRG("SimpleReloadableResourceManager.func_110541_a");

	/**
	 * <p>
	 * Name: getResourceDomains
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_135055_a = McMappingDatabase.getSRG("SimpleReloadableResourceManager.func_135055_a");

	/**
	 * <p>
	 * Name: rmMetadataSerializer
	 * </p>
	 */
	public static McObfPair field_110547_c = McMappingDatabase.getSRG("field_110547_c");

	/**
	 * <p>
	 * Name: reloadListeners
	 * </p>
	 */
	public static McObfPair field_110546_b = McMappingDatabase.getSRG("field_110546_b");

	/**
	 * <p>
	 * Name: getResource
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/resources/IResource;]
	 * </p>
	 */
	public static McObfPair func_110536_a = McMappingDatabase.getSRG("SimpleReloadableResourceManager.func_110536_a");

	/**
	 * <p>
	 * Name: registerReloadListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManagerReloadListener;)V]
	 * </p>
	 */
	public static McObfPair func_110542_a = McMappingDatabase.getSRG("SimpleReloadableResourceManager.func_110542_a");

	/**
	 * <p>
	 * Name: domainResourceManagers
	 * </p>
	 */
	public static McObfPair field_110548_a = McMappingDatabase.getSRG("field_110548_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147967_a = McMappingDatabase.getSRG("field_147967_a");

	/**
	 * <p>
	 * Name: clearResources
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110543_a = McMappingDatabase.getSRG("SimpleReloadableResourceManager.func_110543_a");

	/**
	 * <p>
	 * Name: notifyReloadListeners
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110544_b = McMappingDatabase.getSRG("SimpleReloadableResourceManager.func_110544_b");

	/**
	 * <p>
	 * Name: reloadResourcePack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourcePack;)V]
	 * </p>
	 */
	public static McObfPair func_110545_a = McMappingDatabase.getSRG("SimpleReloadableResourceManager.func_110545_a");

	/**
	 * <p>
	 * Name: JOINER_RESOURCE_PACKS
	 * </p>
	 */
	public static McObfPair field_130074_a = McMappingDatabase.getSRG("field_130074_a");

	/**
	 * <p>
	 * Name: setResourceDomains
	 * </p>
	 */
	public static McObfPair field_135057_d = McMappingDatabase.getSRG("field_135057_d");

}

package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IResourceManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cep";
		else
			return "net/minecraft/client/resources/IResourceManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cep";
		else
			return "IResourceManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcep;";
		else
			return "Lnet/minecraft/client/resources/IResourceManager;";
	}

	/**
	 * <p>
	 * Name: getResource
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/resources/IResource;]
	 * </p>
	 */
	public static McObfPair func_110536_a = McMappingDatabase.getSRG("IResourceManager.func_110536_a");

	/**
	 * <p>
	 * Name: getAllResources
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_135056_b = McMappingDatabase.getSRG("IResourceManager.func_135056_b");

	/**
	 * <p>
	 * Name: getResourceDomains
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_135055_a = McMappingDatabase.getSRG("IResourceManager.func_135055_a");

}

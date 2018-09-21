package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FallbackResourceManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cei";
		else
			return "net/minecraft/client/resources/FallbackResourceManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cei";
		else
			return "FallbackResourceManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcei;";
		else
			return "Lnet/minecraft/client/resources/FallbackResourceManager;";
	}

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_177246_b = McMappingDatabase.getSRG("field_177246_b");

	/**
	 * <p>
	 * Name: getInputStream
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;Lnet/minecraft/client/resources/IResourcePack;)Ljava/io/InputStream;]
	 * </p>
	 */
	public static McObfPair func_177245_a = McMappingDatabase.getSRG("FallbackResourceManager.func_177245_a");

	/**
	 * <p>
	 * Name: getResource
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/resources/IResource;]
	 * </p>
	 */
	public static McObfPair func_110536_a = McMappingDatabase.getSRG("FallbackResourceManager.func_110536_a");

	/**
	 * <p>
	 * Name: getResourceDomains
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_135055_a = McMappingDatabase.getSRG("FallbackResourceManager.func_135055_a");

	/**
	 * <p>
	 * Name: resourcePacks
	 * </p>
	 */
	public static McObfPair field_110540_a = McMappingDatabase.getSRG("field_110540_a");

	/**
	 * <p>
	 * Name: addResourcePack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourcePack;)V]
	 * </p>
	 */
	public static McObfPair func_110538_a = McMappingDatabase.getSRG("FallbackResourceManager.func_110538_a");

	/**
	 * <p>
	 * Name: frmMetadataSerializer
	 * </p>
	 */
	public static McObfPair field_110539_b = McMappingDatabase.getSRG("field_110539_b");

	/**
	 * <p>
	 * Name: checkResourcePath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)V]
	 * </p>
	 */
	public static McObfPair func_188552_d = McMappingDatabase.getSRG("FallbackResourceManager.func_188552_d");

	/**
	 * <p>
	 * Name: getAllResources
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_135056_b = McMappingDatabase.getSRG("FallbackResourceManager.func_135056_b");

	/**
	 * <p>
	 * Name: getLocationMcmeta
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110537_b = McMappingDatabase.getSRG("FallbackResourceManager.func_110537_b");

}

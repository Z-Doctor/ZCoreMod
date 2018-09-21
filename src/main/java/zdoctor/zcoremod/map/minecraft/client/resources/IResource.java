package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IResource {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceo";
		else
			return "net/minecraft/client/resources/IResource";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceo";
		else
			return "IResource";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lceo;";
		else
			return "Lnet/minecraft/client/resources/IResource;";
	}

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/client/resources/data/IMetadataSection;]
	 * </p>
	 */
	public static McObfPair func_110526_a = McMappingDatabase.getSRG("IResource.func_110526_a");

	/**
	 * <p>
	 * Name: hasMetadata
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_110528_c = McMappingDatabase.getSRG("IResource.func_110528_c");

	/**
	 * <p>
	 * Name: getResourceLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_177241_a = McMappingDatabase.getSRG("IResource.func_177241_a");

	/**
	 * <p>
	 * Name: getInputStream
	 * </p>
	 * <p>
	 * Desc: [()Ljava/io/InputStream;]
	 * </p>
	 */
	public static McObfPair func_110527_b = McMappingDatabase.getSRG("IResource.func_110527_b");

	/**
	 * <p>
	 * Name: getResourcePackName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_177240_d = McMappingDatabase.getSRG("IResource.func_177240_d");

}

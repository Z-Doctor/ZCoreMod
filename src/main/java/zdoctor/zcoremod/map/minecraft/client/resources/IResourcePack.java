package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IResourcePack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cer";
		else
			return "net/minecraft/client/resources/IResourcePack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cer";
		else
			return "IResourcePack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcer;";
		else
			return "Lnet/minecraft/client/resources/IResourcePack;";
	}

	/**
	 * <p>
	 * Name: getResourceDomains
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_110587_b = McMappingDatabase.getSRG("IResourcePack.func_110587_b");

	/**
	 * <p>
	 * Name: getPackImage
	 * </p>
	 * <p>
	 * Desc: [()Ljava/awt/image/BufferedImage;]
	 * </p>
	 */
	public static McObfPair func_110586_a = McMappingDatabase.getSRG("IResourcePack.func_110586_a");

	/**
	 * <p>
	 * Name: getPackName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_130077_b = McMappingDatabase.getSRG("IResourcePack.func_130077_b");

	/**
	 * <p>
	 * Name: getInputStream
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Ljava/io/InputStream;]
	 * </p>
	 */
	public static McObfPair func_110590_a = McMappingDatabase.getSRG("IResourcePack.func_110590_a");

	/**
	 * <p>
	 * Name: getPackMetadata
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/data/MetadataSerializer;Ljava/lang/String;)Lnet/minecraft/client/resources/data/IMetadataSection;]
	 * </p>
	 */
	public static McObfPair func_135058_a = McMappingDatabase.getSRG("IResourcePack.func_135058_a");

	/**
	 * <p>
	 * Name: resourceExists
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Z]
	 * </p>
	 */
	public static McObfPair func_110589_b = McMappingDatabase.getSRG("IResourcePack.func_110589_b");

}

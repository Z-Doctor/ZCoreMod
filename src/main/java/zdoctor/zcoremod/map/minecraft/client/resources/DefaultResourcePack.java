package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DefaultResourcePack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceg";
		else
			return "net/minecraft/client/resources/DefaultResourcePack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceg";
		else
			return "DefaultResourcePack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lceg;";
		else
			return "Lnet/minecraft/client/resources/DefaultResourcePack;";
	}

	/**
	 * <p>
	 * Name: getPackName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_130077_b = McMappingDatabase.getSRG("DefaultResourcePack.func_130077_b");

	/**
	 * <p>
	 * Name: DEFAULT_RESOURCE_DOMAINS
	 * </p>
	 */
	public static McObfPair field_110608_a = McMappingDatabase.getSRG("field_110608_a");

	/**
	 * <p>
	 * Name: getInputStreamAssets
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Ljava/io/InputStream;]
	 * </p>
	 */
	public static McObfPair func_152780_c = McMappingDatabase.getSRG("DefaultResourcePack.func_152780_c");

	/**
	 * <p>
	 * Name: getResourceDomains
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_110587_b = McMappingDatabase.getSRG("DefaultResourcePack.func_110587_b");

	/**
	 * <p>
	 * Name: getPackImage
	 * </p>
	 * <p>
	 * Desc: [()Ljava/awt/image/BufferedImage;]
	 * </p>
	 */
	public static McObfPair func_110586_a = McMappingDatabase.getSRG("DefaultResourcePack.func_110586_a");

	/**
	 * <p>
	 * Name: resourceIndex
	 * </p>
	 */
	public static McObfPair field_188549_b = McMappingDatabase.getSRG("field_188549_b");

	/**
	 * <p>
	 * Name: resourceExists
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Z]
	 * </p>
	 */
	public static McObfPair func_110589_b = McMappingDatabase.getSRG("DefaultResourcePack.func_110589_b");

	/**
	 * <p>
	 * Name: getResourceStream
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Ljava/io/InputStream;]
	 * </p>
	 */
	public static McObfPair func_110605_c = McMappingDatabase.getSRG("DefaultResourcePack.func_110605_c");

	/**
	 * <p>
	 * Name: getPackMetadata
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/data/MetadataSerializer;Ljava/lang/String;)Lnet/minecraft/client/resources/data/IMetadataSection;]
	 * </p>
	 */
	public static McObfPair func_135058_a = McMappingDatabase.getSRG("DefaultResourcePack.func_135058_a");

	/**
	 * <p>
	 * Name: getInputStream
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Ljava/io/InputStream;]
	 * </p>
	 */
	public static McObfPair func_110590_a = McMappingDatabase.getSRG("DefaultResourcePack.func_110590_a");

}

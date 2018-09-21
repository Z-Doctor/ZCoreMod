package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AbstractResourcePack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ced";
		else
			return "net/minecraft/client/resources/AbstractResourcePack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ced";
		else
			return "AbstractResourcePack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lced;";
		else
			return "Lnet/minecraft/client/resources/AbstractResourcePack;";
	}

	/**
	 * <p>
	 * Name: logNameNotLowercase
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_110594_c = McMappingDatabase.getSRG("AbstractResourcePack.func_110594_c");

	/**
	 * <p>
	 * Name: getRelativeName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_110595_a = McMappingDatabase.getSRG("AbstractResourcePack.func_110595_a");

	/**
	 * <p>
	 * Name: getPackMetadata
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/data/MetadataSerializer;Ljava/lang/String;)Lnet/minecraft/client/resources/data/IMetadataSection;]
	 * </p>
	 */
	public static McObfPair func_135058_a = McMappingDatabase.getSRG("AbstractResourcePack.func_135058_a");

	/**
	 * <p>
	 * Name: getInputStream
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Ljava/io/InputStream;]
	 * </p>
	 */
	public static McObfPair func_110590_a = McMappingDatabase.getSRG("AbstractResourcePack.func_110590_a");

	/**
	 * <p>
	 * Name: resourceExists
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Z]
	 * </p>
	 */
	public static McObfPair func_110589_b = McMappingDatabase.getSRG("AbstractResourcePack.func_110589_b");

	/**
	 * <p>
	 * Name: hasResourceName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_110593_b = McMappingDatabase.getSRG("AbstractResourcePack.func_110593_b");

	/**
	 * <p>
	 * Name: getInputStreamByName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/io/InputStream;]
	 * </p>
	 */
	public static McObfPair func_110591_a = McMappingDatabase.getSRG("AbstractResourcePack.func_110591_a");

	/**
	 * <p>
	 * Name: locationToName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_110592_c = McMappingDatabase.getSRG("AbstractResourcePack.func_110592_c");

	/**
	 * <p>
	 * Name: getPackImage
	 * </p>
	 * <p>
	 * Desc: [()Ljava/awt/image/BufferedImage;]
	 * </p>
	 */
	public static McObfPair func_110586_a = McMappingDatabase.getSRG("AbstractResourcePack.func_110586_a");

	/**
	 * <p>
	 * Name: resourcePackFile
	 * </p>
	 */
	public static McObfPair field_110597_b = McMappingDatabase.getSRG("field_110597_b");

	/**
	 * <p>
	 * Name: readMetadata
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/data/MetadataSerializer;Ljava/io/InputStream;Ljava/lang/String;)Lnet/minecraft/client/resources/data/IMetadataSection;]
	 * </p>
	 */
	public static McObfPair func_110596_a = McMappingDatabase.getSRG("AbstractResourcePack.func_110596_a");

	/**
	 * <p>
	 * Name: getPackName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_130077_b = McMappingDatabase.getSRG("AbstractResourcePack.func_130077_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_110598_a = McMappingDatabase.getSRG("field_110598_a");

}

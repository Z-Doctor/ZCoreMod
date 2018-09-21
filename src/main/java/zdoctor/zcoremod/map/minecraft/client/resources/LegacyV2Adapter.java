package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LegacyV2Adapter {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ces";
		else
			return "net/minecraft/client/resources/LegacyV2Adapter";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ces";
		else
			return "LegacyV2Adapter";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lces;";
		else
			return "Lnet/minecraft/client/resources/LegacyV2Adapter;";
	}

	/**
	 * <p>
	 * Name: getPackMetadata
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/data/MetadataSerializer;Ljava/lang/String;)Lnet/minecraft/client/resources/data/IMetadataSection;]
	 * </p>
	 */
	public static McObfPair func_135058_a = McMappingDatabase.getSRG("LegacyV2Adapter.func_135058_a");

	/**
	 * <p>
	 * Name: resourceExists
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Z]
	 * </p>
	 */
	public static McObfPair func_110589_b = McMappingDatabase.getSRG("LegacyV2Adapter.func_110589_b");

	/**
	 * <p>
	 * Name: pack
	 * </p>
	 */
	public static McObfPair field_191383_a = McMappingDatabase.getSRG("field_191383_a");

	/**
	 * <p>
	 * Name: getResourceDomains
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_110587_b = McMappingDatabase.getSRG("LegacyV2Adapter.func_110587_b");

	/**
	 * <p>
	 * Name: getPackName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_130077_b = McMappingDatabase.getSRG("LegacyV2Adapter.func_130077_b");

	/**
	 * <p>
	 * Name: getInputStream
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Ljava/io/InputStream;]
	 * </p>
	 */
	public static McObfPair func_110590_a = McMappingDatabase.getSRG("LegacyV2Adapter.func_110590_a");

	/**
	 * <p>
	 * Name: getPackImage
	 * </p>
	 * <p>
	 * Desc: [()Ljava/awt/image/BufferedImage;]
	 * </p>
	 */
	public static McObfPair func_110586_a = McMappingDatabase.getSRG("LegacyV2Adapter.func_110586_a");

	/**
	 * <p>
	 * Name: fudgePath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_191382_c = McMappingDatabase.getSRG("LegacyV2Adapter.func_191382_c");

}

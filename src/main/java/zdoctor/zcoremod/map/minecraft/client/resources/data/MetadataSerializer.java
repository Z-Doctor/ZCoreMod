package zdoctor.zcoremod.map.minecraft.client.resources.data;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MetadataSerializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfg";
		else
			return "net/minecraft/client/resources/data/MetadataSerializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfg";
		else
			return "MetadataSerializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcfg;";
		else
			return "Lnet/minecraft/client/resources/data/MetadataSerializer;";
	}

	/**
	 * <p>
	 * Name: gsonBuilder
	 * </p>
	 */
	public static McObfPair field_110506_b = McMappingDatabase.getSRG("field_110506_b");

	/**
	 * <p>
	 * Name: metadataSectionSerializerRegistry
	 * </p>
	 */
	public static McObfPair field_110508_a = McMappingDatabase.getSRG("field_110508_a");

	/**
	 * <p>
	 * Name: getGson
	 * </p>
	 * <p>
	 * Desc: [()Lcom/google/gson/Gson;]
	 * </p>
	 */
	public static McObfPair func_110505_a = McMappingDatabase.getSRG("MetadataSerializer.func_110505_a");

	/**
	 * <p>
	 * Name: gson
	 * </p>
	 */
	public static McObfPair field_110507_c = McMappingDatabase.getSRG("field_110507_c");

	/**
	 * <p>
	 * Name: parseMetadataSection
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lcom/google/gson/JsonObject;)Lnet/minecraft/client/resources/data/IMetadataSection;]
	 * </p>
	 */
	public static McObfPair func_110503_a = McMappingDatabase.getSRG("MetadataSerializer.func_110503_a");

	/**
	 * <p>
	 * Name: registerMetadataSectionType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/data/IMetadataSectionSerializer;Ljava/lang/Class;)V]
	 * </p>
	 */
	public static McObfPair func_110504_a = McMappingDatabase.getSRG("MetadataSerializer.func_110504_a");

}

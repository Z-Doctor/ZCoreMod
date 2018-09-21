package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SimpleResource {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cew";
		else
			return "net/minecraft/client/resources/SimpleResource";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cew";
		else
			return "SimpleResource";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcew;";
		else
			return "Lnet/minecraft/client/resources/SimpleResource;";
	}

	/**
	 * <p>
	 * Name: getInputStream
	 * </p>
	 * <p>
	 * Desc: [()Ljava/io/InputStream;]
	 * </p>
	 */
	public static McObfPair func_110527_b = McMappingDatabase.getSRG("SimpleResource.func_110527_b");

	/**
	 * <p>
	 * Name: hasMetadata
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_110528_c = McMappingDatabase.getSRG("SimpleResource.func_110528_c");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/client/resources/data/IMetadataSection;]
	 * </p>
	 */
	public static McObfPair func_110526_a = McMappingDatabase.getSRG("SimpleResource.func_110526_a");

	/**
	 * <p>
	 * Name: resourceInputStream
	 * </p>
	 */
	public static McObfPair field_110534_c = McMappingDatabase.getSRG("field_110534_c");

	/**
	 * <p>
	 * Name: resourcePackName
	 * </p>
	 */
	public static McObfPair field_177242_b = McMappingDatabase.getSRG("field_177242_b");

	/**
	 * <p>
	 * Name: getResourceLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_177241_a = McMappingDatabase.getSRG("SimpleResource.func_177241_a");

	/**
	 * <p>
	 * Name: srMetadataSerializer
	 * </p>
	 */
	public static McObfPair field_110532_e = McMappingDatabase.getSRG("field_110532_e");

	/**
	 * <p>
	 * Name: mcmetaJson
	 * </p>
	 */
	public static McObfPair field_110530_g = McMappingDatabase.getSRG("field_110530_g");

	/**
	 * <p>
	 * Name: mapMetadataSections
	 * </p>
	 */
	public static McObfPair field_110535_a = McMappingDatabase.getSRG("field_110535_a");

	/**
	 * <p>
	 * Name: mcmetaInputStream
	 * </p>
	 */
	public static McObfPair field_110531_d = McMappingDatabase.getSRG("field_110531_d");

	/**
	 * <p>
	 * Name: srResourceLocation
	 * </p>
	 */
	public static McObfPair field_110533_b = McMappingDatabase.getSRG("field_110533_b");

	/**
	 * <p>
	 * Name: getResourcePackName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_177240_d = McMappingDatabase.getSRG("SimpleResource.func_177240_d");

	/**
	 * <p>
	 * Name: mcmetaJsonChecked
	 * </p>
	 */
	public static McObfPair field_110529_f = McMappingDatabase.getSRG("field_110529_f");

}

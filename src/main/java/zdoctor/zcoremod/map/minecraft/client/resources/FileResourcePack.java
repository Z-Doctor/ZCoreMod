package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FileResourcePack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cej";
		else
			return "net/minecraft/client/resources/FileResourcePack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cej";
		else
			return "FileResourcePack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcej;";
		else
			return "Lnet/minecraft/client/resources/FileResourcePack;";
	}

	/**
	 * <p>
	 * Name: resourcePackZipFile
	 * </p>
	 */
	public static McObfPair field_110600_d = McMappingDatabase.getSRG("field_110600_d");

	/**
	 * <p>
	 * Name: ENTRY_NAME_SPLITTER
	 * </p>
	 */
	public static McObfPair field_110601_c = McMappingDatabase.getSRG("field_110601_c");

	/**
	 * <p>
	 * Name: getInputStreamByName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/io/InputStream;]
	 * </p>
	 */
	public static McObfPair func_110591_a = McMappingDatabase.getSRG("FileResourcePack.func_110591_a");

	/**
	 * <p>
	 * Name: hasResourceName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_110593_b = McMappingDatabase.getSRG("FileResourcePack.func_110593_b");

	/**
	 * <p>
	 * Name: getResourceDomains
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_110587_b = McMappingDatabase.getSRG("FileResourcePack.func_110587_b");

	/**
	 * <p>
	 * Name: getResourcePackZipFile
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/zip/ZipFile;]
	 * </p>
	 */
	public static McObfPair func_110599_c = McMappingDatabase.getSRG("FileResourcePack.func_110599_c");

}

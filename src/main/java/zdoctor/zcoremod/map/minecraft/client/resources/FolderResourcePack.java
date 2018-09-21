package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FolderResourcePack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cek";
		else
			return "net/minecraft/client/resources/FolderResourcePack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cek";
		else
			return "FolderResourcePack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcek;";
		else
			return "Lnet/minecraft/client/resources/FolderResourcePack;";
	}

	/**
	 * <p>
	 * Name: getInputStreamByName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/io/InputStream;]
	 * </p>
	 */
	public static McObfPair func_110591_a = McMappingDatabase.getSRG("FolderResourcePack.func_110591_a");

	/**
	 * <p>
	 * Name: getResourceDomains
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_110587_b = McMappingDatabase.getSRG("FolderResourcePack.func_110587_b");

	/**
	 * <p>
	 * Name: validatePath
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_191384_a = McMappingDatabase.getSRG("FolderResourcePack.func_191384_a");

	/**
	 * <p>
	 * Name: BACKSLASH_MATCHER
	 * </p>
	 */
	public static McObfPair field_191387_c = McMappingDatabase.getSRG("field_191387_c");

	/**
	 * <p>
	 * Name: hasResourceName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_110593_b = McMappingDatabase.getSRG("FolderResourcePack.func_110593_b");

	/**
	 * <p>
	 * Name: getFile
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_191385_d = McMappingDatabase.getSRG("FolderResourcePack.func_191385_d");

	/**
	 * <p>
	 * Name: ON_WINDOWS
	 * </p>
	 */
	public static McObfPair field_191386_b = McMappingDatabase.getSRG("field_191386_b");

}

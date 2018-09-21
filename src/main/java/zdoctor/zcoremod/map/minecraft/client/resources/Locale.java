package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Locale {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfb";
		else
			return "net/minecraft/client/resources/Locale";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfb";
		else
			return "Locale";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcfb;";
		else
			return "Lnet/minecraft/client/resources/Locale;";
	}

	/**
	 * <p>
	 * Name: checkUnicode
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_135024_b = McMappingDatabase.getSRG("Locale.func_135024_b");

	/**
	 * <p>
	 * Name: PATTERN
	 * </p>
	 */
	public static McObfPair field_135031_c = McMappingDatabase.getSRG("field_135031_c");

	/**
	 * <p>
	 * Name: unicode
	 * </p>
	 */
	public static McObfPair field_135029_d = McMappingDatabase.getSRG("field_135029_d");

	/**
	 * <p>
	 * Name: SPLITTER
	 * </p>
	 */
	public static McObfPair field_135030_b = McMappingDatabase.getSRG("field_135030_b");

	/**
	 * <p>
	 * Name: loadLocaleData
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_135028_a = McMappingDatabase.getSRG("Locale.func_135028_a");

	/**
	 * <p>
	 * Name: hasKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_188568_a = McMappingDatabase.getSRG("Locale.func_188568_a");

	/**
	 * <p>
	 * Name: formatMessage
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_135023_a = McMappingDatabase.getSRG("Locale.func_135023_a");

	/**
	 * <p>
	 * Name: isUnicode
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_135025_a = McMappingDatabase.getSRG("Locale.func_135025_a");

	/**
	 * <p>
	 * Name: loadLocaleDataFiles
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_135022_a = McMappingDatabase.getSRG("Locale.func_135022_a");

	/**
	 * <p>
	 * Name: properties
	 * </p>
	 */
	public static McObfPair field_135032_a = McMappingDatabase.getSRG("field_135032_a");

	/**
	 * <p>
	 * Name: translateKeyPrivate
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_135026_c = McMappingDatabase.getSRG("Locale.func_135026_c");

	/**
	 * <p>
	 * Name: loadLocaleData
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/InputStream;)V]
	 * </p>
	 */
	public static McObfPair func_135021_a = McMappingDatabase.getSRG("Locale.func_135021_a");

}

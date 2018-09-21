package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Language {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cez";
		else
			return "net/minecraft/client/resources/Language";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cez";
		else
			return "Language";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcez;";
		else
			return "Lnet/minecraft/client/resources/Language;";
	}

	/**
	 * <p>
	 * Name: bidirectional
	 * </p>
	 */
	public static McObfPair field_135036_d = McMappingDatabase.getSRG("field_135036_d");

	/**
	 * <p>
	 * Name: region
	 * </p>
	 */
	public static McObfPair field_135037_b = McMappingDatabase.getSRG("field_135037_b");

	/**
	 * <p>
	 * Name: getLanguageCode
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_135034_a = McMappingDatabase.getSRG("Language.func_135034_a");

	/**
	 * <p>
	 * Name: languageCode
	 * </p>
	 */
	public static McObfPair field_135039_a = McMappingDatabase.getSRG("field_135039_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_135038_c = McMappingDatabase.getSRG("field_135038_c");

	/**
	 * <p>
	 * Name: isBidirectional
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_135035_b = McMappingDatabase.getSRG("Language.func_135035_b");

}

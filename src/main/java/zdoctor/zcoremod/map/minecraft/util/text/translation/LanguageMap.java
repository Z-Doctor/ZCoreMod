package zdoctor.zcoremod.map.minecraft.util.text.translation;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LanguageMap {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fu";
		else
			return "net/minecraft/util/text/translation/LanguageMap";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fu";
		else
			return "LanguageMap";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfu;";
		else
			return "Lnet/minecraft/util/text/translation/LanguageMap;";
	}

	/**
	 * <p>
	 * Name: lastUpdateTimeInMilliseconds
	 * </p>
	 */
	public static McObfPair field_150511_e = McMappingDatabase.getSRG("field_150511_e");

	/**
	 * <p>
	 * Name: translateKeyFormat
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_74803_a = McMappingDatabase.getSRG("LanguageMap.func_74803_a");

	/**
	 * <p>
	 * Name: NUMERIC_VARIABLE_PATTERN
	 * </p>
	 */
	public static McObfPair field_111053_a = McMappingDatabase.getSRG("field_111053_a");

	/**
	 * <p>
	 * Name: getLastUpdateTimeInMilliseconds
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_150510_c = McMappingDatabase.getSRG("LanguageMap.func_150510_c");

	/**
	 * <p>
	 * Name: replaceWith
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)V]
	 * </p>
	 */
	public static McObfPair func_135063_a = McMappingDatabase.getSRG("LanguageMap.func_135063_a");

	/**
	 * <p>
	 * Name: languageList
	 * </p>
	 */
	public static McObfPair field_74816_c = McMappingDatabase.getSRG("field_74816_c");

	/**
	 * <p>
	 * Name: tryTranslateKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_135064_c = McMappingDatabase.getSRG("LanguageMap.func_135064_c");

	/**
	 * <p>
	 * Name: isKeyTranslated
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_94520_b = McMappingDatabase.getSRG("LanguageMap.func_94520_b");

	/**
	 * <p>
	 * Name: getInstance
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/translation/LanguageMap;]
	 * </p>
	 */
	public static McObfPair func_74808_a = McMappingDatabase.getSRG("LanguageMap.func_74808_a");

	/**
	 * <p>
	 * Name: EQUAL_SIGN_SPLITTER
	 * </p>
	 */
	public static McObfPair field_135065_b = McMappingDatabase.getSRG("field_135065_b");

	/**
	 * <p>
	 * Name: instance
	 * </p>
	 */
	public static McObfPair field_74817_a = McMappingDatabase.getSRG("field_74817_a");

	/**
	 * <p>
	 * Name: translateKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_74805_b = McMappingDatabase.getSRG("LanguageMap.func_74805_b");

}

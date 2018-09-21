package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LanguageManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfa";
		else
			return "net/minecraft/client/resources/LanguageManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfa";
		else
			return "LanguageManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcfa;";
		else
			return "Lnet/minecraft/client/resources/LanguageManager;";
	}

	/**
	 * <p>
	 * Name: getCurrentLanguage
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/resources/Language;]
	 * </p>
	 */
	public static McObfPair func_135041_c = McMappingDatabase.getSRG("LanguageManager.func_135041_c");

	/**
	 * <p>
	 * Name: metadataSerializer
	 * </p>
	 */
	public static McObfPair field_135047_b = McMappingDatabase.getSRG("field_135047_b");

	/**
	 * <p>
	 * Name: setCurrentLanguage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/Language;)V]
	 * </p>
	 */
	public static McObfPair func_135045_a = McMappingDatabase.getSRG("LanguageManager.func_135045_a");

	/**
	 * <p>
	 * Name: isCurrentLanguageBidirectional
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_135044_b = McMappingDatabase.getSRG("LanguageManager.func_135044_b");

	/**
	 * <p>
	 * Name: currentLanguage
	 * </p>
	 */
	public static McObfPair field_135048_c = McMappingDatabase.getSRG("field_135048_c");

	/**
	 * <p>
	 * Name: getLanguages
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/SortedSet;]
	 * </p>
	 */
	public static McObfPair func_135040_d = McMappingDatabase.getSRG("LanguageManager.func_135040_d");

	/**
	 * <p>
	 * Name: languageMap
	 * </p>
	 */
	public static McObfPair field_135046_d = McMappingDatabase.getSRG("field_135046_d");

	/**
	 * <p>
	 * Name: onResourceManagerReload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110549_a = McMappingDatabase.getSRG("LanguageManager.func_110549_a");

	/**
	 * <p>
	 * Name: parseLanguageMetadata
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_135043_a = McMappingDatabase.getSRG("LanguageManager.func_135043_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147648_b = McMappingDatabase.getSRG("field_147648_b");

	/**
	 * <p>
	 * Name: getLanguage
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/client/resources/Language;]
	 * </p>
	 */
	public static McObfPair func_191960_a = McMappingDatabase.getSRG("LanguageManager.func_191960_a");

	/**
	 * <p>
	 * Name: CURRENT_LOCALE
	 * </p>
	 */
	public static McObfPair field_135049_a = McMappingDatabase.getSRG("field_135049_a");

	/**
	 * <p>
	 * Name: isCurrentLocaleUnicode
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_135042_a = McMappingDatabase.getSRG("LanguageManager.func_135042_a");

}

package zdoctor.zcoremod.map.minecraft.client.resources.data;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LanguageMetadataSection {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfo";
		else
			return "net/minecraft/client/resources/data/LanguageMetadataSection";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfo";
		else
			return "LanguageMetadataSection";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcfo;";
		else
			return "Lnet/minecraft/client/resources/data/LanguageMetadataSection;";
	}

	/**
	 * <p>
	 * Name: getLanguages
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_135018_a = McMappingDatabase.getSRG("LanguageMetadataSection.func_135018_a");

	/**
	 * <p>
	 * Name: languages
	 * </p>
	 */
	public static McObfPair field_135019_a = McMappingDatabase.getSRG("field_135019_a");

}

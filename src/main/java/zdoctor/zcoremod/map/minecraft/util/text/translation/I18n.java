package zdoctor.zcoremod.map.minecraft.util.text.translation;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class I18n {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ft";
		else
			return "net/minecraft/util/text/translation/I18n";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ft";
		else
			return "I18n";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lft;";
		else
			return "Lnet/minecraft/util/text/translation/I18n;";
	}

	/**
	 * <p>
	 * Name: localizedName
	 * </p>
	 */
	public static McObfPair field_74839_a = McMappingDatabase.getSRG("field_74839_a");

	/**
	 * <p>
	 * Name: getLastTranslationUpdateTimeInMilliseconds
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_150827_a = McMappingDatabase.getSRG("I18n.func_150827_a");

	/**
	 * <p>
	 * Name: translateToLocal
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_74838_a = McMappingDatabase.getSRG("I18n.func_74838_a");

	/**
	 * <p>
	 * Name: fallbackTranslator
	 * </p>
	 */
	public static McObfPair field_150828_b = McMappingDatabase.getSRG("field_150828_b");

	/**
	 * <p>
	 * Name: translateToFallback
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150826_b = McMappingDatabase.getSRG("I18n.func_150826_b");

	/**
	 * <p>
	 * Name: canTranslate
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_94522_b = McMappingDatabase.getSRG("I18n.func_94522_b");

	/**
	 * <p>
	 * Name: translateToLocalFormatted
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_74837_a = McMappingDatabase.getSRG("I18n.func_74837_a");

}

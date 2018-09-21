package zdoctor.zcoremod.map.minecraft.util.text;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextComponentTranslation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hp";
		else
			return "net/minecraft/util/text/TextComponentTranslation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hp";
		else
			return "TextComponentTranslation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhp;";
		else
			return "Lnet/minecraft/util/text/TextComponentTranslation;";
	}

	/**
	 * <p>
	 * Name: lastTranslationUpdateTimeInMilliseconds
	 * </p>
	 */
	public static McObfPair field_150275_g = McMappingDatabase.getSRG("field_150275_g");

	/**
	 * <p>
	 * Name: ensureInitialized
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_150270_g = McMappingDatabase.getSRG("TextComponentTranslation.func_150270_g");

	/**
	 * <p>
	 * Name: getFormatArgs
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_150271_j = McMappingDatabase.getSRG("TextComponentTranslation.func_150271_j");

	/**
	 * <p>
	 * Name: getFormatArgumentAsComponent
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_150272_a = McMappingDatabase.getSRG("TextComponentTranslation.func_150272_a");

	/**
	 * <p>
	 * Name: syncLock
	 * </p>
	 */
	public static McObfPair field_150274_f = McMappingDatabase.getSRG("field_150274_f");

	/**
	 * <p>
	 * Name: setStyle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/Style;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_150255_a = McMappingDatabase.getSRG("TextComponentTranslation.func_150255_a");

	/**
	 * <p>
	 * Name: getUnformattedComponentText
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150261_e = McMappingDatabase.getSRG("TextComponentTranslation.func_150261_e");

	/**
	 * <p>
	 * Name: formatArgs
	 * </p>
	 */
	public static McObfPair field_150277_e = McMappingDatabase.getSRG("field_150277_e");

	/**
	 * <p>
	 * Name: initializeFromFormat
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_150269_b = McMappingDatabase.getSRG("TextComponentTranslation.func_150269_b");

	/**
	 * <p>
	 * Name: STRING_VARIABLE_PATTERN
	 * </p>
	 */
	public static McObfPair field_150279_c = McMappingDatabase.getSRG("field_150279_c");

	/**
	 * <p>
	 * Name: getKey
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150268_i = McMappingDatabase.getSRG("TextComponentTranslation.func_150268_i");

	/**
	 * <p>
	 * Name: key
	 * </p>
	 */
	public static McObfPair field_150276_d = McMappingDatabase.getSRG("field_150276_d");

	/**
	 * <p>
	 * Name: children
	 * </p>
	 */
	public static McObfPair field_150278_b = McMappingDatabase.getSRG("field_150278_b");

	/**
	 * <p>
	 * Name: createCopy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;, ()Lnet/minecraft/util/text/TextComponentTranslation;]
	 * </p>
	 */
	public static McObfPair func_150259_f = McMappingDatabase.getSRG("TextComponentTranslation.func_150259_f");

}

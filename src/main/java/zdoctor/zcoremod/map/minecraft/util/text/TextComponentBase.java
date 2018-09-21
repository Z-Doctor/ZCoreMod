package zdoctor.zcoremod.map.minecraft.util.text;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextComponentBase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "he";
		else
			return "net/minecraft/util/text/TextComponentBase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "he";
		else
			return "TextComponentBase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhe;";
		else
			return "Lnet/minecraft/util/text/TextComponentBase;";
	}

	/**
	 * <p>
	 * Name: siblings
	 * </p>
	 */
	public static McObfPair field_150264_a = McMappingDatabase.getSRG("field_150264_a");

	/**
	 * <p>
	 * Name: getSiblings
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_150253_a = McMappingDatabase.getSRG("TextComponentBase.func_150253_a");

	/**
	 * <p>
	 * Name: getUnformattedText
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150260_c = McMappingDatabase.getSRG("TextComponentBase.func_150260_c");

	/**
	 * <p>
	 * Name: getStyle
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150256_b = McMappingDatabase.getSRG("TextComponentBase.func_150256_b");

	/**
	 * <p>
	 * Name: style
	 * </p>
	 */
	public static McObfPair field_150263_b = McMappingDatabase.getSRG("field_150263_b");

	/**
	 * <p>
	 * Name: appendText
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_150258_a = McMappingDatabase.getSRG("TextComponentBase.func_150258_a");

	/**
	 * <p>
	 * Name: setStyle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/Style;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_150255_a = McMappingDatabase.getSRG("TextComponentBase.func_150255_a");

	/**
	 * <p>
	 * Name: getFormattedText
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150254_d = McMappingDatabase.getSRG("TextComponentBase.func_150254_d");

	/**
	 * <p>
	 * Name: createDeepCopyIterator
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Iterable;)Ljava/util/Iterator;]
	 * </p>
	 */
	public static McObfPair func_150262_a = McMappingDatabase.getSRG("TextComponentBase.func_150262_a");

	/**
	 * <p>
	 * Name: appendSibling
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_150257_a = McMappingDatabase.getSRG("TextComponentBase.func_150257_a");

}

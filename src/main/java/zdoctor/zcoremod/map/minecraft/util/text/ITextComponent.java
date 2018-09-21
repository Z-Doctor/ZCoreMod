package zdoctor.zcoremod.map.minecraft.util.text;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ITextComponent {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hh";
		else
			return "net/minecraft/util/text/ITextComponent";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hh";
		else
			return "ITextComponent";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhh;";
		else
			return "Lnet/minecraft/util/text/ITextComponent;";
	}

	/**
	 * <p>
	 * Name: createCopy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_150259_f = McMappingDatabase.getSRG("ITextComponent.func_150259_f");

	/**
	 * <p>
	 * Name: setStyle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/Style;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_150255_a = McMappingDatabase.getSRG("ITextComponent.func_150255_a");

	/**
	 * <p>
	 * Name: appendText
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_150258_a = McMappingDatabase.getSRG("ITextComponent.func_150258_a");

	/**
	 * <p>
	 * Name: appendSibling
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_150257_a = McMappingDatabase.getSRG("ITextComponent.func_150257_a");

	/**
	 * <p>
	 * Name: getUnformattedText
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150260_c = McMappingDatabase.getSRG("ITextComponent.func_150260_c");

	/**
	 * <p>
	 * Name: getStyle
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150256_b = McMappingDatabase.getSRG("ITextComponent.func_150256_b");

	/**
	 * <p>
	 * Name: getSiblings
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_150253_a = McMappingDatabase.getSRG("ITextComponent.func_150253_a");

	/**
	 * <p>
	 * Name: getFormattedText
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150254_d = McMappingDatabase.getSRG("ITextComponent.func_150254_d");

	/**
	 * <p>
	 * Name: getUnformattedComponentText
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150261_e = McMappingDatabase.getSRG("ITextComponent.func_150261_e");

}

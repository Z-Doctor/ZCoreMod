package zdoctor.zcoremod.map.minecraft.util.text;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Style$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hn$1";
		else
			return "net/minecraft/util/text/Style$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hn$1";
		else
			return "Style$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhn$1;";
		else
			return "Lnet/minecraft/util/text/Style$1;";
	}

	/**
	 * <p>
	 * Name: setBold
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Boolean;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150227_a = McMappingDatabase.getSRG("Style$1.func_150227_a");

	/**
	 * <p>
	 * Name: getInsertion
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_179986_j = McMappingDatabase.getSRG("Style$1.func_179986_j");

	/**
	 * <p>
	 * Name: createShallowCopy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150232_l = McMappingDatabase.getSRG("Style$1.func_150232_l");

	/**
	 * <p>
	 * Name: createDeepCopy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150206_m = McMappingDatabase.getSRG("Style$1.func_150206_m");

	/**
	 * <p>
	 * Name: getUnderlined
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150234_e = McMappingDatabase.getSRG("Style$1.func_150234_e");

	/**
	 * <p>
	 * Name: getHoverEvent
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/event/HoverEvent;]
	 * </p>
	 */
	public static McObfPair func_150210_i = McMappingDatabase.getSRG("Style$1.func_150210_i");

	/**
	 * <p>
	 * Name: getClickEvent
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/event/ClickEvent;]
	 * </p>
	 */
	public static McObfPair func_150235_h = McMappingDatabase.getSRG("Style$1.func_150235_h");

	/**
	 * <p>
	 * Name: setColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/TextFormatting;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150238_a = McMappingDatabase.getSRG("Style$1.func_150238_a");

	/**
	 * <p>
	 * Name: getObfuscated
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150233_f = McMappingDatabase.getSRG("Style$1.func_150233_f");

	/**
	 * <p>
	 * Name: setClickEvent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/event/ClickEvent;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150241_a = McMappingDatabase.getSRG("Style$1.func_150241_a");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/TextFormatting;]
	 * </p>
	 */
	public static McObfPair func_150215_a = McMappingDatabase.getSRG("Style$1.func_150215_a");

	/**
	 * <p>
	 * Name: getBold
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150223_b = McMappingDatabase.getSRG("Style$1.func_150223_b");

	/**
	 * <p>
	 * Name: getItalic
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150242_c = McMappingDatabase.getSRG("Style$1.func_150242_c");

	/**
	 * <p>
	 * Name: getFormattingCode
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150218_j = McMappingDatabase.getSRG("Style$1.func_150218_j");

	/**
	 * <p>
	 * Name: setObfuscated
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Boolean;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150237_e = McMappingDatabase.getSRG("Style$1.func_150237_e");

	/**
	 * <p>
	 * Name: setStrikethrough
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Boolean;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150225_c = McMappingDatabase.getSRG("Style$1.func_150225_c");

	/**
	 * <p>
	 * Name: setItalic
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Boolean;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150217_b = McMappingDatabase.getSRG("Style$1.func_150217_b");

	/**
	 * <p>
	 * Name: getStrikethrough
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150236_d = McMappingDatabase.getSRG("Style$1.func_150236_d");

	/**
	 * <p>
	 * Name: setHoverEvent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/event/HoverEvent;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150209_a = McMappingDatabase.getSRG("Style$1.func_150209_a");

	/**
	 * <p>
	 * Name: setUnderlined
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Boolean;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150228_d = McMappingDatabase.getSRG("Style$1.func_150228_d");

	/**
	 * <p>
	 * Name: setParentStyle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/Style;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150221_a = McMappingDatabase.getSRG("Style$1.func_150221_a");

}

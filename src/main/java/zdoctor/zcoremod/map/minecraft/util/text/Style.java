package zdoctor.zcoremod.map.minecraft.util.text;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Style {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hn";
		else
			return "net/minecraft/util/text/Style";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hn";
		else
			return "Style";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhn;";
		else
			return "Lnet/minecraft/util/text/Style;";
	}

	/**
	 * <p>
	 * Name: getInsertion
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_179986_j = McMappingDatabase.getSRG("Style.func_179986_j");

	/**
	 * <p>
	 * Name: createShallowCopy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150232_l = McMappingDatabase.getSRG("Style.func_150232_l");

	/**
	 * <p>
	 * Name: getUnderlined
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150234_e = McMappingDatabase.getSRG("Style.func_150234_e");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150229_g = McMappingDatabase.getSRG("Style.func_150229_g");

	/**
	 * <p>
	 * Name: setHoverEvent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/event/HoverEvent;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150209_a = McMappingDatabase.getSRG("Style.func_150209_a");

	/**
	 * <p>
	 * Name: getParent
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150224_n = McMappingDatabase.getSRG("Style.func_150224_n");

	/**
	 * <p>
	 * Name: setUnderlined
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Boolean;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150228_d = McMappingDatabase.getSRG("Style.func_150228_d");

	/**
	 * <p>
	 * Name: getBold
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150223_b = McMappingDatabase.getSRG("Style.func_150223_b");

	/**
	 * <p>
	 * Name: setParentStyle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/Style;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150221_a = McMappingDatabase.getSRG("Style.func_150221_a");

	/**
	 * <p>
	 * Name: strikethrough
	 * </p>
	 */
	public static McObfPair field_150243_f = McMappingDatabase.getSRG("field_150243_f");

	/**
	 * <p>
	 * Name: setStrikethrough
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Boolean;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150225_c = McMappingDatabase.getSRG("Style.func_150225_c");

	/**
	 * <p>
	 * Name: insertion
	 * </p>
	 */
	public static McObfPair field_179990_j = McMappingDatabase.getSRG("field_179990_j");

	/**
	 * <p>
	 * Name: setColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/TextFormatting;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150238_a = McMappingDatabase.getSRG("Style.func_150238_a");

	/**
	 * <p>
	 * Name: setBold
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Boolean;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150227_a = McMappingDatabase.getSRG("Style.func_150227_a");

	/**
	 * <p>
	 * Name: getHoverEvent
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/event/HoverEvent;]
	 * </p>
	 */
	public static McObfPair func_150210_i = McMappingDatabase.getSRG("Style.func_150210_i");

	/**
	 * <p>
	 * Name: getClickEvent
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/event/ClickEvent;]
	 * </p>
	 */
	public static McObfPair func_150235_h = McMappingDatabase.getSRG("Style.func_150235_h");

	/**
	 * <p>
	 * Name: clickEvent
	 * </p>
	 */
	public static McObfPair field_150251_h = McMappingDatabase.getSRG("field_150251_h");

	/**
	 * <p>
	 * Name: color
	 * </p>
	 */
	public static McObfPair field_150247_b = McMappingDatabase.getSRG("field_150247_b");

	/**
	 * <p>
	 * Name: underlined
	 * </p>
	 */
	public static McObfPair field_150246_e = McMappingDatabase.getSRG("field_150246_e");

	/**
	 * <p>
	 * Name: italic
	 * </p>
	 */
	public static McObfPair field_150245_d = McMappingDatabase.getSRG("field_150245_d");

	/**
	 * <p>
	 * Name: parentStyle
	 * </p>
	 */
	public static McObfPair field_150249_a = McMappingDatabase.getSRG("field_150249_a");

	/**
	 * <p>
	 * Name: bold
	 * </p>
	 */
	public static McObfPair field_150248_c = McMappingDatabase.getSRG("field_150248_c");

	/**
	 * <p>
	 * Name: obfuscated
	 * </p>
	 */
	public static McObfPair field_150244_g = McMappingDatabase.getSRG("field_150244_g");

	/**
	 * <p>
	 * Name: getFormattingCode
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150218_j = McMappingDatabase.getSRG("Style.func_150218_j");

	/**
	 * <p>
	 * Name: getItalic
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150242_c = McMappingDatabase.getSRG("Style.func_150242_c");

	/**
	 * <p>
	 * Name: setObfuscated
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Boolean;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150237_e = McMappingDatabase.getSRG("Style.func_150237_e");

	/**
	 * <p>
	 * Name: setClickEvent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/event/ClickEvent;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150241_a = McMappingDatabase.getSRG("Style.func_150241_a");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/TextFormatting;]
	 * </p>
	 */
	public static McObfPair func_150215_a = McMappingDatabase.getSRG("Style.func_150215_a");

	/**
	 * <p>
	 * Name: setItalic
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Boolean;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150217_b = McMappingDatabase.getSRG("Style.func_150217_b");

	/**
	 * <p>
	 * Name: createDeepCopy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_150206_m = McMappingDatabase.getSRG("Style.func_150206_m");

	/**
	 * <p>
	 * Name: ROOT
	 * </p>
	 */
	public static McObfPair field_150250_j = McMappingDatabase.getSRG("field_150250_j");

	/**
	 * <p>
	 * Name: getObfuscated
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150233_f = McMappingDatabase.getSRG("Style.func_150233_f");

	/**
	 * <p>
	 * Name: getStrikethrough
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150236_d = McMappingDatabase.getSRG("Style.func_150236_d");

	/**
	 * <p>
	 * Name: setInsertion
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/text/Style;]
	 * </p>
	 */
	public static McObfPair func_179989_a = McMappingDatabase.getSRG("Style.func_179989_a");

	/**
	 * <p>
	 * Name: hoverEvent
	 * </p>
	 */
	public static McObfPair field_150252_i = McMappingDatabase.getSRG("field_150252_i");

}

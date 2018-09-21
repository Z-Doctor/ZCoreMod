package zdoctor.zcoremod.map.minecraft.util.text;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextFormatting {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "a";
		else
			return "net/minecraft/util/text/TextFormatting";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "a";
		else
			return "TextFormatting";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "La;";
		else
			return "Lnet/minecraft/util/text/TextFormatting;";
	}

	/**
	 * <p>
	 * Name: colorIndex
	 * </p>
	 */
	public static McObfPair field_175747_C = McMappingDatabase.getSRG("field_175747_C");

	/**
	 * <p>
	 * Name: getTextWithoutFormattingCodes
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_110646_a = McMappingDatabase.getSRG("TextFormatting.func_110646_a");

	/**
	 * <p>
	 * Name: getColorIndex
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_175746_b = McMappingDatabase.getSRG("TextFormatting.func_175746_b");

	/**
	 * <p>
	 * Name: isFancyStyling
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_96301_b = McMappingDatabase.getSRG("TextFormatting.func_96301_b");

	/**
	 * <p>
	 * Name: isColor
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_96302_c = McMappingDatabase.getSRG("TextFormatting.func_96302_c");

	/**
	 * <p>
	 * Name: NAME_MAPPING
	 * </p>
	 */
	public static McObfPair field_96331_x = McMappingDatabase.getSRG("field_96331_x");

	/**
	 * <p>
	 * Name: getValueByName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/text/TextFormatting;]
	 * </p>
	 */
	public static McObfPair func_96300_b = McMappingDatabase.getSRG("TextFormatting.func_96300_b");

	/**
	 * <p>
	 * Name: controlString
	 * </p>
	 */
	public static McObfPair field_96304_B = McMappingDatabase.getSRG("field_96304_B");

	/**
	 * <p>
	 * Name: lowercaseAlpha
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_175745_c = McMappingDatabase.getSRG("TextFormatting.func_175745_c");

	/**
	 * <p>
	 * Name: fromColorIndex
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/text/TextFormatting;]
	 * </p>
	 */
	public static McObfPair func_175744_a = McMappingDatabase.getSRG("TextFormatting.func_175744_a");

	/**
	 * <p>
	 * Name: FORMATTING_CODE_PATTERN
	 * </p>
	 */
	public static McObfPair field_96330_y = McMappingDatabase.getSRG("field_96330_y");

	/**
	 * <p>
	 * Name: getFriendlyName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_96297_d = McMappingDatabase.getSRG("TextFormatting.func_96297_d");

	/**
	 * <p>
	 * Name: fancyStyling
	 * </p>
	 */
	public static McObfPair field_96303_A = McMappingDatabase.getSRG("field_96303_A");

	/**
	 * <p>
	 * Name: getValidValues
	 * </p>
	 * <p>
	 * Desc: [(ZZ)Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_96296_a = McMappingDatabase.getSRG("TextFormatting.func_96296_a");

	/**
	 * <p>
	 * Name: formattingCode
	 * </p>
	 */
	public static McObfPair field_96329_z = McMappingDatabase.getSRG("field_96329_z");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_175748_y = McMappingDatabase.getSRG("field_175748_y");

}

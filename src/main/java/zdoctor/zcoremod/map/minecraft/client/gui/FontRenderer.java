package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FontRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bip";
		else
			return "net/minecraft/client/gui/FontRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bip";
		else
			return "FontRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbip;";
		else
			return "Lnet/minecraft/client/gui/FontRenderer;";
	}

	/**
	 * <p>
	 * Name: red
	 * </p>
	 */
	public static McObfPair field_78291_n = McMappingDatabase.getSRG("field_78291_n");

	/**
	 * <p>
	 * Name: glyphWidth
	 * </p>
	 */
	public static McObfPair field_78287_e = McMappingDatabase.getSRG("field_78287_e");

	/**
	 * <p>
	 * Name: getUnicodeFlag
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82883_a = McMappingDatabase.getSRG("FontRenderer.func_82883_a");

	/**
	 * <p>
	 * Name: getWordWrappedHeight
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)I]
	 * </p>
	 */
	public static McObfPair func_78267_b = McMappingDatabase.getSRG("FontRenderer.func_78267_b");

	/**
	 * <p>
	 * Name: underlineStyle
	 * </p>
	 */
	public static McObfPair field_78300_v = McMappingDatabase.getSRG("field_78300_v");

	/**
	 * <p>
	 * Name: getUnicodePageLocation
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_111271_a = McMappingDatabase.getSRG("FontRenderer.func_111271_a");

	/**
	 * <p>
	 * Name: trimStringToWidth
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;IZ)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_78262_a = McMappingDatabase.getSRG("FontRenderer.func_78262_a");

	/**
	 * <p>
	 * Name: strikethroughStyle
	 * </p>
	 */
	public static McObfPair field_78299_w = McMappingDatabase.getSRG("field_78299_w");

	/**
	 * <p>
	 * Name: renderUnicodeChar
	 * </p>
	 * <p>
	 * Desc: [(CZ)F]
	 * </p>
	 */
	public static McObfPair func_78277_a = McMappingDatabase.getSRG("FontRenderer.func_78277_a");

	/**
	 * <p>
	 * Name: bidiFlag
	 * </p>
	 */
	public static McObfPair field_78294_m = McMappingDatabase.getSRG("field_78294_m");

	/**
	 * <p>
	 * Name: drawSplitString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;IIII)V]
	 * </p>
	 */
	public static McObfPair func_78279_b = McMappingDatabase.getSRG("FontRenderer.func_78279_b");

	/**
	 * <p>
	 * Name: resetStyles
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78265_b = McMappingDatabase.getSRG("FontRenderer.func_78265_b");

	/**
	 * <p>
	 * Name: alpha
	 * </p>
	 */
	public static McObfPair field_78305_q = McMappingDatabase.getSRG("field_78305_q");

	/**
	 * <p>
	 * Name: onResourceManagerReload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110549_a = McMappingDatabase.getSRG("FontRenderer.func_110549_a");

	/**
	 * <p>
	 * Name: boldStyle
	 * </p>
	 */
	public static McObfPair field_78302_t = McMappingDatabase.getSRG("field_78302_t");

	/**
	 * <p>
	 * Name: green
	 * </p>
	 */
	public static McObfPair field_78306_p = McMappingDatabase.getSRG("field_78306_p");

	/**
	 * <p>
	 * Name: UNICODE_PAGE_LOCATIONS
	 * </p>
	 */
	public static McObfPair field_111274_c = McMappingDatabase.getSRG("field_111274_c");

	/**
	 * <p>
	 * Name: posX
	 * </p>
	 */
	public static McObfPair field_78295_j = McMappingDatabase.getSRG("field_78295_j");

	/**
	 * <p>
	 * Name: getCharWidth
	 * </p>
	 * <p>
	 * Desc: [(C)I]
	 * </p>
	 */
	public static McObfPair func_78263_a = McMappingDatabase.getSRG("FontRenderer.func_78263_a");

	/**
	 * <p>
	 * Name: bidiReorder
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_147647_b = McMappingDatabase.getSRG("FontRenderer.func_147647_b");

	/**
	 * <p>
	 * Name: getFormatFromString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_78282_e = McMappingDatabase.getSRG("FontRenderer.func_78282_e");

	/**
	 * <p>
	 * Name: readGlyphSizes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_98306_d = McMappingDatabase.getSRG("FontRenderer.func_98306_d");

	/**
	 * <p>
	 * Name: blue
	 * </p>
	 */
	public static McObfPair field_78292_o = McMappingDatabase.getSRG("field_78292_o");

	/**
	 * <p>
	 * Name: renderDefaultChar
	 * </p>
	 * <p>
	 * Desc: [(IZ)F]
	 * </p>
	 */
	public static McObfPair func_78266_a = McMappingDatabase.getSRG("FontRenderer.func_78266_a");

	/**
	 * <p>
	 * Name: readFontTexture
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_111272_d = McMappingDatabase.getSRG("FontRenderer.func_111272_d");

	/**
	 * <p>
	 * Name: drawString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;III)I]
	 * </p>
	 */
	public static McObfPair func_78276_b = McMappingDatabase.getSRG("FontRenderer.func_78276_b");

	/**
	 * <p>
	 * Name: listFormattedStringToWidth
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_78271_c = McMappingDatabase.getSRG("FontRenderer.func_78271_c");

	/**
	 * <p>
	 * Name: isFormatColor
	 * </p>
	 * <p>
	 * Desc: [(C)Z]
	 * </p>
	 */
	public static McObfPair func_78272_b = McMappingDatabase.getSRG("FontRenderer.func_78272_b");

	/**
	 * <p>
	 * Name: trimStringToWidth
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_78269_a = McMappingDatabase.getSRG("FontRenderer.func_78269_a");

	/**
	 * <p>
	 * Name: drawStringWithShadow
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;FFI)I]
	 * </p>
	 */
	public static McObfPair func_175063_a = McMappingDatabase.getSRG("FontRenderer.func_175063_a");

	/**
	 * <p>
	 * Name: renderChar
	 * </p>
	 * <p>
	 * Desc: [(CZ)F]
	 * </p>
	 */
	public static McObfPair func_181559_a = McMappingDatabase.getSRG("FontRenderer.func_181559_a");

	/**
	 * <p>
	 * Name: textColor
	 * </p>
	 */
	public static McObfPair field_78304_r = McMappingDatabase.getSRG("field_78304_r");

	/**
	 * <p>
	 * Name: getColorCode
	 * </p>
	 * <p>
	 * Desc: [(C)I]
	 * </p>
	 */
	public static McObfPair func_175064_b = McMappingDatabase.getSRG("FontRenderer.func_175064_b");

	/**
	 * <p>
	 * Name: isFormatSpecial
	 * </p>
	 * <p>
	 * Desc: [(C)Z]
	 * </p>
	 */
	public static McObfPair func_78270_c = McMappingDatabase.getSRG("FontRenderer.func_78270_c");

	/**
	 * <p>
	 * Name: loadGlyphTexture
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_78257_a = McMappingDatabase.getSRG("FontRenderer.func_78257_a");

	/**
	 * <p>
	 * Name: renderStringAligned
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;IIIIZ)I]
	 * </p>
	 */
	public static McObfPair func_78274_b = McMappingDatabase.getSRG("FontRenderer.func_78274_b");

	/**
	 * <p>
	 * Name: getStringWidth
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_78256_a = McMappingDatabase.getSRG("FontRenderer.func_78256_a");

	/**
	 * <p>
	 * Name: locationFontTexture
	 * </p>
	 */
	public static McObfPair field_111273_g = McMappingDatabase.getSRG("field_111273_g");

	/**
	 * <p>
	 * Name: charWidth
	 * </p>
	 */
	public static McObfPair field_78286_d = McMappingDatabase.getSRG("field_78286_d");

	/**
	 * <p>
	 * Name: renderString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;FFIZ)I]
	 * </p>
	 */
	public static McObfPair func_180455_b = McMappingDatabase.getSRG("FontRenderer.func_180455_b");

	/**
	 * <p>
	 * Name: getBidiFlag
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_78260_a = McMappingDatabase.getSRG("FontRenderer.func_78260_a");

	/**
	 * <p>
	 * Name: setUnicodeFlag
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_78264_a = McMappingDatabase.getSRG("FontRenderer.func_78264_a");

	/**
	 * <p>
	 * Name: renderSplitString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;IIIZ)V]
	 * </p>
	 */
	public static McObfPair func_78268_b = McMappingDatabase.getSRG("FontRenderer.func_78268_b");

	/**
	 * <p>
	 * Name: drawString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;FFIZ)I]
	 * </p>
	 */
	public static McObfPair func_175065_a = McMappingDatabase.getSRG("FontRenderer.func_175065_a");

	/**
	 * <p>
	 * Name: fontRandom
	 * </p>
	 */
	public static McObfPair field_78289_c = McMappingDatabase.getSRG("field_78289_c");

	/**
	 * <p>
	 * Name: wrapFormattedStringToWidth
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_78280_d = McMappingDatabase.getSRG("FontRenderer.func_78280_d");

	/**
	 * <p>
	 * Name: FONT_HEIGHT
	 * </p>
	 */
	public static McObfPair field_78288_b = McMappingDatabase.getSRG("field_78288_b");

	/**
	 * <p>
	 * Name: renderEngine
	 * </p>
	 */
	public static McObfPair field_78298_i = McMappingDatabase.getSRG("field_78298_i");

	/**
	 * <p>
	 * Name: renderStringAtPos
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Z)V]
	 * </p>
	 */
	public static McObfPair func_78255_a = McMappingDatabase.getSRG("FontRenderer.func_78255_a");

	/**
	 * <p>
	 * Name: unicodeFlag
	 * </p>
	 */
	public static McObfPair field_78293_l = McMappingDatabase.getSRG("field_78293_l");

	/**
	 * <p>
	 * Name: sizeStringToWidth
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)I]
	 * </p>
	 */
	public static McObfPair func_78259_e = McMappingDatabase.getSRG("FontRenderer.func_78259_e");

	/**
	 * <p>
	 * Name: italicStyle
	 * </p>
	 */
	public static McObfPair field_78301_u = McMappingDatabase.getSRG("field_78301_u");

	/**
	 * <p>
	 * Name: setBidiFlag
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_78275_b = McMappingDatabase.getSRG("FontRenderer.func_78275_b");

	/**
	 * <p>
	 * Name: randomStyle
	 * </p>
	 */
	public static McObfPair field_78303_s = McMappingDatabase.getSRG("field_78303_s");

	/**
	 * <p>
	 * Name: posY
	 * </p>
	 */
	public static McObfPair field_78296_k = McMappingDatabase.getSRG("field_78296_k");

	/**
	 * <p>
	 * Name: trimStringNewline
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_78273_d = McMappingDatabase.getSRG("FontRenderer.func_78273_d");

	/**
	 * <p>
	 * Name: colorCode
	 * </p>
	 */
	public static McObfPair field_78285_g = McMappingDatabase.getSRG("field_78285_g");

}

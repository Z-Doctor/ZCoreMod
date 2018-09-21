package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Gui {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bir";
		else
			return "net/minecraft/client/gui/Gui";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bir";
		else
			return "Gui";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbir;";
		else
			return "Lnet/minecraft/client/gui/Gui;";
	}

	/**
	 * <p>
	 * Name: OPTIONS_BACKGROUND
	 * </p>
	 */
	public static McObfPair field_110325_k = McMappingDatabase.getSRG("field_110325_k");

	/**
	 * <p>
	 * Name: drawScaledCustomSizeModalRect
	 * </p>
	 * <p>
	 * Desc: [(IIFFIIIIFF)V]
	 * </p>
	 */
	public static McObfPair func_152125_a = McMappingDatabase.getSRG("Gui.func_152125_a");

	/**
	 * <p>
	 * Name: drawCenteredString
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;III)V]
	 * </p>
	 */
	public static McObfPair func_73732_a = McMappingDatabase.getSRG("Gui.func_73732_a");

	/**
	 * <p>
	 * Name: drawModalRectWithCustomSizedTexture
	 * </p>
	 * <p>
	 * Desc: [(IIFFIIFF)V]
	 * </p>
	 */
	public static McObfPair func_146110_a = McMappingDatabase.getSRG("Gui.func_146110_a");

	/**
	 * <p>
	 * Name: zLevel
	 * </p>
	 */
	public static McObfPair field_73735_i = McMappingDatabase.getSRG("field_73735_i");

	/**
	 * <p>
	 * Name: drawTexturedModalRect
	 * </p>
	 * <p>
	 * Desc: [(FFIIII)V]
	 * </p>
	 */
	public static McObfPair func_175174_a = McMappingDatabase.getSRG("Gui.func_175174_a");

	/**
	 * <p>
	 * Name: drawVerticalLine
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_73728_b = McMappingDatabase.getSRG("Gui.func_73728_b");

	/**
	 * <p>
	 * Name: ICONS
	 * </p>
	 */
	public static McObfPair field_110324_m = McMappingDatabase.getSRG("field_110324_m");

	/**
	 * <p>
	 * Name: STAT_ICONS
	 * </p>
	 */
	public static McObfPair field_110323_l = McMappingDatabase.getSRG("field_110323_l");

	/**
	 * <p>
	 * Name: drawHorizontalLine
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_73730_a = McMappingDatabase.getSRG("Gui.func_73730_a");

	/**
	 * <p>
	 * Name: drawGradientRect
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_73733_a = McMappingDatabase.getSRG("Gui.func_73733_a");

	/**
	 * <p>
	 * Name: drawString
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;III)V]
	 * </p>
	 */
	public static McObfPair func_73731_b = McMappingDatabase.getSRG("Gui.func_73731_b");

	/**
	 * <p>
	 * Name: drawRect
	 * </p>
	 * <p>
	 * Desc: [(IIIII)V]
	 * </p>
	 */
	public static McObfPair func_73734_a = McMappingDatabase.getSRG("Gui.func_73734_a");

	/**
	 * <p>
	 * Name: drawTexturedModalRect
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_73729_b = McMappingDatabase.getSRG("Gui.func_73729_b");

	/**
	 * <p>
	 * Name: drawTexturedModalRect
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/client/renderer/texture/TextureAtlasSprite;II)V]
	 * </p>
	 */
	public static McObfPair func_175175_a = McMappingDatabase.getSRG("Gui.func_175175_a");

}

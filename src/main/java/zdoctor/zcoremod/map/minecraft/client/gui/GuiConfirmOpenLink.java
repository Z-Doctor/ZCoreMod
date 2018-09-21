package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiConfirmOpenLink {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bko";
		else
			return "net/minecraft/client/gui/GuiConfirmOpenLink";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bko";
		else
			return "GuiConfirmOpenLink";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbko;";
		else
			return "Lnet/minecraft/client/gui/GuiConfirmOpenLink;";
	}

	/**
	 * <p>
	 * Name: copyLinkToClipboard
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146359_e = McMappingDatabase.getSRG("GuiConfirmOpenLink.func_146359_e");

	/**
	 * <p>
	 * Name: showSecurityWarning
	 * </p>
	 */
	public static McObfPair field_146360_u = McMappingDatabase.getSRG("field_146360_u");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiConfirmOpenLink.func_146284_a");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiConfirmOpenLink.func_73863_a");

	/**
	 * <p>
	 * Name: openLinkWarning
	 * </p>
	 */
	public static McObfPair field_146363_r = McMappingDatabase.getSRG("field_146363_r");

	/**
	 * <p>
	 * Name: copyLinkButtonText
	 * </p>
	 */
	public static McObfPair field_146362_s = McMappingDatabase.getSRG("field_146362_s");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiConfirmOpenLink.func_73866_w_");

	/**
	 * <p>
	 * Name: disableSecurityWarning
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146358_g = McMappingDatabase.getSRG("GuiConfirmOpenLink.func_146358_g");

	/**
	 * <p>
	 * Name: linkText
	 * </p>
	 */
	public static McObfPair field_146361_t = McMappingDatabase.getSRG("field_146361_t");

}

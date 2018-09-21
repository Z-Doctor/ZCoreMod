package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiClickableScrolledSelectionListProxy {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkh";
		else
			return "net/minecraft/client/gui/GuiClickableScrolledSelectionListProxy";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkh";
		else
			return "GuiClickableScrolledSelectionListProxy";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkh;";
		else
			return "Lnet/minecraft/client/gui/GuiClickableScrolledSelectionListProxy;";
	}

	/**
	 * <p>
	 * Name: elementClicked
	 * </p>
	 * <p>
	 * Desc: [(IZII)V]
	 * </p>
	 */
	public static McObfPair func_148144_a = McMappingDatabase.getSRG("GuiClickableScrolledSelectionListProxy.func_148144_a");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178044_e = McMappingDatabase.getSRG("GuiClickableScrolledSelectionListProxy.func_178044_e");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148127_b = McMappingDatabase.getSRG("GuiClickableScrolledSelectionListProxy.func_148127_b");

	/**
	 * <p>
	 * Name: mouseY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178042_f = McMappingDatabase.getSRG("GuiClickableScrolledSelectionListProxy.func_178042_f");

	/**
	 * <p>
	 * Name: isSelected
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_148131_a = McMappingDatabase.getSRG("GuiClickableScrolledSelectionListProxy.func_148131_a");

	/**
	 * <p>
	 * Name: drawSelectionBox
	 * </p>
	 * <p>
	 * Desc: [(IIIIF)V]
	 * </p>
	 */
	public static McObfPair func_192638_a = McMappingDatabase.getSRG("GuiClickableScrolledSelectionListProxy.func_192638_a");

	/**
	 * <p>
	 * Name: drawBackground
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148123_a = McMappingDatabase.getSRG("GuiClickableScrolledSelectionListProxy.func_148123_a");

	/**
	 * <p>
	 * Name: getContentHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148138_e = McMappingDatabase.getSRG("GuiClickableScrolledSelectionListProxy.func_148138_e");

	/**
	 * <p>
	 * Name: renderSelected
	 * </p>
	 * <p>
	 * Desc: [(IIILnet/minecraft/realms/Tezzelator;)V]
	 * </p>
	 */
	public static McObfPair func_178043_a = McMappingDatabase.getSRG("GuiClickableScrolledSelectionListProxy.func_178043_a");

	/**
	 * <p>
	 * Name: getScrollBarX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148137_d = McMappingDatabase.getSRG("GuiClickableScrolledSelectionListProxy.func_148137_d");

	/**
	 * <p>
	 * Name: mouseX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178045_g = McMappingDatabase.getSRG("GuiClickableScrolledSelectionListProxy.func_178045_g");

	/**
	 * <p>
	 * Name: drawSlot
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIF)V]
	 * </p>
	 */
	public static McObfPair func_192637_a = McMappingDatabase.getSRG("GuiClickableScrolledSelectionListProxy.func_192637_a");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178039_p = McMappingDatabase.getSRG("GuiClickableScrolledSelectionListProxy.func_178039_p");

	/**
	 * <p>
	 * Name: proxy
	 * </p>
	 */
	public static McObfPair field_178046_u = McMappingDatabase.getSRG("field_178046_u");

}

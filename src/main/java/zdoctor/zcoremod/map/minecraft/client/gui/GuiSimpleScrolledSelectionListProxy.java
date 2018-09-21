package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiSimpleScrolledSelectionListProxy {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkk";
		else
			return "net/minecraft/client/gui/GuiSimpleScrolledSelectionListProxy";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkk";
		else
			return "GuiSimpleScrolledSelectionListProxy";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkk;";
		else
			return "Lnet/minecraft/client/gui/GuiSimpleScrolledSelectionListProxy;";
	}

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148127_b = McMappingDatabase.getSRG("GuiSimpleScrolledSelectionListProxy.func_148127_b");

	/**
	 * <p>
	 * Name: realmsScrolledSelectionList
	 * </p>
	 */
	public static McObfPair field_178050_u = McMappingDatabase.getSRG("field_178050_u");

	/**
	 * <p>
	 * Name: elementClicked
	 * </p>
	 * <p>
	 * Desc: [(IZII)V]
	 * </p>
	 */
	public static McObfPair func_148144_a = McMappingDatabase.getSRG("GuiSimpleScrolledSelectionListProxy.func_148144_a");

	/**
	 * <p>
	 * Name: drawBackground
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148123_a = McMappingDatabase.getSRG("GuiSimpleScrolledSelectionListProxy.func_148123_a");

	/**
	 * <p>
	 * Name: getWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178048_e = McMappingDatabase.getSRG("GuiSimpleScrolledSelectionListProxy.func_178048_e");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178039_p = McMappingDatabase.getSRG("GuiSimpleScrolledSelectionListProxy.func_178039_p");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_148128_a = McMappingDatabase.getSRG("GuiSimpleScrolledSelectionListProxy.func_148128_a");

	/**
	 * <p>
	 * Name: drawSlot
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIF)V]
	 * </p>
	 */
	public static McObfPair func_192637_a = McMappingDatabase.getSRG("GuiSimpleScrolledSelectionListProxy.func_192637_a");

	/**
	 * <p>
	 * Name: getContentHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148138_e = McMappingDatabase.getSRG("GuiSimpleScrolledSelectionListProxy.func_148138_e");

	/**
	 * <p>
	 * Name: getMouseY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178047_f = McMappingDatabase.getSRG("GuiSimpleScrolledSelectionListProxy.func_178047_f");

	/**
	 * <p>
	 * Name: getMouseX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178049_g = McMappingDatabase.getSRG("GuiSimpleScrolledSelectionListProxy.func_178049_g");

	/**
	 * <p>
	 * Name: getScrollBarX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148137_d = McMappingDatabase.getSRG("GuiSimpleScrolledSelectionListProxy.func_148137_d");

	/**
	 * <p>
	 * Name: isSelected
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_148131_a = McMappingDatabase.getSRG("GuiSimpleScrolledSelectionListProxy.func_148131_a");

}

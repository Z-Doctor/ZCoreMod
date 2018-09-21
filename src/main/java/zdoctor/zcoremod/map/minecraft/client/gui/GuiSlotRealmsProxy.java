package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiSlotRealmsProxy {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkj";
		else
			return "net/minecraft/client/gui/GuiSlotRealmsProxy";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkj";
		else
			return "GuiSlotRealmsProxy";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkj;";
		else
			return "Lnet/minecraft/client/gui/GuiSlotRealmsProxy;";
	}

	/**
	 * <p>
	 * Name: getWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_154338_k = McMappingDatabase.getSRG("GuiSlotRealmsProxy.func_154338_k");

	/**
	 * <p>
	 * Name: getMouseY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_154339_l = McMappingDatabase.getSRG("GuiSlotRealmsProxy.func_154339_l");

	/**
	 * <p>
	 * Name: getScrollBarX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148137_d = McMappingDatabase.getSRG("GuiSlotRealmsProxy.func_148137_d");

	/**
	 * <p>
	 * Name: drawBackground
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148123_a = McMappingDatabase.getSRG("GuiSlotRealmsProxy.func_148123_a");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148127_b = McMappingDatabase.getSRG("GuiSlotRealmsProxy.func_148127_b");

	/**
	 * <p>
	 * Name: drawSlot
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIF)V]
	 * </p>
	 */
	public static McObfPair func_192637_a = McMappingDatabase.getSRG("GuiSlotRealmsProxy.func_192637_a");

	/**
	 * <p>
	 * Name: isSelected
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_148131_a = McMappingDatabase.getSRG("GuiSlotRealmsProxy.func_148131_a");

	/**
	 * <p>
	 * Name: selectionList
	 * </p>
	 */
	public static McObfPair field_154340_k = McMappingDatabase.getSRG("field_154340_k");

	/**
	 * <p>
	 * Name: elementClicked
	 * </p>
	 * <p>
	 * Desc: [(IZII)V]
	 * </p>
	 */
	public static McObfPair func_148144_a = McMappingDatabase.getSRG("GuiSlotRealmsProxy.func_148144_a");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178039_p = McMappingDatabase.getSRG("GuiSlotRealmsProxy.func_178039_p");

	/**
	 * <p>
	 * Name: getContentHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148138_e = McMappingDatabase.getSRG("GuiSlotRealmsProxy.func_148138_e");

	/**
	 * <p>
	 * Name: getMouseX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_154337_m = McMappingDatabase.getSRG("GuiSlotRealmsProxy.func_154337_m");

}

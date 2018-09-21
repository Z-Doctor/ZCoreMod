package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiEditSign {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnb";
		else
			return "net/minecraft/client/gui/inventory/GuiEditSign";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnb";
		else
			return "GuiEditSign";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnb;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiEditSign;";
	}

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiEditSign.func_146281_b");

	/**
	 * <p>
	 * Name: doneBtn
	 * </p>
	 */
	public static McObfPair field_146852_i = McMappingDatabase.getSRG("field_146852_i");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiEditSign.func_146284_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiEditSign.func_73866_w_");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiEditSign.func_73863_a");

	/**
	 * <p>
	 * Name: updateCounter
	 * </p>
	 */
	public static McObfPair field_146849_g = McMappingDatabase.getSRG("field_146849_g");

	/**
	 * <p>
	 * Name: editLine
	 * </p>
	 */
	public static McObfPair field_146851_h = McMappingDatabase.getSRG("field_146851_h");

	/**
	 * <p>
	 * Name: tileSign
	 * </p>
	 */
	public static McObfPair field_146848_f = McMappingDatabase.getSRG("field_146848_f");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiEditSign.func_73869_a");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiEditSign.func_73876_c");

}

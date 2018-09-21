package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiIngameMenu {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blg";
		else
			return "net/minecraft/client/gui/GuiIngameMenu";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blg";
		else
			return "GuiIngameMenu";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblg;";
		else
			return "Lnet/minecraft/client/gui/GuiIngameMenu;";
	}

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiIngameMenu.func_73863_a");

	/**
	 * <p>
	 * Name: saveStep
	 * </p>
	 */
	public static McObfPair field_146445_a = McMappingDatabase.getSRG("field_146445_a");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiIngameMenu.func_146284_a");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiIngameMenu.func_73876_c");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiIngameMenu.func_73866_w_");

	/**
	 * <p>
	 * Name: visibleTime
	 * </p>
	 */
	public static McObfPair field_146444_f = McMappingDatabase.getSRG("field_146444_f");

}

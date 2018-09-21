package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiWorldEdit {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boj";
		else
			return "net/minecraft/client/gui/GuiWorldEdit";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boj";
		else
			return "GuiWorldEdit";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lboj;";
		else
			return "Lnet/minecraft/client/gui/GuiWorldEdit;";
	}

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiWorldEdit.func_146284_a");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiWorldEdit.func_73876_c");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiWorldEdit.func_73863_a");

	/**
	 * <p>
	 * Name: lastScreen
	 * </p>
	 */
	public static McObfPair field_184858_a = McMappingDatabase.getSRG("field_184858_a");

	/**
	 * <p>
	 * Name: worldId
	 * </p>
	 */
	public static McObfPair field_184860_g = McMappingDatabase.getSRG("field_184860_g");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiWorldEdit.func_146281_b");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiWorldEdit.func_73869_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiWorldEdit.func_73866_w_");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiWorldEdit.func_73864_a");

	/**
	 * <p>
	 * Name: nameEdit
	 * </p>
	 */
	public static McObfPair field_184859_f = McMappingDatabase.getSRG("field_184859_f");

}

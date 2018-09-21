package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiWorldSelection {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bok";
		else
			return "net/minecraft/client/gui/GuiWorldSelection";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bok";
		else
			return "GuiWorldSelection";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbok;";
		else
			return "Lnet/minecraft/client/gui/GuiWorldSelection;";
	}

	/**
	 * <p>
	 * Name: deleteButton
	 * </p>
	 */
	public static McObfPair field_146642_y = McMappingDatabase.getSRG("field_146642_y");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146274_d = McMappingDatabase.getSRG("GuiWorldSelection.func_146274_d");

	/**
	 * <p>
	 * Name: selectWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiListWorldSelectionEntry;)V]
	 * </p>
	 */
	public static McObfPair func_184863_a = McMappingDatabase.getSRG("GuiWorldSelection.func_184863_a");

	/**
	 * <p>
	 * Name: selectButton
	 * </p>
	 */
	public static McObfPair field_146641_z = McMappingDatabase.getSRG("field_146641_z");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiWorldSelection.func_73863_a");

	/**
	 * <p>
	 * Name: worldVersTooltip
	 * </p>
	 */
	public static McObfPair field_184869_h = McMappingDatabase.getSRG("field_184869_h");

	/**
	 * <p>
	 * Name: setVersionTooltip
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_184861_a = McMappingDatabase.getSRG("GuiWorldSelection.func_184861_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_184868_g = McMappingDatabase.getSRG("field_184868_g");

	/**
	 * <p>
	 * Name: postInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184862_a = McMappingDatabase.getSRG("GuiWorldSelection.func_184862_a");

	/**
	 * <p>
	 * Name: prevScreen
	 * </p>
	 */
	public static McObfPair field_184864_a = McMappingDatabase.getSRG("field_184864_a");

	/**
	 * <p>
	 * Name: title
	 * </p>
	 */
	public static McObfPair field_184867_f = McMappingDatabase.getSRG("field_184867_f");

	/**
	 * <p>
	 * Name: copyButton
	 * </p>
	 */
	public static McObfPair field_184865_t = McMappingDatabase.getSRG("field_184865_t");

	/**
	 * <p>
	 * Name: renameButton
	 * </p>
	 */
	public static McObfPair field_146630_A = McMappingDatabase.getSRG("field_146630_A");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiWorldSelection.func_146284_a");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_146286_b = McMappingDatabase.getSRG("GuiWorldSelection.func_146286_b");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiWorldSelection.func_73866_w_");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiWorldSelection.func_73864_a");

	/**
	 * <p>
	 * Name: selectionList
	 * </p>
	 */
	public static McObfPair field_184866_u = McMappingDatabase.getSRG("field_184866_u");

}

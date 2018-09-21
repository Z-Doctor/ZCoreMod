package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiGameOver {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkv";
		else
			return "net/minecraft/client/gui/GuiGameOver";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkv";
		else
			return "GuiGameOver";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkv;";
		else
			return "Lnet/minecraft/client/gui/GuiGameOver;";
	}

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiGameOver.func_73866_w_");

	/**
	 * <p>
	 * Name: causeOfDeath
	 * </p>
	 */
	public static McObfPair field_184871_f = McMappingDatabase.getSRG("field_184871_f");

	/**
	 * <p>
	 * Name: doesGuiPauseGame
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73868_f = McMappingDatabase.getSRG("GuiGameOver.func_73868_f");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiGameOver.func_73863_a");

	/**
	 * <p>
	 * Name: getClickedComponentAt
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_184870_b = McMappingDatabase.getSRG("GuiGameOver.func_184870_b");

	/**
	 * <p>
	 * Name: confirmClicked
	 * </p>
	 * <p>
	 * Desc: [(ZI)V]
	 * </p>
	 */
	public static McObfPair func_73878_a = McMappingDatabase.getSRG("GuiGameOver.func_73878_a");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiGameOver.func_146284_a");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiGameOver.func_73869_a");

	/**
	 * <p>
	 * Name: enableButtonsTimer
	 * </p>
	 */
	public static McObfPair field_146347_a = McMappingDatabase.getSRG("field_146347_a");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiGameOver.func_73876_c");

}

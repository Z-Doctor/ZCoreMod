package zdoctor.zcoremod.map.minecraft.client.multiplayer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiConnecting {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkr";
		else
			return "net/minecraft/client/multiplayer/GuiConnecting";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkr";
		else
			return "GuiConnecting";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkr;";
		else
			return "Lnet/minecraft/client/multiplayer/GuiConnecting;";
	}

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiConnecting.func_146284_a");

	/**
	 * <p>
	 * Name: cancel
	 * </p>
	 */
	public static McObfPair field_146373_h = McMappingDatabase.getSRG("field_146373_h");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiConnecting.func_73866_w_");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiConnecting.func_73869_a");

	/**
	 * <p>
	 * Name: CONNECTION_ID
	 * </p>
	 */
	public static McObfPair field_146372_a = McMappingDatabase.getSRG("field_146372_a");

	/**
	 * <p>
	 * Name: previousGuiScreen
	 * </p>
	 */
	public static McObfPair field_146374_i = McMappingDatabase.getSRG("field_146374_i");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiConnecting.func_73863_a");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiConnecting.func_73876_c");

	/**
	 * <p>
	 * Name: connect
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)V]
	 * </p>
	 */
	public static McObfPair func_146367_a = McMappingDatabase.getSRG("GuiConnecting.func_146367_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_146370_f = McMappingDatabase.getSRG("field_146370_f");

	/**
	 * <p>
	 * Name: networkManager
	 * </p>
	 */
	public static McObfPair field_146371_g = McMappingDatabase.getSRG("field_146371_g");

}

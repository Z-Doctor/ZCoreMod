package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiShareToLan {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bll";
		else
			return "net/minecraft/client/gui/GuiShareToLan";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bll";
		else
			return "GuiShareToLan";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbll;";
		else
			return "Lnet/minecraft/client/gui/GuiShareToLan;";
	}

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiShareToLan.func_146284_a");

	/**
	 * <p>
	 * Name: allowCheats
	 * </p>
	 */
	public static McObfPair field_146600_i = McMappingDatabase.getSRG("field_146600_i");

	/**
	 * <p>
	 * Name: updateDisplayNames
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146595_g = McMappingDatabase.getSRG("GuiShareToLan.func_146595_g");

	/**
	 * <p>
	 * Name: gameModeButton
	 * </p>
	 */
	public static McObfPair field_146597_g = McMappingDatabase.getSRG("field_146597_g");

	/**
	 * <p>
	 * Name: allowCheatsButton
	 * </p>
	 */
	public static McObfPair field_146596_f = McMappingDatabase.getSRG("field_146596_f");

	/**
	 * <p>
	 * Name: gameMode
	 * </p>
	 */
	public static McObfPair field_146599_h = McMappingDatabase.getSRG("field_146599_h");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiShareToLan.func_73863_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiShareToLan.func_73866_w_");

	/**
	 * <p>
	 * Name: lastScreen
	 * </p>
	 */
	public static McObfPair field_146598_a = McMappingDatabase.getSRG("field_146598_a");

}

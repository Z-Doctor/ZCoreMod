package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiScreenAddServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkz";
		else
			return "net/minecraft/client/gui/GuiScreenAddServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkz";
		else
			return "GuiScreenAddServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkz;";
		else
			return "Lnet/minecraft/client/gui/GuiScreenAddServer;";
	}

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiScreenAddServer.func_73866_w_");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiScreenAddServer.func_146284_a");

	/**
	 * <p>
	 * Name: addressFilter
	 * </p>
	 */
	public static McObfPair field_181032_r = McMappingDatabase.getSRG("field_181032_r");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiScreenAddServer.func_73876_c");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiScreenAddServer.func_73863_a");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiScreenAddServer.func_73869_a");

	/**
	 * <p>
	 * Name: serverNameField
	 * </p>
	 */
	public static McObfPair field_146309_g = McMappingDatabase.getSRG("field_146309_g");

	/**
	 * <p>
	 * Name: parentScreen
	 * </p>
	 */
	public static McObfPair field_146310_a = McMappingDatabase.getSRG("field_146310_a");

	/**
	 * <p>
	 * Name: serverIPField
	 * </p>
	 */
	public static McObfPair field_146308_f = McMappingDatabase.getSRG("field_146308_f");

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiScreenAddServer.func_146281_b");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiScreenAddServer.func_73864_a");

	/**
	 * <p>
	 * Name: serverData
	 * </p>
	 */
	public static McObfPair field_146311_h = McMappingDatabase.getSRG("field_146311_h");

	/**
	 * <p>
	 * Name: serverResourcePacks
	 * </p>
	 */
	public static McObfPair field_152176_i = McMappingDatabase.getSRG("field_152176_i");

}

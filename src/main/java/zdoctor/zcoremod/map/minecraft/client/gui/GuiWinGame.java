package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiWinGame {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blt";
		else
			return "net/minecraft/client/gui/GuiWinGame";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blt";
		else
			return "GuiWinGame";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblt;";
		else
			return "Lnet/minecraft/client/gui/GuiWinGame;";
	}

	/**
	 * <p>
	 * Name: drawWinGameScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_146575_b = McMappingDatabase.getSRG("GuiWinGame.func_146575_b");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiWinGame.func_73876_c");

	/**
	 * <p>
	 * Name: poem
	 * </p>
	 */
	public static McObfPair field_193980_h = McMappingDatabase.getSRG("field_193980_h");

	/**
	 * <p>
	 * Name: doesGuiPauseGame
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73868_f = McMappingDatabase.getSRG("GuiWinGame.func_73868_f");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_146580_a = McMappingDatabase.getSRG("field_146580_a");

	/**
	 * <p>
	 * Name: onFinished
	 * </p>
	 */
	public static McObfPair field_193981_i = McMappingDatabase.getSRG("field_193981_i");

	/**
	 * <p>
	 * Name: lines
	 * </p>
	 */
	public static McObfPair field_146582_i = McMappingDatabase.getSRG("field_146582_i");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiWinGame.func_73869_a");

	/**
	 * <p>
	 * Name: MINECRAFT_LOGO
	 * </p>
	 */
	public static McObfPair field_146576_f = McMappingDatabase.getSRG("field_146576_f");

	/**
	 * <p>
	 * Name: scrollSpeed
	 * </p>
	 */
	public static McObfPair field_146578_s = McMappingDatabase.getSRG("field_146578_s");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiWinGame.func_73863_a");

	/**
	 * <p>
	 * Name: time
	 * </p>
	 */
	public static McObfPair field_146581_h = McMappingDatabase.getSRG("field_146581_h");

	/**
	 * <p>
	 * Name: totalScrollLength
	 * </p>
	 */
	public static McObfPair field_146579_r = McMappingDatabase.getSRG("field_146579_r");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiWinGame.func_73866_w_");

	/**
	 * <p>
	 * Name: VIGNETTE_TEXTURE
	 * </p>
	 */
	public static McObfPair field_146577_g = McMappingDatabase.getSRG("field_146577_g");

	/**
	 * <p>
	 * Name: sendRespawnPacket
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146574_g = McMappingDatabase.getSRG("GuiWinGame.func_146574_g");

}

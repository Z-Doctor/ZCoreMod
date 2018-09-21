package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiDownloadTerrain {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blj";
		else
			return "net/minecraft/client/gui/GuiDownloadTerrain";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blj";
		else
			return "GuiDownloadTerrain";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblj;";
		else
			return "Lnet/minecraft/client/gui/GuiDownloadTerrain;";
	}

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiDownloadTerrain.func_73863_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiDownloadTerrain.func_73866_w_");

	/**
	 * <p>
	 * Name: doesGuiPauseGame
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73868_f = McMappingDatabase.getSRG("GuiDownloadTerrain.func_73868_f");

}

package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiScreenBook$NextPageButton {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmj$a";
		else
			return "net/minecraft/client/gui/GuiScreenBook$NextPageButton";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmj$a";
		else
			return "GuiScreenBook$NextPageButton";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmj$a;";
		else
			return "Lnet/minecraft/client/gui/GuiScreenBook$NextPageButton;";
	}

	/**
	 * <p>
	 * Name: drawButton
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;IIF)V]
	 * </p>
	 */
	public static McObfPair func_191745_a = McMappingDatabase.getSRG("GuiScreenBook$NextPageButton.func_191745_a");

	/**
	 * <p>
	 * Name: isForward
	 * </p>
	 */
	public static McObfPair field_146151_o = McMappingDatabase.getSRG("field_146151_o");

}

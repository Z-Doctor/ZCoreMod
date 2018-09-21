package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiMerchant$MerchantButton {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmy$a";
		else
			return "net/minecraft/client/gui/GuiMerchant$MerchantButton";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmy$a";
		else
			return "GuiMerchant$MerchantButton";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmy$a;";
		else
			return "Lnet/minecraft/client/gui/GuiMerchant$MerchantButton;";
	}

	/**
	 * <p>
	 * Name: drawButton
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;IIF)V]
	 * </p>
	 */
	public static McObfPair func_191745_a = McMappingDatabase.getSRG("GuiMerchant$MerchantButton.func_191745_a");

	/**
	 * <p>
	 * Name: forward
	 * </p>
	 */
	public static McObfPair field_146157_o = McMappingDatabase.getSRG("field_146157_o");

}

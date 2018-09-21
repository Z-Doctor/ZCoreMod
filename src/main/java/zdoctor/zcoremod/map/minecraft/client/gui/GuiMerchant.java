package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiMerchant {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmy";
		else
			return "net/minecraft/client/gui/GuiMerchant";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmy";
		else
			return "GuiMerchant";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmy;";
		else
			return "Lnet/minecraft/client/gui/GuiMerchant;";
	}

	/**
	 * <p>
	 * Name: selectedMerchantRecipe
	 * </p>
	 */
	public static McObfPair field_147041_z = McMappingDatabase.getSRG("field_147041_z");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147039_u = McMappingDatabase.getSRG("field_147039_u");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiMerchant.func_73876_c");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiMerchant.func_146284_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiMerchant.func_73866_w_");

	/**
	 * <p>
	 * Name: MERCHANT_GUI_TEXTURE
	 * </p>
	 */
	public static McObfPair field_147038_v = McMappingDatabase.getSRG("field_147038_v");

	/**
	 * <p>
	 * Name: merchant
	 * </p>
	 */
	public static McObfPair field_147037_w = McMappingDatabase.getSRG("field_147037_w");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiMerchant.func_73863_a");

	/**
	 * <p>
	 * Name: drawGuiContainerForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146979_b = McMappingDatabase.getSRG("GuiMerchant.func_146979_b");

	/**
	 * <p>
	 * Name: getMerchant
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/IMerchant;]
	 * </p>
	 */
	public static McObfPair func_147035_g = McMappingDatabase.getSRG("GuiMerchant.func_147035_g");

	/**
	 * <p>
	 * Name: previousButton
	 * </p>
	 */
	public static McObfPair field_147042_y = McMappingDatabase.getSRG("field_147042_y");

	/**
	 * <p>
	 * Name: drawGuiContainerBackgroundLayer
	 * </p>
	 * <p>
	 * Desc: [(FII)V]
	 * </p>
	 */
	public static McObfPair func_146976_a = McMappingDatabase.getSRG("GuiMerchant.func_146976_a");

	/**
	 * <p>
	 * Name: nextButton
	 * </p>
	 */
	public static McObfPair field_147043_x = McMappingDatabase.getSRG("field_147043_x");

	/**
	 * <p>
	 * Name: chatComponent
	 * </p>
	 */
	public static McObfPair field_147040_A = McMappingDatabase.getSRG("field_147040_A");

}

package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiBrewingStand {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmk";
		else
			return "net/minecraft/client/gui/inventory/GuiBrewingStand";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmk";
		else
			return "GuiBrewingStand";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmk;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiBrewingStand;";
	}

	/**
	 * <p>
	 * Name: playerInventory
	 * </p>
	 */
	public static McObfPair field_175384_v = McMappingDatabase.getSRG("field_175384_v");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiBrewingStand.func_73863_a");

	/**
	 * <p>
	 * Name: BREWING_STAND_GUI_TEXTURES
	 * </p>
	 */
	public static McObfPair field_147014_u = McMappingDatabase.getSRG("field_147014_u");

	/**
	 * <p>
	 * Name: drawGuiContainerBackgroundLayer
	 * </p>
	 * <p>
	 * Desc: [(FII)V]
	 * </p>
	 */
	public static McObfPair func_146976_a = McMappingDatabase.getSRG("GuiBrewingStand.func_146976_a");

	/**
	 * <p>
	 * Name: drawGuiContainerForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146979_b = McMappingDatabase.getSRG("GuiBrewingStand.func_146979_b");

	/**
	 * <p>
	 * Name: tileBrewingStand
	 * </p>
	 */
	public static McObfPair field_147013_v = McMappingDatabase.getSRG("field_147013_v");

	/**
	 * <p>
	 * Name: BUBBLELENGTHS
	 * </p>
	 */
	public static McObfPair field_184857_v = McMappingDatabase.getSRG("field_184857_v");

}

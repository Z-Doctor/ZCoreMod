package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiChest {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmm";
		else
			return "net/minecraft/client/gui/inventory/GuiChest";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmm";
		else
			return "GuiChest";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmm;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiChest;";
	}

	/**
	 * <p>
	 * Name: lowerChestInventory
	 * </p>
	 */
	public static McObfPair field_147015_w = McMappingDatabase.getSRG("field_147015_w");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiChest.func_73863_a");

	/**
	 * <p>
	 * Name: drawGuiContainerBackgroundLayer
	 * </p>
	 * <p>
	 * Desc: [(FII)V]
	 * </p>
	 */
	public static McObfPair func_146976_a = McMappingDatabase.getSRG("GuiChest.func_146976_a");

	/**
	 * <p>
	 * Name: CHEST_GUI_TEXTURE
	 * </p>
	 */
	public static McObfPair field_147017_u = McMappingDatabase.getSRG("field_147017_u");

	/**
	 * <p>
	 * Name: inventoryRows
	 * </p>
	 */
	public static McObfPair field_147018_x = McMappingDatabase.getSRG("field_147018_x");

	/**
	 * <p>
	 * Name: drawGuiContainerForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146979_b = McMappingDatabase.getSRG("GuiChest.func_146979_b");

	/**
	 * <p>
	 * Name: upperChestInventory
	 * </p>
	 */
	public static McObfPair field_147016_v = McMappingDatabase.getSRG("field_147016_v");

}

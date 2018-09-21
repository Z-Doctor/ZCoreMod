package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiScreenHorseInventory {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmw";
		else
			return "net/minecraft/client/gui/inventory/GuiScreenHorseInventory";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmw";
		else
			return "GuiScreenHorseInventory";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmw;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiScreenHorseInventory;";
	}

	/**
	 * <p>
	 * Name: horseInventory
	 * </p>
	 */
	public static McObfPair field_147029_w = McMappingDatabase.getSRG("field_147029_w");

	/**
	 * <p>
	 * Name: drawGuiContainerForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146979_b = McMappingDatabase.getSRG("GuiScreenHorseInventory.func_146979_b");

	/**
	 * <p>
	 * Name: mousePosY
	 * </p>
	 */
	public static McObfPair field_147032_z = McMappingDatabase.getSRG("field_147032_z");

	/**
	 * <p>
	 * Name: mousePosx
	 * </p>
	 */
	public static McObfPair field_147033_y = McMappingDatabase.getSRG("field_147033_y");

	/**
	 * <p>
	 * Name: HORSE_GUI_TEXTURES
	 * </p>
	 */
	public static McObfPair field_147031_u = McMappingDatabase.getSRG("field_147031_u");

	/**
	 * <p>
	 * Name: drawGuiContainerBackgroundLayer
	 * </p>
	 * <p>
	 * Desc: [(FII)V]
	 * </p>
	 */
	public static McObfPair func_146976_a = McMappingDatabase.getSRG("GuiScreenHorseInventory.func_146976_a");

	/**
	 * <p>
	 * Name: playerInventory
	 * </p>
	 */
	public static McObfPair field_147030_v = McMappingDatabase.getSRG("field_147030_v");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiScreenHorseInventory.func_73863_a");

	/**
	 * <p>
	 * Name: horseEntity
	 * </p>
	 */
	public static McObfPair field_147034_x = McMappingDatabase.getSRG("field_147034_x");

}

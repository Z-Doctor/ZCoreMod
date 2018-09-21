package zdoctor.zcoremod.map.minecraft.client.gui.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiFurnace {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmu";
		else
			return "net/minecraft/client/gui/inventory/GuiFurnace";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmu";
		else
			return "GuiFurnace";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmu;";
		else
			return "Lnet/minecraft/client/gui/inventory/GuiFurnace;";
	}

	/**
	 * <p>
	 * Name: drawGuiContainerForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146979_b = McMappingDatabase.getSRG("GuiFurnace.func_146979_b");

	/**
	 * <p>
	 * Name: playerInventory
	 * </p>
	 */
	public static McObfPair field_175383_v = McMappingDatabase.getSRG("field_175383_v");

	/**
	 * <p>
	 * Name: FURNACE_GUI_TEXTURES
	 * </p>
	 */
	public static McObfPair field_147087_u = McMappingDatabase.getSRG("field_147087_u");

	/**
	 * <p>
	 * Name: drawGuiContainerBackgroundLayer
	 * </p>
	 * <p>
	 * Desc: [(FII)V]
	 * </p>
	 */
	public static McObfPair func_146976_a = McMappingDatabase.getSRG("GuiFurnace.func_146976_a");

	/**
	 * <p>
	 * Name: getBurnLeftScaled
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_175382_i = McMappingDatabase.getSRG("GuiFurnace.func_175382_i");

	/**
	 * <p>
	 * Name: getCookProgressScaled
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_175381_h = McMappingDatabase.getSRG("GuiFurnace.func_175381_h");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiFurnace.func_73863_a");

	/**
	 * <p>
	 * Name: tileFurnace
	 * </p>
	 */
	public static McObfPair field_147086_v = McMappingDatabase.getSRG("field_147086_v");

}

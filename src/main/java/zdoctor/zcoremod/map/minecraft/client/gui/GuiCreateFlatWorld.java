package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiCreateFlatWorld {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bks";
		else
			return "net/minecraft/client/gui/GuiCreateFlatWorld";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bks";
		else
			return "GuiCreateFlatWorld";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbks;";
		else
			return "Lnet/minecraft/client/gui/GuiCreateFlatWorld;";
	}

	/**
	 * <p>
	 * Name: hasSelectedLayer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_146382_i = McMappingDatabase.getSRG("GuiCreateFlatWorld.func_146382_i");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146274_d = McMappingDatabase.getSRG("GuiCreateFlatWorld.func_146274_d");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiCreateFlatWorld.func_73866_w_");

	/**
	 * <p>
	 * Name: getPreset
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_146384_e = McMappingDatabase.getSRG("GuiCreateFlatWorld.func_146384_e");

	/**
	 * <p>
	 * Name: flatWorldTitle
	 * </p>
	 */
	public static McObfPair field_146393_h = McMappingDatabase.getSRG("field_146393_h");

	/**
	 * <p>
	 * Name: materialText
	 * </p>
	 */
	public static McObfPair field_146394_i = McMappingDatabase.getSRG("field_146394_i");

	/**
	 * <p>
	 * Name: addLayerButton
	 * </p>
	 */
	public static McObfPair field_146389_t = McMappingDatabase.getSRG("field_146389_t");

	/**
	 * <p>
	 * Name: onLayersChanged
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146375_g = McMappingDatabase.getSRG("GuiCreateFlatWorld.func_146375_g");

	/**
	 * <p>
	 * Name: removeLayerButton
	 * </p>
	 */
	public static McObfPair field_146386_v = McMappingDatabase.getSRG("field_146386_v");

	/**
	 * <p>
	 * Name: generatorInfo
	 * </p>
	 */
	public static McObfPair field_146387_g = McMappingDatabase.getSRG("field_146387_g");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiCreateFlatWorld.func_146284_a");

	/**
	 * <p>
	 * Name: heightText
	 * </p>
	 */
	public static McObfPair field_146391_r = McMappingDatabase.getSRG("field_146391_r");

	/**
	 * <p>
	 * Name: createFlatWorldListSlotGui
	 * </p>
	 */
	public static McObfPair field_146390_s = McMappingDatabase.getSRG("field_146390_s");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiCreateFlatWorld.func_73863_a");

	/**
	 * <p>
	 * Name: createWorldGui
	 * </p>
	 */
	public static McObfPair field_146385_f = McMappingDatabase.getSRG("field_146385_f");

	/**
	 * <p>
	 * Name: editLayerButton
	 * </p>
	 */
	public static McObfPair field_146388_u = McMappingDatabase.getSRG("field_146388_u");

	/**
	 * <p>
	 * Name: setPreset
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_146383_a = McMappingDatabase.getSRG("GuiCreateFlatWorld.func_146383_a");

}

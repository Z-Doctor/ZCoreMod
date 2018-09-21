package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiFlatPresets {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blh";
		else
			return "net/minecraft/client/gui/GuiFlatPresets";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blh";
		else
			return "GuiFlatPresets";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblh;";
		else
			return "Lnet/minecraft/client/gui/GuiFlatPresets;";
	}

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiFlatPresets.func_146281_b");

	/**
	 * <p>
	 * Name: export
	 * </p>
	 */
	public static McObfPair field_146433_u = McMappingDatabase.getSRG("field_146433_u");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiFlatPresets.func_73863_a");

	/**
	 * <p>
	 * Name: listText
	 * </p>
	 */
	public static McObfPair field_146436_r = McMappingDatabase.getSRG("field_146436_r");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiFlatPresets.func_146284_a");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiFlatPresets.func_73869_a");

	/**
	 * <p>
	 * Name: btnSelect
	 * </p>
	 */
	public static McObfPair field_146434_t = McMappingDatabase.getSRG("field_146434_t");

	/**
	 * <p>
	 * Name: presetsTitle
	 * </p>
	 */
	public static McObfPair field_146438_h = McMappingDatabase.getSRG("field_146438_h");

	/**
	 * <p>
	 * Name: parentScreen
	 * </p>
	 */
	public static McObfPair field_146432_g = McMappingDatabase.getSRG("field_146432_g");

	/**
	 * <p>
	 * Name: hasValidSelection
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_146430_p = McMappingDatabase.getSRG("GuiFlatPresets.func_146430_p");

	/**
	 * <p>
	 * Name: presetsShare
	 * </p>
	 */
	public static McObfPair field_146439_i = McMappingDatabase.getSRG("field_146439_i");

	/**
	 * <p>
	 * Name: updateButtonValidity
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146426_g = McMappingDatabase.getSRG("GuiFlatPresets.func_146426_g");

	/**
	 * <p>
	 * Name: FLAT_WORLD_PRESETS
	 * </p>
	 */
	public static McObfPair field_146431_f = McMappingDatabase.getSRG("field_146431_f");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiFlatPresets.func_73866_w_");

	/**
	 * <p>
	 * Name: list
	 * </p>
	 */
	public static McObfPair field_146435_s = McMappingDatabase.getSRG("field_146435_s");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiFlatPresets.func_73876_c");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146274_d = McMappingDatabase.getSRG("GuiFlatPresets.func_146274_d");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiFlatPresets.func_73864_a");

	/**
	 * <p>
	 * Name: registerPreset
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/item/Item;ILnet/minecraft/world/biome/Biome;Ljava/util/List;[Lnet/minecraft/world/gen/FlatLayerInfo;)V]
	 * </p>
	 */
	public static McObfPair func_175354_a = McMappingDatabase.getSRG("GuiFlatPresets.func_175354_a");

	/**
	 * <p>
	 * Name: registerPreset
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/item/Item;Lnet/minecraft/world/biome/Biome;Ljava/util/List;[Lnet/minecraft/world/gen/FlatLayerInfo;)V]
	 * </p>
	 */
	public static McObfPair func_146421_a = McMappingDatabase.getSRG("GuiFlatPresets.func_146421_a");

}

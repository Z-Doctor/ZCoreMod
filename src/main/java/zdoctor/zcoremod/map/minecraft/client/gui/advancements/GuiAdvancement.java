package zdoctor.zcoremod.map.minecraft.client.gui.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiAdvancement {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blz";
		else
			return "net/minecraft/client/gui/advancements/GuiAdvancement";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blz";
		else
			return "GuiAdvancement";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblz;";
		else
			return "Lnet/minecraft/client/gui/advancements/GuiAdvancement;";
	}

	/**
	 * <p>
	 * Name: addGuiAdvancement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/advancements/GuiAdvancement;)V]
	 * </p>
	 */
	public static McObfPair func_191822_a = McMappingDatabase.getSRG("GuiAdvancement.func_191822_a");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_191826_p = McMappingDatabase.getSRG("field_191826_p");

	/**
	 * <p>
	 * Name: children
	 * </p>
	 */
	public static McObfPair field_191835_m = McMappingDatabase.getSRG("field_191835_m");

	/**
	 * <p>
	 * Name: drawHover
	 * </p>
	 * <p>
	 * Desc: [(IIFII)V]
	 * </p>
	 */
	public static McObfPair func_191821_a = McMappingDatabase.getSRG("GuiAdvancement.func_191821_a");

	/**
	 * <p>
	 * Name: getFirstVisibleParent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)Lnet/minecraft/client/gui/advancements/GuiAdvancement;]
	 * </p>
	 */
	public static McObfPair func_191818_a = McMappingDatabase.getSRG("GuiAdvancement.func_191818_a");

	/**
	 * <p>
	 * Name: description
	 * </p>
	 */
	public static McObfPair field_192997_l = McMappingDatabase.getSRG("field_192997_l");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_191837_o = McMappingDatabase.getSRG("field_191837_o");

	/**
	 * <p>
	 * Name: advancement
	 * </p>
	 */
	public static McObfPair field_191829_g = McMappingDatabase.getSRG("field_191829_g");

	/**
	 * <p>
	 * Name: title
	 * </p>
	 */
	public static McObfPair field_191831_i = McMappingDatabase.getSRG("field_191831_i");

	/**
	 * <p>
	 * Name: attachToParent
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_191825_b = McMappingDatabase.getSRG("GuiAdvancement.func_191825_b");

	/**
	 * <p>
	 * Name: isMouseOver
	 * </p>
	 * <p>
	 * Desc: [(IIII)Z]
	 * </p>
	 */
	public static McObfPair func_191816_c = McMappingDatabase.getSRG("GuiAdvancement.func_191816_c");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_191823_d = McMappingDatabase.getSRG("GuiAdvancement.func_191823_d");

	/**
	 * <p>
	 * Name: advancementProgress
	 * </p>
	 */
	public static McObfPair field_191836_n = McMappingDatabase.getSRG("field_191836_n");

	/**
	 * <p>
	 * Name: parent
	 * </p>
	 */
	public static McObfPair field_191834_l = McMappingDatabase.getSRG("field_191834_l");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_191832_j = McMappingDatabase.getSRG("field_191832_j");

	/**
	 * <p>
	 * Name: displayInfo
	 * </p>
	 */
	public static McObfPair field_191830_h = McMappingDatabase.getSRG("field_191830_h");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_191820_c = McMappingDatabase.getSRG("GuiAdvancement.func_191820_c");

	/**
	 * <p>
	 * Name: renderRepeating
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIII)V]
	 * </p>
	 */
	public static McObfPair func_192993_a = McMappingDatabase.getSRG("GuiAdvancement.func_192993_a");

	/**
	 * <p>
	 * Name: drawConnectivity
	 * </p>
	 * <p>
	 * Desc: [(IIZ)V]
	 * </p>
	 */
	public static McObfPair func_191819_a = McMappingDatabase.getSRG("GuiAdvancement.func_191819_a");

	/**
	 * <p>
	 * Name: getAdvancementProgress
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/AdvancementProgress;)V]
	 * </p>
	 */
	public static McObfPair func_191824_a = McMappingDatabase.getSRG("GuiAdvancement.func_191824_a");

	/**
	 * <p>
	 * Name: WIDGETS
	 * </p>
	 */
	public static McObfPair field_191827_a = McMappingDatabase.getSRG("field_191827_a");

	/**
	 * <p>
	 * Name: guiAdvancementTab
	 * </p>
	 */
	public static McObfPair field_191828_f = McMappingDatabase.getSRG("field_191828_f");

	/**
	 * <p>
	 * Name: minecraft
	 * </p>
	 */
	public static McObfPair field_191833_k = McMappingDatabase.getSRG("field_191833_k");

	/**
	 * <p>
	 * Name: render9Sprite
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIIII)V]
	 * </p>
	 */
	public static McObfPair func_192994_a = McMappingDatabase.getSRG("GuiAdvancement.func_192994_a");

	/**
	 * <p>
	 * Name: findOptimalLines
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_192995_a = McMappingDatabase.getSRG("GuiAdvancement.func_192995_a");

	/**
	 * <p>
	 * Name: draw
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_191817_b = McMappingDatabase.getSRG("GuiAdvancement.func_191817_b");

	/**
	 * <p>
	 * Name: PATTERN
	 * </p>
	 */
	public static McObfPair field_192996_f = McMappingDatabase.getSRG("field_192996_f");

}

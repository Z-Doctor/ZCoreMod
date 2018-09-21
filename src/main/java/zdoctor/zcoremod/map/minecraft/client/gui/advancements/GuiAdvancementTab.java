package zdoctor.zcoremod.map.minecraft.client.gui.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiAdvancementTab {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blx";
		else
			return "net/minecraft/client/gui/advancements/GuiAdvancementTab";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blx";
		else
			return "GuiAdvancementTab";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblx;";
		else
			return "Lnet/minecraft/client/gui/advancements/GuiAdvancementTab;";
	}

	/**
	 * <p>
	 * Name: isMouseOver
	 * </p>
	 * <p>
	 * Desc: [(IIII)Z]
	 * </p>
	 */
	public static McObfPair func_191793_c = McMappingDatabase.getSRG("GuiAdvancementTab.func_191793_c");

	/**
	 * <p>
	 * Name: drawTab
	 * </p>
	 * <p>
	 * Desc: [(IIZ)V]
	 * </p>
	 */
	public static McObfPair func_191798_a = McMappingDatabase.getSRG("GuiAdvancementTab.func_191798_a");

	/**
	 * <p>
	 * Name: centered
	 * </p>
	 */
	public static McObfPair field_192992_s = McMappingDatabase.getSRG("field_192992_s");

	/**
	 * <p>
	 * Name: minY
	 * </p>
	 */
	public static McObfPair field_193940_r = McMappingDatabase.getSRG("field_193940_r");

	/**
	 * <p>
	 * Name: minecraft
	 * </p>
	 */
	public static McObfPair field_191802_a = McMappingDatabase.getSRG("field_191802_a");

	/**
	 * <p>
	 * Name: getAdvancementGui
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)Lnet/minecraft/client/gui/advancements/GuiAdvancement;]
	 * </p>
	 */
	public static McObfPair func_191794_b = McMappingDatabase.getSRG("GuiAdvancementTab.func_191794_b");

	/**
	 * <p>
	 * Name: scrollY
	 * </p>
	 */
	public static McObfPair field_191812_o = McMappingDatabase.getSRG("field_191812_o");

	/**
	 * <p>
	 * Name: icon
	 * </p>
	 */
	public static McObfPair field_191807_j = McMappingDatabase.getSRG("field_191807_j");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_191803_f = McMappingDatabase.getSRG("field_191803_f");

	/**
	 * <p>
	 * Name: drawToolTips
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_192991_a = McMappingDatabase.getSRG("GuiAdvancementTab.func_192991_a");

	/**
	 * <p>
	 * Name: index
	 * </p>
	 */
	public static McObfPair field_191804_g = McMappingDatabase.getSRG("field_191804_g");

	/**
	 * <p>
	 * Name: display
	 * </p>
	 */
	public static McObfPair field_191806_i = McMappingDatabase.getSRG("field_191806_i");

	/**
	 * <p>
	 * Name: advancement
	 * </p>
	 */
	public static McObfPair field_191805_h = McMappingDatabase.getSRG("field_191805_h");

	/**
	 * <p>
	 * Name: getTitle
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_191795_d = McMappingDatabase.getSRG("GuiAdvancementTab.func_191795_d");

	/**
	 * <p>
	 * Name: fade
	 * </p>
	 */
	public static McObfPair field_191815_r = McMappingDatabase.getSRG("field_191815_r");

	/**
	 * <p>
	 * Name: minX
	 * </p>
	 */
	public static McObfPair field_193939_q = McMappingDatabase.getSRG("field_193939_q");

	/**
	 * <p>
	 * Name: getAdvancement
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/advancements/Advancement;]
	 * </p>
	 */
	public static McObfPair func_193935_c = McMappingDatabase.getSRG("GuiAdvancementTab.func_193935_c");

	/**
	 * <p>
	 * Name: maxY
	 * </p>
	 */
	public static McObfPair field_191814_q = McMappingDatabase.getSRG("field_191814_q");

	/**
	 * <p>
	 * Name: drawIcon
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/client/renderer/RenderItem;)V]
	 * </p>
	 */
	public static McObfPair func_191796_a = McMappingDatabase.getSRG("GuiAdvancementTab.func_191796_a");

	/**
	 * <p>
	 * Name: screen
	 * </p>
	 */
	public static McObfPair field_193938_f = McMappingDatabase.getSRG("field_193938_f");

	/**
	 * <p>
	 * Name: scrollX
	 * </p>
	 */
	public static McObfPair field_191811_n = McMappingDatabase.getSRG("field_191811_n");

	/**
	 * <p>
	 * Name: guis
	 * </p>
	 */
	public static McObfPair field_191810_m = McMappingDatabase.getSRG("field_191810_m");

	/**
	 * <p>
	 * Name: getScreen
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/advancements/GuiScreenAdvancements;]
	 * </p>
	 */
	public static McObfPair func_193934_g = McMappingDatabase.getSRG("GuiAdvancementTab.func_193934_g");

	/**
	 * <p>
	 * Name: root
	 * </p>
	 */
	public static McObfPair field_191809_l = McMappingDatabase.getSRG("field_191809_l");

	/**
	 * <p>
	 * Name: maxX
	 * </p>
	 */
	public static McObfPair field_191813_p = McMappingDatabase.getSRG("field_191813_p");

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/gui/advancements/GuiScreenAdvancements;ILnet/minecraft/advancements/Advancement;)Lnet/minecraft/client/gui/advancements/GuiAdvancementTab;]
	 * </p>
	 */
	public static McObfPair func_193936_a = McMappingDatabase.getSRG("GuiAdvancementTab.func_193936_a");

	/**
	 * <p>
	 * Name: drawContents
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_191799_a = McMappingDatabase.getSRG("GuiAdvancementTab.func_191799_a");

	/**
	 * <p>
	 * Name: addAdvancement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_191800_a = McMappingDatabase.getSRG("GuiAdvancementTab.func_191800_a");

	/**
	 * <p>
	 * Name: addGuiAdvancement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/advancements/GuiAdvancement;Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_193937_a = McMappingDatabase.getSRG("GuiAdvancementTab.func_193937_a");

	/**
	 * <p>
	 * Name: title
	 * </p>
	 */
	public static McObfPair field_191808_k = McMappingDatabase.getSRG("field_191808_k");

	/**
	 * <p>
	 * Name: scroll
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_191797_b = McMappingDatabase.getSRG("GuiAdvancementTab.func_191797_b");

}

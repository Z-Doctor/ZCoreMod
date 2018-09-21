package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiSlot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjr";
		else
			return "net/minecraft/client/gui/GuiSlot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjr";
		else
			return "GuiSlot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjr;";
		else
			return "Lnet/minecraft/client/gui/GuiSlot;";
	}

	/**
	 * <p>
	 * Name: overlayBackground
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_148136_c = McMappingDatabase.getSRG("GuiSlot.func_148136_c");

	/**
	 * <p>
	 * Name: setShowSelectionBox
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_193651_b = McMappingDatabase.getSRG("GuiSlot.func_193651_b");

	/**
	 * <p>
	 * Name: drawListHeader
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/client/renderer/Tessellator;)V]
	 * </p>
	 */
	public static McObfPair func_148129_a = McMappingDatabase.getSRG("GuiSlot.func_148129_a");

	/**
	 * <p>
	 * Name: headerPadding
	 * </p>
	 */
	public static McObfPair field_148160_j = McMappingDatabase.getSRG("field_148160_j");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_148147_a = McMappingDatabase.getSRG("GuiSlot.func_148147_a");

	/**
	 * <p>
	 * Name: getListWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148139_c = McMappingDatabase.getSRG("GuiSlot.func_148139_c");

	/**
	 * <p>
	 * Name: getAmountScrolled
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148148_g = McMappingDatabase.getSRG("GuiSlot.func_148148_g");

	/**
	 * <p>
	 * Name: bottom
	 * </p>
	 */
	public static McObfPair field_148154_c = McMappingDatabase.getSRG("field_148154_c");

	/**
	 * <p>
	 * Name: setEnabled
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_148143_b = McMappingDatabase.getSRG("GuiSlot.func_148143_b");

	/**
	 * <p>
	 * Name: drawSelectionBox
	 * </p>
	 * <p>
	 * Desc: [(IIIIF)V]
	 * </p>
	 */
	public static McObfPair func_192638_a = McMappingDatabase.getSRG("GuiSlot.func_192638_a");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_148161_k = McMappingDatabase.getSRG("field_148161_k");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_148158_l = McMappingDatabase.getSRG("field_148158_l");

	/**
	 * <p>
	 * Name: drawBackground
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148123_a = McMappingDatabase.getSRG("GuiSlot.func_148123_a");

	/**
	 * <p>
	 * Name: scrollDownButtonID
	 * </p>
	 */
	public static McObfPair field_148156_n = McMappingDatabase.getSRG("field_148156_n");

	/**
	 * <p>
	 * Name: updateItemPos
	 * </p>
	 * <p>
	 * Desc: [(IIIF)V]
	 * </p>
	 */
	public static McObfPair func_192639_a = McMappingDatabase.getSRG("GuiSlot.func_192639_a");

	/**
	 * <p>
	 * Name: scrollMultiplier
	 * </p>
	 */
	public static McObfPair field_148170_p = McMappingDatabase.getSRG("field_148170_p");

	/**
	 * <p>
	 * Name: scrollBy
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_148145_f = McMappingDatabase.getSRG("GuiSlot.func_148145_f");

	/**
	 * <p>
	 * Name: renderDecorations
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_148142_b = McMappingDatabase.getSRG("GuiSlot.func_148142_b");

	/**
	 * <p>
	 * Name: getSlotHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148146_j = McMappingDatabase.getSRG("GuiSlot.func_148146_j");

	/**
	 * <p>
	 * Name: drawSlot
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIF)V]
	 * </p>
	 */
	public static McObfPair func_192637_a = McMappingDatabase.getSRG("GuiSlot.func_192637_a");

	/**
	 * <p>
	 * Name: hasListHeader
	 * </p>
	 */
	public static McObfPair field_148165_u = McMappingDatabase.getSRG("field_148165_u");

	/**
	 * <p>
	 * Name: centerListVertically
	 * </p>
	 */
	public static McObfPair field_148163_i = McMappingDatabase.getSRG("field_148163_i");

	/**
	 * <p>
	 * Name: bindAmountScrolled
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148121_k = McMappingDatabase.getSRG("GuiSlot.func_148121_k");

	/**
	 * <p>
	 * Name: getScrollBarX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148137_d = McMappingDatabase.getSRG("GuiSlot.func_148137_d");

	/**
	 * <p>
	 * Name: elementClicked
	 * </p>
	 * <p>
	 * Desc: [(IZII)V]
	 * </p>
	 */
	public static McObfPair func_148144_a = McMappingDatabase.getSRG("GuiSlot.func_148144_a");

	/**
	 * <p>
	 * Name: setSlotXBoundsFromLeft
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_148140_g = McMappingDatabase.getSRG("GuiSlot.func_148140_g");

	/**
	 * <p>
	 * Name: slotHeight
	 * </p>
	 */
	public static McObfPair field_148149_f = McMappingDatabase.getSRG("field_148149_f");

	/**
	 * <p>
	 * Name: enabled
	 * </p>
	 */
	public static McObfPair field_148164_v = McMappingDatabase.getSRG("field_148164_v");

	/**
	 * <p>
	 * Name: isMouseYWithinSlotBounds
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_148141_e = McMappingDatabase.getSRG("GuiSlot.func_148141_e");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_148155_a = McMappingDatabase.getSRG("field_148155_a");

	/**
	 * <p>
	 * Name: mouseX
	 * </p>
	 */
	public static McObfPair field_148150_g = McMappingDatabase.getSRG("field_148150_g");

	/**
	 * <p>
	 * Name: registerScrollButtons
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_148134_d = McMappingDatabase.getSRG("GuiSlot.func_148134_d");

	/**
	 * <p>
	 * Name: getContentHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148138_e = McMappingDatabase.getSRG("GuiSlot.func_148138_e");

	/**
	 * <p>
	 * Name: getSlotIndexFromScreenCoords
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_148124_c = McMappingDatabase.getSRG("GuiSlot.func_148124_c");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_148128_a = McMappingDatabase.getSRG("GuiSlot.func_148128_a");

	/**
	 * <p>
	 * Name: left
	 * </p>
	 */
	public static McObfPair field_148152_e = McMappingDatabase.getSRG("field_148152_e");

	/**
	 * <p>
	 * Name: visible
	 * </p>
	 */
	public static McObfPair field_178041_q = McMappingDatabase.getSRG("field_178041_q");

	/**
	 * <p>
	 * Name: right
	 * </p>
	 */
	public static McObfPair field_148151_d = McMappingDatabase.getSRG("field_148151_d");

	/**
	 * <p>
	 * Name: clickedHeader
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_148132_a = McMappingDatabase.getSRG("GuiSlot.func_148132_a");

	/**
	 * <p>
	 * Name: setDimensions
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_148122_a = McMappingDatabase.getSRG("GuiSlot.func_148122_a");

	/**
	 * <p>
	 * Name: selectedElement
	 * </p>
	 */
	public static McObfPair field_148168_r = McMappingDatabase.getSRG("field_148168_r");

	/**
	 * <p>
	 * Name: amountScrolled
	 * </p>
	 */
	public static McObfPair field_148169_q = McMappingDatabase.getSRG("field_148169_q");

	/**
	 * <p>
	 * Name: setHasListHeader
	 * </p>
	 * <p>
	 * Desc: [(ZI)V]
	 * </p>
	 */
	public static McObfPair func_148133_a = McMappingDatabase.getSRG("GuiSlot.func_148133_a");

	/**
	 * <p>
	 * Name: scrollUpButtonID
	 * </p>
	 */
	public static McObfPair field_148159_m = McMappingDatabase.getSRG("field_148159_m");

	/**
	 * <p>
	 * Name: lastClicked
	 * </p>
	 */
	public static McObfPair field_148167_s = McMappingDatabase.getSRG("field_148167_s");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148127_b = McMappingDatabase.getSRG("GuiSlot.func_148127_b");

	/**
	 * <p>
	 * Name: isSelected
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_148131_a = McMappingDatabase.getSRG("GuiSlot.func_148131_a");

	/**
	 * <p>
	 * Name: getMaxScroll
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148135_f = McMappingDatabase.getSRG("GuiSlot.func_148135_f");

	/**
	 * <p>
	 * Name: initialClickY
	 * </p>
	 */
	public static McObfPair field_148157_o = McMappingDatabase.getSRG("field_148157_o");

	/**
	 * <p>
	 * Name: mouseY
	 * </p>
	 */
	public static McObfPair field_148162_h = McMappingDatabase.getSRG("field_148162_h");

	/**
	 * <p>
	 * Name: showSelectionBox
	 * </p>
	 */
	public static McObfPair field_148166_t = McMappingDatabase.getSRG("field_148166_t");

	/**
	 * <p>
	 * Name: getEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148125_i = McMappingDatabase.getSRG("GuiSlot.func_148125_i");

	/**
	 * <p>
	 * Name: top
	 * </p>
	 */
	public static McObfPair field_148153_b = McMappingDatabase.getSRG("field_148153_b");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178039_p = McMappingDatabase.getSRG("GuiSlot.func_178039_p");

}

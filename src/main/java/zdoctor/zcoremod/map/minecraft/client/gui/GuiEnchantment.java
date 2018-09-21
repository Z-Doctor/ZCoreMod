package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiEnchantment {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmt";
		else
			return "net/minecraft/client/gui/GuiEnchantment";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmt";
		else
			return "GuiEnchantment";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmt;";
		else
			return "Lnet/minecraft/client/gui/GuiEnchantment;";
	}

	/**
	 * <p>
	 * Name: playerInventory
	 * </p>
	 */
	public static McObfPair field_175379_F = McMappingDatabase.getSRG("field_175379_F");

	/**
	 * <p>
	 * Name: ticks
	 * </p>
	 */
	public static McObfPair field_147073_u = McMappingDatabase.getSRG("field_147073_u");

	/**
	 * <p>
	 * Name: ENCHANTMENT_TABLE_GUI_TEXTURE
	 * </p>
	 */
	public static McObfPair field_147078_C = McMappingDatabase.getSRG("field_147078_C");

	/**
	 * <p>
	 * Name: ENCHANTMENT_TABLE_BOOK_TEXTURE
	 * </p>
	 */
	public static McObfPair field_147070_D = McMappingDatabase.getSRG("field_147070_D");

	/**
	 * <p>
	 * Name: oOpen
	 * </p>
	 */
	public static McObfPair field_147076_A = McMappingDatabase.getSRG("field_147076_A");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiEnchantment.func_73876_c");

	/**
	 * <p>
	 * Name: open
	 * </p>
	 */
	public static McObfPair field_147080_z = McMappingDatabase.getSRG("field_147080_z");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiEnchantment.func_73864_a");

	/**
	 * <p>
	 * Name: flipA
	 * </p>
	 */
	public static McObfPair field_147081_y = McMappingDatabase.getSRG("field_147081_y");

	/**
	 * <p>
	 * Name: drawGuiContainerBackgroundLayer
	 * </p>
	 * <p>
	 * Desc: [(FII)V]
	 * </p>
	 */
	public static McObfPair func_146976_a = McMappingDatabase.getSRG("GuiEnchantment.func_146976_a");

	/**
	 * <p>
	 * Name: flip
	 * </p>
	 */
	public static McObfPair field_147071_v = McMappingDatabase.getSRG("field_147071_v");

	/**
	 * <p>
	 * Name: last
	 * </p>
	 */
	public static McObfPair field_147077_B = McMappingDatabase.getSRG("field_147077_B");

	/**
	 * <p>
	 * Name: tickBook
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147068_g = McMappingDatabase.getSRG("GuiEnchantment.func_147068_g");

	/**
	 * <p>
	 * Name: MODEL_BOOK
	 * </p>
	 */
	public static McObfPair field_147072_E = McMappingDatabase.getSRG("field_147072_E");

	/**
	 * <p>
	 * Name: flipT
	 * </p>
	 */
	public static McObfPair field_147082_x = McMappingDatabase.getSRG("field_147082_x");

	/**
	 * <p>
	 * Name: nameable
	 * </p>
	 */
	public static McObfPair field_175380_I = McMappingDatabase.getSRG("field_175380_I");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiEnchantment.func_73863_a");

	/**
	 * <p>
	 * Name: drawGuiContainerForegroundLayer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146979_b = McMappingDatabase.getSRG("GuiEnchantment.func_146979_b");

	/**
	 * <p>
	 * Name: oFlip
	 * </p>
	 */
	public static McObfPair field_147069_w = McMappingDatabase.getSRG("field_147069_w");

	/**
	 * <p>
	 * Name: container
	 * </p>
	 */
	public static McObfPair field_147075_G = McMappingDatabase.getSRG("field_147075_G");

	/**
	 * <p>
	 * Name: random
	 * </p>
	 */
	public static McObfPair field_147074_F = McMappingDatabase.getSRG("field_147074_F");

}

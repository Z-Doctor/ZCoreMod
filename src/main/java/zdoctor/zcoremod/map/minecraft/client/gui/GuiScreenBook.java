package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiScreenBook {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmj";
		else
			return "net/minecraft/client/gui/GuiScreenBook";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmj";
		else
			return "GuiScreenBook";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmj;";
		else
			return "Lnet/minecraft/client/gui/GuiScreenBook;";
	}

	/**
	 * <p>
	 * Name: onGuiClosed
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146281_b = McMappingDatabase.getSRG("GuiScreenBook.func_146281_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_146473_a = McMappingDatabase.getSRG("field_146473_a");

	/**
	 * <p>
	 * Name: cachedPage
	 * </p>
	 */
	public static McObfPair field_175387_B = McMappingDatabase.getSRG("field_175387_B");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiScreenBook.func_73864_a");

	/**
	 * <p>
	 * Name: buttonFinalize
	 * </p>
	 */
	public static McObfPair field_146467_E = McMappingDatabase.getSRG("field_146467_E");

	/**
	 * <p>
	 * Name: bookTitle
	 * </p>
	 */
	public static McObfPair field_146482_z = McMappingDatabase.getSRG("field_146482_z");

	/**
	 * <p>
	 * Name: buttonNextPage
	 * </p>
	 */
	public static McObfPair field_146470_A = McMappingDatabase.getSRG("field_146470_A");

	/**
	 * <p>
	 * Name: book
	 * </p>
	 */
	public static McObfPair field_146474_h = McMappingDatabase.getSRG("field_146474_h");

	/**
	 * <p>
	 * Name: BOOK_GUI_TEXTURES
	 * </p>
	 */
	public static McObfPair field_146466_f = McMappingDatabase.getSRG("field_146466_f");

	/**
	 * <p>
	 * Name: bookImageWidth
	 * </p>
	 */
	public static McObfPair field_146478_u = McMappingDatabase.getSRG("field_146478_u");

	/**
	 * <p>
	 * Name: editingPlayer
	 * </p>
	 */
	public static McObfPair field_146468_g = McMappingDatabase.getSRG("field_146468_g");

	/**
	 * <p>
	 * Name: addNewPage
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146461_i = McMappingDatabase.getSRG("GuiScreenBook.func_146461_i");

	/**
	 * <p>
	 * Name: pageSetCurrent
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_146457_a = McMappingDatabase.getSRG("GuiScreenBook.func_146457_a");

	/**
	 * <p>
	 * Name: currPage
	 * </p>
	 */
	public static McObfPair field_146484_x = McMappingDatabase.getSRG("field_146484_x");

	/**
	 * <p>
	 * Name: updateScreen
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73876_c = McMappingDatabase.getSRG("GuiScreenBook.func_73876_c");

	/**
	 * <p>
	 * Name: cachedComponents
	 * </p>
	 */
	public static McObfPair field_175386_A = McMappingDatabase.getSRG("field_175386_A");

	/**
	 * <p>
	 * Name: updateCount
	 * </p>
	 */
	public static McObfPair field_146479_t = McMappingDatabase.getSRG("field_146479_t");

	/**
	 * <p>
	 * Name: buttonCancel
	 * </p>
	 */
	public static McObfPair field_146469_F = McMappingDatabase.getSRG("field_146469_F");

	/**
	 * <p>
	 * Name: getClickedComponentAt
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_175385_b = McMappingDatabase.getSRG("GuiScreenBook.func_175385_b");

	/**
	 * <p>
	 * Name: buttonPreviousPage
	 * </p>
	 */
	public static McObfPair field_146471_B = McMappingDatabase.getSRG("field_146471_B");

	/**
	 * <p>
	 * Name: buttonDone
	 * </p>
	 */
	public static McObfPair field_146472_C = McMappingDatabase.getSRG("field_146472_C");

	/**
	 * <p>
	 * Name: sendBookToServer
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_146462_a = McMappingDatabase.getSRG("GuiScreenBook.func_146462_a");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiScreenBook.func_146284_a");

	/**
	 * <p>
	 * Name: pageInsertIntoCurrent
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_146459_b = McMappingDatabase.getSRG("GuiScreenBook.func_146459_b");

	/**
	 * <p>
	 * Name: bookIsUnsigned
	 * </p>
	 */
	public static McObfPair field_146475_i = McMappingDatabase.getSRG("field_146475_i");

	/**
	 * <p>
	 * Name: buttonSign
	 * </p>
	 */
	public static McObfPair field_146465_D = McMappingDatabase.getSRG("field_146465_D");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiScreenBook.func_73869_a");

	/**
	 * <p>
	 * Name: handleComponentClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)Z]
	 * </p>
	 */
	public static McObfPair func_175276_a = McMappingDatabase.getSRG("GuiScreenBook.func_175276_a");

	/**
	 * <p>
	 * Name: bookImageHeight
	 * </p>
	 */
	public static McObfPair field_146477_v = McMappingDatabase.getSRG("field_146477_v");

	/**
	 * <p>
	 * Name: keyTypedInTitle
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_146460_c = McMappingDatabase.getSRG("GuiScreenBook.func_146460_c");

	/**
	 * <p>
	 * Name: updateButtons
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146464_h = McMappingDatabase.getSRG("GuiScreenBook.func_146464_h");

	/**
	 * <p>
	 * Name: keyTypedInBook
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_146463_b = McMappingDatabase.getSRG("GuiScreenBook.func_146463_b");

	/**
	 * <p>
	 * Name: bookTotalPages
	 * </p>
	 */
	public static McObfPair field_146476_w = McMappingDatabase.getSRG("field_146476_w");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiScreenBook.func_73866_w_");

	/**
	 * <p>
	 * Name: pageGetCurrent
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_146456_p = McMappingDatabase.getSRG("GuiScreenBook.func_146456_p");

	/**
	 * <p>
	 * Name: bookGettingSigned
	 * </p>
	 */
	public static McObfPair field_146480_s = McMappingDatabase.getSRG("field_146480_s");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiScreenBook.func_73863_a");

	/**
	 * <p>
	 * Name: bookIsModified
	 * </p>
	 */
	public static McObfPair field_146481_r = McMappingDatabase.getSRG("field_146481_r");

	/**
	 * <p>
	 * Name: bookPages
	 * </p>
	 */
	public static McObfPair field_146483_y = McMappingDatabase.getSRG("field_146483_y");

}

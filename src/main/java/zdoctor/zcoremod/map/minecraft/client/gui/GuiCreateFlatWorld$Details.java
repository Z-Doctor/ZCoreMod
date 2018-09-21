package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiCreateFlatWorld$Details {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bks$a";
		else
			return "net/minecraft/client/gui/GuiCreateFlatWorld$Details";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bks$a";
		else
			return "GuiCreateFlatWorld$Details";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbks$a;";
		else
			return "Lnet/minecraft/client/gui/GuiCreateFlatWorld$Details;";
	}

	/**
	 * <p>
	 * Name: drawSlot
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIF)V]
	 * </p>
	 */
	public static McObfPair func_192637_a = McMappingDatabase.getSRG("GuiCreateFlatWorld$Details.func_192637_a");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148127_b = McMappingDatabase.getSRG("GuiCreateFlatWorld$Details.func_148127_b");

	/**
	 * <p>
	 * Name: elementClicked
	 * </p>
	 * <p>
	 * Desc: [(IZII)V]
	 * </p>
	 */
	public static McObfPair func_148144_a = McMappingDatabase.getSRG("GuiCreateFlatWorld$Details.func_148144_a");

	/**
	 * <p>
	 * Name: drawItem
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_148225_a = McMappingDatabase.getSRG("GuiCreateFlatWorld$Details.func_148225_a");

	/**
	 * <p>
	 * Name: drawItemBackground
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_148224_c = McMappingDatabase.getSRG("GuiCreateFlatWorld$Details.func_148224_c");

	/**
	 * <p>
	 * Name: drawBackground
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148123_a = McMappingDatabase.getSRG("GuiCreateFlatWorld$Details.func_148123_a");

	/**
	 * <p>
	 * Name: selectedLayer
	 * </p>
	 */
	public static McObfPair field_148228_k = McMappingDatabase.getSRG("field_148228_k");

	/**
	 * <p>
	 * Name: getScrollBarX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148137_d = McMappingDatabase.getSRG("GuiCreateFlatWorld$Details.func_148137_d");

	/**
	 * <p>
	 * Name: drawItemBackground
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_148226_e = McMappingDatabase.getSRG("GuiCreateFlatWorld$Details.func_148226_e");

	/**
	 * <p>
	 * Name: isSelected
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_148131_a = McMappingDatabase.getSRG("GuiCreateFlatWorld$Details.func_148131_a");

}

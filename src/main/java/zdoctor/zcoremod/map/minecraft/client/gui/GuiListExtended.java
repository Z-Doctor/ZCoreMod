package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiListExtended {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjm";
		else
			return "net/minecraft/client/gui/GuiListExtended";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjm";
		else
			return "GuiListExtended";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjm;";
		else
			return "Lnet/minecraft/client/gui/GuiListExtended;";
	}

	/**
	 * <p>
	 * Name: elementClicked
	 * </p>
	 * <p>
	 * Desc: [(IZII)V]
	 * </p>
	 */
	public static McObfPair func_148144_a = McMappingDatabase.getSRG("GuiListExtended.func_148144_a");

	/**
	 * <p>
	 * Name: isSelected
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_148131_a = McMappingDatabase.getSRG("GuiListExtended.func_148131_a");

	/**
	 * <p>
	 * Name: getListEntry
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/gui/GuiListExtended$IGuiListEntry;]
	 * </p>
	 */
	public static McObfPair func_148180_b = McMappingDatabase.getSRG("GuiListExtended.func_148180_b");

	/**
	 * <p>
	 * Name: drawSlot
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIF)V]
	 * </p>
	 */
	public static McObfPair func_192637_a = McMappingDatabase.getSRG("GuiListExtended.func_192637_a");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)Z]
	 * </p>
	 */
	public static McObfPair func_148179_a = McMappingDatabase.getSRG("GuiListExtended.func_148179_a");

	/**
	 * <p>
	 * Name: drawBackground
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148123_a = McMappingDatabase.getSRG("GuiListExtended.func_148123_a");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(III)Z]
	 * </p>
	 */
	public static McObfPair func_148181_b = McMappingDatabase.getSRG("GuiListExtended.func_148181_b");

	/**
	 * <p>
	 * Name: updateItemPos
	 * </p>
	 * <p>
	 * Desc: [(IIIF)V]
	 * </p>
	 */
	public static McObfPair func_192639_a = McMappingDatabase.getSRG("GuiListExtended.func_192639_a");

}

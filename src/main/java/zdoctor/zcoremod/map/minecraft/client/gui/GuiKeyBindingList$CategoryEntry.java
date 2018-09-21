package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiKeyBindingList$CategoryEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmd$a";
		else
			return "net/minecraft/client/gui/GuiKeyBindingList$CategoryEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmd$a";
		else
			return "GuiKeyBindingList$CategoryEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmd$a;";
		else
			return "Lnet/minecraft/client/gui/GuiKeyBindingList$CategoryEntry;";
	}

	/**
	 * <p>
	 * Name: mousePressed
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)Z]
	 * </p>
	 */
	public static McObfPair func_148278_a = McMappingDatabase.getSRG("GuiKeyBindingList$CategoryEntry.func_148278_a");

	/**
	 * <p>
	 * Name: drawEntry
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIIZF)V]
	 * </p>
	 */
	public static McObfPair func_192634_a = McMappingDatabase.getSRG("GuiKeyBindingList$CategoryEntry.func_192634_a");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_148277_b = McMappingDatabase.getSRG("GuiKeyBindingList$CategoryEntry.func_148277_b");

	/**
	 * <p>
	 * Name: labelWidth
	 * </p>
	 */
	public static McObfPair field_148286_c = McMappingDatabase.getSRG("field_148286_c");

	/**
	 * <p>
	 * Name: labelText
	 * </p>
	 */
	public static McObfPair field_148285_b = McMappingDatabase.getSRG("field_148285_b");

	/**
	 * <p>
	 * Name: updatePosition
	 * </p>
	 * <p>
	 * Desc: [(IIIF)V]
	 * </p>
	 */
	public static McObfPair func_192633_a = McMappingDatabase.getSRG("GuiKeyBindingList$CategoryEntry.func_192633_a");

}

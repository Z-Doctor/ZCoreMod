package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiKeyBindingList$KeyEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmd$b";
		else
			return "net/minecraft/client/gui/GuiKeyBindingList$KeyEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bmd$b";
		else
			return "GuiKeyBindingList$KeyEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbmd$b;";
		else
			return "Lnet/minecraft/client/gui/GuiKeyBindingList$KeyEntry;";
	}

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_148277_b = McMappingDatabase.getSRG("GuiKeyBindingList$KeyEntry.func_148277_b");

	/**
	 * <p>
	 * Name: keyDesc
	 * </p>
	 */
	public static McObfPair field_148283_c = McMappingDatabase.getSRG("field_148283_c");

	/**
	 * <p>
	 * Name: btnReset
	 * </p>
	 */
	public static McObfPair field_148281_e = McMappingDatabase.getSRG("field_148281_e");

	/**
	 * <p>
	 * Name: keybinding
	 * </p>
	 */
	public static McObfPair field_148282_b = McMappingDatabase.getSRG("field_148282_b");

	/**
	 * <p>
	 * Name: drawEntry
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIIZF)V]
	 * </p>
	 */
	public static McObfPair func_192634_a = McMappingDatabase.getSRG("GuiKeyBindingList$KeyEntry.func_192634_a");

	/**
	 * <p>
	 * Name: mousePressed
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)Z]
	 * </p>
	 */
	public static McObfPair func_148278_a = McMappingDatabase.getSRG("GuiKeyBindingList$KeyEntry.func_148278_a");

	/**
	 * <p>
	 * Name: btnChangeKeyBinding
	 * </p>
	 */
	public static McObfPair field_148280_d = McMappingDatabase.getSRG("field_148280_d");

	/**
	 * <p>
	 * Name: updatePosition
	 * </p>
	 * <p>
	 * Desc: [(IIIF)V]
	 * </p>
	 */
	public static McObfPair func_192633_a = McMappingDatabase.getSRG("GuiKeyBindingList$KeyEntry.func_192633_a");

}

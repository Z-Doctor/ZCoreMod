package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiPageButtonList$GuiEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjp$d";
		else
			return "net/minecraft/client/gui/GuiPageButtonList$GuiEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjp$d";
		else
			return "GuiPageButtonList$GuiEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjp$d;";
		else
			return "Lnet/minecraft/client/gui/GuiPageButtonList$GuiEntry;";
	}

	/**
	 * <p>
	 * Name: drawEntry
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIIZF)V]
	 * </p>
	 */
	public static McObfPair func_192634_a = McMappingDatabase.getSRG("GuiPageButtonList$GuiEntry.func_192634_a");

	/**
	 * <p>
	 * Name: releaseButton
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;III)V]
	 * </p>
	 */
	public static McObfPair func_178019_b = McMappingDatabase.getSRG("GuiPageButtonList$GuiEntry.func_178019_b");

	/**
	 * <p>
	 * Name: client
	 * </p>
	 */
	public static McObfPair field_178031_a = McMappingDatabase.getSRG("field_178031_a");

	/**
	 * <p>
	 * Name: clickComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/Gui;III)Z]
	 * </p>
	 */
	public static McObfPair func_178026_a = McMappingDatabase.getSRG("GuiPageButtonList$GuiEntry.func_178026_a");

	/**
	 * <p>
	 * Name: clickButton
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;III)Z]
	 * </p>
	 */
	public static McObfPair func_178023_a = McMappingDatabase.getSRG("GuiPageButtonList$GuiEntry.func_178023_a");

	/**
	 * <p>
	 * Name: renderTextField
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiTextField;IZ)V]
	 * </p>
	 */
	public static McObfPair func_178027_a = McMappingDatabase.getSRG("GuiPageButtonList$GuiEntry.func_178027_a");

	/**
	 * <p>
	 * Name: focusedControl
	 * </p>
	 */
	public static McObfPair field_178028_d = McMappingDatabase.getSRG("field_178028_d");

	/**
	 * <p>
	 * Name: updatePosition
	 * </p>
	 * <p>
	 * Desc: [(IIIF)V]
	 * </p>
	 */
	public static McObfPair func_192633_a = McMappingDatabase.getSRG("GuiPageButtonList$GuiEntry.func_192633_a");

	/**
	 * <p>
	 * Name: clickTextField
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiTextField;III)V]
	 * </p>
	 */
	public static McObfPair func_178018_a = McMappingDatabase.getSRG("GuiPageButtonList$GuiEntry.func_178018_a");

	/**
	 * <p>
	 * Name: releaseComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/Gui;III)V]
	 * </p>
	 */
	public static McObfPair func_178016_b = McMappingDatabase.getSRG("GuiPageButtonList$GuiEntry.func_178016_b");

	/**
	 * <p>
	 * Name: component2
	 * </p>
	 */
	public static McObfPair field_178030_c = McMappingDatabase.getSRG("field_178030_c");

	/**
	 * <p>
	 * Name: getComponent2
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/Gui;]
	 * </p>
	 */
	public static McObfPair func_178021_b = McMappingDatabase.getSRG("GuiPageButtonList$GuiEntry.func_178021_b");

	/**
	 * <p>
	 * Name: mousePressed
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)Z]
	 * </p>
	 */
	public static McObfPair func_148278_a = McMappingDatabase.getSRG("GuiPageButtonList$GuiEntry.func_148278_a");

	/**
	 * <p>
	 * Name: component1
	 * </p>
	 */
	public static McObfPair field_178029_b = McMappingDatabase.getSRG("field_178029_b");

	/**
	 * <p>
	 * Name: renderLabel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiLabel;IIIZ)V]
	 * </p>
	 */
	public static McObfPair func_178025_a = McMappingDatabase.getSRG("GuiPageButtonList$GuiEntry.func_178025_a");

	/**
	 * <p>
	 * Name: renderComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/Gui;IIIZF)V]
	 * </p>
	 */
	public static McObfPair func_192636_a = McMappingDatabase.getSRG("GuiPageButtonList$GuiEntry.func_192636_a");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_148277_b = McMappingDatabase.getSRG("GuiPageButtonList$GuiEntry.func_148277_b");

	/**
	 * <p>
	 * Name: getComponent1
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/Gui;]
	 * </p>
	 */
	public static McObfPair func_178022_a = McMappingDatabase.getSRG("GuiPageButtonList$GuiEntry.func_178022_a");

	/**
	 * <p>
	 * Name: renderButton
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;IIIZF)V]
	 * </p>
	 */
	public static McObfPair func_192635_a = McMappingDatabase.getSRG("GuiPageButtonList$GuiEntry.func_192635_a");

}

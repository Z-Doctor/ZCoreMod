package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiOptionsRowList$Row {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjo$a";
		else
			return "net/minecraft/client/gui/GuiOptionsRowList$Row";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjo$a";
		else
			return "GuiOptionsRowList$Row";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjo$a;";
		else
			return "Lnet/minecraft/client/gui/GuiOptionsRowList$Row;";
	}

	/**
	 * <p>
	 * Name: updatePosition
	 * </p>
	 * <p>
	 * Desc: [(IIIF)V]
	 * </p>
	 */
	public static McObfPair func_192633_a = McMappingDatabase.getSRG("GuiOptionsRowList$Row.func_192633_a");

	/**
	 * <p>
	 * Name: client
	 * </p>
	 */
	public static McObfPair field_148325_a = McMappingDatabase.getSRG("field_148325_a");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_148277_b = McMappingDatabase.getSRG("GuiOptionsRowList$Row.func_148277_b");

	/**
	 * <p>
	 * Name: drawEntry
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIIZF)V]
	 * </p>
	 */
	public static McObfPair func_192634_a = McMappingDatabase.getSRG("GuiOptionsRowList$Row.func_192634_a");

	/**
	 * <p>
	 * Name: buttonA
	 * </p>
	 */
	public static McObfPair field_148323_b = McMappingDatabase.getSRG("field_148323_b");

	/**
	 * <p>
	 * Name: buttonB
	 * </p>
	 */
	public static McObfPair field_148324_c = McMappingDatabase.getSRG("field_148324_c");

	/**
	 * <p>
	 * Name: mousePressed
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)Z]
	 * </p>
	 */
	public static McObfPair func_148278_a = McMappingDatabase.getSRG("GuiOptionsRowList$Row.func_148278_a");

}

package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiPageButtonList$GuiResponder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjp$b";
		else
			return "net/minecraft/client/gui/GuiPageButtonList$GuiResponder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjp$b";
		else
			return "GuiPageButtonList$GuiResponder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjp$b;";
		else
			return "Lnet/minecraft/client/gui/GuiPageButtonList$GuiResponder;";
	}

	/**
	 * <p>
	 * Name: setEntryValue
	 * </p>
	 * <p>
	 * Desc: [(IF)V]
	 * </p>
	 */
	public static McObfPair func_175320_a = McMappingDatabase.getSRG("GuiPageButtonList$GuiResponder.func_175320_a");

	/**
	 * <p>
	 * Name: setEntryValue
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_175319_a = McMappingDatabase.getSRG("GuiPageButtonList$GuiResponder.func_175319_a");

	/**
	 * <p>
	 * Name: setEntryValue
	 * </p>
	 * <p>
	 * Desc: [(IZ)V]
	 * </p>
	 */
	public static McObfPair func_175321_a = McMappingDatabase.getSRG("GuiPageButtonList$GuiResponder.func_175321_a");

}

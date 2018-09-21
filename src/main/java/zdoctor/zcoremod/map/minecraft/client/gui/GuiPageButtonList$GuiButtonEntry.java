package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiPageButtonList$GuiButtonEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjp$a";
		else
			return "net/minecraft/client/gui/GuiPageButtonList$GuiButtonEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjp$a";
		else
			return "GuiPageButtonList$GuiButtonEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjp$a;";
		else
			return "Lnet/minecraft/client/gui/GuiPageButtonList$GuiButtonEntry;";
	}

	/**
	 * <p>
	 * Name: getInitialValue
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178940_a = McMappingDatabase.getSRG("GuiPageButtonList$GuiButtonEntry.func_178940_a");

	/**
	 * <p>
	 * Name: initialValue
	 * </p>
	 */
	public static McObfPair field_178941_a = McMappingDatabase.getSRG("field_178941_a");

}

package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiPageButtonList$GuiListEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjp$f";
		else
			return "net/minecraft/client/gui/GuiPageButtonList$GuiListEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjp$f";
		else
			return "GuiPageButtonList$GuiListEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjp$f;";
		else
			return "Lnet/minecraft/client/gui/GuiPageButtonList$GuiListEntry;";
	}

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_178939_a = McMappingDatabase.getSRG("field_178939_a");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178935_b = McMappingDatabase.getSRG("GuiPageButtonList$GuiListEntry.func_178935_b");

	/**
	 * <p>
	 * Name: shouldStartVisible
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178934_d = McMappingDatabase.getSRG("GuiPageButtonList$GuiListEntry.func_178934_d");

	/**
	 * <p>
	 * Name: startVisible
	 * </p>
	 */
	public static McObfPair field_178938_c = McMappingDatabase.getSRG("field_178938_c");

	/**
	 * <p>
	 * Name: getCaption
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_178936_c = McMappingDatabase.getSRG("GuiPageButtonList$GuiListEntry.func_178936_c");

	/**
	 * <p>
	 * Name: caption
	 * </p>
	 */
	public static McObfPair field_178937_b = McMappingDatabase.getSRG("field_178937_b");

}

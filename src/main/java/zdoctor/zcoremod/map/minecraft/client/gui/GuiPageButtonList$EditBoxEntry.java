package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiPageButtonList$EditBoxEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjp$c";
		else
			return "net/minecraft/client/gui/GuiPageButtonList$EditBoxEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjp$c";
		else
			return "GuiPageButtonList$EditBoxEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjp$c;";
		else
			return "Lnet/minecraft/client/gui/GuiPageButtonList$EditBoxEntry;";
	}

	/**
	 * <p>
	 * Name: getFilter
	 * </p>
	 * <p>
	 * Desc: [()Lcom/google/common/base/Predicate;]
	 * </p>
	 */
	public static McObfPair func_178950_a = McMappingDatabase.getSRG("GuiPageButtonList$EditBoxEntry.func_178950_a");

	/**
	 * <p>
	 * Name: filter
	 * </p>
	 */
	public static McObfPair field_178951_a = McMappingDatabase.getSRG("field_178951_a");

}

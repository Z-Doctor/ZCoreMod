package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiResourcePackSelected {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boe";
		else
			return "net/minecraft/client/gui/GuiResourcePackSelected";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boe";
		else
			return "GuiResourcePackSelected";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lboe;";
		else
			return "Lnet/minecraft/client/gui/GuiResourcePackSelected;";
	}

	/**
	 * <p>
	 * Name: getListHeader
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148202_k = McMappingDatabase.getSRG("GuiResourcePackSelected.func_148202_k");

}

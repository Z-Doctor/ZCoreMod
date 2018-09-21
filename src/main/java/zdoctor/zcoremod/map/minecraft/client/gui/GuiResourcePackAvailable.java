package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiResourcePackAvailable {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boc";
		else
			return "net/minecraft/client/gui/GuiResourcePackAvailable";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boc";
		else
			return "GuiResourcePackAvailable";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lboc;";
		else
			return "Lnet/minecraft/client/gui/GuiResourcePackAvailable;";
	}

	/**
	 * <p>
	 * Name: getListHeader
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148202_k = McMappingDatabase.getSRG("GuiResourcePackAvailable.func_148202_k");

}

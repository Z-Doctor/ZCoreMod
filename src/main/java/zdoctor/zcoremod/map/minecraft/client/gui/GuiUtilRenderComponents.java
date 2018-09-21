package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiUtilRenderComponents {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjc";
		else
			return "net/minecraft/client/gui/GuiUtilRenderComponents";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjc";
		else
			return "GuiUtilRenderComponents";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjc;";
		else
			return "Lnet/minecraft/client/gui/GuiUtilRenderComponents;";
	}

	/**
	 * <p>
	 * Name: splitText
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;ILnet/minecraft/client/gui/FontRenderer;ZZ)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_178908_a = McMappingDatabase.getSRG("GuiUtilRenderComponents.func_178908_a");

	/**
	 * <p>
	 * Name: removeTextColorsIfConfigured
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Z)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_178909_a = McMappingDatabase.getSRG("GuiUtilRenderComponents.func_178909_a");

}

package zdoctor.zcoremod.map.minecraft.client.gui.spectator;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ISpectatorMenuView {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bor";
		else
			return "net/minecraft/client/gui/spectator/ISpectatorMenuView";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bor";
		else
			return "ISpectatorMenuView";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbor;";
		else
			return "Lnet/minecraft/client/gui/spectator/ISpectatorMenuView;";
	}

	/**
	 * <p>
	 * Name: getItems
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_178669_a = McMappingDatabase.getSRG("ISpectatorMenuView.func_178669_a");

	/**
	 * <p>
	 * Name: getPrompt
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_178670_b = McMappingDatabase.getSRG("ISpectatorMenuView.func_178670_b");

}

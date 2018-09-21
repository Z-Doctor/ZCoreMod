package zdoctor.zcoremod.map.minecraft.client.gui.spectator;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ISpectatorMenuRecipient {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bot";
		else
			return "net/minecraft/client/gui/spectator/ISpectatorMenuRecipient";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bot";
		else
			return "ISpectatorMenuRecipient";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbot;";
		else
			return "Lnet/minecraft/client/gui/spectator/ISpectatorMenuRecipient;";
	}

	/**
	 * <p>
	 * Name: onSpectatorMenuClosed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/spectator/SpectatorMenu;)V]
	 * </p>
	 */
	public static McObfPair func_175257_a = McMappingDatabase.getSRG("ISpectatorMenuRecipient.func_175257_a");

}

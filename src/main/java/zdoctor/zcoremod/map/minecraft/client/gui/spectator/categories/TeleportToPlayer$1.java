package zdoctor.zcoremod.map.minecraft.client.gui.spectator.categories;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TeleportToPlayer$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bov$1";
		else
			return "net/minecraft/client/gui/spectator/categories/TeleportToPlayer$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bov$1";
		else
			return "TeleportToPlayer$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbov$1;";
		else
			return "Lnet/minecraft/client/gui/spectator/categories/TeleportToPlayer$1;";
	}

}

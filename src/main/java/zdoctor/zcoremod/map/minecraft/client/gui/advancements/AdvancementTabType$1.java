package zdoctor.zcoremod.map.minecraft.client.gui.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AdvancementTabType$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bly$1";
		else
			return "net/minecraft/client/gui/advancements/AdvancementTabType$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bly$1";
		else
			return "AdvancementTabType$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbly$1;";
		else
			return "Lnet/minecraft/client/gui/advancements/AdvancementTabType$1;";
	}

}

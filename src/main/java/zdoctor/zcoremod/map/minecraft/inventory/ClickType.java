package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ClickType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afw";
		else
			return "net/minecraft/inventory/ClickType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afw";
		else
			return "ClickType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafw;";
		else
			return "Lnet/minecraft/inventory/ClickType;";
	}

}

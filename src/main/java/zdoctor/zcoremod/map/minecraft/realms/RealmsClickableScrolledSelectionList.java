package zdoctor.zcoremod.map.minecraft.realms;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RealmsClickableScrolledSelectionList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "net/minecraft/realms/RealmsClickableScrolledSelectionList";
		else
			return "net/minecraft/realms/RealmsClickableScrolledSelectionList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "RealmsClickableScrolledSelectionList";
		else
			return "RealmsClickableScrolledSelectionList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnet/minecraft/realms/RealmsClickableScrolledSelectionList;";
		else
			return "Lnet/minecraft/realms/RealmsClickableScrolledSelectionList;";
	}

}

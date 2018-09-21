package zdoctor.zcoremod.map.minecraft.realms;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RealmsScrolledSelectionList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "net/minecraft/realms/RealmsScrolledSelectionList";
		else
			return "net/minecraft/realms/RealmsScrolledSelectionList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "RealmsScrolledSelectionList";
		else
			return "RealmsScrolledSelectionList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnet/minecraft/realms/RealmsScrolledSelectionList;";
		else
			return "Lnet/minecraft/realms/RealmsScrolledSelectionList;";
	}

}

package zdoctor.zcoremod.map.minecraft.realms;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RealmsSimpleScrolledSelectionList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "net/minecraft/realms/RealmsSimpleScrolledSelectionList";
		else
			return "net/minecraft/realms/RealmsSimpleScrolledSelectionList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "RealmsSimpleScrolledSelectionList";
		else
			return "RealmsSimpleScrolledSelectionList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnet/minecraft/realms/RealmsSimpleScrolledSelectionList;";
		else
			return "Lnet/minecraft/realms/RealmsSimpleScrolledSelectionList;";
	}

}

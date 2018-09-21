package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumAction {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akc";
		else
			return "net/minecraft/item/EnumAction";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akc";
		else
			return "EnumAction";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lakc;";
		else
			return "Lnet/minecraft/item/EnumAction;";
	}

}

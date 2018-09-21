package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Item$11 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ain$3";
		else
			return "net/minecraft/item/Item$11";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ain$3";
		else
			return "Item$11";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lain$3;";
		else
			return "Lnet/minecraft/item/Item$11;";
	}

}

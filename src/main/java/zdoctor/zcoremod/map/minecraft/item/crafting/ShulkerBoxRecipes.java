package zdoctor.zcoremod.map.minecraft.item.crafting;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ShulkerBoxRecipes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akz";
		else
			return "net/minecraft/item/crafting/ShulkerBoxRecipes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akz";
		else
			return "ShulkerBoxRecipes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lakz;";
		else
			return "Lnet/minecraft/item/crafting/ShulkerBoxRecipes;";
	}

}

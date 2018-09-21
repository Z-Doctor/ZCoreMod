package zdoctor.zcoremod.map.minecraft.item.crafting;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RecipesBanners {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akm";
		else
			return "net/minecraft/item/crafting/RecipesBanners";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akm";
		else
			return "RecipesBanners";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lakm;";
		else
			return "Lnet/minecraft/item/crafting/RecipesBanners;";
	}

}

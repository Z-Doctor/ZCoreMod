package zdoctor.zcoremod.map.minecraft.item.crafting;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ShieldRecipes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aky";
		else
			return "net/minecraft/item/crafting/ShieldRecipes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aky";
		else
			return "ShieldRecipes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laky;";
		else
			return "Lnet/minecraft/item/crafting/ShieldRecipes;";
	}

}

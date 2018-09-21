package zdoctor.zcoremod.map.minecraft.client.gui.recipebook;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GhostRecipe$GhostIngredient {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnm$a";
		else
			return "net/minecraft/client/gui/recipebook/GhostRecipe$GhostIngredient";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnm$a";
		else
			return "GhostRecipe$GhostIngredient";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnm$a;";
		else
			return "Lnet/minecraft/client/gui/recipebook/GhostRecipe$GhostIngredient;";
	}

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_192679_c = McMappingDatabase.getSRG("field_192679_c");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_192678_b = McMappingDatabase.getSRG("field_192678_b");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_193713_b = McMappingDatabase.getSRG("GhostRecipe$GhostIngredient.func_193713_b");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_193712_c = McMappingDatabase.getSRG("GhostRecipe$GhostIngredient.func_193712_c");

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_194184_c = McMappingDatabase.getSRG("GhostRecipe$GhostIngredient.func_194184_c");

	/**
	 * <p>
	 * Name: ingredient
	 * </p>
	 */
	public static McObfPair field_194186_b = McMappingDatabase.getSRG("field_194186_b");

}

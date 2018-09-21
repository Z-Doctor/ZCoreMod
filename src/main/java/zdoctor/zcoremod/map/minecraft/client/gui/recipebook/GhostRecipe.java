package zdoctor.zcoremod.map.minecraft.client.gui.recipebook;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GhostRecipe {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnm";
		else
			return "net/minecraft/client/gui/recipebook/GhostRecipe";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnm";
		else
			return "GhostRecipe";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnm;";
		else
			return "Lnet/minecraft/client/gui/recipebook/GhostRecipe;";
	}

	/**
	 * <p>
	 * Name: addIngredient
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/Ingredient;II)V]
	 * </p>
	 */
	public static McObfPair func_194187_a = McMappingDatabase.getSRG("GhostRecipe.func_194187_a");

	/**
	 * <p>
	 * Name: setRecipe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;)V]
	 * </p>
	 */
	public static McObfPair func_192685_a = McMappingDatabase.getSRG("GhostRecipe.func_192685_a");

	/**
	 * <p>
	 * Name: time
	 * </p>
	 */
	public static McObfPair field_194190_c = McMappingDatabase.getSRG("field_194190_c");

	/**
	 * <p>
	 * Name: size
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_192684_b = McMappingDatabase.getSRG("GhostRecipe.func_192684_b");

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192682_a = McMappingDatabase.getSRG("GhostRecipe.func_192682_a");

	/**
	 * <p>
	 * Name: getRecipe
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/crafting/IRecipe;]
	 * </p>
	 */
	public static McObfPair func_192686_c = McMappingDatabase.getSRG("GhostRecipe.func_192686_c");

	/**
	 * <p>
	 * Name: get
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/gui/recipebook/GhostRecipe$GhostIngredient;]
	 * </p>
	 */
	public static McObfPair func_192681_a = McMappingDatabase.getSRG("GhostRecipe.func_192681_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;IIZF)V]
	 * </p>
	 */
	public static McObfPair func_194188_a = McMappingDatabase.getSRG("GhostRecipe.func_194188_a");

	/**
	 * <p>
	 * Name: ingredients
	 * </p>
	 */
	public static McObfPair field_192688_b = McMappingDatabase.getSRG("field_192688_b");

	/**
	 * <p>
	 * Name: recipe
	 * </p>
	 */
	public static McObfPair field_192687_a = McMappingDatabase.getSRG("field_192687_a");

}

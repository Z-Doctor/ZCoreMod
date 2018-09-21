package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RecipeUnlockedTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ay$b";
		else
			return "net/minecraft/advancements/critereon/RecipeUnlockedTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ay$b";
		else
			return "RecipeUnlockedTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lay$b;";
		else
			return "Lnet/minecraft/advancements/critereon/RecipeUnlockedTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: recipe
	 * </p>
	 */
	public static McObfPair field_192282_a = McMappingDatabase.getSRG("field_192282_a");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/crafting/IRecipe;)Z]
	 * </p>
	 */
	public static McObfPair func_193215_a = McMappingDatabase.getSRG("RecipeUnlockedTrigger$Instance.func_193215_a");

}

package zdoctor.zcoremod.map.minecraft.client.gui.recipebook;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IRecipeUpdateListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnt";
		else
			return "net/minecraft/client/gui/recipebook/IRecipeUpdateListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnt";
		else
			return "IRecipeUpdateListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnt;";
		else
			return "Lnet/minecraft/client/gui/recipebook/IRecipeUpdateListener;";
	}

	/**
	 * <p>
	 * Name: recipesShown
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_193001_a = McMappingDatabase.getSRG("IRecipeUpdateListener.func_193001_a");

}

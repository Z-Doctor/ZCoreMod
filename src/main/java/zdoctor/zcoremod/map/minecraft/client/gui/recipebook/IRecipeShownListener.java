package zdoctor.zcoremod.map.minecraft.client.gui.recipebook;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IRecipeShownListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnu";
		else
			return "net/minecraft/client/gui/recipebook/IRecipeShownListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnu";
		else
			return "IRecipeShownListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnu;";
		else
			return "Lnet/minecraft/client/gui/recipebook/IRecipeShownListener;";
	}

	/**
	 * <p>
	 * Name: recipesUpdated
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192043_J_ = McMappingDatabase.getSRG("IRecipeShownListener.func_192043_J_");

}

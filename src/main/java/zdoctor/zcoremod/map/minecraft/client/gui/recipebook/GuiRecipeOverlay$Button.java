package zdoctor.zcoremod.map.minecraft.client.gui.recipebook;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiRecipeOverlay$Button {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnn$a";
		else
			return "net/minecraft/client/gui/recipebook/GuiRecipeOverlay$Button";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnn$a";
		else
			return "GuiRecipeOverlay$Button";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnn$a;";
		else
			return "Lnet/minecraft/client/gui/recipebook/GuiRecipeOverlay$Button;";
	}

	/**
	 * <p>
	 * Name: recipe
	 * </p>
	 */
	public static McObfPair field_193924_p = McMappingDatabase.getSRG("field_193924_p");

	/**
	 * <p>
	 * Name: isCraftable
	 * </p>
	 */
	public static McObfPair field_193925_q = McMappingDatabase.getSRG("field_193925_q");

	/**
	 * <p>
	 * Name: drawButton
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;IIF)V]
	 * </p>
	 */
	public static McObfPair func_191745_a = McMappingDatabase.getSRG("GuiRecipeOverlay$Button.func_191745_a");

}

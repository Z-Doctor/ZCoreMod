package zdoctor.zcoremod.map.minecraft.client.gui.recipebook;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiButtonRecipeTab {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnq";
		else
			return "net/minecraft/client/gui/recipebook/GuiButtonRecipeTab";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnq";
		else
			return "GuiButtonRecipeTab";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnq;";
		else
			return "Lnet/minecraft/client/gui/recipebook/GuiButtonRecipeTab;";
	}

	/**
	 * <p>
	 * Name: getCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/creativetab/CreativeTabs;]
	 * </p>
	 */
	public static McObfPair func_191764_e = McMappingDatabase.getSRG("GuiButtonRecipeTab.func_191764_e");

	/**
	 * <p>
	 * Name: startAnimation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;)V]
	 * </p>
	 */
	public static McObfPair func_193918_a = McMappingDatabase.getSRG("GuiButtonRecipeTab.func_193918_a");

	/**
	 * <p>
	 * Name: renderIcon
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/RenderItem;)V]
	 * </p>
	 */
	public static McObfPair func_193920_a = McMappingDatabase.getSRG("GuiButtonRecipeTab.func_193920_a");

	/**
	 * <p>
	 * Name: animationTime
	 * </p>
	 */
	public static McObfPair field_193922_v = McMappingDatabase.getSRG("field_193922_v");

	/**
	 * <p>
	 * Name: category
	 * </p>
	 */
	public static McObfPair field_193921_u = McMappingDatabase.getSRG("field_193921_u");

	/**
	 * <p>
	 * Name: updateVisibility
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193919_e = McMappingDatabase.getSRG("GuiButtonRecipeTab.func_193919_e");

	/**
	 * <p>
	 * Name: drawButton
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;IIF)V]
	 * </p>
	 */
	public static McObfPair func_191745_a = McMappingDatabase.getSRG("GuiButtonRecipeTab.func_191745_a");

}

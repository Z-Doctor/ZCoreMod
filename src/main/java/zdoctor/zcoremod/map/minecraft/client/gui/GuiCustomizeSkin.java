package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiCustomizeSkin {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blm";
		else
			return "net/minecraft/client/gui/GuiCustomizeSkin";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blm";
		else
			return "GuiCustomizeSkin";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblm;";
		else
			return "Lnet/minecraft/client/gui/GuiCustomizeSkin;";
	}

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiCustomizeSkin.func_73863_a");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiCustomizeSkin.func_146284_a");

	/**
	 * <p>
	 * Name: keyTyped
	 * </p>
	 * <p>
	 * Desc: [(CI)V]
	 * </p>
	 */
	public static McObfPair func_73869_a = McMappingDatabase.getSRG("GuiCustomizeSkin.func_73869_a");

	/**
	 * <p>
	 * Name: parentScreen
	 * </p>
	 */
	public static McObfPair field_175361_a = McMappingDatabase.getSRG("field_175361_a");

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiCustomizeSkin.func_73866_w_");

	/**
	 * <p>
	 * Name: getMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EnumPlayerModelParts;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_175358_a = McMappingDatabase.getSRG("GuiCustomizeSkin.func_175358_a");

	/**
	 * <p>
	 * Name: title
	 * </p>
	 */
	public static McObfPair field_175360_f = McMappingDatabase.getSRG("field_175360_f");

}

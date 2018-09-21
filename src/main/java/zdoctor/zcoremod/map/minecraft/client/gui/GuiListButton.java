package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiListButton {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjk";
		else
			return "net/minecraft/client/gui/GuiListButton";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjk";
		else
			return "GuiListButton";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjk;";
		else
			return "Lnet/minecraft/client/gui/GuiListButton;";
	}

	/**
	 * <p>
	 * Name: mousePressed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;II)Z]
	 * </p>
	 */
	public static McObfPair func_146116_c = McMappingDatabase.getSRG("GuiListButton.func_146116_c");

	/**
	 * <p>
	 * Name: value
	 * </p>
	 */
	public static McObfPair field_175216_o = McMappingDatabase.getSRG("field_175216_o");

	/**
	 * <p>
	 * Name: buildDisplayString
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_175213_c = McMappingDatabase.getSRG("GuiListButton.func_175213_c");

	/**
	 * <p>
	 * Name: localizationStr
	 * </p>
	 */
	public static McObfPair field_175215_p = McMappingDatabase.getSRG("field_175215_p");

	/**
	 * <p>
	 * Name: setValue
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_175212_b = McMappingDatabase.getSRG("GuiListButton.func_175212_b");

	/**
	 * <p>
	 * Name: guiResponder
	 * </p>
	 */
	public static McObfPair field_175214_q = McMappingDatabase.getSRG("field_175214_q");

}

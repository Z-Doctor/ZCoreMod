package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiButtonImage {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjg";
		else
			return "net/minecraft/client/gui/GuiButtonImage";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjg";
		else
			return "GuiButtonImage";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjg;";
		else
			return "Lnet/minecraft/client/gui/GuiButtonImage;";
	}

	/**
	 * <p>
	 * Name: yTexStart
	 * </p>
	 */
	public static McObfPair field_191748_q = McMappingDatabase.getSRG("field_191748_q");

	/**
	 * <p>
	 * Name: xTexStart
	 * </p>
	 */
	public static McObfPair field_191747_p = McMappingDatabase.getSRG("field_191747_p");

	/**
	 * <p>
	 * Name: setPosition
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_191746_c = McMappingDatabase.getSRG("GuiButtonImage.func_191746_c");

	/**
	 * <p>
	 * Name: resourceLocation
	 * </p>
	 */
	public static McObfPair field_191750_o = McMappingDatabase.getSRG("field_191750_o");

	/**
	 * <p>
	 * Name: drawButton
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;IIF)V]
	 * </p>
	 */
	public static McObfPair func_191745_a = McMappingDatabase.getSRG("GuiButtonImage.func_191745_a");

	/**
	 * <p>
	 * Name: yDiffText
	 * </p>
	 */
	public static McObfPair field_191749_r = McMappingDatabase.getSRG("field_191749_r");

}

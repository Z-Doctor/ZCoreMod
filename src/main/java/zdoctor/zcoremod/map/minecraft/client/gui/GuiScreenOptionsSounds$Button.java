package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiScreenOptionsSounds$Button {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blo$a";
		else
			return "net/minecraft/client/gui/GuiScreenOptionsSounds$Button";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blo$a";
		else
			return "GuiScreenOptionsSounds$Button";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblo$a;";
		else
			return "Lnet/minecraft/client/gui/GuiScreenOptionsSounds$Button;";
	}

	/**
	 * <p>
	 * Name: mousePressed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;II)Z]
	 * </p>
	 */
	public static McObfPair func_146116_c = McMappingDatabase.getSRG("GuiScreenOptionsSounds$Button.func_146116_c");

	/**
	 * <p>
	 * Name: category
	 * </p>
	 */
	public static McObfPair field_184063_r = McMappingDatabase.getSRG("field_184063_r");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_146118_a = McMappingDatabase.getSRG("GuiScreenOptionsSounds$Button.func_146118_a");

	/**
	 * <p>
	 * Name: playPressSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/SoundHandler;)V]
	 * </p>
	 */
	public static McObfPair func_146113_a = McMappingDatabase.getSRG("GuiScreenOptionsSounds$Button.func_146113_a");

	/**
	 * <p>
	 * Name: volume
	 * </p>
	 */
	public static McObfPair field_146156_o = McMappingDatabase.getSRG("field_146156_o");

	/**
	 * <p>
	 * Name: getHoverState
	 * </p>
	 * <p>
	 * Desc: [(Z)I]
	 * </p>
	 */
	public static McObfPair func_146114_a = McMappingDatabase.getSRG("GuiScreenOptionsSounds$Button.func_146114_a");

	/**
	 * <p>
	 * Name: pressed
	 * </p>
	 */
	public static McObfPair field_146155_p = McMappingDatabase.getSRG("field_146155_p");

	/**
	 * <p>
	 * Name: categoryName
	 * </p>
	 */
	public static McObfPair field_146152_s = McMappingDatabase.getSRG("field_146152_s");

	/**
	 * <p>
	 * Name: mouseDragged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;II)V]
	 * </p>
	 */
	public static McObfPair func_146119_b = McMappingDatabase.getSRG("GuiScreenOptionsSounds$Button.func_146119_b");

}

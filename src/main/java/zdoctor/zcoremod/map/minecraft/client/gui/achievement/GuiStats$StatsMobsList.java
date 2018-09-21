package zdoctor.zcoremod.map.minecraft.client.gui.achievement;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiStats$StatsMobsList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blu$d";
		else
			return "net/minecraft/client/gui/achievement/GuiStats$StatsMobsList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blu$d";
		else
			return "GuiStats$StatsMobsList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblu$d;";
		else
			return "Lnet/minecraft/client/gui/achievement/GuiStats$StatsMobsList;";
	}

	/**
	 * <p>
	 * Name: drawBackground
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148123_a = McMappingDatabase.getSRG("GuiStats$StatsMobsList.func_148123_a");

	/**
	 * <p>
	 * Name: isSelected
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_148131_a = McMappingDatabase.getSRG("GuiStats$StatsMobsList.func_148131_a");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148127_b = McMappingDatabase.getSRG("GuiStats$StatsMobsList.func_148127_b");

	/**
	 * <p>
	 * Name: elementClicked
	 * </p>
	 * <p>
	 * Desc: [(IZII)V]
	 * </p>
	 */
	public static McObfPair func_148144_a = McMappingDatabase.getSRG("GuiStats$StatsMobsList.func_148144_a");

	/**
	 * <p>
	 * Name: getContentHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148138_e = McMappingDatabase.getSRG("GuiStats$StatsMobsList.func_148138_e");

	/**
	 * <p>
	 * Name: mobs
	 * </p>
	 */
	public static McObfPair field_148222_l = McMappingDatabase.getSRG("field_148222_l");

	/**
	 * <p>
	 * Name: drawSlot
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIF)V]
	 * </p>
	 */
	public static McObfPair func_192637_a = McMappingDatabase.getSRG("GuiStats$StatsMobsList.func_192637_a");

}

package zdoctor.zcoremod.map.minecraft.client.gui.achievement;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiStats$StatsGeneral {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blu$b";
		else
			return "net/minecraft/client/gui/achievement/GuiStats$StatsGeneral";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blu$b";
		else
			return "GuiStats$StatsGeneral";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblu$b;";
		else
			return "Lnet/minecraft/client/gui/achievement/GuiStats$StatsGeneral;";
	}

	/**
	 * <p>
	 * Name: drawSlot
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIF)V]
	 * </p>
	 */
	public static McObfPair func_192637_a = McMappingDatabase.getSRG("GuiStats$StatsGeneral.func_192637_a");

	/**
	 * <p>
	 * Name: drawBackground
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148123_a = McMappingDatabase.getSRG("GuiStats$StatsGeneral.func_148123_a");

	/**
	 * <p>
	 * Name: elementClicked
	 * </p>
	 * <p>
	 * Desc: [(IZII)V]
	 * </p>
	 */
	public static McObfPair func_148144_a = McMappingDatabase.getSRG("GuiStats$StatsGeneral.func_148144_a");

	/**
	 * <p>
	 * Name: isSelected
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_148131_a = McMappingDatabase.getSRG("GuiStats$StatsGeneral.func_148131_a");

	/**
	 * <p>
	 * Name: getContentHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148138_e = McMappingDatabase.getSRG("GuiStats$StatsGeneral.func_148138_e");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148127_b = McMappingDatabase.getSRG("GuiStats$StatsGeneral.func_148127_b");

}

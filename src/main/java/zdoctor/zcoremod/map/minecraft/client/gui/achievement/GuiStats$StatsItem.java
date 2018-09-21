package zdoctor.zcoremod.map.minecraft.client.gui.achievement;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiStats$StatsItem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blu$c";
		else
			return "net/minecraft/client/gui/achievement/GuiStats$StatsItem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blu$c";
		else
			return "GuiStats$StatsItem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblu$c;";
		else
			return "Lnet/minecraft/client/gui/achievement/GuiStats$StatsItem;";
	}

	/**
	 * <p>
	 * Name: drawSlot
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIF)V]
	 * </p>
	 */
	public static McObfPair func_192637_a = McMappingDatabase.getSRG("GuiStats$StatsItem.func_192637_a");

	/**
	 * <p>
	 * Name: drawListHeader
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/client/renderer/Tessellator;)V]
	 * </p>
	 */
	public static McObfPair func_148129_a = McMappingDatabase.getSRG("GuiStats$StatsItem.func_148129_a");

	/**
	 * <p>
	 * Name: getHeaderDescriptionId
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148210_b = McMappingDatabase.getSRG("GuiStats$StatsItem.func_148210_b");

}

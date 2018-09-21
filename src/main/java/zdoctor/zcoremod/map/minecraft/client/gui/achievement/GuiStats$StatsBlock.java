package zdoctor.zcoremod.map.minecraft.client.gui.achievement;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiStats$StatsBlock {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blu$a";
		else
			return "net/minecraft/client/gui/achievement/GuiStats$StatsBlock";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blu$a";
		else
			return "GuiStats$StatsBlock";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblu$a;";
		else
			return "Lnet/minecraft/client/gui/achievement/GuiStats$StatsBlock;";
	}

	/**
	 * <p>
	 * Name: getHeaderDescriptionId
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148210_b = McMappingDatabase.getSRG("GuiStats$StatsBlock.func_148210_b");

	/**
	 * <p>
	 * Name: drawSlot
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIF)V]
	 * </p>
	 */
	public static McObfPair func_192637_a = McMappingDatabase.getSRG("GuiStats$StatsBlock.func_192637_a");

	/**
	 * <p>
	 * Name: drawListHeader
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/client/renderer/Tessellator;)V]
	 * </p>
	 */
	public static McObfPair func_148129_a = McMappingDatabase.getSRG("GuiStats$StatsBlock.func_148129_a");

}

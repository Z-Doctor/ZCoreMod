package zdoctor.zcoremod.map.minecraft.client.gui.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AdvancementTabType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bly";
		else
			return "net/minecraft/client/gui/advancements/AdvancementTabType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bly";
		else
			return "AdvancementTabType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbly;";
		else
			return "Lnet/minecraft/client/gui/advancements/AdvancementTabType;";
	}

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_192663_i = McMappingDatabase.getSRG("field_192663_i");

	/**
	 * <p>
	 * Name: isMouseOver
	 * </p>
	 * <p>
	 * Desc: [(IIIII)Z]
	 * </p>
	 */
	public static McObfPair func_192654_a = McMappingDatabase.getSRG("AdvancementTabType.func_192654_a");

	/**
	 * <p>
	 * Name: draw
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/Gui;IIZI)V]
	 * </p>
	 */
	public static McObfPair func_192651_a = McMappingDatabase.getSRG("AdvancementTabType.func_192651_a");

	/**
	 * <p>
	 * Name: MAX_TABS
	 * </p>
	 */
	public static McObfPair field_192659_e = McMappingDatabase.getSRG("field_192659_e");

	/**
	 * <p>
	 * Name: getMax
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_192650_a = McMappingDatabase.getSRG("AdvancementTabType.func_192650_a");

	/**
	 * <p>
	 * Name: textureX
	 * </p>
	 */
	public static McObfPair field_192660_f = McMappingDatabase.getSRG("field_192660_f");

	/**
	 * <p>
	 * Name: textureY
	 * </p>
	 */
	public static McObfPair field_192661_g = McMappingDatabase.getSRG("field_192661_g");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_192662_h = McMappingDatabase.getSRG("field_192662_h");

	/**
	 * <p>
	 * Name: drawIcon
	 * </p>
	 * <p>
	 * Desc: [(IIILnet/minecraft/client/renderer/RenderItem;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_192652_a = McMappingDatabase.getSRG("AdvancementTabType.func_192652_a");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_192648_a = McMappingDatabase.getSRG("AdvancementTabType.func_192648_a");

	/**
	 * <p>
	 * Name: max
	 * </p>
	 */
	public static McObfPair field_192664_j = McMappingDatabase.getSRG("field_192664_j");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_192653_b = McMappingDatabase.getSRG("AdvancementTabType.func_192653_b");

}

package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiFlatPresets$ListSlot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blh$b";
		else
			return "net/minecraft/client/gui/GuiFlatPresets$ListSlot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blh$b";
		else
			return "GuiFlatPresets$ListSlot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblh$b;";
		else
			return "Lnet/minecraft/client/gui/GuiFlatPresets$ListSlot;";
	}

	/**
	 * <p>
	 * Name: blitSlotIcon
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_148171_c = McMappingDatabase.getSRG("GuiFlatPresets$ListSlot.func_148171_c");

	/**
	 * <p>
	 * Name: selected
	 * </p>
	 */
	public static McObfPair field_148175_k = McMappingDatabase.getSRG("field_148175_k");

	/**
	 * <p>
	 * Name: blitSlotBg
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_148173_e = McMappingDatabase.getSRG("GuiFlatPresets$ListSlot.func_148173_e");

	/**
	 * <p>
	 * Name: isSelected
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_148131_a = McMappingDatabase.getSRG("GuiFlatPresets$ListSlot.func_148131_a");

	/**
	 * <p>
	 * Name: elementClicked
	 * </p>
	 * <p>
	 * Desc: [(IZII)V]
	 * </p>
	 */
	public static McObfPair func_148144_a = McMappingDatabase.getSRG("GuiFlatPresets$ListSlot.func_148144_a");

	/**
	 * <p>
	 * Name: drawBackground
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148123_a = McMappingDatabase.getSRG("GuiFlatPresets$ListSlot.func_148123_a");

	/**
	 * <p>
	 * Name: drawSlot
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIF)V]
	 * </p>
	 */
	public static McObfPair func_192637_a = McMappingDatabase.getSRG("GuiFlatPresets$ListSlot.func_192637_a");

	/**
	 * <p>
	 * Name: renderIcon
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/item/Item;I)V]
	 * </p>
	 */
	public static McObfPair func_178054_a = McMappingDatabase.getSRG("GuiFlatPresets$ListSlot.func_178054_a");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148127_b = McMappingDatabase.getSRG("GuiFlatPresets$ListSlot.func_148127_b");

}

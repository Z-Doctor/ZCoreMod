package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiScreenCustomizePresets$ListPreset {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkt$b";
		else
			return "net/minecraft/client/gui/GuiScreenCustomizePresets$ListPreset";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkt$b";
		else
			return "GuiScreenCustomizePresets$ListPreset";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkt$b;";
		else
			return "Lnet/minecraft/client/gui/GuiScreenCustomizePresets$ListPreset;";
	}

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148127_b = McMappingDatabase.getSRG("GuiScreenCustomizePresets$ListPreset.func_148127_b");

	/**
	 * <p>
	 * Name: drawBackground
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148123_a = McMappingDatabase.getSRG("GuiScreenCustomizePresets$ListPreset.func_148123_a");

	/**
	 * <p>
	 * Name: elementClicked
	 * </p>
	 * <p>
	 * Desc: [(IZII)V]
	 * </p>
	 */
	public static McObfPair func_148144_a = McMappingDatabase.getSRG("GuiScreenCustomizePresets$ListPreset.func_148144_a");

	/**
	 * <p>
	 * Name: drawSlot
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIF)V]
	 * </p>
	 */
	public static McObfPair func_192637_a = McMappingDatabase.getSRG("GuiScreenCustomizePresets$ListPreset.func_192637_a");

	/**
	 * <p>
	 * Name: blitIcon
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/util/ResourceLocation;)V]
	 * </p>
	 */
	public static McObfPair func_178051_a = McMappingDatabase.getSRG("GuiScreenCustomizePresets$ListPreset.func_178051_a");

	/**
	 * <p>
	 * Name: selected
	 * </p>
	 */
	public static McObfPair field_178053_u = McMappingDatabase.getSRG("field_178053_u");

	/**
	 * <p>
	 * Name: isSelected
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_148131_a = McMappingDatabase.getSRG("GuiScreenCustomizePresets$ListPreset.func_148131_a");

}

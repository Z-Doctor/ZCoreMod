package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiLanguage$List {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blc$a";
		else
			return "net/minecraft/client/gui/GuiLanguage$List";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blc$a";
		else
			return "GuiLanguage$List";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblc$a;";
		else
			return "Lnet/minecraft/client/gui/GuiLanguage$List;";
	}

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148127_b = McMappingDatabase.getSRG("GuiLanguage$List.func_148127_b");

	/**
	 * <p>
	 * Name: getContentHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148138_e = McMappingDatabase.getSRG("GuiLanguage$List.func_148138_e");

	/**
	 * <p>
	 * Name: elementClicked
	 * </p>
	 * <p>
	 * Desc: [(IZII)V]
	 * </p>
	 */
	public static McObfPair func_148144_a = McMappingDatabase.getSRG("GuiLanguage$List.func_148144_a");

	/**
	 * <p>
	 * Name: langCodeList
	 * </p>
	 */
	public static McObfPair field_148176_l = McMappingDatabase.getSRG("field_148176_l");

	/**
	 * <p>
	 * Name: drawSlot
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIF)V]
	 * </p>
	 */
	public static McObfPair func_192637_a = McMappingDatabase.getSRG("GuiLanguage$List.func_192637_a");

	/**
	 * <p>
	 * Name: drawBackground
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148123_a = McMappingDatabase.getSRG("GuiLanguage$List.func_148123_a");

	/**
	 * <p>
	 * Name: languageMap
	 * </p>
	 */
	public static McObfPair field_148177_m = McMappingDatabase.getSRG("field_148177_m");

	/**
	 * <p>
	 * Name: isSelected
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_148131_a = McMappingDatabase.getSRG("GuiLanguage$List.func_148131_a");

}

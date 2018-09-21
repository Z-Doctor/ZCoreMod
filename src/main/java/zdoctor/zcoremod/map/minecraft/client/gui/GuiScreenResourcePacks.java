package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiScreenResourcePacks {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnw";
		else
			return "net/minecraft/client/gui/GuiScreenResourcePacks";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnw";
		else
			return "GuiScreenResourcePacks";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnw;";
		else
			return "Lnet/minecraft/client/gui/GuiScreenResourcePacks;";
	}

	/**
	 * <p>
	 * Name: initGui
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73866_w_ = McMappingDatabase.getSRG("GuiScreenResourcePacks.func_73866_w_");

	/**
	 * <p>
	 * Name: getSelectedResourcePacks
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_146963_h = McMappingDatabase.getSRG("GuiScreenResourcePacks.func_146963_h");

	/**
	 * <p>
	 * Name: availableResourcePacksList
	 * </p>
	 */
	public static McObfPair field_146970_i = McMappingDatabase.getSRG("field_146970_i");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_146286_b = McMappingDatabase.getSRG("GuiScreenResourcePacks.func_146286_b");

	/**
	 * <p>
	 * Name: changed
	 * </p>
	 */
	public static McObfPair field_175289_s = McMappingDatabase.getSRG("field_175289_s");

	/**
	 * <p>
	 * Name: getListContaining
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/ResourcePackListEntry;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_146962_b = McMappingDatabase.getSRG("GuiScreenResourcePacks.func_146962_b");

	/**
	 * <p>
	 * Name: drawScreen
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_73863_a = McMappingDatabase.getSRG("GuiScreenResourcePacks.func_73863_a");

	/**
	 * <p>
	 * Name: getAvailableResourcePacks
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_146964_g = McMappingDatabase.getSRG("GuiScreenResourcePacks.func_146964_g");

	/**
	 * <p>
	 * Name: actionPerformed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/GuiButton;)V]
	 * </p>
	 */
	public static McObfPair func_146284_a = McMappingDatabase.getSRG("GuiScreenResourcePacks.func_146284_a");

	/**
	 * <p>
	 * Name: parentScreen
	 * </p>
	 */
	public static McObfPair field_146965_f = McMappingDatabase.getSRG("field_146965_f");

	/**
	 * <p>
	 * Name: hasResourcePackEntry
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/ResourcePackListEntry;)Z]
	 * </p>
	 */
	public static McObfPair func_146961_a = McMappingDatabase.getSRG("GuiScreenResourcePacks.func_146961_a");

	/**
	 * <p>
	 * Name: markChanged
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175288_g = McMappingDatabase.getSRG("GuiScreenResourcePacks.func_175288_g");

	/**
	 * <p>
	 * Name: mouseClicked
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_73864_a = McMappingDatabase.getSRG("GuiScreenResourcePacks.func_73864_a");

	/**
	 * <p>
	 * Name: selectedResourcePacksList
	 * </p>
	 */
	public static McObfPair field_146967_r = McMappingDatabase.getSRG("field_146967_r");

	/**
	 * <p>
	 * Name: selectedResourcePacks
	 * </p>
	 */
	public static McObfPair field_146969_h = McMappingDatabase.getSRG("field_146969_h");

	/**
	 * <p>
	 * Name: availableResourcePacks
	 * </p>
	 */
	public static McObfPair field_146966_g = McMappingDatabase.getSRG("field_146966_g");

	/**
	 * <p>
	 * Name: handleMouseInput
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146274_d = McMappingDatabase.getSRG("GuiScreenResourcePacks.func_146274_d");

}

package zdoctor.zcoremod.map.minecraft.client.gui.spectator;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SpectatorMenu {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boq";
		else
			return "net/minecraft/client/gui/spectator/SpectatorMenu";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boq";
		else
			return "SpectatorMenu";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lboq;";
		else
			return "Lnet/minecraft/client/gui/spectator/SpectatorMenu;";
	}

	/**
	 * <p>
	 * Name: previousCategories
	 * </p>
	 */
	public static McObfPair field_178652_g = McMappingDatabase.getSRG("field_178652_g");

	/**
	 * <p>
	 * Name: getSelectedCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/spectator/ISpectatorMenuView;]
	 * </p>
	 */
	public static McObfPair func_178650_c = McMappingDatabase.getSRG("SpectatorMenu.func_178650_c");

	/**
	 * <p>
	 * Name: getItems
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_178642_a = McMappingDatabase.getSRG("SpectatorMenu.func_178642_a");

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/gui/spectator/ISpectatorMenuObject;]
	 * </p>
	 */
	public static McObfPair func_178643_a = McMappingDatabase.getSRG("SpectatorMenu.func_178643_a");

	/**
	 * <p>
	 * Name: SCROLL_LEFT
	 * </p>
	 */
	public static McObfPair field_178656_c = McMappingDatabase.getSRG("field_178656_c");

	/**
	 * <p>
	 * Name: getCurrentPage
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/spectator/categories/SpectatorDetails;]
	 * </p>
	 */
	public static McObfPair func_178646_f = McMappingDatabase.getSRG("SpectatorMenu.func_178646_f");

	/**
	 * <p>
	 * Name: EMPTY_SLOT
	 * </p>
	 */
	public static McObfPair field_178657_a = McMappingDatabase.getSRG("field_178657_a");

	/**
	 * <p>
	 * Name: exit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178641_d = McMappingDatabase.getSRG("SpectatorMenu.func_178641_d");

	/**
	 * <p>
	 * Name: getSelectedItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/spectator/ISpectatorMenuObject;]
	 * </p>
	 */
	public static McObfPair func_178645_b = McMappingDatabase.getSRG("SpectatorMenu.func_178645_b");

	/**
	 * <p>
	 * Name: listener
	 * </p>
	 */
	public static McObfPair field_178651_f = McMappingDatabase.getSRG("field_178651_f");

	/**
	 * <p>
	 * Name: category
	 * </p>
	 */
	public static McObfPair field_178659_h = McMappingDatabase.getSRG("field_178659_h");

	/**
	 * <p>
	 * Name: selectedSlot
	 * </p>
	 */
	public static McObfPair field_178660_i = McMappingDatabase.getSRG("field_178660_i");

	/**
	 * <p>
	 * Name: SCROLL_RIGHT_DISABLED
	 * </p>
	 */
	public static McObfPair field_178654_e = McMappingDatabase.getSRG("field_178654_e");

	/**
	 * <p>
	 * Name: SCROLL_RIGHT_ENABLED
	 * </p>
	 */
	public static McObfPair field_178653_d = McMappingDatabase.getSRG("field_178653_d");

	/**
	 * <p>
	 * Name: getSelectedSlot
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178648_e = McMappingDatabase.getSRG("SpectatorMenu.func_178648_e");

	/**
	 * <p>
	 * Name: selectSlot
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_178644_b = McMappingDatabase.getSRG("SpectatorMenu.func_178644_b");

	/**
	 * <p>
	 * Name: selectCategory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/spectator/ISpectatorMenuView;)V]
	 * </p>
	 */
	public static McObfPair func_178647_a = McMappingDatabase.getSRG("SpectatorMenu.func_178647_a");

	/**
	 * <p>
	 * Name: CLOSE_ITEM
	 * </p>
	 */
	public static McObfPair field_178655_b = McMappingDatabase.getSRG("field_178655_b");

	/**
	 * <p>
	 * Name: page
	 * </p>
	 */
	public static McObfPair field_178658_j = McMappingDatabase.getSRG("field_178658_j");

}

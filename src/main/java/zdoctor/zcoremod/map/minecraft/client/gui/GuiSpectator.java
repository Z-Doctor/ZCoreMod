package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiSpectator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjw";
		else
			return "net/minecraft/client/gui/GuiSpectator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjw";
		else
			return "GuiSpectator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjw;";
		else
			return "Lnet/minecraft/client/gui/GuiSpectator;";
	}

	/**
	 * <p>
	 * Name: renderSelectedItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ScaledResolution;)V]
	 * </p>
	 */
	public static McObfPair func_175263_a = McMappingDatabase.getSRG("GuiSpectator.func_175263_a");

	/**
	 * <p>
	 * Name: renderPage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ScaledResolution;FIFLnet/minecraft/client/gui/spectator/categories/SpectatorDetails;)V]
	 * </p>
	 */
	public static McObfPair func_175258_a = McMappingDatabase.getSRG("GuiSpectator.func_175258_a");

	/**
	 * <p>
	 * Name: isMenuActive
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175262_a = McMappingDatabase.getSRG("GuiSpectator.func_175262_a");

	/**
	 * <p>
	 * Name: renderSlot
	 * </p>
	 * <p>
	 * Desc: [(IIFFLnet/minecraft/client/gui/spectator/ISpectatorMenuObject;)V]
	 * </p>
	 */
	public static McObfPair func_175266_a = McMappingDatabase.getSRG("GuiSpectator.func_175266_a");

	/**
	 * <p>
	 * Name: onMouseScroll
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_175259_b = McMappingDatabase.getSRG("GuiSpectator.func_175259_b");

	/**
	 * <p>
	 * Name: getHotbarAlpha
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_175265_c = McMappingDatabase.getSRG("GuiSpectator.func_175265_c");

	/**
	 * <p>
	 * Name: WIDGETS
	 * </p>
	 */
	public static McObfPair field_175267_f = McMappingDatabase.getSRG("field_175267_f");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_175268_g = McMappingDatabase.getSRG("field_175268_g");

	/**
	 * <p>
	 * Name: onSpectatorMenuClosed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/spectator/SpectatorMenu;)V]
	 * </p>
	 */
	public static McObfPair func_175257_a = McMappingDatabase.getSRG("GuiSpectator.func_175257_a");

	/**
	 * <p>
	 * Name: SPECTATOR_WIDGETS
	 * </p>
	 */
	public static McObfPair field_175269_a = McMappingDatabase.getSRG("field_175269_a");

	/**
	 * <p>
	 * Name: lastSelectionTime
	 * </p>
	 */
	public static McObfPair field_175270_h = McMappingDatabase.getSRG("field_175270_h");

	/**
	 * <p>
	 * Name: onHotbarSelected
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_175260_a = McMappingDatabase.getSRG("GuiSpectator.func_175260_a");

	/**
	 * <p>
	 * Name: menu
	 * </p>
	 */
	public static McObfPair field_175271_i = McMappingDatabase.getSRG("field_175271_i");

	/**
	 * <p>
	 * Name: renderTooltip
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ScaledResolution;F)V]
	 * </p>
	 */
	public static McObfPair func_175264_a = McMappingDatabase.getSRG("GuiSpectator.func_175264_a");

	/**
	 * <p>
	 * Name: onMiddleClick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175261_b = McMappingDatabase.getSRG("GuiSpectator.func_175261_b");

}

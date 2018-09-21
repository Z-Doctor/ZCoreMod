package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiOverlayDebug {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjd";
		else
			return "net/minecraft/client/gui/GuiOverlayDebug";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjd";
		else
			return "GuiOverlayDebug";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjd;";
		else
			return "Lnet/minecraft/client/gui/GuiOverlayDebug;";
	}

	/**
	 * <p>
	 * Name: bytesToMb
	 * </p>
	 * <p>
	 * Desc: [(J)J]
	 * </p>
	 */
	public static McObfPair func_175240_a = McMappingDatabase.getSRG("GuiOverlayDebug.func_175240_a");

	/**
	 * <p>
	 * Name: renderDebugInfoLeft
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_180798_a = McMappingDatabase.getSRG("GuiOverlayDebug.func_180798_a");

	/**
	 * <p>
	 * Name: getDebugInfoRight
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_175238_c = McMappingDatabase.getSRG("GuiOverlayDebug.func_175238_c");

	/**
	 * <p>
	 * Name: fontRenderer
	 * </p>
	 */
	public static McObfPair field_175241_f = McMappingDatabase.getSRG("field_175241_f");

	/**
	 * <p>
	 * Name: getFrameColor
	 * </p>
	 * <p>
	 * Desc: [(IIII)I]
	 * </p>
	 */
	public static McObfPair func_181552_c = McMappingDatabase.getSRG("GuiOverlayDebug.func_181552_c");

	/**
	 * <p>
	 * Name: renderDebugInfoRight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ScaledResolution;)V]
	 * </p>
	 */
	public static McObfPair func_175239_b = McMappingDatabase.getSRG("GuiOverlayDebug.func_175239_b");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_175242_a = McMappingDatabase.getSRG("field_175242_a");

	/**
	 * <p>
	 * Name: renderDebugInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ScaledResolution;)V]
	 * </p>
	 */
	public static McObfPair func_175237_a = McMappingDatabase.getSRG("GuiOverlayDebug.func_175237_a");

	/**
	 * <p>
	 * Name: renderLagometer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_181554_e = McMappingDatabase.getSRG("GuiOverlayDebug.func_181554_e");

	/**
	 * <p>
	 * Name: blendColors
	 * </p>
	 * <p>
	 * Desc: [(IIF)I]
	 * </p>
	 */
	public static McObfPair func_181553_a = McMappingDatabase.getSRG("GuiOverlayDebug.func_181553_a");

}

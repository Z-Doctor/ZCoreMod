package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiSubtitleOverlay$Subtitle {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bju$a";
		else
			return "net/minecraft/client/gui/GuiSubtitleOverlay$Subtitle";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bju$a";
		else
			return "GuiSubtitleOverlay$Subtitle";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbju$a;";
		else
			return "Lnet/minecraft/client/gui/GuiSubtitleOverlay$Subtitle;";
	}

	/**
	 * <p>
	 * Name: getLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_186826_c = McMappingDatabase.getSRG("GuiSubtitleOverlay$Subtitle.func_186826_c");

	/**
	 * <p>
	 * Name: subtitle
	 * </p>
	 */
	public static McObfPair field_186828_b = McMappingDatabase.getSRG("field_186828_b");

	/**
	 * <p>
	 * Name: location
	 * </p>
	 */
	public static McObfPair field_186830_d = McMappingDatabase.getSRG("field_186830_d");

	/**
	 * <p>
	 * Name: refresh
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;)V]
	 * </p>
	 */
	public static McObfPair func_186823_a = McMappingDatabase.getSRG("GuiSubtitleOverlay$Subtitle.func_186823_a");

	/**
	 * <p>
	 * Name: startTime
	 * </p>
	 */
	public static McObfPair field_186829_c = McMappingDatabase.getSRG("field_186829_c");

	/**
	 * <p>
	 * Name: getString
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_186824_a = McMappingDatabase.getSRG("GuiSubtitleOverlay$Subtitle.func_186824_a");

	/**
	 * <p>
	 * Name: getStartTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_186825_b = McMappingDatabase.getSRG("GuiSubtitleOverlay$Subtitle.func_186825_b");

}

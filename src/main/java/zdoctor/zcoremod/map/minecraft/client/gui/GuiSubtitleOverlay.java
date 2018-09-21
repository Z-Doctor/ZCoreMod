package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiSubtitleOverlay {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bju";
		else
			return "net/minecraft/client/gui/GuiSubtitleOverlay";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bju";
		else
			return "GuiSubtitleOverlay";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbju;";
		else
			return "Lnet/minecraft/client/gui/GuiSubtitleOverlay;";
	}

	/**
	 * <p>
	 * Name: client
	 * </p>
	 */
	public static McObfPair field_184069_a = McMappingDatabase.getSRG("field_184069_a");

	/**
	 * <p>
	 * Name: subtitles
	 * </p>
	 */
	public static McObfPair field_184070_f = McMappingDatabase.getSRG("field_184070_f");

	/**
	 * <p>
	 * Name: soundPlay
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/audio/ISound;Lnet/minecraft/client/audio/SoundEventAccessor;)V]
	 * </p>
	 */
	public static McObfPair func_184067_a = McMappingDatabase.getSRG("GuiSubtitleOverlay.func_184067_a");

	/**
	 * <p>
	 * Name: enabled
	 * </p>
	 */
	public static McObfPair field_184071_g = McMappingDatabase.getSRG("field_184071_g");

	/**
	 * <p>
	 * Name: renderSubtitles
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/ScaledResolution;)V]
	 * </p>
	 */
	public static McObfPair func_184068_a = McMappingDatabase.getSRG("GuiSubtitleOverlay.func_184068_a");

}

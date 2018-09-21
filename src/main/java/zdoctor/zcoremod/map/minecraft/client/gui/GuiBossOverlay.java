package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiBossOverlay {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "biz";
		else
			return "net/minecraft/client/gui/GuiBossOverlay";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "biz";
		else
			return "GuiBossOverlay";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbiz;";
		else
			return "Lnet/minecraft/client/gui/GuiBossOverlay;";
	}

	/**
	 * <p>
	 * Name: shouldPlayEndBossMusic
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184054_d = McMappingDatabase.getSRG("GuiBossOverlay.func_184054_d");

	/**
	 * <p>
	 * Name: clearBossInfos
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184057_b = McMappingDatabase.getSRG("GuiBossOverlay.func_184057_b");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketUpdateBossInfo;)V]
	 * </p>
	 */
	public static McObfPair func_184055_a = McMappingDatabase.getSRG("GuiBossOverlay.func_184055_a");

	/**
	 * <p>
	 * Name: renderBossHealth
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184051_a = McMappingDatabase.getSRG("GuiBossOverlay.func_184051_a");

	/**
	 * <p>
	 * Name: mapBossInfos
	 * </p>
	 */
	public static McObfPair field_184060_g = McMappingDatabase.getSRG("field_184060_g");

	/**
	 * <p>
	 * Name: shouldDarkenSky
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184053_e = McMappingDatabase.getSRG("GuiBossOverlay.func_184053_e");

	/**
	 * <p>
	 * Name: GUI_BARS_TEXTURES
	 * </p>
	 */
	public static McObfPair field_184058_a = McMappingDatabase.getSRG("field_184058_a");

	/**
	 * <p>
	 * Name: shouldCreateFog
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184056_f = McMappingDatabase.getSRG("GuiBossOverlay.func_184056_f");

	/**
	 * <p>
	 * Name: client
	 * </p>
	 */
	public static McObfPair field_184059_f = McMappingDatabase.getSRG("field_184059_f");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/world/BossInfo;)V]
	 * </p>
	 */
	public static McObfPair func_184052_a = McMappingDatabase.getSRG("GuiBossOverlay.func_184052_a");

}

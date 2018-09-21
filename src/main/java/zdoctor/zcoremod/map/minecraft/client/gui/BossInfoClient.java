package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BossInfoClient {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjj";
		else
			return "net/minecraft/client/gui/BossInfoClient";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjj";
		else
			return "BossInfoClient";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjj;";
		else
			return "Lnet/minecraft/client/gui/BossInfoClient;";
	}

	/**
	 * <p>
	 * Name: setPercent
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_186735_a = McMappingDatabase.getSRG("BossInfoClient.func_186735_a");

	/**
	 * <p>
	 * Name: updateFromPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketUpdateBossInfo;)V]
	 * </p>
	 */
	public static McObfPair func_186765_a = McMappingDatabase.getSRG("BossInfoClient.func_186765_a");

	/**
	 * <p>
	 * Name: getPercent
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_186738_f = McMappingDatabase.getSRG("BossInfoClient.func_186738_f");

	/**
	 * <p>
	 * Name: percentSetTime
	 * </p>
	 */
	public static McObfPair field_186767_i = McMappingDatabase.getSRG("field_186767_i");

	/**
	 * <p>
	 * Name: rawPercent
	 * </p>
	 */
	public static McObfPair field_186766_h = McMappingDatabase.getSRG("field_186766_h");

}

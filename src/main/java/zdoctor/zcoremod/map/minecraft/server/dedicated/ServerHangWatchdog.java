package zdoctor.zcoremod.map.minecraft.server.dedicated;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerHangWatchdog {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oa";
		else
			return "net/minecraft/server/dedicated/ServerHangWatchdog";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oa";
		else
			return "ServerHangWatchdog";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Loa;";
		else
			return "Lnet/minecraft/server/dedicated/ServerHangWatchdog;";
	}

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_180251_a = McMappingDatabase.getSRG("field_180251_a");

	/**
	 * <p>
	 * Name: maxTickTime
	 * </p>
	 */
	public static McObfPair field_180250_c = McMappingDatabase.getSRG("field_180250_c");

	/**
	 * <p>
	 * Name: scheduleHalt
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_180248_a = McMappingDatabase.getSRG("ServerHangWatchdog.func_180248_a");

	/**
	 * <p>
	 * Name: server
	 * </p>
	 */
	public static McObfPair field_180249_b = McMappingDatabase.getSRG("field_180249_b");

}

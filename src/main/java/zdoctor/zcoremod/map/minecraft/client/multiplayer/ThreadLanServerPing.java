package zdoctor.zcoremod.map.minecraft.client.multiplayer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ThreadLanServerPing {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chh";
		else
			return "net/minecraft/client/multiplayer/ThreadLanServerPing";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chh";
		else
			return "ThreadLanServerPing";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchh;";
		else
			return "Lnet/minecraft/client/multiplayer/ThreadLanServerPing;";
	}

	/**
	 * <p>
	 * Name: isStopping
	 * </p>
	 */
	public static McObfPair field_77526_d = McMappingDatabase.getSRG("field_77526_d");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_148657_b = McMappingDatabase.getSRG("field_148657_b");

	/**
	 * <p>
	 * Name: getMotdFromPingResponse
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77524_a = McMappingDatabase.getSRG("ThreadLanServerPing.func_77524_a");

	/**
	 * <p>
	 * Name: getAdFromPingResponse
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77523_b = McMappingDatabase.getSRG("ThreadLanServerPing.func_77523_b");

	/**
	 * <p>
	 * Name: motd
	 * </p>
	 */
	public static McObfPair field_77528_b = McMappingDatabase.getSRG("field_77528_b");

	/**
	 * <p>
	 * Name: getPingResponse
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77525_a = McMappingDatabase.getSRG("ThreadLanServerPing.func_77525_a");

	/**
	 * <p>
	 * Name: address
	 * </p>
	 */
	public static McObfPair field_77527_e = McMappingDatabase.getSRG("field_77527_e");

	/**
	 * <p>
	 * Name: UNIQUE_THREAD_ID
	 * </p>
	 */
	public static McObfPair field_148658_a = McMappingDatabase.getSRG("field_148658_a");

	/**
	 * <p>
	 * Name: socket
	 * </p>
	 */
	public static McObfPair field_77529_c = McMappingDatabase.getSRG("field_77529_c");

}

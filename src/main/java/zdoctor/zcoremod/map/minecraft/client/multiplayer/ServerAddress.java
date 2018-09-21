package zdoctor.zcoremod.map.minecraft.client.multiplayer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerAddress {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsd";
		else
			return "net/minecraft/client/multiplayer/ServerAddress";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsd";
		else
			return "ServerAddress";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsd;";
		else
			return "Lnet/minecraft/client/multiplayer/ServerAddress;";
	}

	/**
	 * <p>
	 * Name: getIP
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_78861_a = McMappingDatabase.getSRG("ServerAddress.func_78861_a");

	/**
	 * <p>
	 * Name: getServerAddress
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_78863_b = McMappingDatabase.getSRG("ServerAddress.func_78863_b");

	/**
	 * <p>
	 * Name: ipAddress
	 * </p>
	 */
	public static McObfPair field_78866_a = McMappingDatabase.getSRG("field_78866_a");

	/**
	 * <p>
	 * Name: getPort
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_78864_b = McMappingDatabase.getSRG("ServerAddress.func_78864_b");

	/**
	 * <p>
	 * Name: serverPort
	 * </p>
	 */
	public static McObfPair field_78865_b = McMappingDatabase.getSRG("field_78865_b");

	/**
	 * <p>
	 * Name: getInt
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)I]
	 * </p>
	 */
	public static McObfPair func_78862_a = McMappingDatabase.getSRG("ServerAddress.func_78862_a");

	/**
	 * <p>
	 * Name: fromString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/ServerAddress;]
	 * </p>
	 */
	public static McObfPair func_78860_a = McMappingDatabase.getSRG("ServerAddress.func_78860_a");

}

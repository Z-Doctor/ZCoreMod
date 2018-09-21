package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class UserListIPBans {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pi";
		else
			return "net/minecraft/server/management/UserListIPBans";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pi";
		else
			return "UserListIPBans";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpi;";
		else
			return "Lnet/minecraft/server/management/UserListIPBans;";
	}

	/**
	 * <p>
	 * Name: isBanned
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/SocketAddress;)Z]
	 * </p>
	 */
	public static McObfPair func_152708_a = McMappingDatabase.getSRG("UserListIPBans.func_152708_a");

	/**
	 * <p>
	 * Name: getBanEntry
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/SocketAddress;)Lnet/minecraft/server/management/UserListIPBansEntry;]
	 * </p>
	 */
	public static McObfPair func_152709_b = McMappingDatabase.getSRG("UserListIPBans.func_152709_b");

	/**
	 * <p>
	 * Name: addressToString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/SocketAddress;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_152707_c = McMappingDatabase.getSRG("UserListIPBans.func_152707_c");

	/**
	 * <p>
	 * Name: createEntry
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/server/management/UserListEntry;]
	 * </p>
	 */
	public static McObfPair func_152682_a = McMappingDatabase.getSRG("UserListIPBans.func_152682_a");

}

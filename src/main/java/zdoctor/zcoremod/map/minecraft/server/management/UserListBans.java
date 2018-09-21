package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class UserListBans {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pq";
		else
			return "net/minecraft/server/management/UserListBans";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pq";
		else
			return "UserListBans";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpq;";
		else
			return "Lnet/minecraft/server/management/UserListBans;";
	}

	/**
	 * <p>
	 * Name: getKeys
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_152685_a = McMappingDatabase.getSRG("UserListBans.func_152685_a");

	/**
	 * <p>
	 * Name: createEntry
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/server/management/UserListEntry;]
	 * </p>
	 */
	public static McObfPair func_152682_a = McMappingDatabase.getSRG("UserListBans.func_152682_a");

	/**
	 * <p>
	 * Name: getBannedProfile
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_152703_a = McMappingDatabase.getSRG("UserListBans.func_152703_a");

	/**
	 * <p>
	 * Name: getObjectKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)Ljava/lang/String;, (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_152681_a = McMappingDatabase.getSRG("UserListBans.func_152681_a");

	/**
	 * <p>
	 * Name: isBanned
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)Z]
	 * </p>
	 */
	public static McObfPair func_152702_a = McMappingDatabase.getSRG("UserListBans.func_152702_a");

}

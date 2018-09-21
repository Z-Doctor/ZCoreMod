package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class UserListWhitelist {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ps";
		else
			return "net/minecraft/server/management/UserListWhitelist";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ps";
		else
			return "UserListWhitelist";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lps;";
		else
			return "Lnet/minecraft/server/management/UserListWhitelist;";
	}

	/**
	 * <p>
	 * Name: isWhitelisted
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)Z]
	 * </p>
	 */
	public static McObfPair func_152705_a = McMappingDatabase.getSRG("UserListWhitelist.func_152705_a");

	/**
	 * <p>
	 * Name: createEntry
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/server/management/UserListEntry;]
	 * </p>
	 */
	public static McObfPair func_152682_a = McMappingDatabase.getSRG("UserListWhitelist.func_152682_a");

	/**
	 * <p>
	 * Name: getObjectKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)Ljava/lang/String;, (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_152681_a = McMappingDatabase.getSRG("UserListWhitelist.func_152681_a");

	/**
	 * <p>
	 * Name: getKeys
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_152685_a = McMappingDatabase.getSRG("UserListWhitelist.func_152685_a");

	/**
	 * <p>
	 * Name: getByName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_152706_a = McMappingDatabase.getSRG("UserListWhitelist.func_152706_a");

}

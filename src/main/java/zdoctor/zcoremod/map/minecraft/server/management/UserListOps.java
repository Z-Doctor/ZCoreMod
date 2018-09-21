package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class UserListOps {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pm";
		else
			return "net/minecraft/server/management/UserListOps";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pm";
		else
			return "UserListOps";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpm;";
		else
			return "Lnet/minecraft/server/management/UserListOps;";
	}

	/**
	 * <p>
	 * Name: createEntry
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/server/management/UserListEntry;]
	 * </p>
	 */
	public static McObfPair func_152682_a = McMappingDatabase.getSRG("UserListOps.func_152682_a");

	/**
	 * <p>
	 * Name: getPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)I]
	 * </p>
	 */
	public static McObfPair func_187452_a = McMappingDatabase.getSRG("UserListOps.func_187452_a");

	/**
	 * <p>
	 * Name: getObjectKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)Ljava/lang/String;, (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_152681_a = McMappingDatabase.getSRG("UserListOps.func_152681_a");

	/**
	 * <p>
	 * Name: getGameProfileFromName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_152700_a = McMappingDatabase.getSRG("UserListOps.func_152700_a");

	/**
	 * <p>
	 * Name: getKeys
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_152685_a = McMappingDatabase.getSRG("UserListOps.func_152685_a");

	/**
	 * <p>
	 * Name: bypassesPlayerLimit
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)Z]
	 * </p>
	 */
	public static McObfPair func_183026_b = McMappingDatabase.getSRG("UserListOps.func_183026_b");

}

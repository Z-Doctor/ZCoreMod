package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class UserListWhitelistEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pt";
		else
			return "net/minecraft/server/management/UserListWhitelistEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pt";
		else
			return "UserListWhitelistEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpt;";
		else
			return "Lnet/minecraft/server/management/UserListWhitelistEntry;";
	}

	/**
	 * <p>
	 * Name: onSerialization
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)V]
	 * </p>
	 */
	public static McObfPair func_152641_a = McMappingDatabase.getSRG("UserListWhitelistEntry.func_152641_a");

	/**
	 * <p>
	 * Name: gameProfileFromJsonObject
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_152646_b = McMappingDatabase.getSRG("UserListWhitelistEntry.func_152646_b");

}

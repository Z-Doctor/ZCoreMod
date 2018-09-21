package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class UserListOpsEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pn";
		else
			return "net/minecraft/server/management/UserListOpsEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pn";
		else
			return "UserListOpsEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpn;";
		else
			return "Lnet/minecraft/server/management/UserListOpsEntry;";
	}

	/**
	 * <p>
	 * Name: getPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_152644_a = McMappingDatabase.getSRG("UserListOpsEntry.func_152644_a");

	/**
	 * <p>
	 * Name: permissionLevel
	 * </p>
	 */
	public static McObfPair field_152645_a = McMappingDatabase.getSRG("field_152645_a");

	/**
	 * <p>
	 * Name: bypassesPlayerLimit
	 * </p>
	 */
	public static McObfPair field_183025_b = McMappingDatabase.getSRG("field_183025_b");

	/**
	 * <p>
	 * Name: onSerialization
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)V]
	 * </p>
	 */
	public static McObfPair func_152641_a = McMappingDatabase.getSRG("UserListOpsEntry.func_152641_a");

	/**
	 * <p>
	 * Name: constructProfile
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_152643_b = McMappingDatabase.getSRG("UserListOpsEntry.func_152643_b");

	/**
	 * <p>
	 * Name: bypassesPlayerLimit
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_183024_b = McMappingDatabase.getSRG("UserListOpsEntry.func_183024_b");

}

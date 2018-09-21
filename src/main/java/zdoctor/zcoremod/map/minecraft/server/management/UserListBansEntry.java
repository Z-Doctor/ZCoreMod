package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class UserListBansEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pr";
		else
			return "net/minecraft/server/management/UserListBansEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pr";
		else
			return "UserListBansEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpr;";
		else
			return "Lnet/minecraft/server/management/UserListBansEntry;";
	}

	/**
	 * <p>
	 * Name: toGameProfile
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_152648_b = McMappingDatabase.getSRG("UserListBansEntry.func_152648_b");

	/**
	 * <p>
	 * Name: onSerialization
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)V]
	 * </p>
	 */
	public static McObfPair func_152641_a = McMappingDatabase.getSRG("UserListBansEntry.func_152641_a");

}

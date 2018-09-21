package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class UserListIPBansEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pj";
		else
			return "net/minecraft/server/management/UserListIPBansEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pj";
		else
			return "UserListIPBansEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpj;";
		else
			return "Lnet/minecraft/server/management/UserListIPBansEntry;";
	}

	/**
	 * <p>
	 * Name: getIPFromJson
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_152647_b = McMappingDatabase.getSRG("UserListIPBansEntry.func_152647_b");

	/**
	 * <p>
	 * Name: onSerialization
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)V]
	 * </p>
	 */
	public static McObfPair func_152641_a = McMappingDatabase.getSRG("UserListIPBansEntry.func_152641_a");

}

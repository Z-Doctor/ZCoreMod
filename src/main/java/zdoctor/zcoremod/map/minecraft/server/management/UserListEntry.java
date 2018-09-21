package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class UserListEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "po";
		else
			return "net/minecraft/server/management/UserListEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "po";
		else
			return "UserListEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpo;";
		else
			return "Lnet/minecraft/server/management/UserListEntry;";
	}

	/**
	 * <p>
	 * Name: onSerialization
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)V]
	 * </p>
	 */
	public static McObfPair func_152641_a = McMappingDatabase.getSRG("UserListEntry.func_152641_a");

	/**
	 * <p>
	 * Name: hasBanExpired
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73682_e = McMappingDatabase.getSRG("UserListEntry.func_73682_e");

	/**
	 * <p>
	 * Name: getValue
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_152640_f = McMappingDatabase.getSRG("UserListEntry.func_152640_f");

	/**
	 * <p>
	 * Name: value
	 * </p>
	 */
	public static McObfPair field_152642_a = McMappingDatabase.getSRG("field_152642_a");

}

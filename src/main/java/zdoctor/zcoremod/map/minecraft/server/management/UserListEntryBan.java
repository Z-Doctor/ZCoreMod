package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class UserListEntryBan {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pg";
		else
			return "net/minecraft/server/management/UserListEntryBan";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pg";
		else
			return "UserListEntryBan";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpg;";
		else
			return "Lnet/minecraft/server/management/UserListEntryBan;";
	}

	/**
	 * <p>
	 * Name: banStartDate
	 * </p>
	 */
	public static McObfPair field_73694_d = McMappingDatabase.getSRG("field_73694_d");

	/**
	 * <p>
	 * Name: getBanReason
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_73686_f = McMappingDatabase.getSRG("UserListEntryBan.func_73686_f");

	/**
	 * <p>
	 * Name: banEndDate
	 * </p>
	 */
	public static McObfPair field_73692_f = McMappingDatabase.getSRG("field_73692_f");

	/**
	 * <p>
	 * Name: getBanEndDate
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Date;]
	 * </p>
	 */
	public static McObfPair func_73680_d = McMappingDatabase.getSRG("UserListEntryBan.func_73680_d");

	/**
	 * <p>
	 * Name: reason
	 * </p>
	 */
	public static McObfPair field_73693_g = McMappingDatabase.getSRG("field_73693_g");

	/**
	 * <p>
	 * Name: DATE_FORMAT
	 * </p>
	 */
	public static McObfPair field_73698_a = McMappingDatabase.getSRG("field_73698_a");

	/**
	 * <p>
	 * Name: bannedBy
	 * </p>
	 */
	public static McObfPair field_73695_e = McMappingDatabase.getSRG("field_73695_e");

	/**
	 * <p>
	 * Name: hasBanExpired
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73682_e = McMappingDatabase.getSRG("UserListEntryBan.func_73682_e");

	/**
	 * <p>
	 * Name: onSerialization
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)V]
	 * </p>
	 */
	public static McObfPair func_152641_a = McMappingDatabase.getSRG("UserListEntryBan.func_152641_a");

}

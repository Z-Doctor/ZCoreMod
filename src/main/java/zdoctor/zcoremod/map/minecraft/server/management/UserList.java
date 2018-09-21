package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class UserList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pp";
		else
			return "net/minecraft/server/management/UserList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pp";
		else
			return "UserList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpp;";
		else
			return "Lnet/minecraft/server/management/UserList;";
	}

	/**
	 * <p>
	 * Name: values
	 * </p>
	 */
	public static McObfPair field_152696_d = McMappingDatabase.getSRG("field_152696_d");

	/**
	 * <p>
	 * Name: getEntry
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)Lnet/minecraft/server/management/UserListEntry;]
	 * </p>
	 */
	public static McObfPair func_152683_b = McMappingDatabase.getSRG("UserList.func_152683_b");

	/**
	 * <p>
	 * Name: saveFile
	 * </p>
	 */
	public static McObfPair field_152695_c = McMappingDatabase.getSRG("field_152695_c");

	/**
	 * <p>
	 * Name: gson
	 * </p>
	 */
	public static McObfPair field_152694_b = McMappingDatabase.getSRG("field_152694_b");

	/**
	 * <p>
	 * Name: getKeys
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_152685_a = McMappingDatabase.getSRG("UserList.func_152685_a");

	/**
	 * <p>
	 * Name: USER_LIST_ENTRY_TYPE
	 * </p>
	 */
	public static McObfPair field_152698_f = McMappingDatabase.getSRG("field_152698_f");

	/**
	 * <p>
	 * Name: isLanServer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_152689_b = McMappingDatabase.getSRG("UserList.func_152689_b");

	/**
	 * <p>
	 * Name: getObjectKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_152681_a = McMappingDatabase.getSRG("UserList.func_152681_a");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_152690_d = McMappingDatabase.getSRG("UserList.func_152690_d");

	/**
	 * <p>
	 * Name: removeExpired
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_152680_h = McMappingDatabase.getSRG("UserList.func_152680_h");

	/**
	 * <p>
	 * Name: createEntry
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/server/management/UserListEntry;]
	 * </p>
	 */
	public static McObfPair func_152682_a = McMappingDatabase.getSRG("UserList.func_152682_a");

	/**
	 * <p>
	 * Name: getSaveFile
	 * </p>
	 * <p>
	 * Desc: [()Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_152691_c = McMappingDatabase.getSRG("UserList.func_152691_c");

	/**
	 * <p>
	 * Name: addEntry
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/management/UserListEntry;)V]
	 * </p>
	 */
	public static McObfPair func_152687_a = McMappingDatabase.getSRG("UserList.func_152687_a");

	/**
	 * <p>
	 * Name: readSavedFile
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_152679_g = McMappingDatabase.getSRG("UserList.func_152679_g");

	/**
	 * <p>
	 * Name: lanServer
	 * </p>
	 */
	public static McObfPair field_152697_e = McMappingDatabase.getSRG("field_152697_e");

	/**
	 * <p>
	 * Name: setLanServer
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_152686_a = McMappingDatabase.getSRG("UserList.func_152686_a");

	/**
	 * <p>
	 * Name: getValues
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_152688_e = McMappingDatabase.getSRG("UserList.func_152688_e");

	/**
	 * <p>
	 * Name: removeEntry
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_152684_c = McMappingDatabase.getSRG("UserList.func_152684_c");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_152693_a = McMappingDatabase.getSRG("field_152693_a");

	/**
	 * <p>
	 * Name: hasEntry
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)Z]
	 * </p>
	 */
	public static McObfPair func_152692_d = McMappingDatabase.getSRG("UserList.func_152692_d");

	/**
	 * <p>
	 * Name: writeChanges
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_152678_f = McMappingDatabase.getSRG("UserList.func_152678_f");

}

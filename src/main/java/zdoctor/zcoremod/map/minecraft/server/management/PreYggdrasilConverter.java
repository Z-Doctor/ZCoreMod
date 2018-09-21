package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PreYggdrasilConverter {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pk";
		else
			return "net/minecraft/server/management/PreYggdrasilConverter";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pk";
		else
			return "PreYggdrasilConverter";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpk;";
		else
			return "Lnet/minecraft/server/management/PreYggdrasilConverter;";
	}

	/**
	 * <p>
	 * Name: convertIpBanlist
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;)Z]
	 * </p>
	 */
	public static McObfPair func_152722_b = McMappingDatabase.getSRG("PreYggdrasilConverter.func_152722_b");

	/**
	 * <p>
	 * Name: convertOplist
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;)Z]
	 * </p>
	 */
	public static McObfPair func_152718_c = McMappingDatabase.getSRG("PreYggdrasilConverter.func_152718_c");

	/**
	 * <p>
	 * Name: lookupNames
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Ljava/util/Collection;Lcom/mojang/authlib/ProfileLookupCallback;)V]
	 * </p>
	 */
	public static McObfPair func_152717_a = McMappingDatabase.getSRG("PreYggdrasilConverter.func_152717_a");

	/**
	 * <p>
	 * Name: tryConvert
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/dedicated/PropertyManager;)Z]
	 * </p>
	 */
	public static McObfPair func_152714_a = McMappingDatabase.getSRG("PreYggdrasilConverter.func_152714_a");

	/**
	 * <p>
	 * Name: parseDate
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/util/Date;)Ljava/util/Date;]
	 * </p>
	 */
	public static McObfPair func_152713_b = McMappingDatabase.getSRG("PreYggdrasilConverter.func_152713_b");

	/**
	 * <p>
	 * Name: OLD_WHITELIST_FILE
	 * </p>
	 */
	public static McObfPair field_152731_d = McMappingDatabase.getSRG("field_152731_d");

	/**
	 * <p>
	 * Name: hasUnconvertablePlayerFiles
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/dedicated/PropertyManager;)Z]
	 * </p>
	 */
	public static McObfPair func_152715_c = McMappingDatabase.getSRG("PreYggdrasilConverter.func_152715_c");

	/**
	 * <p>
	 * Name: readFile
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;Ljava/util/Map;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_152721_a = McMappingDatabase.getSRG("PreYggdrasilConverter.func_152721_a");

	/**
	 * <p>
	 * Name: hasUnconvertableFiles
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/dedicated/PropertyManager;)Z]
	 * </p>
	 */
	public static McObfPair func_152712_b = McMappingDatabase.getSRG("PreYggdrasilConverter.func_152712_b");

	/**
	 * <p>
	 * Name: mkdir
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;)V]
	 * </p>
	 */
	public static McObfPair func_152711_b = McMappingDatabase.getSRG("PreYggdrasilConverter.func_152711_b");

	/**
	 * <p>
	 * Name: OLD_PLAYERBAN_FILE
	 * </p>
	 */
	public static McObfPair field_152729_b = McMappingDatabase.getSRG("field_152729_b");

	/**
	 * <p>
	 * Name: convertUserBanlist
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;)Z]
	 * </p>
	 */
	public static McObfPair func_152724_a = McMappingDatabase.getSRG("PreYggdrasilConverter.func_152724_a");

	/**
	 * <p>
	 * Name: convertMobOwnerIfNeeded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_187473_a = McMappingDatabase.getSRG("PreYggdrasilConverter.func_187473_a");

	/**
	 * <p>
	 * Name: convertSaveFiles
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/dedicated/DedicatedServer;Lnet/minecraft/server/dedicated/PropertyManager;)Z]
	 * </p>
	 */
	public static McObfPair func_152723_a = McMappingDatabase.getSRG("PreYggdrasilConverter.func_152723_a");

	/**
	 * <p>
	 * Name: convertWhitelist
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;)Z]
	 * </p>
	 */
	public static McObfPair func_152710_d = McMappingDatabase.getSRG("PreYggdrasilConverter.func_152710_d");

	/**
	 * <p>
	 * Name: backupConverted
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;)V]
	 * </p>
	 */
	public static McObfPair func_152727_c = McMappingDatabase.getSRG("PreYggdrasilConverter.func_152727_c");

	/**
	 * <p>
	 * Name: OLD_IPBAN_FILE
	 * </p>
	 */
	public static McObfPair field_152728_a = McMappingDatabase.getSRG("field_152728_a");

	/**
	 * <p>
	 * Name: getPlayersDirectory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/dedicated/PropertyManager;)Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_152725_d = McMappingDatabase.getSRG("PreYggdrasilConverter.func_152725_d");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_152732_e = McMappingDatabase.getSRG("field_152732_e");

	/**
	 * <p>
	 * Name: OLD_OPS_FILE
	 * </p>
	 */
	public static McObfPair field_152730_c = McMappingDatabase.getSRG("field_152730_c");

}

package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlayerProfileCache {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ph";
		else
			return "net/minecraft/server/management/PlayerProfileCache";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ph";
		else
			return "PlayerProfileCache";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lph;";
		else
			return "Lnet/minecraft/server/management/PlayerProfileCache;";
	}

	/**
	 * <p>
	 * Name: usercacheFile
	 * </p>
	 */
	public static McObfPair field_152665_g = McMappingDatabase.getSRG("field_152665_g");

	/**
	 * <p>
	 * Name: setOnlineMode
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_187320_a = McMappingDatabase.getSRG("PlayerProfileCache.func_187320_a");

	/**
	 * <p>
	 * Name: lookupProfile
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfileRepository;Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_187319_a = McMappingDatabase.getSRG("PlayerProfileCache.func_187319_a");

	/**
	 * <p>
	 * Name: DATE_FORMAT
	 * </p>
	 */
	public static McObfPair field_152659_a = McMappingDatabase.getSRG("field_152659_a");

	/**
	 * <p>
	 * Name: getUsernames
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_152654_a = McMappingDatabase.getSRG("PlayerProfileCache.func_152654_a");

	/**
	 * <p>
	 * Name: gson
	 * </p>
	 */
	public static McObfPair field_152660_b = McMappingDatabase.getSRG("field_152660_b");

	/**
	 * <p>
	 * Name: usernameToProfileEntryMap
	 * </p>
	 */
	public static McObfPair field_152661_c = McMappingDatabase.getSRG("field_152661_c");

	/**
	 * <p>
	 * Name: save
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_152658_c = McMappingDatabase.getSRG("PlayerProfileCache.func_152658_c");

	/**
	 * <p>
	 * Name: TYPE
	 * </p>
	 */
	public static McObfPair field_152666_h = McMappingDatabase.getSRG("field_152666_h");

	/**
	 * <p>
	 * Name: isOnlineMode
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_187321_d = McMappingDatabase.getSRG("PlayerProfileCache.func_187321_d");

	/**
	 * <p>
	 * Name: gameProfiles
	 * </p>
	 */
	public static McObfPair field_152663_e = McMappingDatabase.getSRG("field_152663_e");

	/**
	 * <p>
	 * Name: profileRepo
	 * </p>
	 */
	public static McObfPair field_187323_g = McMappingDatabase.getSRG("field_187323_g");

	/**
	 * <p>
	 * Name: getGameProfileForUsername
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_152655_a = McMappingDatabase.getSRG("PlayerProfileCache.func_152655_a");

	/**
	 * <p>
	 * Name: addEntry
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;Ljava/util/Date;)V]
	 * </p>
	 */
	public static McObfPair func_152651_a = McMappingDatabase.getSRG("PlayerProfileCache.func_152651_a");

	/**
	 * <p>
	 * Name: addEntry
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)V]
	 * </p>
	 */
	public static McObfPair func_152649_a = McMappingDatabase.getSRG("PlayerProfileCache.func_152649_a");

	/**
	 * <p>
	 * Name: getByUUID
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)Lnet/minecraft/server/management/PlayerProfileCache$ProfileEntry;]
	 * </p>
	 */
	public static McObfPair func_152653_b = McMappingDatabase.getSRG("PlayerProfileCache.func_152653_b");

	/**
	 * <p>
	 * Name: load
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_152657_b = McMappingDatabase.getSRG("PlayerProfileCache.func_152657_b");

	/**
	 * <p>
	 * Name: uuidToProfileEntryMap
	 * </p>
	 */
	public static McObfPair field_152662_d = McMappingDatabase.getSRG("field_152662_d");

	/**
	 * <p>
	 * Name: onlineMode
	 * </p>
	 */
	public static McObfPair field_187322_c = McMappingDatabase.getSRG("field_187322_c");

	/**
	 * <p>
	 * Name: getEntriesWithLimit
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_152656_a = McMappingDatabase.getSRG("PlayerProfileCache.func_152656_a");

	/**
	 * <p>
	 * Name: getProfileByUUID
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_152652_a = McMappingDatabase.getSRG("PlayerProfileCache.func_152652_a");

}

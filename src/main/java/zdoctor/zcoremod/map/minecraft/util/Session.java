package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Session {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bii";
		else
			return "net/minecraft/util/Session";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bii";
		else
			return "Session";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbii;";
		else
			return "Lnet/minecraft/util/Session;";
	}

	/**
	 * <p>
	 * Name: token
	 * </p>
	 */
	public static McObfPair field_148258_c = McMappingDatabase.getSRG("field_148258_c");

	/**
	 * <p>
	 * Name: getSessionID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_111286_b = McMappingDatabase.getSRG("Session.func_111286_b");

	/**
	 * <p>
	 * Name: getUsername
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_111285_a = McMappingDatabase.getSRG("Session.func_111285_a");

	/**
	 * <p>
	 * Name: getPlayerID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148255_b = McMappingDatabase.getSRG("Session.func_148255_b");

	/**
	 * <p>
	 * Name: playerID
	 * </p>
	 */
	public static McObfPair field_148257_b = McMappingDatabase.getSRG("field_148257_b");

	/**
	 * <p>
	 * Name: getToken
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148254_d = McMappingDatabase.getSRG("Session.func_148254_d");

	/**
	 * <p>
	 * Name: getProfile
	 * </p>
	 * <p>
	 * Desc: [()Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_148256_e = McMappingDatabase.getSRG("Session.func_148256_e");

	/**
	 * <p>
	 * Name: sessionType
	 * </p>
	 */
	public static McObfPair field_152429_d = McMappingDatabase.getSRG("field_152429_d");

	/**
	 * <p>
	 * Name: username
	 * </p>
	 */
	public static McObfPair field_74286_b = McMappingDatabase.getSRG("field_74286_b");

}

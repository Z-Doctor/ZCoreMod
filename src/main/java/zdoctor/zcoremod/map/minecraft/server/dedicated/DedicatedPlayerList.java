package zdoctor.zcoremod.map.minecraft.server.dedicated;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DedicatedPlayerList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ny";
		else
			return "net/minecraft/server/dedicated/DedicatedPlayerList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ny";
		else
			return "DedicatedPlayerList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lny;";
		else
			return "Lnet/minecraft/server/dedicated/DedicatedPlayerList;";
	}

	/**
	 * <p>
	 * Name: loadIPBanList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187249_y = McMappingDatabase.getSRG("DedicatedPlayerList.func_187249_y");

	/**
	 * <p>
	 * Name: saveIPBanList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187247_w = McMappingDatabase.getSRG("DedicatedPlayerList.func_187247_w");

	/**
	 * <p>
	 * Name: readWhiteList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72418_v = McMappingDatabase.getSRG("DedicatedPlayerList.func_72418_v");

	/**
	 * <p>
	 * Name: saveWhiteList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72421_w = McMappingDatabase.getSRG("DedicatedPlayerList.func_72421_w");

	/**
	 * <p>
	 * Name: saveOpsList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72419_u = McMappingDatabase.getSRG("DedicatedPlayerList.func_72419_u");

	/**
	 * <p>
	 * Name: removePlayerFromWhitelist
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)V]
	 * </p>
	 */
	public static McObfPair func_152597_c = McMappingDatabase.getSRG("DedicatedPlayerList.func_152597_c");

	/**
	 * <p>
	 * Name: setWhiteListEnabled
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_72371_a = McMappingDatabase.getSRG("DedicatedPlayerList.func_72371_a");

	/**
	 * <p>
	 * Name: loadOpsList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72417_t = McMappingDatabase.getSRG("DedicatedPlayerList.func_72417_t");

	/**
	 * <p>
	 * Name: loadPlayerBanList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187246_z = McMappingDatabase.getSRG("DedicatedPlayerList.func_187246_z");

	/**
	 * <p>
	 * Name: savePlayerBanList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187248_x = McMappingDatabase.getSRG("DedicatedPlayerList.func_187248_x");

	/**
	 * <p>
	 * Name: bypassesPlayerLimit
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)Z]
	 * </p>
	 */
	public static McObfPair func_183023_f = McMappingDatabase.getSRG("DedicatedPlayerList.func_183023_f");

	/**
	 * <p>
	 * Name: addWhitelistedPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)V]
	 * </p>
	 */
	public static McObfPair func_152601_d = McMappingDatabase.getSRG("DedicatedPlayerList.func_152601_d");

	/**
	 * <p>
	 * Name: reloadWhitelist
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187244_a = McMappingDatabase.getSRG("DedicatedPlayerList.func_187244_a");

	/**
	 * <p>
	 * Name: addOp
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)V]
	 * </p>
	 */
	public static McObfPair func_152605_a = McMappingDatabase.getSRG("DedicatedPlayerList.func_152605_a");

	/**
	 * <p>
	 * Name: canJoin
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)Z]
	 * </p>
	 */
	public static McObfPair func_152607_e = McMappingDatabase.getSRG("DedicatedPlayerList.func_152607_e");

	/**
	 * <p>
	 * Name: getServerInstance
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/dedicated/DedicatedServer;, ()Lnet/minecraft/server/MinecraftServer;]
	 * </p>
	 */
	public static McObfPair func_72365_p = McMappingDatabase.getSRG("DedicatedPlayerList.func_72365_p");

	/**
	 * <p>
	 * Name: removeOp
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)V]
	 * </p>
	 */
	public static McObfPair func_152610_b = McMappingDatabase.getSRG("DedicatedPlayerList.func_152610_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_164439_d = McMappingDatabase.getSRG("field_164439_d");

}

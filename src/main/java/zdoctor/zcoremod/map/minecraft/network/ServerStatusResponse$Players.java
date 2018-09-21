package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerStatusResponse$Players {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mt$a";
		else
			return "net/minecraft/network/ServerStatusResponse$Players";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mt$a";
		else
			return "ServerStatusResponse$Players";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lmt$a;";
		else
			return "Lnet/minecraft/network/ServerStatusResponse$Players;";
	}

	/**
	 * <p>
	 * Name: onlinePlayerCount
	 * </p>
	 */
	public static McObfPair field_151334_b = McMappingDatabase.getSRG("field_151334_b");

	/**
	 * <p>
	 * Name: getPlayers
	 * </p>
	 * <p>
	 * Desc: [()[Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_151331_c = McMappingDatabase.getSRG("ServerStatusResponse$Players.func_151331_c");

	/**
	 * <p>
	 * Name: players
	 * </p>
	 */
	public static McObfPair field_151335_c = McMappingDatabase.getSRG("field_151335_c");

	/**
	 * <p>
	 * Name: getOnlinePlayerCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_151333_b = McMappingDatabase.getSRG("ServerStatusResponse$Players.func_151333_b");

	/**
	 * <p>
	 * Name: maxPlayers
	 * </p>
	 */
	public static McObfPair field_151336_a = McMappingDatabase.getSRG("field_151336_a");

	/**
	 * <p>
	 * Name: getMaxPlayers
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_151332_a = McMappingDatabase.getSRG("ServerStatusResponse$Players.func_151332_a");

	/**
	 * <p>
	 * Name: setPlayers
	 * </p>
	 * <p>
	 * Desc: [([Lcom/mojang/authlib/GameProfile;)V]
	 * </p>
	 */
	public static McObfPair func_151330_a = McMappingDatabase.getSRG("ServerStatusResponse$Players.func_151330_a");

}

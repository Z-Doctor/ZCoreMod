package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerStatusResponse {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mt";
		else
			return "net/minecraft/network/ServerStatusResponse";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mt";
		else
			return "ServerStatusResponse";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lmt;";
		else
			return "Lnet/minecraft/network/ServerStatusResponse;";
	}

	/**
	 * <p>
	 * Name: getVersion
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/ServerStatusResponse$Version;]
	 * </p>
	 */
	public static McObfPair func_151322_c = McMappingDatabase.getSRG("ServerStatusResponse.func_151322_c");

	/**
	 * <p>
	 * Name: version
	 * </p>
	 */
	public static McObfPair field_151325_c = McMappingDatabase.getSRG("field_151325_c");

	/**
	 * <p>
	 * Name: getServerDescription
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_151317_a = McMappingDatabase.getSRG("ServerStatusResponse.func_151317_a");

	/**
	 * <p>
	 * Name: favicon
	 * </p>
	 */
	public static McObfPair field_151323_d = McMappingDatabase.getSRG("field_151323_d");

	/**
	 * <p>
	 * Name: setServerDescription
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_151315_a = McMappingDatabase.getSRG("ServerStatusResponse.func_151315_a");

	/**
	 * <p>
	 * Name: players
	 * </p>
	 */
	public static McObfPair field_151324_b = McMappingDatabase.getSRG("field_151324_b");

	/**
	 * <p>
	 * Name: setPlayers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/ServerStatusResponse$Players;)V]
	 * </p>
	 */
	public static McObfPair func_151319_a = McMappingDatabase.getSRG("ServerStatusResponse.func_151319_a");

	/**
	 * <p>
	 * Name: description
	 * </p>
	 */
	public static McObfPair field_151326_a = McMappingDatabase.getSRG("field_151326_a");

	/**
	 * <p>
	 * Name: setFavicon
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_151320_a = McMappingDatabase.getSRG("ServerStatusResponse.func_151320_a");

	/**
	 * <p>
	 * Name: setVersion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/ServerStatusResponse$Version;)V]
	 * </p>
	 */
	public static McObfPair func_151321_a = McMappingDatabase.getSRG("ServerStatusResponse.func_151321_a");

	/**
	 * <p>
	 * Name: getPlayers
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/ServerStatusResponse$Players;]
	 * </p>
	 */
	public static McObfPair func_151318_b = McMappingDatabase.getSRG("ServerStatusResponse.func_151318_b");

	/**
	 * <p>
	 * Name: getFavicon
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_151316_d = McMappingDatabase.getSRG("ServerStatusResponse.func_151316_d");

}

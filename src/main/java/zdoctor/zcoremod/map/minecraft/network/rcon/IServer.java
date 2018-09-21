package zdoctor.zcoremod.map.minecraft.network.rcon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nu";
		else
			return "net/minecraft/network/rcon/IServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nu";
		else
			return "IServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnu;";
		else
			return "Lnet/minecraft/network/rcon/IServer;";
	}

	/**
	 * <p>
	 * Name: logWarning
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71236_h = McMappingDatabase.getSRG("IServer.func_71236_h");

	/**
	 * <p>
	 * Name: handleRConCommand
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71252_i = McMappingDatabase.getSRG("IServer.func_71252_i");

	/**
	 * <p>
	 * Name: getMaxPlayers
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_71275_y = McMappingDatabase.getSRG("IServer.func_71275_y");

	/**
	 * <p>
	 * Name: getPort
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_71234_u = McMappingDatabase.getSRG("IServer.func_71234_u");

	/**
	 * <p>
	 * Name: isDebuggingEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_71239_B = McMappingDatabase.getSRG("IServer.func_71239_B");

	/**
	 * <p>
	 * Name: logInfo
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71244_g = McMappingDatabase.getSRG("IServer.func_71244_g");

	/**
	 * <p>
	 * Name: getSettingsFilename
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71329_c = McMappingDatabase.getSRG("IServer.func_71329_c");

	/**
	 * <p>
	 * Name: logSevere
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71201_j = McMappingDatabase.getSRG("IServer.func_71201_j");

	/**
	 * <p>
	 * Name: logDebug
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_71198_k = McMappingDatabase.getSRG("IServer.func_71198_k");

	/**
	 * <p>
	 * Name: getOnlinePlayerNames
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71213_z = McMappingDatabase.getSRG("IServer.func_71213_z");

	/**
	 * <p>
	 * Name: getMinecraftVersion
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71249_w = McMappingDatabase.getSRG("IServer.func_71249_w");

	/**
	 * <p>
	 * Name: getFolderName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71270_I = McMappingDatabase.getSRG("IServer.func_71270_I");

	/**
	 * <p>
	 * Name: getPlugins
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71258_A = McMappingDatabase.getSRG("IServer.func_71258_A");

	/**
	 * <p>
	 * Name: saveProperties
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71326_a = McMappingDatabase.getSRG("IServer.func_71326_a");

	/**
	 * <p>
	 * Name: setProperty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_71328_a = McMappingDatabase.getSRG("IServer.func_71328_a");

	/**
	 * <p>
	 * Name: getIntProperty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)I]
	 * </p>
	 */
	public static McObfPair func_71327_a = McMappingDatabase.getSRG("IServer.func_71327_a");

	/**
	 * <p>
	 * Name: getHostname
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71277_t = McMappingDatabase.getSRG("IServer.func_71277_t");

	/**
	 * <p>
	 * Name: getCurrentPlayerCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_71233_x = McMappingDatabase.getSRG("IServer.func_71233_x");

	/**
	 * <p>
	 * Name: getStringProperty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71330_a = McMappingDatabase.getSRG("IServer.func_71330_a");

	/**
	 * <p>
	 * Name: getMotd
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71274_v = McMappingDatabase.getSRG("IServer.func_71274_v");

}

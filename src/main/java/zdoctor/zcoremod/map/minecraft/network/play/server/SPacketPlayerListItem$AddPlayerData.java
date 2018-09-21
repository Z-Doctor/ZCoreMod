package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketPlayerListItem$AddPlayerData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jp$b";
		else
			return "net/minecraft/network/play/server/SPacketPlayerListItem$AddPlayerData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "jp$b";
		else
			return "SPacketPlayerListItem$AddPlayerData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljp$b;";
		else
			return "Lnet/minecraft/network/play/server/SPacketPlayerListItem$AddPlayerData;";
	}

	/**
	 * <p>
	 * Name: profile
	 * </p>
	 */
	public static McObfPair field_179964_d = McMappingDatabase.getSRG("field_179964_d");

	/**
	 * <p>
	 * Name: getPing
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_179963_b = McMappingDatabase.getSRG("SPacketPlayerListItem$AddPlayerData.func_179963_b");

	/**
	 * <p>
	 * Name: getProfile
	 * </p>
	 * <p>
	 * Desc: [()Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_179962_a = McMappingDatabase.getSRG("SPacketPlayerListItem$AddPlayerData.func_179962_a");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_179961_d = McMappingDatabase.getSRG("SPacketPlayerListItem$AddPlayerData.func_179961_d");

	/**
	 * <p>
	 * Name: ping
	 * </p>
	 */
	public static McObfPair field_179966_b = McMappingDatabase.getSRG("field_179966_b");

	/**
	 * <p>
	 * Name: gamemode
	 * </p>
	 */
	public static McObfPair field_179967_c = McMappingDatabase.getSRG("field_179967_c");

	/**
	 * <p>
	 * Name: displayName
	 * </p>
	 */
	public static McObfPair field_179965_e = McMappingDatabase.getSRG("field_179965_e");

	/**
	 * <p>
	 * Name: getGameMode
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_179960_c = McMappingDatabase.getSRG("SPacketPlayerListItem$AddPlayerData.func_179960_c");

}

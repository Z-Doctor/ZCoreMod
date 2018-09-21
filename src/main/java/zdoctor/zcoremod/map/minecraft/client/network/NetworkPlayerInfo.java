package zdoctor.zcoremod.map.minecraft.client.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetworkPlayerInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsc";
		else
			return "net/minecraft/client/network/NetworkPlayerInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bsc";
		else
			return "NetworkPlayerInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbsc;";
		else
			return "Lnet/minecraft/client/network/NetworkPlayerInfo;";
	}

	/**
	 * <p>
	 * Name: setHealthBlinkTime
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_178844_b = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178844_b");

	/**
	 * <p>
	 * Name: getHealthBlinkTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_178858_o = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178858_o");

	/**
	 * <p>
	 * Name: displayName
	 * </p>
	 */
	public static McObfPair field_178872_h = McMappingDatabase.getSRG("field_178872_h");

	/**
	 * <p>
	 * Name: setDisplayHealth
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_178857_c = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178857_c");

	/**
	 * <p>
	 * Name: healthBlinkTime
	 * </p>
	 */
	public static McObfPair field_178868_l = McMappingDatabase.getSRG("field_178868_l");

	/**
	 * <p>
	 * Name: gameType
	 * </p>
	 */
	public static McObfPair field_178866_b = McMappingDatabase.getSRG("field_178866_b");

	/**
	 * <p>
	 * Name: hasLocationSkin
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178856_e = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178856_e");

	/**
	 * <p>
	 * Name: getPlayerTeam
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/ScorePlayerTeam;]
	 * </p>
	 */
	public static McObfPair func_178850_i = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178850_i");

	/**
	 * <p>
	 * Name: skinType
	 * </p>
	 */
	public static McObfPair field_178863_g = McMappingDatabase.getSRG("field_178863_g");

	/**
	 * <p>
	 * Name: setResponseTime
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_178838_a = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178838_a");

	/**
	 * <p>
	 * Name: setDisplayName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_178859_a = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178859_a");

	/**
	 * <p>
	 * Name: setRenderVisibilityId
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_178843_c = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178843_c");

	/**
	 * <p>
	 * Name: displayHealth
	 * </p>
	 */
	public static McObfPair field_178870_j = McMappingDatabase.getSRG("field_178870_j");

	/**
	 * <p>
	 * Name: setLastHealthTime
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_178846_a = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178846_a");

	/**
	 * <p>
	 * Name: getSkinType
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_178851_f = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178851_f");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_178854_k = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178854_k");

	/**
	 * <p>
	 * Name: getResponseTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178853_c = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178853_c");

	/**
	 * <p>
	 * Name: getLocationSkin
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_178837_g = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178837_g");

	/**
	 * <p>
	 * Name: getLocationCape
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_178861_h = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178861_h");

	/**
	 * <p>
	 * Name: getLocationElytra
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_187106_i = McMappingDatabase.getSRG("NetworkPlayerInfo.func_187106_i");

	/**
	 * <p>
	 * Name: getRenderVisibilityId
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_178855_p = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178855_p");

	/**
	 * <p>
	 * Name: getLastHealthTime
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_178847_n = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178847_n");

	/**
	 * <p>
	 * Name: setGameType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/GameType;)V]
	 * </p>
	 */
	public static McObfPair func_178839_a = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178839_a");

	/**
	 * <p>
	 * Name: renderVisibilityId
	 * </p>
	 */
	public static McObfPair field_178869_m = McMappingDatabase.getSRG("field_178869_m");

	/**
	 * <p>
	 * Name: playerTexturesLoaded
	 * </p>
	 */
	public static McObfPair field_178864_d = McMappingDatabase.getSRG("field_178864_d");

	/**
	 * <p>
	 * Name: lastHealthTime
	 * </p>
	 */
	public static McObfPair field_178871_k = McMappingDatabase.getSRG("field_178871_k");

	/**
	 * <p>
	 * Name: getGameType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_178848_b = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178848_b");

	/**
	 * <p>
	 * Name: playerTextures
	 * </p>
	 */
	public static McObfPair field_187107_a = McMappingDatabase.getSRG("field_187107_a");

	/**
	 * <p>
	 * Name: loadPlayerTextures
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178841_j = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178841_j");

	/**
	 * <p>
	 * Name: lastHealth
	 * </p>
	 */
	public static McObfPair field_178873_i = McMappingDatabase.getSRG("field_178873_i");

	/**
	 * <p>
	 * Name: getGameProfile
	 * </p>
	 * <p>
	 * Desc: [()Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_178845_a = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178845_a");

	/**
	 * <p>
	 * Name: gameProfile
	 * </p>
	 */
	public static McObfPair field_178867_a = McMappingDatabase.getSRG("field_178867_a");

	/**
	 * <p>
	 * Name: getDisplayHealth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178860_m = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178860_m");

	/**
	 * <p>
	 * Name: setLastHealth
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_178836_b = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178836_b");

	/**
	 * <p>
	 * Name: getLastHealth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178835_l = McMappingDatabase.getSRG("NetworkPlayerInfo.func_178835_l");

	/**
	 * <p>
	 * Name: responseTime
	 * </p>
	 */
	public static McObfPair field_78829_b = McMappingDatabase.getSRG("field_78829_b");

}

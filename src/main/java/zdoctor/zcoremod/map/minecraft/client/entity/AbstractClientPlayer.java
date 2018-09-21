package zdoctor.zcoremod.map.minecraft.client.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AbstractClientPlayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bua";
		else
			return "net/minecraft/client/entity/AbstractClientPlayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bua";
		else
			return "AbstractClientPlayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbua;";
		else
			return "Lnet/minecraft/client/entity/AbstractClientPlayer;";
	}

	/**
	 * <p>
	 * Name: getLocationSkin
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110306_p = McMappingDatabase.getSRG("AbstractClientPlayer.func_110306_p");

	/**
	 * <p>
	 * Name: rotateElytraX
	 * </p>
	 */
	public static McObfPair field_184835_a = McMappingDatabase.getSRG("field_184835_a");

	/**
	 * <p>
	 * Name: getLocationElytra
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184834_t = McMappingDatabase.getSRG("AbstractClientPlayer.func_184834_t");

	/**
	 * <p>
	 * Name: isCreative
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184812_l_ = McMappingDatabase.getSRG("AbstractClientPlayer.func_184812_l_");

	/**
	 * <p>
	 * Name: isPlayerInfoSet
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184833_s = McMappingDatabase.getSRG("AbstractClientPlayer.func_184833_s");

	/**
	 * <p>
	 * Name: getSkinType
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_175154_l = McMappingDatabase.getSRG("AbstractClientPlayer.func_175154_l");

	/**
	 * <p>
	 * Name: getLocationSkin
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110311_f = McMappingDatabase.getSRG("AbstractClientPlayer.func_110311_f");

	/**
	 * <p>
	 * Name: rotateElytraZ
	 * </p>
	 */
	public static McObfPair field_184837_c = McMappingDatabase.getSRG("field_184837_c");

	/**
	 * <p>
	 * Name: isSpectator
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175149_v = McMappingDatabase.getSRG("AbstractClientPlayer.func_175149_v");

	/**
	 * <p>
	 * Name: getPlayerInfo
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/network/NetworkPlayerInfo;]
	 * </p>
	 */
	public static McObfPair func_175155_b = McMappingDatabase.getSRG("AbstractClientPlayer.func_175155_b");

	/**
	 * <p>
	 * Name: getFovModifier
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_175156_o = McMappingDatabase.getSRG("AbstractClientPlayer.func_175156_o");

	/**
	 * <p>
	 * Name: hasPlayerInfo
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_152122_n = McMappingDatabase.getSRG("AbstractClientPlayer.func_152122_n");

	/**
	 * <p>
	 * Name: playerInfo
	 * </p>
	 */
	public static McObfPair field_175157_a = McMappingDatabase.getSRG("field_175157_a");

	/**
	 * <p>
	 * Name: getLocationCape
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110303_q = McMappingDatabase.getSRG("AbstractClientPlayer.func_110303_q");

	/**
	 * <p>
	 * Name: getDownloadImageSkin
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;Ljava/lang/String;)Lnet/minecraft/client/renderer/ThreadDownloadImageData;]
	 * </p>
	 */
	public static McObfPair func_110304_a = McMappingDatabase.getSRG("AbstractClientPlayer.func_110304_a");

	/**
	 * <p>
	 * Name: rotateElytraY
	 * </p>
	 */
	public static McObfPair field_184836_b = McMappingDatabase.getSRG("field_184836_b");

	/**
	 * <p>
	 * Name: hasSkin
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_152123_o = McMappingDatabase.getSRG("AbstractClientPlayer.func_152123_o");

}

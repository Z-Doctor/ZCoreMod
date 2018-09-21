package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BossInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tt";
		else
			return "net/minecraft/world/BossInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tt";
		else
			return "BossInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ltt;";
		else
			return "Lnet/minecraft/world/BossInfo;";
	}

	/**
	 * <p>
	 * Name: setColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/BossInfo$Color;)V]
	 * </p>
	 */
	public static McObfPair func_186745_a = McMappingDatabase.getSRG("BossInfo.func_186745_a");

	/**
	 * <p>
	 * Name: shouldCreateFog
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186748_k = McMappingDatabase.getSRG("BossInfo.func_186748_k");

	/**
	 * <p>
	 * Name: uniqueId
	 * </p>
	 */
	public static McObfPair field_186756_h = McMappingDatabase.getSRG("field_186756_h");

	/**
	 * <p>
	 * Name: getUniqueId
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_186737_d = McMappingDatabase.getSRG("BossInfo.func_186737_d");

	/**
	 * <p>
	 * Name: shouldPlayEndBossMusic
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186747_j = McMappingDatabase.getSRG("BossInfo.func_186747_j");

	/**
	 * <p>
	 * Name: getOverlay
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/BossInfo$Overlay;]
	 * </p>
	 */
	public static McObfPair func_186740_h = McMappingDatabase.getSRG("BossInfo.func_186740_h");

	/**
	 * <p>
	 * Name: percent
	 * </p>
	 */
	public static McObfPair field_186750_b = McMappingDatabase.getSRG("field_186750_b");

	/**
	 * <p>
	 * Name: setName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_186739_a = McMappingDatabase.getSRG("BossInfo.func_186739_a");

	/**
	 * <p>
	 * Name: getPercent
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_186738_f = McMappingDatabase.getSRG("BossInfo.func_186738_f");

	/**
	 * <p>
	 * Name: setOverlay
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/BossInfo$Overlay;)V]
	 * </p>
	 */
	public static McObfPair func_186746_a = McMappingDatabase.getSRG("BossInfo.func_186746_a");

	/**
	 * <p>
	 * Name: overlay
	 * </p>
	 */
	public static McObfPair field_186752_d = McMappingDatabase.getSRG("field_186752_d");

	/**
	 * <p>
	 * Name: shouldDarkenSky
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186734_i = McMappingDatabase.getSRG("BossInfo.func_186734_i");

	/**
	 * <p>
	 * Name: setPlayEndBossMusic
	 * </p>
	 * <p>
	 * Desc: [(Z)Lnet/minecraft/world/BossInfo;]
	 * </p>
	 */
	public static McObfPair func_186742_b = McMappingDatabase.getSRG("BossInfo.func_186742_b");

	/**
	 * <p>
	 * Name: createFog
	 * </p>
	 */
	public static McObfPair field_186755_g = McMappingDatabase.getSRG("field_186755_g");

	/**
	 * <p>
	 * Name: setCreateFog
	 * </p>
	 * <p>
	 * Desc: [(Z)Lnet/minecraft/world/BossInfo;]
	 * </p>
	 */
	public static McObfPair func_186743_c = McMappingDatabase.getSRG("BossInfo.func_186743_c");

	/**
	 * <p>
	 * Name: color
	 * </p>
	 */
	public static McObfPair field_186751_c = McMappingDatabase.getSRG("field_186751_c");

	/**
	 * <p>
	 * Name: playEndBossMusic
	 * </p>
	 */
	public static McObfPair field_186754_f = McMappingDatabase.getSRG("field_186754_f");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_186749_a = McMappingDatabase.getSRG("field_186749_a");

	/**
	 * <p>
	 * Name: setDarkenSky
	 * </p>
	 * <p>
	 * Desc: [(Z)Lnet/minecraft/world/BossInfo;]
	 * </p>
	 */
	public static McObfPair func_186741_a = McMappingDatabase.getSRG("BossInfo.func_186741_a");

	/**
	 * <p>
	 * Name: setPercent
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_186735_a = McMappingDatabase.getSRG("BossInfo.func_186735_a");

	/**
	 * <p>
	 * Name: darkenSky
	 * </p>
	 */
	public static McObfPair field_186753_e = McMappingDatabase.getSRG("field_186753_e");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_186744_e = McMappingDatabase.getSRG("BossInfo.func_186744_e");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/BossInfo$Color;]
	 * </p>
	 */
	public static McObfPair func_186736_g = McMappingDatabase.getSRG("BossInfo.func_186736_g");

}

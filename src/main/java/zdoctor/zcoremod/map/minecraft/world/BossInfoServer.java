package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BossInfoServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "om";
		else
			return "net/minecraft/world/BossInfoServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "om";
		else
			return "BossInfoServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lom;";
		else
			return "Lnet/minecraft/world/BossInfoServer;";
	}

	/**
	 * <p>
	 * Name: visible
	 * </p>
	 */
	public static McObfPair field_186764_j = McMappingDatabase.getSRG("field_186764_j");

	/**
	 * <p>
	 * Name: readOnlyPlayers
	 * </p>
	 */
	public static McObfPair field_186763_i = McMappingDatabase.getSRG("field_186763_i");

	/**
	 * <p>
	 * Name: setPercent
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_186735_a = McMappingDatabase.getSRG("BossInfoServer.func_186735_a");

	/**
	 * <p>
	 * Name: players
	 * </p>
	 */
	public static McObfPair field_186762_h = McMappingDatabase.getSRG("field_186762_h");

	/**
	 * <p>
	 * Name: sendUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/play/server/SPacketUpdateBossInfo$Operation;)V]
	 * </p>
	 */
	public static McObfPair func_186759_a = McMappingDatabase.getSRG("BossInfoServer.func_186759_a");

	/**
	 * <p>
	 * Name: getPlayers
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_186757_c = McMappingDatabase.getSRG("BossInfoServer.func_186757_c");

	/**
	 * <p>
	 * Name: addPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_186760_a = McMappingDatabase.getSRG("BossInfoServer.func_186760_a");

	/**
	 * <p>
	 * Name: setVisible
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_186758_d = McMappingDatabase.getSRG("BossInfoServer.func_186758_d");

	/**
	 * <p>
	 * Name: setColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/BossInfo$Color;)V]
	 * </p>
	 */
	public static McObfPair func_186745_a = McMappingDatabase.getSRG("BossInfoServer.func_186745_a");

	/**
	 * <p>
	 * Name: setCreateFog
	 * </p>
	 * <p>
	 * Desc: [(Z)Lnet/minecraft/world/BossInfo;]
	 * </p>
	 */
	public static McObfPair func_186743_c = McMappingDatabase.getSRG("BossInfoServer.func_186743_c");

	/**
	 * <p>
	 * Name: removePlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_186761_b = McMappingDatabase.getSRG("BossInfoServer.func_186761_b");

	/**
	 * <p>
	 * Name: setName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_186739_a = McMappingDatabase.getSRG("BossInfoServer.func_186739_a");

	/**
	 * <p>
	 * Name: setPlayEndBossMusic
	 * </p>
	 * <p>
	 * Desc: [(Z)Lnet/minecraft/world/BossInfo;]
	 * </p>
	 */
	public static McObfPair func_186742_b = McMappingDatabase.getSRG("BossInfoServer.func_186742_b");

	/**
	 * <p>
	 * Name: setOverlay
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/BossInfo$Overlay;)V]
	 * </p>
	 */
	public static McObfPair func_186746_a = McMappingDatabase.getSRG("BossInfoServer.func_186746_a");

	/**
	 * <p>
	 * Name: setDarkenSky
	 * </p>
	 * <p>
	 * Desc: [(Z)Lnet/minecraft/world/BossInfo;]
	 * </p>
	 */
	public static McObfPair func_186741_a = McMappingDatabase.getSRG("BossInfoServer.func_186741_a");

}

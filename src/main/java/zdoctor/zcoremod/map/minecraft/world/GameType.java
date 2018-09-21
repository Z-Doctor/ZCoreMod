package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GameType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ams";
		else
			return "net/minecraft/world/GameType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ams";
		else
			return "GameType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lams;";
		else
			return "Lnet/minecraft/world/GameType;";
	}

	/**
	 * <p>
	 * Name: shortName
	 * </p>
	 */
	public static McObfPair field_185330_h = McMappingDatabase.getSRG("field_185330_h");

	/**
	 * <p>
	 * Name: configurePlayerCapabilities
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/PlayerCapabilities;)V]
	 * </p>
	 */
	public static McObfPair func_77147_a = McMappingDatabase.getSRG("GameType.func_77147_a");

	/**
	 * <p>
	 * Name: parseGameTypeWithDefault
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/world/GameType;)Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_185329_a = McMappingDatabase.getSRG("GameType.func_185329_a");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_77154_e = McMappingDatabase.getSRG("field_77154_e");

	/**
	 * <p>
	 * Name: getByID
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_77146_a = McMappingDatabase.getSRG("GameType.func_77146_a");

	/**
	 * <p>
	 * Name: getByName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_77142_a = McMappingDatabase.getSRG("GameType.func_77142_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_77151_f = McMappingDatabase.getSRG("field_77151_f");

	/**
	 * <p>
	 * Name: parseGameTypeWithDefault
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/world/GameType;)Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_185328_a = McMappingDatabase.getSRG("GameType.func_185328_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77149_b = McMappingDatabase.getSRG("GameType.func_77149_b");

	/**
	 * <p>
	 * Name: getID
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77148_a = McMappingDatabase.getSRG("GameType.func_77148_a");

	/**
	 * <p>
	 * Name: hasLimitedInteractions
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82752_c = McMappingDatabase.getSRG("GameType.func_82752_c");

	/**
	 * <p>
	 * Name: isCreative
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77145_d = McMappingDatabase.getSRG("GameType.func_77145_d");

	/**
	 * <p>
	 * Name: isSurvivalOrAdventure
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77144_e = McMappingDatabase.getSRG("GameType.func_77144_e");

}

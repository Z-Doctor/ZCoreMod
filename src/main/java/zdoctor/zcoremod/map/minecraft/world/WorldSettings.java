package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldSettings {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amx";
		else
			return "net/minecraft/world/WorldSettings";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amx";
		else
			return "WorldSettings";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamx;";
		else
			return "Lnet/minecraft/world/WorldSettings;";
	}

	/**
	 * <p>
	 * Name: getHardcoreEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77158_f = McMappingDatabase.getSRG("WorldSettings.func_77158_f");

	/**
	 * <p>
	 * Name: commandsAllowed
	 * </p>
	 */
	public static McObfPair field_77168_f = McMappingDatabase.getSRG("field_77168_f");

	/**
	 * <p>
	 * Name: gameType
	 * </p>
	 */
	public static McObfPair field_77172_b = McMappingDatabase.getSRG("field_77172_b");

	/**
	 * <p>
	 * Name: isMapFeaturesEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77164_g = McMappingDatabase.getSRG("WorldSettings.func_77164_g");

	/**
	 * <p>
	 * Name: bonusChestEnabled
	 * </p>
	 */
	public static McObfPair field_77169_g = McMappingDatabase.getSRG("field_77169_g");

	/**
	 * <p>
	 * Name: mapFeaturesEnabled
	 * </p>
	 */
	public static McObfPair field_77173_c = McMappingDatabase.getSRG("field_77173_c");

	/**
	 * <p>
	 * Name: hardcoreEnabled
	 * </p>
	 */
	public static McObfPair field_77170_d = McMappingDatabase.getSRG("field_77170_d");

	/**
	 * <p>
	 * Name: getGameType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_77162_e = McMappingDatabase.getSRG("WorldSettings.func_77162_e");

	/**
	 * <p>
	 * Name: getGameTypeById
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_77161_a = McMappingDatabase.getSRG("WorldSettings.func_77161_a");

	/**
	 * <p>
	 * Name: getSeed
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_77160_d = McMappingDatabase.getSRG("WorldSettings.func_77160_d");

	/**
	 * <p>
	 * Name: isBonusChestEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77167_c = McMappingDatabase.getSRG("WorldSettings.func_77167_c");

	/**
	 * <p>
	 * Name: generatorOptions
	 * </p>
	 */
	public static McObfPair field_82751_h = McMappingDatabase.getSRG("field_82751_h");

	/**
	 * <p>
	 * Name: areCommandsAllowed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77163_i = McMappingDatabase.getSRG("WorldSettings.func_77163_i");

	/**
	 * <p>
	 * Name: enableBonusChest
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/WorldSettings;]
	 * </p>
	 */
	public static McObfPair func_77159_a = McMappingDatabase.getSRG("WorldSettings.func_77159_a");

	/**
	 * <p>
	 * Name: enableCommands
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/WorldSettings;]
	 * </p>
	 */
	public static McObfPair func_77166_b = McMappingDatabase.getSRG("WorldSettings.func_77166_b");

	/**
	 * <p>
	 * Name: seed
	 * </p>
	 */
	public static McObfPair field_77174_a = McMappingDatabase.getSRG("field_77174_a");

	/**
	 * <p>
	 * Name: getGeneratorOptions
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_82749_j = McMappingDatabase.getSRG("WorldSettings.func_82749_j");

	/**
	 * <p>
	 * Name: getTerrainType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/WorldType;]
	 * </p>
	 */
	public static McObfPair func_77165_h = McMappingDatabase.getSRG("WorldSettings.func_77165_h");

	/**
	 * <p>
	 * Name: setGeneratorOptions
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/world/WorldSettings;]
	 * </p>
	 */
	public static McObfPair func_82750_a = McMappingDatabase.getSRG("WorldSettings.func_82750_a");

	/**
	 * <p>
	 * Name: terrainType
	 * </p>
	 */
	public static McObfPair field_77171_e = McMappingDatabase.getSRG("field_77171_e");

}

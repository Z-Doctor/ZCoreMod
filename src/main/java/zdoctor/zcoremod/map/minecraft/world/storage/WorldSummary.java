package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldSummary {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfh";
		else
			return "net/minecraft/world/storage/WorldSummary";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfh";
		else
			return "WorldSummary";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfh;";
		else
			return "Lnet/minecraft/world/storage/WorldSummary;";
	}

	/**
	 * <p>
	 * Name: getLastTimePlayed
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_75784_e = McMappingDatabase.getSRG("WorldSummary.func_75784_e");

	/**
	 * <p>
	 * Name: versionId
	 * </p>
	 */
	public static McObfPair field_186359_j = McMappingDatabase.getSRG("field_186359_j");

	/**
	 * <p>
	 * Name: hardcore
	 * </p>
	 */
	public static McObfPair field_75792_g = McMappingDatabase.getSRG("field_75792_g");

	/**
	 * <p>
	 * Name: askToOpenWorld
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186356_m = McMappingDatabase.getSRG("WorldSummary.func_186356_m");

	/**
	 * <p>
	 * Name: fileName
	 * </p>
	 */
	public static McObfPair field_75797_a = McMappingDatabase.getSRG("field_75797_a");

	/**
	 * <p>
	 * Name: lastTimePlayed
	 * </p>
	 */
	public static McObfPair field_75796_c = McMappingDatabase.getSRG("field_75796_c");

	/**
	 * <p>
	 * Name: getCheatsEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75783_h = McMappingDatabase.getSRG("WorldSummary.func_75783_h");

	/**
	 * <p>
	 * Name: markVersionInList
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186355_l = McMappingDatabase.getSRG("WorldSummary.func_186355_l");

	/**
	 * <p>
	 * Name: displayName
	 * </p>
	 */
	public static McObfPair field_75795_b = McMappingDatabase.getSRG("field_75795_b");

	/**
	 * <p>
	 * Name: versionSnapshot
	 * </p>
	 */
	public static McObfPair field_186360_k = McMappingDatabase.getSRG("field_186360_k");

	/**
	 * <p>
	 * Name: versionName
	 * </p>
	 */
	public static McObfPair field_186358_i = McMappingDatabase.getSRG("field_186358_i");

	/**
	 * <p>
	 * Name: getSizeOnDisk
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_154336_c = McMappingDatabase.getSRG("WorldSummary.func_154336_c");

	/**
	 * <p>
	 * Name: getVersionName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_186357_i = McMappingDatabase.getSRG("WorldSummary.func_186357_i");

	/**
	 * <p>
	 * Name: sizeOnDisk
	 * </p>
	 */
	public static McObfPair field_75793_d = McMappingDatabase.getSRG("field_75793_d");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_75788_b = McMappingDatabase.getSRG("WorldSummary.func_75788_b");

	/**
	 * <p>
	 * Name: cheatsEnabled
	 * </p>
	 */
	public static McObfPair field_75798_h = McMappingDatabase.getSRG("field_75798_h");

	/**
	 * <p>
	 * Name: requiresConversion
	 * </p>
	 */
	public static McObfPair field_75794_e = McMappingDatabase.getSRG("field_75794_e");

	/**
	 * <p>
	 * Name: requiresConversion
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75785_d = McMappingDatabase.getSRG("WorldSummary.func_75785_d");

	/**
	 * <p>
	 * Name: getEnumGameType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_75790_f = McMappingDatabase.getSRG("WorldSummary.func_75790_f");

	/**
	 * <p>
	 * Name: isHardcoreModeEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75789_g = McMappingDatabase.getSRG("WorldSummary.func_75789_g");

	/**
	 * <p>
	 * Name: gameType
	 * </p>
	 */
	public static McObfPair field_75791_f = McMappingDatabase.getSRG("field_75791_f");

	/**
	 * <p>
	 * Name: getFileName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_75786_a = McMappingDatabase.getSRG("WorldSummary.func_75786_a");

}

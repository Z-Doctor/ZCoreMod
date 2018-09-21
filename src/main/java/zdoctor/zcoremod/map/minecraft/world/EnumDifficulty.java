package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumDifficulty {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tz";
		else
			return "net/minecraft/world/EnumDifficulty";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tz";
		else
			return "EnumDifficulty";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ltz;";
		else
			return "Lnet/minecraft/world/EnumDifficulty;";
	}

	/**
	 * <p>
	 * Name: getDifficultyEnum
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/world/EnumDifficulty;]
	 * </p>
	 */
	public static McObfPair func_151523_a = McMappingDatabase.getSRG("EnumDifficulty.func_151523_a");

	/**
	 * <p>
	 * Name: ID_MAPPING
	 * </p>
	 */
	public static McObfPair field_151530_e = McMappingDatabase.getSRG("field_151530_e");

	/**
	 * <p>
	 * Name: getDifficultyResourceKey
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_151526_b = McMappingDatabase.getSRG("EnumDifficulty.func_151526_b");

	/**
	 * <p>
	 * Name: getDifficultyId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_151525_a = McMappingDatabase.getSRG("EnumDifficulty.func_151525_a");

	/**
	 * <p>
	 * Name: difficultyResourceKey
	 * </p>
	 */
	public static McObfPair field_151528_g = McMappingDatabase.getSRG("field_151528_g");

	/**
	 * <p>
	 * Name: difficultyId
	 * </p>
	 */
	public static McObfPair field_151527_f = McMappingDatabase.getSRG("field_151527_f");

}

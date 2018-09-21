package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DifficultyInstance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ua";
		else
			return "net/minecraft/world/DifficultyInstance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ua";
		else
			return "DifficultyInstance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lua;";
		else
			return "Lnet/minecraft/world/DifficultyInstance;";
	}

	/**
	 * <p>
	 * Name: isHarderThan
	 * </p>
	 * <p>
	 * Desc: [(F)Z]
	 * </p>
	 */
	public static McObfPair func_193845_a = McMappingDatabase.getSRG("DifficultyInstance.func_193845_a");

	/**
	 * <p>
	 * Name: calculateAdditionalDifficulty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/EnumDifficulty;JJF)F]
	 * </p>
	 */
	public static McObfPair func_180169_a = McMappingDatabase.getSRG("DifficultyInstance.func_180169_a");

	/**
	 * <p>
	 * Name: additionalDifficulty
	 * </p>
	 */
	public static McObfPair field_180171_b = McMappingDatabase.getSRG("field_180171_b");

	/**
	 * <p>
	 * Name: getClampedAdditionalDifficulty
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_180170_c = McMappingDatabase.getSRG("DifficultyInstance.func_180170_c");

	/**
	 * <p>
	 * Name: getAdditionalDifficulty
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_180168_b = McMappingDatabase.getSRG("DifficultyInstance.func_180168_b");

	/**
	 * <p>
	 * Name: worldDifficulty
	 * </p>
	 */
	public static McObfPair field_180172_a = McMappingDatabase.getSRG("field_180172_a");

}

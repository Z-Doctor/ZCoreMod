package zdoctor.zcoremod.map.minecraft.client.settings;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GameSettings$Options {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bid$a";
		else
			return "net/minecraft/client/settings/GameSettings$Options";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bid$a";
		else
			return "GameSettings$Options";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbid$a;";
		else
			return "Lnet/minecraft/client/settings/GameSettings$Options;";
	}

	/**
	 * <p>
	 * Name: getOrdinal
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_74381_c = McMappingDatabase.getSRG("GameSettings$Options.func_74381_c");

	/**
	 * <p>
	 * Name: normalizeValue
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_148266_c = McMappingDatabase.getSRG("GameSettings$Options.func_148266_c");

	/**
	 * <p>
	 * Name: isFloat
	 * </p>
	 */
	public static McObfPair field_74385_A = McMappingDatabase.getSRG("field_74385_A");

	/**
	 * <p>
	 * Name: isBoolean
	 * </p>
	 */
	public static McObfPair field_74386_B = McMappingDatabase.getSRG("field_74386_B");

	/**
	 * <p>
	 * Name: valueMax
	 * </p>
	 */
	public static McObfPair field_148272_O = McMappingDatabase.getSRG("field_148272_O");

	/**
	 * <p>
	 * Name: snapToStepClamp
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_148268_e = McMappingDatabase.getSRG("GameSettings$Options.func_148268_e");

	/**
	 * <p>
	 * Name: getTranslation
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_74378_d = McMappingDatabase.getSRG("GameSettings$Options.func_74378_d");

	/**
	 * <p>
	 * Name: isBoolean
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_74382_b = McMappingDatabase.getSRG("GameSettings$Options.func_74382_b");

	/**
	 * <p>
	 * Name: getValueMin
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_186707_e = McMappingDatabase.getSRG("GameSettings$Options.func_186707_e");

	/**
	 * <p>
	 * Name: byOrdinal
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/settings/GameSettings$Options;]
	 * </p>
	 */
	public static McObfPair func_74379_a = McMappingDatabase.getSRG("GameSettings$Options.func_74379_a");

	/**
	 * <p>
	 * Name: isFloat
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_74380_a = McMappingDatabase.getSRG("GameSettings$Options.func_74380_a");

	/**
	 * <p>
	 * Name: getValueMax
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_148267_f = McMappingDatabase.getSRG("GameSettings$Options.func_148267_f");

	/**
	 * <p>
	 * Name: valueMin
	 * </p>
	 */
	public static McObfPair field_148271_N = McMappingDatabase.getSRG("field_148271_N");

	/**
	 * <p>
	 * Name: setValueMax
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_148263_a = McMappingDatabase.getSRG("GameSettings$Options.func_148263_a");

	/**
	 * <p>
	 * Name: translation
	 * </p>
	 */
	public static McObfPair field_74387_C = McMappingDatabase.getSRG("field_74387_C");

	/**
	 * <p>
	 * Name: denormalizeValue
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_148262_d = McMappingDatabase.getSRG("GameSettings$Options.func_148262_d");

	/**
	 * <p>
	 * Name: valueStep
	 * </p>
	 */
	public static McObfPair field_148270_M = McMappingDatabase.getSRG("field_148270_M");

	/**
	 * <p>
	 * Name: snapToStep
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_148264_f = McMappingDatabase.getSRG("GameSettings$Options.func_148264_f");

}

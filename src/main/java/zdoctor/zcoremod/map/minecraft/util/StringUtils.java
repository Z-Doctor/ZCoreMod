package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StringUtils {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rp";
		else
			return "net/minecraft/util/StringUtils";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rp";
		else
			return "StringUtils";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrp;";
		else
			return "Lnet/minecraft/util/StringUtils;";
	}

	/**
	 * <p>
	 * Name: ticksToElapsedTime
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_76337_a = McMappingDatabase.getSRG("StringUtils.func_76337_a");

	/**
	 * <p>
	 * Name: PATTERN_CONTROL_CODE
	 * </p>
	 */
	public static McObfPair field_76339_a = McMappingDatabase.getSRG("field_76339_a");

	/**
	 * <p>
	 * Name: isNullOrEmpty
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_151246_b = McMappingDatabase.getSRG("StringUtils.func_151246_b");

	/**
	 * <p>
	 * Name: stripControlCodes
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_76338_a = McMappingDatabase.getSRG("StringUtils.func_76338_a");

}

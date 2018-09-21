package zdoctor.zcoremod.map.minecraft.network.rcon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RConUtils {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pw";
		else
			return "net/minecraft/network/rcon/RConUtils";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pw";
		else
			return "RConUtils";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpw;";
		else
			return "Lnet/minecraft/network/rcon/RConUtils;";
	}

	/**
	 * <p>
	 * Name: getBytesAsString
	 * </p>
	 * <p>
	 * Desc: [([BII)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_72661_a = McMappingDatabase.getSRG("RConUtils.func_72661_a");

	/**
	 * <p>
	 * Name: getBytesAsBEint
	 * </p>
	 * <p>
	 * Desc: [([BII)I]
	 * </p>
	 */
	public static McObfPair func_72664_c = McMappingDatabase.getSRG("RConUtils.func_72664_c");

	/**
	 * <p>
	 * Name: getByteAsHexString
	 * </p>
	 * <p>
	 * Desc: [(B)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_72663_a = McMappingDatabase.getSRG("RConUtils.func_72663_a");

	/**
	 * <p>
	 * Name: getBytesAsLEInt
	 * </p>
	 * <p>
	 * Desc: [([BII)I]
	 * </p>
	 */
	public static McObfPair func_72665_b = McMappingDatabase.getSRG("RConUtils.func_72665_b");

	/**
	 * <p>
	 * Name: HEX_DIGITS
	 * </p>
	 */
	public static McObfPair field_72666_a = McMappingDatabase.getSRG("field_72666_a");

	/**
	 * <p>
	 * Name: getRemainingBytesAsLEInt
	 * </p>
	 * <p>
	 * Desc: [([BI)I]
	 * </p>
	 */
	public static McObfPair func_72662_b = McMappingDatabase.getSRG("RConUtils.func_72662_b");

}

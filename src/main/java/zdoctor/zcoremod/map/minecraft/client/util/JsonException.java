package zdoctor.zcoremod.map.minecraft.client.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class JsonException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nj";
		else
			return "net/minecraft/client/util/JsonException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nj";
		else
			return "JsonException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnj;";
		else
			return "Lnet/minecraft/client/util/JsonException;";
	}

	/**
	 * <p>
	 * Name: message
	 * </p>
	 */
	public static McObfPair field_151382_b = McMappingDatabase.getSRG("field_151382_b");

	/**
	 * <p>
	 * Name: setFilenameAndFlush
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_151381_b = McMappingDatabase.getSRG("JsonException.func_151381_b");

	/**
	 * <p>
	 * Name: entries
	 * </p>
	 */
	public static McObfPair field_151383_a = McMappingDatabase.getSRG("field_151383_a");

	/**
	 * <p>
	 * Name: forException
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Exception;)Lnet/minecraft/client/util/JsonException;]
	 * </p>
	 */
	public static McObfPair func_151379_a = McMappingDatabase.getSRG("JsonException.func_151379_a");

	/**
	 * <p>
	 * Name: prependJsonKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_151380_a = McMappingDatabase.getSRG("JsonException.func_151380_a");

}

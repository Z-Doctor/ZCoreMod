package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TupleIntJsonSerializable {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qq";
		else
			return "net/minecraft/util/TupleIntJsonSerializable";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qq";
		else
			return "TupleIntJsonSerializable";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqq;";
		else
			return "Lnet/minecraft/util/TupleIntJsonSerializable;";
	}

	/**
	 * <p>
	 * Name: setIntegerValue
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_151188_a = McMappingDatabase.getSRG("TupleIntJsonSerializable.func_151188_a");

	/**
	 * <p>
	 * Name: getIntegerValue
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_151189_a = McMappingDatabase.getSRG("TupleIntJsonSerializable.func_151189_a");

	/**
	 * <p>
	 * Name: integerValue
	 * </p>
	 */
	public static McObfPair field_151192_a = McMappingDatabase.getSRG("field_151192_a");

	/**
	 * <p>
	 * Name: setJsonSerializableValue
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/IJsonSerializable;)V]
	 * </p>
	 */
	public static McObfPair func_151190_a = McMappingDatabase.getSRG("TupleIntJsonSerializable.func_151190_a");

	/**
	 * <p>
	 * Name: jsonSerializableValue
	 * </p>
	 */
	public static McObfPair field_151191_b = McMappingDatabase.getSRG("field_151191_b");

	/**
	 * <p>
	 * Name: getJsonSerializableValue
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/IJsonSerializable;]
	 * </p>
	 */
	public static McObfPair func_151187_b = McMappingDatabase.getSRG("TupleIntJsonSerializable.func_151187_b");

}

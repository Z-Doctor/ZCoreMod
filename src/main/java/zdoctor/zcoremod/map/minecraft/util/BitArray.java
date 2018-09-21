package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BitArray {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qw";
		else
			return "net/minecraft/util/BitArray";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qw";
		else
			return "BitArray";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqw;";
		else
			return "Lnet/minecraft/util/BitArray;";
	}

	/**
	 * <p>
	 * Name: size
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188144_b = McMappingDatabase.getSRG("BitArray.func_188144_b");

	/**
	 * <p>
	 * Name: longArray
	 * </p>
	 */
	public static McObfPair field_188145_a = McMappingDatabase.getSRG("field_188145_a");

	/**
	 * <p>
	 * Name: arraySize
	 * </p>
	 */
	public static McObfPair field_188148_d = McMappingDatabase.getSRG("field_188148_d");

	/**
	 * <p>
	 * Name: getAt
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_188142_a = McMappingDatabase.getSRG("BitArray.func_188142_a");

	/**
	 * <p>
	 * Name: maxEntryValue
	 * </p>
	 */
	public static McObfPair field_188147_c = McMappingDatabase.getSRG("field_188147_c");

	/**
	 * <p>
	 * Name: bitsPerEntry
	 * </p>
	 */
	public static McObfPair field_188146_b = McMappingDatabase.getSRG("field_188146_b");

	/**
	 * <p>
	 * Name: setAt
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_188141_a = McMappingDatabase.getSRG("BitArray.func_188141_a");

	/**
	 * <p>
	 * Name: getBackingLongArray
	 * </p>
	 * <p>
	 * Desc: [()[J]
	 * </p>
	 */
	public static McObfPair func_188143_a = McMappingDatabase.getSRG("BitArray.func_188143_a");

}

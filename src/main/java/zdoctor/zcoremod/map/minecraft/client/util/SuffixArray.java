package zdoctor.zcoremod.map.minecraft.client.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SuffixArray {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgz";
		else
			return "net/minecraft/client/util/SuffixArray";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgz";
		else
			return "SuffixArray";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgz;";
		else
			return "Lnet/minecraft/client/util/SuffixArray;";
	}

	/**
	 * <p>
	 * Name: search
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_194055_a = McMappingDatabase.getSRG("SuffixArray.func_194055_a");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_194058_a = McMappingDatabase.getSRG("SuffixArray.func_194058_a");

	/**
	 * <p>
	 * Name: list
	 * </p>
	 */
	public static McObfPair field_194061_a = McMappingDatabase.getSRG("field_194061_a");

	/**
	 * <p>
	 * Name: DEBUG_PRINT_ARRAY
	 * </p>
	 */
	public static McObfPair field_194063_c = McMappingDatabase.getSRG("field_194063_c");

	/**
	 * <p>
	 * Name: printArray
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_194060_b = McMappingDatabase.getSRG("SuffixArray.func_194060_b");

	/**
	 * <p>
	 * Name: maxStringLength
	 * </p>
	 */
	public static McObfPair field_194069_i = McMappingDatabase.getSRG("field_194069_i");

	/**
	 * <p>
	 * Name: getString
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_194059_a = McMappingDatabase.getSRG("SuffixArray.func_194059_a");

	/**
	 * <p>
	 * Name: wordStarts
	 * </p>
	 */
	public static McObfPair field_194066_f = McMappingDatabase.getSRG("field_194066_f");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_194064_d = McMappingDatabase.getSRG("field_194064_d");

	/**
	 * <p>
	 * Name: DEBUG_PRINT_COMPARISONS
	 * </p>
	 */
	public static McObfPair field_194062_b = McMappingDatabase.getSRG("field_194062_b");

	/**
	 * <p>
	 * Name: offsets
	 * </p>
	 */
	public static McObfPair field_194068_h = McMappingDatabase.getSRG("field_194068_h");

	/**
	 * <p>
	 * Name: compare
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)I]
	 * </p>
	 */
	public static McObfPair func_194056_a = McMappingDatabase.getSRG("SuffixArray.func_194056_a");

	/**
	 * <p>
	 * Name: suffixToT
	 * </p>
	 */
	public static McObfPair field_194067_g = McMappingDatabase.getSRG("field_194067_g");

	/**
	 * <p>
	 * Name: chars
	 * </p>
	 */
	public static McObfPair field_194065_e = McMappingDatabase.getSRG("field_194065_e");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_194057_a = McMappingDatabase.getSRG("SuffixArray.func_194057_a");

}

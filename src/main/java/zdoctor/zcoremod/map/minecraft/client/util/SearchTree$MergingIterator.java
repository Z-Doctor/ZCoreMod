package zdoctor.zcoremod.map.minecraft.client.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SearchTree$MergingIterator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgw$a";
		else
			return "net/minecraft/client/util/SearchTree$MergingIterator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgw$a";
		else
			return "SearchTree$MergingIterator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgw$a;";
		else
			return "Lnet/minecraft/client/util/SearchTree$MergingIterator;";
	}

	/**
	 * <p>
	 * Name: left
	 * </p>
	 */
	public static McObfPair field_194036_d = McMappingDatabase.getSRG("field_194036_d");

	/**
	 * <p>
	 * Name: right
	 * </p>
	 */
	public static McObfPair field_194037_e = McMappingDatabase.getSRG("field_194037_e");

	/**
	 * <p>
	 * Name: leftItr
	 * </p>
	 */
	public static McObfPair field_194033_a = McMappingDatabase.getSRG("field_194033_a");

	/**
	 * <p>
	 * Name: numbers
	 * </p>
	 */
	public static McObfPair field_194035_c = McMappingDatabase.getSRG("field_194035_c");

	/**
	 * <p>
	 * Name: rightItr
	 * </p>
	 */
	public static McObfPair field_194034_b = McMappingDatabase.getSRG("field_194034_b");

}

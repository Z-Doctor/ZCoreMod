package zdoctor.zcoremod.map.minecraft.client.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SearchTree {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgw";
		else
			return "net/minecraft/client/util/SearchTree";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgw";
		else
			return "SearchTree";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgw;";
		else
			return "Lnet/minecraft/client/util/SearchTree;";
	}

	/**
	 * <p>
	 * Name: byId
	 * </p>
	 */
	public static McObfPair field_194044_a = McMappingDatabase.getSRG("field_194044_a");

	/**
	 * <p>
	 * Name: index
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_194042_b = McMappingDatabase.getSRG("SearchTree.func_194042_b");

	/**
	 * <p>
	 * Name: byName
	 * </p>
	 */
	public static McObfPair field_194045_b = McMappingDatabase.getSRG("field_194045_b");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_194043_a = McMappingDatabase.getSRG("SearchTree.func_194043_a");

	/**
	 * <p>
	 * Name: numericContents
	 * </p>
	 */
	public static McObfPair field_194049_f = McMappingDatabase.getSRG("field_194049_f");

	/**
	 * <p>
	 * Name: search
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_194038_a = McMappingDatabase.getSRG("SearchTree.func_194038_a");

	/**
	 * <p>
	 * Name: idFunc
	 * </p>
	 */
	public static McObfPair field_194047_d = McMappingDatabase.getSRG("field_194047_d");

	/**
	 * <p>
	 * Name: contents
	 * </p>
	 */
	public static McObfPair field_194048_e = McMappingDatabase.getSRG("field_194048_e");

	/**
	 * <p>
	 * Name: nameFunc
	 * </p>
	 */
	public static McObfPair field_194046_c = McMappingDatabase.getSRG("field_194046_c");

	/**
	 * <p>
	 * Name: recalculate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_194040_a = McMappingDatabase.getSRG("SearchTree.func_194040_a");

}

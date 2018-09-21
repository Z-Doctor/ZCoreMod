package zdoctor.zcoremod.map.minecraft.client.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SearchTreeManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgx";
		else
			return "net/minecraft/client/util/SearchTreeManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgx";
		else
			return "SearchTreeManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgx;";
		else
			return "Lnet/minecraft/client/util/SearchTreeManager;";
	}

	/**
	 * <p>
	 * Name: trees
	 * </p>
	 */
	public static McObfPair field_194013_c = McMappingDatabase.getSRG("field_194013_c");

	/**
	 * <p>
	 * Name: register
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/util/SearchTreeManager$Key;Lnet/minecraft/client/util/SearchTree;)V]
	 * </p>
	 */
	public static McObfPair func_194009_a = McMappingDatabase.getSRG("SearchTreeManager.func_194009_a");

	/**
	 * <p>
	 * Name: RECIPES
	 * </p>
	 */
	public static McObfPair field_194012_b = McMappingDatabase.getSRG("field_194012_b");

	/**
	 * <p>
	 * Name: get
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/util/SearchTreeManager$Key;)Lnet/minecraft/client/util/ISearchTree;]
	 * </p>
	 */
	public static McObfPair func_194010_a = McMappingDatabase.getSRG("SearchTreeManager.func_194010_a");

	/**
	 * <p>
	 * Name: ITEMS
	 * </p>
	 */
	public static McObfPair field_194011_a = McMappingDatabase.getSRG("field_194011_a");

	/**
	 * <p>
	 * Name: onResourceManagerReload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110549_a = McMappingDatabase.getSRG("SearchTreeManager.func_110549_a");

}

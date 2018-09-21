package zdoctor.zcoremod.map.minecraft.client.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ISearchTree {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgy";
		else
			return "net/minecraft/client/util/ISearchTree";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgy";
		else
			return "ISearchTree";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgy;";
		else
			return "Lnet/minecraft/client/util/ISearchTree;";
	}

	/**
	 * <p>
	 * Name: search
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_194038_a = McMappingDatabase.getSRG("ISearchTree.func_194038_a");

}

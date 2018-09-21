package zdoctor.zcoremod.map.minecraft.client.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class JsonException$Entry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nj$a";
		else
			return "net/minecraft/client/util/JsonException$Entry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nj$a";
		else
			return "JsonException$Entry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnj$a;";
		else
			return "Lnet/minecraft/client/util/JsonException$Entry;";
	}

	/**
	 * <p>
	 * Name: addJsonKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_151373_a = McMappingDatabase.getSRG("JsonException$Entry.func_151373_a");

	/**
	 * <p>
	 * Name: jsonKeys
	 * </p>
	 */
	public static McObfPair field_151375_b = McMappingDatabase.getSRG("field_151375_b");

	/**
	 * <p>
	 * Name: getJsonKeys
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_151372_b = McMappingDatabase.getSRG("JsonException$Entry.func_151372_b");

	/**
	 * <p>
	 * Name: filename
	 * </p>
	 */
	public static McObfPair field_151376_a = McMappingDatabase.getSRG("field_151376_a");

}

package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FallbackResourceManager$InputStreamLeakedResourceLogger {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cei$a";
		else
			return "net/minecraft/client/resources/FallbackResourceManager$InputStreamLeakedResourceLogger";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cei$a";
		else
			return "FallbackResourceManager$InputStreamLeakedResourceLogger";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcei$a;";
		else
			return "Lnet/minecraft/client/resources/FallbackResourceManager$InputStreamLeakedResourceLogger;";
	}

	/**
	 * <p>
	 * Name: inputStream
	 * </p>
	 */
	public static McObfPair field_177330_a = McMappingDatabase.getSRG("field_177330_a");

	/**
	 * <p>
	 * Name: isClosed
	 * </p>
	 */
	public static McObfPair field_177329_c = McMappingDatabase.getSRG("field_177329_c");

	/**
	 * <p>
	 * Name: message
	 * </p>
	 */
	public static McObfPair field_177328_b = McMappingDatabase.getSRG("field_177328_b");

}

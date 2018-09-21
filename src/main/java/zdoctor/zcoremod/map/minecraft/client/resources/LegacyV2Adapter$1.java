package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LegacyV2Adapter$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ces$1";
		else
			return "net/minecraft/client/resources/LegacyV2Adapter$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ces$1";
		else
			return "LegacyV2Adapter$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lces$1;";
		else
			return "Lnet/minecraft/client/resources/LegacyV2Adapter$1;";
	}

	/**
	 * <p>
	 * Name: getResourcePath
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_110623_a = McMappingDatabase.getSRG("LegacyV2Adapter$1.func_110623_a");

}

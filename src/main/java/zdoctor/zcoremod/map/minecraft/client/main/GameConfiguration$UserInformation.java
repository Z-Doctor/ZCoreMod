package zdoctor.zcoremod.map.minecraft.client.main;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GameConfiguration$UserInformation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boz$e";
		else
			return "net/minecraft/client/main/GameConfiguration$UserInformation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boz$e";
		else
			return "GameConfiguration$UserInformation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lboz$e;";
		else
			return "Lnet/minecraft/client/main/GameConfiguration$UserInformation;";
	}

	/**
	 * <p>
	 * Name: proxy
	 * </p>
	 */
	public static McObfPair field_178751_c = McMappingDatabase.getSRG("field_178751_c");

	/**
	 * <p>
	 * Name: session
	 * </p>
	 */
	public static McObfPair field_178752_a = McMappingDatabase.getSRG("field_178752_a");

	/**
	 * <p>
	 * Name: userProperties
	 * </p>
	 */
	public static McObfPair field_178750_b = McMappingDatabase.getSRG("field_178750_b");

	/**
	 * <p>
	 * Name: profileProperties
	 * </p>
	 */
	public static McObfPair field_181172_c = McMappingDatabase.getSRG("field_181172_c");

}

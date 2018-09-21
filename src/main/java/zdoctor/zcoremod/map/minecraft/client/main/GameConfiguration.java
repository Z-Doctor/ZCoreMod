package zdoctor.zcoremod.map.minecraft.client.main;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GameConfiguration {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boz";
		else
			return "net/minecraft/client/main/GameConfiguration";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boz";
		else
			return "GameConfiguration";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lboz;";
		else
			return "Lnet/minecraft/client/main/GameConfiguration;";
	}

	/**
	 * <p>
	 * Name: folderInfo
	 * </p>
	 */
	public static McObfPair field_178744_c = McMappingDatabase.getSRG("field_178744_c");

	/**
	 * <p>
	 * Name: displayInfo
	 * </p>
	 */
	public static McObfPair field_178743_b = McMappingDatabase.getSRG("field_178743_b");

	/**
	 * <p>
	 * Name: serverInfo
	 * </p>
	 */
	public static McObfPair field_178742_e = McMappingDatabase.getSRG("field_178742_e");

	/**
	 * <p>
	 * Name: userInfo
	 * </p>
	 */
	public static McObfPair field_178745_a = McMappingDatabase.getSRG("field_178745_a");

	/**
	 * <p>
	 * Name: gameInfo
	 * </p>
	 */
	public static McObfPair field_178741_d = McMappingDatabase.getSRG("field_178741_d");

}

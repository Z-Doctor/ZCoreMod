package zdoctor.zcoremod.map.minecraft.client.main;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GameConfiguration$GameInformation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boz$c";
		else
			return "net/minecraft/client/main/GameConfiguration$GameInformation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boz$c";
		else
			return "GameConfiguration$GameInformation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lboz$c;";
		else
			return "Lnet/minecraft/client/main/GameConfiguration$GameInformation;";
	}

	/**
	 * <p>
	 * Name: versionType
	 * </p>
	 */
	public static McObfPair field_187053_c = McMappingDatabase.getSRG("field_187053_c");

	/**
	 * <p>
	 * Name: isDemo
	 * </p>
	 */
	public static McObfPair field_178756_a = McMappingDatabase.getSRG("field_178756_a");

	/**
	 * <p>
	 * Name: version
	 * </p>
	 */
	public static McObfPair field_178755_b = McMappingDatabase.getSRG("field_178755_b");

}

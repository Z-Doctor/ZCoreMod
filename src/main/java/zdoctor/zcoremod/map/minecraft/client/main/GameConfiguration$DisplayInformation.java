package zdoctor.zcoremod.map.minecraft.client.main;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GameConfiguration$DisplayInformation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boz$a";
		else
			return "net/minecraft/client/main/GameConfiguration$DisplayInformation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boz$a";
		else
			return "GameConfiguration$DisplayInformation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lboz$a;";
		else
			return "Lnet/minecraft/client/main/GameConfiguration$DisplayInformation;";
	}

	/**
	 * <p>
	 * Name: checkGlErrors
	 * </p>
	 */
	public static McObfPair field_178761_d = McMappingDatabase.getSRG("field_178761_d");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_178762_b = McMappingDatabase.getSRG("field_178762_b");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_178764_a = McMappingDatabase.getSRG("field_178764_a");

	/**
	 * <p>
	 * Name: fullscreen
	 * </p>
	 */
	public static McObfPair field_178763_c = McMappingDatabase.getSRG("field_178763_c");

}

package zdoctor.zcoremod.map.minecraft.client.main;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GameConfiguration$ServerInformation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boz$d";
		else
			return "net/minecraft/client/main/GameConfiguration$ServerInformation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boz$d";
		else
			return "GameConfiguration$ServerInformation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lboz$d;";
		else
			return "Lnet/minecraft/client/main/GameConfiguration$ServerInformation;";
	}

	/**
	 * <p>
	 * Name: serverName
	 * </p>
	 */
	public static McObfPair field_178754_a = McMappingDatabase.getSRG("field_178754_a");

	/**
	 * <p>
	 * Name: serverPort
	 * </p>
	 */
	public static McObfPair field_178753_b = McMappingDatabase.getSRG("field_178753_b");

}

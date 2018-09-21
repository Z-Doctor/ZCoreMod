package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Vector3d {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cie";
		else
			return "net/minecraft/client/renderer/Vector3d";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cie";
		else
			return "Vector3d";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcie;";
		else
			return "Lnet/minecraft/client/renderer/Vector3d;";
	}

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_181061_c = McMappingDatabase.getSRG("field_181061_c");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_181059_a = McMappingDatabase.getSRG("field_181059_a");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_181060_b = McMappingDatabase.getSRG("field_181060_b");

}

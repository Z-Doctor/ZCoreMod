package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumFaceDirection$Constants {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bup$a";
		else
			return "net/minecraft/client/renderer/EnumFaceDirection$Constants";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bup$a";
		else
			return "EnumFaceDirection$Constants";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbup$a;";
		else
			return "Lnet/minecraft/client/renderer/EnumFaceDirection$Constants;";
	}

	/**
	 * <p>
	 * Name: UP_INDEX
	 * </p>
	 */
	public static McObfPair field_179179_b = McMappingDatabase.getSRG("field_179179_b");

	/**
	 * <p>
	 * Name: SOUTH_INDEX
	 * </p>
	 */
	public static McObfPair field_179181_a = McMappingDatabase.getSRG("field_179181_a");

	/**
	 * <p>
	 * Name: DOWN_INDEX
	 * </p>
	 */
	public static McObfPair field_179178_e = McMappingDatabase.getSRG("field_179178_e");

	/**
	 * <p>
	 * Name: NORTH_INDEX
	 * </p>
	 */
	public static McObfPair field_179177_d = McMappingDatabase.getSRG("field_179177_d");

	/**
	 * <p>
	 * Name: EAST_INDEX
	 * </p>
	 */
	public static McObfPair field_179180_c = McMappingDatabase.getSRG("field_179180_c");

	/**
	 * <p>
	 * Name: WEST_INDEX
	 * </p>
	 */
	public static McObfPair field_179176_f = McMappingDatabase.getSRG("field_179176_f");

}

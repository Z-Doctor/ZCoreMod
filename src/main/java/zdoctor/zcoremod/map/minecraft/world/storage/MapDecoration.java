package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapDecoration {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "beu";
		else
			return "net/minecraft/world/storage/MapDecoration";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "beu";
		else
			return "MapDecoration";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbeu;";
		else
			return "Lnet/minecraft/world/storage/MapDecoration;";
	}

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_191181_a = McMappingDatabase.getSRG("field_191181_a");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/storage/MapDecoration$Type;]
	 * </p>
	 */
	public static McObfPair func_191179_b = McMappingDatabase.getSRG("MapDecoration.func_191179_b");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_176112_b = McMappingDatabase.getSRG("MapDecoration.func_176112_b");

	/**
	 * <p>
	 * Name: renderOnFrame
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191180_f = McMappingDatabase.getSRG("MapDecoration.func_191180_f");

	/**
	 * <p>
	 * Name: getImage
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_176110_a = McMappingDatabase.getSRG("MapDecoration.func_176110_a");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_176116_c = McMappingDatabase.getSRG("field_176116_c");

	/**
	 * <p>
	 * Name: rotation
	 * </p>
	 */
	public static McObfPair field_176114_d = McMappingDatabase.getSRG("field_176114_d");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_176115_b = McMappingDatabase.getSRG("field_176115_b");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_176113_c = McMappingDatabase.getSRG("MapDecoration.func_176113_c");

	/**
	 * <p>
	 * Name: getRotation
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_176111_d = McMappingDatabase.getSRG("MapDecoration.func_176111_d");

}

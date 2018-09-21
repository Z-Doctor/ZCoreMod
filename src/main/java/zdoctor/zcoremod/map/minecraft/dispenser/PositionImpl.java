package zdoctor.zcoremod.map.minecraft.dispenser;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PositionImpl {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fl";
		else
			return "net/minecraft/dispenser/PositionImpl";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fl";
		else
			return "PositionImpl";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfl;";
		else
			return "Lnet/minecraft/dispenser/PositionImpl;";
	}

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_82630_a = McMappingDatabase.getSRG("field_82630_a");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_82629_c = McMappingDatabase.getSRG("field_82629_c");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_82628_b = McMappingDatabase.getSRG("field_82628_b");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_82615_a = McMappingDatabase.getSRG("PositionImpl.func_82615_a");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_82616_c = McMappingDatabase.getSRG("PositionImpl.func_82616_c");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_82617_b = McMappingDatabase.getSRG("PositionImpl.func_82617_b");

}

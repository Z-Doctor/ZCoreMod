package zdoctor.zcoremod.map.minecraft.dispenser;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IPosition {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fk";
		else
			return "net/minecraft/dispenser/IPosition";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fk";
		else
			return "IPosition";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfk;";
		else
			return "Lnet/minecraft/dispenser/IPosition;";
	}

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_82616_c = McMappingDatabase.getSRG("IPosition.func_82616_c");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_82615_a = McMappingDatabase.getSRG("IPosition.func_82615_a");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_82617_b = McMappingDatabase.getSRG("IPosition.func_82617_b");

}

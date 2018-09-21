package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IHopper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avv";
		else
			return "net/minecraft/tileentity/IHopper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avv";
		else
			return "IHopper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavv;";
		else
			return "Lnet/minecraft/tileentity/IHopper;";
	}

	/**
	 * <p>
	 * Name: getYPos
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_96109_aB = McMappingDatabase.getSRG("IHopper.func_96109_aB");

	/**
	 * <p>
	 * Name: getZPos
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_96108_aC = McMappingDatabase.getSRG("IHopper.func_96108_aC");

	/**
	 * <p>
	 * Name: getWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_145831_w = McMappingDatabase.getSRG("IHopper.func_145831_w");

	/**
	 * <p>
	 * Name: getXPos
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_96107_aA = McMappingDatabase.getSRG("IHopper.func_96107_aA");

}

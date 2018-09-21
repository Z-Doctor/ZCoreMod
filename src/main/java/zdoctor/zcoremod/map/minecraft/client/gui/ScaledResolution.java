package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ScaledResolution {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bit";
		else
			return "net/minecraft/client/gui/ScaledResolution";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bit";
		else
			return "ScaledResolution";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbit;";
		else
			return "Lnet/minecraft/client/gui/ScaledResolution;";
	}

	/**
	 * <p>
	 * Name: scaledWidth
	 * </p>
	 */
	public static McObfPair field_78333_a = McMappingDatabase.getSRG("field_78333_a");

	/**
	 * <p>
	 * Name: scaledHeight
	 * </p>
	 */
	public static McObfPair field_78331_b = McMappingDatabase.getSRG("field_78331_b");

	/**
	 * <p>
	 * Name: scaledHeightD
	 * </p>
	 */
	public static McObfPair field_78329_d = McMappingDatabase.getSRG("field_78329_d");

	/**
	 * <p>
	 * Name: getScaledWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_78326_a = McMappingDatabase.getSRG("ScaledResolution.func_78326_a");

	/**
	 * <p>
	 * Name: getScaledHeight_double
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_78324_d = McMappingDatabase.getSRG("ScaledResolution.func_78324_d");

	/**
	 * <p>
	 * Name: scaledWidthD
	 * </p>
	 */
	public static McObfPair field_78332_c = McMappingDatabase.getSRG("field_78332_c");

	/**
	 * <p>
	 * Name: getScaledWidth_double
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_78327_c = McMappingDatabase.getSRG("ScaledResolution.func_78327_c");

	/**
	 * <p>
	 * Name: scaleFactor
	 * </p>
	 */
	public static McObfPair field_78330_e = McMappingDatabase.getSRG("field_78330_e");

	/**
	 * <p>
	 * Name: getScaleFactor
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_78325_e = McMappingDatabase.getSRG("ScaledResolution.func_78325_e");

	/**
	 * <p>
	 * Name: getScaledHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_78328_b = McMappingDatabase.getSRG("ScaledResolution.func_78328_b");

}

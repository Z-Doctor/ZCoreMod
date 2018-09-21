package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityBeacon$BeamSegment {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avh$a";
		else
			return "net/minecraft/tileentity/TileEntityBeacon$BeamSegment";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avh$a";
		else
			return "TileEntityBeacon$BeamSegment";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavh$a;";
		else
			return "Lnet/minecraft/tileentity/TileEntityBeacon$BeamSegment;";
	}

	/**
	 * <p>
	 * Name: colors
	 * </p>
	 */
	public static McObfPair field_177266_a = McMappingDatabase.getSRG("field_177266_a");

	/**
	 * <p>
	 * Name: incrementHeight
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177262_a = McMappingDatabase.getSRG("TileEntityBeacon$BeamSegment.func_177262_a");

	/**
	 * <p>
	 * Name: getHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177264_c = McMappingDatabase.getSRG("TileEntityBeacon$BeamSegment.func_177264_c");

	/**
	 * <p>
	 * Name: getColors
	 * </p>
	 * <p>
	 * Desc: [()[F]
	 * </p>
	 */
	public static McObfPair func_177263_b = McMappingDatabase.getSRG("TileEntityBeacon$BeamSegment.func_177263_b");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_177265_b = McMappingDatabase.getSRG("field_177265_b");

}

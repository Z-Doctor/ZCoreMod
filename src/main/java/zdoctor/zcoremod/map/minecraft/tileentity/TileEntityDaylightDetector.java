package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityDaylightDetector {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avo";
		else
			return "net/minecraft/tileentity/TileEntityDaylightDetector";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avo";
		else
			return "TileEntityDaylightDetector";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavo;";
		else
			return "Lnet/minecraft/tileentity/TileEntityDaylightDetector;";
	}

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("TileEntityDaylightDetector.func_73660_a");

}

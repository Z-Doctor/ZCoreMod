package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityEndPortal {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awg";
		else
			return "net/minecraft/tileentity/TileEntityEndPortal";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awg";
		else
			return "TileEntityEndPortal";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawg;";
		else
			return "Lnet/minecraft/tileentity/TileEntityEndPortal;";
	}

	/**
	 * <p>
	 * Name: shouldRenderFace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_184313_a = McMappingDatabase.getSRG("TileEntityEndPortal.func_184313_a");

}

package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityShulkerBox$AnimationStatus {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awb$a";
		else
			return "net/minecraft/tileentity/TileEntityShulkerBox$AnimationStatus";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awb$a";
		else
			return "TileEntityShulkerBox$AnimationStatus";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawb$a;";
		else
			return "Lnet/minecraft/tileentity/TileEntityShulkerBox$AnimationStatus;";
	}

}

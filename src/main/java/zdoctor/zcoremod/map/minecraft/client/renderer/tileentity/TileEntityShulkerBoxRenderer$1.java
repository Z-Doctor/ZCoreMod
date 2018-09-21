package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityShulkerBoxRenderer$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxe$1";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntityShulkerBoxRenderer$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxe$1";
		else
			return "TileEntityShulkerBoxRenderer$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxe$1;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntityShulkerBoxRenderer$1;";
	}

}

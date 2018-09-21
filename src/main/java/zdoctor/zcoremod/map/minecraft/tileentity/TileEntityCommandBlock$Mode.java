package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityCommandBlock$Mode {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avm$a";
		else
			return "net/minecraft/tileentity/TileEntityCommandBlock$Mode";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avm$a";
		else
			return "TileEntityCommandBlock$Mode";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavm$a;";
		else
			return "Lnet/minecraft/tileentity/TileEntityCommandBlock$Mode;";
	}

}

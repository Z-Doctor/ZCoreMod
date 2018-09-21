package zdoctor.zcoremod.map.minecraft.block.state;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockFaceShape {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awr";
		else
			return "net/minecraft/block/state/BlockFaceShape";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awr";
		else
			return "BlockFaceShape";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawr;";
		else
			return "Lnet/minecraft/block/state/BlockFaceShape;";
	}

}

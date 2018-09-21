package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockRotatedPillar$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atl$1";
		else
			return "net/minecraft/block/BlockRotatedPillar$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atl$1";
		else
			return "BlockRotatedPillar$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Latl$1;";
		else
			return "Lnet/minecraft/block/BlockRotatedPillar$1;";
	}

}

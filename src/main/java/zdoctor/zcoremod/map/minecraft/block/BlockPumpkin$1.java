package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPumpkin$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asy$1";
		else
			return "net/minecraft/block/BlockPumpkin$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asy$1";
		else
			return "BlockPumpkin$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lasy$1;";
		else
			return "Lnet/minecraft/block/BlockPumpkin$1;";
	}

}

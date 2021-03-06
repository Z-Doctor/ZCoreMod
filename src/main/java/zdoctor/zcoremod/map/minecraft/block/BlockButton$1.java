package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockButton$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "apd$1";
		else
			return "net/minecraft/block/BlockButton$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "apd$1";
		else
			return "BlockButton$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lapd$1;";
		else
			return "Lnet/minecraft/block/BlockButton$1;";
	}

}

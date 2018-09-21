package zdoctor.zcoremod.map.minecraft.block.state;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockWorldState$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aww$1";
		else
			return "net/minecraft/block/state/BlockWorldState$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aww$1";
		else
			return "BlockWorldState$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laww$1;";
		else
			return "Lnet/minecraft/block/state/BlockWorldState$1;";
	}

}

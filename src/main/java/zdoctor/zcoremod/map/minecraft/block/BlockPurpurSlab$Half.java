package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPurpurSlab$Half {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asz$b";
		else
			return "net/minecraft/block/BlockPurpurSlab$Half";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asz$b";
		else
			return "BlockPurpurSlab$Half";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lasz$b;";
		else
			return "Lnet/minecraft/block/BlockPurpurSlab$Half;";
	}

	/**
	 * <p>
	 * Name: isDouble
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_176552_j = McMappingDatabase.getSRG("BlockPurpurSlab$Half.func_176552_j");

}

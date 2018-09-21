package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPurpurSlab$Double {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asz$a";
		else
			return "net/minecraft/block/BlockPurpurSlab$Double";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asz$a";
		else
			return "BlockPurpurSlab$Double";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lasz$a;";
		else
			return "Lnet/minecraft/block/BlockPurpurSlab$Double;";
	}

	/**
	 * <p>
	 * Name: isDouble
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_176552_j = McMappingDatabase.getSRG("BlockPurpurSlab$Double.func_176552_j");

}

package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockHalfStoneSlabNew {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "are";
		else
			return "net/minecraft/block/BlockHalfStoneSlabNew";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "are";
		else
			return "BlockHalfStoneSlabNew";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lare;";
		else
			return "Lnet/minecraft/block/BlockHalfStoneSlabNew;";
	}

	/**
	 * <p>
	 * Name: isDouble
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_176552_j = McMappingDatabase.getSRG("BlockHalfStoneSlabNew.func_176552_j");

}

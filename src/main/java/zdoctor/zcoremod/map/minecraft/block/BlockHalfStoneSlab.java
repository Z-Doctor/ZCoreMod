package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockHalfStoneSlab {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arg";
		else
			return "net/minecraft/block/BlockHalfStoneSlab";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arg";
		else
			return "BlockHalfStoneSlab";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Larg;";
		else
			return "Lnet/minecraft/block/BlockHalfStoneSlab;";
	}

	/**
	 * <p>
	 * Name: isDouble
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_176552_j = McMappingDatabase.getSRG("BlockHalfStoneSlab.func_176552_j");

}

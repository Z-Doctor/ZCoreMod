package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockHalfWoodSlab {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ari";
		else
			return "net/minecraft/block/BlockHalfWoodSlab";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ari";
		else
			return "BlockHalfWoodSlab";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lari;";
		else
			return "Lnet/minecraft/block/BlockHalfWoodSlab;";
	}

	/**
	 * <p>
	 * Name: isDouble
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_176552_j = McMappingDatabase.getSRG("BlockHalfWoodSlab.func_176552_j");

}

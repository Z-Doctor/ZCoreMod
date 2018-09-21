package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockHardenedClay {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arj";
		else
			return "net/minecraft/block/BlockHardenedClay";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arj";
		else
			return "BlockHardenedClay";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Larj;";
		else
			return "Lnet/minecraft/block/BlockHardenedClay;";
	}

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_180659_g = McMappingDatabase.getSRG("BlockHardenedClay.func_180659_g");

}

package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStainedHardenedClay {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "auc";
		else
			return "net/minecraft/block/BlockStainedHardenedClay";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "auc";
		else
			return "BlockStainedHardenedClay";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lauc;";
		else
			return "Lnet/minecraft/block/BlockStainedHardenedClay;";
	}

	/**
	 * <p>
	 * Name: MAP_COLORS
	 * </p>
	 */
	public static McObfPair field_193389_b = McMappingDatabase.getSRG("field_193389_b");

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_180659_g = McMappingDatabase.getSRG("BlockStainedHardenedClay.func_180659_g");

}

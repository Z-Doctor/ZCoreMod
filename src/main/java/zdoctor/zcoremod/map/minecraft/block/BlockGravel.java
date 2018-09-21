package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockGravel {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ard";
		else
			return "net/minecraft/block/BlockGravel";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ard";
		else
			return "BlockGravel";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lard;";
		else
			return "Lnet/minecraft/block/BlockGravel;";
	}

	/**
	 * <p>
	 * Name: getItemDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_180660_a = McMappingDatabase.getSRG("BlockGravel.func_180660_a");

	/**
	 * <p>
	 * Name: getDustColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_189876_x = McMappingDatabase.getSRG("BlockGravel.func_189876_x");

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_180659_g = McMappingDatabase.getSRG("BlockGravel.func_180659_g");

}

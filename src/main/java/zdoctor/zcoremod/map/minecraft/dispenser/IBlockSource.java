package zdoctor.zcoremod.map.minecraft.dispenser;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IBlockSource {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "eu";
		else
			return "net/minecraft/dispenser/IBlockSource";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "eu";
		else
			return "IBlockSource";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Leu;";
		else
			return "Lnet/minecraft/dispenser/IBlockSource;";
	}

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_189992_e = McMappingDatabase.getSRG("IBlockSource.func_189992_e");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_82616_c = McMappingDatabase.getSRG("IBlockSource.func_82616_c");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_82617_b = McMappingDatabase.getSRG("IBlockSource.func_82617_b");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_82615_a = McMappingDatabase.getSRG("IBlockSource.func_82615_a");

	/**
	 * <p>
	 * Name: getBlockTileEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/tileentity/TileEntity;]
	 * </p>
	 */
	public static McObfPair func_150835_j = McMappingDatabase.getSRG("IBlockSource.func_150835_j");

	/**
	 * <p>
	 * Name: getBlockPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180699_d = McMappingDatabase.getSRG("IBlockSource.func_180699_d");

}

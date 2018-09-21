package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockSourceImpl {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ev";
		else
			return "net/minecraft/block/BlockSourceImpl";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ev";
		else
			return "BlockSourceImpl";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lev;";
		else
			return "Lnet/minecraft/block/BlockSourceImpl;";
	}

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_82615_a = McMappingDatabase.getSRG("BlockSourceImpl.func_82615_a");

	/**
	 * <p>
	 * Name: getBlockTileEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/tileentity/TileEntity;]
	 * </p>
	 */
	public static McObfPair func_150835_j = McMappingDatabase.getSRG("BlockSourceImpl.func_150835_j");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_82617_b = McMappingDatabase.getSRG("BlockSourceImpl.func_82617_b");

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_189992_e = McMappingDatabase.getSRG("BlockSourceImpl.func_189992_e");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_82616_c = McMappingDatabase.getSRG("BlockSourceImpl.func_82616_c");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_82627_a = McMappingDatabase.getSRG("field_82627_a");

	/**
	 * <p>
	 * Name: getBlockPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180699_d = McMappingDatabase.getSRG("BlockSourceImpl.func_180699_d");

	/**
	 * <p>
	 * Name: getWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_82618_k = McMappingDatabase.getSRG("BlockSourceImpl.func_82618_k");

	/**
	 * <p>
	 * Name: pos
	 * </p>
	 */
	public static McObfPair field_179317_b = McMappingDatabase.getSRG("field_179317_b");

}

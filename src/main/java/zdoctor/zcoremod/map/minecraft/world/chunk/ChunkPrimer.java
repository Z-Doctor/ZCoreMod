package zdoctor.zcoremod.map.minecraft.world.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkPrimer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayw";
		else
			return "net/minecraft/world/chunk/ChunkPrimer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayw";
		else
			return "ChunkPrimer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layw;";
		else
			return "Lnet/minecraft/world/chunk/ChunkPrimer;";
	}

	/**
	 * <p>
	 * Name: setBlockState
	 * </p>
	 * <p>
	 * Desc: [(IIILnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_177855_a = McMappingDatabase.getSRG("ChunkPrimer.func_177855_a");

	/**
	 * <p>
	 * Name: getBlockIndex
	 * </p>
	 * <p>
	 * Desc: [(III)I]
	 * </p>
	 */
	public static McObfPair func_186137_b = McMappingDatabase.getSRG("ChunkPrimer.func_186137_b");

	/**
	 * <p>
	 * Name: data
	 * </p>
	 */
	public static McObfPair field_177860_a = McMappingDatabase.getSRG("field_177860_a");

	/**
	 * <p>
	 * Name: findGroundBlockIdx
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_186138_a = McMappingDatabase.getSRG("ChunkPrimer.func_186138_a");

	/**
	 * <p>
	 * Name: DEFAULT_STATE
	 * </p>
	 */
	public static McObfPair field_177859_b = McMappingDatabase.getSRG("field_177859_b");

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [(III)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_177856_a = McMappingDatabase.getSRG("ChunkPrimer.func_177856_a");

}

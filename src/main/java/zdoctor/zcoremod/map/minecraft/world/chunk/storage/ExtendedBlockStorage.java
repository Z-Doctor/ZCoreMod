package zdoctor.zcoremod.map.minecraft.world.chunk.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ExtendedBlockStorage {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axx";
		else
			return "net/minecraft/world/chunk/storage/ExtendedBlockStorage";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axx";
		else
			return "ExtendedBlockStorage";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxx;";
		else
			return "Lnet/minecraft/world/chunk/storage/ExtendedBlockStorage;";
	}

	/**
	 * <p>
	 * Name: getBlockLight
	 * </p>
	 * <p>
	 * Desc: [(III)I]
	 * </p>
	 */
	public static McObfPair func_76674_d = McMappingDatabase.getSRG("ExtendedBlockStorage.func_76674_d");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76663_a = McMappingDatabase.getSRG("ExtendedBlockStorage.func_76663_a");

	/**
	 * <p>
	 * Name: yBase
	 * </p>
	 */
	public static McObfPair field_76684_a = McMappingDatabase.getSRG("field_76684_a");

	/**
	 * <p>
	 * Name: getBlockLight
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/chunk/NibbleArray;]
	 * </p>
	 */
	public static McObfPair func_76661_k = McMappingDatabase.getSRG("ExtendedBlockStorage.func_76661_k");

	/**
	 * <p>
	 * Name: setBlockLight
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_76677_d = McMappingDatabase.getSRG("ExtendedBlockStorage.func_76677_d");

	/**
	 * <p>
	 * Name: setSkyLight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/NibbleArray;)V]
	 * </p>
	 */
	public static McObfPair func_76666_d = McMappingDatabase.getSRG("ExtendedBlockStorage.func_76666_d");

	/**
	 * <p>
	 * Name: getData
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/chunk/BlockStateContainer;]
	 * </p>
	 */
	public static McObfPair func_186049_g = McMappingDatabase.getSRG("ExtendedBlockStorage.func_186049_g");

	/**
	 * <p>
	 * Name: getSkyLight
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/chunk/NibbleArray;]
	 * </p>
	 */
	public static McObfPair func_76671_l = McMappingDatabase.getSRG("ExtendedBlockStorage.func_76671_l");

	/**
	 * <p>
	 * Name: setSkyLight
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_76657_c = McMappingDatabase.getSRG("ExtendedBlockStorage.func_76657_c");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(IIILnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_177484_a = McMappingDatabase.getSRG("ExtendedBlockStorage.func_177484_a");

	/**
	 * <p>
	 * Name: needsRandomTick
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76675_b = McMappingDatabase.getSRG("ExtendedBlockStorage.func_76675_b");

	/**
	 * <p>
	 * Name: setBlockLight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/NibbleArray;)V]
	 * </p>
	 */
	public static McObfPair func_76659_c = McMappingDatabase.getSRG("ExtendedBlockStorage.func_76659_c");

	/**
	 * <p>
	 * Name: getYLocation
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76662_d = McMappingDatabase.getSRG("ExtendedBlockStorage.func_76662_d");

	/**
	 * <p>
	 * Name: blockRefCount
	 * </p>
	 */
	public static McObfPair field_76682_b = McMappingDatabase.getSRG("field_76682_b");

	/**
	 * <p>
	 * Name: getSkyLight
	 * </p>
	 * <p>
	 * Desc: [(III)I]
	 * </p>
	 */
	public static McObfPair func_76670_c = McMappingDatabase.getSRG("ExtendedBlockStorage.func_76670_c");

	/**
	 * <p>
	 * Name: blockLight
	 * </p>
	 */
	public static McObfPair field_76679_g = McMappingDatabase.getSRG("field_76679_g");

	/**
	 * <p>
	 * Name: get
	 * </p>
	 * <p>
	 * Desc: [(III)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_177485_a = McMappingDatabase.getSRG("ExtendedBlockStorage.func_177485_a");

	/**
	 * <p>
	 * Name: recalculateRefCounts
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76672_e = McMappingDatabase.getSRG("ExtendedBlockStorage.func_76672_e");

	/**
	 * <p>
	 * Name: tickRefCount
	 * </p>
	 */
	public static McObfPair field_76683_c = McMappingDatabase.getSRG("field_76683_c");

	/**
	 * <p>
	 * Name: skyLight
	 * </p>
	 */
	public static McObfPair field_76685_h = McMappingDatabase.getSRG("field_76685_h");

	/**
	 * <p>
	 * Name: data
	 * </p>
	 */
	public static McObfPair field_177488_d = McMappingDatabase.getSRG("field_177488_d");

}

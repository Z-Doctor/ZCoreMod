package zdoctor.zcoremod.map.minecraft.util.math;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkPos {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amn";
		else
			return "net/minecraft/util/math/ChunkPos";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amn";
		else
			return "ChunkPos";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamn;";
		else
			return "Lnet/minecraft/util/math/ChunkPos;";
	}

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_77276_a = McMappingDatabase.getSRG("field_77276_a");

	/**
	 * <p>
	 * Name: getZEnd
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_180330_f = McMappingDatabase.getSRG("ChunkPos.func_180330_f");

	/**
	 * <p>
	 * Name: asLong
	 * </p>
	 * <p>
	 * Desc: [(II)J]
	 * </p>
	 */
	public static McObfPair func_77272_a = McMappingDatabase.getSRG("ChunkPos.func_77272_a");

	/**
	 * <p>
	 * Name: getBlock
	 * </p>
	 * <p>
	 * Desc: [(III)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180331_a = McMappingDatabase.getSRG("ChunkPos.func_180331_a");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_77275_b = McMappingDatabase.getSRG("field_77275_b");

	/**
	 * <p>
	 * Name: getZStart
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_180333_d = McMappingDatabase.getSRG("ChunkPos.func_180333_d");

	/**
	 * <p>
	 * Name: getXStart
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_180334_c = McMappingDatabase.getSRG("ChunkPos.func_180334_c");

	/**
	 * <p>
	 * Name: getXEnd
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_180332_e = McMappingDatabase.getSRG("ChunkPos.func_180332_e");

	/**
	 * <p>
	 * Name: getDistanceSq
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)D]
	 * </p>
	 */
	public static McObfPair func_185327_a = McMappingDatabase.getSRG("ChunkPos.func_185327_a");

}

package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapGenBase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azb";
		else
			return "net/minecraft/world/gen/MapGenBase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azb";
		else
			return "MapGenBase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazb;";
		else
			return "Lnet/minecraft/world/gen/MapGenBase;";
	}

	/**
	 * <p>
	 * Name: recursiveGenerate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V]
	 * </p>
	 */
	public static McObfPair func_180701_a = McMappingDatabase.getSRG("MapGenBase.func_180701_a");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_75039_c = McMappingDatabase.getSRG("field_75039_c");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;IILnet/minecraft/world/chunk/ChunkPrimer;)V]
	 * </p>
	 */
	public static McObfPair func_186125_a = McMappingDatabase.getSRG("MapGenBase.func_186125_a");

	/**
	 * <p>
	 * Name: range
	 * </p>
	 */
	public static McObfPair field_75040_a = McMappingDatabase.getSRG("field_75040_a");

	/**
	 * <p>
	 * Name: setupChunkSeed
	 * </p>
	 * <p>
	 * Desc: [(JLjava/util/Random;II)V]
	 * </p>
	 */
	public static McObfPair func_191068_a = McMappingDatabase.getSRG("MapGenBase.func_191068_a");

	/**
	 * <p>
	 * Name: rand
	 * </p>
	 */
	public static McObfPair field_75038_b = McMappingDatabase.getSRG("field_75038_b");

}

package zdoctor.zcoremod.map.minecraft.world.gen.layer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GenLayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdq";
		else
			return "net/minecraft/world/gen/layer/GenLayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdq";
		else
			return "GenLayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbdq;";
		else
			return "Lnet/minecraft/world/gen/layer/GenLayer;";
	}

	/**
	 * <p>
	 * Name: getInts
	 * </p>
	 * <p>
	 * Desc: [(IIII)[I]
	 * </p>
	 */
	public static McObfPair func_75904_a = McMappingDatabase.getSRG("GenLayer.func_75904_a");

	/**
	 * <p>
	 * Name: selectRandom
	 * </p>
	 * <p>
	 * Desc: [([I)I]
	 * </p>
	 */
	public static McObfPair func_151619_a = McMappingDatabase.getSRG("GenLayer.func_151619_a");

	/**
	 * <p>
	 * Name: selectModeOrRandom
	 * </p>
	 * <p>
	 * Desc: [(IIII)I]
	 * </p>
	 */
	public static McObfPair func_151617_b = McMappingDatabase.getSRG("GenLayer.func_151617_b");

	/**
	 * <p>
	 * Name: initChunkSeed
	 * </p>
	 * <p>
	 * Desc: [(JJ)V]
	 * </p>
	 */
	public static McObfPair func_75903_a = McMappingDatabase.getSRG("GenLayer.func_75903_a");

	/**
	 * <p>
	 * Name: initWorldGenSeed
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_75905_a = McMappingDatabase.getSRG("GenLayer.func_75905_a");

	/**
	 * <p>
	 * Name: chunkSeed
	 * </p>
	 */
	public static McObfPair field_75908_c = McMappingDatabase.getSRG("field_75908_c");

	/**
	 * <p>
	 * Name: biomesEqualOrMesaPlateau
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_151616_a = McMappingDatabase.getSRG("GenLayer.func_151616_a");

	/**
	 * <p>
	 * Name: initializeAllBiomeGenerators
	 * </p>
	 * <p>
	 * Desc: [(JLnet/minecraft/world/WorldType;Lnet/minecraft/world/gen/ChunkGeneratorSettings;)[Lnet/minecraft/world/gen/layer/GenLayer;]
	 * </p>
	 */
	public static McObfPair func_180781_a = McMappingDatabase.getSRG("GenLayer.func_180781_a");

	/**
	 * <p>
	 * Name: parent
	 * </p>
	 */
	public static McObfPair field_75909_a = McMappingDatabase.getSRG("field_75909_a");

	/**
	 * <p>
	 * Name: nextInt
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_75902_a = McMappingDatabase.getSRG("GenLayer.func_75902_a");

	/**
	 * <p>
	 * Name: baseSeed
	 * </p>
	 */
	public static McObfPair field_75906_d = McMappingDatabase.getSRG("field_75906_d");

	/**
	 * <p>
	 * Name: worldGenSeed
	 * </p>
	 */
	public static McObfPair field_75907_b = McMappingDatabase.getSRG("field_75907_b");

	/**
	 * <p>
	 * Name: isBiomeOceanic
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_151618_b = McMappingDatabase.getSRG("GenLayer.func_151618_b");

}

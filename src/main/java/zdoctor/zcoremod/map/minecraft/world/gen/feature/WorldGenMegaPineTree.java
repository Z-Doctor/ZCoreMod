package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenMegaPineTree {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bah";
		else
			return "net/minecraft/world/gen/feature/WorldGenMegaPineTree";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bah";
		else
			return "WorldGenMegaPineTree";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbah;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenMegaPineTree;";
	}

	/**
	 * <p>
	 * Name: TRUNK
	 * </p>
	 */
	public static McObfPair field_181633_e = McMappingDatabase.getSRG("field_181633_e");

	/**
	 * <p>
	 * Name: placePodzolCircle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_175933_b = McMappingDatabase.getSRG("WorldGenMegaPineTree.func_175933_b");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenMegaPineTree.func_180709_b");

	/**
	 * <p>
	 * Name: LEAF
	 * </p>
	 */
	public static McObfPair field_181634_f = McMappingDatabase.getSRG("field_181634_f");

	/**
	 * <p>
	 * Name: generateSaplings
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180711_a = McMappingDatabase.getSRG("WorldGenMegaPineTree.func_180711_a");

	/**
	 * <p>
	 * Name: createCrown
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;IIIILjava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_150541_c = McMappingDatabase.getSRG("WorldGenMegaPineTree.func_150541_c");

	/**
	 * <p>
	 * Name: placePodzolAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_175934_c = McMappingDatabase.getSRG("WorldGenMegaPineTree.func_175934_c");

	/**
	 * <p>
	 * Name: useBaseHeight
	 * </p>
	 */
	public static McObfPair field_150542_e = McMappingDatabase.getSRG("field_150542_e");

	/**
	 * <p>
	 * Name: PODZOL
	 * </p>
	 */
	public static McObfPair field_181635_g = McMappingDatabase.getSRG("field_181635_g");

}

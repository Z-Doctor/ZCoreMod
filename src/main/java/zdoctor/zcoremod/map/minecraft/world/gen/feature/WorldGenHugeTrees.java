package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenHugeTrees {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bai";
		else
			return "net/minecraft/world/gen/feature/WorldGenHugeTrees";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bai";
		else
			return "WorldGenHugeTrees";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbai;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenHugeTrees;";
	}

	/**
	 * <p>
	 * Name: woodMetadata
	 * </p>
	 */
	public static McObfPair field_76520_b = McMappingDatabase.getSRG("field_76520_b");

	/**
	 * <p>
	 * Name: baseHeight
	 * </p>
	 */
	public static McObfPair field_76522_a = McMappingDatabase.getSRG("field_76522_a");

	/**
	 * <p>
	 * Name: extraRandomHeight
	 * </p>
	 */
	public static McObfPair field_150538_d = McMappingDatabase.getSRG("field_150538_d");

	/**
	 * <p>
	 * Name: leavesMetadata
	 * </p>
	 */
	public static McObfPair field_76521_c = McMappingDatabase.getSRG("field_76521_c");

	/**
	 * <p>
	 * Name: getHeight
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)I]
	 * </p>
	 */
	public static McObfPair func_150533_a = McMappingDatabase.getSRG("WorldGenHugeTrees.func_150533_a");

	/**
	 * <p>
	 * Name: growLeavesLayerStrict
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_175925_a = McMappingDatabase.getSRG("WorldGenHugeTrees.func_175925_a");

	/**
	 * <p>
	 * Name: isSpaceAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)Z]
	 * </p>
	 */
	public static McObfPair func_175926_c = McMappingDatabase.getSRG("WorldGenHugeTrees.func_175926_c");

	/**
	 * <p>
	 * Name: growLeavesLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_175928_b = McMappingDatabase.getSRG("WorldGenHugeTrees.func_175928_b");

	/**
	 * <p>
	 * Name: ensureDirtsUnderneath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;)Z]
	 * </p>
	 */
	public static McObfPair func_175927_a = McMappingDatabase.getSRG("WorldGenHugeTrees.func_175927_a");

	/**
	 * <p>
	 * Name: ensureGrowable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;I)Z]
	 * </p>
	 */
	public static McObfPair func_175929_a = McMappingDatabase.getSRG("WorldGenHugeTrees.func_175929_a");

}

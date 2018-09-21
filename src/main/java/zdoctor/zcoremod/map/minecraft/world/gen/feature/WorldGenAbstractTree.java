package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenAbstractTree {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azg";
		else
			return "net/minecraft/world/gen/feature/WorldGenAbstractTree";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azg";
		else
			return "WorldGenAbstractTree";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazg;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;";
	}

	/**
	 * <p>
	 * Name: generateSaplings
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180711_a = McMappingDatabase.getSRG("WorldGenAbstractTree.func_180711_a");

	/**
	 * <p>
	 * Name: setDirtAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_175921_a = McMappingDatabase.getSRG("WorldGenAbstractTree.func_175921_a");

	/**
	 * <p>
	 * Name: canGrowInto
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Z]
	 * </p>
	 */
	public static McObfPair func_150523_a = McMappingDatabase.getSRG("WorldGenAbstractTree.func_150523_a");

}

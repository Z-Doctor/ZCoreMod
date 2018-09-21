package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenSavannaTree {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bar";
		else
			return "net/minecraft/world/gen/feature/WorldGenSavannaTree";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bar";
		else
			return "WorldGenSavannaTree";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbar;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenSavannaTree;";
	}

	/**
	 * <p>
	 * Name: placeLeafAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_175924_b = McMappingDatabase.getSRG("WorldGenSavannaTree.func_175924_b");

	/**
	 * <p>
	 * Name: LEAF
	 * </p>
	 */
	public static McObfPair field_181644_b = McMappingDatabase.getSRG("field_181644_b");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenSavannaTree.func_180709_b");

	/**
	 * <p>
	 * Name: TRUNK
	 * </p>
	 */
	public static McObfPair field_181643_a = McMappingDatabase.getSRG("field_181643_a");

	/**
	 * <p>
	 * Name: placeLogAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_181642_b = McMappingDatabase.getSRG("WorldGenSavannaTree.func_181642_b");

}

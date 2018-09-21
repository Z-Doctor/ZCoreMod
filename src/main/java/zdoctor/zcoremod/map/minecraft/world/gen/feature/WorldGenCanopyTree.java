package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenCanopyTree {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bap";
		else
			return "net/minecraft/world/gen/feature/WorldGenCanopyTree";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bap";
		else
			return "WorldGenCanopyTree";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbap;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenCanopyTree;";
	}

	/**
	 * <p>
	 * Name: DARK_OAK_LEAVES
	 * </p>
	 */
	public static McObfPair field_181641_b = McMappingDatabase.getSRG("field_181641_b");

	/**
	 * <p>
	 * Name: placeTreeOfHeight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)Z]
	 * </p>
	 */
	public static McObfPair func_181638_a = McMappingDatabase.getSRG("WorldGenCanopyTree.func_181638_a");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenCanopyTree.func_180709_b");

	/**
	 * <p>
	 * Name: placeLogAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_181639_b = McMappingDatabase.getSRG("WorldGenCanopyTree.func_181639_b");

	/**
	 * <p>
	 * Name: placeLeafAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;III)V]
	 * </p>
	 */
	public static McObfPair func_150526_a = McMappingDatabase.getSRG("WorldGenCanopyTree.func_150526_a");

	/**
	 * <p>
	 * Name: DARK_OAK_LOG
	 * </p>
	 */
	public static McObfPair field_181640_a = McMappingDatabase.getSRG("field_181640_a");

}

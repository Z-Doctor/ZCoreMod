package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenTrees {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bax";
		else
			return "net/minecraft/world/gen/feature/WorldGenTrees";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bax";
		else
			return "WorldGenTrees";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbax;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenTrees;";
	}

	/**
	 * <p>
	 * Name: metaWood
	 * </p>
	 */
	public static McObfPair field_76532_c = McMappingDatabase.getSRG("field_76532_c");

	/**
	 * <p>
	 * Name: metaLeaves
	 * </p>
	 */
	public static McObfPair field_76530_d = McMappingDatabase.getSRG("field_76530_d");

	/**
	 * <p>
	 * Name: DEFAULT_LEAF
	 * </p>
	 */
	public static McObfPair field_181654_b = McMappingDatabase.getSRG("field_181654_b");

	/**
	 * <p>
	 * Name: DEFAULT_TRUNK
	 * </p>
	 */
	public static McObfPair field_181653_a = McMappingDatabase.getSRG("field_181653_a");

	/**
	 * <p>
	 * Name: addVine
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/properties/PropertyBool;)V]
	 * </p>
	 */
	public static McObfPair func_181651_a = McMappingDatabase.getSRG("WorldGenTrees.func_181651_a");

	/**
	 * <p>
	 * Name: addHangingVine
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/properties/PropertyBool;)V]
	 * </p>
	 */
	public static McObfPair func_181650_b = McMappingDatabase.getSRG("WorldGenTrees.func_181650_b");

	/**
	 * <p>
	 * Name: minTreeHeight
	 * </p>
	 */
	public static McObfPair field_76533_a = McMappingDatabase.getSRG("field_76533_a");

	/**
	 * <p>
	 * Name: placeCocoa
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;ILnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_181652_a = McMappingDatabase.getSRG("WorldGenTrees.func_181652_a");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenTrees.func_180709_b");

	/**
	 * <p>
	 * Name: vinesGrow
	 * </p>
	 */
	public static McObfPair field_76531_b = McMappingDatabase.getSRG("field_76531_b");

}

package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenBigTree {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azh";
		else
			return "net/minecraft/world/gen/feature/WorldGenBigTree";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azh";
		else
			return "WorldGenBigTree";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazh;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenBigTree;";
	}

	/**
	 * <p>
	 * Name: basePos
	 * </p>
	 */
	public static McObfPair field_175947_m = McMappingDatabase.getSRG("field_175947_m");

	/**
	 * <p>
	 * Name: leafSize
	 * </p>
	 * <p>
	 * Desc: [(I)F]
	 * </p>
	 */
	public static McObfPair func_76495_b = McMappingDatabase.getSRG("WorldGenBigTree.func_76495_b");

	/**
	 * <p>
	 * Name: leafDistanceLimit
	 * </p>
	 */
	public static McObfPair field_76508_n = McMappingDatabase.getSRG("field_76508_n");

	/**
	 * <p>
	 * Name: trunkSize
	 * </p>
	 */
	public static McObfPair field_175943_g = McMappingDatabase.getSRG("field_175943_g");

	/**
	 * <p>
	 * Name: layerSize
	 * </p>
	 * <p>
	 * Desc: [(I)F]
	 * </p>
	 */
	public static McObfPair func_76490_a = McMappingDatabase.getSRG("WorldGenBigTree.func_76490_a");

	/**
	 * <p>
	 * Name: leafNodeNeedsBase
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_76493_c = McMappingDatabase.getSRG("WorldGenBigTree.func_76493_c");

	/**
	 * <p>
	 * Name: rand
	 * </p>
	 */
	public static McObfPair field_175949_k = McMappingDatabase.getSRG("field_175949_k");

	/**
	 * <p>
	 * Name: generateLeafNodeBases
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175939_d = McMappingDatabase.getSRG("WorldGenBigTree.func_175939_d");

	/**
	 * <p>
	 * Name: setDecorationDefaults
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175904_e = McMappingDatabase.getSRG("WorldGenBigTree.func_175904_e");

	/**
	 * <p>
	 * Name: generateLeaves
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175941_b = McMappingDatabase.getSRG("WorldGenBigTree.func_175941_b");

	/**
	 * <p>
	 * Name: branchSlope
	 * </p>
	 */
	public static McObfPair field_175944_d = McMappingDatabase.getSRG("field_175944_d");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_76501_f = McMappingDatabase.getSRG("field_76501_f");

	/**
	 * <p>
	 * Name: scaleWidth
	 * </p>
	 */
	public static McObfPair field_175945_e = McMappingDatabase.getSRG("field_175945_e");

	/**
	 * <p>
	 * Name: foliageCoords
	 * </p>
	 */
	public static McObfPair field_175948_j = McMappingDatabase.getSRG("field_175948_j");

	/**
	 * <p>
	 * Name: leafDensity
	 * </p>
	 */
	public static McObfPair field_76513_k = McMappingDatabase.getSRG("field_76513_k");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_175946_l = McMappingDatabase.getSRG("field_175946_l");

	/**
	 * <p>
	 * Name: heightAttenuation
	 * </p>
	 */
	public static McObfPair field_76502_g = McMappingDatabase.getSRG("field_76502_g");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenBigTree.func_180709_b");

	/**
	 * <p>
	 * Name: limb
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_175937_a = McMappingDatabase.getSRG("WorldGenBigTree.func_175937_a");

	/**
	 * <p>
	 * Name: validTreeLocation
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76497_e = McMappingDatabase.getSRG("WorldGenBigTree.func_76497_e");

	/**
	 * <p>
	 * Name: heightLimitLimit
	 * </p>
	 */
	public static McObfPair field_175950_h = McMappingDatabase.getSRG("field_175950_h");

	/**
	 * <p>
	 * Name: getLogAxis
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockLog$EnumAxis;]
	 * </p>
	 */
	public static McObfPair func_175938_b = McMappingDatabase.getSRG("WorldGenBigTree.func_175938_b");

	/**
	 * <p>
	 * Name: getGreatestDistance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_175935_b = McMappingDatabase.getSRG("WorldGenBigTree.func_175935_b");

	/**
	 * <p>
	 * Name: generateTrunk
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175942_c = McMappingDatabase.getSRG("WorldGenBigTree.func_175942_c");

	/**
	 * <p>
	 * Name: heightLimit
	 * </p>
	 */
	public static McObfPair field_76504_e = McMappingDatabase.getSRG("field_76504_e");

	/**
	 * <p>
	 * Name: generateLeafNode
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_175940_a = McMappingDatabase.getSRG("WorldGenBigTree.func_175940_a");

	/**
	 * <p>
	 * Name: crosSection
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;FLnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_181631_a = McMappingDatabase.getSRG("WorldGenBigTree.func_181631_a");

	/**
	 * <p>
	 * Name: checkBlockLine
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_175936_a = McMappingDatabase.getSRG("WorldGenBigTree.func_175936_a");

	/**
	 * <p>
	 * Name: generateLeafNodeList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76489_a = McMappingDatabase.getSRG("WorldGenBigTree.func_76489_a");

}

package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenSpikes$EndSpike {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bas$a";
		else
			return "net/minecraft/world/gen/feature/WorldGenSpikes$EndSpike";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bas$a";
		else
			return "WorldGenSpikes$EndSpike";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbas$a;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenSpikes$EndSpike;";
	}

	/**
	 * <p>
	 * Name: radius
	 * </p>
	 */
	public static McObfPair field_186157_c = McMappingDatabase.getSRG("field_186157_c");

	/**
	 * <p>
	 * Name: centerX
	 * </p>
	 */
	public static McObfPair field_186155_a = McMappingDatabase.getSRG("field_186155_a");

	/**
	 * <p>
	 * Name: getTopBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_186153_f = McMappingDatabase.getSRG("WorldGenSpikes$EndSpike.func_186153_f");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_186158_d = McMappingDatabase.getSRG("field_186158_d");

	/**
	 * <p>
	 * Name: topBoundingBox
	 * </p>
	 */
	public static McObfPair field_186160_f = McMappingDatabase.getSRG("field_186160_f");

	/**
	 * <p>
	 * Name: guarded
	 * </p>
	 */
	public static McObfPair field_186159_e = McMappingDatabase.getSRG("field_186159_e");

	/**
	 * <p>
	 * Name: centerZ
	 * </p>
	 */
	public static McObfPair field_186156_b = McMappingDatabase.getSRG("field_186156_b");

	/**
	 * <p>
	 * Name: getCenterX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186151_a = McMappingDatabase.getSRG("WorldGenSpikes$EndSpike.func_186151_a");

	/**
	 * <p>
	 * Name: getHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186149_d = McMappingDatabase.getSRG("WorldGenSpikes$EndSpike.func_186149_d");

	/**
	 * <p>
	 * Name: getCenterZ
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186152_b = McMappingDatabase.getSRG("WorldGenSpikes$EndSpike.func_186152_b");

	/**
	 * <p>
	 * Name: getRadius
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186148_c = McMappingDatabase.getSRG("WorldGenSpikes$EndSpike.func_186148_c");

	/**
	 * <p>
	 * Name: isGuarded
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186150_e = McMappingDatabase.getSRG("WorldGenSpikes$EndSpike.func_186150_e");

	/**
	 * <p>
	 * Name: doesStartInChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_186154_a = McMappingDatabase.getSRG("WorldGenSpikes$EndSpike.func_186154_a");

}

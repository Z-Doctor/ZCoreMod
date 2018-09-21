package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenSpikes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bas";
		else
			return "net/minecraft/world/gen/feature/WorldGenSpikes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bas";
		else
			return "WorldGenSpikes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbas;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenSpikes;";
	}

	/**
	 * <p>
	 * Name: setBeamTarget
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_186142_a = McMappingDatabase.getSRG("WorldGenSpikes.func_186142_a");

	/**
	 * <p>
	 * Name: spike
	 * </p>
	 */
	public static McObfPair field_186146_b = McMappingDatabase.getSRG("field_186146_b");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenSpikes.func_180709_b");

	/**
	 * <p>
	 * Name: setSpike
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/feature/WorldGenSpikes$EndSpike;)V]
	 * </p>
	 */
	public static McObfPair func_186143_a = McMappingDatabase.getSRG("WorldGenSpikes.func_186143_a");

	/**
	 * <p>
	 * Name: beamTarget
	 * </p>
	 */
	public static McObfPair field_186147_c = McMappingDatabase.getSRG("field_186147_c");

	/**
	 * <p>
	 * Name: setCrystalInvulnerable
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_186144_a = McMappingDatabase.getSRG("WorldGenSpikes.func_186144_a");

	/**
	 * <p>
	 * Name: crystalInvulnerable
	 * </p>
	 */
	public static McObfPair field_186145_a = McMappingDatabase.getSRG("field_186145_a");

}

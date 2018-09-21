package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenHellLava {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "baa";
		else
			return "net/minecraft/world/gen/feature/WorldGenHellLava";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "baa";
		else
			return "WorldGenHellLava";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbaa;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenHellLava;";
	}

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_150553_a = McMappingDatabase.getSRG("field_150553_a");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenHellLava.func_180709_b");

	/**
	 * <p>
	 * Name: insideRock
	 * </p>
	 */
	public static McObfPair field_94524_b = McMappingDatabase.getSRG("field_94524_b");

}

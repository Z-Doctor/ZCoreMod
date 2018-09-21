package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenLakes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bae";
		else
			return "net/minecraft/world/gen/feature/WorldGenLakes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bae";
		else
			return "WorldGenLakes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbae;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenLakes;";
	}

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_150556_a = McMappingDatabase.getSRG("field_150556_a");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenLakes.func_180709_b");

}

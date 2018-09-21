package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenSand {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "baq";
		else
			return "net/minecraft/world/gen/feature/WorldGenSand";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "baq";
		else
			return "WorldGenSand";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbaq;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenSand;";
	}

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenSand.func_180709_b");

	/**
	 * <p>
	 * Name: radius
	 * </p>
	 */
	public static McObfPair field_76539_b = McMappingDatabase.getSRG("field_76539_b");

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_150517_a = McMappingDatabase.getSRG("field_150517_a");

}

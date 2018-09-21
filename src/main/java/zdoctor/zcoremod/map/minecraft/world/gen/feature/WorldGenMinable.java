package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenMinable {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bal";
		else
			return "net/minecraft/world/gen/feature/WorldGenMinable";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bal";
		else
			return "WorldGenMinable";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbal;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenMinable;";
	}

	/**
	 * <p>
	 * Name: predicate
	 * </p>
	 */
	public static McObfPair field_175919_c = McMappingDatabase.getSRG("field_175919_c");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenMinable.func_180709_b");

	/**
	 * <p>
	 * Name: numberOfBlocks
	 * </p>
	 */
	public static McObfPair field_76541_b = McMappingDatabase.getSRG("field_76541_b");

	/**
	 * <p>
	 * Name: oreBlock
	 * </p>
	 */
	public static McObfPair field_175920_a = McMappingDatabase.getSRG("field_175920_a");

}

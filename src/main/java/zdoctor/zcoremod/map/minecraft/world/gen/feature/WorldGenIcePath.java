package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenIcePath {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bac";
		else
			return "net/minecraft/world/gen/feature/WorldGenIcePath";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bac";
		else
			return "WorldGenIcePath";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbac;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenIcePath;";
	}

	/**
	 * <p>
	 * Name: basePathWidth
	 * </p>
	 */
	public static McObfPair field_150554_b = McMappingDatabase.getSRG("field_150554_b");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenIcePath.func_180709_b");

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_150555_a = McMappingDatabase.getSRG("field_150555_a");

}

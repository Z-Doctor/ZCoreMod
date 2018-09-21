package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenTallGrass {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "baw";
		else
			return "net/minecraft/world/gen/feature/WorldGenTallGrass";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "baw";
		else
			return "WorldGenTallGrass";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbaw;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenTallGrass;";
	}

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenTallGrass.func_180709_b");

	/**
	 * <p>
	 * Name: tallGrassState
	 * </p>
	 */
	public static McObfPair field_175907_a = McMappingDatabase.getSRG("field_175907_a");

}

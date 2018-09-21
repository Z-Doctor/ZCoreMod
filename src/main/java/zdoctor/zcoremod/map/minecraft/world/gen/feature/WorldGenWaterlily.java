package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenWaterlily {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "baz";
		else
			return "net/minecraft/world/gen/feature/WorldGenWaterlily";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "baz";
		else
			return "WorldGenWaterlily";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbaz;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenWaterlily;";
	}

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenWaterlily.func_180709_b");

}

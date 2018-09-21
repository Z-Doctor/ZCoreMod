package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenShrub {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azx";
		else
			return "net/minecraft/world/gen/feature/WorldGenShrub";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azx";
		else
			return "WorldGenShrub";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazx;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenShrub;";
	}

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenShrub.func_180709_b");

	/**
	 * <p>
	 * Name: leavesMetadata
	 * </p>
	 */
	public static McObfPair field_150528_a = McMappingDatabase.getSRG("field_150528_a");

	/**
	 * <p>
	 * Name: woodMetadata
	 * </p>
	 */
	public static McObfPair field_150527_b = McMappingDatabase.getSRG("field_150527_b");

}

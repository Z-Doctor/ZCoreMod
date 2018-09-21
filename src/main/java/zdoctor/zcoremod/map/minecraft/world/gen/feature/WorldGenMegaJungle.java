package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenMegaJungle {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bag";
		else
			return "net/minecraft/world/gen/feature/WorldGenMegaJungle";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bag";
		else
			return "WorldGenMegaJungle";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbag;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenMegaJungle;";
	}

	/**
	 * <p>
	 * Name: createCrown
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_175930_c = McMappingDatabase.getSRG("WorldGenMegaJungle.func_175930_c");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenMegaJungle.func_180709_b");

	/**
	 * <p>
	 * Name: placeVine
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/properties/PropertyBool;)V]
	 * </p>
	 */
	public static McObfPair func_181632_a = McMappingDatabase.getSRG("WorldGenMegaJungle.func_181632_a");

}

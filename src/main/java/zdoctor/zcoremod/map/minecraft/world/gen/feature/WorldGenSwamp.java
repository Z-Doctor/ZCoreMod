package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenSwamp {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bav";
		else
			return "net/minecraft/world/gen/feature/WorldGenSwamp";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bav";
		else
			return "WorldGenSwamp";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbav;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenSwamp;";
	}

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenSwamp.func_180709_b");

	/**
	 * <p>
	 * Name: LEAF
	 * </p>
	 */
	public static McObfPair field_181649_b = McMappingDatabase.getSRG("field_181649_b");

	/**
	 * <p>
	 * Name: TRUNK
	 * </p>
	 */
	public static McObfPair field_181648_a = McMappingDatabase.getSRG("field_181648_a");

	/**
	 * <p>
	 * Name: addVine
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/properties/PropertyBool;)V]
	 * </p>
	 */
	public static McObfPair func_181647_a = McMappingDatabase.getSRG("WorldGenSwamp.func_181647_a");

}

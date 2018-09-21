package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenFlowers {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azv";
		else
			return "net/minecraft/world/gen/feature/WorldGenFlowers";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azv";
		else
			return "WorldGenFlowers";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazv;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenFlowers;";
	}

	/**
	 * <p>
	 * Name: flower
	 * </p>
	 */
	public static McObfPair field_150552_a = McMappingDatabase.getSRG("field_150552_a");

	/**
	 * <p>
	 * Name: setGeneratedBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/BlockFlower;Lnet/minecraft/block/BlockFlower$EnumFlowerType;)V]
	 * </p>
	 */
	public static McObfPair func_175914_a = McMappingDatabase.getSRG("WorldGenFlowers.func_175914_a");

	/**
	 * <p>
	 * Name: state
	 * </p>
	 */
	public static McObfPair field_175915_b = McMappingDatabase.getSRG("field_175915_b");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenFlowers.func_180709_b");

}

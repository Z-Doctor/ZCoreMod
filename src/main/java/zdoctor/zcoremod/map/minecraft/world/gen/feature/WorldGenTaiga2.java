package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenTaiga2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bau";
		else
			return "net/minecraft/world/gen/feature/WorldGenTaiga2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bau";
		else
			return "WorldGenTaiga2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbau;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenTaiga2;";
	}

	/**
	 * <p>
	 * Name: TRUNK
	 * </p>
	 */
	public static McObfPair field_181645_a = McMappingDatabase.getSRG("field_181645_a");

	/**
	 * <p>
	 * Name: LEAF
	 * </p>
	 */
	public static McObfPair field_181646_b = McMappingDatabase.getSRG("field_181646_b");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenTaiga2.func_180709_b");

}

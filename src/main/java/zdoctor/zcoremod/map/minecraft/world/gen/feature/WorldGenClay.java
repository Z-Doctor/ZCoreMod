package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenClay {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azn";
		else
			return "net/minecraft/world/gen/feature/WorldGenClay";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azn";
		else
			return "WorldGenClay";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazn;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenClay;";
	}

	/**
	 * <p>
	 * Name: numberOfBlocks
	 * </p>
	 */
	public static McObfPair field_76517_b = McMappingDatabase.getSRG("field_76517_b");

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_150546_a = McMappingDatabase.getSRG("field_150546_a");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenClay.func_180709_b");

}

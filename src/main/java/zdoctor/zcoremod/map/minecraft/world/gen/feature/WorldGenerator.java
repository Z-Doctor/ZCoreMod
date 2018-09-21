package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenerator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azu";
		else
			return "net/minecraft/world/gen/feature/WorldGenerator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azu";
		else
			return "WorldGenerator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazu;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenerator;";
	}

	/**
	 * <p>
	 * Name: doBlockNotify
	 * </p>
	 */
	public static McObfPair field_76488_a = McMappingDatabase.getSRG("field_76488_a");

	/**
	 * <p>
	 * Name: setBlockAndNotifyAdequately
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_175903_a = McMappingDatabase.getSRG("WorldGenerator.func_175903_a");

	/**
	 * <p>
	 * Name: setDecorationDefaults
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175904_e = McMappingDatabase.getSRG("WorldGenerator.func_175904_e");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenerator.func_180709_b");

}

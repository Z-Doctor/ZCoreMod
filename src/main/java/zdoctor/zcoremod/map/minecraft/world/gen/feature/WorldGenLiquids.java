package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenLiquids {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bat";
		else
			return "net/minecraft/world/gen/feature/WorldGenLiquids";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bat";
		else
			return "WorldGenLiquids";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbat;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenLiquids;";
	}

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_150521_a = McMappingDatabase.getSRG("field_150521_a");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenLiquids.func_180709_b");

}

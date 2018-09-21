package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenCactus {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azm";
		else
			return "net/minecraft/world/gen/feature/WorldGenCactus";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azm";
		else
			return "WorldGenCactus";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazm;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenCactus;";
	}

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenCactus.func_180709_b");

}

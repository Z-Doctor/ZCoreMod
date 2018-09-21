package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenBlockBlob {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azj";
		else
			return "net/minecraft/world/gen/feature/WorldGenBlockBlob";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azj";
		else
			return "WorldGenBlockBlob";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazj;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenBlockBlob;";
	}

	/**
	 * <p>
	 * Name: startRadius
	 * </p>
	 */
	public static McObfPair field_150544_b = McMappingDatabase.getSRG("field_150544_b");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenBlockBlob.func_180709_b");

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_150545_a = McMappingDatabase.getSRG("field_150545_a");

}

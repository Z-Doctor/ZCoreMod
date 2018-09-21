package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenBigMushroom {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bab";
		else
			return "net/minecraft/world/gen/feature/WorldGenBigMushroom";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bab";
		else
			return "WorldGenBigMushroom";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbab;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenBigMushroom;";
	}

	/**
	 * <p>
	 * Name: mushroomType
	 * </p>
	 */
	public static McObfPair field_76523_a = McMappingDatabase.getSRG("field_76523_a");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenBigMushroom.func_180709_b");

}

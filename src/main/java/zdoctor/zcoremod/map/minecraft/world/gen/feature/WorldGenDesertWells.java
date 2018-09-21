package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenDesertWells {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azp";
		else
			return "net/minecraft/world/gen/feature/WorldGenDesertWells";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azp";
		else
			return "WorldGenDesertWells";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazp;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenDesertWells;";
	}

	/**
	 * <p>
	 * Name: sandSlab
	 * </p>
	 */
	public static McObfPair field_175911_b = McMappingDatabase.getSRG("field_175911_b");

	/**
	 * <p>
	 * Name: sandstone
	 * </p>
	 */
	public static McObfPair field_175912_c = McMappingDatabase.getSRG("field_175912_c");

	/**
	 * <p>
	 * Name: water
	 * </p>
	 */
	public static McObfPair field_175910_d = McMappingDatabase.getSRG("field_175910_d");

	/**
	 * <p>
	 * Name: IS_SAND
	 * </p>
	 */
	public static McObfPair field_175913_a = McMappingDatabase.getSRG("field_175913_a");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenDesertWells.func_180709_b");

}

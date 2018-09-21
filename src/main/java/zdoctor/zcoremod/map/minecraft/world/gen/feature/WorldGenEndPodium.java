package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenEndPodium {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azt";
		else
			return "net/minecraft/world/gen/feature/WorldGenEndPodium";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azt";
		else
			return "WorldGenEndPodium";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazt;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenEndPodium;";
	}

	/**
	 * <p>
	 * Name: END_PODIUM_CHUNK_POS
	 * </p>
	 */
	public static McObfPair field_186140_b = McMappingDatabase.getSRG("field_186140_b");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenEndPodium.func_180709_b");

	/**
	 * <p>
	 * Name: activePortal
	 * </p>
	 */
	public static McObfPair field_186141_c = McMappingDatabase.getSRG("field_186141_c");

	/**
	 * <p>
	 * Name: END_PODIUM_LOCATION
	 * </p>
	 */
	public static McObfPair field_186139_a = McMappingDatabase.getSRG("field_186139_a");

}

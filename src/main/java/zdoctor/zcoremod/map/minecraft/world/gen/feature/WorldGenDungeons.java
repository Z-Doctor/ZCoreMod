package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenDungeons {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bak";
		else
			return "net/minecraft/world/gen/feature/WorldGenDungeons";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bak";
		else
			return "WorldGenDungeons";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbak;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenDungeons;";
	}

	/**
	 * <p>
	 * Name: pickMobSpawner
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_76543_b = McMappingDatabase.getSRG("WorldGenDungeons.func_76543_b");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenDungeons.func_180709_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_175918_a = McMappingDatabase.getSRG("field_175918_a");

	/**
	 * <p>
	 * Name: SPAWNERTYPES
	 * </p>
	 */
	public static McObfPair field_175916_b = McMappingDatabase.getSRG("field_175916_b");

}

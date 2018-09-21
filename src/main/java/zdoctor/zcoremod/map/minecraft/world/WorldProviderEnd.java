package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldProviderEnd {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ays";
		else
			return "net/minecraft/world/WorldProviderEnd";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ays";
		else
			return "WorldProviderEnd";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lays;";
		else
			return "Lnet/minecraft/world/WorldProviderEnd;";
	}

	/**
	 * <p>
	 * Name: getFogColor
	 * </p>
	 * <p>
	 * Desc: [(FF)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_76562_b = McMappingDatabase.getSRG("WorldProviderEnd.func_76562_b");

	/**
	 * <p>
	 * Name: isSkyColored
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76561_g = McMappingDatabase.getSRG("WorldProviderEnd.func_76561_g");

	/**
	 * <p>
	 * Name: calcSunriseSunsetColors
	 * </p>
	 * <p>
	 * Desc: [(FF)[F]
	 * </p>
	 */
	public static McObfPair func_76560_a = McMappingDatabase.getSRG("WorldProviderEnd.func_76560_a");

	/**
	 * <p>
	 * Name: onWorldUpdateEntities
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186059_r = McMappingDatabase.getSRG("WorldProviderEnd.func_186059_r");

	/**
	 * <p>
	 * Name: canCoordinateBeSpawn
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_76566_a = McMappingDatabase.getSRG("WorldProviderEnd.func_76566_a");

	/**
	 * <p>
	 * Name: calculateCelestialAngle
	 * </p>
	 * <p>
	 * Desc: [(JF)F]
	 * </p>
	 */
	public static McObfPair func_76563_a = McMappingDatabase.getSRG("WorldProviderEnd.func_76563_a");

	/**
	 * <p>
	 * Name: canRespawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76567_e = McMappingDatabase.getSRG("WorldProviderEnd.func_76567_e");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76572_b = McMappingDatabase.getSRG("WorldProviderEnd.func_76572_b");

	/**
	 * <p>
	 * Name: getDimensionType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/DimensionType;]
	 * </p>
	 */
	public static McObfPair func_186058_p = McMappingDatabase.getSRG("WorldProviderEnd.func_186058_p");

	/**
	 * <p>
	 * Name: isSurfaceWorld
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76569_d = McMappingDatabase.getSRG("WorldProviderEnd.func_76569_d");

	/**
	 * <p>
	 * Name: getDragonFightManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/end/DragonFightManager;]
	 * </p>
	 */
	public static McObfPair func_186063_s = McMappingDatabase.getSRG("WorldProviderEnd.func_186063_s");

	/**
	 * <p>
	 * Name: dragonFightManager
	 * </p>
	 */
	public static McObfPair field_186064_g = McMappingDatabase.getSRG("field_186064_g");

	/**
	 * <p>
	 * Name: doesXZShowFog
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_76568_b = McMappingDatabase.getSRG("WorldProviderEnd.func_76568_b");

	/**
	 * <p>
	 * Name: createChunkGenerator
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/gen/IChunkGenerator;]
	 * </p>
	 */
	public static McObfPair func_186060_c = McMappingDatabase.getSRG("WorldProviderEnd.func_186060_c");

	/**
	 * <p>
	 * Name: getAverageGroundLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76557_i = McMappingDatabase.getSRG("WorldProviderEnd.func_76557_i");

	/**
	 * <p>
	 * Name: getSpawnCoordinate
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177496_h = McMappingDatabase.getSRG("WorldProviderEnd.func_177496_h");

	/**
	 * <p>
	 * Name: onWorldSave
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186057_q = McMappingDatabase.getSRG("WorldProviderEnd.func_186057_q");

	/**
	 * <p>
	 * Name: getCloudHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_76571_f = McMappingDatabase.getSRG("WorldProviderEnd.func_76571_f");

}

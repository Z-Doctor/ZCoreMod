package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldProvider {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aym";
		else
			return "net/minecraft/world/WorldProvider";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aym";
		else
			return "WorldProvider";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laym;";
		else
			return "Lnet/minecraft/world/WorldProvider;";
	}

	/**
	 * <p>
	 * Name: doesXZShowFog
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_76568_b = McMappingDatabase.getSRG("WorldProvider.func_76568_b");

	/**
	 * <p>
	 * Name: doesWaterVaporize
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177500_n = McMappingDatabase.getSRG("WorldProvider.func_177500_n");

	/**
	 * <p>
	 * Name: onWorldUpdateEntities
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186059_r = McMappingDatabase.getSRG("WorldProvider.func_186059_r");

	/**
	 * <p>
	 * Name: generatorSettings
	 * </p>
	 */
	public static McObfPair field_82913_c = McMappingDatabase.getSRG("field_82913_c");

	/**
	 * <p>
	 * Name: hasSkyLight
	 * </p>
	 */
	public static McObfPair field_191067_f = McMappingDatabase.getSRG("field_191067_f");

	/**
	 * <p>
	 * Name: canCoordinateBeSpawn
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_76566_a = McMappingDatabase.getSRG("WorldProvider.func_76566_a");

	/**
	 * <p>
	 * Name: nether
	 * </p>
	 */
	public static McObfPair field_76576_e = McMappingDatabase.getSRG("field_76576_e");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76572_b = McMappingDatabase.getSRG("WorldProvider.func_76572_b");

	/**
	 * <p>
	 * Name: hasSkyLight
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191066_m = McMappingDatabase.getSRG("WorldProvider.func_191066_m");

	/**
	 * <p>
	 * Name: getVoidFogYFactor
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_76565_k = McMappingDatabase.getSRG("WorldProvider.func_76565_k");

	/**
	 * <p>
	 * Name: canDropChunk
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_186056_c = McMappingDatabase.getSRG("WorldProvider.func_186056_c");

	/**
	 * <p>
	 * Name: getDimensionType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/DimensionType;]
	 * </p>
	 */
	public static McObfPair func_186058_p = McMappingDatabase.getSRG("WorldProvider.func_186058_p");

	/**
	 * <p>
	 * Name: doesWaterVaporize
	 * </p>
	 */
	public static McObfPair field_76575_d = McMappingDatabase.getSRG("field_76575_d");

	/**
	 * <p>
	 * Name: calculateCelestialAngle
	 * </p>
	 * <p>
	 * Desc: [(JF)F]
	 * </p>
	 */
	public static McObfPair func_76563_a = McMappingDatabase.getSRG("WorldProvider.func_76563_a");

	/**
	 * <p>
	 * Name: canRespawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76567_e = McMappingDatabase.getSRG("WorldProvider.func_76567_e");

	/**
	 * <p>
	 * Name: onPlayerRemoved
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_186062_b = McMappingDatabase.getSRG("WorldProvider.func_186062_b");

	/**
	 * <p>
	 * Name: getFogColor
	 * </p>
	 * <p>
	 * Desc: [(FF)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_76562_b = McMappingDatabase.getSRG("WorldProvider.func_76562_b");

	/**
	 * <p>
	 * Name: generateLightBrightnessTable
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76556_a = McMappingDatabase.getSRG("WorldProvider.func_76556_a");

	/**
	 * <p>
	 * Name: biomeProvider
	 * </p>
	 */
	public static McObfPair field_76578_c = McMappingDatabase.getSRG("field_76578_c");

	/**
	 * <p>
	 * Name: terrainType
	 * </p>
	 */
	public static McObfPair field_76577_b = McMappingDatabase.getSRG("field_76577_b");

	/**
	 * <p>
	 * Name: getLightBrightnessTable
	 * </p>
	 * <p>
	 * Desc: [()[F]
	 * </p>
	 */
	public static McObfPair func_177497_p = McMappingDatabase.getSRG("WorldProvider.func_177497_p");

	/**
	 * <p>
	 * Name: MOON_PHASE_FACTORS
	 * </p>
	 */
	public static McObfPair field_111203_a = McMappingDatabase.getSRG("field_111203_a");

	/**
	 * <p>
	 * Name: getBiomeProvider
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/biome/BiomeProvider;]
	 * </p>
	 */
	public static McObfPair func_177499_m = McMappingDatabase.getSRG("WorldProvider.func_177499_m");

	/**
	 * <p>
	 * Name: createChunkGenerator
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/gen/IChunkGenerator;]
	 * </p>
	 */
	public static McObfPair func_186060_c = McMappingDatabase.getSRG("WorldProvider.func_186060_c");

	/**
	 * <p>
	 * Name: getSpawnCoordinate
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177496_h = McMappingDatabase.getSRG("WorldProvider.func_177496_h");

	/**
	 * <p>
	 * Name: calcSunriseSunsetColors
	 * </p>
	 * <p>
	 * Desc: [(FF)[F]
	 * </p>
	 */
	public static McObfPair func_76560_a = McMappingDatabase.getSRG("WorldProvider.func_76560_a");

	/**
	 * <p>
	 * Name: lightBrightnessTable
	 * </p>
	 */
	public static McObfPair field_76573_f = McMappingDatabase.getSRG("field_76573_f");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_76579_a = McMappingDatabase.getSRG("field_76579_a");

	/**
	 * <p>
	 * Name: isNether
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177495_o = McMappingDatabase.getSRG("WorldProvider.func_177495_o");

	/**
	 * <p>
	 * Name: getAverageGroundLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76557_i = McMappingDatabase.getSRG("WorldProvider.func_76557_i");

	/**
	 * <p>
	 * Name: getMoonPhase
	 * </p>
	 * <p>
	 * Desc: [(J)I]
	 * </p>
	 */
	public static McObfPair func_76559_b = McMappingDatabase.getSRG("WorldProvider.func_76559_b");

	/**
	 * <p>
	 * Name: isSurfaceWorld
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76569_d = McMappingDatabase.getSRG("WorldProvider.func_76569_d");

	/**
	 * <p>
	 * Name: createWorldBorder
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/border/WorldBorder;]
	 * </p>
	 */
	public static McObfPair func_177501_r = McMappingDatabase.getSRG("WorldProvider.func_177501_r");

	/**
	 * <p>
	 * Name: isSkyColored
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76561_g = McMappingDatabase.getSRG("WorldProvider.func_76561_g");

	/**
	 * <p>
	 * Name: onPlayerAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_186061_a = McMappingDatabase.getSRG("WorldProvider.func_186061_a");

	/**
	 * <p>
	 * Name: setWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)V]
	 * </p>
	 */
	public static McObfPair func_76558_a = McMappingDatabase.getSRG("WorldProvider.func_76558_a");

	/**
	 * <p>
	 * Name: getCloudHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_76571_f = McMappingDatabase.getSRG("WorldProvider.func_76571_f");

	/**
	 * <p>
	 * Name: onWorldSave
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186057_q = McMappingDatabase.getSRG("WorldProvider.func_186057_q");

	/**
	 * <p>
	 * Name: colorsSunriseSunset
	 * </p>
	 */
	public static McObfPair field_76580_h = McMappingDatabase.getSRG("field_76580_h");

}

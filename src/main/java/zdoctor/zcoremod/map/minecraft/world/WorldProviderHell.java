package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldProviderHell {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayo";
		else
			return "net/minecraft/world/WorldProviderHell";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayo";
		else
			return "WorldProviderHell";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layo;";
		else
			return "Lnet/minecraft/world/WorldProviderHell;";
	}

	/**
	 * <p>
	 * Name: getDimensionType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/DimensionType;]
	 * </p>
	 */
	public static McObfPair func_186058_p = McMappingDatabase.getSRG("WorldProviderHell.func_186058_p");

	/**
	 * <p>
	 * Name: createChunkGenerator
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/gen/IChunkGenerator;]
	 * </p>
	 */
	public static McObfPair func_186060_c = McMappingDatabase.getSRG("WorldProviderHell.func_186060_c");

	/**
	 * <p>
	 * Name: canCoordinateBeSpawn
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_76566_a = McMappingDatabase.getSRG("WorldProviderHell.func_76566_a");

	/**
	 * <p>
	 * Name: doesXZShowFog
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_76568_b = McMappingDatabase.getSRG("WorldProviderHell.func_76568_b");

	/**
	 * <p>
	 * Name: canRespawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76567_e = McMappingDatabase.getSRG("WorldProviderHell.func_76567_e");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76572_b = McMappingDatabase.getSRG("WorldProviderHell.func_76572_b");

	/**
	 * <p>
	 * Name: calculateCelestialAngle
	 * </p>
	 * <p>
	 * Desc: [(JF)F]
	 * </p>
	 */
	public static McObfPair func_76563_a = McMappingDatabase.getSRG("WorldProviderHell.func_76563_a");

	/**
	 * <p>
	 * Name: getFogColor
	 * </p>
	 * <p>
	 * Desc: [(FF)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_76562_b = McMappingDatabase.getSRG("WorldProviderHell.func_76562_b");

	/**
	 * <p>
	 * Name: isSurfaceWorld
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76569_d = McMappingDatabase.getSRG("WorldProviderHell.func_76569_d");

	/**
	 * <p>
	 * Name: generateLightBrightnessTable
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76556_a = McMappingDatabase.getSRG("WorldProviderHell.func_76556_a");

	/**
	 * <p>
	 * Name: createWorldBorder
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/border/WorldBorder;]
	 * </p>
	 */
	public static McObfPair func_177501_r = McMappingDatabase.getSRG("WorldProviderHell.func_177501_r");

}

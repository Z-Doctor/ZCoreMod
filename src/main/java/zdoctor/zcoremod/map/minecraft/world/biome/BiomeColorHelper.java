package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeColorHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anj";
		else
			return "net/minecraft/world/biome/BiomeColorHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anj";
		else
			return "BiomeColorHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanj;";
		else
			return "Lnet/minecraft/world/biome/BiomeColorHelper;";
	}

	/**
	 * <p>
	 * Name: WATER_COLOR
	 * </p>
	 */
	public static McObfPair field_180290_c = McMappingDatabase.getSRG("field_180290_c");

	/**
	 * <p>
	 * Name: getColorAtPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/biome/BiomeColorHelper$ColorResolver;)I]
	 * </p>
	 */
	public static McObfPair func_180285_a = McMappingDatabase.getSRG("BiomeColorHelper.func_180285_a");

	/**
	 * <p>
	 * Name: getGrassColorAtPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_180286_a = McMappingDatabase.getSRG("BiomeColorHelper.func_180286_a");

	/**
	 * <p>
	 * Name: getFoliageColorAtPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_180287_b = McMappingDatabase.getSRG("BiomeColorHelper.func_180287_b");

	/**
	 * <p>
	 * Name: GRASS_COLOR
	 * </p>
	 */
	public static McObfPair field_180291_a = McMappingDatabase.getSRG("field_180291_a");

	/**
	 * <p>
	 * Name: FOLIAGE_COLOR
	 * </p>
	 */
	public static McObfPair field_180289_b = McMappingDatabase.getSRG("field_180289_b");

	/**
	 * <p>
	 * Name: getWaterColorAtPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_180288_c = McMappingDatabase.getSRG("BiomeColorHelper.func_180288_c");

}

package zdoctor.zcoremod.map.minecraft.init;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Biomes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anm";
		else
			return "net/minecraft/init/Biomes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anm";
		else
			return "Biomes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanm;";
		else
			return "Lnet/minecraft/init/Biomes;";
	}

	/**
	 * <p>
	 * Name: SKY
	 * </p>
	 */
	public static McObfPair field_76779_k = McMappingDatabase.getSRG("field_76779_k");

	/**
	 * <p>
	 * Name: OCEAN
	 * </p>
	 */
	public static McObfPair field_76771_b = McMappingDatabase.getSRG("field_76771_b");

	/**
	 * <p>
	 * Name: MUTATED_JUNGLE_EDGE
	 * </p>
	 */
	public static McObfPair field_185447_Y = McMappingDatabase.getSRG("field_185447_Y");

	/**
	 * <p>
	 * Name: TAIGA_HILLS
	 * </p>
	 */
	public static McObfPair field_76784_u = McMappingDatabase.getSRG("field_76784_u");

	/**
	 * <p>
	 * Name: SAVANNA
	 * </p>
	 */
	public static McObfPair field_150588_X = McMappingDatabase.getSRG("field_150588_X");

	/**
	 * <p>
	 * Name: RIVER
	 * </p>
	 */
	public static McObfPair field_76781_i = McMappingDatabase.getSRG("field_76781_i");

	/**
	 * <p>
	 * Name: ICE_PLAINS
	 * </p>
	 */
	public static McObfPair field_76774_n = McMappingDatabase.getSRG("field_76774_n");

	/**
	 * <p>
	 * Name: DEEP_OCEAN
	 * </p>
	 */
	public static McObfPair field_150575_M = McMappingDatabase.getSRG("field_150575_M");

	/**
	 * <p>
	 * Name: MUTATED_REDWOOD_TAIGA_HILLS
	 * </p>
	 */
	public static McObfPair field_185433_ae = McMappingDatabase.getSRG("field_185433_ae");

	/**
	 * <p>
	 * Name: MUTATED_EXTREME_HILLS_WITH_TREES
	 * </p>
	 */
	public static McObfPair field_185434_af = McMappingDatabase.getSRG("field_185434_af");

	/**
	 * <p>
	 * Name: TAIGA
	 * </p>
	 */
	public static McObfPair field_76768_g = McMappingDatabase.getSRG("field_76768_g");

	/**
	 * <p>
	 * Name: DEFAULT
	 * </p>
	 */
	public static McObfPair field_180279_ad = McMappingDatabase.getSRG("field_180279_ad");

	/**
	 * <p>
	 * Name: BIRCH_FOREST_HILLS
	 * </p>
	 */
	public static McObfPair field_150582_Q = McMappingDatabase.getSRG("field_150582_Q");

	/**
	 * <p>
	 * Name: MUTATED_TAIGA_COLD
	 * </p>
	 */
	public static McObfPair field_185431_ac = McMappingDatabase.getSRG("field_185431_ac");

	/**
	 * <p>
	 * Name: HELL
	 * </p>
	 */
	public static McObfPair field_76778_j = McMappingDatabase.getSRG("field_76778_j");

	/**
	 * <p>
	 * Name: MUTATED_FOREST
	 * </p>
	 */
	public static McObfPair field_185444_T = McMappingDatabase.getSRG("field_185444_T");

	/**
	 * <p>
	 * Name: COLD_TAIGA_HILLS
	 * </p>
	 */
	public static McObfPair field_150579_T = McMappingDatabase.getSRG("field_150579_T");

	/**
	 * <p>
	 * Name: COLD_TAIGA
	 * </p>
	 */
	public static McObfPair field_150584_S = McMappingDatabase.getSRG("field_150584_S");

	/**
	 * <p>
	 * Name: MUTATED_EXTREME_HILLS
	 * </p>
	 */
	public static McObfPair field_185443_S = McMappingDatabase.getSRG("field_185443_S");

	/**
	 * <p>
	 * Name: BIRCH_FOREST
	 * </p>
	 */
	public static McObfPair field_150583_P = McMappingDatabase.getSRG("field_150583_P");

	/**
	 * <p>
	 * Name: STONE_BEACH
	 * </p>
	 */
	public static McObfPair field_150576_N = McMappingDatabase.getSRG("field_150576_N");

	/**
	 * <p>
	 * Name: FOREST
	 * </p>
	 */
	public static McObfPair field_76767_f = McMappingDatabase.getSRG("field_76767_f");

	/**
	 * <p>
	 * Name: MUTATED_SWAMPLAND
	 * </p>
	 */
	public static McObfPair field_150599_m = McMappingDatabase.getSRG("field_150599_m");

	/**
	 * <p>
	 * Name: MESA
	 * </p>
	 */
	public static McObfPair field_150589_Z = McMappingDatabase.getSRG("field_150589_Z");

	/**
	 * <p>
	 * Name: MESA_CLEAR_ROCK
	 * </p>
	 */
	public static McObfPair field_150608_ab = McMappingDatabase.getSRG("field_150608_ab");

	/**
	 * <p>
	 * Name: MESA_ROCK
	 * </p>
	 */
	public static McObfPair field_150607_aa = McMappingDatabase.getSRG("field_150607_aa");

	/**
	 * <p>
	 * Name: MUTATED_MESA_CLEAR_ROCK
	 * </p>
	 */
	public static McObfPair field_185439_ak = McMappingDatabase.getSRG("field_185439_ak");

	/**
	 * <p>
	 * Name: MUTATED_REDWOOD_TAIGA
	 * </p>
	 */
	public static McObfPair field_185432_ad = McMappingDatabase.getSRG("field_185432_ad");

	/**
	 * <p>
	 * Name: MUSHROOM_ISLAND
	 * </p>
	 */
	public static McObfPair field_76789_p = McMappingDatabase.getSRG("field_76789_p");

	/**
	 * <p>
	 * Name: FROZEN_OCEAN
	 * </p>
	 */
	public static McObfPair field_76776_l = McMappingDatabase.getSRG("field_76776_l");

	/**
	 * <p>
	 * Name: EXTREME_HILLS
	 * </p>
	 */
	public static McObfPair field_76770_e = McMappingDatabase.getSRG("field_76770_e");

	/**
	 * <p>
	 * Name: MUTATED_SAVANNA
	 * </p>
	 */
	public static McObfPair field_185435_ag = McMappingDatabase.getSRG("field_185435_ag");

	/**
	 * <p>
	 * Name: SAVANNA_PLATEAU
	 * </p>
	 */
	public static McObfPair field_150587_Y = McMappingDatabase.getSRG("field_150587_Y");

	/**
	 * <p>
	 * Name: MUTATED_BIRCH_FOREST_HILLS
	 * </p>
	 */
	public static McObfPair field_185429_aa = McMappingDatabase.getSRG("field_185429_aa");

	/**
	 * <p>
	 * Name: BEACH
	 * </p>
	 */
	public static McObfPair field_76787_r = McMappingDatabase.getSRG("field_76787_r");

	/**
	 * <p>
	 * Name: JUNGLE
	 * </p>
	 */
	public static McObfPair field_76782_w = McMappingDatabase.getSRG("field_76782_w");

	/**
	 * <p>
	 * Name: MUSHROOM_ISLAND_SHORE
	 * </p>
	 */
	public static McObfPair field_76788_q = McMappingDatabase.getSRG("field_76788_q");

	/**
	 * <p>
	 * Name: MUTATED_SAVANNA_ROCK
	 * </p>
	 */
	public static McObfPair field_185436_ah = McMappingDatabase.getSRG("field_185436_ah");

	/**
	 * <p>
	 * Name: COLD_BEACH
	 * </p>
	 */
	public static McObfPair field_150577_O = McMappingDatabase.getSRG("field_150577_O");

	/**
	 * <p>
	 * Name: ICE_MOUNTAINS
	 * </p>
	 */
	public static McObfPair field_76775_o = McMappingDatabase.getSRG("field_76775_o");

	/**
	 * <p>
	 * Name: MUTATED_TAIGA
	 * </p>
	 */
	public static McObfPair field_150590_f = McMappingDatabase.getSRG("field_150590_f");

	/**
	 * <p>
	 * Name: getRegisteredBiome
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_185428_a = McMappingDatabase.getSRG("Biomes.func_185428_a");

	/**
	 * <p>
	 * Name: SWAMPLAND
	 * </p>
	 */
	public static McObfPair field_76780_h = McMappingDatabase.getSRG("field_76780_h");

	/**
	 * <p>
	 * Name: MUTATED_MESA
	 * </p>
	 */
	public static McObfPair field_185437_ai = McMappingDatabase.getSRG("field_185437_ai");

	/**
	 * <p>
	 * Name: MUTATED_JUNGLE
	 * </p>
	 */
	public static McObfPair field_185446_X = McMappingDatabase.getSRG("field_185446_X");

	/**
	 * <p>
	 * Name: MUTATED_PLAINS
	 * </p>
	 */
	public static McObfPair field_185441_Q = McMappingDatabase.getSRG("field_185441_Q");

	/**
	 * <p>
	 * Name: MUTATED_BIRCH_FOREST
	 * </p>
	 */
	public static McObfPair field_185448_Z = McMappingDatabase.getSRG("field_185448_Z");

	/**
	 * <p>
	 * Name: MUTATED_ROOFED_FOREST
	 * </p>
	 */
	public static McObfPair field_185430_ab = McMappingDatabase.getSRG("field_185430_ab");

	/**
	 * <p>
	 * Name: REDWOOD_TAIGA
	 * </p>
	 */
	public static McObfPair field_150578_U = McMappingDatabase.getSRG("field_150578_U");

	/**
	 * <p>
	 * Name: EXTREME_HILLS_EDGE
	 * </p>
	 */
	public static McObfPair field_76783_v = McMappingDatabase.getSRG("field_76783_v");

	/**
	 * <p>
	 * Name: MUTATED_DESERT
	 * </p>
	 */
	public static McObfPair field_185442_R = McMappingDatabase.getSRG("field_185442_R");

	/**
	 * <p>
	 * Name: JUNGLE_HILLS
	 * </p>
	 */
	public static McObfPair field_76792_x = McMappingDatabase.getSRG("field_76792_x");

	/**
	 * <p>
	 * Name: MUTATED_MESA_ROCK
	 * </p>
	 */
	public static McObfPair field_185438_aj = McMappingDatabase.getSRG("field_185438_aj");

	/**
	 * <p>
	 * Name: DESERT_HILLS
	 * </p>
	 */
	public static McObfPair field_76786_s = McMappingDatabase.getSRG("field_76786_s");

	/**
	 * <p>
	 * Name: REDWOOD_TAIGA_HILLS
	 * </p>
	 */
	public static McObfPair field_150581_V = McMappingDatabase.getSRG("field_150581_V");

	/**
	 * <p>
	 * Name: PLAINS
	 * </p>
	 */
	public static McObfPair field_76772_c = McMappingDatabase.getSRG("field_76772_c");

	/**
	 * <p>
	 * Name: ROOFED_FOREST
	 * </p>
	 */
	public static McObfPair field_150585_R = McMappingDatabase.getSRG("field_150585_R");

	/**
	 * <p>
	 * Name: FOREST_HILLS
	 * </p>
	 */
	public static McObfPair field_76785_t = McMappingDatabase.getSRG("field_76785_t");

	/**
	 * <p>
	 * Name: EXTREME_HILLS_WITH_TREES
	 * </p>
	 */
	public static McObfPair field_150580_W = McMappingDatabase.getSRG("field_150580_W");

	/**
	 * <p>
	 * Name: VOID
	 * </p>
	 */
	public static McObfPair field_185440_P = McMappingDatabase.getSRG("field_185440_P");

	/**
	 * <p>
	 * Name: DESERT
	 * </p>
	 */
	public static McObfPair field_76769_d = McMappingDatabase.getSRG("field_76769_d");

	/**
	 * <p>
	 * Name: MUTATED_ICE_FLATS
	 * </p>
	 */
	public static McObfPair field_185445_W = McMappingDatabase.getSRG("field_185445_W");

	/**
	 * <p>
	 * Name: FROZEN_RIVER
	 * </p>
	 */
	public static McObfPair field_76777_m = McMappingDatabase.getSRG("field_76777_m");

	/**
	 * <p>
	 * Name: JUNGLE_EDGE
	 * </p>
	 */
	public static McObfPair field_150574_L = McMappingDatabase.getSRG("field_150574_L");

}

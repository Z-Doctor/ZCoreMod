package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkGeneratorSettings {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayx";
		else
			return "net/minecraft/world/gen/ChunkGeneratorSettings";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayx";
		else
			return "ChunkGeneratorSettings";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layx;";
		else
			return "Lnet/minecraft/world/gen/ChunkGeneratorSettings;";
	}

	/**
	 * <p>
	 * Name: coalMinHeight
	 * </p>
	 */
	public static McObfPair field_177851_ae = McMappingDatabase.getSRG("field_177851_ae");

	/**
	 * <p>
	 * Name: redstoneMinHeight
	 * </p>
	 */
	public static McObfPair field_177818_aq = McMappingDatabase.getSRG("field_177818_aq");

	/**
	 * <p>
	 * Name: coalCount
	 * </p>
	 */
	public static McObfPair field_177845_ad = McMappingDatabase.getSRG("field_177845_ad");

	/**
	 * <p>
	 * Name: dioriteSize
	 * </p>
	 */
	public static McObfPair field_177792_U = McMappingDatabase.getSRG("field_177792_U");

	/**
	 * <p>
	 * Name: goldMinHeight
	 * </p>
	 */
	public static McObfPair field_177840_am = McMappingDatabase.getSRG("field_177840_am");

	/**
	 * <p>
	 * Name: goldMaxHeight
	 * </p>
	 */
	public static McObfPair field_177842_an = McMappingDatabase.getSRG("field_177842_an");

	/**
	 * <p>
	 * Name: lapisSpread
	 * </p>
	 */
	public static McObfPair field_177805_az = McMappingDatabase.getSRG("field_177805_az");

	/**
	 * <p>
	 * Name: graniteSize
	 * </p>
	 */
	public static McObfPair field_177796_Q = McMappingDatabase.getSRG("field_177796_Q");

	/**
	 * <p>
	 * Name: depthNoiseScaleExponent
	 * </p>
	 */
	public static McObfPair field_177804_g = McMappingDatabase.getSRG("field_177804_g");

	/**
	 * <p>
	 * Name: gravelCount
	 * </p>
	 */
	public static McObfPair field_177786_N = McMappingDatabase.getSRG("field_177786_N");

	/**
	 * <p>
	 * Name: gravelMinHeight
	 * </p>
	 */
	public static McObfPair field_177787_O = McMappingDatabase.getSRG("field_177787_O");

	/**
	 * <p>
	 * Name: lapisCenterHeight
	 * </p>
	 */
	public static McObfPair field_177807_ay = McMappingDatabase.getSRG("field_177807_ay");

	/**
	 * <p>
	 * Name: redstoneSize
	 * </p>
	 */
	public static McObfPair field_177836_ao = McMappingDatabase.getSRG("field_177836_ao");

	/**
	 * <p>
	 * Name: ironSize
	 * </p>
	 */
	public static McObfPair field_177848_ag = McMappingDatabase.getSRG("field_177848_ag");

	/**
	 * <p>
	 * Name: biomeScaleWeight
	 * </p>
	 */
	public static McObfPair field_177815_o = McMappingDatabase.getSRG("field_177815_o");

	/**
	 * <p>
	 * Name: heightScale
	 * </p>
	 */
	public static McObfPair field_177809_b = McMappingDatabase.getSRG("field_177809_b");

	/**
	 * <p>
	 * Name: diamondMaxHeight
	 * </p>
	 */
	public static McObfPair field_177824_av = McMappingDatabase.getSRG("field_177824_av");

	/**
	 * <p>
	 * Name: diamondCount
	 * </p>
	 */
	public static McObfPair field_177812_at = McMappingDatabase.getSRG("field_177812_at");

	/**
	 * <p>
	 * Name: dirtMaxHeight
	 * </p>
	 */
	public static McObfPair field_177784_L = McMappingDatabase.getSRG("field_177784_L");

	/**
	 * <p>
	 * Name: useStrongholds
	 * </p>
	 */
	public static McObfPair field_177833_u = McMappingDatabase.getSRG("field_177833_u");

	/**
	 * <p>
	 * Name: redstoneCount
	 * </p>
	 */
	public static McObfPair field_177838_ap = McMappingDatabase.getSRG("field_177838_ap");

	/**
	 * <p>
	 * Name: upperLimitScale
	 * </p>
	 */
	public static McObfPair field_177810_c = McMappingDatabase.getSRG("field_177810_c");

	/**
	 * <p>
	 * Name: andesiteMaxHeight
	 * </p>
	 */
	public static McObfPair field_177847_ab = McMappingDatabase.getSRG("field_177847_ab");

	/**
	 * <p>
	 * Name: mainNoiseScaleY
	 * </p>
	 */
	public static McObfPair field_177827_i = McMappingDatabase.getSRG("field_177827_i");

	/**
	 * <p>
	 * Name: baseSize
	 * </p>
	 */
	public static McObfPair field_177823_k = McMappingDatabase.getSRG("field_177823_k");

	/**
	 * <p>
	 * Name: biomeSize
	 * </p>
	 */
	public static McObfPair field_177780_G = McMappingDatabase.getSRG("field_177780_G");

	/**
	 * <p>
	 * Name: dirtCount
	 * </p>
	 */
	public static McObfPair field_177790_J = McMappingDatabase.getSRG("field_177790_J");

	/**
	 * <p>
	 * Name: goldSize
	 * </p>
	 */
	public static McObfPair field_177828_ak = McMappingDatabase.getSRG("field_177828_ak");

	/**
	 * <p>
	 * Name: mainNoiseScaleZ
	 * </p>
	 */
	public static McObfPair field_177821_j = McMappingDatabase.getSRG("field_177821_j");

	/**
	 * <p>
	 * Name: coalMaxHeight
	 * </p>
	 */
	public static McObfPair field_177853_af = McMappingDatabase.getSRG("field_177853_af");

	/**
	 * <p>
	 * Name: useMineShafts
	 * </p>
	 */
	public static McObfPair field_177829_w = McMappingDatabase.getSRG("field_177829_w");

	/**
	 * <p>
	 * Name: useVillages
	 * </p>
	 */
	public static McObfPair field_177831_v = McMappingDatabase.getSRG("field_177831_v");

	/**
	 * <p>
	 * Name: biomeDepthOffSet
	 * </p>
	 */
	public static McObfPair field_177813_n = McMappingDatabase.getSRG("field_177813_n");

	/**
	 * <p>
	 * Name: useLavaOceans
	 * </p>
	 */
	public static McObfPair field_177778_E = McMappingDatabase.getSRG("field_177778_E");

	/**
	 * <p>
	 * Name: ironMinHeight
	 * </p>
	 */
	public static McObfPair field_177832_ai = McMappingDatabase.getSRG("field_177832_ai");

	/**
	 * <p>
	 * Name: andesiteSize
	 * </p>
	 */
	public static McObfPair field_177800_Y = McMappingDatabase.getSRG("field_177800_Y");

	/**
	 * <p>
	 * Name: depthNoiseScaleZ
	 * </p>
	 */
	public static McObfPair field_177803_f = McMappingDatabase.getSRG("field_177803_f");

	/**
	 * <p>
	 * Name: dirtSize
	 * </p>
	 */
	public static McObfPair field_177789_I = McMappingDatabase.getSRG("field_177789_I");

	/**
	 * <p>
	 * Name: gravelMaxHeight
	 * </p>
	 */
	public static McObfPair field_177797_P = McMappingDatabase.getSRG("field_177797_P");

	/**
	 * <p>
	 * Name: gravelSize
	 * </p>
	 */
	public static McObfPair field_177785_M = McMappingDatabase.getSRG("field_177785_M");

	/**
	 * <p>
	 * Name: andesiteMinHeight
	 * </p>
	 */
	public static McObfPair field_177846_aa = McMappingDatabase.getSRG("field_177846_aa");

	/**
	 * <p>
	 * Name: lowerLimitScale
	 * </p>
	 */
	public static McObfPair field_177806_d = McMappingDatabase.getSRG("field_177806_d");

	/**
	 * <p>
	 * Name: biomeScaleOffset
	 * </p>
	 */
	public static McObfPair field_177843_p = McMappingDatabase.getSRG("field_177843_p");

	/**
	 * <p>
	 * Name: graniteMinHeight
	 * </p>
	 */
	public static McObfPair field_177798_S = McMappingDatabase.getSRG("field_177798_S");

	/**
	 * <p>
	 * Name: dioriteMinHeight
	 * </p>
	 */
	public static McObfPair field_177794_W = McMappingDatabase.getSRG("field_177794_W");

	/**
	 * <p>
	 * Name: redstoneMaxHeight
	 * </p>
	 */
	public static McObfPair field_177816_ar = McMappingDatabase.getSRG("field_177816_ar");

	/**
	 * <p>
	 * Name: andesiteCount
	 * </p>
	 */
	public static McObfPair field_177802_Z = McMappingDatabase.getSRG("field_177802_Z");

	/**
	 * <p>
	 * Name: graniteCount
	 * </p>
	 */
	public static McObfPair field_177799_R = McMappingDatabase.getSRG("field_177799_R");

	/**
	 * <p>
	 * Name: riverSize
	 * </p>
	 */
	public static McObfPair field_177788_H = McMappingDatabase.getSRG("field_177788_H");

	/**
	 * <p>
	 * Name: stretchY
	 * </p>
	 */
	public static McObfPair field_177817_l = McMappingDatabase.getSRG("field_177817_l");

	/**
	 * <p>
	 * Name: biomeDepthWeight
	 * </p>
	 */
	public static McObfPair field_177819_m = McMappingDatabase.getSRG("field_177819_m");

	/**
	 * <p>
	 * Name: dioriteMaxHeight
	 * </p>
	 */
	public static McObfPair field_177801_X = McMappingDatabase.getSRG("field_177801_X");

	/**
	 * <p>
	 * Name: ironCount
	 * </p>
	 */
	public static McObfPair field_177849_ah = McMappingDatabase.getSRG("field_177849_ah");

	/**
	 * <p>
	 * Name: waterLakeChance
	 * </p>
	 */
	public static McObfPair field_177782_B = McMappingDatabase.getSRG("field_177782_B");

	/**
	 * <p>
	 * Name: diamondMinHeight
	 * </p>
	 */
	public static McObfPair field_177826_au = McMappingDatabase.getSRG("field_177826_au");

	/**
	 * <p>
	 * Name: diamondSize
	 * </p>
	 */
	public static McObfPair field_177814_as = McMappingDatabase.getSRG("field_177814_as");

	/**
	 * <p>
	 * Name: dioriteCount
	 * </p>
	 */
	public static McObfPair field_177795_V = McMappingDatabase.getSRG("field_177795_V");

	/**
	 * <p>
	 * Name: dungeonChance
	 * </p>
	 */
	public static McObfPair field_177835_t = McMappingDatabase.getSRG("field_177835_t");

	/**
	 * <p>
	 * Name: useRavines
	 * </p>
	 */
	public static McObfPair field_177850_z = McMappingDatabase.getSRG("field_177850_z");

	/**
	 * <p>
	 * Name: fixedBiome
	 * </p>
	 */
	public static McObfPair field_177779_F = McMappingDatabase.getSRG("field_177779_F");

	/**
	 * <p>
	 * Name: lapisCount
	 * </p>
	 */
	public static McObfPair field_177820_ax = McMappingDatabase.getSRG("field_177820_ax");

	/**
	 * <p>
	 * Name: useMansions
	 * </p>
	 */
	public static McObfPair field_191077_z = McMappingDatabase.getSRG("field_191077_z");

	/**
	 * <p>
	 * Name: useCaves
	 * </p>
	 */
	public static McObfPair field_177839_r = McMappingDatabase.getSRG("field_177839_r");

	/**
	 * <p>
	 * Name: useLavaLakes
	 * </p>
	 */
	public static McObfPair field_177783_C = McMappingDatabase.getSRG("field_177783_C");

	/**
	 * <p>
	 * Name: lapisSize
	 * </p>
	 */
	public static McObfPair field_177822_aw = McMappingDatabase.getSRG("field_177822_aw");

	/**
	 * <p>
	 * Name: graniteMaxHeight
	 * </p>
	 */
	public static McObfPair field_177793_T = McMappingDatabase.getSRG("field_177793_T");

	/**
	 * <p>
	 * Name: useMonuments
	 * </p>
	 */
	public static McObfPair field_177852_y = McMappingDatabase.getSRG("field_177852_y");

	/**
	 * <p>
	 * Name: seaLevel
	 * </p>
	 */
	public static McObfPair field_177841_q = McMappingDatabase.getSRG("field_177841_q");

	/**
	 * <p>
	 * Name: dirtMinHeight
	 * </p>
	 */
	public static McObfPair field_177791_K = McMappingDatabase.getSRG("field_177791_K");

	/**
	 * <p>
	 * Name: coordinateScale
	 * </p>
	 */
	public static McObfPair field_177811_a = McMappingDatabase.getSRG("field_177811_a");

	/**
	 * <p>
	 * Name: goldCount
	 * </p>
	 */
	public static McObfPair field_177830_al = McMappingDatabase.getSRG("field_177830_al");

	/**
	 * <p>
	 * Name: mainNoiseScaleX
	 * </p>
	 */
	public static McObfPair field_177825_h = McMappingDatabase.getSRG("field_177825_h");

	/**
	 * <p>
	 * Name: lavaLakeChance
	 * </p>
	 */
	public static McObfPair field_177777_D = McMappingDatabase.getSRG("field_177777_D");

	/**
	 * <p>
	 * Name: ironMaxHeight
	 * </p>
	 */
	public static McObfPair field_177834_aj = McMappingDatabase.getSRG("field_177834_aj");

	/**
	 * <p>
	 * Name: coalSize
	 * </p>
	 */
	public static McObfPair field_177844_ac = McMappingDatabase.getSRG("field_177844_ac");

	/**
	 * <p>
	 * Name: useDungeons
	 * </p>
	 */
	public static McObfPair field_177837_s = McMappingDatabase.getSRG("field_177837_s");

	/**
	 * <p>
	 * Name: useWaterLakes
	 * </p>
	 */
	public static McObfPair field_177781_A = McMappingDatabase.getSRG("field_177781_A");

	/**
	 * <p>
	 * Name: depthNoiseScaleX
	 * </p>
	 */
	public static McObfPair field_177808_e = McMappingDatabase.getSRG("field_177808_e");

	/**
	 * <p>
	 * Name: useTemples
	 * </p>
	 */
	public static McObfPair field_177854_x = McMappingDatabase.getSRG("field_177854_x");

}

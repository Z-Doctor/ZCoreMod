package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkGeneratorSettings$Factory {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayx$a";
		else
			return "net/minecraft/world/gen/ChunkGeneratorSettings$Factory";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayx$a";
		else
			return "ChunkGeneratorSettings$Factory";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layx$a;";
		else
			return "Lnet/minecraft/world/gen/ChunkGeneratorSettings$Factory;";
	}

	/**
	 * <p>
	 * Name: gravelMinHeight
	 * </p>
	 */
	public static McObfPair field_177886_P = McMappingDatabase.getSRG("field_177886_P");

	/**
	 * <p>
	 * Name: seaLevel
	 * </p>
	 */
	public static McObfPair field_177929_r = McMappingDatabase.getSRG("field_177929_r");

	/**
	 * <p>
	 * Name: useMansions
	 * </p>
	 */
	public static McObfPair field_191076_A = McMappingDatabase.getSRG("field_191076_A");

	/**
	 * <p>
	 * Name: depthNoiseScaleZ
	 * </p>
	 */
	public static McObfPair field_177894_g = McMappingDatabase.getSRG("field_177894_g");

	/**
	 * <p>
	 * Name: useVillages
	 * </p>
	 */
	public static McObfPair field_177919_w = McMappingDatabase.getSRG("field_177919_w");

	/**
	 * <p>
	 * Name: lapisCount
	 * </p>
	 */
	public static McObfPair field_177897_ay = McMappingDatabase.getSRG("field_177897_ay");

	/**
	 * <p>
	 * Name: stretchY
	 * </p>
	 */
	public static McObfPair field_177909_m = McMappingDatabase.getSRG("field_177909_m");

	/**
	 * <p>
	 * Name: JSON_ADAPTER
	 * </p>
	 */
	public static McObfPair field_177901_a = McMappingDatabase.getSRG("field_177901_a");

	/**
	 * <p>
	 * Name: redstoneMaxHeight
	 * </p>
	 */
	public static McObfPair field_177904_as = McMappingDatabase.getSRG("field_177904_as");

	/**
	 * <p>
	 * Name: diamondCount
	 * </p>
	 */
	public static McObfPair field_177916_au = McMappingDatabase.getSRG("field_177916_au");

	/**
	 * <p>
	 * Name: redstoneCount
	 * </p>
	 */
	public static McObfPair field_177908_aq = McMappingDatabase.getSRG("field_177908_aq");

	/**
	 * <p>
	 * Name: coalSize
	 * </p>
	 */
	public static McObfPair field_177935_ad = McMappingDatabase.getSRG("field_177935_ad");

	/**
	 * <p>
	 * Name: diamondMaxHeight
	 * </p>
	 */
	public static McObfPair field_177912_aw = McMappingDatabase.getSRG("field_177912_aw");

	/**
	 * <p>
	 * Name: mainNoiseScaleZ
	 * </p>
	 */
	public static McObfPair field_177913_k = McMappingDatabase.getSRG("field_177913_k");

	/**
	 * <p>
	 * Name: dioriteCount
	 * </p>
	 */
	public static McObfPair field_177883_W = McMappingDatabase.getSRG("field_177883_W");

	/**
	 * <p>
	 * Name: riverSize
	 * </p>
	 */
	public static McObfPair field_177878_I = McMappingDatabase.getSRG("field_177878_I");

	/**
	 * <p>
	 * Name: coalCount
	 * </p>
	 */
	public static McObfPair field_177941_ae = McMappingDatabase.getSRG("field_177941_ae");

	/**
	 * <p>
	 * Name: lapisSpread
	 * </p>
	 */
	public static McObfPair field_177889_aA = McMappingDatabase.getSRG("field_177889_aA");

	/**
	 * <p>
	 * Name: redstoneSize
	 * </p>
	 */
	public static McObfPair field_177928_ap = McMappingDatabase.getSRG("field_177928_ap");

	/**
	 * <p>
	 * Name: goldSize
	 * </p>
	 */
	public static McObfPair field_177920_al = McMappingDatabase.getSRG("field_177920_al");

	/**
	 * <p>
	 * Name: mainNoiseScaleX
	 * </p>
	 */
	public static McObfPair field_177917_i = McMappingDatabase.getSRG("field_177917_i");

	/**
	 * <p>
	 * Name: useMineShafts
	 * </p>
	 */
	public static McObfPair field_177944_x = McMappingDatabase.getSRG("field_177944_x");

	/**
	 * <p>
	 * Name: biomeDepthWeight
	 * </p>
	 */
	public static McObfPair field_177903_n = McMappingDatabase.getSRG("field_177903_n");

	/**
	 * <p>
	 * Name: biomeScaleWeight
	 * </p>
	 */
	public static McObfPair field_177933_p = McMappingDatabase.getSRG("field_177933_p");

	/**
	 * <p>
	 * Name: goldMinHeight
	 * </p>
	 */
	public static McObfPair field_177932_an = McMappingDatabase.getSRG("field_177932_an");

	/**
	 * <p>
	 * Name: andesiteMinHeight
	 * </p>
	 */
	public static McObfPair field_177937_ab = McMappingDatabase.getSRG("field_177937_ab");

	/**
	 * <p>
	 * Name: dirtMinHeight
	 * </p>
	 */
	public static McObfPair field_177873_L = McMappingDatabase.getSRG("field_177873_L");

	/**
	 * <p>
	 * Name: goldMaxHeight
	 * </p>
	 */
	public static McObfPair field_177926_ao = McMappingDatabase.getSRG("field_177926_ao");

	/**
	 * <p>
	 * Name: andesiteMaxHeight
	 * </p>
	 */
	public static McObfPair field_177934_ac = McMappingDatabase.getSRG("field_177934_ac");

	/**
	 * <p>
	 * Name: depthNoiseScaleX
	 * </p>
	 */
	public static McObfPair field_177893_f = McMappingDatabase.getSRG("field_177893_f");

	/**
	 * <p>
	 * Name: dirtSize
	 * </p>
	 */
	public static McObfPair field_177879_J = McMappingDatabase.getSRG("field_177879_J");

	/**
	 * <p>
	 * Name: setDefaults
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177863_a = McMappingDatabase.getSRG("ChunkGeneratorSettings$Factory.func_177863_a");

	/**
	 * <p>
	 * Name: lavaLakeChance
	 * </p>
	 */
	public static McObfPair field_177867_E = McMappingDatabase.getSRG("field_177867_E");

	/**
	 * <p>
	 * Name: goldCount
	 * </p>
	 */
	public static McObfPair field_177930_am = McMappingDatabase.getSRG("field_177930_am");

	/**
	 * <p>
	 * Name: biomeScaleOffset
	 * </p>
	 */
	public static McObfPair field_177931_q = McMappingDatabase.getSRG("field_177931_q");

	/**
	 * <p>
	 * Name: upperLimitScale
	 * </p>
	 */
	public static McObfPair field_177896_d = McMappingDatabase.getSRG("field_177896_d");

	/**
	 * <p>
	 * Name: gravelSize
	 * </p>
	 */
	public static McObfPair field_177875_N = McMappingDatabase.getSRG("field_177875_N");

	/**
	 * <p>
	 * Name: dioriteMaxHeight
	 * </p>
	 */
	public static McObfPair field_177890_Y = McMappingDatabase.getSRG("field_177890_Y");

	/**
	 * <p>
	 * Name: graniteSize
	 * </p>
	 */
	public static McObfPair field_177888_R = McMappingDatabase.getSRG("field_177888_R");

	/**
	 * <p>
	 * Name: heightScale
	 * </p>
	 */
	public static McObfPair field_177900_c = McMappingDatabase.getSRG("field_177900_c");

	/**
	 * <p>
	 * Name: depthNoiseScaleExponent
	 * </p>
	 */
	public static McObfPair field_177915_h = McMappingDatabase.getSRG("field_177915_h");

	/**
	 * <p>
	 * Name: useTemples
	 * </p>
	 */
	public static McObfPair field_177942_y = McMappingDatabase.getSRG("field_177942_y");

	/**
	 * <p>
	 * Name: useDungeons
	 * </p>
	 */
	public static McObfPair field_177925_t = McMappingDatabase.getSRG("field_177925_t");

	/**
	 * <p>
	 * Name: redstoneMinHeight
	 * </p>
	 */
	public static McObfPair field_177906_ar = McMappingDatabase.getSRG("field_177906_ar");

	/**
	 * <p>
	 * Name: jsonToFactory
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/world/gen/ChunkGeneratorSettings$Factory;]
	 * </p>
	 */
	public static McObfPair func_177865_a = McMappingDatabase.getSRG("ChunkGeneratorSettings$Factory.func_177865_a");

	/**
	 * <p>
	 * Name: coalMinHeight
	 * </p>
	 */
	public static McObfPair field_177943_af = McMappingDatabase.getSRG("field_177943_af");

	/**
	 * <p>
	 * Name: coordinateScale
	 * </p>
	 */
	public static McObfPair field_177899_b = McMappingDatabase.getSRG("field_177899_b");

	/**
	 * <p>
	 * Name: diamondSize
	 * </p>
	 */
	public static McObfPair field_177902_at = McMappingDatabase.getSRG("field_177902_at");

	/**
	 * <p>
	 * Name: graniteCount
	 * </p>
	 */
	public static McObfPair field_177887_S = McMappingDatabase.getSRG("field_177887_S");

	/**
	 * <p>
	 * Name: biomeSize
	 * </p>
	 */
	public static McObfPair field_177877_H = McMappingDatabase.getSRG("field_177877_H");

	/**
	 * <p>
	 * Name: mainNoiseScaleY
	 * </p>
	 */
	public static McObfPair field_177911_j = McMappingDatabase.getSRG("field_177911_j");

	/**
	 * <p>
	 * Name: diamondMinHeight
	 * </p>
	 */
	public static McObfPair field_177914_av = McMappingDatabase.getSRG("field_177914_av");

	/**
	 * <p>
	 * Name: dioriteSize
	 * </p>
	 */
	public static McObfPair field_177884_V = McMappingDatabase.getSRG("field_177884_V");

	/**
	 * <p>
	 * Name: useStrongholds
	 * </p>
	 */
	public static McObfPair field_177921_v = McMappingDatabase.getSRG("field_177921_v");

	/**
	 * <p>
	 * Name: useWaterLakes
	 * </p>
	 */
	public static McObfPair field_177871_B = McMappingDatabase.getSRG("field_177871_B");

	/**
	 * <p>
	 * Name: useMonuments
	 * </p>
	 */
	public static McObfPair field_177940_z = McMappingDatabase.getSRG("field_177940_z");

	/**
	 * <p>
	 * Name: coalMaxHeight
	 * </p>
	 */
	public static McObfPair field_177938_ag = McMappingDatabase.getSRG("field_177938_ag");

	/**
	 * <p>
	 * Name: build
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/gen/ChunkGeneratorSettings;]
	 * </p>
	 */
	public static McObfPair func_177864_b = McMappingDatabase.getSRG("ChunkGeneratorSettings$Factory.func_177864_b");

	/**
	 * <p>
	 * Name: baseSize
	 * </p>
	 */
	public static McObfPair field_177907_l = McMappingDatabase.getSRG("field_177907_l");

	/**
	 * <p>
	 * Name: dioriteMinHeight
	 * </p>
	 */
	public static McObfPair field_177891_X = McMappingDatabase.getSRG("field_177891_X");

	/**
	 * <p>
	 * Name: ironCount
	 * </p>
	 */
	public static McObfPair field_177922_ai = McMappingDatabase.getSRG("field_177922_ai");

	/**
	 * <p>
	 * Name: useLavaLakes
	 * </p>
	 */
	public static McObfPair field_177866_D = McMappingDatabase.getSRG("field_177866_D");

	/**
	 * <p>
	 * Name: gravelCount
	 * </p>
	 */
	public static McObfPair field_177876_O = McMappingDatabase.getSRG("field_177876_O");

	/**
	 * <p>
	 * Name: lowerLimitScale
	 * </p>
	 */
	public static McObfPair field_177898_e = McMappingDatabase.getSRG("field_177898_e");

	/**
	 * <p>
	 * Name: graniteMinHeight
	 * </p>
	 */
	public static McObfPair field_177882_T = McMappingDatabase.getSRG("field_177882_T");

	/**
	 * <p>
	 * Name: andesiteCount
	 * </p>
	 */
	public static McObfPair field_177936_aa = McMappingDatabase.getSRG("field_177936_aa");

	/**
	 * <p>
	 * Name: dirtMaxHeight
	 * </p>
	 */
	public static McObfPair field_177874_M = McMappingDatabase.getSRG("field_177874_M");

	/**
	 * <p>
	 * Name: lapisSize
	 * </p>
	 */
	public static McObfPair field_177910_ax = McMappingDatabase.getSRG("field_177910_ax");

	/**
	 * <p>
	 * Name: waterLakeChance
	 * </p>
	 */
	public static McObfPair field_177872_C = McMappingDatabase.getSRG("field_177872_C");

	/**
	 * <p>
	 * Name: fixedBiome
	 * </p>
	 */
	public static McObfPair field_177869_G = McMappingDatabase.getSRG("field_177869_G");

	/**
	 * <p>
	 * Name: dirtCount
	 * </p>
	 */
	public static McObfPair field_177880_K = McMappingDatabase.getSRG("field_177880_K");

	/**
	 * <p>
	 * Name: dungeonChance
	 * </p>
	 */
	public static McObfPair field_177923_u = McMappingDatabase.getSRG("field_177923_u");

	/**
	 * <p>
	 * Name: ironSize
	 * </p>
	 */
	public static McObfPair field_177939_ah = McMappingDatabase.getSRG("field_177939_ah");

	/**
	 * <p>
	 * Name: graniteMaxHeight
	 * </p>
	 */
	public static McObfPair field_177881_U = McMappingDatabase.getSRG("field_177881_U");

	/**
	 * <p>
	 * Name: biomeDepthOffset
	 * </p>
	 */
	public static McObfPair field_177905_o = McMappingDatabase.getSRG("field_177905_o");

	/**
	 * <p>
	 * Name: useLavaOceans
	 * </p>
	 */
	public static McObfPair field_177868_F = McMappingDatabase.getSRG("field_177868_F");

	/**
	 * <p>
	 * Name: lapisCenterHeight
	 * </p>
	 */
	public static McObfPair field_177895_az = McMappingDatabase.getSRG("field_177895_az");

	/**
	 * <p>
	 * Name: useRavines
	 * </p>
	 */
	public static McObfPair field_177870_A = McMappingDatabase.getSRG("field_177870_A");

	/**
	 * <p>
	 * Name: useCaves
	 * </p>
	 */
	public static McObfPair field_177927_s = McMappingDatabase.getSRG("field_177927_s");

	/**
	 * <p>
	 * Name: ironMinHeight
	 * </p>
	 */
	public static McObfPair field_177924_aj = McMappingDatabase.getSRG("field_177924_aj");

	/**
	 * <p>
	 * Name: gravelMaxHeight
	 * </p>
	 */
	public static McObfPair field_177885_Q = McMappingDatabase.getSRG("field_177885_Q");

	/**
	 * <p>
	 * Name: andesiteSize
	 * </p>
	 */
	public static McObfPair field_177892_Z = McMappingDatabase.getSRG("field_177892_Z");

	/**
	 * <p>
	 * Name: ironMaxHeight
	 * </p>
	 */
	public static McObfPair field_177918_ak = McMappingDatabase.getSRG("field_177918_ak");

}

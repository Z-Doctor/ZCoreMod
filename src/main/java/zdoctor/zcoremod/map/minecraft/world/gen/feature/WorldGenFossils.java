package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenFossils {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azw";
		else
			return "net/minecraft/world/gen/feature/WorldGenFossils";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azw";
		else
			return "WorldGenFossils";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazw;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenFossils;";
	}

	/**
	 * <p>
	 * Name: STRUCTURE_SKULL_01
	 * </p>
	 */
	public static McObfPair field_189898_i = McMappingDatabase.getSRG("field_189898_i");

	/**
	 * <p>
	 * Name: STRUCTURE_SPINE_02_COAL
	 * </p>
	 */
	public static McObfPair field_189895_f = McMappingDatabase.getSRG("field_189895_f");

	/**
	 * <p>
	 * Name: STRUCTURE_SPINE_03_COAL
	 * </p>
	 */
	public static McObfPair field_189896_g = McMappingDatabase.getSRG("field_189896_g");

	/**
	 * <p>
	 * Name: STRUCTURE_SKULL_01_COAL
	 * </p>
	 */
	public static McObfPair field_189902_m = McMappingDatabase.getSRG("field_189902_m");

	/**
	 * <p>
	 * Name: STRUCTURE_SPINE_01_COAL
	 * </p>
	 */
	public static McObfPair field_189894_e = McMappingDatabase.getSRG("field_189894_e");

	/**
	 * <p>
	 * Name: STRUCTURE_SKULL_03
	 * </p>
	 */
	public static McObfPair field_189900_k = McMappingDatabase.getSRG("field_189900_k");

	/**
	 * <p>
	 * Name: STRUCTURE_SKULL_02
	 * </p>
	 */
	public static McObfPair field_189899_j = McMappingDatabase.getSRG("field_189899_j");

	/**
	 * <p>
	 * Name: FOSSILS_COAL
	 * </p>
	 */
	public static McObfPair field_189907_r = McMappingDatabase.getSRG("field_189907_r");

	/**
	 * <p>
	 * Name: STRUCTURE_SKULL_04_COAL
	 * </p>
	 */
	public static McObfPair field_189905_p = McMappingDatabase.getSRG("field_189905_p");

	/**
	 * <p>
	 * Name: STRUCTURE_SPINE_04
	 * </p>
	 */
	public static McObfPair field_189893_d = McMappingDatabase.getSRG("field_189893_d");

	/**
	 * <p>
	 * Name: STRUCTURE_SPINE_03
	 * </p>
	 */
	public static McObfPair field_189892_c = McMappingDatabase.getSRG("field_189892_c");

	/**
	 * <p>
	 * Name: FOSSILS
	 * </p>
	 */
	public static McObfPair field_189906_q = McMappingDatabase.getSRG("field_189906_q");

	/**
	 * <p>
	 * Name: STRUCTURE_SPINE_01
	 * </p>
	 */
	public static McObfPair field_189890_a = McMappingDatabase.getSRG("field_189890_a");

	/**
	 * <p>
	 * Name: STRUCTURE_SKULL_04
	 * </p>
	 */
	public static McObfPair field_189901_l = McMappingDatabase.getSRG("field_189901_l");

	/**
	 * <p>
	 * Name: STRUCTURE_SKULL_02_COAL
	 * </p>
	 */
	public static McObfPair field_189903_n = McMappingDatabase.getSRG("field_189903_n");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenFossils.func_180709_b");

	/**
	 * <p>
	 * Name: STRUCTURE_SPINE_04_COAL
	 * </p>
	 */
	public static McObfPair field_189897_h = McMappingDatabase.getSRG("field_189897_h");

	/**
	 * <p>
	 * Name: STRUCTURE_SPINE_02
	 * </p>
	 */
	public static McObfPair field_189891_b = McMappingDatabase.getSRG("field_189891_b");

	/**
	 * <p>
	 * Name: STRUCTURE_SKULL_03_COAL
	 * </p>
	 */
	public static McObfPair field_189904_o = McMappingDatabase.getSRG("field_189904_o");

}

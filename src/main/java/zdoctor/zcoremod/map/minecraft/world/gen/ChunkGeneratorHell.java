package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkGeneratorHell {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azd";
		else
			return "net/minecraft/world/gen/ChunkGeneratorHell";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azd";
		else
			return "ChunkGeneratorHell";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazd;";
		else
			return "Lnet/minecraft/world/gen/ChunkGeneratorHell;";
	}

	/**
	 * <p>
	 * Name: AIR
	 * </p>
	 */
	public static McObfPair field_185940_a = McMappingDatabase.getSRG("field_185940_a");

	/**
	 * <p>
	 * Name: brownMushroomFeature
	 * </p>
	 */
	public static McObfPair field_177471_z = McMappingDatabase.getSRG("field_177471_z");

	/**
	 * <p>
	 * Name: hellPortalGen
	 * </p>
	 */
	public static McObfPair field_177468_v = McMappingDatabase.getSRG("field_177468_v");

	/**
	 * <p>
	 * Name: rand
	 * </p>
	 */
	public static McObfPair field_185954_p = McMappingDatabase.getSRG("field_185954_p");

	/**
	 * <p>
	 * Name: BEDROCK
	 * </p>
	 */
	public static McObfPair field_185942_c = McMappingDatabase.getSRG("field_185942_c");

	/**
	 * <p>
	 * Name: lperlinNoise1
	 * </p>
	 */
	public static McObfPair field_185957_u = McMappingDatabase.getSRG("field_185957_u");

	/**
	 * <p>
	 * Name: recreateStructures
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;II)V]
	 * </p>
	 */
	public static McObfPair func_180514_a = McMappingDatabase.getSRG("ChunkGeneratorHell.func_180514_a");

	/**
	 * <p>
	 * Name: depthBuffer
	 * </p>
	 */
	public static McObfPair field_185955_s = McMappingDatabase.getSRG("field_185955_s");

	/**
	 * <p>
	 * Name: NETHERRACK
	 * </p>
	 */
	public static McObfPair field_185941_b = McMappingDatabase.getSRG("field_185941_b");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_185952_n = McMappingDatabase.getSRG("field_185952_n");

	/**
	 * <p>
	 * Name: br
	 * </p>
	 */
	public static McObfPair field_185950_k = McMappingDatabase.getSRG("field_185950_k");

	/**
	 * <p>
	 * Name: gravelNoise
	 * </p>
	 */
	public static McObfPair field_73184_r = McMappingDatabase.getSRG("field_73184_r");

	/**
	 * <p>
	 * Name: lperlinNoise2
	 * </p>
	 */
	public static McObfPair field_185958_v = McMappingDatabase.getSRG("field_185958_v");

	/**
	 * <p>
	 * Name: slowsandNoise
	 * </p>
	 */
	public static McObfPair field_73185_q = McMappingDatabase.getSRG("field_73185_q");

	/**
	 * <p>
	 * Name: slowsandGravelNoiseGen
	 * </p>
	 */
	public static McObfPair field_73177_m = McMappingDatabase.getSRG("field_73177_m");

	/**
	 * <p>
	 * Name: buildSurfaces
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/world/chunk/ChunkPrimer;)V]
	 * </p>
	 */
	public static McObfPair func_185937_b = McMappingDatabase.getSRG("ChunkGeneratorHell.func_185937_b");

	/**
	 * <p>
	 * Name: generateStructures
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;II)Z]
	 * </p>
	 */
	public static McObfPair func_185933_a = McMappingDatabase.getSRG("ChunkGeneratorHell.func_185933_a");

	/**
	 * <p>
	 * Name: prepareHeights
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/world/chunk/ChunkPrimer;)V]
	 * </p>
	 */
	public static McObfPair func_185936_a = McMappingDatabase.getSRG("ChunkGeneratorHell.func_185936_a");

	/**
	 * <p>
	 * Name: generateChunk
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_185932_a = McMappingDatabase.getSRG("ChunkGeneratorHell.func_185932_a");

	/**
	 * <p>
	 * Name: genNetherBridge
	 * </p>
	 */
	public static McObfPair field_73172_c = McMappingDatabase.getSRG("field_73172_c");

	/**
	 * <p>
	 * Name: perlinNoise1
	 * </p>
	 */
	public static McObfPair field_185959_w = McMappingDatabase.getSRG("field_185959_w");

	/**
	 * <p>
	 * Name: noiseData4
	 * </p>
	 */
	public static McObfPair field_73168_g = McMappingDatabase.getSRG("field_73168_g");

	/**
	 * <p>
	 * Name: genNetherCaves
	 * </p>
	 */
	public static McObfPair field_185939_I = McMappingDatabase.getSRG("field_185939_I");

	/**
	 * <p>
	 * Name: getHeights
	 * </p>
	 * <p>
	 * Desc: [([DIIIIII)[D]
	 * </p>
	 */
	public static McObfPair func_185938_a = McMappingDatabase.getSRG("ChunkGeneratorHell.func_185938_a");

	/**
	 * <p>
	 * Name: generateStructures
	 * </p>
	 */
	public static McObfPair field_185953_o = McMappingDatabase.getSRG("field_185953_o");

	/**
	 * <p>
	 * Name: lavaTrapGen
	 * </p>
	 */
	public static McObfPair field_177473_x = McMappingDatabase.getSRG("field_177473_x");

	/**
	 * <p>
	 * Name: isInsideStructure
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_193414_a = McMappingDatabase.getSRG("ChunkGeneratorHell.func_193414_a");

	/**
	 * <p>
	 * Name: scaleNoise
	 * </p>
	 */
	public static McObfPair field_185946_g = McMappingDatabase.getSRG("field_185946_g");

	/**
	 * <p>
	 * Name: getNearestStructurePos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180513_a = McMappingDatabase.getSRG("ChunkGeneratorHell.func_180513_a");

	/**
	 * <p>
	 * Name: ar
	 * </p>
	 */
	public static McObfPair field_185949_j = McMappingDatabase.getSRG("field_185949_j");

	/**
	 * <p>
	 * Name: magmaGen
	 * </p>
	 */
	public static McObfPair field_189888_D = McMappingDatabase.getSRG("field_189888_D");

	/**
	 * <p>
	 * Name: LAVA
	 * </p>
	 */
	public static McObfPair field_185943_d = McMappingDatabase.getSRG("field_185943_d");

	/**
	 * <p>
	 * Name: depthNoise
	 * </p>
	 */
	public static McObfPair field_185947_h = McMappingDatabase.getSRG("field_185947_h");

	/**
	 * <p>
	 * Name: lightGemGen
	 * </p>
	 */
	public static McObfPair field_177469_u = McMappingDatabase.getSRG("field_177469_u");

	/**
	 * <p>
	 * Name: dr
	 * </p>
	 */
	public static McObfPair field_185951_m = McMappingDatabase.getSRG("field_185951_m");

	/**
	 * <p>
	 * Name: getPossibleCreatures
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EnumCreatureType;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_177458_a = McMappingDatabase.getSRG("ChunkGeneratorHell.func_177458_a");

	/**
	 * <p>
	 * Name: hellSpringGen
	 * </p>
	 */
	public static McObfPair field_177472_y = McMappingDatabase.getSRG("field_177472_y");

	/**
	 * <p>
	 * Name: netherrackExculsivityNoiseGen
	 * </p>
	 */
	public static McObfPair field_73174_n = McMappingDatabase.getSRG("field_73174_n");

	/**
	 * <p>
	 * Name: SOUL_SAND
	 * </p>
	 */
	public static McObfPair field_185945_f = McMappingDatabase.getSRG("field_185945_f");

	/**
	 * <p>
	 * Name: buffer
	 * </p>
	 */
	public static McObfPair field_185956_t = McMappingDatabase.getSRG("field_185956_t");

	/**
	 * <p>
	 * Name: populate
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_185931_b = McMappingDatabase.getSRG("ChunkGeneratorHell.func_185931_b");

	/**
	 * <p>
	 * Name: GRAVEL
	 * </p>
	 */
	public static McObfPair field_185944_e = McMappingDatabase.getSRG("field_185944_e");

	/**
	 * <p>
	 * Name: quartzGen
	 * </p>
	 */
	public static McObfPair field_177467_w = McMappingDatabase.getSRG("field_177467_w");

	/**
	 * <p>
	 * Name: fireFeature
	 * </p>
	 */
	public static McObfPair field_177470_t = McMappingDatabase.getSRG("field_177470_t");

	/**
	 * <p>
	 * Name: redMushroomFeature
	 * </p>
	 */
	public static McObfPair field_177465_A = McMappingDatabase.getSRG("field_177465_A");

	/**
	 * <p>
	 * Name: pnr
	 * </p>
	 */
	public static McObfPair field_185948_i = McMappingDatabase.getSRG("field_185948_i");

}

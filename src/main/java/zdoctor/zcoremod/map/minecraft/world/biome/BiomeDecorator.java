package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeDecorator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ank";
		else
			return "net/minecraft/world/biome/BiomeDecorator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ank";
		else
			return "BiomeDecorator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lank;";
		else
			return "Lnet/minecraft/world/biome/BiomeDecorator;";
	}

	/**
	 * <p>
	 * Name: gravelOreGen
	 * </p>
	 */
	public static McObfPair field_76820_j = McMappingDatabase.getSRG("field_76820_j");

	/**
	 * <p>
	 * Name: treesPerChunk
	 * </p>
	 */
	public static McObfPair field_76832_z = McMappingDatabase.getSRG("field_76832_z");

	/**
	 * <p>
	 * Name: ironGen
	 * </p>
	 */
	public static McObfPair field_76818_l = McMappingDatabase.getSRG("field_76818_l");

	/**
	 * <p>
	 * Name: genStandardOre1
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V]
	 * </p>
	 */
	public static McObfPair func_76795_a = McMappingDatabase.getSRG("BiomeDecorator.func_76795_a");

	/**
	 * <p>
	 * Name: waterlilyGen
	 * </p>
	 */
	public static McObfPair field_76834_x = McMappingDatabase.getSRG("field_76834_x");

	/**
	 * <p>
	 * Name: generateFalls
	 * </p>
	 */
	public static McObfPair field_76808_K = McMappingDatabase.getSRG("field_76808_K");

	/**
	 * <p>
	 * Name: chunkProviderSettings
	 * </p>
	 */
	public static McObfPair field_180293_d = McMappingDatabase.getSRG("field_180293_d");

	/**
	 * <p>
	 * Name: waterlilyPerChunk
	 * </p>
	 */
	public static McObfPair field_76833_y = McMappingDatabase.getSRG("field_76833_y");

	/**
	 * <p>
	 * Name: graniteGen
	 * </p>
	 */
	public static McObfPair field_180296_j = McMappingDatabase.getSRG("field_180296_j");

	/**
	 * <p>
	 * Name: mushroomsPerChunk
	 * </p>
	 */
	public static McObfPair field_76798_D = McMappingDatabase.getSRG("field_76798_D");

	/**
	 * <p>
	 * Name: reedsPerChunk
	 * </p>
	 */
	public static McObfPair field_76799_E = McMappingDatabase.getSRG("field_76799_E");

	/**
	 * <p>
	 * Name: flowersPerChunk
	 * </p>
	 */
	public static McObfPair field_76802_A = McMappingDatabase.getSRG("field_76802_A");

	/**
	 * <p>
	 * Name: genDecorations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_150513_a = McMappingDatabase.getSRG("BiomeDecorator.func_150513_a");

	/**
	 * <p>
	 * Name: deadBushPerChunk
	 * </p>
	 */
	public static McObfPair field_76804_C = McMappingDatabase.getSRG("field_76804_C");

	/**
	 * <p>
	 * Name: andesiteGen
	 * </p>
	 */
	public static McObfPair field_180295_l = McMappingDatabase.getSRG("field_180295_l");

	/**
	 * <p>
	 * Name: lapisGen
	 * </p>
	 */
	public static McObfPair field_76831_p = McMappingDatabase.getSRG("field_76831_p");

	/**
	 * <p>
	 * Name: goldGen
	 * </p>
	 */
	public static McObfPair field_76819_m = McMappingDatabase.getSRG("field_76819_m");

	/**
	 * <p>
	 * Name: cactusGen
	 * </p>
	 */
	public static McObfPair field_76824_w = McMappingDatabase.getSRG("field_76824_w");

	/**
	 * <p>
	 * Name: diamondGen
	 * </p>
	 */
	public static McObfPair field_180298_q = McMappingDatabase.getSRG("field_180298_q");

	/**
	 * <p>
	 * Name: generateOres
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_76797_b = McMappingDatabase.getSRG("BiomeDecorator.func_76797_b");

	/**
	 * <p>
	 * Name: coalGen
	 * </p>
	 */
	public static McObfPair field_76821_k = McMappingDatabase.getSRG("field_76821_k");

	/**
	 * <p>
	 * Name: flowerGen
	 * </p>
	 */
	public static McObfPair field_150514_p = McMappingDatabase.getSRG("field_150514_p");

	/**
	 * <p>
	 * Name: chunkPos
	 * </p>
	 */
	public static McObfPair field_180294_c = McMappingDatabase.getSRG("field_180294_c");

	/**
	 * <p>
	 * Name: dirtGen
	 * </p>
	 */
	public static McObfPair field_76823_i = McMappingDatabase.getSRG("field_76823_i");

	/**
	 * <p>
	 * Name: grassPerChunk
	 * </p>
	 */
	public static McObfPair field_76803_B = McMappingDatabase.getSRG("field_76803_B");

	/**
	 * <p>
	 * Name: mushroomRedGen
	 * </p>
	 */
	public static McObfPair field_76827_t = McMappingDatabase.getSRG("field_76827_t");

	/**
	 * <p>
	 * Name: clayGen
	 * </p>
	 */
	public static McObfPair field_76809_f = McMappingDatabase.getSRG("field_76809_f");

	/**
	 * <p>
	 * Name: cactiPerChunk
	 * </p>
	 */
	public static McObfPair field_76800_F = McMappingDatabase.getSRG("field_76800_F");

	/**
	 * <p>
	 * Name: sandGen
	 * </p>
	 */
	public static McObfPair field_76810_g = McMappingDatabase.getSRG("field_76810_g");

	/**
	 * <p>
	 * Name: decorating
	 * </p>
	 */
	public static McObfPair field_185425_a = McMappingDatabase.getSRG("field_185425_a");

	/**
	 * <p>
	 * Name: bigMushroomsPerChunk
	 * </p>
	 */
	public static McObfPair field_76807_J = McMappingDatabase.getSRG("field_76807_J");

	/**
	 * <p>
	 * Name: bigMushroomGen
	 * </p>
	 */
	public static McObfPair field_76826_u = McMappingDatabase.getSRG("field_76826_u");

	/**
	 * <p>
	 * Name: decorate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/biome/Biome;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180292_a = McMappingDatabase.getSRG("BiomeDecorator.func_180292_a");

	/**
	 * <p>
	 * Name: dioriteGen
	 * </p>
	 */
	public static McObfPair field_180297_k = McMappingDatabase.getSRG("field_180297_k");

	/**
	 * <p>
	 * Name: extraTreeChance
	 * </p>
	 */
	public static McObfPair field_189870_A = McMappingDatabase.getSRG("field_189870_A");

	/**
	 * <p>
	 * Name: gravelGen
	 * </p>
	 */
	public static McObfPair field_76822_h = McMappingDatabase.getSRG("field_76822_h");

	/**
	 * <p>
	 * Name: gravelPatchesPerChunk
	 * </p>
	 */
	public static McObfPair field_76801_G = McMappingDatabase.getSRG("field_76801_G");

	/**
	 * <p>
	 * Name: genStandardOre2
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V]
	 * </p>
	 */
	public static McObfPair func_76793_b = McMappingDatabase.getSRG("BiomeDecorator.func_76793_b");

	/**
	 * <p>
	 * Name: sandPatchesPerChunk
	 * </p>
	 */
	public static McObfPair field_76805_H = McMappingDatabase.getSRG("field_76805_H");

	/**
	 * <p>
	 * Name: reedGen
	 * </p>
	 */
	public static McObfPair field_76825_v = McMappingDatabase.getSRG("field_76825_v");

	/**
	 * <p>
	 * Name: mushroomBrownGen
	 * </p>
	 */
	public static McObfPair field_76828_s = McMappingDatabase.getSRG("field_76828_s");

	/**
	 * <p>
	 * Name: clayPerChunk
	 * </p>
	 */
	public static McObfPair field_76806_I = McMappingDatabase.getSRG("field_76806_I");

	/**
	 * <p>
	 * Name: redstoneGen
	 * </p>
	 */
	public static McObfPair field_180299_p = McMappingDatabase.getSRG("field_180299_p");

}

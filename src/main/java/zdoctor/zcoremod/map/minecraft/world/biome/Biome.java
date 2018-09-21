package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Biome {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anh";
		else
			return "net/minecraft/world/biome/Biome";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anh";
		else
			return "Biome";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanh;";
		else
			return "Lnet/minecraft/world/biome/Biome;";
	}

	/**
	 * <p>
	 * Name: heightVariation
	 * </p>
	 */
	public static McObfPair field_76749_E = McMappingDatabase.getSRG("field_76749_E");

	/**
	 * <p>
	 * Name: getMutationForBiome
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/biome/Biome;)Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_185356_b = McMappingDatabase.getSRG("Biome.func_185356_b");

	/**
	 * <p>
	 * Name: SWAMP_FEATURE
	 * </p>
	 */
	public static McObfPair field_76763_Q = McMappingDatabase.getSRG("field_76763_Q");

	/**
	 * <p>
	 * Name: fillerBlock
	 * </p>
	 */
	public static McObfPair field_76753_B = McMappingDatabase.getSRG("field_76753_B");

	/**
	 * <p>
	 * Name: getWaterColor
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_185361_o = McMappingDatabase.getSRG("Biome.func_185361_o");

	/**
	 * <p>
	 * Name: getSpawningChance
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_76741_f = McMappingDatabase.getSRG("Biome.func_76741_f");

	/**
	 * <p>
	 * Name: temperature
	 * </p>
	 */
	public static McObfPair field_76750_F = McMappingDatabase.getSRG("field_76750_F");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_150586_aC = McMappingDatabase.getSRG("field_150586_aC");

	/**
	 * <p>
	 * Name: genTerrainBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/chunk/ChunkPrimer;IID)V]
	 * </p>
	 */
	public static McObfPair func_180622_a = McMappingDatabase.getSRG("Biome.func_180622_a");

	/**
	 * <p>
	 * Name: spawnableCaveCreatureList
	 * </p>
	 */
	public static McObfPair field_82914_M = McMappingDatabase.getSRG("field_82914_M");

	/**
	 * <p>
	 * Name: generateBiomeTerrain
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/chunk/ChunkPrimer;IID)V]
	 * </p>
	 */
	public static McObfPair func_180628_b = McMappingDatabase.getSRG("Biome.func_180628_b");

	/**
	 * <p>
	 * Name: pickRandomFlower
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockFlower$EnumFlowerType;]
	 * </p>
	 */
	public static McObfPair func_180623_a = McMappingDatabase.getSRG("Biome.func_180623_a");

	/**
	 * <p>
	 * Name: decorator
	 * </p>
	 */
	public static McObfPair field_76760_I = McMappingDatabase.getSRG("field_76760_I");

	/**
	 * <p>
	 * Name: SANDSTONE
	 * </p>
	 */
	public static McObfPair field_185370_f = McMappingDatabase.getSRG("field_185370_f");

	/**
	 * <p>
	 * Name: ICE
	 * </p>
	 */
	public static McObfPair field_185371_g = McMappingDatabase.getSRG("field_185371_g");

	/**
	 * <p>
	 * Name: getBiomeName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_185359_l = McMappingDatabase.getSRG("Biome.func_185359_l");

	/**
	 * <p>
	 * Name: isSnowyBiome
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150559_j = McMappingDatabase.getSRG("Biome.func_150559_j");

	/**
	 * <p>
	 * Name: decorate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180624_a = McMappingDatabase.getSRG("Biome.func_180624_a");

	/**
	 * <p>
	 * Name: getSpawnableList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EnumCreatureType;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_76747_a = McMappingDatabase.getSRG("Biome.func_76747_a");

	/**
	 * <p>
	 * Name: spawnableCreatureList
	 * </p>
	 */
	public static McObfPair field_76762_K = McMappingDatabase.getSRG("field_76762_K");

	/**
	 * <p>
	 * Name: rainfall
	 * </p>
	 */
	public static McObfPair field_76751_G = McMappingDatabase.getSRG("field_76751_G");

	/**
	 * <p>
	 * Name: BEDROCK
	 * </p>
	 */
	public static McObfPair field_185367_c = McMappingDatabase.getSRG("field_185367_c");

	/**
	 * <p>
	 * Name: spawnableWaterCreatureList
	 * </p>
	 */
	public static McObfPair field_76755_L = McMappingDatabase.getSRG("field_76755_L");

	/**
	 * <p>
	 * Name: getHeightVariation
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_185360_m = McMappingDatabase.getSRG("Biome.func_185360_m");

	/**
	 * <p>
	 * Name: getBiomeClass
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Class;]
	 * </p>
	 */
	public static McObfPair func_150562_l = McMappingDatabase.getSRG("Biome.func_150562_l");

	/**
	 * <p>
	 * Name: enableSnow
	 * </p>
	 */
	public static McObfPair field_76766_R = McMappingDatabase.getSRG("field_76766_R");

	/**
	 * <p>
	 * Name: getIdForBiome
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/biome/Biome;)I]
	 * </p>
	 */
	public static McObfPair func_185362_a = McMappingDatabase.getSRG("Biome.func_185362_a");

	/**
	 * <p>
	 * Name: topBlock
	 * </p>
	 */
	public static McObfPair field_76752_A = McMappingDatabase.getSRG("field_76752_A");

	/**
	 * <p>
	 * Name: GRASS_COLOR_NOISE
	 * </p>
	 */
	public static McObfPair field_180281_af = McMappingDatabase.getSRG("field_180281_af");

	/**
	 * <p>
	 * Name: spawnableMonsterList
	 * </p>
	 */
	public static McObfPair field_76761_J = McMappingDatabase.getSRG("field_76761_J");

	/**
	 * <p>
	 * Name: registerBiome
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;Lnet/minecraft/world/biome/Biome;)V]
	 * </p>
	 */
	public static McObfPair func_185354_a = McMappingDatabase.getSRG("Biome.func_185354_a");

	/**
	 * <p>
	 * Name: ignorePlayerSpawnSuitability
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185352_i = McMappingDatabase.getSRG("Biome.func_185352_i");

	/**
	 * <p>
	 * Name: getTemperature
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)F]
	 * </p>
	 */
	public static McObfPair func_180626_a = McMappingDatabase.getSRG("Biome.func_180626_a");

	/**
	 * <p>
	 * Name: canRain
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76738_d = McMappingDatabase.getSRG("Biome.func_76738_d");

	/**
	 * <p>
	 * Name: getDefaultTemperature
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_185353_n = McMappingDatabase.getSRG("Biome.func_185353_n");

	/**
	 * <p>
	 * Name: STONE
	 * </p>
	 */
	public static McObfPair field_185365_a = McMappingDatabase.getSRG("field_185365_a");

	/**
	 * <p>
	 * Name: getRandomTreeFeature
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;]
	 * </p>
	 */
	public static McObfPair func_150567_a = McMappingDatabase.getSRG("Biome.func_150567_a");

	/**
	 * <p>
	 * Name: BIG_TREE_FEATURE
	 * </p>
	 */
	public static McObfPair field_76758_O = McMappingDatabase.getSRG("field_76758_O");

	/**
	 * <p>
	 * Name: getBiomeForId
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_185357_a = McMappingDatabase.getSRG("Biome.func_185357_a");

	/**
	 * <p>
	 * Name: registerBiomes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_185358_q = McMappingDatabase.getSRG("Biome.func_185358_q");

	/**
	 * <p>
	 * Name: getBiome
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_150568_d = McMappingDatabase.getSRG("Biome.func_150568_d");

	/**
	 * <p>
	 * Name: RED_SANDSTONE
	 * </p>
	 */
	public static McObfPair field_185369_e = McMappingDatabase.getSRG("field_185369_e");

	/**
	 * <p>
	 * Name: AIR
	 * </p>
	 */
	public static McObfPair field_185366_b = McMappingDatabase.getSRG("field_185366_b");

	/**
	 * <p>
	 * Name: REGISTRY
	 * </p>
	 */
	public static McObfPair field_185377_q = McMappingDatabase.getSRG("field_185377_q");

	/**
	 * <p>
	 * Name: getFoliageColorAtPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_180625_c = McMappingDatabase.getSRG("Biome.func_180625_c");

	/**
	 * <p>
	 * Name: createBiomeDecorator
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/biome/BiomeDecorator;]
	 * </p>
	 */
	public static McObfPair func_76729_a = McMappingDatabase.getSRG("Biome.func_76729_a");

	/**
	 * <p>
	 * Name: isHighHumidity
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76736_e = McMappingDatabase.getSRG("Biome.func_76736_e");

	/**
	 * <p>
	 * Name: TEMPERATURE_NOISE
	 * </p>
	 */
	public static McObfPair field_150605_ac = McMappingDatabase.getSRG("field_150605_ac");

	/**
	 * <p>
	 * Name: baseHeight
	 * </p>
	 */
	public static McObfPair field_76748_D = McMappingDatabase.getSRG("field_76748_D");

	/**
	 * <p>
	 * Name: baseBiomeRegName
	 * </p>
	 */
	public static McObfPair field_185364_H = McMappingDatabase.getSRG("field_185364_H");

	/**
	 * <p>
	 * Name: getSkyColorByTemp
	 * </p>
	 * <p>
	 * Desc: [(F)I]
	 * </p>
	 */
	public static McObfPair func_76731_a = McMappingDatabase.getSRG("Biome.func_76731_a");

	/**
	 * <p>
	 * Name: biomeName
	 * </p>
	 */
	public static McObfPair field_76791_y = McMappingDatabase.getSRG("field_76791_y");

	/**
	 * <p>
	 * Name: isMutation
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185363_b = McMappingDatabase.getSRG("Biome.func_185363_b");

	/**
	 * <p>
	 * Name: getRandomWorldGenForGrass
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenerator;]
	 * </p>
	 */
	public static McObfPair func_76730_b = McMappingDatabase.getSRG("Biome.func_76730_b");

	/**
	 * <p>
	 * Name: getGrassColorAtPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_180627_b = McMappingDatabase.getSRG("Biome.func_180627_b");

	/**
	 * <p>
	 * Name: getTempCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/biome/Biome$TempCategory;]
	 * </p>
	 */
	public static McObfPair func_150561_m = McMappingDatabase.getSRG("Biome.func_150561_m");

	/**
	 * <p>
	 * Name: DOUBLE_PLANT_GENERATOR
	 * </p>
	 */
	public static McObfPair field_180280_ag = McMappingDatabase.getSRG("field_180280_ag");

	/**
	 * <p>
	 * Name: waterColor
	 * </p>
	 */
	public static McObfPair field_76759_H = McMappingDatabase.getSRG("field_76759_H");

	/**
	 * <p>
	 * Name: GRAVEL
	 * </p>
	 */
	public static McObfPair field_185368_d = McMappingDatabase.getSRG("field_185368_d");

	/**
	 * <p>
	 * Name: getBiome
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/world/biome/Biome;)Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_180276_a = McMappingDatabase.getSRG("Biome.func_180276_a");

	/**
	 * <p>
	 * Name: MUTATION_TO_BASE_ID_MAP
	 * </p>
	 */
	public static McObfPair field_185373_j = McMappingDatabase.getSRG("field_185373_j");

	/**
	 * <p>
	 * Name: TREE_FEATURE
	 * </p>
	 */
	public static McObfPair field_76757_N = McMappingDatabase.getSRG("field_76757_N");

	/**
	 * <p>
	 * Name: getEnableSnow
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76746_c = McMappingDatabase.getSRG("Biome.func_76746_c");

	/**
	 * <p>
	 * Name: getRainfall
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_76727_i = McMappingDatabase.getSRG("Biome.func_76727_i");

	/**
	 * <p>
	 * Name: getBaseHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_185355_j = McMappingDatabase.getSRG("Biome.func_185355_j");

	/**
	 * <p>
	 * Name: enableRain
	 * </p>
	 */
	public static McObfPair field_76765_S = McMappingDatabase.getSRG("field_76765_S");

	/**
	 * <p>
	 * Name: WATER
	 * </p>
	 */
	public static McObfPair field_185372_h = McMappingDatabase.getSRG("field_185372_h");

}

package zdoctor.zcoremod.map.minecraft.init;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Blocks {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aox";
		else
			return "net/minecraft/init/Blocks";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aox";
		else
			return "Blocks";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laox;";
		else
			return "Lnet/minecraft/init/Blocks;";
	}

	/**
	 * <p>
	 * Name: LEAVES
	 * </p>
	 */
	public static McObfPair field_150362_t = McMappingDatabase.getSRG("field_150362_t");

	/**
	 * <p>
	 * Name: OBSERVER
	 * </p>
	 */
	public static McObfPair field_190976_dk = McMappingDatabase.getSRG("field_190976_dk");

	/**
	 * <p>
	 * Name: STONE_PRESSURE_PLATE
	 * </p>
	 */
	public static McObfPair field_150456_au = McMappingDatabase.getSRG("field_150456_au");

	/**
	 * <p>
	 * Name: DETECTOR_RAIL
	 * </p>
	 */
	public static McObfPair field_150319_E = McMappingDatabase.getSRG("field_150319_E");

	/**
	 * <p>
	 * Name: FURNACE
	 * </p>
	 */
	public static McObfPair field_150460_al = McMappingDatabase.getSRG("field_150460_al");

	/**
	 * <p>
	 * Name: LIT_FURNACE
	 * </p>
	 */
	public static McObfPair field_150470_am = McMappingDatabase.getSRG("field_150470_am");

	/**
	 * <p>
	 * Name: UNPOWERED_COMPARATOR
	 * </p>
	 */
	public static McObfPair field_150441_bU = McMappingDatabase.getSRG("field_150441_bU");

	/**
	 * <p>
	 * Name: UNPOWERED_REPEATER
	 * </p>
	 */
	public static McObfPair field_150413_aR = McMappingDatabase.getSRG("field_150413_aR");

	/**
	 * <p>
	 * Name: PURPUR_STAIRS
	 * </p>
	 */
	public static McObfPair field_185769_cV = McMappingDatabase.getSRG("field_185769_cV");

	/**
	 * <p>
	 * Name: CYAN_GLAZED_TERRACOTTA
	 * </p>
	 */
	public static McObfPair field_192436_dK = McMappingDatabase.getSRG("field_192436_dK");

	/**
	 * <p>
	 * Name: BREWING_STAND
	 * </p>
	 */
	public static McObfPair field_150382_bo = McMappingDatabase.getSRG("field_150382_bo");

	/**
	 * <p>
	 * Name: FARMLAND
	 * </p>
	 */
	public static McObfPair field_150458_ak = McMappingDatabase.getSRG("field_150458_ak");

	/**
	 * <p>
	 * Name: JUNGLE_FENCE_GATE
	 * </p>
	 */
	public static McObfPair field_180386_br = McMappingDatabase.getSRG("field_180386_br");

	/**
	 * <p>
	 * Name: DOUBLE_STONE_SLAB
	 * </p>
	 */
	public static McObfPair field_150334_T = McMappingDatabase.getSRG("field_150334_T");

	/**
	 * <p>
	 * Name: GLOWSTONE
	 * </p>
	 */
	public static McObfPair field_150426_aN = McMappingDatabase.getSRG("field_150426_aN");

	/**
	 * <p>
	 * Name: PURPUR_PILLAR
	 * </p>
	 */
	public static McObfPair field_185768_cU = McMappingDatabase.getSRG("field_185768_cU");

	/**
	 * <p>
	 * Name: SPRUCE_FENCE_GATE
	 * </p>
	 */
	public static McObfPair field_180391_bp = McMappingDatabase.getSRG("field_180391_bp");

	/**
	 * <p>
	 * Name: DIAMOND_BLOCK
	 * </p>
	 */
	public static McObfPair field_150484_ah = McMappingDatabase.getSRG("field_150484_ah");

	/**
	 * <p>
	 * Name: CHORUS_PLANT
	 * </p>
	 */
	public static McObfPair field_185765_cR = McMappingDatabase.getSRG("field_185765_cR");

	/**
	 * <p>
	 * Name: AIR
	 * </p>
	 */
	public static McObfPair field_150350_a = McMappingDatabase.getSRG("field_150350_a");

	/**
	 * <p>
	 * Name: ACACIA_FENCE_GATE
	 * </p>
	 */
	public static McObfPair field_180387_bt = McMappingDatabase.getSRG("field_180387_bt");

	/**
	 * <p>
	 * Name: SANDSTONE_STAIRS
	 * </p>
	 */
	public static McObfPair field_150372_bz = McMappingDatabase.getSRG("field_150372_bz");

	/**
	 * <p>
	 * Name: DARK_OAK_DOOR
	 * </p>
	 */
	public static McObfPair field_180409_at = McMappingDatabase.getSRG("field_180409_at");

	/**
	 * <p>
	 * Name: SPRUCE_STAIRS
	 * </p>
	 */
	public static McObfPair field_150485_bF = McMappingDatabase.getSRG("field_150485_bF");

	/**
	 * <p>
	 * Name: WEB
	 * </p>
	 */
	public static McObfPair field_150321_G = McMappingDatabase.getSRG("field_150321_G");

	/**
	 * <p>
	 * Name: MELON_STEM
	 * </p>
	 */
	public static McObfPair field_150394_bc = McMappingDatabase.getSRG("field_150394_bc");

	/**
	 * <p>
	 * Name: LIT_REDSTONE_ORE
	 * </p>
	 */
	public static McObfPair field_150439_ay = McMappingDatabase.getSRG("field_150439_ay");

	/**
	 * <p>
	 * Name: SLIME_BLOCK
	 * </p>
	 */
	public static McObfPair field_180399_cE = McMappingDatabase.getSRG("field_180399_cE");

	/**
	 * <p>
	 * Name: PUMPKIN
	 * </p>
	 */
	public static McObfPair field_150423_aK = McMappingDatabase.getSRG("field_150423_aK");

	/**
	 * <p>
	 * Name: IRON_BARS
	 * </p>
	 */
	public static McObfPair field_150411_aY = McMappingDatabase.getSRG("field_150411_aY");

	/**
	 * <p>
	 * Name: ORANGE_SHULKER_BOX
	 * </p>
	 */
	public static McObfPair field_190978_dm = McMappingDatabase.getSRG("field_190978_dm");

	/**
	 * <p>
	 * Name: WATER
	 * </p>
	 */
	public static McObfPair field_150355_j = McMappingDatabase.getSRG("field_150355_j");

	/**
	 * <p>
	 * Name: COAL_ORE
	 * </p>
	 */
	public static McObfPair field_150365_q = McMappingDatabase.getSRG("field_150365_q");

	/**
	 * <p>
	 * Name: DIAMOND_ORE
	 * </p>
	 */
	public static McObfPair field_150482_ag = McMappingDatabase.getSRG("field_150482_ag");

	/**
	 * <p>
	 * Name: GLASS_PANE
	 * </p>
	 */
	public static McObfPair field_150410_aZ = McMappingDatabase.getSRG("field_150410_aZ");

	/**
	 * <p>
	 * Name: OAK_FENCE
	 * </p>
	 */
	public static McObfPair field_180407_aO = McMappingDatabase.getSRG("field_180407_aO");

	/**
	 * <p>
	 * Name: DOUBLE_WOODEN_SLAB
	 * </p>
	 */
	public static McObfPair field_150373_bw = McMappingDatabase.getSRG("field_150373_bw");

	/**
	 * <p>
	 * Name: JUKEBOX
	 * </p>
	 */
	public static McObfPair field_150421_aI = McMappingDatabase.getSRG("field_150421_aI");

	/**
	 * <p>
	 * Name: LIGHT_BLUE_GLAZED_TERRACOTTA
	 * </p>
	 */
	public static McObfPair field_192430_dE = McMappingDatabase.getSRG("field_192430_dE");

	/**
	 * <p>
	 * Name: GRAVEL
	 * </p>
	 */
	public static McObfPair field_150351_n = McMappingDatabase.getSRG("field_150351_n");

	/**
	 * <p>
	 * Name: GOLD_BLOCK
	 * </p>
	 */
	public static McObfPair field_150340_R = McMappingDatabase.getSRG("field_150340_R");

	/**
	 * <p>
	 * Name: SAPLING
	 * </p>
	 */
	public static McObfPair field_150345_g = McMappingDatabase.getSRG("field_150345_g");

	/**
	 * <p>
	 * Name: QUARTZ_STAIRS
	 * </p>
	 */
	public static McObfPair field_150370_cb = McMappingDatabase.getSRG("field_150370_cb");

	/**
	 * <p>
	 * Name: CHORUS_FLOWER
	 * </p>
	 */
	public static McObfPair field_185766_cS = McMappingDatabase.getSRG("field_185766_cS");

	/**
	 * <p>
	 * Name: CARROTS
	 * </p>
	 */
	public static McObfPair field_150459_bM = McMappingDatabase.getSRG("field_150459_bM");

	/**
	 * <p>
	 * Name: BOOKSHELF
	 * </p>
	 */
	public static McObfPair field_150342_X = McMappingDatabase.getSRG("field_150342_X");

	/**
	 * <p>
	 * Name: IRON_DOOR
	 * </p>
	 */
	public static McObfPair field_150454_av = McMappingDatabase.getSRG("field_150454_av");

	/**
	 * <p>
	 * Name: END_PORTAL_FRAME
	 * </p>
	 */
	public static McObfPair field_150378_br = McMappingDatabase.getSRG("field_150378_br");

	/**
	 * <p>
	 * Name: QUARTZ_BLOCK
	 * </p>
	 */
	public static McObfPair field_150371_ca = McMappingDatabase.getSRG("field_150371_ca");

	/**
	 * <p>
	 * Name: LOG
	 * </p>
	 */
	public static McObfPair field_150364_r = McMappingDatabase.getSRG("field_150364_r");

	/**
	 * <p>
	 * Name: SNOW_LAYER
	 * </p>
	 */
	public static McObfPair field_150431_aC = McMappingDatabase.getSRG("field_150431_aC");

	/**
	 * <p>
	 * Name: QUARTZ_ORE
	 * </p>
	 */
	public static McObfPair field_150449_bY = McMappingDatabase.getSRG("field_150449_bY");

	/**
	 * <p>
	 * Name: DEADBUSH
	 * </p>
	 */
	public static McObfPair field_150330_I = McMappingDatabase.getSRG("field_150330_I");

	/**
	 * <p>
	 * Name: WALL_SIGN
	 * </p>
	 */
	public static McObfPair field_150444_as = McMappingDatabase.getSRG("field_150444_as");

	/**
	 * <p>
	 * Name: PURPLE_GLAZED_TERRACOTTA
	 * </p>
	 */
	public static McObfPair field_192437_dL = McMappingDatabase.getSRG("field_192437_dL");

	/**
	 * <p>
	 * Name: PURPUR_DOUBLE_SLAB
	 * </p>
	 */
	public static McObfPair field_185770_cW = McMappingDatabase.getSRG("field_185770_cW");

	/**
	 * <p>
	 * Name: GREEN_SHULKER_BOX
	 * </p>
	 */
	public static McObfPair field_190990_dy = McMappingDatabase.getSRG("field_190990_dy");

	/**
	 * <p>
	 * Name: RED_MUSHROOM
	 * </p>
	 */
	public static McObfPair field_150337_Q = McMappingDatabase.getSRG("field_150337_Q");

	/**
	 * <p>
	 * Name: END_BRICKS
	 * </p>
	 */
	public static McObfPair field_185772_cY = McMappingDatabase.getSRG("field_185772_cY");

	/**
	 * <p>
	 * Name: CLAY
	 * </p>
	 */
	public static McObfPair field_150435_aG = McMappingDatabase.getSRG("field_150435_aG");

	/**
	 * <p>
	 * Name: CAULDRON
	 * </p>
	 */
	public static McObfPair field_150383_bp = McMappingDatabase.getSRG("field_150383_bp");

	/**
	 * <p>
	 * Name: CHEST
	 * </p>
	 */
	public static McObfPair field_150486_ae = McMappingDatabase.getSRG("field_150486_ae");

	/**
	 * <p>
	 * Name: BONE_BLOCK
	 * </p>
	 */
	public static McObfPair field_189880_di = McMappingDatabase.getSRG("field_189880_di");

	/**
	 * <p>
	 * Name: HEAVY_WEIGHTED_PRESSURE_PLATE
	 * </p>
	 */
	public static McObfPair field_150443_bT = McMappingDatabase.getSRG("field_150443_bT");

	/**
	 * <p>
	 * Name: GRAY_SHULKER_BOX
	 * </p>
	 */
	public static McObfPair field_190984_ds = McMappingDatabase.getSRG("field_190984_ds");

	/**
	 * <p>
	 * Name: TRAPPED_CHEST
	 * </p>
	 */
	public static McObfPair field_150447_bR = McMappingDatabase.getSRG("field_150447_bR");

	/**
	 * <p>
	 * Name: OAK_FENCE_GATE
	 * </p>
	 */
	public static McObfPair field_180390_bo = McMappingDatabase.getSRG("field_180390_bo");

	/**
	 * <p>
	 * Name: SPONGE
	 * </p>
	 */
	public static McObfPair field_150360_v = McMappingDatabase.getSRG("field_150360_v");

	/**
	 * <p>
	 * Name: GOLD_ORE
	 * </p>
	 */
	public static McObfPair field_150352_o = McMappingDatabase.getSRG("field_150352_o");

	/**
	 * <p>
	 * Name: DOUBLE_PLANT
	 * </p>
	 */
	public static McObfPair field_150398_cm = McMappingDatabase.getSRG("field_150398_cm");

	/**
	 * <p>
	 * Name: GLASS
	 * </p>
	 */
	public static McObfPair field_150359_w = McMappingDatabase.getSRG("field_150359_w");

	/**
	 * <p>
	 * Name: DAYLIGHT_DETECTOR_INVERTED
	 * </p>
	 */
	public static McObfPair field_180402_cm = McMappingDatabase.getSRG("field_180402_cm");

	/**
	 * <p>
	 * Name: CACTUS
	 * </p>
	 */
	public static McObfPair field_150434_aF = McMappingDatabase.getSRG("field_150434_aF");

	/**
	 * <p>
	 * Name: HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_150405_ch = McMappingDatabase.getSRG("field_150405_ch");

	/**
	 * <p>
	 * Name: WHITE_SHULKER_BOX
	 * </p>
	 */
	public static McObfPair field_190977_dl = McMappingDatabase.getSRG("field_190977_dl");

	/**
	 * <p>
	 * Name: WOODEN_BUTTON
	 * </p>
	 */
	public static McObfPair field_150471_bO = McMappingDatabase.getSRG("field_150471_bO");

	/**
	 * <p>
	 * Name: DAYLIGHT_DETECTOR
	 * </p>
	 */
	public static McObfPair field_150453_bW = McMappingDatabase.getSRG("field_150453_bW");

	/**
	 * <p>
	 * Name: PISTON_EXTENSION
	 * </p>
	 */
	public static McObfPair field_180384_M = McMappingDatabase.getSRG("field_180384_M");

	/**
	 * <p>
	 * Name: RED_MUSHROOM_BLOCK
	 * </p>
	 */
	public static McObfPair field_150419_aX = McMappingDatabase.getSRG("field_150419_aX");

	/**
	 * <p>
	 * Name: TNT
	 * </p>
	 */
	public static McObfPair field_150335_W = McMappingDatabase.getSRG("field_150335_W");

	/**
	 * <p>
	 * Name: SNOW
	 * </p>
	 */
	public static McObfPair field_150433_aE = McMappingDatabase.getSRG("field_150433_aE");

	/**
	 * <p>
	 * Name: STAINED_GLASS
	 * </p>
	 */
	public static McObfPair field_150399_cn = McMappingDatabase.getSRG("field_150399_cn");

	/**
	 * <p>
	 * Name: FIRE
	 * </p>
	 */
	public static McObfPair field_150480_ab = McMappingDatabase.getSRG("field_150480_ab");

	/**
	 * <p>
	 * Name: BROWN_MUSHROOM_BLOCK
	 * </p>
	 */
	public static McObfPair field_150420_aW = McMappingDatabase.getSRG("field_150420_aW");

	/**
	 * <p>
	 * Name: STANDING_SIGN
	 * </p>
	 */
	public static McObfPair field_150472_an = McMappingDatabase.getSRG("field_150472_an");

	/**
	 * <p>
	 * Name: IRON_BLOCK
	 * </p>
	 */
	public static McObfPair field_150339_S = McMappingDatabase.getSRG("field_150339_S");

	/**
	 * <p>
	 * Name: LOG2
	 * </p>
	 */
	public static McObfPair field_150363_s = McMappingDatabase.getSRG("field_150363_s");

	/**
	 * <p>
	 * Name: BROWN_SHULKER_BOX
	 * </p>
	 */
	public static McObfPair field_190989_dx = McMappingDatabase.getSRG("field_190989_dx");

	/**
	 * <p>
	 * Name: STAINED_GLASS_PANE
	 * </p>
	 */
	public static McObfPair field_150397_co = McMappingDatabase.getSRG("field_150397_co");

	/**
	 * <p>
	 * Name: COBBLESTONE_WALL
	 * </p>
	 */
	public static McObfPair field_150463_bK = McMappingDatabase.getSRG("field_150463_bK");

	/**
	 * <p>
	 * Name: SEA_LANTERN
	 * </p>
	 */
	public static McObfPair field_180398_cJ = McMappingDatabase.getSRG("field_180398_cJ");

	/**
	 * <p>
	 * Name: PURPUR_BLOCK
	 * </p>
	 */
	public static McObfPair field_185767_cT = McMappingDatabase.getSRG("field_185767_cT");

	/**
	 * <p>
	 * Name: MELON_BLOCK
	 * </p>
	 */
	public static McObfPair field_150440_ba = McMappingDatabase.getSRG("field_150440_ba");

	/**
	 * <p>
	 * Name: LIT_PUMPKIN
	 * </p>
	 */
	public static McObfPair field_150428_aP = McMappingDatabase.getSRG("field_150428_aP");

	/**
	 * <p>
	 * Name: RED_FLOWER
	 * </p>
	 */
	public static McObfPair field_150328_O = McMappingDatabase.getSRG("field_150328_O");

	/**
	 * <p>
	 * Name: WOODEN_PRESSURE_PLATE
	 * </p>
	 */
	public static McObfPair field_150452_aw = McMappingDatabase.getSRG("field_150452_aw");

	/**
	 * <p>
	 * Name: DARK_OAK_FENCE_GATE
	 * </p>
	 */
	public static McObfPair field_180385_bs = McMappingDatabase.getSRG("field_180385_bs");

	/**
	 * <p>
	 * Name: YELLOW_FLOWER
	 * </p>
	 */
	public static McObfPair field_150327_N = McMappingDatabase.getSRG("field_150327_N");

	/**
	 * <p>
	 * Name: CHAIN_COMMAND_BLOCK
	 * </p>
	 */
	public static McObfPair field_185777_dd = McMappingDatabase.getSRG("field_185777_dd");

	/**
	 * <p>
	 * Name: LIME_GLAZED_TERRACOTTA
	 * </p>
	 */
	public static McObfPair field_192432_dG = McMappingDatabase.getSRG("field_192432_dG");

	/**
	 * <p>
	 * Name: NETHER_WART
	 * </p>
	 */
	public static McObfPair field_150388_bm = McMappingDatabase.getSRG("field_150388_bm");

	/**
	 * <p>
	 * Name: MAGENTA_GLAZED_TERRACOTTA
	 * </p>
	 */
	public static McObfPair field_192429_dD = McMappingDatabase.getSRG("field_192429_dD");

	/**
	 * <p>
	 * Name: FROSTED_ICE
	 * </p>
	 */
	public static McObfPair field_185778_de = McMappingDatabase.getSRG("field_185778_de");

	/**
	 * <p>
	 * Name: FLOWING_WATER
	 * </p>
	 */
	public static McObfPair field_150358_i = McMappingDatabase.getSRG("field_150358_i");

	/**
	 * <p>
	 * Name: FLOWER_POT
	 * </p>
	 */
	public static McObfPair field_150457_bL = McMappingDatabase.getSRG("field_150457_bL");

	/**
	 * <p>
	 * Name: BLUE_GLAZED_TERRACOTTA
	 * </p>
	 */
	public static McObfPair field_192438_dM = McMappingDatabase.getSRG("field_192438_dM");

	/**
	 * <p>
	 * Name: BARRIER
	 * </p>
	 */
	public static McObfPair field_180401_cv = McMappingDatabase.getSRG("field_180401_cv");

	/**
	 * <p>
	 * Name: PORTAL
	 * </p>
	 */
	public static McObfPair field_150427_aO = McMappingDatabase.getSRG("field_150427_aO");

	/**
	 * <p>
	 * Name: NETHER_BRICK
	 * </p>
	 */
	public static McObfPair field_150385_bj = McMappingDatabase.getSRG("field_150385_bj");

	/**
	 * <p>
	 * Name: BIRCH_STAIRS
	 * </p>
	 */
	public static McObfPair field_150487_bG = McMappingDatabase.getSRG("field_150487_bG");

	/**
	 * <p>
	 * Name: JUNGLE_DOOR
	 * </p>
	 */
	public static McObfPair field_180411_ar = McMappingDatabase.getSRG("field_180411_ar");

	/**
	 * <p>
	 * Name: BIRCH_DOOR
	 * </p>
	 */
	public static McObfPair field_180412_aq = McMappingDatabase.getSRG("field_180412_aq");

	/**
	 * <p>
	 * Name: WOOL
	 * </p>
	 */
	public static McObfPair field_150325_L = McMappingDatabase.getSRG("field_150325_L");

	/**
	 * <p>
	 * Name: SPRUCE_DOOR
	 * </p>
	 */
	public static McObfPair field_180414_ap = McMappingDatabase.getSRG("field_180414_ap");

	/**
	 * <p>
	 * Name: NETHERRACK
	 * </p>
	 */
	public static McObfPair field_150424_aL = McMappingDatabase.getSRG("field_150424_aL");

	/**
	 * <p>
	 * Name: BLACK_SHULKER_BOX
	 * </p>
	 */
	public static McObfPair field_190975_dA = McMappingDatabase.getSRG("field_190975_dA");

	/**
	 * <p>
	 * Name: MOSSY_COBBLESTONE
	 * </p>
	 */
	public static McObfPair field_150341_Y = McMappingDatabase.getSRG("field_150341_Y");

	/**
	 * <p>
	 * Name: BLUE_SHULKER_BOX
	 * </p>
	 */
	public static McObfPair field_190988_dw = McMappingDatabase.getSRG("field_190988_dw");

	/**
	 * <p>
	 * Name: ICE
	 * </p>
	 */
	public static McObfPair field_150432_aD = McMappingDatabase.getSRG("field_150432_aD");

	/**
	 * <p>
	 * Name: VINE
	 * </p>
	 */
	public static McObfPair field_150395_bd = McMappingDatabase.getSRG("field_150395_bd");

	/**
	 * <p>
	 * Name: BIRCH_FENCE
	 * </p>
	 */
	public static McObfPair field_180404_aQ = McMappingDatabase.getSRG("field_180404_aQ");

	/**
	 * <p>
	 * Name: LAPIS_BLOCK
	 * </p>
	 */
	public static McObfPair field_150368_y = McMappingDatabase.getSRG("field_150368_y");

	/**
	 * <p>
	 * Name: EMERALD_ORE
	 * </p>
	 */
	public static McObfPair field_150412_bA = McMappingDatabase.getSRG("field_150412_bA");

	/**
	 * <p>
	 * Name: POWERED_COMPARATOR
	 * </p>
	 */
	public static McObfPair field_150455_bV = McMappingDatabase.getSRG("field_150455_bV");

	/**
	 * <p>
	 * Name: WALL_BANNER
	 * </p>
	 */
	public static McObfPair field_180394_cL = McMappingDatabase.getSRG("field_180394_cL");

	/**
	 * <p>
	 * Name: CRAFTING_TABLE
	 * </p>
	 */
	public static McObfPair field_150462_ai = McMappingDatabase.getSRG("field_150462_ai");

	/**
	 * <p>
	 * Name: RED_SANDSTONE_STAIRS
	 * </p>
	 */
	public static McObfPair field_180396_cN = McMappingDatabase.getSRG("field_180396_cN");

	/**
	 * <p>
	 * Name: STRUCTURE_BLOCK
	 * </p>
	 */
	public static McObfPair field_185779_df = McMappingDatabase.getSRG("field_185779_df");

	/**
	 * <p>
	 * Name: PLANKS
	 * </p>
	 */
	public static McObfPair field_150344_f = McMappingDatabase.getSRG("field_150344_f");

	/**
	 * <p>
	 * Name: OBSIDIAN
	 * </p>
	 */
	public static McObfPair field_150343_Z = McMappingDatabase.getSRG("field_150343_Z");

	/**
	 * <p>
	 * Name: LIT_REDSTONE_LAMP
	 * </p>
	 */
	public static McObfPair field_150374_bv = McMappingDatabase.getSRG("field_150374_bv");

	/**
	 * <p>
	 * Name: CACHE
	 * </p>
	 */
	public static McObfPair field_185780_dg = McMappingDatabase.getSRG("field_185780_dg");

	/**
	 * <p>
	 * Name: STAINED_HARDENED_CLAY
	 * </p>
	 */
	public static McObfPair field_150406_ce = McMappingDatabase.getSRG("field_150406_ce");

	/**
	 * <p>
	 * Name: DISPENSER
	 * </p>
	 */
	public static McObfPair field_150367_z = McMappingDatabase.getSRG("field_150367_z");

	/**
	 * <p>
	 * Name: JUNGLE_STAIRS
	 * </p>
	 */
	public static McObfPair field_150481_bH = McMappingDatabase.getSRG("field_150481_bH");

	/**
	 * <p>
	 * Name: STONE_BRICK_STAIRS
	 * </p>
	 */
	public static McObfPair field_150390_bg = McMappingDatabase.getSRG("field_150390_bg");

	/**
	 * <p>
	 * Name: NETHER_BRICK_STAIRS
	 * </p>
	 */
	public static McObfPair field_150387_bl = McMappingDatabase.getSRG("field_150387_bl");

	/**
	 * <p>
	 * Name: END_PORTAL
	 * </p>
	 */
	public static McObfPair field_150384_bq = McMappingDatabase.getSRG("field_150384_bq");

	/**
	 * <p>
	 * Name: PISTON_HEAD
	 * </p>
	 */
	public static McObfPair field_150332_K = McMappingDatabase.getSRG("field_150332_K");

	/**
	 * <p>
	 * Name: REDSTONE_ORE
	 * </p>
	 */
	public static McObfPair field_150450_ax = McMappingDatabase.getSRG("field_150450_ax");

	/**
	 * <p>
	 * Name: TORCH
	 * </p>
	 */
	public static McObfPair field_150478_aa = McMappingDatabase.getSRG("field_150478_aa");

	/**
	 * <p>
	 * Name: DRAGON_EGG
	 * </p>
	 */
	public static McObfPair field_150380_bt = McMappingDatabase.getSRG("field_150380_bt");

	/**
	 * <p>
	 * Name: IRON_TRAPDOOR
	 * </p>
	 */
	public static McObfPair field_180400_cw = McMappingDatabase.getSRG("field_180400_cw");

	/**
	 * <p>
	 * Name: RED_SANDSTONE
	 * </p>
	 */
	public static McObfPair field_180395_cM = McMappingDatabase.getSRG("field_180395_cM");

	/**
	 * <p>
	 * Name: SOUL_SAND
	 * </p>
	 */
	public static McObfPair field_150425_aM = McMappingDatabase.getSRG("field_150425_aM");

	/**
	 * <p>
	 * Name: END_STONE
	 * </p>
	 */
	public static McObfPair field_150377_bs = McMappingDatabase.getSRG("field_150377_bs");

	/**
	 * <p>
	 * Name: REPEATING_COMMAND_BLOCK
	 * </p>
	 */
	public static McObfPair field_185776_dc = McMappingDatabase.getSRG("field_185776_dc");

	/**
	 * <p>
	 * Name: DARK_OAK_FENCE
	 * </p>
	 */
	public static McObfPair field_180406_aS = McMappingDatabase.getSRG("field_180406_aS");

	/**
	 * <p>
	 * Name: UNLIT_REDSTONE_TORCH
	 * </p>
	 */
	public static McObfPair field_150437_az = McMappingDatabase.getSRG("field_150437_az");

	/**
	 * <p>
	 * Name: CONCRETE
	 * </p>
	 */
	public static McObfPair field_192443_dR = McMappingDatabase.getSRG("field_192443_dR");

	/**
	 * <p>
	 * Name: CONCRETE_POWDER
	 * </p>
	 */
	public static McObfPair field_192444_dS = McMappingDatabase.getSRG("field_192444_dS");

	/**
	 * <p>
	 * Name: ENDER_CHEST
	 * </p>
	 */
	public static McObfPair field_150477_bB = McMappingDatabase.getSRG("field_150477_bB");

	/**
	 * <p>
	 * Name: BEETROOTS
	 * </p>
	 */
	public static McObfPair field_185773_cZ = McMappingDatabase.getSRG("field_185773_cZ");

	/**
	 * <p>
	 * Name: STONE_BUTTON
	 * </p>
	 */
	public static McObfPair field_150430_aB = McMappingDatabase.getSRG("field_150430_aB");

	/**
	 * <p>
	 * Name: LAVA
	 * </p>
	 */
	public static McObfPair field_150353_l = McMappingDatabase.getSRG("field_150353_l");

	/**
	 * <p>
	 * Name: GREEN_GLAZED_TERRACOTTA
	 * </p>
	 */
	public static McObfPair field_192440_dO = McMappingDatabase.getSRG("field_192440_dO");

	/**
	 * <p>
	 * Name: ACACIA_FENCE
	 * </p>
	 */
	public static McObfPair field_180405_aT = McMappingDatabase.getSRG("field_180405_aT");

	/**
	 * <p>
	 * Name: OAK_DOOR
	 * </p>
	 */
	public static McObfPair field_180413_ao = McMappingDatabase.getSRG("field_180413_ao");

	/**
	 * <p>
	 * Name: JUNGLE_FENCE
	 * </p>
	 */
	public static McObfPair field_180403_aR = McMappingDatabase.getSRG("field_180403_aR");

	/**
	 * <p>
	 * Name: TALLGRASS
	 * </p>
	 */
	public static McObfPair field_150329_H = McMappingDatabase.getSRG("field_150329_H");

	/**
	 * <p>
	 * Name: BRICK_STAIRS
	 * </p>
	 */
	public static McObfPair field_150389_bf = McMappingDatabase.getSRG("field_150389_bf");

	/**
	 * <p>
	 * Name: RED_NETHER_BRICK
	 * </p>
	 */
	public static McObfPair field_189879_dh = McMappingDatabase.getSRG("field_189879_dh");

	/**
	 * <p>
	 * Name: PURPLE_SHULKER_BOX
	 * </p>
	 */
	public static McObfPair field_190987_dv = McMappingDatabase.getSRG("field_190987_dv");

	/**
	 * <p>
	 * Name: LIME_SHULKER_BOX
	 * </p>
	 */
	public static McObfPair field_190982_dq = McMappingDatabase.getSRG("field_190982_dq");

	/**
	 * <p>
	 * Name: MOB_SPAWNER
	 * </p>
	 */
	public static McObfPair field_150474_ac = McMappingDatabase.getSRG("field_150474_ac");

	/**
	 * <p>
	 * Name: STANDING_BANNER
	 * </p>
	 */
	public static McObfPair field_180393_cK = McMappingDatabase.getSRG("field_180393_cK");

	/**
	 * <p>
	 * Name: PUMPKIN_STEM
	 * </p>
	 */
	public static McObfPair field_150393_bb = McMappingDatabase.getSRG("field_150393_bb");

	/**
	 * <p>
	 * Name: PRISMARINE
	 * </p>
	 */
	public static McObfPair field_180397_cI = McMappingDatabase.getSRG("field_180397_cI");

	/**
	 * <p>
	 * Name: MONSTER_EGG
	 * </p>
	 */
	public static McObfPair field_150418_aU = McMappingDatabase.getSRG("field_150418_aU");

	/**
	 * <p>
	 * Name: WHEAT
	 * </p>
	 */
	public static McObfPair field_150464_aj = McMappingDatabase.getSRG("field_150464_aj");

	/**
	 * <p>
	 * Name: TRIPWIRE_HOOK
	 * </p>
	 */
	public static McObfPair field_150479_bC = McMappingDatabase.getSRG("field_150479_bC");

	/**
	 * <p>
	 * Name: WATERLILY
	 * </p>
	 */
	public static McObfPair field_150392_bi = McMappingDatabase.getSRG("field_150392_bi");

	/**
	 * <p>
	 * Name: OAK_STAIRS
	 * </p>
	 */
	public static McObfPair field_150476_ad = McMappingDatabase.getSRG("field_150476_ad");

	/**
	 * <p>
	 * Name: DROPPER
	 * </p>
	 */
	public static McObfPair field_150409_cd = McMappingDatabase.getSRG("field_150409_cd");

	/**
	 * <p>
	 * Name: LIGHT_BLUE_SHULKER_BOX
	 * </p>
	 */
	public static McObfPair field_190980_do = McMappingDatabase.getSRG("field_190980_do");

	/**
	 * <p>
	 * Name: REDSTONE_WIRE
	 * </p>
	 */
	public static McObfPair field_150488_af = McMappingDatabase.getSRG("field_150488_af");

	/**
	 * <p>
	 * Name: COCOA
	 * </p>
	 */
	public static McObfPair field_150375_by = McMappingDatabase.getSRG("field_150375_by");

	/**
	 * <p>
	 * Name: ACTIVATOR_RAIL
	 * </p>
	 */
	public static McObfPair field_150408_cc = McMappingDatabase.getSRG("field_150408_cc");

	/**
	 * <p>
	 * Name: PACKED_ICE
	 * </p>
	 */
	public static McObfPair field_150403_cj = McMappingDatabase.getSRG("field_150403_cj");

	/**
	 * <p>
	 * Name: ANVIL
	 * </p>
	 */
	public static McObfPair field_150467_bQ = McMappingDatabase.getSRG("field_150467_bQ");

	/**
	 * <p>
	 * Name: BIRCH_FENCE_GATE
	 * </p>
	 */
	public static McObfPair field_180392_bq = McMappingDatabase.getSRG("field_180392_bq");

	/**
	 * <p>
	 * Name: HOPPER
	 * </p>
	 */
	public static McObfPair field_150438_bZ = McMappingDatabase.getSRG("field_150438_bZ");

	/**
	 * <p>
	 * Name: STONE_SLAB2
	 * </p>
	 */
	public static McObfPair field_180389_cP = McMappingDatabase.getSRG("field_180389_cP");

	/**
	 * <p>
	 * Name: YELLOW_GLAZED_TERRACOTTA
	 * </p>
	 */
	public static McObfPair field_192431_dF = McMappingDatabase.getSRG("field_192431_dF");

	/**
	 * <p>
	 * Name: WHITE_GLAZED_TERRACOTTA
	 * </p>
	 */
	public static McObfPair field_192427_dB = McMappingDatabase.getSRG("field_192427_dB");

	/**
	 * <p>
	 * Name: MYCELIUM
	 * </p>
	 */
	public static McObfPair field_150391_bh = McMappingDatabase.getSRG("field_150391_bh");

	/**
	 * <p>
	 * Name: LAPIS_ORE
	 * </p>
	 */
	public static McObfPair field_150369_x = McMappingDatabase.getSRG("field_150369_x");

	/**
	 * <p>
	 * Name: STONE
	 * </p>
	 */
	public static McObfPair field_150348_b = McMappingDatabase.getSRG("field_150348_b");

	/**
	 * <p>
	 * Name: GRASS_PATH
	 * </p>
	 */
	public static McObfPair field_185774_da = McMappingDatabase.getSRG("field_185774_da");

	/**
	 * <p>
	 * Name: RED_GLAZED_TERRACOTTA
	 * </p>
	 */
	public static McObfPair field_192441_dP = McMappingDatabase.getSRG("field_192441_dP");

	/**
	 * <p>
	 * Name: STRUCTURE_VOID
	 * </p>
	 */
	public static McObfPair field_189881_dj = McMappingDatabase.getSRG("field_189881_dj");

	/**
	 * <p>
	 * Name: DIRT
	 * </p>
	 */
	public static McObfPair field_150346_d = McMappingDatabase.getSRG("field_150346_d");

	/**
	 * <p>
	 * Name: TRAPDOOR
	 * </p>
	 */
	public static McObfPair field_150415_aT = McMappingDatabase.getSRG("field_150415_aT");

	/**
	 * <p>
	 * Name: STONEBRICK
	 * </p>
	 */
	public static McObfPair field_150417_aV = McMappingDatabase.getSRG("field_150417_aV");

	/**
	 * <p>
	 * Name: GRASS
	 * </p>
	 */
	public static McObfPair field_150349_c = McMappingDatabase.getSRG("field_150349_c");

	/**
	 * <p>
	 * Name: CYAN_SHULKER_BOX
	 * </p>
	 */
	public static McObfPair field_190986_du = McMappingDatabase.getSRG("field_190986_du");

	/**
	 * <p>
	 * Name: STONE_SLAB
	 * </p>
	 */
	public static McObfPair field_150333_U = McMappingDatabase.getSRG("field_150333_U");

	/**
	 * <p>
	 * Name: HAY_BLOCK
	 * </p>
	 */
	public static McObfPair field_150407_cf = McMappingDatabase.getSRG("field_150407_cf");

	/**
	 * <p>
	 * Name: NETHER_WART_BLOCK
	 * </p>
	 */
	public static McObfPair field_189878_dg = McMappingDatabase.getSRG("field_189878_dg");

	/**
	 * <p>
	 * Name: ACACIA_STAIRS
	 * </p>
	 */
	public static McObfPair field_150400_ck = McMappingDatabase.getSRG("field_150400_ck");

	/**
	 * <p>
	 * Name: DOUBLE_STONE_SLAB2
	 * </p>
	 */
	public static McObfPair field_180388_cO = McMappingDatabase.getSRG("field_180388_cO");

	/**
	 * <p>
	 * Name: DARK_OAK_STAIRS
	 * </p>
	 */
	public static McObfPair field_150401_cl = McMappingDatabase.getSRG("field_150401_cl");

	/**
	 * <p>
	 * Name: RAIL
	 * </p>
	 */
	public static McObfPair field_150448_aq = McMappingDatabase.getSRG("field_150448_aq");

	/**
	 * <p>
	 * Name: STONE_STAIRS
	 * </p>
	 */
	public static McObfPair field_150446_ar = McMappingDatabase.getSRG("field_150446_ar");

	/**
	 * <p>
	 * Name: SAND
	 * </p>
	 */
	public static McObfPair field_150354_m = McMappingDatabase.getSRG("field_150354_m");

	/**
	 * <p>
	 * Name: LADDER
	 * </p>
	 */
	public static McObfPair field_150468_ap = McMappingDatabase.getSRG("field_150468_ap");

	/**
	 * <p>
	 * Name: IRON_ORE
	 * </p>
	 */
	public static McObfPair field_150366_p = McMappingDatabase.getSRG("field_150366_p");

	/**
	 * <p>
	 * Name: SANDSTONE
	 * </p>
	 */
	public static McObfPair field_150322_A = McMappingDatabase.getSRG("field_150322_A");

	/**
	 * <p>
	 * Name: PURPUR_SLAB
	 * </p>
	 */
	public static McObfPair field_185771_cX = McMappingDatabase.getSRG("field_185771_cX");

	/**
	 * <p>
	 * Name: PISTON
	 * </p>
	 */
	public static McObfPair field_150331_J = McMappingDatabase.getSRG("field_150331_J");

	/**
	 * <p>
	 * Name: END_ROD
	 * </p>
	 */
	public static McObfPair field_185764_cQ = McMappingDatabase.getSRG("field_185764_cQ");

	/**
	 * <p>
	 * Name: COAL_BLOCK
	 * </p>
	 */
	public static McObfPair field_150402_ci = McMappingDatabase.getSRG("field_150402_ci");

	/**
	 * <p>
	 * Name: REDSTONE_LAMP
	 * </p>
	 */
	public static McObfPair field_150379_bu = McMappingDatabase.getSRG("field_150379_bu");

	/**
	 * <p>
	 * Name: YELLOW_SHULKER_BOX
	 * </p>
	 */
	public static McObfPair field_190981_dp = McMappingDatabase.getSRG("field_190981_dp");

	/**
	 * <p>
	 * Name: COMMAND_BLOCK
	 * </p>
	 */
	public static McObfPair field_150483_bI = McMappingDatabase.getSRG("field_150483_bI");

	/**
	 * <p>
	 * Name: REDSTONE_TORCH
	 * </p>
	 */
	public static McObfPair field_150429_aA = McMappingDatabase.getSRG("field_150429_aA");

	/**
	 * <p>
	 * Name: NOTEBLOCK
	 * </p>
	 */
	public static McObfPair field_150323_B = McMappingDatabase.getSRG("field_150323_B");

	/**
	 * <p>
	 * Name: ORANGE_GLAZED_TERRACOTTA
	 * </p>
	 */
	public static McObfPair field_192428_dC = McMappingDatabase.getSRG("field_192428_dC");

	/**
	 * <p>
	 * Name: NETHER_BRICK_FENCE
	 * </p>
	 */
	public static McObfPair field_150386_bk = McMappingDatabase.getSRG("field_150386_bk");

	/**
	 * <p>
	 * Name: getRegisteredBlock
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_180383_a = McMappingDatabase.getSRG("Blocks.func_180383_a");

	/**
	 * <p>
	 * Name: RED_SHULKER_BOX
	 * </p>
	 */
	public static McObfPair field_190991_dz = McMappingDatabase.getSRG("field_190991_dz");

	/**
	 * <p>
	 * Name: BROWN_MUSHROOM
	 * </p>
	 */
	public static McObfPair field_150338_P = McMappingDatabase.getSRG("field_150338_P");

	/**
	 * <p>
	 * Name: FLOWING_LAVA
	 * </p>
	 */
	public static McObfPair field_150356_k = McMappingDatabase.getSRG("field_150356_k");

	/**
	 * <p>
	 * Name: TRIPWIRE
	 * </p>
	 */
	public static McObfPair field_150473_bD = McMappingDatabase.getSRG("field_150473_bD");

	/**
	 * <p>
	 * Name: REEDS
	 * </p>
	 */
	public static McObfPair field_150436_aH = McMappingDatabase.getSRG("field_150436_aH");

	/**
	 * <p>
	 * Name: EMERALD_BLOCK
	 * </p>
	 */
	public static McObfPair field_150475_bE = McMappingDatabase.getSRG("field_150475_bE");

	/**
	 * <p>
	 * Name: COBBLESTONE
	 * </p>
	 */
	public static McObfPair field_150347_e = McMappingDatabase.getSRG("field_150347_e");

	/**
	 * <p>
	 * Name: REDSTONE_BLOCK
	 * </p>
	 */
	public static McObfPair field_150451_bX = McMappingDatabase.getSRG("field_150451_bX");

	/**
	 * <p>
	 * Name: GOLDEN_RAIL
	 * </p>
	 */
	public static McObfPair field_150318_D = McMappingDatabase.getSRG("field_150318_D");

	/**
	 * <p>
	 * Name: POTATOES
	 * </p>
	 */
	public static McObfPair field_150469_bN = McMappingDatabase.getSRG("field_150469_bN");

	/**
	 * <p>
	 * Name: LIGHT_WEIGHTED_PRESSURE_PLATE
	 * </p>
	 */
	public static McObfPair field_150445_bS = McMappingDatabase.getSRG("field_150445_bS");

	/**
	 * <p>
	 * Name: BEDROCK
	 * </p>
	 */
	public static McObfPair field_150357_h = McMappingDatabase.getSRG("field_150357_h");

	/**
	 * <p>
	 * Name: PINK_SHULKER_BOX
	 * </p>
	 */
	public static McObfPair field_190983_dr = McMappingDatabase.getSRG("field_190983_dr");

	/**
	 * <p>
	 * Name: BROWN_GLAZED_TERRACOTTA
	 * </p>
	 */
	public static McObfPair field_192439_dN = McMappingDatabase.getSRG("field_192439_dN");

	/**
	 * <p>
	 * Name: SPRUCE_FENCE
	 * </p>
	 */
	public static McObfPair field_180408_aP = McMappingDatabase.getSRG("field_180408_aP");

	/**
	 * <p>
	 * Name: ENCHANTING_TABLE
	 * </p>
	 */
	public static McObfPair field_150381_bn = McMappingDatabase.getSRG("field_150381_bn");

	/**
	 * <p>
	 * Name: ACACIA_DOOR
	 * </p>
	 */
	public static McObfPair field_180410_as = McMappingDatabase.getSRG("field_180410_as");

	/**
	 * <p>
	 * Name: SILVER_GLAZED_TERRACOTTA
	 * </p>
	 */
	public static McObfPair field_192435_dJ = McMappingDatabase.getSRG("field_192435_dJ");

	/**
	 * <p>
	 * Name: BLACK_GLAZED_TERRACOTTA
	 * </p>
	 */
	public static McObfPair field_192442_dQ = McMappingDatabase.getSRG("field_192442_dQ");

	/**
	 * <p>
	 * Name: BEACON
	 * </p>
	 */
	public static McObfPair field_150461_bJ = McMappingDatabase.getSRG("field_150461_bJ");

	/**
	 * <p>
	 * Name: SKULL
	 * </p>
	 */
	public static McObfPair field_150465_bP = McMappingDatabase.getSRG("field_150465_bP");

	/**
	 * <p>
	 * Name: BRICK_BLOCK
	 * </p>
	 */
	public static McObfPair field_150336_V = McMappingDatabase.getSRG("field_150336_V");

	/**
	 * <p>
	 * Name: GRAY_GLAZED_TERRACOTTA
	 * </p>
	 */
	public static McObfPair field_192434_dI = McMappingDatabase.getSRG("field_192434_dI");

	/**
	 * <p>
	 * Name: POWERED_REPEATER
	 * </p>
	 */
	public static McObfPair field_150416_aS = McMappingDatabase.getSRG("field_150416_aS");

	/**
	 * <p>
	 * Name: STICKY_PISTON
	 * </p>
	 */
	public static McObfPair field_150320_F = McMappingDatabase.getSRG("field_150320_F");

	/**
	 * <p>
	 * Name: END_GATEWAY
	 * </p>
	 */
	public static McObfPair field_185775_db = McMappingDatabase.getSRG("field_185775_db");

	/**
	 * <p>
	 * Name: CARPET
	 * </p>
	 */
	public static McObfPair field_150404_cg = McMappingDatabase.getSRG("field_150404_cg");

	/**
	 * <p>
	 * Name: MAGENTA_SHULKER_BOX
	 * </p>
	 */
	public static McObfPair field_190979_dn = McMappingDatabase.getSRG("field_190979_dn");

	/**
	 * <p>
	 * Name: LEVER
	 * </p>
	 */
	public static McObfPair field_150442_at = McMappingDatabase.getSRG("field_150442_at");

	/**
	 * <p>
	 * Name: CAKE
	 * </p>
	 */
	public static McObfPair field_150414_aQ = McMappingDatabase.getSRG("field_150414_aQ");

	/**
	 * <p>
	 * Name: SILVER_SHULKER_BOX
	 * </p>
	 */
	public static McObfPair field_190985_dt = McMappingDatabase.getSRG("field_190985_dt");

	/**
	 * <p>
	 * Name: PINK_GLAZED_TERRACOTTA
	 * </p>
	 */
	public static McObfPair field_192433_dH = McMappingDatabase.getSRG("field_192433_dH");

	/**
	 * <p>
	 * Name: LEAVES2
	 * </p>
	 */
	public static McObfPair field_150361_u = McMappingDatabase.getSRG("field_150361_u");

	/**
	 * <p>
	 * Name: BED
	 * </p>
	 */
	public static McObfPair field_150324_C = McMappingDatabase.getSRG("field_150324_C");

	/**
	 * <p>
	 * Name: MAGMA
	 * </p>
	 */
	public static McObfPair field_189877_df = McMappingDatabase.getSRG("field_189877_df");

	/**
	 * <p>
	 * Name: WOODEN_SLAB
	 * </p>
	 */
	public static McObfPair field_150376_bx = McMappingDatabase.getSRG("field_150376_bx");

}

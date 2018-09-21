package zdoctor.zcoremod.map.minecraft.init;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Items {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "air";
		else
			return "net/minecraft/init/Items";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "air";
		else
			return "Items";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lair;";
		else
			return "Lnet/minecraft/init/Items;";
	}

	/**
	 * <p>
	 * Name: EGG
	 * </p>
	 */
	public static McObfPair field_151110_aK = McMappingDatabase.getSRG("field_151110_aK");

	/**
	 * <p>
	 * Name: getRegisteredItem
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_179554_a = McMappingDatabase.getSRG("Items.func_179554_a");

	/**
	 * <p>
	 * Name: BAKED_POTATO
	 * </p>
	 */
	public static McObfPair field_151168_bH = McMappingDatabase.getSRG("field_151168_bH");

	/**
	 * <p>
	 * Name: DARK_OAK_BOAT
	 * </p>
	 */
	public static McObfPair field_185154_aL = McMappingDatabase.getSRG("field_185154_aL");

	/**
	 * <p>
	 * Name: PUMPKIN_SEEDS
	 * </p>
	 */
	public static McObfPair field_151080_bb = McMappingDatabase.getSRG("field_151080_bb");

	/**
	 * <p>
	 * Name: DIAMOND_LEGGINGS
	 * </p>
	 */
	public static McObfPair field_151173_ae = McMappingDatabase.getSRG("field_151173_ae");

	/**
	 * <p>
	 * Name: BREAD
	 * </p>
	 */
	public static McObfPair field_151025_P = McMappingDatabase.getSRG("field_151025_P");

	/**
	 * <p>
	 * Name: CLAY_BALL
	 * </p>
	 */
	public static McObfPair field_151119_aD = McMappingDatabase.getSRG("field_151119_aD");

	/**
	 * <p>
	 * Name: LEAD
	 * </p>
	 */
	public static McObfPair field_151058_ca = McMappingDatabase.getSRG("field_151058_ca");

	/**
	 * <p>
	 * Name: SPAWN_EGG
	 * </p>
	 */
	public static McObfPair field_151063_bx = McMappingDatabase.getSRG("field_151063_bx");

	/**
	 * <p>
	 * Name: CHEST_MINECART
	 * </p>
	 */
	public static McObfPair field_151108_aI = McMappingDatabase.getSRG("field_151108_aI");

	/**
	 * <p>
	 * Name: ROTTEN_FLESH
	 * </p>
	 */
	public static McObfPair field_151078_bh = McMappingDatabase.getSRG("field_151078_bh");

	/**
	 * <p>
	 * Name: NETHERBRICK
	 * </p>
	 */
	public static McObfPair field_151130_bT = McMappingDatabase.getSRG("field_151130_bT");

	/**
	 * <p>
	 * Name: GOLDEN_APPLE
	 * </p>
	 */
	public static McObfPair field_151153_ao = McMappingDatabase.getSRG("field_151153_ao");

	/**
	 * <p>
	 * Name: LEATHER
	 * </p>
	 */
	public static McObfPair field_151116_aA = McMappingDatabase.getSRG("field_151116_aA");

	/**
	 * <p>
	 * Name: RABBIT_FOOT
	 * </p>
	 */
	public static McObfPair field_179556_br = McMappingDatabase.getSRG("field_179556_br");

	/**
	 * <p>
	 * Name: BLAZE_POWDER
	 * </p>
	 */
	public static McObfPair field_151065_br = McMappingDatabase.getSRG("field_151065_br");

	/**
	 * <p>
	 * Name: RECORD_WAIT
	 * </p>
	 */
	public static McObfPair field_151084_co = McMappingDatabase.getSRG("field_151084_co");

	/**
	 * <p>
	 * Name: SADDLE
	 * </p>
	 */
	public static McObfPair field_151141_av = McMappingDatabase.getSRG("field_151141_av");

	/**
	 * <p>
	 * Name: NETHER_STAR
	 * </p>
	 */
	public static McObfPair field_151156_bN = McMappingDatabase.getSRG("field_151156_bN");

	/**
	 * <p>
	 * Name: WRITABLE_BOOK
	 * </p>
	 */
	public static McObfPair field_151099_bA = McMappingDatabase.getSRG("field_151099_bA");

	/**
	 * <p>
	 * Name: STICK
	 * </p>
	 */
	public static McObfPair field_151055_y = McMappingDatabase.getSRG("field_151055_y");

	/**
	 * <p>
	 * Name: DIAMOND_BOOTS
	 * </p>
	 */
	public static McObfPair field_151175_af = McMappingDatabase.getSRG("field_151175_af");

	/**
	 * <p>
	 * Name: WOODEN_SHOVEL
	 * </p>
	 */
	public static McObfPair field_151038_n = McMappingDatabase.getSRG("field_151038_n");

	/**
	 * <p>
	 * Name: GOLDEN_HELMET
	 * </p>
	 */
	public static McObfPair field_151169_ag = McMappingDatabase.getSRG("field_151169_ag");

	/**
	 * <p>
	 * Name: ACACIA_BOAT
	 * </p>
	 */
	public static McObfPair field_185153_aK = McMappingDatabase.getSRG("field_185153_aK");

	/**
	 * <p>
	 * Name: WOODEN_AXE
	 * </p>
	 */
	public static McObfPair field_151053_p = McMappingDatabase.getSRG("field_151053_p");

	/**
	 * <p>
	 * Name: CARROT_ON_A_STICK
	 * </p>
	 */
	public static McObfPair field_151146_bM = McMappingDatabase.getSRG("field_151146_bM");

	/**
	 * <p>
	 * Name: SHEARS
	 * </p>
	 */
	public static McObfPair field_151097_aZ = McMappingDatabase.getSRG("field_151097_aZ");

	/**
	 * <p>
	 * Name: IRON_SWORD
	 * </p>
	 */
	public static McObfPair field_151040_l = McMappingDatabase.getSRG("field_151040_l");

	/**
	 * <p>
	 * Name: GOLDEN_SWORD
	 * </p>
	 */
	public static McObfPair field_151010_B = McMappingDatabase.getSRG("field_151010_B");

	/**
	 * <p>
	 * Name: FLINT
	 * </p>
	 */
	public static McObfPair field_151145_ak = McMappingDatabase.getSRG("field_151145_ak");

	/**
	 * <p>
	 * Name: END_CRYSTAL
	 * </p>
	 */
	public static McObfPair field_185158_cP = McMappingDatabase.getSRG("field_185158_cP");

	/**
	 * <p>
	 * Name: MINECART
	 * </p>
	 */
	public static McObfPair field_151143_au = McMappingDatabase.getSRG("field_151143_au");

	/**
	 * <p>
	 * Name: RABBIT_STEW
	 * </p>
	 */
	public static McObfPair field_179560_bq = McMappingDatabase.getSRG("field_179560_bq");

	/**
	 * <p>
	 * Name: RABBIT
	 * </p>
	 */
	public static McObfPair field_179558_bo = McMappingDatabase.getSRG("field_179558_bo");

	/**
	 * <p>
	 * Name: BOW
	 * </p>
	 */
	public static McObfPair field_151031_f = McMappingDatabase.getSRG("field_151031_f");

	/**
	 * <p>
	 * Name: ENDER_EYE
	 * </p>
	 */
	public static McObfPair field_151061_bv = McMappingDatabase.getSRG("field_151061_bv");

	/**
	 * <p>
	 * Name: COMPASS
	 * </p>
	 */
	public static McObfPair field_151111_aL = McMappingDatabase.getSRG("field_151111_aL");

	/**
	 * <p>
	 * Name: GOLD_NUGGET
	 * </p>
	 */
	public static McObfPair field_151074_bl = McMappingDatabase.getSRG("field_151074_bl");

	/**
	 * <p>
	 * Name: DIAMOND_HORSE_ARMOR
	 * </p>
	 */
	public static McObfPair field_151125_bZ = McMappingDatabase.getSRG("field_151125_bZ");

	/**
	 * <p>
	 * Name: FURNACE_MINECART
	 * </p>
	 */
	public static McObfPair field_151109_aJ = McMappingDatabase.getSRG("field_151109_aJ");

	/**
	 * <p>
	 * Name: GOLDEN_SHOVEL
	 * </p>
	 */
	public static McObfPair field_151011_C = McMappingDatabase.getSRG("field_151011_C");

	/**
	 * <p>
	 * Name: WHEAT_SEEDS
	 * </p>
	 */
	public static McObfPair field_151014_N = McMappingDatabase.getSRG("field_151014_N");

	/**
	 * <p>
	 * Name: EMERALD
	 * </p>
	 */
	public static McObfPair field_151166_bC = McMappingDatabase.getSRG("field_151166_bC");

	/**
	 * <p>
	 * Name: BREWING_STAND
	 * </p>
	 */
	public static McObfPair field_151067_bt = McMappingDatabase.getSRG("field_151067_bt");

	/**
	 * <p>
	 * Name: WATER_BUCKET
	 * </p>
	 */
	public static McObfPair field_151131_as = McMappingDatabase.getSRG("field_151131_as");

	/**
	 * <p>
	 * Name: RECORD_11
	 * </p>
	 */
	public static McObfPair field_151086_cn = McMappingDatabase.getSRG("field_151086_cn");

	/**
	 * <p>
	 * Name: LAVA_BUCKET
	 * </p>
	 */
	public static McObfPair field_151129_at = McMappingDatabase.getSRG("field_151129_at");

	/**
	 * <p>
	 * Name: CHORUS_FRUIT_POPPED
	 * </p>
	 */
	public static McObfPair field_185162_cT = McMappingDatabase.getSRG("field_185162_cT");

	/**
	 * <p>
	 * Name: PAINTING
	 * </p>
	 */
	public static McObfPair field_151159_an = McMappingDatabase.getSRG("field_151159_an");

	/**
	 * <p>
	 * Name: COOKIE
	 * </p>
	 */
	public static McObfPair field_151106_aX = McMappingDatabase.getSRG("field_151106_aX");

	/**
	 * <p>
	 * Name: BIRCH_DOOR
	 * </p>
	 */
	public static McObfPair field_179568_as = McMappingDatabase.getSRG("field_179568_as");

	/**
	 * <p>
	 * Name: KNOWLEDGE_BOOK
	 * </p>
	 */
	public static McObfPair field_192397_db = McMappingDatabase.getSRG("field_192397_db");

	/**
	 * <p>
	 * Name: GOLDEN_CHESTPLATE
	 * </p>
	 */
	public static McObfPair field_151171_ah = McMappingDatabase.getSRG("field_151171_ah");

	/**
	 * <p>
	 * Name: GLOWSTONE_DUST
	 * </p>
	 */
	public static McObfPair field_151114_aO = McMappingDatabase.getSRG("field_151114_aO");

	/**
	 * <p>
	 * Name: JUNGLE_BOAT
	 * </p>
	 */
	public static McObfPair field_185152_aJ = McMappingDatabase.getSRG("field_185152_aJ");

	/**
	 * <p>
	 * Name: GHAST_TEAR
	 * </p>
	 */
	public static McObfPair field_151073_bk = McMappingDatabase.getSRG("field_151073_bk");

	/**
	 * <p>
	 * Name: GOLD_INGOT
	 * </p>
	 */
	public static McObfPair field_151043_k = McMappingDatabase.getSRG("field_151043_k");

	/**
	 * <p>
	 * Name: ENDER_PEARL
	 * </p>
	 */
	public static McObfPair field_151079_bi = McMappingDatabase.getSRG("field_151079_bi");

	/**
	 * <p>
	 * Name: CHAINMAIL_HELMET
	 * </p>
	 */
	public static McObfPair field_151020_U = McMappingDatabase.getSRG("field_151020_U");

	/**
	 * <p>
	 * Name: IRON_HOE
	 * </p>
	 */
	public static McObfPair field_151019_K = McMappingDatabase.getSRG("field_151019_K");

	/**
	 * <p>
	 * Name: WOODEN_HOE
	 * </p>
	 */
	public static McObfPair field_151017_I = McMappingDatabase.getSRG("field_151017_I");

	/**
	 * <p>
	 * Name: PAPER
	 * </p>
	 */
	public static McObfPair field_151121_aF = McMappingDatabase.getSRG("field_151121_aF");

	/**
	 * <p>
	 * Name: POTIONITEM
	 * </p>
	 */
	public static McObfPair field_151068_bn = McMappingDatabase.getSRG("field_151068_bn");

	/**
	 * <p>
	 * Name: IRON_DOOR
	 * </p>
	 */
	public static McObfPair field_151139_aw = McMappingDatabase.getSRG("field_151139_aw");

	/**
	 * <p>
	 * Name: DIAMOND_SHOVEL
	 * </p>
	 */
	public static McObfPair field_151047_v = McMappingDatabase.getSRG("field_151047_v");

	/**
	 * <p>
	 * Name: FERMENTED_SPIDER_EYE
	 * </p>
	 */
	public static McObfPair field_151071_bq = McMappingDatabase.getSRG("field_151071_bq");

	/**
	 * <p>
	 * Name: COOKED_FISH
	 * </p>
	 */
	public static McObfPair field_179566_aV = McMappingDatabase.getSRG("field_179566_aV");

	/**
	 * <p>
	 * Name: STONE_SWORD
	 * </p>
	 */
	public static McObfPair field_151052_q = McMappingDatabase.getSRG("field_151052_q");

	/**
	 * <p>
	 * Name: RABBIT_HIDE
	 * </p>
	 */
	public static McObfPair field_179555_bs = McMappingDatabase.getSRG("field_179555_bs");

	/**
	 * <p>
	 * Name: FISHING_ROD
	 * </p>
	 */
	public static McObfPair field_151112_aM = McMappingDatabase.getSRG("field_151112_aM");

	/**
	 * <p>
	 * Name: SPRUCE_DOOR
	 * </p>
	 */
	public static McObfPair field_179569_ar = McMappingDatabase.getSRG("field_179569_ar");

	/**
	 * <p>
	 * Name: STONE_SHOVEL
	 * </p>
	 */
	public static McObfPair field_151051_r = McMappingDatabase.getSRG("field_151051_r");

	/**
	 * <p>
	 * Name: EXPERIENCE_BOTTLE
	 * </p>
	 */
	public static McObfPair field_151062_by = McMappingDatabase.getSRG("field_151062_by");

	/**
	 * <p>
	 * Name: IRON_PICKAXE
	 * </p>
	 */
	public static McObfPair field_151035_b = McMappingDatabase.getSRG("field_151035_b");

	/**
	 * <p>
	 * Name: CLOCK
	 * </p>
	 */
	public static McObfPair field_151113_aN = McMappingDatabase.getSRG("field_151113_aN");

	/**
	 * <p>
	 * Name: GOLDEN_LEGGINGS
	 * </p>
	 */
	public static McObfPair field_151149_ai = McMappingDatabase.getSRG("field_151149_ai");

	/**
	 * <p>
	 * Name: RECORD_BLOCKS
	 * </p>
	 */
	public static McObfPair field_151094_cf = McMappingDatabase.getSRG("field_151094_cf");

	/**
	 * <p>
	 * Name: ARMOR_STAND
	 * </p>
	 */
	public static McObfPair field_179565_cj = McMappingDatabase.getSRG("field_179565_cj");

	/**
	 * <p>
	 * Name: REDSTONE
	 * </p>
	 */
	public static McObfPair field_151137_ax = McMappingDatabase.getSRG("field_151137_ax");

	/**
	 * <p>
	 * Name: COOKED_RABBIT
	 * </p>
	 */
	public static McObfPair field_179559_bp = McMappingDatabase.getSRG("field_179559_bp");

	/**
	 * <p>
	 * Name: SUGAR
	 * </p>
	 */
	public static McObfPair field_151102_aT = McMappingDatabase.getSRG("field_151102_aT");

	/**
	 * <p>
	 * Name: BEETROOT
	 * </p>
	 */
	public static McObfPair field_185164_cV = McMappingDatabase.getSRG("field_185164_cV");

	/**
	 * <p>
	 * Name: BEEF
	 * </p>
	 */
	public static McObfPair field_151082_bd = McMappingDatabase.getSRG("field_151082_bd");

	/**
	 * <p>
	 * Name: SPLASH_POTION
	 * </p>
	 */
	public static McObfPair field_185155_bH = McMappingDatabase.getSRG("field_185155_bH");

	/**
	 * <p>
	 * Name: TOTEM_OF_UNDYING
	 * </p>
	 */
	public static McObfPair field_190929_cY = McMappingDatabase.getSRG("field_190929_cY");

	/**
	 * <p>
	 * Name: PORKCHOP
	 * </p>
	 */
	public static McObfPair field_151147_al = McMappingDatabase.getSRG("field_151147_al");

	/**
	 * <p>
	 * Name: STRING
	 * </p>
	 */
	public static McObfPair field_151007_F = McMappingDatabase.getSRG("field_151007_F");

	/**
	 * <p>
	 * Name: SNOWBALL
	 * </p>
	 */
	public static McObfPair field_151126_ay = McMappingDatabase.getSRG("field_151126_ay");

	/**
	 * <p>
	 * Name: DRAGON_BREATH
	 * </p>
	 */
	public static McObfPair field_185157_bK = McMappingDatabase.getSRG("field_185157_bK");

	/**
	 * <p>
	 * Name: APPLE
	 * </p>
	 */
	public static McObfPair field_151034_e = McMappingDatabase.getSRG("field_151034_e");

	/**
	 * <p>
	 * Name: SKULL
	 * </p>
	 */
	public static McObfPair field_151144_bL = McMappingDatabase.getSRG("field_151144_bL");

	/**
	 * <p>
	 * Name: DIAMOND_PICKAXE
	 * </p>
	 */
	public static McObfPair field_151046_w = McMappingDatabase.getSRG("field_151046_w");

	/**
	 * <p>
	 * Name: GOLDEN_PICKAXE
	 * </p>
	 */
	public static McObfPair field_151005_D = McMappingDatabase.getSRG("field_151005_D");

	/**
	 * <p>
	 * Name: COOKED_MUTTON
	 * </p>
	 */
	public static McObfPair field_179557_bn = McMappingDatabase.getSRG("field_179557_bn");

	/**
	 * <p>
	 * Name: RECORD_MALL
	 * </p>
	 */
	public static McObfPair field_151089_ci = McMappingDatabase.getSRG("field_151089_ci");

	/**
	 * <p>
	 * Name: RECORD_STAL
	 * </p>
	 */
	public static McObfPair field_151087_ck = McMappingDatabase.getSRG("field_151087_ck");

	/**
	 * <p>
	 * Name: POTATO
	 * </p>
	 */
	public static McObfPair field_151174_bG = McMappingDatabase.getSRG("field_151174_bG");

	/**
	 * <p>
	 * Name: BUCKET
	 * </p>
	 */
	public static McObfPair field_151133_ar = McMappingDatabase.getSRG("field_151133_ar");

	/**
	 * <p>
	 * Name: BRICK
	 * </p>
	 */
	public static McObfPair field_151118_aC = McMappingDatabase.getSRG("field_151118_aC");

	/**
	 * <p>
	 * Name: WRITTEN_BOOK
	 * </p>
	 */
	public static McObfPair field_151164_bB = McMappingDatabase.getSRG("field_151164_bB");

	/**
	 * <p>
	 * Name: IRON_LEGGINGS
	 * </p>
	 */
	public static McObfPair field_151165_aa = McMappingDatabase.getSRG("field_151165_aa");

	/**
	 * <p>
	 * Name: BIRCH_BOAT
	 * </p>
	 */
	public static McObfPair field_185151_aI = McMappingDatabase.getSRG("field_185151_aI");

	/**
	 * <p>
	 * Name: BOWL
	 * </p>
	 */
	public static McObfPair field_151054_z = McMappingDatabase.getSRG("field_151054_z");

	/**
	 * <p>
	 * Name: FIREWORKS
	 * </p>
	 */
	public static McObfPair field_151152_bP = McMappingDatabase.getSRG("field_151152_bP");

	/**
	 * <p>
	 * Name: RECORD_STRAD
	 * </p>
	 */
	public static McObfPair field_151088_cl = McMappingDatabase.getSRG("field_151088_cl");

	/**
	 * <p>
	 * Name: PUMPKIN_PIE
	 * </p>
	 */
	public static McObfPair field_151158_bO = McMappingDatabase.getSRG("field_151158_bO");

	/**
	 * <p>
	 * Name: REEDS
	 * </p>
	 */
	public static McObfPair field_151120_aE = McMappingDatabase.getSRG("field_151120_aE");

	/**
	 * <p>
	 * Name: PRISMARINE_SHARD
	 * </p>
	 */
	public static McObfPair field_179562_cC = McMappingDatabase.getSRG("field_179562_cC");

	/**
	 * <p>
	 * Name: SIGN
	 * </p>
	 */
	public static McObfPair field_151155_ap = McMappingDatabase.getSRG("field_151155_ap");

	/**
	 * <p>
	 * Name: GUNPOWDER
	 * </p>
	 */
	public static McObfPair field_151016_H = McMappingDatabase.getSRG("field_151016_H");

	/**
	 * <p>
	 * Name: AIR
	 * </p>
	 */
	public static McObfPair field_190931_a = McMappingDatabase.getSRG("field_190931_a");

	/**
	 * <p>
	 * Name: BOOK
	 * </p>
	 */
	public static McObfPair field_151122_aG = McMappingDatabase.getSRG("field_151122_aG");

	/**
	 * <p>
	 * Name: RECORD_FAR
	 * </p>
	 */
	public static McObfPair field_151092_ch = McMappingDatabase.getSRG("field_151092_ch");

	/**
	 * <p>
	 * Name: BONE
	 * </p>
	 */
	public static McObfPair field_151103_aS = McMappingDatabase.getSRG("field_151103_aS");

	/**
	 * <p>
	 * Name: DIAMOND_HOE
	 * </p>
	 */
	public static McObfPair field_151012_L = McMappingDatabase.getSRG("field_151012_L");

	/**
	 * <p>
	 * Name: BEETROOT_SOUP
	 * </p>
	 */
	public static McObfPair field_185165_cW = McMappingDatabase.getSRG("field_185165_cW");

	/**
	 * <p>
	 * Name: LEATHER_CHESTPLATE
	 * </p>
	 */
	public static McObfPair field_151027_R = McMappingDatabase.getSRG("field_151027_R");

	/**
	 * <p>
	 * Name: IRON_CHESTPLATE
	 * </p>
	 */
	public static McObfPair field_151030_Z = McMappingDatabase.getSRG("field_151030_Z");

	/**
	 * <p>
	 * Name: SPECTRAL_ARROW
	 * </p>
	 */
	public static McObfPair field_185166_h = McMappingDatabase.getSRG("field_185166_h");

	/**
	 * <p>
	 * Name: BEETROOT_SEEDS
	 * </p>
	 */
	public static McObfPair field_185163_cU = McMappingDatabase.getSRG("field_185163_cU");

	/**
	 * <p>
	 * Name: ELYTRA
	 * </p>
	 */
	public static McObfPair field_185160_cR = McMappingDatabase.getSRG("field_185160_cR");

	/**
	 * <p>
	 * Name: CAKE
	 * </p>
	 */
	public static McObfPair field_151105_aU = McMappingDatabase.getSRG("field_151105_aU");

	/**
	 * <p>
	 * Name: STONE_HOE
	 * </p>
	 */
	public static McObfPair field_151018_J = McMappingDatabase.getSRG("field_151018_J");

	/**
	 * <p>
	 * Name: OAK_DOOR
	 * </p>
	 */
	public static McObfPair field_179570_aq = McMappingDatabase.getSRG("field_179570_aq");

	/**
	 * <p>
	 * Name: BED
	 * </p>
	 */
	public static McObfPair field_151104_aV = McMappingDatabase.getSRG("field_151104_aV");

	/**
	 * <p>
	 * Name: TNT_MINECART
	 * </p>
	 */
	public static McObfPair field_151142_bV = McMappingDatabase.getSRG("field_151142_bV");

	/**
	 * <p>
	 * Name: DYE
	 * </p>
	 */
	public static McObfPair field_151100_aR = McMappingDatabase.getSRG("field_151100_aR");

	/**
	 * <p>
	 * Name: DIAMOND_HELMET
	 * </p>
	 */
	public static McObfPair field_151161_ac = McMappingDatabase.getSRG("field_151161_ac");

	/**
	 * <p>
	 * Name: RECORD_CAT
	 * </p>
	 */
	public static McObfPair field_151093_ce = McMappingDatabase.getSRG("field_151093_ce");

	/**
	 * <p>
	 * Name: BLAZE_ROD
	 * </p>
	 */
	public static McObfPair field_151072_bj = McMappingDatabase.getSRG("field_151072_bj");

	/**
	 * <p>
	 * Name: LEATHER_HELMET
	 * </p>
	 */
	public static McObfPair field_151024_Q = McMappingDatabase.getSRG("field_151024_Q");

	/**
	 * <p>
	 * Name: CAULDRON
	 * </p>
	 */
	public static McObfPair field_151066_bu = McMappingDatabase.getSRG("field_151066_bu");

	/**
	 * <p>
	 * Name: DARK_OAK_DOOR
	 * </p>
	 */
	public static McObfPair field_179571_av = McMappingDatabase.getSRG("field_179571_av");

	/**
	 * <p>
	 * Name: ITEM_FRAME
	 * </p>
	 */
	public static McObfPair field_151160_bD = McMappingDatabase.getSRG("field_151160_bD");

	/**
	 * <p>
	 * Name: NAME_TAG
	 * </p>
	 */
	public static McObfPair field_151057_cb = McMappingDatabase.getSRG("field_151057_cb");

	/**
	 * <p>
	 * Name: MELON
	 * </p>
	 */
	public static McObfPair field_151127_ba = McMappingDatabase.getSRG("field_151127_ba");

	/**
	 * <p>
	 * Name: WHEAT
	 * </p>
	 */
	public static McObfPair field_151015_O = McMappingDatabase.getSRG("field_151015_O");

	/**
	 * <p>
	 * Name: BOAT
	 * </p>
	 */
	public static McObfPair field_151124_az = McMappingDatabase.getSRG("field_151124_az");

	/**
	 * <p>
	 * Name: DIAMOND_SWORD
	 * </p>
	 */
	public static McObfPair field_151048_u = McMappingDatabase.getSRG("field_151048_u");

	/**
	 * <p>
	 * Name: SHIELD
	 * </p>
	 */
	public static McObfPair field_185159_cQ = McMappingDatabase.getSRG("field_185159_cQ");

	/**
	 * <p>
	 * Name: MUSHROOM_STEW
	 * </p>
	 */
	public static McObfPair field_151009_A = McMappingDatabase.getSRG("field_151009_A");

	/**
	 * <p>
	 * Name: RECORD_13
	 * </p>
	 */
	public static McObfPair field_151096_cd = McMappingDatabase.getSRG("field_151096_cd");

	/**
	 * <p>
	 * Name: FIRE_CHARGE
	 * </p>
	 */
	public static McObfPair field_151059_bz = McMappingDatabase.getSRG("field_151059_bz");

	/**
	 * <p>
	 * Name: SPIDER_EYE
	 * </p>
	 */
	public static McObfPair field_151070_bp = McMappingDatabase.getSRG("field_151070_bp");

	/**
	 * <p>
	 * Name: FILLED_MAP
	 * </p>
	 */
	public static McObfPair field_151098_aY = McMappingDatabase.getSRG("field_151098_aY");

	/**
	 * <p>
	 * Name: MAP
	 * </p>
	 */
	public static McObfPair field_151148_bJ = McMappingDatabase.getSRG("field_151148_bJ");

	/**
	 * <p>
	 * Name: WOODEN_SWORD
	 * </p>
	 */
	public static McObfPair field_151041_m = McMappingDatabase.getSRG("field_151041_m");

	/**
	 * <p>
	 * Name: DIAMOND_CHESTPLATE
	 * </p>
	 */
	public static McObfPair field_151163_ad = McMappingDatabase.getSRG("field_151163_ad");

	/**
	 * <p>
	 * Name: RECORD_MELLOHI
	 * </p>
	 */
	public static McObfPair field_151090_cj = McMappingDatabase.getSRG("field_151090_cj");

	/**
	 * <p>
	 * Name: FLOWER_POT
	 * </p>
	 */
	public static McObfPair field_151162_bE = McMappingDatabase.getSRG("field_151162_bE");

	/**
	 * <p>
	 * Name: NETHER_WART
	 * </p>
	 */
	public static McObfPair field_151075_bm = McMappingDatabase.getSRG("field_151075_bm");

	/**
	 * <p>
	 * Name: WOODEN_PICKAXE
	 * </p>
	 */
	public static McObfPair field_151039_o = McMappingDatabase.getSRG("field_151039_o");

	/**
	 * <p>
	 * Name: MAGMA_CREAM
	 * </p>
	 */
	public static McObfPair field_151064_bs = McMappingDatabase.getSRG("field_151064_bs");

	/**
	 * <p>
	 * Name: IRON_INGOT
	 * </p>
	 */
	public static McObfPair field_151042_j = McMappingDatabase.getSRG("field_151042_j");

	/**
	 * <p>
	 * Name: COMPARATOR
	 * </p>
	 */
	public static McObfPair field_151132_bS = McMappingDatabase.getSRG("field_151132_bS");

	/**
	 * <p>
	 * Name: LEATHER_BOOTS
	 * </p>
	 */
	public static McObfPair field_151021_T = McMappingDatabase.getSRG("field_151021_T");

	/**
	 * <p>
	 * Name: SPRUCE_BOAT
	 * </p>
	 */
	public static McObfPair field_185150_aH = McMappingDatabase.getSRG("field_185150_aH");

	/**
	 * <p>
	 * Name: GOLDEN_HOE
	 * </p>
	 */
	public static McObfPair field_151013_M = McMappingDatabase.getSRG("field_151013_M");

	/**
	 * <p>
	 * Name: GOLDEN_HORSE_ARMOR
	 * </p>
	 */
	public static McObfPair field_151136_bY = McMappingDatabase.getSRG("field_151136_bY");

	/**
	 * <p>
	 * Name: CHORUS_FRUIT
	 * </p>
	 */
	public static McObfPair field_185161_cS = McMappingDatabase.getSRG("field_185161_cS");

	/**
	 * <p>
	 * Name: GOLDEN_CARROT
	 * </p>
	 */
	public static McObfPair field_151150_bK = McMappingDatabase.getSRG("field_151150_bK");

	/**
	 * <p>
	 * Name: JUNGLE_DOOR
	 * </p>
	 */
	public static McObfPair field_179567_at = McMappingDatabase.getSRG("field_179567_at");

	/**
	 * <p>
	 * Name: SHULKER_SHELL
	 * </p>
	 */
	public static McObfPair field_190930_cZ = McMappingDatabase.getSRG("field_190930_cZ");

	/**
	 * <p>
	 * Name: STONE_PICKAXE
	 * </p>
	 */
	public static McObfPair field_151050_s = McMappingDatabase.getSRG("field_151050_s");

	/**
	 * <p>
	 * Name: IRON_HELMET
	 * </p>
	 */
	public static McObfPair field_151028_Y = McMappingDatabase.getSRG("field_151028_Y");

	/**
	 * <p>
	 * Name: FLINT_AND_STEEL
	 * </p>
	 */
	public static McObfPair field_151033_d = McMappingDatabase.getSRG("field_151033_d");

	/**
	 * <p>
	 * Name: COAL
	 * </p>
	 */
	public static McObfPair field_151044_h = McMappingDatabase.getSRG("field_151044_h");

	/**
	 * <p>
	 * Name: COMMAND_BLOCK_MINECART
	 * </p>
	 */
	public static McObfPair field_151095_cc = McMappingDatabase.getSRG("field_151095_cc");

	/**
	 * <p>
	 * Name: QUARTZ
	 * </p>
	 */
	public static McObfPair field_151128_bU = McMappingDatabase.getSRG("field_151128_bU");

	/**
	 * <p>
	 * Name: IRON_AXE
	 * </p>
	 */
	public static McObfPair field_151036_c = McMappingDatabase.getSRG("field_151036_c");

	/**
	 * <p>
	 * Name: HOPPER_MINECART
	 * </p>
	 */
	public static McObfPair field_151140_bW = McMappingDatabase.getSRG("field_151140_bW");

	/**
	 * <p>
	 * Name: DIAMOND
	 * </p>
	 */
	public static McObfPair field_151045_i = McMappingDatabase.getSRG("field_151045_i");

	/**
	 * <p>
	 * Name: ENCHANTED_BOOK
	 * </p>
	 */
	public static McObfPair field_151134_bR = McMappingDatabase.getSRG("field_151134_bR");

	/**
	 * <p>
	 * Name: CHAINMAIL_LEGGINGS
	 * </p>
	 */
	public static McObfPair field_151022_W = McMappingDatabase.getSRG("field_151022_W");

	/**
	 * <p>
	 * Name: COOKED_CHICKEN
	 * </p>
	 */
	public static McObfPair field_151077_bg = McMappingDatabase.getSRG("field_151077_bg");

	/**
	 * <p>
	 * Name: SLIME_BALL
	 * </p>
	 */
	public static McObfPair field_151123_aH = McMappingDatabase.getSRG("field_151123_aH");

	/**
	 * <p>
	 * Name: RECORD_CHIRP
	 * </p>
	 */
	public static McObfPair field_151091_cg = McMappingDatabase.getSRG("field_151091_cg");

	/**
	 * <p>
	 * Name: CHICKEN
	 * </p>
	 */
	public static McObfPair field_151076_bf = McMappingDatabase.getSRG("field_151076_bf");

	/**
	 * <p>
	 * Name: RECORD_WARD
	 * </p>
	 */
	public static McObfPair field_151085_cm = McMappingDatabase.getSRG("field_151085_cm");

	/**
	 * <p>
	 * Name: FEATHER
	 * </p>
	 */
	public static McObfPair field_151008_G = McMappingDatabase.getSRG("field_151008_G");

	/**
	 * <p>
	 * Name: SPECKLED_MELON
	 * </p>
	 */
	public static McObfPair field_151060_bw = McMappingDatabase.getSRG("field_151060_bw");

	/**
	 * <p>
	 * Name: STONE_AXE
	 * </p>
	 */
	public static McObfPair field_151049_t = McMappingDatabase.getSRG("field_151049_t");

	/**
	 * <p>
	 * Name: LEATHER_LEGGINGS
	 * </p>
	 */
	public static McObfPair field_151026_S = McMappingDatabase.getSRG("field_151026_S");

	/**
	 * <p>
	 * Name: COOKED_PORKCHOP
	 * </p>
	 */
	public static McObfPair field_151157_am = McMappingDatabase.getSRG("field_151157_am");

	/**
	 * <p>
	 * Name: IRON_BOOTS
	 * </p>
	 */
	public static McObfPair field_151167_ab = McMappingDatabase.getSRG("field_151167_ab");

	/**
	 * <p>
	 * Name: MELON_SEEDS
	 * </p>
	 */
	public static McObfPair field_151081_bc = McMappingDatabase.getSRG("field_151081_bc");

	/**
	 * <p>
	 * Name: FIREWORK_CHARGE
	 * </p>
	 */
	public static McObfPair field_151154_bQ = McMappingDatabase.getSRG("field_151154_bQ");

	/**
	 * <p>
	 * Name: CHAINMAIL_CHESTPLATE
	 * </p>
	 */
	public static McObfPair field_151023_V = McMappingDatabase.getSRG("field_151023_V");

	/**
	 * <p>
	 * Name: FISH
	 * </p>
	 */
	public static McObfPair field_151115_aP = McMappingDatabase.getSRG("field_151115_aP");

	/**
	 * <p>
	 * Name: IRON_HORSE_ARMOR
	 * </p>
	 */
	public static McObfPair field_151138_bX = McMappingDatabase.getSRG("field_151138_bX");

	/**
	 * <p>
	 * Name: IRON_SHOVEL
	 * </p>
	 */
	public static McObfPair field_151037_a = McMappingDatabase.getSRG("field_151037_a");

	/**
	 * <p>
	 * Name: ARROW
	 * </p>
	 */
	public static McObfPair field_151032_g = McMappingDatabase.getSRG("field_151032_g");

	/**
	 * <p>
	 * Name: PRISMARINE_CRYSTALS
	 * </p>
	 */
	public static McObfPair field_179563_cD = McMappingDatabase.getSRG("field_179563_cD");

	/**
	 * <p>
	 * Name: IRON_NUGGET
	 * </p>
	 */
	public static McObfPair field_191525_da = McMappingDatabase.getSRG("field_191525_da");

	/**
	 * <p>
	 * Name: CHAINMAIL_BOOTS
	 * </p>
	 */
	public static McObfPair field_151029_X = McMappingDatabase.getSRG("field_151029_X");

	/**
	 * <p>
	 * Name: CARROT
	 * </p>
	 */
	public static McObfPair field_151172_bF = McMappingDatabase.getSRG("field_151172_bF");

	/**
	 * <p>
	 * Name: POISONOUS_POTATO
	 * </p>
	 */
	public static McObfPair field_151170_bI = McMappingDatabase.getSRG("field_151170_bI");

	/**
	 * <p>
	 * Name: BANNER
	 * </p>
	 */
	public static McObfPair field_179564_cE = McMappingDatabase.getSRG("field_179564_cE");

	/**
	 * <p>
	 * Name: GOLDEN_BOOTS
	 * </p>
	 */
	public static McObfPair field_151151_aj = McMappingDatabase.getSRG("field_151151_aj");

	/**
	 * <p>
	 * Name: GLASS_BOTTLE
	 * </p>
	 */
	public static McObfPair field_151069_bo = McMappingDatabase.getSRG("field_151069_bo");

	/**
	 * <p>
	 * Name: MUTTON
	 * </p>
	 */
	public static McObfPair field_179561_bm = McMappingDatabase.getSRG("field_179561_bm");

	/**
	 * <p>
	 * Name: DIAMOND_AXE
	 * </p>
	 */
	public static McObfPair field_151056_x = McMappingDatabase.getSRG("field_151056_x");

	/**
	 * <p>
	 * Name: LINGERING_POTION
	 * </p>
	 */
	public static McObfPair field_185156_bI = McMappingDatabase.getSRG("field_185156_bI");

	/**
	 * <p>
	 * Name: GOLDEN_AXE
	 * </p>
	 */
	public static McObfPair field_151006_E = McMappingDatabase.getSRG("field_151006_E");

	/**
	 * <p>
	 * Name: REPEATER
	 * </p>
	 */
	public static McObfPair field_151107_aW = McMappingDatabase.getSRG("field_151107_aW");

	/**
	 * <p>
	 * Name: ACACIA_DOOR
	 * </p>
	 */
	public static McObfPair field_179572_au = McMappingDatabase.getSRG("field_179572_au");

	/**
	 * <p>
	 * Name: TIPPED_ARROW
	 * </p>
	 */
	public static McObfPair field_185167_i = McMappingDatabase.getSRG("field_185167_i");

	/**
	 * <p>
	 * Name: COOKED_BEEF
	 * </p>
	 */
	public static McObfPair field_151083_be = McMappingDatabase.getSRG("field_151083_be");

	/**
	 * <p>
	 * Name: MILK_BUCKET
	 * </p>
	 */
	public static McObfPair field_151117_aB = McMappingDatabase.getSRG("field_151117_aB");

}

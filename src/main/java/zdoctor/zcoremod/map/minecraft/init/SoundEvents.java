package zdoctor.zcoremod.map.minecraft.init;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SoundEvents {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qf";
		else
			return "net/minecraft/init/SoundEvents";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qf";
		else
			return "SoundEvents";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqf;";
		else
			return "Lnet/minecraft/init/SoundEvents;";
	}

	/**
	 * <p>
	 * Name: ENTITY_PARROT_HURT
	 * </p>
	 */
	public static McObfPair field_192794_er = McMappingDatabase.getSRG("field_192794_er");

	/**
	 * <p>
	 * Name: RECORD_CHIRP
	 * </p>
	 */
	public static McObfPair field_187834_es = McMappingDatabase.getSRG("field_187834_es");

	/**
	 * <p>
	 * Name: ENTITY_PLAYER_SPLASH
	 * </p>
	 */
	public static McObfPair field_187806_ee = McMappingDatabase.getSRG("field_187806_ee");

	/**
	 * <p>
	 * Name: ENTITY_CAT_DEATH
	 * </p>
	 */
	public static McObfPair field_187639_P = McMappingDatabase.getSRG("field_187639_P");

	/**
	 * <p>
	 * Name: BLOCK_DISPENSER_DISPENSE
	 * </p>
	 */
	public static McObfPair field_187574_as = McMappingDatabase.getSRG("field_187574_as");

	/**
	 * <p>
	 * Name: BLOCK_GRASS_HIT
	 * </p>
	 */
	public static McObfPair field_187575_bT = McMappingDatabase.getSRG("field_187575_bT");

	/**
	 * <p>
	 * Name: ENTITY_GHAST_WARN
	 * </p>
	 */
	public static McObfPair field_187559_bL = McMappingDatabase.getSRG("field_187559_bL");

	/**
	 * <p>
	 * Name: E_PARROT_IM_WOLF
	 * </p>
	 */
	public static McObfPair field_193820_fj = McMappingDatabase.getSRG("field_193820_fj");

	/**
	 * <p>
	 * Name: E_PARROT_IM_BLAZE
	 * </p>
	 */
	public static McObfPair field_193791_eM = McMappingDatabase.getSRG("field_193791_eM");

	/**
	 * <p>
	 * Name: ENTITY_CAT_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187636_O = McMappingDatabase.getSRG("field_187636_O");

	/**
	 * <p>
	 * Name: ENTITY_HORSE_LAND
	 * </p>
	 */
	public static McObfPair field_187723_ct = McMappingDatabase.getSRG("field_187723_ct");

	/**
	 * <p>
	 * Name: ENTITY_PLAYER_LEVELUP
	 * </p>
	 */
	public static McObfPair field_187802_ec = McMappingDatabase.getSRG("field_187802_ec");

	/**
	 * <p>
	 * Name: ENTITY_COW_MILK
	 * </p>
	 */
	public static McObfPair field_187564_an = McMappingDatabase.getSRG("field_187564_an");

	/**
	 * <p>
	 * Name: ENTITY_ILLAGER_PREPARE_MIRROR
	 * </p>
	 */
	public static McObfPair field_193790_di = McMappingDatabase.getSRG("field_193790_di");

	/**
	 * <p>
	 * Name: MUSIC_END
	 * </p>
	 */
	public static McObfPair field_187667_dA = McMappingDatabase.getSRG("field_187667_dA");

	/**
	 * <p>
	 * Name: E_PARROT_IM_VEX
	 * </p>
	 */
	public static McObfPair field_193815_fe = McMappingDatabase.getSRG("field_193815_fe");

	/**
	 * <p>
	 * Name: ENTITY_ENDERDRAGON_GROWL
	 * </p>
	 */
	public static McObfPair field_187525_aO = McMappingDatabase.getSRG("field_187525_aO");

	/**
	 * <p>
	 * Name: ENTITY_SHEEP_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187757_eG = McMappingDatabase.getSRG("field_187757_eG");

	/**
	 * <p>
	 * Name: ENTITY_SILVERFISH_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187793_eY = McMappingDatabase.getSRG("field_187793_eY");

	/**
	 * <p>
	 * Name: ENTITY_WOLF_PANT
	 * </p>
	 */
	public static McObfPair field_187865_gI = McMappingDatabase.getSRG("field_187865_gI");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_PIG_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187935_hi = McMappingDatabase.getSRG("field_187935_hi");

	/**
	 * <p>
	 * Name: ENTITY_WOLF_DEATH
	 * </p>
	 */
	public static McObfPair field_187859_gF = McMappingDatabase.getSRG("field_187859_gF");

	/**
	 * <p>
	 * Name: ENTITY_PARROT_DEATH
	 * </p>
	 */
	public static McObfPair field_192793_eq = McMappingDatabase.getSRG("field_192793_eq");

	/**
	 * <p>
	 * Name: BLOCK_LADDER_FALL
	 * </p>
	 */
	public static McObfPair field_187644_cT = McMappingDatabase.getSRG("field_187644_cT");

	/**
	 * <p>
	 * Name: BLOCK_GLASS_BREAK
	 * </p>
	 */
	public static McObfPair field_187561_bM = McMappingDatabase.getSRG("field_187561_bM");

	/**
	 * <p>
	 * Name: ITEM_BUCKET_EMPTY_LAVA
	 * </p>
	 */
	public static McObfPair field_187627_L = McMappingDatabase.getSRG("field_187627_L");

	/**
	 * <p>
	 * Name: BLOCK_ANVIL_DESTROY
	 * </p>
	 */
	public static McObfPair field_187680_c = McMappingDatabase.getSRG("field_187680_c");

	/**
	 * <p>
	 * Name: ENTITY_BAT_HURT
	 * </p>
	 */
	public static McObfPair field_187743_y = McMappingDatabase.getSRG("field_187743_y");

	/**
	 * <p>
	 * Name: ITEM_BUCKET_EMPTY
	 * </p>
	 */
	public static McObfPair field_187624_K = McMappingDatabase.getSRG("field_187624_K");

	/**
	 * <p>
	 * Name: ENTITY_SHULKER_DEATH
	 * </p>
	 */
	public static McObfPair field_187781_eS = McMappingDatabase.getSRG("field_187781_eS");

	/**
	 * <p>
	 * Name: E_PARROT_IM_ENDERDRAGON
	 * </p>
	 */
	public static McObfPair field_193794_eP = McMappingDatabase.getSRG("field_193794_eP");

	/**
	 * <p>
	 * Name: ENTITY_SLIME_JUMP
	 * </p>
	 */
	public static McObfPair field_187882_fq = McMappingDatabase.getSRG("field_187882_fq");

	/**
	 * <p>
	 * Name: ENTITY_ITEM_BREAK
	 * </p>
	 */
	public static McObfPair field_187635_cQ = McMappingDatabase.getSRG("field_187635_cQ");

	/**
	 * <p>
	 * Name: E_PARROT_IM_ZOMBIE
	 * </p>
	 */
	public static McObfPair field_193821_fk = McMappingDatabase.getSRG("field_193821_fk");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_ATTACK_DOOR_WOOD
	 * </p>
	 */
	public static McObfPair field_187927_ha = McMappingDatabase.getSRG("field_187927_ha");

	/**
	 * <p>
	 * Name: E_PARROT_IM_WITHER_SKELETON
	 * </p>
	 */
	public static McObfPair field_193819_fi = McMappingDatabase.getSRG("field_193819_fi");

	/**
	 * <p>
	 * Name: ITEM_BUCKET_FILL
	 * </p>
	 */
	public static McObfPair field_187630_M = McMappingDatabase.getSRG("field_187630_M");

	/**
	 * <p>
	 * Name: ENTITY_WITCH_THROW
	 * </p>
	 */
	public static McObfPair field_187924_gx = McMappingDatabase.getSRG("field_187924_gx");

	/**
	 * <p>
	 * Name: ENTITY_HOSTILE_SWIM
	 * </p>
	 */
	public static McObfPair field_187593_cC = McMappingDatabase.getSRG("field_187593_cC");

	/**
	 * <p>
	 * Name: ENTITY_LLAMA_EAT
	 * </p>
	 */
	public static McObfPair field_191253_dD = McMappingDatabase.getSRG("field_191253_dD");

	/**
	 * <p>
	 * Name: ENTITY_HUSK_HURT
	 * </p>
	 */
	public static McObfPair field_190024_cK = McMappingDatabase.getSRG("field_190024_cK");

	/**
	 * <p>
	 * Name: ENTITY_EVOCATION_ILLAGER_AMBIENT
	 * </p>
	 */
	public static McObfPair field_191243_bm = McMappingDatabase.getSRG("field_191243_bm");

	/**
	 * <p>
	 * Name: ITEM_ARMOR_EQUIP_CHAIN
	 * </p>
	 */
	public static McObfPair field_187713_n = McMappingDatabase.getSRG("field_187713_n");

	/**
	 * <p>
	 * Name: BLOCK_GRAVEL_FALL
	 * </p>
	 */
	public static McObfPair field_187583_bX = McMappingDatabase.getSRG("field_187583_bX");

	/**
	 * <p>
	 * Name: BLOCK_SNOW_BREAK
	 * </p>
	 */
	public static McObfPair field_187807_fF = McMappingDatabase.getSRG("field_187807_fF");

	/**
	 * <p>
	 * Name: ENTITY_ITEMFRAME_ROTATE_ITEM
	 * </p>
	 */
	public static McObfPair field_187632_cP = McMappingDatabase.getSRG("field_187632_cP");

	/**
	 * <p>
	 * Name: ENTITY_BOBBER_SPLASH
	 * </p>
	 */
	public static McObfPair field_187609_F = McMappingDatabase.getSRG("field_187609_F");

	/**
	 * <p>
	 * Name: ENTITY_VILLAGER_DEATH
	 * </p>
	 */
	public static McObfPair field_187911_gk = McMappingDatabase.getSRG("field_187911_gk");

	/**
	 * <p>
	 * Name: BLOCK_SAND_HIT
	 * </p>
	 */
	public static McObfPair field_187751_eD = McMappingDatabase.getSRG("field_187751_eD");

	/**
	 * <p>
	 * Name: BLOCK_SLIME_BREAK
	 * </p>
	 */
	public static McObfPair field_187872_fl = McMappingDatabase.getSRG("field_187872_fl");

	/**
	 * <p>
	 * Name: ENTITY_DONKEY_DEATH
	 * </p>
	 */
	public static McObfPair field_187586_ay = McMappingDatabase.getSRG("field_187586_ay");

	/**
	 * <p>
	 * Name: ENTITY_ENDERDRAGON_DEATH
	 * </p>
	 */
	public static McObfPair field_187522_aL = McMappingDatabase.getSRG("field_187522_aL");

	/**
	 * <p>
	 * Name: ENTITY_BLAZE_DEATH
	 * </p>
	 */
	public static McObfPair field_187600_C = McMappingDatabase.getSRG("field_187600_C");

	/**
	 * <p>
	 * Name: WEATHER_RAIN_ABOVE
	 * </p>
	 */
	public static McObfPair field_187919_gs = McMappingDatabase.getSRG("field_187919_gs");

	/**
	 * <p>
	 * Name: ENTITY_ELDER_GUARDIAN_CURSE
	 * </p>
	 */
	public static McObfPair field_187514_aD = McMappingDatabase.getSRG("field_187514_aD");

	/**
	 * <p>
	 * Name: ENTITY_GUARDIAN_AMBIENT_LAND
	 * </p>
	 */
	public static McObfPair field_187672_cc = McMappingDatabase.getSRG("field_187672_cc");

	/**
	 * <p>
	 * Name: AMBIENT_CAVE
	 * </p>
	 */
	public static McObfPair field_187674_a = McMappingDatabase.getSRG("field_187674_a");

	/**
	 * <p>
	 * Name: ENTITY_STRAY_AMBIENT
	 * </p>
	 */
	public static McObfPair field_190032_gu = McMappingDatabase.getSRG("field_190032_gu");

	/**
	 * <p>
	 * Name: BLOCK_NOTE_FLUTE
	 * </p>
	 */
	public static McObfPair field_193809_ey = McMappingDatabase.getSRG("field_193809_ey");

	/**
	 * <p>
	 * Name: ENTITY_SHEEP_HURT
	 * </p>
	 */
	public static McObfPair field_187761_eI = McMappingDatabase.getSRG("field_187761_eI");

	/**
	 * <p>
	 * Name: BLOCK_SLIME_STEP
	 * </p>
	 */
	public static McObfPair field_187888_ft = McMappingDatabase.getSRG("field_187888_ft");

	/**
	 * <p>
	 * Name: ENTITY_PLAYER_SMALL_FALL
	 * </p>
	 */
	public static McObfPair field_187804_ed = McMappingDatabase.getSRG("field_187804_ed");

	/**
	 * <p>
	 * Name: BLOCK_NOTE_CHIME
	 * </p>
	 */
	public static McObfPair field_193808_ex = McMappingDatabase.getSRG("field_193808_ex");

	/**
	 * <p>
	 * Name: ENTITY_MOOSHROOM_SHEAR
	 * </p>
	 */
	public static McObfPair field_187784_dt = McMappingDatabase.getSRG("field_187784_dt");

	/**
	 * <p>
	 * Name: ENTITY_HUSK_DEATH
	 * </p>
	 */
	public static McObfPair field_190023_cJ = McMappingDatabase.getSRG("field_190023_cJ");

	/**
	 * <p>
	 * Name: BLOCK_IRON_DOOR_CLOSE
	 * </p>
	 */
	public static McObfPair field_187608_cH = McMappingDatabase.getSRG("field_187608_cH");

	/**
	 * <p>
	 * Name: ENTITY_VEX_AMBIENT
	 * </p>
	 */
	public static McObfPair field_191264_hc = McMappingDatabase.getSRG("field_191264_hc");

	/**
	 * <p>
	 * Name: ENTITY_PLAYER_BREATH
	 * </p>
	 */
	public static McObfPair field_189109_ed = McMappingDatabase.getSRG("field_189109_ed");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_VILLAGER_CURE
	 * </p>
	 */
	public static McObfPair field_187942_hp = McMappingDatabase.getSRG("field_187942_hp");

	/**
	 * <p>
	 * Name: BLOCK_IRON_DOOR_OPEN
	 * </p>
	 */
	public static McObfPair field_187611_cI = McMappingDatabase.getSRG("field_187611_cI");

	/**
	 * <p>
	 * Name: ENTITY_ILLAGER_MIRROR_MOVE
	 * </p>
	 */
	public static McObfPair field_193788_dg = McMappingDatabase.getSRG("field_193788_dg");

	/**
	 * <p>
	 * Name: ENTITY_HUSK_STEP
	 * </p>
	 */
	public static McObfPair field_190025_cL = McMappingDatabase.getSRG("field_190025_cL");

	/**
	 * <p>
	 * Name: ENTITY_SILVERFISH_HURT
	 * </p>
	 */
	public static McObfPair field_187850_fa = McMappingDatabase.getSRG("field_187850_fa");

	/**
	 * <p>
	 * Name: BLOCK_WOOD_BUTTON_CLICK_OFF
	 * </p>
	 */
	public static McObfPair field_187883_gR = McMappingDatabase.getSRG("field_187883_gR");

	/**
	 * <p>
	 * Name: ENTITY_POLAR_BEAR_AMBIENT
	 * </p>
	 */
	public static McObfPair field_190026_er = McMappingDatabase.getSRG("field_190026_er");

	/**
	 * <p>
	 * Name: ITEM_ARMOR_EQIIP_ELYTRA
	 * </p>
	 */
	public static McObfPair field_191258_p = McMappingDatabase.getSRG("field_191258_p");

	/**
	 * <p>
	 * Name: ENTITY_HORSE_ANGRY
	 * </p>
	 */
	public static McObfPair field_187699_cl = McMappingDatabase.getSRG("field_187699_cl");

	/**
	 * <p>
	 * Name: MUSIC_CREDITS
	 * </p>
	 */
	public static McObfPair field_187794_dy = McMappingDatabase.getSRG("field_187794_dy");

	/**
	 * <p>
	 * Name: ENTITY_GENERIC_BIG_FALL
	 * </p>
	 */
	public static McObfPair field_187655_bw = McMappingDatabase.getSRG("field_187655_bw");

	/**
	 * <p>
	 * Name: BLOCK_GLASS_HIT
	 * </p>
	 */
	public static McObfPair field_187565_bO = McMappingDatabase.getSRG("field_187565_bO");

	/**
	 * <p>
	 * Name: BLOCK_SLIME_PLACE
	 * </p>
	 */
	public static McObfPair field_187884_fr = McMappingDatabase.getSRG("field_187884_fr");

	/**
	 * <p>
	 * Name: ENTITY_PIG_HURT
	 * </p>
	 */
	public static McObfPair field_187703_dN = McMappingDatabase.getSRG("field_187703_dN");

	/**
	 * <p>
	 * Name: ENTITY_SQUID_HURT
	 * </p>
	 */
	public static McObfPair field_187833_fS = McMappingDatabase.getSRG("field_187833_fS");

	/**
	 * <p>
	 * Name: EVOCATION_ILLAGER_PREPARE_ATTACK
	 * </p>
	 */
	public static McObfPair field_191247_bq = McMappingDatabase.getSRG("field_191247_bq");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_VILLAGER_DEATH
	 * </p>
	 */
	public static McObfPair field_187943_hq = McMappingDatabase.getSRG("field_187943_hq");

	/**
	 * <p>
	 * Name: BLOCK_WOOD_PRESSPLATE_CLICK_OFF
	 * </p>
	 */
	public static McObfPair field_187893_gW = McMappingDatabase.getSRG("field_187893_gW");

	/**
	 * <p>
	 * Name: ENTITY_PIG_DEATH
	 * </p>
	 */
	public static McObfPair field_187700_dM = McMappingDatabase.getSRG("field_187700_dM");

	/**
	 * <p>
	 * Name: BLOCK_STONE_STEP
	 * </p>
	 */
	public static McObfPair field_187902_gb = McMappingDatabase.getSRG("field_187902_gb");

	/**
	 * <p>
	 * Name: ENTITY_SHULKER_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187773_eO = McMappingDatabase.getSRG("field_187773_eO");

	/**
	 * <p>
	 * Name: ENTITY_WOLF_STEP
	 * </p>
	 */
	public static McObfPair field_187869_gK = McMappingDatabase.getSRG("field_187869_gK");

	/**
	 * <p>
	 * Name: ENTITY_ITEMFRAME_BREAK
	 * </p>
	 */
	public static McObfPair field_187623_cM = McMappingDatabase.getSRG("field_187623_cM");

	/**
	 * <p>
	 * Name: ENTITY_SKELETON_DEATH
	 * </p>
	 */
	public static McObfPair field_187856_fd = McMappingDatabase.getSRG("field_187856_fd");

	/**
	 * <p>
	 * Name: ENTITY_GHAST_SCREAM
	 * </p>
	 */
	public static McObfPair field_189105_bM = McMappingDatabase.getSRG("field_189105_bM");

	/**
	 * <p>
	 * Name: MUSIC_DRAGON
	 * </p>
	 */
	public static McObfPair field_187796_dz = McMappingDatabase.getSRG("field_187796_dz");

	/**
	 * <p>
	 * Name: BLOCK_CHEST_OPEN
	 * </p>
	 */
	public static McObfPair field_187657_V = McMappingDatabase.getSRG("field_187657_V");

	/**
	 * <p>
	 * Name: BLOCK_WOODEN_TRAPDOOR_CLOSE
	 * </p>
	 */
	public static McObfPair field_187877_gO = McMappingDatabase.getSRG("field_187877_gO");

	/**
	 * <p>
	 * Name: ENTITY_PLAYER_HURT
	 * </p>
	 */
	public static McObfPair field_187800_eb = McMappingDatabase.getSRG("field_187800_eb");

	/**
	 * <p>
	 * Name: ENTITY_ITEMFRAME_REMOVE_ITEM
	 * </p>
	 */
	public static McObfPair field_187629_cO = McMappingDatabase.getSRG("field_187629_cO");

	/**
	 * <p>
	 * Name: ENTITY_PAINTING_PLACE
	 * </p>
	 */
	public static McObfPair field_187694_dK = McMappingDatabase.getSRG("field_187694_dK");

	/**
	 * <p>
	 * Name: ENTITY_PLAYER_ATTACK_STRONG
	 * </p>
	 */
	public static McObfPair field_187727_dV = McMappingDatabase.getSRG("field_187727_dV");

	/**
	 * <p>
	 * Name: ENTITY_SPLASH_POTION_BREAK
	 * </p>
	 */
	public static McObfPair field_187825_fO = McMappingDatabase.getSRG("field_187825_fO");

	/**
	 * <p>
	 * Name: ENTITY_ILLUSION_ILLAGER_HURT
	 * </p>
	 */
	public static McObfPair field_193787_df = McMappingDatabase.getSRG("field_193787_df");

	/**
	 * <p>
	 * Name: ENTITY_SNOWMAN_DEATH
	 * </p>
	 */
	public static McObfPair field_187801_fC = McMappingDatabase.getSRG("field_187801_fC");

	/**
	 * <p>
	 * Name: ENTITY_TNT_PRIMED
	 * </p>
	 */
	public static McObfPair field_187904_gd = McMappingDatabase.getSRG("field_187904_gd");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_PIG_DEATH
	 * </p>
	 */
	public static McObfPair field_187937_hk = McMappingDatabase.getSRG("field_187937_hk");

	/**
	 * <p>
	 * Name: BLOCK_STONE_BREAK
	 * </p>
	 */
	public static McObfPair field_187835_fT = McMappingDatabase.getSRG("field_187835_fT");

	/**
	 * <p>
	 * Name: ENTITY_CHICKEN_STEP
	 * </p>
	 */
	public static McObfPair field_187538_aa = McMappingDatabase.getSRG("field_187538_aa");

	/**
	 * <p>
	 * Name: E_PARROT_IM_CREEPER
	 * </p>
	 */
	public static McObfPair field_193792_eN = McMappingDatabase.getSRG("field_193792_eN");

	/**
	 * <p>
	 * Name: ENTITY_PLAYER_BURP
	 * </p>
	 */
	public static McObfPair field_187739_dZ = McMappingDatabase.getSRG("field_187739_dZ");

	/**
	 * <p>
	 * Name: BLOCK_ANVIL_HIT
	 * </p>
	 */
	public static McObfPair field_187686_e = McMappingDatabase.getSRG("field_187686_e");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_PIG_HURT
	 * </p>
	 */
	public static McObfPair field_187938_hl = McMappingDatabase.getSRG("field_187938_hl");

	/**
	 * <p>
	 * Name: ENTITY_SKELETON_STEP
	 * </p>
	 */
	public static McObfPair field_187868_fj = McMappingDatabase.getSRG("field_187868_fj");

	/**
	 * <p>
	 * Name: ENTITY_MAGMACUBE_JUMP
	 * </p>
	 */
	public static McObfPair field_187762_di = McMappingDatabase.getSRG("field_187762_di");

	/**
	 * <p>
	 * Name: BLOCK_GLASS_STEP
	 * </p>
	 */
	public static McObfPair field_187569_bQ = McMappingDatabase.getSRG("field_187569_bQ");

	/**
	 * <p>
	 * Name: ENTITY_FIREWORK_TWINKLE
	 * </p>
	 */
	public static McObfPair field_187637_bq = McMappingDatabase.getSRG("field_187637_bq");

	/**
	 * <p>
	 * Name: ENTITY_ENDERMEN_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187529_aS = McMappingDatabase.getSRG("field_187529_aS");

	/**
	 * <p>
	 * Name: ITEM_TOTEM_USE
	 * </p>
	 */
	public static McObfPair field_191263_gW = McMappingDatabase.getSRG("field_191263_gW");

	/**
	 * <p>
	 * Name: ENTITY_MULE_DEATH
	 * </p>
	 */
	public static McObfPair field_187788_dv = McMappingDatabase.getSRG("field_187788_dv");

	/**
	 * <p>
	 * Name: BLOCK_STONE_PRESSPLATE_CLICK_ON
	 * </p>
	 */
	public static McObfPair field_187901_ga = McMappingDatabase.getSRG("field_187901_ga");

	/**
	 * <p>
	 * Name: ENTITY_LLAMA_SWAG
	 * </p>
	 */
	public static McObfPair field_191257_dH = McMappingDatabase.getSRG("field_191257_dH");

	/**
	 * <p>
	 * Name: ENTITY_WITHER_DEATH
	 * </p>
	 */
	public static McObfPair field_187849_gA = McMappingDatabase.getSRG("field_187849_gA");

	/**
	 * <p>
	 * Name: ENTITY_ENDERDRAGON_FLAP
	 * </p>
	 */
	public static McObfPair field_187524_aN = McMappingDatabase.getSRG("field_187524_aN");

	/**
	 * <p>
	 * Name: ENTITY_LIGHTNING_IMPACT
	 * </p>
	 */
	public static McObfPair field_187752_dd = McMappingDatabase.getSRG("field_187752_dd");

	/**
	 * <p>
	 * Name: ENTITY_ENDEREYE_LAUNCH
	 * </p>
	 */
	public static McObfPair field_187528_aR = McMappingDatabase.getSRG("field_187528_aR");

	/**
	 * <p>
	 * Name: ENTITY_SMALL_SLIME_SQUISH
	 * </p>
	 */
	public static McObfPair field_187900_fz = McMappingDatabase.getSRG("field_187900_fz");

	/**
	 * <p>
	 * Name: ENTITY_RABBIT_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187816_ej = McMappingDatabase.getSRG("field_187816_ej");

	/**
	 * <p>
	 * Name: ENTITY_ELDER_GUARDIAN_FLOP
	 * </p>
	 */
	public static McObfPair field_191240_aK = McMappingDatabase.getSRG("field_191240_aK");

	/**
	 * <p>
	 * Name: ENTITY_GENERIC_SPLASH
	 * </p>
	 */
	public static McObfPair field_187547_bF = McMappingDatabase.getSRG("field_187547_bF");

	/**
	 * <p>
	 * Name: ENTITY_EXPERIENCE_BOTTLE_THROW
	 * </p>
	 */
	public static McObfPair field_187601_be = McMappingDatabase.getSRG("field_187601_be");

	/**
	 * <p>
	 * Name: BLOCK_LAVA_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187656_cX = McMappingDatabase.getSRG("field_187656_cX");

	/**
	 * <p>
	 * Name: ENTITY_SNOWMAN_HURT
	 * </p>
	 */
	public static McObfPair field_187803_fD = McMappingDatabase.getSRG("field_187803_fD");

	/**
	 * <p>
	 * Name: ENTITY_HORSE_ARMOR
	 * </p>
	 */
	public static McObfPair field_187702_cm = McMappingDatabase.getSRG("field_187702_cm");

	/**
	 * <p>
	 * Name: BLOCK_CHORUS_FLOWER_DEATH
	 * </p>
	 */
	public static McObfPair field_187540_ab = McMappingDatabase.getSRG("field_187540_ab");

	/**
	 * <p>
	 * Name: ENTITY_SHULKER_OPEN
	 * </p>
	 */
	public static McObfPair field_187787_eV = McMappingDatabase.getSRG("field_187787_eV");

	/**
	 * <p>
	 * Name: BLOCK_GRAVEL_PLACE
	 * </p>
	 */
	public static McObfPair field_187587_bZ = McMappingDatabase.getSRG("field_187587_bZ");

	/**
	 * <p>
	 * Name: ITEM_ARMOR_EQUIP_DIAMOND
	 * </p>
	 */
	public static McObfPair field_187716_o = McMappingDatabase.getSRG("field_187716_o");

	/**
	 * <p>
	 * Name: BLOCK_ANVIL_STEP
	 * </p>
	 */
	public static McObfPair field_187695_h = McMappingDatabase.getSRG("field_187695_h");

	/**
	 * <p>
	 * Name: ENTITY_BLAZE_HURT
	 * </p>
	 */
	public static McObfPair field_187603_D = McMappingDatabase.getSRG("field_187603_D");

	/**
	 * <p>
	 * Name: ENTITY_WOLF_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187857_gE = McMappingDatabase.getSRG("field_187857_gE");

	/**
	 * <p>
	 * Name: ITEM_SHIELD_BREAK
	 * </p>
	 */
	public static McObfPair field_187769_eM = McMappingDatabase.getSRG("field_187769_eM");

	/**
	 * <p>
	 * Name: ENTITY_SPIDER_HURT
	 * </p>
	 */
	public static McObfPair field_187821_fM = McMappingDatabase.getSRG("field_187821_fM");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_VILLAGER_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187940_hn = McMappingDatabase.getSRG("field_187940_hn");

	/**
	 * <p>
	 * Name: E_PARROT_IM_HUSK
	 * </p>
	 */
	public static McObfPair field_193799_eU = McMappingDatabase.getSRG("field_193799_eU");

	/**
	 * <p>
	 * Name: ENTITY_PLAYER_ATTACK_NODAMAGE
	 * </p>
	 */
	public static McObfPair field_187724_dU = McMappingDatabase.getSRG("field_187724_dU");

	/**
	 * <p>
	 * Name: ITEM_BOTTLE_FILL
	 * </p>
	 */
	public static McObfPair field_187615_H = McMappingDatabase.getSRG("field_187615_H");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_BREAK_DOOR_WOOD
	 * </p>
	 */
	public static McObfPair field_187929_hc = McMappingDatabase.getSRG("field_187929_hc");

	/**
	 * <p>
	 * Name: BLOCK_PORTAL_TRAVEL
	 * </p>
	 */
	public static McObfPair field_187812_eh = McMappingDatabase.getSRG("field_187812_eh");

	/**
	 * <p>
	 * Name: BLOCK_LAVA_EXTINGUISH
	 * </p>
	 */
	public static McObfPair field_187659_cY = McMappingDatabase.getSRG("field_187659_cY");

	/**
	 * <p>
	 * Name: BLOCK_SNOW_STEP
	 * </p>
	 */
	public static McObfPair field_187815_fJ = McMappingDatabase.getSRG("field_187815_fJ");

	/**
	 * <p>
	 * Name: ENTITY_CHICKEN_DEATH
	 * </p>
	 */
	public static McObfPair field_187663_X = McMappingDatabase.getSRG("field_187663_X");

	/**
	 * <p>
	 * Name: ENTITY_COW_STEP
	 * </p>
	 */
	public static McObfPair field_187566_ao = McMappingDatabase.getSRG("field_187566_ao");

	/**
	 * <p>
	 * Name: UI_TOAST_CHALLENGE_COMPLETE
	 * </p>
	 */
	public static McObfPair field_194228_if = McMappingDatabase.getSRG("field_194228_if");

	/**
	 * <p>
	 * Name: ENTITY_BAT_TAKEOFF
	 * </p>
	 */
	public static McObfPair field_187744_z = McMappingDatabase.getSRG("field_187744_z");

	/**
	 * <p>
	 * Name: BLOCK_ENDERCHEST_OPEN
	 * </p>
	 */
	public static McObfPair field_187520_aJ = McMappingDatabase.getSRG("field_187520_aJ");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_INFECT
	 * </p>
	 */
	public static McObfPair field_187945_hs = McMappingDatabase.getSRG("field_187945_hs");

	/**
	 * <p>
	 * Name: ENTITY_PARROT_STEP
	 * </p>
	 */
	public static McObfPair field_192795_es = McMappingDatabase.getSRG("field_192795_es");

	/**
	 * <p>
	 * Name: BLOCK_CLOTH_BREAK
	 * </p>
	 */
	public static McObfPair field_187546_ae = McMappingDatabase.getSRG("field_187546_ae");

	/**
	 * <p>
	 * Name: BLOCK_SAND_PLACE
	 * </p>
	 */
	public static McObfPair field_187753_eE = McMappingDatabase.getSRG("field_187753_eE");

	/**
	 * <p>
	 * Name: BLOCK_TRIPWIRE_CLICK_ON
	 * </p>
	 */
	public static McObfPair field_187907_gg = McMappingDatabase.getSRG("field_187907_gg");

	/**
	 * <p>
	 * Name: ITEM_BOTTLE_FILL_DRAGONBREATH
	 * </p>
	 */
	public static McObfPair field_187618_I = McMappingDatabase.getSRG("field_187618_I");

	/**
	 * <p>
	 * Name: ENTITY_ENDERMEN_DEATH
	 * </p>
	 */
	public static McObfPair field_187530_aT = McMappingDatabase.getSRG("field_187530_aT");

	/**
	 * <p>
	 * Name: BLOCK_NOTE_HAT
	 * </p>
	 */
	public static McObfPair field_187685_dH = McMappingDatabase.getSRG("field_187685_dH");

	/**
	 * <p>
	 * Name: ENTITY_ILLAGER_CAST_SPELL
	 * </p>
	 */
	public static McObfPair field_193784_dd = McMappingDatabase.getSRG("field_193784_dd");

	/**
	 * <p>
	 * Name: ENTITY_WOLF_HURT
	 * </p>
	 */
	public static McObfPair field_187863_gH = McMappingDatabase.getSRG("field_187863_gH");

	/**
	 * <p>
	 * Name: ENTITY_PLAYER_ATTACK_KNOCKBACK
	 * </p>
	 */
	public static McObfPair field_187721_dT = McMappingDatabase.getSRG("field_187721_dT");

	/**
	 * <p>
	 * Name: RECORD_STAL
	 * </p>
	 */
	public static McObfPair field_187842_ew = McMappingDatabase.getSRG("field_187842_ew");

	/**
	 * <p>
	 * Name: ITEM_CHORUS_FRUIT_TELEPORT
	 * </p>
	 */
	public static McObfPair field_187544_ad = McMappingDatabase.getSRG("field_187544_ad");

	/**
	 * <p>
	 * Name: ENTITY_WOLF_HOWL
	 * </p>
	 */
	public static McObfPair field_189111_gN = McMappingDatabase.getSRG("field_189111_gN");

	/**
	 * <p>
	 * Name: ENTITY_SLIME_DEATH
	 * </p>
	 */
	public static McObfPair field_187874_fm = McMappingDatabase.getSRG("field_187874_fm");

	/**
	 * <p>
	 * Name: ENTITY_HUSK_AMBIENT
	 * </p>
	 */
	public static McObfPair field_190022_cI = McMappingDatabase.getSRG("field_190022_cI");

	/**
	 * <p>
	 * Name: ENTITY_HORSE_EAT
	 * </p>
	 */
	public static McObfPair field_187711_cp = McMappingDatabase.getSRG("field_187711_cp");

	/**
	 * <p>
	 * Name: ENTITY_PIG_SADDLE
	 * </p>
	 */
	public static McObfPair field_187706_dO = McMappingDatabase.getSRG("field_187706_dO");

	/**
	 * <p>
	 * Name: ENTITY_ARROW_HIT
	 * </p>
	 */
	public static McObfPair field_187731_t = McMappingDatabase.getSRG("field_187731_t");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_ATTACK_IRON_DOOR
	 * </p>
	 */
	public static McObfPair field_187928_hb = McMappingDatabase.getSRG("field_187928_hb");

	/**
	 * <p>
	 * Name: ENTITY_COW_DEATH
	 * </p>
	 */
	public static McObfPair field_187560_al = McMappingDatabase.getSRG("field_187560_al");

	/**
	 * <p>
	 * Name: ENTITY_SKELETON_HORSE_DEATH
	 * </p>
	 */
	public static McObfPair field_187860_ff = McMappingDatabase.getSRG("field_187860_ff");

	/**
	 * <p>
	 * Name: ENCHANT_THORNS_HIT
	 * </p>
	 */
	public static McObfPair field_187903_gc = McMappingDatabase.getSRG("field_187903_gc");

	/**
	 * <p>
	 * Name: EVOCATION_ILLAGER_PREPARE_WOLOLO
	 * </p>
	 */
	public static McObfPair field_191249_bs = McMappingDatabase.getSRG("field_191249_bs");

	/**
	 * <p>
	 * Name: ENTITY_WITHER_HURT
	 * </p>
	 */
	public static McObfPair field_187851_gB = McMappingDatabase.getSRG("field_187851_gB");

	/**
	 * <p>
	 * Name: ENTITY_SKELETON_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187854_fc = McMappingDatabase.getSRG("field_187854_fc");

	/**
	 * <p>
	 * Name: ENTITY_DONKEY_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187580_av = McMappingDatabase.getSRG("field_187580_av");

	/**
	 * <p>
	 * Name: ENTITY_WOLF_SHAKE
	 * </p>
	 */
	public static McObfPair field_187867_gJ = McMappingDatabase.getSRG("field_187867_gJ");

	/**
	 * <p>
	 * Name: ENTITY_POLAR_BEAR_STEP
	 * </p>
	 */
	public static McObfPair field_190030_ev = McMappingDatabase.getSRG("field_190030_ev");

	/**
	 * <p>
	 * Name: ENTITY_PLAYER_DEATH
	 * </p>
	 */
	public static McObfPair field_187798_ea = McMappingDatabase.getSRG("field_187798_ea");

	/**
	 * <p>
	 * Name: BLOCK_SAND_BREAK
	 * </p>
	 */
	public static McObfPair field_187747_eB = McMappingDatabase.getSRG("field_187747_eB");

	/**
	 * <p>
	 * Name: ENTITY_FIREWORK_LAUNCH
	 * </p>
	 */
	public static McObfPair field_187631_bo = McMappingDatabase.getSRG("field_187631_bo");

	/**
	 * <p>
	 * Name: BLOCK_ANVIL_USE
	 * </p>
	 */
	public static McObfPair field_187698_i = McMappingDatabase.getSRG("field_187698_i");

	/**
	 * <p>
	 * Name: BLOCK_CLOTH_PLACE
	 * </p>
	 */
	public static McObfPair field_187552_ah = McMappingDatabase.getSRG("field_187552_ah");

	/**
	 * <p>
	 * Name: ENTITY_SHULKER_BULLET_HIT
	 * </p>
	 */
	public static McObfPair field_187775_eP = McMappingDatabase.getSRG("field_187775_eP");

	/**
	 * <p>
	 * Name: ENTITY_ITEM_PICKUP
	 * </p>
	 */
	public static McObfPair field_187638_cR = McMappingDatabase.getSRG("field_187638_cR");

	/**
	 * <p>
	 * Name: ENTITY_PIG_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187697_dL = McMappingDatabase.getSRG("field_187697_dL");

	/**
	 * <p>
	 * Name: ENTITY_WITHER_SKELETON_STEP
	 * </p>
	 */
	public static McObfPair field_190039_hd = McMappingDatabase.getSRG("field_190039_hd");

	/**
	 * <p>
	 * Name: ENTITY_SKELETON_HORSE_HURT
	 * </p>
	 */
	public static McObfPair field_187862_fg = McMappingDatabase.getSRG("field_187862_fg");

	/**
	 * <p>
	 * Name: ENTITY_CAT_PURR
	 * </p>
	 */
	public static McObfPair field_187645_R = McMappingDatabase.getSRG("field_187645_R");

	/**
	 * <p>
	 * Name: ENTITY_EVOCATION_ILLAGER_HURT
	 * </p>
	 */
	public static McObfPair field_191246_bp = McMappingDatabase.getSRG("field_191246_bp");

	/**
	 * <p>
	 * Name: ENTITY_WITHER_SKELETON_DEATH
	 * </p>
	 */
	public static McObfPair field_190037_hb = McMappingDatabase.getSRG("field_190037_hb");

	/**
	 * <p>
	 * Name: ENTITY_WOLF_WHINE
	 * </p>
	 */
	public static McObfPair field_187871_gL = McMappingDatabase.getSRG("field_187871_gL");

	/**
	 * <p>
	 * Name: BLOCK_FENCE_GATE_CLOSE
	 * </p>
	 */
	public static McObfPair field_187610_bh = McMappingDatabase.getSRG("field_187610_bh");

	/**
	 * <p>
	 * Name: ENTITY_LLAMA_CHEST
	 * </p>
	 */
	public static McObfPair field_191251_dB = McMappingDatabase.getSRG("field_191251_dB");

	/**
	 * <p>
	 * Name: ENTITY_HORSE_SADDLE
	 * </p>
	 */
	public static McObfPair field_187726_cu = McMappingDatabase.getSRG("field_187726_cu");

	/**
	 * <p>
	 * Name: BLOCK_SAND_STEP
	 * </p>
	 */
	public static McObfPair field_187755_eF = McMappingDatabase.getSRG("field_187755_eF");

	/**
	 * <p>
	 * Name: ENTITY_MULE_HURT
	 * </p>
	 */
	public static McObfPair field_187790_dw = McMappingDatabase.getSRG("field_187790_dw");

	/**
	 * <p>
	 * Name: BLOCK_ENDERCHEST_CLOSE
	 * </p>
	 */
	public static McObfPair field_187519_aI = McMappingDatabase.getSRG("field_187519_aI");

	/**
	 * <p>
	 * Name: ENTITY_SLIME_HURT
	 * </p>
	 */
	public static McObfPair field_187880_fp = McMappingDatabase.getSRG("field_187880_fp");

	/**
	 * <p>
	 * Name: BLOCK_STONE_FALL
	 * </p>
	 */
	public static McObfPair field_187841_fW = McMappingDatabase.getSRG("field_187841_fW");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_VILLAGER_STEP
	 * </p>
	 */
	public static McObfPair field_187946_ht = McMappingDatabase.getSRG("field_187946_ht");

	/**
	 * <p>
	 * Name: ENTITY_HORSE_STEP_WOOD
	 * </p>
	 */
	public static McObfPair field_187732_cw = McMappingDatabase.getSRG("field_187732_cw");

	/**
	 * <p>
	 * Name: BLOCK_NOTE_GUITAR
	 * </p>
	 */
	public static McObfPair field_193810_ez = McMappingDatabase.getSRG("field_193810_ez");

	/**
	 * <p>
	 * Name: ENTITY_HOSTILE_BIG_FALL
	 * </p>
	 */
	public static McObfPair field_187735_cx = McMappingDatabase.getSRG("field_187735_cx");

	/**
	 * <p>
	 * Name: ENTITY_SHULKER_HURT_CLOSED
	 * </p>
	 */
	public static McObfPair field_187785_eU = McMappingDatabase.getSRG("field_187785_eU");

	/**
	 * <p>
	 * Name: ENTITY_GUARDIAN_ATTACK
	 * </p>
	 */
	public static McObfPair field_187675_cd = McMappingDatabase.getSRG("field_187675_cd");

	/**
	 * <p>
	 * Name: ENTITY_WITCH_DRINK
	 * </p>
	 */
	public static McObfPair field_187922_gv = McMappingDatabase.getSRG("field_187922_gv");

	/**
	 * <p>
	 * Name: ENTITY_GENERIC_SWIM
	 * </p>
	 */
	public static McObfPair field_187549_bG = McMappingDatabase.getSRG("field_187549_bG");

	/**
	 * <p>
	 * Name: ENTITY_SKELETON_SHOOT
	 * </p>
	 */
	public static McObfPair field_187866_fi = McMappingDatabase.getSRG("field_187866_fi");

	/**
	 * <p>
	 * Name: ITEM_ARMOR_EQUIP_LEATHER
	 * </p>
	 */
	public static McObfPair field_187728_s = McMappingDatabase.getSRG("field_187728_s");

	/**
	 * <p>
	 * Name: MUSIC_MENU
	 * </p>
	 */
	public static McObfPair field_187671_dC = McMappingDatabase.getSRG("field_187671_dC");

	/**
	 * <p>
	 * Name: ENTITY_PLAYER_ATTACK_SWEEP
	 * </p>
	 */
	public static McObfPair field_187730_dW = McMappingDatabase.getSRG("field_187730_dW");

	/**
	 * <p>
	 * Name: ENTITY_ENDERMEN_HURT
	 * </p>
	 */
	public static McObfPair field_187531_aU = McMappingDatabase.getSRG("field_187531_aU");

	/**
	 * <p>
	 * Name: BLOCK_CHEST_CLOSE
	 * </p>
	 */
	public static McObfPair field_187651_T = McMappingDatabase.getSRG("field_187651_T");

	/**
	 * <p>
	 * Name: BLOCK_METAL_HIT
	 * </p>
	 */
	public static McObfPair field_187770_dm = McMappingDatabase.getSRG("field_187770_dm");

	/**
	 * <p>
	 * Name: ENTITY_SNOWBALL_THROW
	 * </p>
	 */
	public static McObfPair field_187797_fA = McMappingDatabase.getSRG("field_187797_fA");

	/**
	 * <p>
	 * Name: ENTITY_BLAZE_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187594_A = McMappingDatabase.getSRG("field_187594_A");

	/**
	 * <p>
	 * Name: EVOCATION_ILLAGER_DEATH
	 * </p>
	 */
	public static McObfPair field_191245_bo = McMappingDatabase.getSRG("field_191245_bo");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_DEATH
	 * </p>
	 */
	public static McObfPair field_187930_hd = McMappingDatabase.getSRG("field_187930_hd");

	/**
	 * <p>
	 * Name: ENTITY_ITEMFRAME_ADD_ITEM
	 * </p>
	 */
	public static McObfPair field_187620_cL = McMappingDatabase.getSRG("field_187620_cL");

	/**
	 * <p>
	 * Name: BLOCK_WOOD_PLACE
	 * </p>
	 */
	public static McObfPair field_187891_gV = McMappingDatabase.getSRG("field_187891_gV");

	/**
	 * <p>
	 * Name: ENTITY_WOLF_GROWL
	 * </p>
	 */
	public static McObfPair field_187861_gG = McMappingDatabase.getSRG("field_187861_gG");

	/**
	 * <p>
	 * Name: ENTITY_SPLASH_POTION_THROW
	 * </p>
	 */
	public static McObfPair field_187827_fP = McMappingDatabase.getSRG("field_187827_fP");

	/**
	 * <p>
	 * Name: ENTITY_ELDER_GUARDIAN_DEATH_LAND
	 * </p>
	 */
	public static McObfPair field_187516_aF = McMappingDatabase.getSRG("field_187516_aF");

	/**
	 * <p>
	 * Name: RECORD_WAIT
	 * </p>
	 */
	public static McObfPair field_187846_ey = McMappingDatabase.getSRG("field_187846_ey");

	/**
	 * <p>
	 * Name: ENTITY_HORSE_JUMP
	 * </p>
	 */
	public static McObfPair field_187720_cs = McMappingDatabase.getSRG("field_187720_cs");

	/**
	 * <p>
	 * Name: BLOCK_LAVA_POP
	 * </p>
	 */
	public static McObfPair field_187662_cZ = McMappingDatabase.getSRG("field_187662_cZ");

	/**
	 * <p>
	 * Name: RECORD_STRAD
	 * </p>
	 */
	public static McObfPair field_187844_ex = McMappingDatabase.getSRG("field_187844_ex");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_VILLAGER_HURT
	 * </p>
	 */
	public static McObfPair field_187944_hr = McMappingDatabase.getSRG("field_187944_hr");

	/**
	 * <p>
	 * Name: ENTITY_GENERIC_BURN
	 * </p>
	 */
	public static McObfPair field_187658_bx = McMappingDatabase.getSRG("field_187658_bx");

	/**
	 * <p>
	 * Name: E_PARROT_IM_STRAY
	 * </p>
	 */
	public static McObfPair field_193814_fd = McMappingDatabase.getSRG("field_193814_fd");

	/**
	 * <p>
	 * Name: ENTITY_BAT_LOOP
	 * </p>
	 */
	public static McObfPair field_189108_z = McMappingDatabase.getSRG("field_189108_z");

	/**
	 * <p>
	 * Name: ENTITY_ELDER_GUARDIAN_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187512_aB = McMappingDatabase.getSRG("field_187512_aB");

	/**
	 * <p>
	 * Name: ENTITY_POLAR_BEAR_BABY_AMBIENT
	 * </p>
	 */
	public static McObfPair field_190027_es = McMappingDatabase.getSRG("field_190027_es");

	/**
	 * <p>
	 * Name: ENTITY_HORSE_HURT
	 * </p>
	 */
	public static McObfPair field_187717_cr = McMappingDatabase.getSRG("field_187717_cr");

	/**
	 * <p>
	 * Name: ENTITY_WITHER_SKELETON_AMBIENT
	 * </p>
	 */
	public static McObfPair field_190036_ha = McMappingDatabase.getSRG("field_190036_ha");

	/**
	 * <p>
	 * Name: E_PARROT_IM_SPIDER
	 * </p>
	 */
	public static McObfPair field_193813_fc = McMappingDatabase.getSRG("field_193813_fc");

	/**
	 * <p>
	 * Name: ENTITY_SKELETON_HORSE_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187858_fe = McMappingDatabase.getSRG("field_187858_fe");

	/**
	 * <p>
	 * Name: ITEM_BOTTLE_EMPTY
	 * </p>
	 */
	public static McObfPair field_191241_J = McMappingDatabase.getSRG("field_191241_J");

	/**
	 * <p>
	 * Name: ENTITY_ENDERDRAGON_HURT
	 * </p>
	 */
	public static McObfPair field_187526_aP = McMappingDatabase.getSRG("field_187526_aP");

	/**
	 * <p>
	 * Name: BLOCK_STONE_BUTTON_CLICK_ON
	 * </p>
	 */
	public static McObfPair field_187839_fV = McMappingDatabase.getSRG("field_187839_fV");

	/**
	 * <p>
	 * Name: E_PARROT_IM_WITCH
	 * </p>
	 */
	public static McObfPair field_193817_fg = McMappingDatabase.getSRG("field_193817_fg");

	/**
	 * <p>
	 * Name: ENTITY_ILLUSION_ILLAGER_AMBIENT
	 * </p>
	 */
	public static McObfPair field_193783_dc = McMappingDatabase.getSRG("field_193783_dc");

	/**
	 * <p>
	 * Name: ENTITY_SLIME_ATTACK
	 * </p>
	 */
	public static McObfPair field_187870_fk = McMappingDatabase.getSRG("field_187870_fk");

	/**
	 * <p>
	 * Name: MUSIC_GAME
	 * </p>
	 */
	public static McObfPair field_187669_dB = McMappingDatabase.getSRG("field_187669_dB");

	/**
	 * <p>
	 * Name: ENTITY_STRAY_HURT
	 * </p>
	 */
	public static McObfPair field_190034_gw = McMappingDatabase.getSRG("field_190034_gw");

	/**
	 * <p>
	 * Name: ENTITY_HORSE_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187696_ck = McMappingDatabase.getSRG("field_187696_ck");

	/**
	 * <p>
	 * Name: BLOCK_NOTE_SNARE
	 * </p>
	 */
	public static McObfPair field_187688_dI = McMappingDatabase.getSRG("field_187688_dI");

	/**
	 * <p>
	 * Name: ENTITY_VILLAGER_TRADING
	 * </p>
	 */
	public static McObfPair field_187914_gn = McMappingDatabase.getSRG("field_187914_gn");

	/**
	 * <p>
	 * Name: ENTITY_GENERIC_EXPLODE
	 * </p>
	 */
	public static McObfPair field_187539_bB = McMappingDatabase.getSRG("field_187539_bB");

	/**
	 * <p>
	 * Name: ENTITY_SNOWMAN_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187799_fB = McMappingDatabase.getSRG("field_187799_fB");

	/**
	 * <p>
	 * Name: ENTITY_CREEPER_HURT
	 * </p>
	 */
	public static McObfPair field_187570_aq = McMappingDatabase.getSRG("field_187570_aq");

	/**
	 * <p>
	 * Name: ENTITY_WITHER_SPAWN
	 * </p>
	 */
	public static McObfPair field_187855_gD = McMappingDatabase.getSRG("field_187855_gD");

	/**
	 * <p>
	 * Name: ENTITY_SILVERFISH_DEATH
	 * </p>
	 */
	public static McObfPair field_187795_eZ = McMappingDatabase.getSRG("field_187795_eZ");

	/**
	 * <p>
	 * Name: ITEM_HOE_TILL
	 * </p>
	 */
	public static McObfPair field_187693_cj = McMappingDatabase.getSRG("field_187693_cj");

	/**
	 * <p>
	 * Name: RECORD_MALL
	 * </p>
	 */
	public static McObfPair field_187838_eu = McMappingDatabase.getSRG("field_187838_eu");

	/**
	 * <p>
	 * Name: ENTITY_ELDER_GUARDIAN_HURT_LAND
	 * </p>
	 */
	public static McObfPair field_187518_aH = McMappingDatabase.getSRG("field_187518_aH");

	/**
	 * <p>
	 * Name: BLOCK_WOOD_STEP
	 * </p>
	 */
	public static McObfPair field_187897_gY = McMappingDatabase.getSRG("field_187897_gY");

	/**
	 * <p>
	 * Name: UI_BUTTON_CLICK
	 * </p>
	 */
	public static McObfPair field_187909_gi = McMappingDatabase.getSRG("field_187909_gi");

	/**
	 * <p>
	 * Name: ENTITY_GUARDIAN_HURT
	 * </p>
	 */
	public static McObfPair field_187687_ch = McMappingDatabase.getSRG("field_187687_ch");

	/**
	 * <p>
	 * Name: ENTITY_VILLAGER_HURT
	 * </p>
	 */
	public static McObfPair field_187912_gl = McMappingDatabase.getSRG("field_187912_gl");

	/**
	 * <p>
	 * Name: BLOCK_ANVIL_BREAK
	 * </p>
	 */
	public static McObfPair field_187677_b = McMappingDatabase.getSRG("field_187677_b");

	/**
	 * <p>
	 * Name: ENTITY_POLAR_BEAR_HURT
	 * </p>
	 */
	public static McObfPair field_190029_eu = McMappingDatabase.getSRG("field_190029_eu");

	/**
	 * <p>
	 * Name: ENTITY_STRAY_STEP
	 * </p>
	 */
	public static McObfPair field_190035_gx = McMappingDatabase.getSRG("field_190035_gx");

	/**
	 * <p>
	 * Name: ENTITY_BOAT_PADDLE_LAND
	 * </p>
	 */
	public static McObfPair field_193778_H = McMappingDatabase.getSRG("field_193778_H");

	/**
	 * <p>
	 * Name: BLOCK_LADDER_BREAK
	 * </p>
	 */
	public static McObfPair field_187641_cS = McMappingDatabase.getSRG("field_187641_cS");

	/**
	 * <p>
	 * Name: ENTITY_SHULKER_CLOSE
	 * </p>
	 */
	public static McObfPair field_187779_eR = McMappingDatabase.getSRG("field_187779_eR");

	/**
	 * <p>
	 * Name: ENTITY_IRONGOLEM_HURT
	 * </p>
	 */
	public static McObfPair field_187602_cF = McMappingDatabase.getSRG("field_187602_cF");

	/**
	 * <p>
	 * Name: BLOCK_ANVIL_LAND
	 * </p>
	 */
	public static McObfPair field_187689_f = McMappingDatabase.getSRG("field_187689_f");

	/**
	 * <p>
	 * Name: ENTITY_POLAR_BEAR_WARNING
	 * </p>
	 */
	public static McObfPair field_190031_ew = McMappingDatabase.getSRG("field_190031_ew");

	/**
	 * <p>
	 * Name: ENTITY_ENDERDRAGON_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187521_aK = McMappingDatabase.getSRG("field_187521_aK");

	/**
	 * <p>
	 * Name: ENTITY_BAT_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187740_w = McMappingDatabase.getSRG("field_187740_w");

	/**
	 * <p>
	 * Name: ENTITY_WITCH_HURT
	 * </p>
	 */
	public static McObfPair field_187923_gw = McMappingDatabase.getSRG("field_187923_gw");

	/**
	 * <p>
	 * Name: ENTITY_SLIME_SQUISH
	 * </p>
	 */
	public static McObfPair field_187886_fs = McMappingDatabase.getSRG("field_187886_fs");

	/**
	 * <p>
	 * Name: BLOCK_LADDER_PLACE
	 * </p>
	 */
	public static McObfPair field_187650_cV = McMappingDatabase.getSRG("field_187650_cV");

	/**
	 * <p>
	 * Name: E_PARROT_IM_ELDER_GUARDIAN
	 * </p>
	 */
	public static McObfPair field_193793_eO = McMappingDatabase.getSRG("field_193793_eO");

	/**
	 * <p>
	 * Name: E_PARROT_IM_POLAR_BEAR
	 * </p>
	 */
	public static McObfPair field_193802_eX = McMappingDatabase.getSRG("field_193802_eX");

	/**
	 * <p>
	 * Name: ENTITY_ILLAGER_DEATH
	 * </p>
	 */
	public static McObfPair field_193786_de = McMappingDatabase.getSRG("field_193786_de");

	/**
	 * <p>
	 * Name: BLOCK_SAND_FALL
	 * </p>
	 */
	public static McObfPair field_187749_eC = McMappingDatabase.getSRG("field_187749_eC");

	/**
	 * <p>
	 * Name: ENTITY_PLAYER_ATTACK_CRIT
	 * </p>
	 */
	public static McObfPair field_187718_dS = McMappingDatabase.getSRG("field_187718_dS");

	/**
	 * <p>
	 * Name: BLOCK_GRAVEL_STEP
	 * </p>
	 */
	public static McObfPair field_187668_ca = McMappingDatabase.getSRG("field_187668_ca");

	/**
	 * <p>
	 * Name: ENTITY_COW_HURT
	 * </p>
	 */
	public static McObfPair field_187562_am = McMappingDatabase.getSRG("field_187562_am");

	/**
	 * <p>
	 * Name: ENTITY_IRONGOLEM_STEP
	 * </p>
	 */
	public static McObfPair field_187605_cG = McMappingDatabase.getSRG("field_187605_cG");

	/**
	 * <p>
	 * Name: BLOCK_METAL_PLACE
	 * </p>
	 */
	public static McObfPair field_187772_dn = McMappingDatabase.getSRG("field_187772_dn");

	/**
	 * <p>
	 * Name: BLOCK_STONE_BUTTON_CLICK_OFF
	 * </p>
	 */
	public static McObfPair field_187837_fU = McMappingDatabase.getSRG("field_187837_fU");

	/**
	 * <p>
	 * Name: BLOCK_METAL_FALL
	 * </p>
	 */
	public static McObfPair field_187768_dl = McMappingDatabase.getSRG("field_187768_dl");

	/**
	 * <p>
	 * Name: MUSIC_NETHER
	 * </p>
	 */
	public static McObfPair field_187673_dD = McMappingDatabase.getSRG("field_187673_dD");

	/**
	 * <p>
	 * Name: ENTITY_SNOWMAN_SHOOT
	 * </p>
	 */
	public static McObfPair field_187805_fE = McMappingDatabase.getSRG("field_187805_fE");

	/**
	 * <p>
	 * Name: ENTITY_PAINTING_BREAK
	 * </p>
	 */
	public static McObfPair field_187691_dJ = McMappingDatabase.getSRG("field_187691_dJ");

	/**
	 * <p>
	 * Name: E_PARROT_IM_MAGMACUBE
	 * </p>
	 */
	public static McObfPair field_193801_eW = McMappingDatabase.getSRG("field_193801_eW");

	/**
	 * <p>
	 * Name: ENTITY_GENERIC_DRINK
	 * </p>
	 */
	public static McObfPair field_187664_bz = McMappingDatabase.getSRG("field_187664_bz");

	/**
	 * <p>
	 * Name: ENTITY_STRAY_DEATH
	 * </p>
	 */
	public static McObfPair field_190033_gv = McMappingDatabase.getSRG("field_190033_gv");

	/**
	 * <p>
	 * Name: ENTITY_VEX_DEATH
	 * </p>
	 */
	public static McObfPair field_191266_he = McMappingDatabase.getSRG("field_191266_he");

	/**
	 * <p>
	 * Name: ITEM_FIRECHARGE_USE
	 * </p>
	 */
	public static McObfPair field_187616_bj = McMappingDatabase.getSRG("field_187616_bj");

	/**
	 * <p>
	 * Name: E_PARROT_IM_ENDERMAN
	 * </p>
	 */
	public static McObfPair field_193795_eQ = McMappingDatabase.getSRG("field_193795_eQ");

	/**
	 * <p>
	 * Name: ENTITY_HORSE_DEATH
	 * </p>
	 */
	public static McObfPair field_187708_co = McMappingDatabase.getSRG("field_187708_co");

	/**
	 * <p>
	 * Name: ENTITY_LLAMA_HURT
	 * </p>
	 */
	public static McObfPair field_191254_dE = McMappingDatabase.getSRG("field_191254_dE");

	/**
	 * <p>
	 * Name: ENTITY_ARMORSTAND_BREAK
	 * </p>
	 */
	public static McObfPair field_187701_j = McMappingDatabase.getSRG("field_187701_j");

	/**
	 * <p>
	 * Name: BLOCK_ANVIL_FALL
	 * </p>
	 */
	public static McObfPair field_187683_d = McMappingDatabase.getSRG("field_187683_d");

	/**
	 * <p>
	 * Name: BLOCK_SLIME_FALL
	 * </p>
	 */
	public static McObfPair field_187876_fn = McMappingDatabase.getSRG("field_187876_fn");

	/**
	 * <p>
	 * Name: RECORD_11
	 * </p>
	 */
	public static McObfPair field_187826_eo = McMappingDatabase.getSRG("field_187826_eo");

	/**
	 * <p>
	 * Name: VINDICATION_ILLAGER_DEATH
	 * </p>
	 */
	public static McObfPair field_191269_hn = McMappingDatabase.getSRG("field_191269_hn");

	/**
	 * <p>
	 * Name: ENTITY_PARROT_FLY
	 * </p>
	 */
	public static McObfPair field_192796_et = McMappingDatabase.getSRG("field_192796_et");

	/**
	 * <p>
	 * Name: ENTITY_PARROT_AMBIENT
	 * </p>
	 */
	public static McObfPair field_192792_ep = McMappingDatabase.getSRG("field_192792_ep");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_HURT
	 * </p>
	 */
	public static McObfPair field_187934_hh = McMappingDatabase.getSRG("field_187934_hh");

	/**
	 * <p>
	 * Name: ENTITY_WITHER_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187925_gy = McMappingDatabase.getSRG("field_187925_gy");

	/**
	 * <p>
	 * Name: BLOCK_CHEST_LOCKED
	 * </p>
	 */
	public static McObfPair field_187654_U = McMappingDatabase.getSRG("field_187654_U");

	/**
	 * <p>
	 * Name: BLOCK_NOTE_PLING
	 * </p>
	 */
	public static McObfPair field_189107_dL = McMappingDatabase.getSRG("field_189107_dL");

	/**
	 * <p>
	 * Name: BLOCK_LADDER_HIT
	 * </p>
	 */
	public static McObfPair field_187647_cU = McMappingDatabase.getSRG("field_187647_cU");

	/**
	 * <p>
	 * Name: BLOCK_GRASS_FALL
	 * </p>
	 */
	public static McObfPair field_187573_bS = McMappingDatabase.getSRG("field_187573_bS");

	/**
	 * <p>
	 * Name: ENTITY_VILLAGER_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187910_gj = McMappingDatabase.getSRG("field_187910_gj");

	/**
	 * <p>
	 * Name: BLOCK_WOOD_BUTTON_CLICK_ON
	 * </p>
	 */
	public static McObfPair field_187885_gS = McMappingDatabase.getSRG("field_187885_gS");

	/**
	 * <p>
	 * Name: ENTITY_ENDEREYE_DEATH
	 * </p>
	 */
	public static McObfPair field_193777_bb = McMappingDatabase.getSRG("field_193777_bb");

	/**
	 * <p>
	 * Name: ENTITY_FIREWORK_LARGE_BLAST
	 * </p>
	 */
	public static McObfPair field_187625_bm = McMappingDatabase.getSRG("field_187625_bm");

	/**
	 * <p>
	 * Name: ENTITY_CAT_HURT
	 * </p>
	 */
	public static McObfPair field_187642_Q = McMappingDatabase.getSRG("field_187642_Q");

	/**
	 * <p>
	 * Name: ENTITY_MULE_CHEST
	 * </p>
	 */
	public static McObfPair field_191259_dX = McMappingDatabase.getSRG("field_191259_dX");

	/**
	 * <p>
	 * Name: BLOCK_WOOD_BREAK
	 * </p>
	 */
	public static McObfPair field_187881_gQ = McMappingDatabase.getSRG("field_187881_gQ");

	/**
	 * <p>
	 * Name: BLOCK_TRIPWIRE_ATTACH
	 * </p>
	 */
	public static McObfPair field_187905_ge = McMappingDatabase.getSRG("field_187905_ge");

	/**
	 * <p>
	 * Name: ENTITY_CHICKEN_HURT
	 * </p>
	 */
	public static McObfPair field_187666_Z = McMappingDatabase.getSRG("field_187666_Z");

	/**
	 * <p>
	 * Name: ENTITY_CREEPER_PRIMED
	 * </p>
	 */
	public static McObfPair field_187572_ar = McMappingDatabase.getSRG("field_187572_ar");

	/**
	 * <p>
	 * Name: ENTITY_SMALL_MAGMACUBE_DEATH
	 * </p>
	 */
	public static McObfPair field_187890_fu = McMappingDatabase.getSRG("field_187890_fu");

	/**
	 * <p>
	 * Name: BLOCK_GLASS_PLACE
	 * </p>
	 */
	public static McObfPair field_187567_bP = McMappingDatabase.getSRG("field_187567_bP");

	/**
	 * <p>
	 * Name: ENTITY_GENERIC_EAT
	 * </p>
	 */
	public static McObfPair field_187537_bA = McMappingDatabase.getSRG("field_187537_bA");

	/**
	 * <p>
	 * Name: BLOCK_IRON_TRAPDOOR_CLOSE
	 * </p>
	 */
	public static McObfPair field_187614_cJ = McMappingDatabase.getSRG("field_187614_cJ");

	/**
	 * <p>
	 * Name: BLOCK_END_PORTAL_FRAME_FILL
	 * </p>
	 */
	public static McObfPair field_193781_bp = McMappingDatabase.getSRG("field_193781_bp");

	/**
	 * <p>
	 * Name: E_PARROT_IM_VINDICATION_ILLAGER
	 * </p>
	 */
	public static McObfPair field_193816_ff = McMappingDatabase.getSRG("field_193816_ff");

	/**
	 * <p>
	 * Name: ENTITY_SPIDER_DEATH
	 * </p>
	 */
	public static McObfPair field_187819_fL = McMappingDatabase.getSRG("field_187819_fL");

	/**
	 * <p>
	 * Name: ENTITY_GENERIC_HURT
	 * </p>
	 */
	public static McObfPair field_187543_bD = McMappingDatabase.getSRG("field_187543_bD");

	/**
	 * <p>
	 * Name: EVOCATION_ILLAGER_CAST_SPELL
	 * </p>
	 */
	public static McObfPair field_191244_bn = McMappingDatabase.getSRG("field_191244_bn");

	/**
	 * <p>
	 * Name: ENTITY_CHICKEN_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187660_W = McMappingDatabase.getSRG("field_187660_W");

	/**
	 * <p>
	 * Name: BLOCK_GRASS_STEP
	 * </p>
	 */
	public static McObfPair field_187579_bV = McMappingDatabase.getSRG("field_187579_bV");

	/**
	 * <p>
	 * Name: ENTITY_SHULKER_TELEPORT
	 * </p>
	 */
	public static McObfPair field_187791_eX = McMappingDatabase.getSRG("field_187791_eX");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_HORSE_DEATH
	 * </p>
	 */
	public static McObfPair field_187932_hf = McMappingDatabase.getSRG("field_187932_hf");

	/**
	 * <p>
	 * Name: ENTITY_ITEMFRAME_PLACE
	 * </p>
	 */
	public static McObfPair field_187626_cN = McMappingDatabase.getSRG("field_187626_cN");

	/**
	 * <p>
	 * Name: ENTITY_WITCH_DEATH
	 * </p>
	 */
	public static McObfPair field_187921_gu = McMappingDatabase.getSRG("field_187921_gu");

	/**
	 * <p>
	 * Name: ENTITY_ARROW_SHOOT
	 * </p>
	 */
	public static McObfPair field_187737_v = McMappingDatabase.getSRG("field_187737_v");

	/**
	 * <p>
	 * Name: ENTITY_GENERIC_DEATH
	 * </p>
	 */
	public static McObfPair field_187661_by = McMappingDatabase.getSRG("field_187661_by");

	/**
	 * <p>
	 * Name: BLOCK_WOODEN_TRAPDOOR_OPEN
	 * </p>
	 */
	public static McObfPair field_187879_gP = McMappingDatabase.getSRG("field_187879_gP");

	/**
	 * <p>
	 * Name: ENTITY_EXPERIENCE_ORB_PICKUP
	 * </p>
	 */
	public static McObfPair field_187604_bf = McMappingDatabase.getSRG("field_187604_bf");

	/**
	 * <p>
	 * Name: MUSIC_CREATIVE
	 * </p>
	 */
	public static McObfPair field_187792_dx = McMappingDatabase.getSRG("field_187792_dx");

	/**
	 * <p>
	 * Name: ENTITY_GENERIC_SMALL_FALL
	 * </p>
	 */
	public static McObfPair field_187545_bE = McMappingDatabase.getSRG("field_187545_bE");

	/**
	 * <p>
	 * Name: ENTITY_FIREWORK_LARGE_BLAST_FAR
	 * </p>
	 */
	public static McObfPair field_187628_bn = McMappingDatabase.getSRG("field_187628_bn");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_HORSE_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187931_he = McMappingDatabase.getSRG("field_187931_he");

	/**
	 * <p>
	 * Name: BLOCK_DISPENSER_FAIL
	 * </p>
	 */
	public static McObfPair field_187576_at = McMappingDatabase.getSRG("field_187576_at");

	/**
	 * <p>
	 * Name: ENTITY_LLAMA_ANGRY
	 * </p>
	 */
	public static McObfPair field_191250_dA = McMappingDatabase.getSRG("field_191250_dA");

	/**
	 * <p>
	 * Name: ITEM_ARMOR_EQUIP_GOLD
	 * </p>
	 */
	public static McObfPair field_187722_q = McMappingDatabase.getSRG("field_187722_q");

	/**
	 * <p>
	 * Name: BLOCK_GRAVEL_HIT
	 * </p>
	 */
	public static McObfPair field_187585_bY = McMappingDatabase.getSRG("field_187585_bY");

	/**
	 * <p>
	 * Name: ENTITY_SMALL_SLIME_JUMP
	 * </p>
	 */
	public static McObfPair field_189110_fE = McMappingDatabase.getSRG("field_189110_fE");

	/**
	 * <p>
	 * Name: ENTITY_FIREWORK_SHOOT
	 * </p>
	 */
	public static McObfPair field_187634_bp = McMappingDatabase.getSRG("field_187634_bp");

	/**
	 * <p>
	 * Name: VINDICATION_ILLAGER_AMBIENT
	 * </p>
	 */
	public static McObfPair field_191268_hm = McMappingDatabase.getSRG("field_191268_hm");

	/**
	 * <p>
	 * Name: BLOCK_SHULKER_BOX_CLOSE
	 * </p>
	 */
	public static McObfPair field_191261_fA = McMappingDatabase.getSRG("field_191261_fA");

	/**
	 * <p>
	 * Name: ITEM_ARMOR_EQUIP_IRON
	 * </p>
	 */
	public static McObfPair field_187725_r = McMappingDatabase.getSRG("field_187725_r");

	/**
	 * <p>
	 * Name: ENTITY_WITCH_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187920_gt = McMappingDatabase.getSRG("field_187920_gt");

	/**
	 * <p>
	 * Name: BLOCK_SNOW_PLACE
	 * </p>
	 */
	public static McObfPair field_187813_fI = McMappingDatabase.getSRG("field_187813_fI");

	/**
	 * <p>
	 * Name: ENTITY_HORSE_GALLOP
	 * </p>
	 */
	public static McObfPair field_187714_cq = McMappingDatabase.getSRG("field_187714_cq");

	/**
	 * <p>
	 * Name: ENTITY_ILLAGER_PREPARE_BLINDNESS
	 * </p>
	 */
	public static McObfPair field_193789_dh = McMappingDatabase.getSRG("field_193789_dh");

	/**
	 * <p>
	 * Name: BLOCK_REDSTONE_TORCH_BURNOUT
	 * </p>
	 */
	public static McObfPair field_187745_eA = McMappingDatabase.getSRG("field_187745_eA");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_VILLAGER_CONVERTED
	 * </p>
	 */
	public static McObfPair field_187941_ho = McMappingDatabase.getSRG("field_187941_ho");

	/**
	 * <p>
	 * Name: BLOCK_CLOTH_STEP
	 * </p>
	 */
	public static McObfPair field_187554_ai = McMappingDatabase.getSRG("field_187554_ai");

	/**
	 * <p>
	 * Name: ITEM_BUCKET_FILL_LAVA
	 * </p>
	 */
	public static McObfPair field_187633_N = McMappingDatabase.getSRG("field_187633_N");

	/**
	 * <p>
	 * Name: BLOCK_COMPARATOR_CLICK
	 * </p>
	 */
	public static McObfPair field_187556_aj = McMappingDatabase.getSRG("field_187556_aj");

	/**
	 * <p>
	 * Name: BLOCK_BREWING_STAND_BREW
	 * </p>
	 */
	public static McObfPair field_187621_J = McMappingDatabase.getSRG("field_187621_J");

	/**
	 * <p>
	 * Name: E_PARROT_IM_WITHER
	 * </p>
	 */
	public static McObfPair field_193818_fh = McMappingDatabase.getSRG("field_193818_fh");

	/**
	 * <p>
	 * Name: RECORD_13
	 * </p>
	 */
	public static McObfPair field_187828_ep = McMappingDatabase.getSRG("field_187828_ep");

	/**
	 * <p>
	 * Name: ENTITY_GENERIC_EXTINGUISH_FIRE
	 * </p>
	 */
	public static McObfPair field_187541_bC = McMappingDatabase.getSRG("field_187541_bC");

	/**
	 * <p>
	 * Name: ENTITY_ARMORSTAND_PLACE
	 * </p>
	 */
	public static McObfPair field_187710_m = McMappingDatabase.getSRG("field_187710_m");

	/**
	 * <p>
	 * Name: ENTITY_ENDERMEN_TELEPORT
	 * </p>
	 */
	public static McObfPair field_187534_aX = McMappingDatabase.getSRG("field_187534_aX");

	/**
	 * <p>
	 * Name: ENTITY_HOSTILE_HURT
	 * </p>
	 */
	public static McObfPair field_187741_cz = McMappingDatabase.getSRG("field_187741_cz");

	/**
	 * <p>
	 * Name: ENTITY_DONKEY_CHEST
	 * </p>
	 */
	public static McObfPair field_187584_ax = McMappingDatabase.getSRG("field_187584_ax");

	/**
	 * <p>
	 * Name: ENTITY_ELDERGUARDIAN_AMBIENTLAND
	 * </p>
	 */
	public static McObfPair field_187513_aC = McMappingDatabase.getSRG("field_187513_aC");

	/**
	 * <p>
	 * Name: BLOCK_NOTE_BELL
	 * </p>
	 */
	public static McObfPair field_193807_ew = McMappingDatabase.getSRG("field_193807_ew");

	/**
	 * <p>
	 * Name: ENTITY_SQUID_DEATH
	 * </p>
	 */
	public static McObfPair field_187831_fR = McMappingDatabase.getSRG("field_187831_fR");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_HORSE_HURT
	 * </p>
	 */
	public static McObfPair field_187933_hg = McMappingDatabase.getSRG("field_187933_hg");

	/**
	 * <p>
	 * Name: ENTITY_GUARDIAN_DEATH
	 * </p>
	 */
	public static McObfPair field_187678_ce = McMappingDatabase.getSRG("field_187678_ce");

	/**
	 * <p>
	 * Name: ENTITY_IRONGOLEM_DEATH
	 * </p>
	 */
	public static McObfPair field_187599_cE = McMappingDatabase.getSRG("field_187599_cE");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_STEP
	 * </p>
	 */
	public static McObfPair field_187939_hm = McMappingDatabase.getSRG("field_187939_hm");

	/**
	 * <p>
	 * Name: ENTITY_PLAYER_HURT_ON_FIRE
	 * </p>
	 */
	public static McObfPair field_193806_fH = McMappingDatabase.getSRG("field_193806_fH");

	/**
	 * <p>
	 * Name: BLOCK_SHULKER_BOX_OPEN
	 * </p>
	 */
	public static McObfPair field_191262_fB = McMappingDatabase.getSRG("field_191262_fB");

	/**
	 * <p>
	 * Name: ITEM_SHIELD_BLOCK
	 * </p>
	 */
	public static McObfPair field_187767_eL = McMappingDatabase.getSRG("field_187767_eL");

	/**
	 * <p>
	 * Name: ENTITY_SKELETON_HURT
	 * </p>
	 */
	public static McObfPair field_187864_fh = McMappingDatabase.getSRG("field_187864_fh");

	/**
	 * <p>
	 * Name: ENTITY_COW_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187558_ak = McMappingDatabase.getSRG("field_187558_ak");

	/**
	 * <p>
	 * Name: BLOCK_WOOD_PRESSPLATE_CLICK_ON
	 * </p>
	 */
	public static McObfPair field_187895_gX = McMappingDatabase.getSRG("field_187895_gX");

	/**
	 * <p>
	 * Name: E_PARROT_IM_ILLUSION_ILLAGER
	 * </p>
	 */
	public static McObfPair field_193800_eV = McMappingDatabase.getSRG("field_193800_eV");

	/**
	 * <p>
	 * Name: ENTITY_PLAYER_BIG_FALL
	 * </p>
	 */
	public static McObfPair field_187736_dY = McMappingDatabase.getSRG("field_187736_dY");

	/**
	 * <p>
	 * Name: BLOCK_SNOW_HIT
	 * </p>
	 */
	public static McObfPair field_187811_fH = McMappingDatabase.getSRG("field_187811_fH");

	/**
	 * <p>
	 * Name: BLOCK_METAL_PRESSPLATE_CLICK_ON
	 * </p>
	 */
	public static McObfPair field_187776_dp = McMappingDatabase.getSRG("field_187776_dp");

	/**
	 * <p>
	 * Name: ENTITY_SHULKER_BULLET_HURT
	 * </p>
	 */
	public static McObfPair field_187777_eQ = McMappingDatabase.getSRG("field_187777_eQ");

	/**
	 * <p>
	 * Name: ENTITY_SHEEP_STEP
	 * </p>
	 */
	public static McObfPair field_187765_eK = McMappingDatabase.getSRG("field_187765_eK");

	/**
	 * <p>
	 * Name: ENTITY_RABBIT_HURT
	 * </p>
	 */
	public static McObfPair field_187822_em = McMappingDatabase.getSRG("field_187822_em");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187899_gZ = McMappingDatabase.getSRG("field_187899_gZ");

	/**
	 * <p>
	 * Name: ITEM_SHOVEL_FLATTEN
	 * </p>
	 */
	public static McObfPair field_187771_eN = McMappingDatabase.getSRG("field_187771_eN");

	/**
	 * <p>
	 * Name: BLOCK_ENCHANTMENT_TABLE_USE
	 * </p>
	 */
	public static McObfPair field_190021_aL = McMappingDatabase.getSRG("field_190021_aL");

	/**
	 * <p>
	 * Name: ENTITY_LLAMA_AMBIENT
	 * </p>
	 */
	public static McObfPair field_191260_dz = McMappingDatabase.getSRG("field_191260_dz");

	/**
	 * <p>
	 * Name: ENTITY_FIREWORK_BLAST_FAR
	 * </p>
	 */
	public static McObfPair field_187622_bl = McMappingDatabase.getSRG("field_187622_bl");

	/**
	 * <p>
	 * Name: BLOCK_WOOD_FALL
	 * </p>
	 */
	public static McObfPair field_187887_gT = McMappingDatabase.getSRG("field_187887_gT");

	/**
	 * <p>
	 * Name: ENTITY_MAGMACUBE_HURT
	 * </p>
	 */
	public static McObfPair field_187760_dh = McMappingDatabase.getSRG("field_187760_dh");

	/**
	 * <p>
	 * Name: ENTITY_CHICKEN_EGG
	 * </p>
	 */
	public static McObfPair field_187665_Y = McMappingDatabase.getSRG("field_187665_Y");

	/**
	 * <p>
	 * Name: ENTITY_BLAZE_BURN
	 * </p>
	 */
	public static McObfPair field_187597_B = McMappingDatabase.getSRG("field_187597_B");

	/**
	 * <p>
	 * Name: ENTITY_VINDICATION_ILLAGER_HURT
	 * </p>
	 */
	public static McObfPair field_191270_ho = McMappingDatabase.getSRG("field_191270_ho");

	/**
	 * <p>
	 * Name: E_PARROT_IM_SILVERFISH
	 * </p>
	 */
	public static McObfPair field_193804_eZ = McMappingDatabase.getSRG("field_193804_eZ");

	/**
	 * <p>
	 * Name: ENTITY_EGG_THROW
	 * </p>
	 */
	public static McObfPair field_187511_aA = McMappingDatabase.getSRG("field_187511_aA");

	/**
	 * <p>
	 * Name: ENTITY_LLAMA_SPIT
	 * </p>
	 */
	public static McObfPair field_191255_dF = McMappingDatabase.getSRG("field_191255_dF");

	/**
	 * <p>
	 * Name: ENTITY_BOBBER_THROW
	 * </p>
	 */
	public static McObfPair field_187612_G = McMappingDatabase.getSRG("field_187612_G");

	/**
	 * <p>
	 * Name: ENTITY_GUARDIAN_HURT_LAND
	 * </p>
	 */
	public static McObfPair field_187690_ci = McMappingDatabase.getSRG("field_187690_ci");

	/**
	 * <p>
	 * Name: BLOCK_CHORUS_FLOWER_GROW
	 * </p>
	 */
	public static McObfPair field_187542_ac = McMappingDatabase.getSRG("field_187542_ac");

	/**
	 * <p>
	 * Name: E_PARROT_IM_ZOMBIE_VILLAGER
	 * </p>
	 */
	public static McObfPair field_193823_fm = McMappingDatabase.getSRG("field_193823_fm");

	/**
	 * <p>
	 * Name: ENTITY_GUARDIAN_FLOP
	 * </p>
	 */
	public static McObfPair field_187684_cg = McMappingDatabase.getSRG("field_187684_cg");

	/**
	 * <p>
	 * Name: BLOCK_GRASS_PLACE
	 * </p>
	 */
	public static McObfPair field_187577_bU = McMappingDatabase.getSRG("field_187577_bU");

	/**
	 * <p>
	 * Name: BLOCK_STONE_HIT
	 * </p>
	 */
	public static McObfPair field_187843_fX = McMappingDatabase.getSRG("field_187843_fX");

	/**
	 * <p>
	 * Name: BLOCK_SNOW_FALL
	 * </p>
	 */
	public static McObfPair field_187809_fG = McMappingDatabase.getSRG("field_187809_fG");

	/**
	 * <p>
	 * Name: E_PARROT_IM_GHAST
	 * </p>
	 */
	public static McObfPair field_193798_eT = McMappingDatabase.getSRG("field_193798_eT");

	/**
	 * <p>
	 * Name: BLOCK_END_PORTAL_SPAWN
	 * </p>
	 */
	public static McObfPair field_193782_bq = McMappingDatabase.getSRG("field_193782_bq");

	/**
	 * <p>
	 * Name: E_PARROT_IM_SHULKER
	 * </p>
	 */
	public static McObfPair field_193803_eY = McMappingDatabase.getSRG("field_193803_eY");

	/**
	 * <p>
	 * Name: BLOCK_SLIME_HIT
	 * </p>
	 */
	public static McObfPair field_187878_fo = McMappingDatabase.getSRG("field_187878_fo");

	/**
	 * <p>
	 * Name: ENTITY_ENDERMEN_STARE
	 * </p>
	 */
	public static McObfPair field_187533_aW = McMappingDatabase.getSRG("field_187533_aW");

	/**
	 * <p>
	 * Name: BLOCK_ANVIL_PLACE
	 * </p>
	 */
	public static McObfPair field_187692_g = McMappingDatabase.getSRG("field_187692_g");

	/**
	 * <p>
	 * Name: BLOCK_FURNACE_FIRE_CRACKLE
	 * </p>
	 */
	public static McObfPair field_187652_bv = McMappingDatabase.getSRG("field_187652_bv");

	/**
	 * <p>
	 * Name: ENTITY_FIREWORK_TWINKLE_FAR
	 * </p>
	 */
	public static McObfPair field_187640_br = McMappingDatabase.getSRG("field_187640_br");

	/**
	 * <p>
	 * Name: ENTITY_MAGMACUBE_SQUISH
	 * </p>
	 */
	public static McObfPair field_187764_dj = McMappingDatabase.getSRG("field_187764_dj");

	/**
	 * <p>
	 * Name: ENTITY_HORSE_BREATHE
	 * </p>
	 */
	public static McObfPair field_187705_cn = McMappingDatabase.getSRG("field_187705_cn");

	/**
	 * <p>
	 * Name: ENTITY_PIG_STEP
	 * </p>
	 */
	public static McObfPair field_187709_dP = McMappingDatabase.getSRG("field_187709_dP");

	/**
	 * <p>
	 * Name: ENTITY_MAGMACUBE_DEATH
	 * </p>
	 */
	public static McObfPair field_187758_dg = McMappingDatabase.getSRG("field_187758_dg");

	/**
	 * <p>
	 * Name: RECORD_WARD
	 * </p>
	 */
	public static McObfPair field_187848_ez = McMappingDatabase.getSRG("field_187848_ez");

	/**
	 * <p>
	 * Name: BLOCK_FIRE_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187643_bs = McMappingDatabase.getSRG("field_187643_bs");

	/**
	 * <p>
	 * Name: ENTITY_GHAST_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187551_bH = McMappingDatabase.getSRG("field_187551_bH");

	/**
	 * <p>
	 * Name: ENTITY_PLAYER_HURT_DROWN
	 * </p>
	 */
	public static McObfPair field_193805_fG = McMappingDatabase.getSRG("field_193805_fG");

	/**
	 * <p>
	 * Name: ENTITY_BOAT_PADDLE_WATER
	 * </p>
	 */
	public static McObfPair field_193779_I = McMappingDatabase.getSRG("field_193779_I");

	/**
	 * <p>
	 * Name: ENTITY_HOSTILE_SMALL_FALL
	 * </p>
	 */
	public static McObfPair field_187589_cA = McMappingDatabase.getSRG("field_187589_cA");

	/**
	 * <p>
	 * Name: ENTITY_FIREWORK_BLAST
	 * </p>
	 */
	public static McObfPair field_187619_bk = McMappingDatabase.getSRG("field_187619_bk");

	/**
	 * <p>
	 * Name: BLOCK_NOTE_HARP
	 * </p>
	 */
	public static McObfPair field_187682_dG = McMappingDatabase.getSRG("field_187682_dG");

	/**
	 * <p>
	 * Name: ENTITY_LINGERINGPOTION_THROW
	 * </p>
	 */
	public static McObfPair field_187756_df = McMappingDatabase.getSRG("field_187756_df");

	/**
	 * <p>
	 * Name: ENTITY_VEX_CHARGE
	 * </p>
	 */
	public static McObfPair field_191265_hd = McMappingDatabase.getSRG("field_191265_hd");

	/**
	 * <p>
	 * Name: BLOCK_WOOD_HIT
	 * </p>
	 */
	public static McObfPair field_187889_gU = McMappingDatabase.getSRG("field_187889_gU");

	/**
	 * <p>
	 * Name: BLOCK_WOODEN_DOOR_CLOSE
	 * </p>
	 */
	public static McObfPair field_187873_gM = McMappingDatabase.getSRG("field_187873_gM");

	/**
	 * <p>
	 * Name: E_PARROT_IM_SLIME
	 * </p>
	 */
	public static McObfPair field_193812_fb = McMappingDatabase.getSRG("field_193812_fb");

	/**
	 * <p>
	 * Name: ENTITY_BLAZE_SHOOT
	 * </p>
	 */
	public static McObfPair field_187606_E = McMappingDatabase.getSRG("field_187606_E");

	/**
	 * <p>
	 * Name: BLOCK_PORTAL_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187810_eg = McMappingDatabase.getSRG("field_187810_eg");

	/**
	 * <p>
	 * Name: ENTITY_SPIDER_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187817_fK = McMappingDatabase.getSRG("field_187817_fK");

	/**
	 * <p>
	 * Name: ENTITY_SHEEP_SHEAR
	 * </p>
	 */
	public static McObfPair field_187763_eJ = McMappingDatabase.getSRG("field_187763_eJ");

	/**
	 * <p>
	 * Name: BLOCK_FENCE_GATE_OPEN
	 * </p>
	 */
	public static McObfPair field_187613_bi = McMappingDatabase.getSRG("field_187613_bi");

	/**
	 * <p>
	 * Name: BLOCK_NOTE_XYLOPHONE
	 * </p>
	 */
	public static McObfPair field_193785_eE = McMappingDatabase.getSRG("field_193785_eE");

	/**
	 * <p>
	 * Name: ENTITY_DONKEY_ANGRY
	 * </p>
	 */
	public static McObfPair field_187582_aw = McMappingDatabase.getSRG("field_187582_aw");

	/**
	 * <p>
	 * Name: ENTITY_CREEPER_DEATH
	 * </p>
	 */
	public static McObfPair field_187568_ap = McMappingDatabase.getSRG("field_187568_ap");

	/**
	 * <p>
	 * Name: BLOCK_NOTE_BASS
	 * </p>
	 */
	public static McObfPair field_187679_dF = McMappingDatabase.getSRG("field_187679_dF");

	/**
	 * <p>
	 * Name: ENTITY_PLAYER_SWIM
	 * </p>
	 */
	public static McObfPair field_187808_ef = McMappingDatabase.getSRG("field_187808_ef");

	/**
	 * <p>
	 * Name: RECORD_FAR
	 * </p>
	 */
	public static McObfPair field_187836_et = McMappingDatabase.getSRG("field_187836_et");

	/**
	 * <p>
	 * Name: BLOCK_PORTAL_TRIGGER
	 * </p>
	 */
	public static McObfPair field_187814_ei = McMappingDatabase.getSRG("field_187814_ei");

	/**
	 * <p>
	 * Name: ENTITY_ENDERMITE_STEP
	 * </p>
	 */
	public static McObfPair field_187592_bb = McMappingDatabase.getSRG("field_187592_bb");

	/**
	 * <p>
	 * Name: ENTITY_VILLAGER_NO
	 * </p>
	 */
	public static McObfPair field_187913_gm = McMappingDatabase.getSRG("field_187913_gm");

	/**
	 * <p>
	 * Name: BLOCK_END_GATEWAY_SPAWN
	 * </p>
	 */
	public static McObfPair field_187598_bd = McMappingDatabase.getSRG("field_187598_bd");

	/**
	 * <p>
	 * Name: RECORD_BLOCKS
	 * </p>
	 */
	public static McObfPair field_187830_eq = McMappingDatabase.getSRG("field_187830_eq");

	/**
	 * <p>
	 * Name: ENTITY_SMALL_SLIME_HURT
	 * </p>
	 */
	public static McObfPair field_187898_fy = McMappingDatabase.getSRG("field_187898_fy");

	/**
	 * <p>
	 * Name: ENTITY_LEASHKNOT_BREAK
	 * </p>
	 */
	public static McObfPair field_187746_da = McMappingDatabase.getSRG("field_187746_da");

	/**
	 * <p>
	 * Name: ENTITY_SILVERFISH_STEP
	 * </p>
	 */
	public static McObfPair field_187852_fb = McMappingDatabase.getSRG("field_187852_fb");

	/**
	 * <p>
	 * Name: BLOCK_GRASS_BREAK
	 * </p>
	 */
	public static McObfPair field_187571_bR = McMappingDatabase.getSRG("field_187571_bR");

	/**
	 * <p>
	 * Name: ENTITY_SMALL_SLIME_DEATH
	 * </p>
	 */
	public static McObfPair field_187896_fx = McMappingDatabase.getSRG("field_187896_fx");

	/**
	 * <p>
	 * Name: BLOCK_METAL_STEP
	 * </p>
	 */
	public static McObfPair field_187778_dq = McMappingDatabase.getSRG("field_187778_dq");

	/**
	 * <p>
	 * Name: RECORD_CAT
	 * </p>
	 */
	public static McObfPair field_187832_er = McMappingDatabase.getSRG("field_187832_er");

	/**
	 * <p>
	 * Name: WEATHER_RAIN
	 * </p>
	 */
	public static McObfPair field_187918_gr = McMappingDatabase.getSRG("field_187918_gr");

	/**
	 * <p>
	 * Name: UI_TOAST_OUT
	 * </p>
	 */
	public static McObfPair field_194227_ie = McMappingDatabase.getSRG("field_194227_ie");

	/**
	 * <p>
	 * Name: EVOCATION_FANGS_ATTACK
	 * </p>
	 */
	public static McObfPair field_191242_bl = McMappingDatabase.getSRG("field_191242_bl");

	/**
	 * <p>
	 * Name: ENTITY_LIGHTNING_THUNDER
	 * </p>
	 */
	public static McObfPair field_187754_de = McMappingDatabase.getSRG("field_187754_de");

	/**
	 * <p>
	 * Name: ENTITY_SQUID_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187829_fQ = McMappingDatabase.getSRG("field_187829_fQ");

	/**
	 * <p>
	 * Name: ENTITY_ENDERMEN_SCREAM
	 * </p>
	 */
	public static McObfPair field_187532_aV = McMappingDatabase.getSRG("field_187532_aV");

	/**
	 * <p>
	 * Name: ENTITY_PARROT_EAT
	 * </p>
	 */
	public static McObfPair field_192797_eu = McMappingDatabase.getSRG("field_192797_eu");

	/**
	 * <p>
	 * Name: ENTITY_ENDERDRAGON_FIREBALL_EPLD
	 * </p>
	 */
	public static McObfPair field_187523_aM = McMappingDatabase.getSRG("field_187523_aM");

	/**
	 * <p>
	 * Name: ENTITY_CAT_PURREOW
	 * </p>
	 */
	public static McObfPair field_187648_S = McMappingDatabase.getSRG("field_187648_S");

	/**
	 * <p>
	 * Name: ENTITY_RABBIT_JUMP
	 * </p>
	 */
	public static McObfPair field_187824_en = McMappingDatabase.getSRG("field_187824_en");

	/**
	 * <p>
	 * Name: ITEM_FLINTANDSTEEL_USE
	 * </p>
	 */
	public static McObfPair field_187649_bu = McMappingDatabase.getSRG("field_187649_bu");

	/**
	 * <p>
	 * Name: ENTITY_WITHER_SKELETON_HURT
	 * </p>
	 */
	public static McObfPair field_190038_hc = McMappingDatabase.getSRG("field_190038_hc");

	/**
	 * <p>
	 * Name: BLOCK_WATERLILY_PLACE
	 * </p>
	 */
	public static McObfPair field_187916_gp = McMappingDatabase.getSRG("field_187916_gp");

	/**
	 * <p>
	 * Name: BLOCK_PISTON_EXTEND
	 * </p>
	 */
	public static McObfPair field_187715_dR = McMappingDatabase.getSRG("field_187715_dR");

	/**
	 * <p>
	 * Name: BLOCK_GRAVEL_BREAK
	 * </p>
	 */
	public static McObfPair field_187581_bW = McMappingDatabase.getSRG("field_187581_bW");

	/**
	 * <p>
	 * Name: ENTITY_SHULKER_SHOOT
	 * </p>
	 */
	public static McObfPair field_187789_eW = McMappingDatabase.getSRG("field_187789_eW");

	/**
	 * <p>
	 * Name: BLOCK_STONE_PLACE
	 * </p>
	 */
	public static McObfPair field_187845_fY = McMappingDatabase.getSRG("field_187845_fY");

	/**
	 * <p>
	 * Name: BLOCK_LEVER_CLICK
	 * </p>
	 */
	public static McObfPair field_187750_dc = McMappingDatabase.getSRG("field_187750_dc");

	/**
	 * <p>
	 * Name: ENTITY_MULE_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187786_du = McMappingDatabase.getSRG("field_187786_du");

	/**
	 * <p>
	 * Name: BLOCK_DISPENSER_LAUNCH
	 * </p>
	 */
	public static McObfPair field_187578_au = McMappingDatabase.getSRG("field_187578_au");

	/**
	 * <p>
	 * Name: BLOCK_WATER_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187917_gq = McMappingDatabase.getSRG("field_187917_gq");

	/**
	 * <p>
	 * Name: ENTITY_SPIDER_STEP
	 * </p>
	 */
	public static McObfPair field_187823_fN = McMappingDatabase.getSRG("field_187823_fN");

	/**
	 * <p>
	 * Name: RECORD_MELLOHI
	 * </p>
	 */
	public static McObfPair field_187840_ev = McMappingDatabase.getSRG("field_187840_ev");

	/**
	 * <p>
	 * Name: BLOCK_STONE_PRESSPLATE_CLICK_OFF
	 * </p>
	 */
	public static McObfPair field_187847_fZ = McMappingDatabase.getSRG("field_187847_fZ");

	/**
	 * <p>
	 * Name: ENTITY_RABBIT_DEATH
	 * </p>
	 */
	public static McObfPair field_187820_el = McMappingDatabase.getSRG("field_187820_el");

	/**
	 * <p>
	 * Name: ENTITY_SMALL_MAGMACUBE_HURT
	 * </p>
	 */
	public static McObfPair field_187892_fv = McMappingDatabase.getSRG("field_187892_fv");

	/**
	 * <p>
	 * Name: ENTITY_PLAYER_ATTACK_WEAK
	 * </p>
	 */
	public static McObfPair field_187733_dX = McMappingDatabase.getSRG("field_187733_dX");

	/**
	 * <p>
	 * Name: ENTITY_ARROW_HIT_PLAYER
	 * </p>
	 */
	public static McObfPair field_187734_u = McMappingDatabase.getSRG("field_187734_u");

	/**
	 * <p>
	 * Name: ENTITY_HORSE_STEP
	 * </p>
	 */
	public static McObfPair field_187729_cv = McMappingDatabase.getSRG("field_187729_cv");

	/**
	 * <p>
	 * Name: ENTITY_ARMORSTAND_HIT
	 * </p>
	 */
	public static McObfPair field_187707_l = McMappingDatabase.getSRG("field_187707_l");

	/**
	 * <p>
	 * Name: BLOCK_NOTE_BASEDRUM
	 * </p>
	 */
	public static McObfPair field_187676_dE = McMappingDatabase.getSRG("field_187676_dE");

	/**
	 * <p>
	 * Name: ENTITY_LLAMA_STEP
	 * </p>
	 */
	public static McObfPair field_191256_dG = McMappingDatabase.getSRG("field_191256_dG");

	/**
	 * <p>
	 * Name: ITEM_ARMOR_EQUIP_GENERIC
	 * </p>
	 */
	public static McObfPair field_187719_p = McMappingDatabase.getSRG("field_187719_p");

	/**
	 * <p>
	 * Name: BLOCK_TRIPWIRE_CLICK_OFF
	 * </p>
	 */
	public static McObfPair field_187906_gf = McMappingDatabase.getSRG("field_187906_gf");

	/**
	 * <p>
	 * Name: E_PARROT_IM_EVOCATION_ILLAGER
	 * </p>
	 */
	public static McObfPair field_193797_eS = McMappingDatabase.getSRG("field_193797_eS");

	/**
	 * <p>
	 * Name: ENTITY_ENDERDRAGON_SHOOT
	 * </p>
	 */
	public static McObfPair field_187527_aQ = McMappingDatabase.getSRG("field_187527_aQ");

	/**
	 * <p>
	 * Name: UI_TOAST_IN
	 * </p>
	 */
	public static McObfPair field_194226_id = McMappingDatabase.getSRG("field_194226_id");

	/**
	 * <p>
	 * Name: ENTITY_WITHER_SHOOT
	 * </p>
	 */
	public static McObfPair field_187853_gC = McMappingDatabase.getSRG("field_187853_gC");

	/**
	 * <p>
	 * Name: BLOCK_METAL_BREAK
	 * </p>
	 */
	public static McObfPair field_187766_dk = McMappingDatabase.getSRG("field_187766_dk");

	/**
	 * <p>
	 * Name: ENTITY_GHAST_DEATH
	 * </p>
	 */
	public static McObfPair field_187553_bI = McMappingDatabase.getSRG("field_187553_bI");

	/**
	 * <p>
	 * Name: ENTITY_ELDER_GUARDIAN_HURT
	 * </p>
	 */
	public static McObfPair field_187517_aG = McMappingDatabase.getSRG("field_187517_aG");

	/**
	 * <p>
	 * Name: ENTITY_ZOMBIE_PIG_ANGRY
	 * </p>
	 */
	public static McObfPair field_187936_hj = McMappingDatabase.getSRG("field_187936_hj");

	/**
	 * <p>
	 * Name: ENTITY_POLAR_BEAR_DEATH
	 * </p>
	 */
	public static McObfPair field_190028_et = McMappingDatabase.getSRG("field_190028_et");

	/**
	 * <p>
	 * Name: ENTITY_ENDERMITE_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187535_aY = McMappingDatabase.getSRG("field_187535_aY");

	/**
	 * <p>
	 * Name: ENTITY_WITHER_BREAK_BLOCK
	 * </p>
	 */
	public static McObfPair field_187926_gz = McMappingDatabase.getSRG("field_187926_gz");

	/**
	 * <p>
	 * Name: BLOCK_LADDER_STEP
	 * </p>
	 */
	public static McObfPair field_187653_cW = McMappingDatabase.getSRG("field_187653_cW");

	/**
	 * <p>
	 * Name: BLOCK_IRON_TRAPDOOR_OPEN
	 * </p>
	 */
	public static McObfPair field_187617_cK = McMappingDatabase.getSRG("field_187617_cK");

	/**
	 * <p>
	 * Name: ENTITY_HOSTILE_DEATH
	 * </p>
	 */
	public static McObfPair field_187738_cy = McMappingDatabase.getSRG("field_187738_cy");

	/**
	 * <p>
	 * Name: ENTITY_SHULKER_HURT
	 * </p>
	 */
	public static McObfPair field_187783_eT = McMappingDatabase.getSRG("field_187783_eT");

	/**
	 * <p>
	 * Name: ENTITY_ARMORSTAND_FALL
	 * </p>
	 */
	public static McObfPair field_187704_k = McMappingDatabase.getSRG("field_187704_k");

	/**
	 * <p>
	 * Name: E_PARROT_IM_ENDERMITE
	 * </p>
	 */
	public static McObfPair field_193796_eR = McMappingDatabase.getSRG("field_193796_eR");

	/**
	 * <p>
	 * Name: ENTITY_GHAST_HURT
	 * </p>
	 */
	public static McObfPair field_187555_bJ = McMappingDatabase.getSRG("field_187555_bJ");

	/**
	 * <p>
	 * Name: ENTITY_SHEEP_DEATH
	 * </p>
	 */
	public static McObfPair field_187759_eH = McMappingDatabase.getSRG("field_187759_eH");

	/**
	 * <p>
	 * Name: ENTITY_BAT_DEATH
	 * </p>
	 */
	public static McObfPair field_187742_x = McMappingDatabase.getSRG("field_187742_x");

	/**
	 * <p>
	 * Name: BLOCK_CLOTH_HIT
	 * </p>
	 */
	public static McObfPair field_187550_ag = McMappingDatabase.getSRG("field_187550_ag");

	/**
	 * <p>
	 * Name: ENTITY_VEX_HURT
	 * </p>
	 */
	public static McObfPair field_191267_hf = McMappingDatabase.getSRG("field_191267_hf");

	/**
	 * <p>
	 * Name: ENTITY_VILLAGER_YES
	 * </p>
	 */
	public static McObfPair field_187915_go = McMappingDatabase.getSRG("field_187915_go");

	/**
	 * <p>
	 * Name: getRegisteredSoundEvent
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_187510_a = McMappingDatabase.getSRG("SoundEvents.func_187510_a");

	/**
	 * <p>
	 * Name: BLOCK_CLOTH_FALL
	 * </p>
	 */
	public static McObfPair field_187548_af = McMappingDatabase.getSRG("field_187548_af");

	/**
	 * <p>
	 * Name: BLOCK_PISTON_CONTRACT
	 * </p>
	 */
	public static McObfPair field_187712_dQ = McMappingDatabase.getSRG("field_187712_dQ");

	/**
	 * <p>
	 * Name: E_PARROT_IM_SKELETON
	 * </p>
	 */
	public static McObfPair field_193811_fa = McMappingDatabase.getSRG("field_193811_fa");

	/**
	 * <p>
	 * Name: ITEM_ELYTRA_FLYING
	 * </p>
	 */
	public static McObfPair field_189426_aK = McMappingDatabase.getSRG("field_189426_aK");

	/**
	 * <p>
	 * Name: ENTITY_BOBBER_RETRIEVE
	 * </p>
	 */
	public static McObfPair field_193780_J = McMappingDatabase.getSRG("field_193780_J");

	/**
	 * <p>
	 * Name: ENTITY_ELDER_GUARDIAN_DEATH
	 * </p>
	 */
	public static McObfPair field_187515_aE = McMappingDatabase.getSRG("field_187515_aE");

	/**
	 * <p>
	 * Name: BLOCK_WOODEN_DOOR_OPEN
	 * </p>
	 */
	public static McObfPair field_187875_gN = McMappingDatabase.getSRG("field_187875_gN");

	/**
	 * <p>
	 * Name: ENTITY_MINECART_RIDING
	 * </p>
	 */
	public static McObfPair field_187782_ds = McMappingDatabase.getSRG("field_187782_ds");

	/**
	 * <p>
	 * Name: ENTITY_CAT_HISS
	 * </p>
	 */
	public static McObfPair field_189106_R = McMappingDatabase.getSRG("field_189106_R");

	/**
	 * <p>
	 * Name: BLOCK_GLASS_FALL
	 * </p>
	 */
	public static McObfPair field_187563_bN = McMappingDatabase.getSRG("field_187563_bN");

	/**
	 * <p>
	 * Name: ENTITY_RABBIT_ATTACK
	 * </p>
	 */
	public static McObfPair field_187818_ek = McMappingDatabase.getSRG("field_187818_ek");

	/**
	 * <p>
	 * Name: ENTITY_GHAST_SHOOT
	 * </p>
	 */
	public static McObfPair field_187557_bK = McMappingDatabase.getSRG("field_187557_bK");

	/**
	 * <p>
	 * Name: ENTITY_LLAMA_DEATH
	 * </p>
	 */
	public static McObfPair field_191252_dC = McMappingDatabase.getSRG("field_191252_dC");

	/**
	 * <p>
	 * Name: ENTITY_DONKEY_HURT
	 * </p>
	 */
	public static McObfPair field_187588_az = McMappingDatabase.getSRG("field_187588_az");

	/**
	 * <p>
	 * Name: ENTITY_GUARDIAN_DEATH_LAND
	 * </p>
	 */
	public static McObfPair field_187681_cf = McMappingDatabase.getSRG("field_187681_cf");

	/**
	 * <p>
	 * Name: ENTITY_ENDERMITE_DEATH
	 * </p>
	 */
	public static McObfPair field_187536_aZ = McMappingDatabase.getSRG("field_187536_aZ");

	/**
	 * <p>
	 * Name: EVOCATION_ILLAGER_PREPARE_SUMMON
	 * </p>
	 */
	public static McObfPair field_191248_br = McMappingDatabase.getSRG("field_191248_br");

	/**
	 * <p>
	 * Name: ENTITY_ENDERPEARL_THROW
	 * </p>
	 */
	public static McObfPair field_187595_bc = McMappingDatabase.getSRG("field_187595_bc");

	/**
	 * <p>
	 * Name: BLOCK_TRIPWIRE_DETACH
	 * </p>
	 */
	public static McObfPair field_187908_gh = McMappingDatabase.getSRG("field_187908_gh");

	/**
	 * <p>
	 * Name: ENTITY_GUARDIAN_AMBIENT
	 * </p>
	 */
	public static McObfPair field_187670_cb = McMappingDatabase.getSRG("field_187670_cb");

	/**
	 * <p>
	 * Name: E_PARROT_IM_ZOMBIE_PIGMAN
	 * </p>
	 */
	public static McObfPair field_193822_fl = McMappingDatabase.getSRG("field_193822_fl");

	/**
	 * <p>
	 * Name: ENTITY_HOSTILE_SPLASH
	 * </p>
	 */
	public static McObfPair field_187591_cB = McMappingDatabase.getSRG("field_187591_cB");

	/**
	 * <p>
	 * Name: ENTITY_IRONGOLEM_ATTACK
	 * </p>
	 */
	public static McObfPair field_187596_cD = McMappingDatabase.getSRG("field_187596_cD");

	/**
	 * <p>
	 * Name: BLOCK_FIRE_EXTINGUISH
	 * </p>
	 */
	public static McObfPair field_187646_bt = McMappingDatabase.getSRG("field_187646_bt");

	/**
	 * <p>
	 * Name: ENTITY_LEASHKNOT_PLACE
	 * </p>
	 */
	public static McObfPair field_187748_db = McMappingDatabase.getSRG("field_187748_db");

	/**
	 * <p>
	 * Name: BLOCK_METAL_PRESSPLATE_CLICK_OFF
	 * </p>
	 */
	public static McObfPair field_187774_do = McMappingDatabase.getSRG("field_187774_do");

	/**
	 * <p>
	 * Name: ENTITY_MINECART_INSIDE
	 * </p>
	 */
	public static McObfPair field_187780_dr = McMappingDatabase.getSRG("field_187780_dr");

	/**
	 * <p>
	 * Name: ENTITY_ENDERMITE_HURT
	 * </p>
	 */
	public static McObfPair field_187590_ba = McMappingDatabase.getSRG("field_187590_ba");

	/**
	 * <p>
	 * Name: ENTITY_SMALL_MAGMACUBE_SQUISH
	 * </p>
	 */
	public static McObfPair field_187894_fw = McMappingDatabase.getSRG("field_187894_fw");

}

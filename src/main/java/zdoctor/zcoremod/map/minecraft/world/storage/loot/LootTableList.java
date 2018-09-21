package zdoctor.zcoremod.map.minecraft.world.storage.loot;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootTableList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfn";
		else
			return "net/minecraft/world/storage/loot/LootTableList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfn";
		else
			return "LootTableList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfn;";
		else
			return "Lnet/minecraft/world/storage/loot/LootTableList;";
	}

	/**
	 * <p>
	 * Name: ENTITIES_IRON_GOLEM
	 * </p>
	 */
	public static McObfPair field_186443_y = McMappingDatabase.getSRG("field_186443_y");

	/**
	 * <p>
	 * Name: GAMEPLAY_FISHING_TREASURE
	 * </p>
	 */
	public static McObfPair field_186389_an = McMappingDatabase.getSRG("field_186389_an");

	/**
	 * <p>
	 * Name: GAMEPLAY_FISHING
	 * </p>
	 */
	public static McObfPair field_186387_al = McMappingDatabase.getSRG("field_186387_al");

	/**
	 * <p>
	 * Name: ENTITIES_SHULKER
	 * </p>
	 */
	public static McObfPair field_186442_x = McMappingDatabase.getSRG("field_186442_x");

	/**
	 * <p>
	 * Name: ENTITIES_BLAZE
	 * </p>
	 */
	public static McObfPair field_186433_o = McMappingDatabase.getSRG("field_186433_o");

	/**
	 * <p>
	 * Name: ENTITIES_SHEEP_BLUE
	 * </p>
	 */
	public static McObfPair field_186415_W = McMappingDatabase.getSRG("field_186415_W");

	/**
	 * <p>
	 * Name: ENTITIES_SHEEP_YELLOW
	 * </p>
	 */
	public static McObfPair field_186408_P = McMappingDatabase.getSRG("field_186408_P");

	/**
	 * <p>
	 * Name: ENTITIES_SHEEP_LIME
	 * </p>
	 */
	public static McObfPair field_186409_Q = McMappingDatabase.getSRG("field_186409_Q");

	/**
	 * <p>
	 * Name: CHESTS_NETHER_BRIDGE
	 * </p>
	 */
	public static McObfPair field_186425_g = McMappingDatabase.getSRG("field_186425_g");

	/**
	 * <p>
	 * Name: CHESTS_VILLAGE_BLACKSMITH
	 * </p>
	 */
	public static McObfPair field_186423_e = McMappingDatabase.getSRG("field_186423_e");

	/**
	 * <p>
	 * Name: CHESTS_JUNGLE_TEMPLE
	 * </p>
	 */
	public static McObfPair field_186430_l = McMappingDatabase.getSRG("field_186430_l");

	/**
	 * <p>
	 * Name: CHESTS_JUNGLE_TEMPLE_DISPENSER
	 * </p>
	 */
	public static McObfPair field_189420_m = McMappingDatabase.getSRG("field_189420_m");

	/**
	 * <p>
	 * Name: getAll
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_186374_a = McMappingDatabase.getSRG("LootTableList.func_186374_a");

	/**
	 * <p>
	 * Name: CHESTS_STRONGHOLD_CORRIDOR
	 * </p>
	 */
	public static McObfPair field_186428_j = McMappingDatabase.getSRG("field_186428_j");

	/**
	 * <p>
	 * Name: ENTITIES_SILVERFISH
	 * </p>
	 */
	public static McObfPair field_186438_t = McMappingDatabase.getSRG("field_186438_t");

	/**
	 * <p>
	 * Name: GAMEPLAY_FISHING_JUNK
	 * </p>
	 */
	public static McObfPair field_186388_am = McMappingDatabase.getSRG("field_186388_am");

	/**
	 * <p>
	 * Name: CHESTS_STRONGHOLD_LIBRARY
	 * </p>
	 */
	public static McObfPair field_186426_h = McMappingDatabase.getSRG("field_186426_h");

	/**
	 * <p>
	 * Name: CHESTS_ABANDONED_MINESHAFT
	 * </p>
	 */
	public static McObfPair field_186424_f = McMappingDatabase.getSRG("field_186424_f");

	/**
	 * <p>
	 * Name: ENTITIES_SHEEP
	 * </p>
	 */
	public static McObfPair field_186403_K = McMappingDatabase.getSRG("field_186403_K");

	/**
	 * <p>
	 * Name: ENTITIES_SHEEP_WHITE
	 * </p>
	 */
	public static McObfPair field_186404_L = McMappingDatabase.getSRG("field_186404_L");

	/**
	 * <p>
	 * Name: register
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_186375_a = McMappingDatabase.getSRG("LootTableList.func_186375_a");

	/**
	 * <p>
	 * Name: ENTITIES_WITCH
	 * </p>
	 */
	public static McObfPair field_186432_n = McMappingDatabase.getSRG("field_186432_n");

	/**
	 * <p>
	 * Name: ENTITIES_PARROT
	 * </p>
	 */
	public static McObfPair field_192561_ax = McMappingDatabase.getSRG("field_192561_ax");

	/**
	 * <p>
	 * Name: ENTITIES_RABBIT
	 * </p>
	 */
	public static McObfPair field_186393_A = McMappingDatabase.getSRG("field_186393_A");

	/**
	 * <p>
	 * Name: ENTITIES_ZOMBIE_VILLAGER
	 * </p>
	 */
	public static McObfPair field_191183_as = McMappingDatabase.getSRG("field_191183_as");

	/**
	 * <p>
	 * Name: ENTITIES_SHEEP_CYAN
	 * </p>
	 */
	public static McObfPair field_186413_U = McMappingDatabase.getSRG("field_186413_U");

	/**
	 * <p>
	 * Name: ENTITIES_SHEEP_PINK
	 * </p>
	 */
	public static McObfPair field_186410_R = McMappingDatabase.getSRG("field_186410_R");

	/**
	 * <p>
	 * Name: ENTITIES_ENDERMAN
	 * </p>
	 */
	public static McObfPair field_186439_u = McMappingDatabase.getSRG("field_186439_u");

	/**
	 * <p>
	 * Name: ENTITIES_SHEEP_RED
	 * </p>
	 */
	public static McObfPair field_186418_Z = McMappingDatabase.getSRG("field_186418_Z");

	/**
	 * <p>
	 * Name: ENTITIES_ZOMBIE
	 * </p>
	 */
	public static McObfPair field_186383_ah = McMappingDatabase.getSRG("field_186383_ah");

	/**
	 * <p>
	 * Name: ENTITIES_HUSK
	 * </p>
	 */
	public static McObfPair field_191182_ar = McMappingDatabase.getSRG("field_191182_ar");

	/**
	 * <p>
	 * Name: CHESTS_SIMPLE_DUNGEON
	 * </p>
	 */
	public static McObfPair field_186422_d = McMappingDatabase.getSRG("field_186422_d");

	/**
	 * <p>
	 * Name: ENTITIES_SKELETON
	 * </p>
	 */
	public static McObfPair field_186385_aj = McMappingDatabase.getSRG("field_186385_aj");

	/**
	 * <p>
	 * Name: ENTITIES_OCELOT
	 * </p>
	 */
	public static McObfPair field_186402_J = McMappingDatabase.getSRG("field_186402_J");

	/**
	 * <p>
	 * Name: register
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_186373_a = McMappingDatabase.getSRG("LootTableList.func_186373_a");

	/**
	 * <p>
	 * Name: CHESTS_SPAWN_BONUS_CHEST
	 * </p>
	 */
	public static McObfPair field_186420_b = McMappingDatabase.getSRG("field_186420_b");

	/**
	 * <p>
	 * Name: ENTITIES_VEX
	 * </p>
	 */
	public static McObfPair field_191188_ax = McMappingDatabase.getSRG("field_191188_ax");

	/**
	 * <p>
	 * Name: CHESTS_DESERT_PYRAMID
	 * </p>
	 */
	public static McObfPair field_186429_k = McMappingDatabase.getSRG("field_186429_k");

	/**
	 * <p>
	 * Name: ENTITIES_COW
	 * </p>
	 */
	public static McObfPair field_186399_G = McMappingDatabase.getSRG("field_186399_G");

	/**
	 * <p>
	 * Name: ENTITIES_ENDER_DRAGON
	 * </p>
	 */
	public static McObfPair field_191189_ay = McMappingDatabase.getSRG("field_191189_ay");

	/**
	 * <p>
	 * Name: ENTITIES_MULE
	 * </p>
	 */
	public static McObfPair field_191191_I = McMappingDatabase.getSRG("field_191191_I");

	/**
	 * <p>
	 * Name: ENTITIES_SKELETON_HORSE
	 * </p>
	 */
	public static McObfPair field_186398_F = McMappingDatabase.getSRG("field_186398_F");

	/**
	 * <p>
	 * Name: ENTITIES_LLAMA
	 * </p>
	 */
	public static McObfPair field_191187_aw = McMappingDatabase.getSRG("field_191187_aw");

	/**
	 * <p>
	 * Name: ENTITIES_BAT
	 * </p>
	 */
	public static McObfPair field_186377_ab = McMappingDatabase.getSRG("field_186377_ab");

	/**
	 * <p>
	 * Name: ENTITIES_SHEEP_ORANGE
	 * </p>
	 */
	public static McObfPair field_186405_M = McMappingDatabase.getSRG("field_186405_M");

	/**
	 * <p>
	 * Name: ENTITIES_SHEEP_MAGENTA
	 * </p>
	 */
	public static McObfPair field_186406_N = McMappingDatabase.getSRG("field_186406_N");

	/**
	 * <p>
	 * Name: ENTITIES_CHICKEN
	 * </p>
	 */
	public static McObfPair field_186394_B = McMappingDatabase.getSRG("field_186394_B");

	/**
	 * <p>
	 * Name: CHESTS_IGLOO_CHEST
	 * </p>
	 */
	public static McObfPair field_186431_m = McMappingDatabase.getSRG("field_186431_m");

	/**
	 * <p>
	 * Name: ENTITIES_EVOCATION_ILLAGER
	 * </p>
	 */
	public static McObfPair field_191185_au = McMappingDatabase.getSRG("field_191185_au");

	/**
	 * <p>
	 * Name: ENTITIES_MUSHROOM_COW
	 * </p>
	 */
	public static McObfPair field_186400_H = McMappingDatabase.getSRG("field_186400_H");

	/**
	 * <p>
	 * Name: ENTITIES_ELDER_GUARDIAN
	 * </p>
	 */
	public static McObfPair field_186441_w = McMappingDatabase.getSRG("field_186441_w");

	/**
	 * <p>
	 * Name: ENTITIES_SQUID
	 * </p>
	 */
	public static McObfPair field_186381_af = McMappingDatabase.getSRG("field_186381_af");

	/**
	 * <p>
	 * Name: ENTITIES_GUARDIAN
	 * </p>
	 */
	public static McObfPair field_186440_v = McMappingDatabase.getSRG("field_186440_v");

	/**
	 * <p>
	 * Name: ENTITIES_ZOMBIE_PIGMAN
	 * </p>
	 */
	public static McObfPair field_186384_ai = McMappingDatabase.getSRG("field_186384_ai");

	/**
	 * <p>
	 * Name: ENTITIES_VILLAGER
	 * </p>
	 */
	public static McObfPair field_191184_at = McMappingDatabase.getSRG("field_191184_at");

	/**
	 * <p>
	 * Name: ENTITIES_SHEEP_BROWN
	 * </p>
	 */
	public static McObfPair field_186416_X = McMappingDatabase.getSRG("field_186416_X");

	/**
	 * <p>
	 * Name: ENTITIES_SHEEP_BLACK
	 * </p>
	 */
	public static McObfPair field_186376_aa = McMappingDatabase.getSRG("field_186376_aa");

	/**
	 * <p>
	 * Name: CHESTS_END_CITY_TREASURE
	 * </p>
	 */
	public static McObfPair field_186421_c = McMappingDatabase.getSRG("field_186421_c");

	/**
	 * <p>
	 * Name: LOOT_TABLES
	 * </p>
	 */
	public static McObfPair field_186391_ap = McMappingDatabase.getSRG("field_186391_ap");

	/**
	 * <p>
	 * Name: ENTITIES_SPIDER
	 * </p>
	 */
	public static McObfPair field_186435_q = McMappingDatabase.getSRG("field_186435_q");

	/**
	 * <p>
	 * Name: ENTITIES_SHEEP_GRAY
	 * </p>
	 */
	public static McObfPair field_186411_S = McMappingDatabase.getSRG("field_186411_S");

	/**
	 * <p>
	 * Name: ENTITIES_ZOMBIE_HORSE
	 * </p>
	 */
	public static McObfPair field_186397_E = McMappingDatabase.getSRG("field_186397_E");

	/**
	 * <p>
	 * Name: ENTITIES_MAGMA_CUBE
	 * </p>
	 */
	public static McObfPair field_186379_ad = McMappingDatabase.getSRG("field_186379_ad");

	/**
	 * <p>
	 * Name: ENTITIES_PIG
	 * </p>
	 */
	public static McObfPair field_186395_C = McMappingDatabase.getSRG("field_186395_C");

	/**
	 * <p>
	 * Name: CHESTS_STRONGHOLD_CROSSING
	 * </p>
	 */
	public static McObfPair field_186427_i = McMappingDatabase.getSRG("field_186427_i");

	/**
	 * <p>
	 * Name: CHESTS_WOODLAND_MANSION
	 * </p>
	 */
	public static McObfPair field_191192_o = McMappingDatabase.getSRG("field_191192_o");

	/**
	 * <p>
	 * Name: ENTITIES_SNOWMAN
	 * </p>
	 */
	public static McObfPair field_186444_z = McMappingDatabase.getSRG("field_186444_z");

	/**
	 * <p>
	 * Name: ENTITIES_SHEEP_GREEN
	 * </p>
	 */
	public static McObfPair field_186417_Y = McMappingDatabase.getSRG("field_186417_Y");

	/**
	 * <p>
	 * Name: GAMEPLAY_FISHING_FISH
	 * </p>
	 */
	public static McObfPair field_186390_ao = McMappingDatabase.getSRG("field_186390_ao");

	/**
	 * <p>
	 * Name: ENTITIES_SHEEP_PURPLE
	 * </p>
	 */
	public static McObfPair field_186414_V = McMappingDatabase.getSRG("field_186414_V");

	/**
	 * <p>
	 * Name: ENTITIES_WOLF
	 * </p>
	 */
	public static McObfPair field_186401_I = McMappingDatabase.getSRG("field_186401_I");

	/**
	 * <p>
	 * Name: ENTITIES_SLIME
	 * </p>
	 */
	public static McObfPair field_186378_ac = McMappingDatabase.getSRG("field_186378_ac");

	/**
	 * <p>
	 * Name: ENTITIES_CAVE_SPIDER
	 * </p>
	 */
	public static McObfPair field_186436_r = McMappingDatabase.getSRG("field_186436_r");

	/**
	 * <p>
	 * Name: EMPTY
	 * </p>
	 */
	public static McObfPair field_186419_a = McMappingDatabase.getSRG("field_186419_a");

	/**
	 * <p>
	 * Name: ENTITIES_WITHER_SKELETON
	 * </p>
	 */
	public static McObfPair field_186386_ak = McMappingDatabase.getSRG("field_186386_ak");

	/**
	 * <p>
	 * Name: READ_ONLY_LOOT_TABLES
	 * </p>
	 */
	public static McObfPair field_186392_aq = McMappingDatabase.getSRG("field_186392_aq");

	/**
	 * <p>
	 * Name: ENTITIES_SHEEP_SILVER
	 * </p>
	 */
	public static McObfPair field_186412_T = McMappingDatabase.getSRG("field_186412_T");

	/**
	 * <p>
	 * Name: ENTITIES_HORSE
	 * </p>
	 */
	public static McObfPair field_186396_D = McMappingDatabase.getSRG("field_186396_D");

	/**
	 * <p>
	 * Name: ENTITIES_VINDICATION_ILLAGER
	 * </p>
	 */
	public static McObfPair field_191186_av = McMappingDatabase.getSRG("field_191186_av");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193579_b = McMappingDatabase.getSRG("LootTableList.func_193579_b");

	/**
	 * <p>
	 * Name: ENTITIES_CREEPER
	 * </p>
	 */
	public static McObfPair field_186434_p = McMappingDatabase.getSRG("field_186434_p");

	/**
	 * <p>
	 * Name: ENTITIES_SHEEP_LIGHT_BLUE
	 * </p>
	 */
	public static McObfPair field_186407_O = McMappingDatabase.getSRG("field_186407_O");

	/**
	 * <p>
	 * Name: ENTITIES_POLAR_BEAR
	 * </p>
	 */
	public static McObfPair field_189969_E = McMappingDatabase.getSRG("field_189969_E");

	/**
	 * <p>
	 * Name: ENTITIES_STRAY
	 * </p>
	 */
	public static McObfPair field_189968_an = McMappingDatabase.getSRG("field_189968_an");

	/**
	 * <p>
	 * Name: ENTITIES_GIANT
	 * </p>
	 */
	public static McObfPair field_186437_s = McMappingDatabase.getSRG("field_186437_s");

	/**
	 * <p>
	 * Name: ENTITIES_GHAST
	 * </p>
	 */
	public static McObfPair field_186380_ae = McMappingDatabase.getSRG("field_186380_ae");

	/**
	 * <p>
	 * Name: ENTITIES_ENDERMITE
	 * </p>
	 */
	public static McObfPair field_186382_ag = McMappingDatabase.getSRG("field_186382_ag");

	/**
	 * <p>
	 * Name: ENTITIES_DONKEY
	 * </p>
	 */
	public static McObfPair field_191190_H = McMappingDatabase.getSRG("field_191190_H");

}

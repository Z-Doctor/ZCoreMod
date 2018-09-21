package zdoctor.zcoremod.map.minecraft.stats;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StatList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qs";
		else
			return "net/minecraft/stats/StatList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "qs";
		else
			return "StatList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lqs;";
		else
			return "Lnet/minecraft/stats/StatList;";
	}

	/**
	 * <p>
	 * Name: WALK_ONE_CM
	 * </p>
	 */
	public static McObfPair field_188100_j = McMappingDatabase.getSRG("field_188100_j");

	/**
	 * <p>
	 * Name: SLEEP_IN_BED
	 * </p>
	 */
	public static McObfPair field_188064_ad = McMappingDatabase.getSRG("field_188064_ad");

	/**
	 * <p>
	 * Name: initCraftableStats
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75918_d = McMappingDatabase.getSRG("StatList.func_75918_d");

	/**
	 * <p>
	 * Name: SWIM_ONE_CM
	 * </p>
	 */
	public static McObfPair field_75946_m = McMappingDatabase.getSRG("field_75946_m");

	/**
	 * <p>
	 * Name: DROP
	 * </p>
	 */
	public static McObfPair field_75952_v = McMappingDatabase.getSRG("field_75952_v");

	/**
	 * <p>
	 * Name: ITEM_ENCHANTED
	 * </p>
	 */
	public static McObfPair field_188091_Y = McMappingDatabase.getSRG("field_188091_Y");

	/**
	 * <p>
	 * Name: SNEAK_TIME
	 * </p>
	 */
	public static McObfPair field_188099_i = McMappingDatabase.getSRG("field_188099_i");

	/**
	 * <p>
	 * Name: DAMAGE_DEALT
	 * </p>
	 */
	public static McObfPair field_188111_y = McMappingDatabase.getSRG("field_188111_y");

	/**
	 * <p>
	 * Name: replaceAllSimilarBlocks
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/stats/StatBase;)V]
	 * </p>
	 */
	public static McObfPair func_75924_a = McMappingDatabase.getSRG("StatList.func_75924_a");

	/**
	 * <p>
	 * Name: FURNACE_INTERACTION
	 * </p>
	 */
	public static McObfPair field_188061_aa = McMappingDatabase.getSRG("field_188061_aa");

	/**
	 * <p>
	 * Name: TRAPPED_CHEST_TRIGGERED
	 * </p>
	 */
	public static McObfPair field_188089_W = McMappingDatabase.getSRG("field_188089_W");

	/**
	 * <p>
	 * Name: BASIC_STATS
	 * </p>
	 */
	public static McObfPair field_188094_c = McMappingDatabase.getSRG("field_188094_c");

	/**
	 * <p>
	 * Name: DIVE_ONE_CM
	 * </p>
	 */
	public static McObfPair field_188105_q = McMappingDatabase.getSRG("field_188105_q");

	/**
	 * <p>
	 * Name: ID_TO_STAT_MAP
	 * </p>
	 */
	public static McObfPair field_188093_a = McMappingDatabase.getSRG("field_188093_a");

	/**
	 * <p>
	 * Name: ENDERCHEST_OPENED
	 * </p>
	 */
	public static McObfPair field_188090_X = McMappingDatabase.getSRG("field_188090_X");

	/**
	 * <p>
	 * Name: getOneShotStat
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/stats/StatBase;]
	 * </p>
	 */
	public static McObfPair func_151177_a = McMappingDatabase.getSRG("StatList.func_151177_a");

	/**
	 * <p>
	 * Name: PIG_ONE_CM
	 * </p>
	 */
	public static McObfPair field_188108_t = McMappingDatabase.getSRG("field_188108_t");

	/**
	 * <p>
	 * Name: getObjectUseStats
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Lnet/minecraft/stats/StatBase;]
	 * </p>
	 */
	public static McObfPair func_188057_b = McMappingDatabase.getSRG("StatList.func_188057_b");

	/**
	 * <p>
	 * Name: getObjectBreakStats
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Lnet/minecraft/stats/StatBase;]
	 * </p>
	 */
	public static McObfPair func_188059_c = McMappingDatabase.getSRG("StatList.func_188059_c");

	/**
	 * <p>
	 * Name: OBJECTS_DROPPED_STATS
	 * </p>
	 */
	public static McObfPair field_188068_aj = McMappingDatabase.getSRG("field_188068_aj");

	/**
	 * <p>
	 * Name: TRADED_WITH_VILLAGER
	 * </p>
	 */
	public static McObfPair field_188075_I = McMappingDatabase.getSRG("field_188075_I");

	/**
	 * <p>
	 * Name: CAKE_SLICES_EATEN
	 * </p>
	 */
	public static McObfPair field_188076_J = McMappingDatabase.getSRG("field_188076_J");

	/**
	 * <p>
	 * Name: BANNER_CLEANED
	 * </p>
	 */
	public static McObfPair field_188080_N = McMappingDatabase.getSRG("field_188080_N");

	/**
	 * <p>
	 * Name: OBJECT_BREAK_STATS
	 * </p>
	 */
	public static McObfPair field_75930_F = McMappingDatabase.getSRG("field_75930_F");

	/**
	 * <p>
	 * Name: MOB_KILLS
	 * </p>
	 */
	public static McObfPair field_188070_B = McMappingDatabase.getSRG("field_188070_B");

	/**
	 * <p>
	 * Name: getItemName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_180204_a = McMappingDatabase.getSRG("StatList.func_180204_a");

	/**
	 * <p>
	 * Name: getStatKillEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityList$EntityEggInfo;)Lnet/minecraft/stats/StatBase;]
	 * </p>
	 */
	public static McObfPair func_151182_a = McMappingDatabase.getSRG("StatList.func_151182_a");

	/**
	 * <p>
	 * Name: getCraftStats
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Lnet/minecraft/stats/StatBase;]
	 * </p>
	 */
	public static McObfPair func_188060_a = McMappingDatabase.getSRG("StatList.func_188060_a");

	/**
	 * <p>
	 * Name: OPEN_SHULKER_BOX
	 * </p>
	 */
	public static McObfPair field_191272_ae = McMappingDatabase.getSRG("field_191272_ae");

	/**
	 * <p>
	 * Name: ALL_STATS
	 * </p>
	 */
	public static McObfPair field_75940_b = McMappingDatabase.getSRG("field_75940_b");

	/**
	 * <p>
	 * Name: PLAY_ONE_MINUTE
	 * </p>
	 */
	public static McObfPair field_188097_g = McMappingDatabase.getSRG("field_188097_g");

	/**
	 * <p>
	 * Name: USE_ITEM_STATS
	 * </p>
	 */
	public static McObfPair field_188095_d = McMappingDatabase.getSRG("field_188095_d");

	/**
	 * <p>
	 * Name: CRAFTING_TABLE_INTERACTION
	 * </p>
	 */
	public static McObfPair field_188062_ab = McMappingDatabase.getSRG("field_188062_ab");

	/**
	 * <p>
	 * Name: NOTEBLOCK_TUNED
	 * </p>
	 */
	public static McObfPair field_188087_U = McMappingDatabase.getSRG("field_188087_U");

	/**
	 * <p>
	 * Name: TIME_SINCE_DEATH
	 * </p>
	 */
	public static McObfPair field_188098_h = McMappingDatabase.getSRG("field_188098_h");

	/**
	 * <p>
	 * Name: ARMOR_CLEANED
	 * </p>
	 */
	public static McObfPair field_188079_M = McMappingDatabase.getSRG("field_188079_M");

	/**
	 * <p>
	 * Name: CHEST_OPENED
	 * </p>
	 */
	public static McObfPair field_188063_ac = McMappingDatabase.getSRG("field_188063_ac");

	/**
	 * <p>
	 * Name: FLY_ONE_CM
	 * </p>
	 */
	public static McObfPair field_188104_p = McMappingDatabase.getSRG("field_188104_p");

	/**
	 * <p>
	 * Name: MINE_BLOCK_STATS
	 * </p>
	 */
	public static McObfPair field_188096_e = McMappingDatabase.getSRG("field_188096_e");

	/**
	 * <p>
	 * Name: BEACON_INTERACTION
	 * </p>
	 */
	public static McObfPair field_188082_P = McMappingDatabase.getSRG("field_188082_P");

	/**
	 * <p>
	 * Name: CROUCH_ONE_CM
	 * </p>
	 */
	public static McObfPair field_188101_k = McMappingDatabase.getSRG("field_188101_k");

	/**
	 * <p>
	 * Name: CRAFTS_STATS
	 * </p>
	 */
	public static McObfPair field_188066_af = McMappingDatabase.getSRG("field_188066_af");

	/**
	 * <p>
	 * Name: PLAYER_KILLS
	 * </p>
	 */
	public static McObfPair field_75932_A = McMappingDatabase.getSRG("field_75932_A");

	/**
	 * <p>
	 * Name: HORSE_ONE_CM
	 * </p>
	 */
	public static McObfPair field_188109_u = McMappingDatabase.getSRG("field_188109_u");

	/**
	 * <p>
	 * Name: initItemDepleteStats
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_151179_e = McMappingDatabase.getSRG("StatList.func_151179_e");

	/**
	 * <p>
	 * Name: CAULDRON_FILLED
	 * </p>
	 */
	public static McObfPair field_188077_K = McMappingDatabase.getSRG("field_188077_K");

	/**
	 * <p>
	 * Name: FISH_CAUGHT
	 * </p>
	 */
	public static McObfPair field_188071_E = McMappingDatabase.getSRG("field_188071_E");

	/**
	 * <p>
	 * Name: MINECART_ONE_CM
	 * </p>
	 */
	public static McObfPair field_188106_r = McMappingDatabase.getSRG("field_188106_r");

	/**
	 * <p>
	 * Name: initStats
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75925_c = McMappingDatabase.getSRG("StatList.func_75925_c");

	/**
	 * <p>
	 * Name: DAMAGE_TAKEN
	 * </p>
	 */
	public static McObfPair field_188112_z = McMappingDatabase.getSRG("field_188112_z");

	/**
	 * <p>
	 * Name: RECORD_PLAYED
	 * </p>
	 */
	public static McObfPair field_188092_Z = McMappingDatabase.getSRG("field_188092_Z");

	/**
	 * <p>
	 * Name: SPRINT_ONE_CM
	 * </p>
	 */
	public static McObfPair field_188102_l = McMappingDatabase.getSRG("field_188102_l");

	/**
	 * <p>
	 * Name: HOPPER_INSPECTED
	 * </p>
	 */
	public static McObfPair field_188084_R = McMappingDatabase.getSRG("field_188084_R");

	/**
	 * <p>
	 * Name: getStatEntityKilledBy
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityList$EntityEggInfo;)Lnet/minecraft/stats/StatBase;]
	 * </p>
	 */
	public static McObfPair func_151176_b = McMappingDatabase.getSRG("StatList.func_151176_b");

	/**
	 * <p>
	 * Name: getObjectsPickedUpStats
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Lnet/minecraft/stats/StatBase;]
	 * </p>
	 */
	public static McObfPair func_188056_d = McMappingDatabase.getSRG("StatList.func_188056_d");

	/**
	 * <p>
	 * Name: OBJECT_USE_STATS
	 * </p>
	 */
	public static McObfPair field_75929_E = McMappingDatabase.getSRG("field_75929_E");

	/**
	 * <p>
	 * Name: initPickedUpAndDroppedStats
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188054_f = McMappingDatabase.getSRG("StatList.func_188054_f");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_151178_a = McMappingDatabase.getSRG("StatList.func_151178_a");

	/**
	 * <p>
	 * Name: BLOCKS_STATS
	 * </p>
	 */
	public static McObfPair field_188065_ae = McMappingDatabase.getSRG("field_188065_ae");

	/**
	 * <p>
	 * Name: initMiningStats
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_151181_c = McMappingDatabase.getSRG("StatList.func_151181_c");

	/**
	 * <p>
	 * Name: BREWINGSTAND_INTERACTION
	 * </p>
	 */
	public static McObfPair field_188081_O = McMappingDatabase.getSRG("field_188081_O");

	/**
	 * <p>
	 * Name: FLOWER_POTTED
	 * </p>
	 */
	public static McObfPair field_188088_V = McMappingDatabase.getSRG("field_188088_V");

	/**
	 * <p>
	 * Name: TALKED_TO_VILLAGER
	 * </p>
	 */
	public static McObfPair field_188074_H = McMappingDatabase.getSRG("field_188074_H");

	/**
	 * <p>
	 * Name: NOTEBLOCK_PLAYED
	 * </p>
	 */
	public static McObfPair field_188086_T = McMappingDatabase.getSRG("field_188086_T");

	/**
	 * <p>
	 * Name: DROPPER_INSPECTED
	 * </p>
	 */
	public static McObfPair field_188083_Q = McMappingDatabase.getSRG("field_188083_Q");

	/**
	 * <p>
	 * Name: DEATHS
	 * </p>
	 */
	public static McObfPair field_188069_A = McMappingDatabase.getSRG("field_188069_A");

	/**
	 * <p>
	 * Name: FALL_ONE_CM
	 * </p>
	 */
	public static McObfPair field_75943_n = McMappingDatabase.getSRG("field_75943_n");

	/**
	 * <p>
	 * Name: mergeStatBases
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/stats/StatBase;Lnet/minecraft/block/Block;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_151180_a = McMappingDatabase.getSRG("StatList.func_151180_a");

	/**
	 * <p>
	 * Name: ANIMALS_BRED
	 * </p>
	 */
	public static McObfPair field_151186_x = McMappingDatabase.getSRG("field_151186_x");

	/**
	 * <p>
	 * Name: LEAVE_GAME
	 * </p>
	 */
	public static McObfPair field_75947_j = McMappingDatabase.getSRG("field_75947_j");

	/**
	 * <p>
	 * Name: BOAT_ONE_CM
	 * </p>
	 */
	public static McObfPair field_188107_s = McMappingDatabase.getSRG("field_188107_s");

	/**
	 * <p>
	 * Name: CLIMB_ONE_CM
	 * </p>
	 */
	public static McObfPair field_188103_o = McMappingDatabase.getSRG("field_188103_o");

	/**
	 * <p>
	 * Name: getBlockStats
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Lnet/minecraft/stats/StatBase;]
	 * </p>
	 */
	public static McObfPair func_188055_a = McMappingDatabase.getSRG("StatList.func_188055_a");

	/**
	 * <p>
	 * Name: JUMP
	 * </p>
	 */
	public static McObfPair field_75953_u = McMappingDatabase.getSRG("field_75953_u");

	/**
	 * <p>
	 * Name: DISPENSER_INSPECTED
	 * </p>
	 */
	public static McObfPair field_188085_S = McMappingDatabase.getSRG("field_188085_S");

	/**
	 * <p>
	 * Name: CAULDRON_USED
	 * </p>
	 */
	public static McObfPair field_188078_L = McMappingDatabase.getSRG("field_188078_L");

	/**
	 * <p>
	 * Name: AVIATE_ONE_CM
	 * </p>
	 */
	public static McObfPair field_188110_v = McMappingDatabase.getSRG("field_188110_v");

	/**
	 * <p>
	 * Name: OBJECTS_PICKED_UP_STATS
	 * </p>
	 */
	public static McObfPair field_188067_ai = McMappingDatabase.getSRG("field_188067_ai");

	/**
	 * <p>
	 * Name: getDroppedObjectStats
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Lnet/minecraft/stats/StatBase;]
	 * </p>
	 */
	public static McObfPair func_188058_e = McMappingDatabase.getSRG("StatList.func_188058_e");

}

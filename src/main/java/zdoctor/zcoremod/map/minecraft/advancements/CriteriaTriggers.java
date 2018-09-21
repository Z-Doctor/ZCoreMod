package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CriteriaTriggers {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "m";
		else
			return "net/minecraft/advancements/CriteriaTriggers";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "m";
		else
			return "CriteriaTriggers";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lm;";
		else
			return "Lnet/minecraft/advancements/CriteriaTriggers;";
	}

	/**
	 * <p>
	 * Name: EFFECTS_CHANGED
	 * </p>
	 */
	public static McObfPair field_193139_z = McMappingDatabase.getSRG("field_193139_z");

	/**
	 * <p>
	 * Name: CURED_ZOMBIE_VILLAGER
	 * </p>
	 */
	public static McObfPair field_192137_q = McMappingDatabase.getSRG("field_192137_q");

	/**
	 * <p>
	 * Name: RECIPE_UNLOCKED
	 * </p>
	 */
	public static McObfPair field_192126_f = McMappingDatabase.getSRG("field_192126_f");

	/**
	 * <p>
	 * Name: TAME_ANIMAL
	 * </p>
	 */
	public static McObfPair field_193136_w = McMappingDatabase.getSRG("field_193136_w");

	/**
	 * <p>
	 * Name: PLAYER_KILLED_ENTITY
	 * </p>
	 */
	public static McObfPair field_192122_b = McMappingDatabase.getSRG("field_192122_b");

	/**
	 * <p>
	 * Name: ENTITY_HURT_PLAYER
	 * </p>
	 */
	public static McObfPair field_192128_h = McMappingDatabase.getSRG("field_192128_h");

	/**
	 * <p>
	 * Name: SLEPT_IN_BED
	 * </p>
	 */
	public static McObfPair field_192136_p = McMappingDatabase.getSRG("field_192136_p");

	/**
	 * <p>
	 * Name: PLACED_BLOCK
	 * </p>
	 */
	public static McObfPair field_193137_x = McMappingDatabase.getSRG("field_193137_x");

	/**
	 * <p>
	 * Name: get
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/advancements/ICriterionTrigger;]
	 * </p>
	 */
	public static McObfPair func_192119_a = McMappingDatabase.getSRG("CriteriaTriggers.func_192119_a");

	/**
	 * <p>
	 * Name: ITEM_DURABILITY_CHANGED
	 * </p>
	 */
	public static McObfPair field_193132_s = McMappingDatabase.getSRG("field_193132_s");

	/**
	 * <p>
	 * Name: REGISTRY
	 * </p>
	 */
	public static McObfPair field_192139_s = McMappingDatabase.getSRG("field_192139_s");

	/**
	 * <p>
	 * Name: ENCHANTED_ITEM
	 * </p>
	 */
	public static McObfPair field_192129_i = McMappingDatabase.getSRG("field_192129_i");

	/**
	 * <p>
	 * Name: CHANGED_DIMENSION
	 * </p>
	 */
	public static McObfPair field_193134_u = McMappingDatabase.getSRG("field_193134_u");

	/**
	 * <p>
	 * Name: ENTER_BLOCK
	 * </p>
	 */
	public static McObfPair field_192124_d = McMappingDatabase.getSRG("field_192124_d");

	/**
	 * <p>
	 * Name: BRED_ANIMALS
	 * </p>
	 */
	public static McObfPair field_192134_n = McMappingDatabase.getSRG("field_192134_n");

	/**
	 * <p>
	 * Name: BREWED_POTION
	 * </p>
	 */
	public static McObfPair field_192130_j = McMappingDatabase.getSRG("field_192130_j");

	/**
	 * <p>
	 * Name: CONSTRUCT_BEACON
	 * </p>
	 */
	public static McObfPair field_192131_k = McMappingDatabase.getSRG("field_192131_k");

	/**
	 * <p>
	 * Name: SUMMONED_ENTITY
	 * </p>
	 */
	public static McObfPair field_192133_m = McMappingDatabase.getSRG("field_192133_m");

	/**
	 * <p>
	 * Name: CONSUME_ITEM
	 * </p>
	 */
	public static McObfPair field_193138_y = McMappingDatabase.getSRG("field_193138_y");

	/**
	 * <p>
	 * Name: PLAYER_HURT_ENTITY
	 * </p>
	 */
	public static McObfPair field_192127_g = McMappingDatabase.getSRG("field_192127_g");

	/**
	 * <p>
	 * Name: getAll
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_192120_a = McMappingDatabase.getSRG("CriteriaTriggers.func_192120_a");

	/**
	 * <p>
	 * Name: register
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger;)Lnet/minecraft/advancements/ICriterionTrigger;]
	 * </p>
	 */
	public static McObfPair func_192118_a = McMappingDatabase.getSRG("CriteriaTriggers.func_192118_a");

	/**
	 * <p>
	 * Name: VILLAGER_TRADE
	 * </p>
	 */
	public static McObfPair field_192138_r = McMappingDatabase.getSRG("field_192138_r");

	/**
	 * <p>
	 * Name: INVENTORY_CHANGED
	 * </p>
	 */
	public static McObfPair field_192125_e = McMappingDatabase.getSRG("field_192125_e");

	/**
	 * <p>
	 * Name: IMPOSSIBLE
	 * </p>
	 */
	public static McObfPair field_192121_a = McMappingDatabase.getSRG("field_192121_a");

	/**
	 * <p>
	 * Name: ENTITY_KILLED_PLAYER
	 * </p>
	 */
	public static McObfPair field_192123_c = McMappingDatabase.getSRG("field_192123_c");

	/**
	 * <p>
	 * Name: NETHER_TRAVEL
	 * </p>
	 */
	public static McObfPair field_193131_B = McMappingDatabase.getSRG("field_193131_B");

	/**
	 * <p>
	 * Name: USED_TOTEM
	 * </p>
	 */
	public static McObfPair field_193130_A = McMappingDatabase.getSRG("field_193130_A");

	/**
	 * <p>
	 * Name: LOCATION
	 * </p>
	 */
	public static McObfPair field_192135_o = McMappingDatabase.getSRG("field_192135_o");

	/**
	 * <p>
	 * Name: USED_ENDER_EYE
	 * </p>
	 */
	public static McObfPair field_192132_l = McMappingDatabase.getSRG("field_192132_l");

	/**
	 * <p>
	 * Name: TICK
	 * </p>
	 */
	public static McObfPair field_193135_v = McMappingDatabase.getSRG("field_193135_v");

	/**
	 * <p>
	 * Name: LEVITATION
	 * </p>
	 */
	public static McObfPair field_193133_t = McMappingDatabase.getSRG("field_193133_t");

}

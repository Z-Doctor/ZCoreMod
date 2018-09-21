package zdoctor.zcoremod.map.minecraft.entity.boss.dragon.phase;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PhaseList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abt";
		else
			return "net/minecraft/entity/boss/dragon/phase/PhaseList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abt";
		else
			return "PhaseList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labt;";
		else
			return "Lnet/minecraft/entity/boss/dragon/phase/PhaseList;";
	}

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188740_b = McMappingDatabase.getSRG("PhaseList.func_188740_b");

	/**
	 * <p>
	 * Name: LANDING_APPROACH
	 * </p>
	 */
	public static McObfPair field_188743_c = McMappingDatabase.getSRG("field_188743_c");

	/**
	 * <p>
	 * Name: getById
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/entity/boss/dragon/phase/PhaseList;]
	 * </p>
	 */
	public static McObfPair func_188738_a = McMappingDatabase.getSRG("PhaseList.func_188738_a");

	/**
	 * <p>
	 * Name: createPhase
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/boss/EntityDragon;)Lnet/minecraft/entity/boss/dragon/phase/IPhase;]
	 * </p>
	 */
	public static McObfPair func_188736_a = McMappingDatabase.getSRG("PhaseList.func_188736_a");

	/**
	 * <p>
	 * Name: getTotalPhases
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188739_c = McMappingDatabase.getSRG("PhaseList.func_188739_c");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_188754_n = McMappingDatabase.getSRG("field_188754_n");

	/**
	 * <p>
	 * Name: HOVER
	 * </p>
	 */
	public static McObfPair field_188751_k = McMappingDatabase.getSRG("field_188751_k");

	/**
	 * <p>
	 * Name: TAKEOFF
	 * </p>
	 */
	public static McObfPair field_188745_e = McMappingDatabase.getSRG("field_188745_e");

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Ljava/lang/String;)Lnet/minecraft/entity/boss/dragon/phase/PhaseList;]
	 * </p>
	 */
	public static McObfPair func_188735_a = McMappingDatabase.getSRG("PhaseList.func_188735_a");

	/**
	 * <p>
	 * Name: phases
	 * </p>
	 */
	public static McObfPair field_188752_l = McMappingDatabase.getSRG("field_188752_l");

	/**
	 * <p>
	 * Name: LANDING
	 * </p>
	 */
	public static McObfPair field_188744_d = McMappingDatabase.getSRG("field_188744_d");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_188755_o = McMappingDatabase.getSRG("field_188755_o");

	/**
	 * <p>
	 * Name: DYING
	 * </p>
	 */
	public static McObfPair field_188750_j = McMappingDatabase.getSRG("field_188750_j");

	/**
	 * <p>
	 * Name: SITTING_SCANNING
	 * </p>
	 */
	public static McObfPair field_188747_g = McMappingDatabase.getSRG("field_188747_g");

	/**
	 * <p>
	 * Name: clazz
	 * </p>
	 */
	public static McObfPair field_188753_m = McMappingDatabase.getSRG("field_188753_m");

	/**
	 * <p>
	 * Name: SITTING_FLAMING
	 * </p>
	 */
	public static McObfPair field_188746_f = McMappingDatabase.getSRG("field_188746_f");

	/**
	 * <p>
	 * Name: getConstructor
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/reflect/Constructor;]
	 * </p>
	 */
	public static McObfPair func_188737_a = McMappingDatabase.getSRG("PhaseList.func_188737_a");

	/**
	 * <p>
	 * Name: CHARGING_PLAYER
	 * </p>
	 */
	public static McObfPair field_188749_i = McMappingDatabase.getSRG("field_188749_i");

	/**
	 * <p>
	 * Name: SITTING_ATTACKING
	 * </p>
	 */
	public static McObfPair field_188748_h = McMappingDatabase.getSRG("field_188748_h");

	/**
	 * <p>
	 * Name: STRAFE_PLAYER
	 * </p>
	 */
	public static McObfPair field_188742_b = McMappingDatabase.getSRG("field_188742_b");

	/**
	 * <p>
	 * Name: HOLDING_PATTERN
	 * </p>
	 */
	public static McObfPair field_188741_a = McMappingDatabase.getSRG("field_188741_a");

}

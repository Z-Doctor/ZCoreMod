package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityCreature {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vx";
		else
			return "net/minecraft/entity/EntityCreature";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vx";
		else
			return "EntityCreature";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvx;";
		else
			return "Lnet/minecraft/entity/EntityCreature;";
	}

	/**
	 * <p>
	 * Name: hasHome
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_110175_bO = McMappingDatabase.getSRG("EntityCreature.func_110175_bO");

	/**
	 * <p>
	 * Name: homePosition
	 * </p>
	 */
	public static McObfPair field_70775_bC = McMappingDatabase.getSRG("field_70775_bC");

	/**
	 * <p>
	 * Name: followLeashSpeed
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_190634_dg = McMappingDatabase.getSRG("EntityCreature.func_190634_dg");

	/**
	 * <p>
	 * Name: onLeashDistance
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_142017_o = McMappingDatabase.getSRG("EntityCreature.func_142017_o");

	/**
	 * <p>
	 * Name: getCanSpawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70601_bi = McMappingDatabase.getSRG("EntityCreature.func_70601_bi");

	/**
	 * <p>
	 * Name: maximumHomeDistance
	 * </p>
	 */
	public static McObfPair field_70772_bD = McMappingDatabase.getSRG("field_70772_bD");

	/**
	 * <p>
	 * Name: setHomePosAndDistance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_175449_a = McMappingDatabase.getSRG("EntityCreature.func_175449_a");

	/**
	 * <p>
	 * Name: detachHome
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110177_bN = McMappingDatabase.getSRG("EntityCreature.func_110177_bN");

	/**
	 * <p>
	 * Name: FLEEING_SPEED_MODIFIER
	 * </p>
	 */
	public static McObfPair field_110181_i = McMappingDatabase.getSRG("field_110181_i");

	/**
	 * <p>
	 * Name: updateLeashedState
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110159_bB = McMappingDatabase.getSRG("EntityCreature.func_110159_bB");

	/**
	 * <p>
	 * Name: hasPath
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70781_l = McMappingDatabase.getSRG("EntityCreature.func_70781_l");

	/**
	 * <p>
	 * Name: isWithinHomeDistanceFromPosition
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180485_d = McMappingDatabase.getSRG("EntityCreature.func_180485_d");

	/**
	 * <p>
	 * Name: restoreWaterCost
	 * </p>
	 */
	public static McObfPair field_184661_bw = McMappingDatabase.getSRG("field_184661_bw");

	/**
	 * <p>
	 * Name: FLEEING_SPEED_MODIFIER_UUID
	 * </p>
	 */
	public static McObfPair field_110179_h = McMappingDatabase.getSRG("field_110179_h");

	/**
	 * <p>
	 * Name: getBlockPathWeight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)F]
	 * </p>
	 */
	public static McObfPair func_180484_a = McMappingDatabase.getSRG("EntityCreature.func_180484_a");

	/**
	 * <p>
	 * Name: getMaximumHomeDistance
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_110174_bM = McMappingDatabase.getSRG("EntityCreature.func_110174_bM");

	/**
	 * <p>
	 * Name: isWithinHomeDistanceCurrentPosition
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_110173_bK = McMappingDatabase.getSRG("EntityCreature.func_110173_bK");

	/**
	 * <p>
	 * Name: getHomePosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180486_cf = McMappingDatabase.getSRG("EntityCreature.func_180486_cf");

}

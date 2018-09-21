package zdoctor.zcoremod.map.minecraft.entity.boss.dragon.phase;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PhaseStrafePlayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abr";
		else
			return "net/minecraft/entity/boss/dragon/phase/PhaseStrafePlayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abr";
		else
			return "PhaseStrafePlayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labr;";
		else
			return "Lnet/minecraft/entity/boss/dragon/phase/PhaseStrafePlayer;";
	}

	/**
	 * <p>
	 * Name: setTarget
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_188686_a = McMappingDatabase.getSRG("PhaseStrafePlayer.func_188686_a");

	/**
	 * <p>
	 * Name: holdingPatternClockwise
	 * </p>
	 */
	public static McObfPair field_188694_g = McMappingDatabase.getSRG("field_188694_g");

	/**
	 * <p>
	 * Name: getTargetLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_188650_g = McMappingDatabase.getSRG("PhaseStrafePlayer.func_188650_g");

	/**
	 * <p>
	 * Name: initPhase
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188660_d = McMappingDatabase.getSRG("PhaseStrafePlayer.func_188660_d");

	/**
	 * <p>
	 * Name: navigateToNextPathNode
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188688_k = McMappingDatabase.getSRG("PhaseStrafePlayer.func_188688_k");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/boss/dragon/phase/PhaseList;]
	 * </p>
	 */
	public static McObfPair func_188652_i = McMappingDatabase.getSRG("PhaseStrafePlayer.func_188652_i");

	/**
	 * <p>
	 * Name: attackTarget
	 * </p>
	 */
	public static McObfPair field_188693_f = McMappingDatabase.getSRG("field_188693_f");

	/**
	 * <p>
	 * Name: currentPath
	 * </p>
	 */
	public static McObfPair field_188691_d = McMappingDatabase.getSRG("field_188691_d");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_188689_b = McMappingDatabase.getSRG("field_188689_b");

	/**
	 * <p>
	 * Name: doLocalUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188659_c = McMappingDatabase.getSRG("PhaseStrafePlayer.func_188659_c");

	/**
	 * <p>
	 * Name: fireballCharge
	 * </p>
	 */
	public static McObfPair field_188690_c = McMappingDatabase.getSRG("field_188690_c");

	/**
	 * <p>
	 * Name: targetLocation
	 * </p>
	 */
	public static McObfPair field_188692_e = McMappingDatabase.getSRG("field_188692_e");

	/**
	 * <p>
	 * Name: findNewTarget
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188687_j = McMappingDatabase.getSRG("PhaseStrafePlayer.func_188687_j");

}

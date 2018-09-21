package zdoctor.zcoremod.map.minecraft.entity.boss.dragon.phase;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PhaseLandingApproach {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abl";
		else
			return "net/minecraft/entity/boss/dragon/phase/PhaseLandingApproach";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abl";
		else
			return "PhaseLandingApproach";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labl;";
		else
			return "Lnet/minecraft/entity/boss/dragon/phase/PhaseLandingApproach;";
	}

	/**
	 * <p>
	 * Name: navigateToNextPathNode
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188682_k = McMappingDatabase.getSRG("PhaseLandingApproach.func_188682_k");

	/**
	 * <p>
	 * Name: initPhase
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188660_d = McMappingDatabase.getSRG("PhaseLandingApproach.func_188660_d");

	/**
	 * <p>
	 * Name: getTargetLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_188650_g = McMappingDatabase.getSRG("PhaseLandingApproach.func_188650_g");

	/**
	 * <p>
	 * Name: targetLocation
	 * </p>
	 */
	public static McObfPair field_188684_c = McMappingDatabase.getSRG("field_188684_c");

	/**
	 * <p>
	 * Name: doLocalUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188659_c = McMappingDatabase.getSRG("PhaseLandingApproach.func_188659_c");

	/**
	 * <p>
	 * Name: findNewTarget
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188681_j = McMappingDatabase.getSRG("PhaseLandingApproach.func_188681_j");

	/**
	 * <p>
	 * Name: currentPath
	 * </p>
	 */
	public static McObfPair field_188683_b = McMappingDatabase.getSRG("field_188683_b");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/boss/dragon/phase/PhaseList;]
	 * </p>
	 */
	public static McObfPair func_188652_i = McMappingDatabase.getSRG("PhaseLandingApproach.func_188652_i");

}

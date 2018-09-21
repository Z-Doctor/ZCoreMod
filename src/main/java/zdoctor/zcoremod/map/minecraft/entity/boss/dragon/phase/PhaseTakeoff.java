package zdoctor.zcoremod.map.minecraft.entity.boss.dragon.phase;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PhaseTakeoff {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abs";
		else
			return "net/minecraft/entity/boss/dragon/phase/PhaseTakeoff";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abs";
		else
			return "PhaseTakeoff";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labs;";
		else
			return "Lnet/minecraft/entity/boss/dragon/phase/PhaseTakeoff;";
	}

	/**
	 * <p>
	 * Name: firstTick
	 * </p>
	 */
	public static McObfPair field_188697_b = McMappingDatabase.getSRG("field_188697_b");

	/**
	 * <p>
	 * Name: getTargetLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_188650_g = McMappingDatabase.getSRG("PhaseTakeoff.func_188650_g");

	/**
	 * <p>
	 * Name: navigateToNextPathNode
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188696_k = McMappingDatabase.getSRG("PhaseTakeoff.func_188696_k");

	/**
	 * <p>
	 * Name: currentPath
	 * </p>
	 */
	public static McObfPair field_188698_c = McMappingDatabase.getSRG("field_188698_c");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/boss/dragon/phase/PhaseList;]
	 * </p>
	 */
	public static McObfPair func_188652_i = McMappingDatabase.getSRG("PhaseTakeoff.func_188652_i");

	/**
	 * <p>
	 * Name: findNewTarget
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188695_j = McMappingDatabase.getSRG("PhaseTakeoff.func_188695_j");

	/**
	 * <p>
	 * Name: doLocalUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188659_c = McMappingDatabase.getSRG("PhaseTakeoff.func_188659_c");

	/**
	 * <p>
	 * Name: initPhase
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188660_d = McMappingDatabase.getSRG("PhaseTakeoff.func_188660_d");

	/**
	 * <p>
	 * Name: targetLocation
	 * </p>
	 */
	public static McObfPair field_188699_d = McMappingDatabase.getSRG("field_188699_d");

}

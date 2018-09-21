package zdoctor.zcoremod.map.minecraft.entity.boss.dragon.phase;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PhaseLanding {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abm";
		else
			return "net/minecraft/entity/boss/dragon/phase/PhaseLanding";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abm";
		else
			return "PhaseLanding";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labm;";
		else
			return "Lnet/minecraft/entity/boss/dragon/phase/PhaseLanding;";
	}

	/**
	 * <p>
	 * Name: doLocalUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188659_c = McMappingDatabase.getSRG("PhaseLanding.func_188659_c");

	/**
	 * <p>
	 * Name: getMaxRiseOrFall
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_188651_f = McMappingDatabase.getSRG("PhaseLanding.func_188651_f");

	/**
	 * <p>
	 * Name: getYawFactor
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_188653_h = McMappingDatabase.getSRG("PhaseLanding.func_188653_h");

	/**
	 * <p>
	 * Name: initPhase
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188660_d = McMappingDatabase.getSRG("PhaseLanding.func_188660_d");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/boss/dragon/phase/PhaseList;]
	 * </p>
	 */
	public static McObfPair func_188652_i = McMappingDatabase.getSRG("PhaseLanding.func_188652_i");

	/**
	 * <p>
	 * Name: getTargetLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_188650_g = McMappingDatabase.getSRG("PhaseLanding.func_188650_g");

	/**
	 * <p>
	 * Name: targetLocation
	 * </p>
	 */
	public static McObfPair field_188685_b = McMappingDatabase.getSRG("field_188685_b");

	/**
	 * <p>
	 * Name: doClientRenderEffects
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188657_b = McMappingDatabase.getSRG("PhaseLanding.func_188657_b");

}

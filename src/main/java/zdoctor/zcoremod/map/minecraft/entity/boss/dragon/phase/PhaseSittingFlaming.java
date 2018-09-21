package zdoctor.zcoremod.map.minecraft.entity.boss.dragon.phase;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PhaseSittingFlaming {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abp";
		else
			return "net/minecraft/entity/boss/dragon/phase/PhaseSittingFlaming";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abp";
		else
			return "PhaseSittingFlaming";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labp;";
		else
			return "Lnet/minecraft/entity/boss/dragon/phase/PhaseSittingFlaming;";
	}

	/**
	 * <p>
	 * Name: removeAreaEffect
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188658_e = McMappingDatabase.getSRG("PhaseSittingFlaming.func_188658_e");

	/**
	 * <p>
	 * Name: resetFlameCount
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188663_j = McMappingDatabase.getSRG("PhaseSittingFlaming.func_188663_j");

	/**
	 * <p>
	 * Name: initPhase
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188660_d = McMappingDatabase.getSRG("PhaseSittingFlaming.func_188660_d");

	/**
	 * <p>
	 * Name: flameCount
	 * </p>
	 */
	public static McObfPair field_188665_c = McMappingDatabase.getSRG("field_188665_c");

	/**
	 * <p>
	 * Name: doLocalUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188659_c = McMappingDatabase.getSRG("PhaseSittingFlaming.func_188659_c");

	/**
	 * <p>
	 * Name: areaEffectCloud
	 * </p>
	 */
	public static McObfPair field_188666_d = McMappingDatabase.getSRG("field_188666_d");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/boss/dragon/phase/PhaseList;]
	 * </p>
	 */
	public static McObfPair func_188652_i = McMappingDatabase.getSRG("PhaseSittingFlaming.func_188652_i");

	/**
	 * <p>
	 * Name: flameTicks
	 * </p>
	 */
	public static McObfPair field_188664_b = McMappingDatabase.getSRG("field_188664_b");

	/**
	 * <p>
	 * Name: doClientRenderEffects
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188657_b = McMappingDatabase.getSRG("PhaseSittingFlaming.func_188657_b");

}

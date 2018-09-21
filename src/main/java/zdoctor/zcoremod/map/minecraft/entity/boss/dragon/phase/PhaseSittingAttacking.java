package zdoctor.zcoremod.map.minecraft.entity.boss.dragon.phase;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PhaseSittingAttacking {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abo";
		else
			return "net/minecraft/entity/boss/dragon/phase/PhaseSittingAttacking";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abo";
		else
			return "PhaseSittingAttacking";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labo;";
		else
			return "Lnet/minecraft/entity/boss/dragon/phase/PhaseSittingAttacking;";
	}

	/**
	 * <p>
	 * Name: doClientRenderEffects
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188657_b = McMappingDatabase.getSRG("PhaseSittingAttacking.func_188657_b");

	/**
	 * <p>
	 * Name: attackingTicks
	 * </p>
	 */
	public static McObfPair field_188662_b = McMappingDatabase.getSRG("field_188662_b");

	/**
	 * <p>
	 * Name: initPhase
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188660_d = McMappingDatabase.getSRG("PhaseSittingAttacking.func_188660_d");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/boss/dragon/phase/PhaseList;]
	 * </p>
	 */
	public static McObfPair func_188652_i = McMappingDatabase.getSRG("PhaseSittingAttacking.func_188652_i");

	/**
	 * <p>
	 * Name: doLocalUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188659_c = McMappingDatabase.getSRG("PhaseSittingAttacking.func_188659_c");

}

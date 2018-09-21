package zdoctor.zcoremod.map.minecraft.entity.boss.dragon.phase;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PhaseSittingScanning {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abq";
		else
			return "net/minecraft/entity/boss/dragon/phase/PhaseSittingScanning";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abq";
		else
			return "PhaseSittingScanning";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labq;";
		else
			return "Lnet/minecraft/entity/boss/dragon/phase/PhaseSittingScanning;";
	}

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/boss/dragon/phase/PhaseList;]
	 * </p>
	 */
	public static McObfPair func_188652_i = McMappingDatabase.getSRG("PhaseSittingScanning.func_188652_i");

	/**
	 * <p>
	 * Name: initPhase
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188660_d = McMappingDatabase.getSRG("PhaseSittingScanning.func_188660_d");

	/**
	 * <p>
	 * Name: doLocalUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188659_c = McMappingDatabase.getSRG("PhaseSittingScanning.func_188659_c");

	/**
	 * <p>
	 * Name: scanningTime
	 * </p>
	 */
	public static McObfPair field_188667_b = McMappingDatabase.getSRG("field_188667_b");

}

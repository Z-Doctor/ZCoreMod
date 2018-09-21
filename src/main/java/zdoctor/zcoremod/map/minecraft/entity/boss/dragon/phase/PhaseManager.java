package zdoctor.zcoremod.map.minecraft.entity.boss.dragon.phase;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PhaseManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abu";
		else
			return "net/minecraft/entity/boss/dragon/phase/PhaseManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abu";
		else
			return "PhaseManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labu;";
		else
			return "Lnet/minecraft/entity/boss/dragon/phase/PhaseManager;";
	}

	/**
	 * <p>
	 * Name: phase
	 * </p>
	 */
	public static McObfPair field_188762_d = McMappingDatabase.getSRG("field_188762_d");

	/**
	 * <p>
	 * Name: phases
	 * </p>
	 */
	public static McObfPair field_188761_c = McMappingDatabase.getSRG("field_188761_c");

	/**
	 * <p>
	 * Name: getCurrentPhase
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/boss/dragon/phase/IPhase;]
	 * </p>
	 */
	public static McObfPair func_188756_a = McMappingDatabase.getSRG("PhaseManager.func_188756_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_188759_a = McMappingDatabase.getSRG("field_188759_a");

	/**
	 * <p>
	 * Name: getPhase
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/boss/dragon/phase/PhaseList;)Lnet/minecraft/entity/boss/dragon/phase/IPhase;]
	 * </p>
	 */
	public static McObfPair func_188757_b = McMappingDatabase.getSRG("PhaseManager.func_188757_b");

	/**
	 * <p>
	 * Name: setPhase
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/boss/dragon/phase/PhaseList;)V]
	 * </p>
	 */
	public static McObfPair func_188758_a = McMappingDatabase.getSRG("PhaseManager.func_188758_a");

	/**
	 * <p>
	 * Name: dragon
	 * </p>
	 */
	public static McObfPair field_188760_b = McMappingDatabase.getSRG("field_188760_b");

}

package zdoctor.zcoremod.map.minecraft.entity.boss.dragon.phase;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PhaseChargingPlayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abh";
		else
			return "net/minecraft/entity/boss/dragon/phase/PhaseChargingPlayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abh";
		else
			return "PhaseChargingPlayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labh;";
		else
			return "Lnet/minecraft/entity/boss/dragon/phase/PhaseChargingPlayer;";
	}

	/**
	 * <p>
	 * Name: initPhase
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188660_d = McMappingDatabase.getSRG("PhaseChargingPlayer.func_188660_d");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/boss/dragon/phase/PhaseList;]
	 * </p>
	 */
	public static McObfPair func_188652_i = McMappingDatabase.getSRG("PhaseChargingPlayer.func_188652_i");

	/**
	 * <p>
	 * Name: setTarget
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;)V]
	 * </p>
	 */
	public static McObfPair func_188668_a = McMappingDatabase.getSRG("PhaseChargingPlayer.func_188668_a");

	/**
	 * <p>
	 * Name: doLocalUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188659_c = McMappingDatabase.getSRG("PhaseChargingPlayer.func_188659_c");

	/**
	 * <p>
	 * Name: targetLocation
	 * </p>
	 */
	public static McObfPair field_188670_c = McMappingDatabase.getSRG("field_188670_c");

	/**
	 * <p>
	 * Name: getTargetLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_188650_g = McMappingDatabase.getSRG("PhaseChargingPlayer.func_188650_g");

	/**
	 * <p>
	 * Name: getMaxRiseOrFall
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_188651_f = McMappingDatabase.getSRG("PhaseChargingPlayer.func_188651_f");

	/**
	 * <p>
	 * Name: timeSinceCharge
	 * </p>
	 */
	public static McObfPair field_188671_d = McMappingDatabase.getSRG("field_188671_d");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_188669_b = McMappingDatabase.getSRG("field_188669_b");

}

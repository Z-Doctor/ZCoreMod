package zdoctor.zcoremod.map.minecraft.entity.boss.dragon.phase;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PhaseHoldingPattern {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abj";
		else
			return "net/minecraft/entity/boss/dragon/phase/PhaseHoldingPattern";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abj";
		else
			return "PhaseHoldingPattern";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labj;";
		else
			return "Lnet/minecraft/entity/boss/dragon/phase/PhaseHoldingPattern;";
	}

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/boss/dragon/phase/PhaseList;]
	 * </p>
	 */
	public static McObfPair func_188652_i = McMappingDatabase.getSRG("PhaseHoldingPattern.func_188652_i");

	/**
	 * <p>
	 * Name: currentPath
	 * </p>
	 */
	public static McObfPair field_188677_b = McMappingDatabase.getSRG("field_188677_b");

	/**
	 * <p>
	 * Name: onCrystalDestroyed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityEnderCrystal;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/DamageSource;Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_188655_a = McMappingDatabase.getSRG("PhaseHoldingPattern.func_188655_a");

	/**
	 * <p>
	 * Name: strafePlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_188674_a = McMappingDatabase.getSRG("PhaseHoldingPattern.func_188674_a");

	/**
	 * <p>
	 * Name: findNewTarget
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188675_j = McMappingDatabase.getSRG("PhaseHoldingPattern.func_188675_j");

	/**
	 * <p>
	 * Name: targetLocation
	 * </p>
	 */
	public static McObfPair field_188678_c = McMappingDatabase.getSRG("field_188678_c");

	/**
	 * <p>
	 * Name: clockwise
	 * </p>
	 */
	public static McObfPair field_188679_d = McMappingDatabase.getSRG("field_188679_d");

	/**
	 * <p>
	 * Name: doLocalUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188659_c = McMappingDatabase.getSRG("PhaseHoldingPattern.func_188659_c");

	/**
	 * <p>
	 * Name: getTargetLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_188650_g = McMappingDatabase.getSRG("PhaseHoldingPattern.func_188650_g");

	/**
	 * <p>
	 * Name: initPhase
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188660_d = McMappingDatabase.getSRG("PhaseHoldingPattern.func_188660_d");

	/**
	 * <p>
	 * Name: navigateToNextPathNode
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188676_k = McMappingDatabase.getSRG("PhaseHoldingPattern.func_188676_k");

}

package zdoctor.zcoremod.map.minecraft.entity.boss.dragon.phase;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IPhase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abn";
		else
			return "net/minecraft/entity/boss/dragon/phase/IPhase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abn";
		else
			return "IPhase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labn;";
		else
			return "Lnet/minecraft/entity/boss/dragon/phase/IPhase;";
	}

	/**
	 * <p>
	 * Name: getTargetLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_188650_g = McMappingDatabase.getSRG("IPhase.func_188650_g");

	/**
	 * <p>
	 * Name: getMaxRiseOrFall
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_188651_f = McMappingDatabase.getSRG("IPhase.func_188651_f");

	/**
	 * <p>
	 * Name: initPhase
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188660_d = McMappingDatabase.getSRG("IPhase.func_188660_d");

	/**
	 * <p>
	 * Name: onCrystalDestroyed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityEnderCrystal;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/DamageSource;Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_188655_a = McMappingDatabase.getSRG("IPhase.func_188655_a");

	/**
	 * <p>
	 * Name: getYawFactor
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_188653_h = McMappingDatabase.getSRG("IPhase.func_188653_h");

	/**
	 * <p>
	 * Name: doLocalUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188659_c = McMappingDatabase.getSRG("IPhase.func_188659_c");

	/**
	 * <p>
	 * Name: getAdjustedDamage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/MultiPartEntityPart;Lnet/minecraft/util/DamageSource;F)F]
	 * </p>
	 */
	public static McObfPair func_188656_a = McMappingDatabase.getSRG("IPhase.func_188656_a");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/boss/dragon/phase/PhaseList;]
	 * </p>
	 */
	public static McObfPair func_188652_i = McMappingDatabase.getSRG("IPhase.func_188652_i");

	/**
	 * <p>
	 * Name: removeAreaEffect
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188658_e = McMappingDatabase.getSRG("IPhase.func_188658_e");

	/**
	 * <p>
	 * Name: doClientRenderEffects
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188657_b = McMappingDatabase.getSRG("IPhase.func_188657_b");

	/**
	 * <p>
	 * Name: getIsStationary
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188654_a = McMappingDatabase.getSRG("IPhase.func_188654_a");

}

package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityMob {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ade";
		else
			return "net/minecraft/entity/monster/EntityMob";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ade";
		else
			return "EntityMob";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lade;";
		else
			return "Lnet/minecraft/entity/monster/EntityMob;";
	}

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityMob.func_70636_d");

	/**
	 * <p>
	 * Name: getFallSound
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184588_d = McMappingDatabase.getSRG("EntityMob.func_184588_d");

	/**
	 * <p>
	 * Name: getSoundCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundCategory;]
	 * </p>
	 */
	public static McObfPair func_184176_by = McMappingDatabase.getSRG("EntityMob.func_184176_by");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityMob.func_110147_ax");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityMob.func_184601_bQ");

	/**
	 * <p>
	 * Name: isValidLightLevel
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70814_o = McMappingDatabase.getSRG("EntityMob.func_70814_o");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityMob.func_70071_h_");

	/**
	 * <p>
	 * Name: canDropLoot
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_146066_aG = McMappingDatabase.getSRG("EntityMob.func_146066_aG");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityMob.func_70097_a");

	/**
	 * <p>
	 * Name: getCanSpawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70601_bi = McMappingDatabase.getSRG("EntityMob.func_70601_bi");

	/**
	 * <p>
	 * Name: attackEntityAsMob
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_70652_k = McMappingDatabase.getSRG("EntityMob.func_70652_k");

	/**
	 * <p>
	 * Name: isPreventingPlayerRest
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_191990_c = McMappingDatabase.getSRG("EntityMob.func_191990_c");

	/**
	 * <p>
	 * Name: getSwimSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184184_Z = McMappingDatabase.getSRG("EntityMob.func_184184_Z");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityMob.func_184615_bR");

	/**
	 * <p>
	 * Name: getBlockPathWeight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)F]
	 * </p>
	 */
	public static McObfPair func_180484_a = McMappingDatabase.getSRG("EntityMob.func_180484_a");

	/**
	 * <p>
	 * Name: getSplashSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184181_aa = McMappingDatabase.getSRG("EntityMob.func_184181_aa");

}

package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityIllusionIllager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adc";
		else
			return "net/minecraft/entity/monster/EntityIllusionIllager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adc";
		else
			return "EntityIllusionIllager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladc;";
		else
			return "Lnet/minecraft/entity/monster/EntityIllusionIllager;";
	}

	/**
	 * <p>
	 * Name: isOnSameTeam
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_184191_r = McMappingDatabase.getSRG("EntityIllusionIllager.func_184191_r");

	/**
	 * <p>
	 * Name: attackEntityWithRangedAttack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_82196_d = McMappingDatabase.getSRG("EntityIllusionIllager.func_82196_d");

	/**
	 * <p>
	 * Name: setSwingingArms
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184724_a = McMappingDatabase.getSRG("EntityIllusionIllager.func_184724_a");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityIllusionIllager.func_184651_r");

	/**
	 * <p>
	 * Name: onInitialSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_180482_a = McMappingDatabase.getSRG("EntityIllusionIllager.func_180482_a");

	/**
	 * <p>
	 * Name: getRenderLocations
	 * </p>
	 * <p>
	 * Desc: [(F)[Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_193098_a = McMappingDatabase.getSRG("EntityIllusionIllager.func_193098_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityIllusionIllager.func_70088_a");

	/**
	 * <p>
	 * Name: ghostTime
	 * </p>
	 */
	public static McObfPair field_193099_c = McMappingDatabase.getSRG("field_193099_c");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityIllusionIllager.func_184615_bR");

	/**
	 * <p>
	 * Name: isAggressive
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193096_dj = McMappingDatabase.getSRG("EntityIllusionIllager.func_193096_dj");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityIllusionIllager.func_70636_d");

	/**
	 * <p>
	 * Name: getSpellSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_193086_dk = McMappingDatabase.getSRG("EntityIllusionIllager.func_193086_dk");

	/**
	 * <p>
	 * Name: getArmPose
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/monster/AbstractIllager$IllagerArmPose;]
	 * </p>
	 */
	public static McObfPair func_193077_p = McMappingDatabase.getSRG("EntityIllusionIllager.func_193077_p");

	/**
	 * <p>
	 * Name: renderLocations
	 * </p>
	 */
	public static McObfPair field_193100_bx = McMappingDatabase.getSRG("field_193100_bx");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityIllusionIllager.func_184601_bQ");

	/**
	 * <p>
	 * Name: getRenderBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_184177_bl = McMappingDatabase.getSRG("EntityIllusionIllager.func_184177_bl");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityIllusionIllager.func_110147_ax");

	/**
	 * <p>
	 * Name: createArrowEntity
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/entity/projectile/EntityArrow;]
	 * </p>
	 */
	public static McObfPair func_193097_t = McMappingDatabase.getSRG("EntityIllusionIllager.func_193097_t");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityIllusionIllager.func_184647_J");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityIllusionIllager.func_184639_G");

}

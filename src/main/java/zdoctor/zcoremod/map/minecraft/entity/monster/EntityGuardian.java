package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityGuardian {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ada";
		else
			return "net/minecraft/entity/monster/EntityGuardian";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ada";
		else
			return "EntityGuardian";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lada;";
		else
			return "Lnet/minecraft/entity/monster/EntityGuardian;";
	}

	/**
	 * <p>
	 * Name: travel
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_191986_a = McMappingDatabase.getSRG("EntityGuardian.func_191986_a");

	/**
	 * <p>
	 * Name: hasTargetedEntity
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175474_cn = McMappingDatabase.getSRG("EntityGuardian.func_175474_cn");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityGuardian.func_70088_a");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityGuardian.func_70636_d");

	/**
	 * <p>
	 * Name: getTalkInterval
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70627_aG = McMappingDatabase.getSRG("EntityGuardian.func_70627_aG");

	/**
	 * <p>
	 * Name: clientSideTouchedGround
	 * </p>
	 */
	public static McObfPair field_175480_bp = McMappingDatabase.getSRG("field_175480_bp");

	/**
	 * <p>
	 * Name: clientSideSpikesAnimationO
	 * </p>
	 */
	public static McObfPair field_175486_bm = McMappingDatabase.getSRG("field_175486_bm");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityGuardian.func_184601_bQ");

	/**
	 * <p>
	 * Name: getBlockPathWeight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)F]
	 * </p>
	 */
	public static McObfPair func_180484_a = McMappingDatabase.getSRG("EntityGuardian.func_180484_a");

	/**
	 * <p>
	 * Name: canTriggerWalking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70041_e_ = McMappingDatabase.getSRG("EntityGuardian.func_70041_e_");

	/**
	 * <p>
	 * Name: getFlopSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_190765_dj = McMappingDatabase.getSRG("EntityGuardian.func_190765_dj");

	/**
	 * <p>
	 * Name: getTargetedEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EntityLivingBase;]
	 * </p>
	 */
	public static McObfPair func_175466_co = McMappingDatabase.getSRG("EntityGuardian.func_175466_co");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntityGuardian.func_70047_e");

	/**
	 * <p>
	 * Name: getTailAnimation
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_175471_a = McMappingDatabase.getSRG("EntityGuardian.func_175471_a");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityGuardian.func_184639_G");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityGuardian.func_70097_a");

	/**
	 * <p>
	 * Name: clientSideSpikesAnimation
	 * </p>
	 */
	public static McObfPair field_175485_bl = McMappingDatabase.getSRG("field_175485_bl");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityGuardian.func_184647_J");

	/**
	 * <p>
	 * Name: setMoving
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_175476_l = McMappingDatabase.getSRG("EntityGuardian.func_175476_l");

	/**
	 * <p>
	 * Name: wander
	 * </p>
	 */
	public static McObfPair field_175481_bq = McMappingDatabase.getSRG("field_175481_bq");

	/**
	 * <p>
	 * Name: TARGET_ENTITY
	 * </p>
	 */
	public static McObfPair field_184723_b = McMappingDatabase.getSRG("field_184723_b");

	/**
	 * <p>
	 * Name: createNavigator
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)Lnet/minecraft/pathfinding/PathNavigate;]
	 * </p>
	 */
	public static McObfPair func_175447_b = McMappingDatabase.getSRG("EntityGuardian.func_175447_b");

	/**
	 * <p>
	 * Name: targetedEntity
	 * </p>
	 */
	public static McObfPair field_175478_bn = McMappingDatabase.getSRG("field_175478_bn");

	/**
	 * <p>
	 * Name: registerFixesGuardian
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189766_b = McMappingDatabase.getSRG("EntityGuardian.func_189766_b");

	/**
	 * <p>
	 * Name: clientSideAttackTime
	 * </p>
	 */
	public static McObfPair field_175479_bo = McMappingDatabase.getSRG("field_175479_bo");

	/**
	 * <p>
	 * Name: getVerticalFaceSpeed
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70646_bf = McMappingDatabase.getSRG("EntityGuardian.func_70646_bf");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityGuardian.func_184615_bR");

	/**
	 * <p>
	 * Name: notifyDataManagerChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_184206_a = McMappingDatabase.getSRG("EntityGuardian.func_184206_a");

	/**
	 * <p>
	 * Name: getAttackDuration
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_175464_ck = McMappingDatabase.getSRG("EntityGuardian.func_175464_ck");

	/**
	 * <p>
	 * Name: MOVING
	 * </p>
	 */
	public static McObfPair field_190766_bz = McMappingDatabase.getSRG("field_190766_bz");

	/**
	 * <p>
	 * Name: isMoving
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175472_n = McMappingDatabase.getSRG("EntityGuardian.func_175472_n");

	/**
	 * <p>
	 * Name: isNotColliding
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70058_J = McMappingDatabase.getSRG("EntityGuardian.func_70058_J");

	/**
	 * <p>
	 * Name: clientSideTailAnimationSpeed
	 * </p>
	 */
	public static McObfPair field_175483_bk = McMappingDatabase.getSRG("field_175483_bk");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityGuardian.func_184651_r");

	/**
	 * <p>
	 * Name: isValidLightLevel
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70814_o = McMappingDatabase.getSRG("EntityGuardian.func_70814_o");

	/**
	 * <p>
	 * Name: getAttackAnimationScale
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_175477_p = McMappingDatabase.getSRG("EntityGuardian.func_175477_p");

	/**
	 * <p>
	 * Name: clientSideTailAnimationO
	 * </p>
	 */
	public static McObfPair field_175484_c = McMappingDatabase.getSRG("field_175484_c");

	/**
	 * <p>
	 * Name: getCanSpawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70601_bi = McMappingDatabase.getSRG("EntityGuardian.func_70601_bi");

	/**
	 * <p>
	 * Name: setTargetedEntity
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_175463_b = McMappingDatabase.getSRG("EntityGuardian.func_175463_b");

	/**
	 * <p>
	 * Name: getSpikesAnimation
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_175469_o = McMappingDatabase.getSRG("EntityGuardian.func_175469_o");

	/**
	 * <p>
	 * Name: clientSideTailAnimation
	 * </p>
	 */
	public static McObfPair field_175482_b = McMappingDatabase.getSRG("field_175482_b");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityGuardian.func_110147_ax");

}

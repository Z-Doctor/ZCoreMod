package zdoctor.zcoremod.map.minecraft.entity.boss;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityWither {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abx";
		else
			return "net/minecraft/entity/boss/EntityWither";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abx";
		else
			return "EntityWither";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labx;";
		else
			return "Lnet/minecraft/entity/boss/EntityWither;";
	}

	/**
	 * <p>
	 * Name: setSwingingArms
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184724_a = McMappingDatabase.getSRG("EntityWither.func_184724_a");

	/**
	 * <p>
	 * Name: canBeRidden
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_184228_n = McMappingDatabase.getSRG("EntityWither.func_184228_n");

	/**
	 * <p>
	 * Name: getCreatureAttribute
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EnumCreatureAttribute;]
	 * </p>
	 */
	public static McObfPair func_70668_bt = McMappingDatabase.getSRG("EntityWither.func_70668_bt");

	/**
	 * <p>
	 * Name: NOT_UNDEAD
	 * </p>
	 */
	public static McObfPair field_82219_bJ = McMappingDatabase.getSRG("field_82219_bJ");

	/**
	 * <p>
	 * Name: addPotionEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionEffect;)V]
	 * </p>
	 */
	public static McObfPair func_70690_d = McMappingDatabase.getSRG("EntityWither.func_70690_d");

	/**
	 * <p>
	 * Name: updateWatchedTargetId
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_82211_c = McMappingDatabase.getSRG("EntityWither.func_82211_c");

	/**
	 * <p>
	 * Name: isArmored
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82205_o = McMappingDatabase.getSRG("EntityWither.func_82205_o");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityWither.func_184639_G");

	/**
	 * <p>
	 * Name: fall
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_180430_e = McMappingDatabase.getSRG("EntityWither.func_180430_e");

	/**
	 * <p>
	 * Name: attackEntityWithRangedAttack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_82196_d = McMappingDatabase.getSRG("EntityWither.func_82196_d");

	/**
	 * <p>
	 * Name: isNonBoss
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184222_aU = McMappingDatabase.getSRG("EntityWither.func_184222_aU");

	/**
	 * <p>
	 * Name: THIRD_HEAD_TARGET
	 * </p>
	 */
	public static McObfPair field_184743_c = McMappingDatabase.getSRG("field_184743_c");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityWither.func_184615_bR");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityWither.func_184601_bQ");

	/**
	 * <p>
	 * Name: HEAD_TARGETS
	 * </p>
	 */
	public static McObfPair field_184745_bv = McMappingDatabase.getSRG("field_184745_bv");

	/**
	 * <p>
	 * Name: idleHeadUpdates
	 * </p>
	 */
	public static McObfPair field_82224_i = McMappingDatabase.getSRG("field_82224_i");

	/**
	 * <p>
	 * Name: canDestroyBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Z]
	 * </p>
	 */
	public static McObfPair func_181033_a = McMappingDatabase.getSRG("EntityWither.func_181033_a");

	/**
	 * <p>
	 * Name: getWatchedTargetId
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_82203_t = McMappingDatabase.getSRG("EntityWither.func_82203_t");

	/**
	 * <p>
	 * Name: despawnEntity
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70623_bb = McMappingDatabase.getSRG("EntityWither.func_70623_bb");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityWither.func_110147_ax");

	/**
	 * <p>
	 * Name: xRotationHeads
	 * </p>
	 */
	public static McObfPair field_82220_d = McMappingDatabase.getSRG("field_82220_d");

	/**
	 * <p>
	 * Name: xRotOHeads
	 * </p>
	 */
	public static McObfPair field_82217_f = McMappingDatabase.getSRG("field_82217_f");

	/**
	 * <p>
	 * Name: INVULNERABILITY_TIME
	 * </p>
	 */
	public static McObfPair field_184746_bw = McMappingDatabase.getSRG("field_184746_bw");

	/**
	 * <p>
	 * Name: registerFixesWither
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189782_b = McMappingDatabase.getSRG("EntityWither.func_189782_b");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityWither.func_70037_a");

	/**
	 * <p>
	 * Name: getBrightnessForRender
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70070_b = McMappingDatabase.getSRG("EntityWither.func_70070_b");

	/**
	 * <p>
	 * Name: SECOND_HEAD_TARGET
	 * </p>
	 */
	public static McObfPair field_184742_b = McMappingDatabase.getSRG("field_184742_b");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityWither.func_70097_a");

	/**
	 * <p>
	 * Name: getHeadZ
	 * </p>
	 * <p>
	 * Desc: [(I)D]
	 * </p>
	 */
	public static McObfPair func_82213_w = McMappingDatabase.getSRG("EntityWither.func_82213_w");

	/**
	 * <p>
	 * Name: getHeadY
	 * </p>
	 * <p>
	 * Desc: [(I)D]
	 * </p>
	 */
	public static McObfPair func_82208_v = McMappingDatabase.getSRG("EntityWither.func_82208_v");

	/**
	 * <p>
	 * Name: getHeadYRotation
	 * </p>
	 * <p>
	 * Desc: [(I)F]
	 * </p>
	 */
	public static McObfPair func_82207_a = McMappingDatabase.getSRG("EntityWither.func_82207_a");

	/**
	 * <p>
	 * Name: ignite
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_82206_m = McMappingDatabase.getSRG("EntityWither.func_82206_m");

	/**
	 * <p>
	 * Name: bossInfo
	 * </p>
	 */
	public static McObfPair field_184744_bE = McMappingDatabase.getSRG("field_184744_bE");

	/**
	 * <p>
	 * Name: getInvulTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82212_n = McMappingDatabase.getSRG("EntityWither.func_82212_n");

	/**
	 * <p>
	 * Name: yRotOHeads
	 * </p>
	 */
	public static McObfPair field_82218_g = McMappingDatabase.getSRG("field_82218_g");

	/**
	 * <p>
	 * Name: removeTrackingPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_184203_c = McMappingDatabase.getSRG("EntityWither.func_184203_c");

	/**
	 * <p>
	 * Name: getHeadX
	 * </p>
	 * <p>
	 * Desc: [(I)D]
	 * </p>
	 */
	public static McObfPair func_82214_u = McMappingDatabase.getSRG("EntityWither.func_82214_u");

	/**
	 * <p>
	 * Name: dropFewItems
	 * </p>
	 * <p>
	 * Desc: [(ZI)V]
	 * </p>
	 */
	public static McObfPair func_70628_a = McMappingDatabase.getSRG("EntityWither.func_70628_a");

	/**
	 * <p>
	 * Name: updateAITasks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70619_bc = McMappingDatabase.getSRG("EntityWither.func_70619_bc");

	/**
	 * <p>
	 * Name: rotlerp
	 * </p>
	 * <p>
	 * Desc: [(FFF)F]
	 * </p>
	 */
	public static McObfPair func_82204_b = McMappingDatabase.getSRG("EntityWither.func_82204_b");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityWither.func_70088_a");

	/**
	 * <p>
	 * Name: setInWeb
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70110_aj = McMappingDatabase.getSRG("EntityWither.func_70110_aj");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityWither.func_184651_r");

	/**
	 * <p>
	 * Name: nextHeadUpdate
	 * </p>
	 */
	public static McObfPair field_82223_h = McMappingDatabase.getSRG("field_82223_h");

	/**
	 * <p>
	 * Name: FIRST_HEAD_TARGET
	 * </p>
	 */
	public static McObfPair field_184741_a = McMappingDatabase.getSRG("field_184741_a");

	/**
	 * <p>
	 * Name: setCustomNameTag
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_96094_a = McMappingDatabase.getSRG("EntityWither.func_96094_a");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityWither.func_70014_b");

	/**
	 * <p>
	 * Name: addTrackingPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_184178_b = McMappingDatabase.getSRG("EntityWither.func_184178_b");

	/**
	 * <p>
	 * Name: getHeadXRotation
	 * </p>
	 * <p>
	 * Desc: [(I)F]
	 * </p>
	 */
	public static McObfPair func_82210_r = McMappingDatabase.getSRG("EntityWither.func_82210_r");

	/**
	 * <p>
	 * Name: setInvulTime
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_82215_s = McMappingDatabase.getSRG("EntityWither.func_82215_s");

	/**
	 * <p>
	 * Name: launchWitherSkullToCoords
	 * </p>
	 * <p>
	 * Desc: [(IDDDZ)V]
	 * </p>
	 */
	public static McObfPair func_82209_a = McMappingDatabase.getSRG("EntityWither.func_82209_a");

	/**
	 * <p>
	 * Name: launchWitherSkullToEntity
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_82216_a = McMappingDatabase.getSRG("EntityWither.func_82216_a");

	/**
	 * <p>
	 * Name: blockBreakCounter
	 * </p>
	 */
	public static McObfPair field_82222_j = McMappingDatabase.getSRG("field_82222_j");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityWither.func_70636_d");

	/**
	 * <p>
	 * Name: yRotationHeads
	 * </p>
	 */
	public static McObfPair field_82221_e = McMappingDatabase.getSRG("field_82221_e");

}

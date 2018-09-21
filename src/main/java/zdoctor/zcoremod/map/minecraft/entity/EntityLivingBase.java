package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityLivingBase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vp";
		else
			return "net/minecraft/entity/EntityLivingBase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vp";
		else
			return "EntityLivingBase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvp;";
		else
			return "Lnet/minecraft/entity/EntityLivingBase;";
	}

	/**
	 * <p>
	 * Name: frostWalk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184594_b = McMappingDatabase.getSRG("EntityLivingBase.func_184594_b");

	/**
	 * <p>
	 * Name: setAIMoveSpeed
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_70659_e = McMappingDatabase.getSRG("EntityLivingBase.func_70659_e");

	/**
	 * <p>
	 * Name: notifyDataManagerChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_184206_a = McMappingDatabase.getSRG("EntityLivingBase.func_184206_a");

	/**
	 * <p>
	 * Name: interpTargetZ
	 * </p>
	 */
	public static McObfPair field_184625_bj = McMappingDatabase.getSRG("field_184625_bj");

	/**
	 * <p>
	 * Name: getRevengeTarget
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EntityLivingBase;]
	 * </p>
	 */
	public static McObfPair func_70643_av = McMappingDatabase.getSRG("EntityLivingBase.func_70643_av");

	/**
	 * <p>
	 * Name: ticksElytraFlying
	 * </p>
	 */
	public static McObfPair field_184629_bo = McMappingDatabase.getSRG("field_184629_bo");

	/**
	 * <p>
	 * Name: isPlayerSleeping
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70608_bn = McMappingDatabase.getSRG("EntityLivingBase.func_70608_bn");

	/**
	 * <p>
	 * Name: dead
	 * </p>
	 */
	public static McObfPair field_70729_aU = McMappingDatabase.getSRG("field_70729_aU");

	/**
	 * <p>
	 * Name: deathTime
	 * </p>
	 */
	public static McObfPair field_70725_aQ = McMappingDatabase.getSRG("field_70725_aQ");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityLivingBase.func_184615_bR");

	/**
	 * <p>
	 * Name: attackEntityAsMob
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_70652_k = McMappingDatabase.getSRG("EntityLivingBase.func_70652_k");

	/**
	 * <p>
	 * Name: moveStrafing
	 * </p>
	 */
	public static McObfPair field_70702_br = McMappingDatabase.getSRG("field_70702_br");

	/**
	 * <p>
	 * Name: fall
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_180430_e = McMappingDatabase.getSRG("EntityLivingBase.func_180430_e");

	/**
	 * <p>
	 * Name: getSwingProgress
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_70678_g = McMappingDatabase.getSRG("EntityLivingBase.func_70678_g");

	/**
	 * <p>
	 * Name: updateEntityActionState
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70626_be = McMappingDatabase.getSRG("EntityLivingBase.func_70626_be");

	/**
	 * <p>
	 * Name: setAbsorptionAmount
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_110149_m = McMappingDatabase.getSRG("EntityLivingBase.func_110149_m");

	/**
	 * <p>
	 * Name: isEntityUndead
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70662_br = McMappingDatabase.getSRG("EntityLivingBase.func_70662_br");

	/**
	 * <p>
	 * Name: setRevengeTarget
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_70604_c = McMappingDatabase.getSRG("EntityLivingBase.func_70604_c");

	/**
	 * <p>
	 * Name: idleTime
	 * </p>
	 */
	public static McObfPair field_70708_bq = McMappingDatabase.getSRG("field_70708_bq");

	/**
	 * <p>
	 * Name: onNewPotionEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionEffect;)V]
	 * </p>
	 */
	public static McObfPair func_70670_a = McMappingDatabase.getSRG("EntityLivingBase.func_70670_a");

	/**
	 * <p>
	 * Name: getRevengeTimer
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_142015_aE = McMappingDatabase.getSRG("EntityLivingBase.func_142015_aE");

	/**
	 * <p>
	 * Name: getActiveHand
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumHand;]
	 * </p>
	 */
	public static McObfPair func_184600_cs = McMappingDatabase.getSRG("EntityLivingBase.func_184600_cs");

	/**
	 * <p>
	 * Name: prevSwingProgress
	 * </p>
	 */
	public static McObfPair field_70732_aI = McMappingDatabase.getSRG("field_70732_aI");

	/**
	 * <p>
	 * Name: handInventory
	 * </p>
	 */
	public static McObfPair field_184630_bs = McMappingDatabase.getSRG("field_184630_bs");

	/**
	 * <p>
	 * Name: getPrimaryHand
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumHandSide;]
	 * </p>
	 */
	public static McObfPair func_184591_cq = McMappingDatabase.getSRG("EntityLivingBase.func_184591_cq");

	/**
	 * <p>
	 * Name: updateFallState
	 * </p>
	 * <p>
	 * Desc: [(DZLnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184231_a = McMappingDatabase.getSRG("EntityLivingBase.func_184231_a");

	/**
	 * <p>
	 * Name: performHurtAnimation
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70057_ab = McMappingDatabase.getSRG("EntityLivingBase.func_70057_ab");

	/**
	 * <p>
	 * Name: onFinishedPotionEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionEffect;)V]
	 * </p>
	 */
	public static McObfPair func_70688_c = McMappingDatabase.getSRG("EntityLivingBase.func_70688_c");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityLivingBase.func_70071_h_");

	/**
	 * <p>
	 * Name: getEntityAttribute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/IAttribute;)Lnet/minecraft/entity/ai/attributes/IAttributeInstance;]
	 * </p>
	 */
	public static McObfPair func_110148_a = McMappingDatabase.getSRG("EntityLivingBase.func_110148_a");

	/**
	 * <p>
	 * Name: getArmorInventoryList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_184193_aE = McMappingDatabase.getSRG("EntityLivingBase.func_184193_aE");

	/**
	 * <p>
	 * Name: getCreatureAttribute
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EnumCreatureAttribute;]
	 * </p>
	 */
	public static McObfPair func_70668_bt = McMappingDatabase.getSRG("EntityLivingBase.func_70668_bt");

	/**
	 * <p>
	 * Name: isOnLadder
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70617_f_ = McMappingDatabase.getSRG("EntityLivingBase.func_70617_f_");

	/**
	 * <p>
	 * Name: interpTargetYaw
	 * </p>
	 */
	public static McObfPair field_184626_bk = McMappingDatabase.getSRG("field_184626_bk");

	/**
	 * <p>
	 * Name: getActivePotionMap
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_193076_bZ = McMappingDatabase.getSRG("EntityLivingBase.func_193076_bZ");

	/**
	 * <p>
	 * Name: arrowHitTimer
	 * </p>
	 */
	public static McObfPair field_70720_be = McMappingDatabase.getSRG("field_70720_be");

	/**
	 * <p>
	 * Name: handleJumpLava
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_180466_bG = McMappingDatabase.getSRG("EntityLivingBase.func_180466_bG");

	/**
	 * <p>
	 * Name: isPotionApplicable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionEffect;)Z]
	 * </p>
	 */
	public static McObfPair func_70687_e = McMappingDatabase.getSRG("EntityLivingBase.func_70687_e");

	/**
	 * <p>
	 * Name: getItemInUseCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184605_cv = McMappingDatabase.getSRG("EntityLivingBase.func_184605_cv");

	/**
	 * <p>
	 * Name: jumpMovementFactor
	 * </p>
	 */
	public static McObfPair field_70747_aH = McMappingDatabase.getSRG("field_70747_aH");

	/**
	 * <p>
	 * Name: getSoundVolume
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70599_aP = McMappingDatabase.getSRG("EntityLivingBase.func_70599_aP");

	/**
	 * <p>
	 * Name: isHandActive
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184587_cr = McMappingDatabase.getSRG("EntityLivingBase.func_184587_cr");

	/**
	 * <p>
	 * Name: heal
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_70691_i = McMappingDatabase.getSRG("EntityLivingBase.func_70691_i");

	/**
	 * <p>
	 * Name: landMovementFactor
	 * </p>
	 */
	public static McObfPair field_70746_aG = McMappingDatabase.getSRG("field_70746_aG");

	/**
	 * <p>
	 * Name: swingProgress
	 * </p>
	 */
	public static McObfPair field_70733_aJ = McMappingDatabase.getSRG("field_70733_aJ");

	/**
	 * <p>
	 * Name: getWaterSlowDown
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_189749_co = McMappingDatabase.getSRG("EntityLivingBase.func_189749_co");

	/**
	 * <p>
	 * Name: SPRINTING_SPEED_BOOST
	 * </p>
	 */
	public static McObfPair field_110157_c = McMappingDatabase.getSRG("field_110157_c");

	/**
	 * <p>
	 * Name: canBlockDamageSource
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Z]
	 * </p>
	 */
	public static McObfPair func_184583_d = McMappingDatabase.getSRG("EntityLivingBase.func_184583_d");

	/**
	 * <p>
	 * Name: HIDE_PARTICLES
	 * </p>
	 */
	public static McObfPair field_184634_g = McMappingDatabase.getSRG("field_184634_g");

	/**
	 * <p>
	 * Name: attackedAtYaw
	 * </p>
	 */
	public static McObfPair field_70739_aP = McMappingDatabase.getSRG("field_70739_aP");

	/**
	 * <p>
	 * Name: getAttributeMap
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/ai/attributes/AbstractAttributeMap;]
	 * </p>
	 */
	public static McObfPair func_110140_aT = McMappingDatabase.getSRG("EntityLivingBase.func_110140_aT");

	/**
	 * <p>
	 * Name: interpTargetPitch
	 * </p>
	 */
	public static McObfPair field_70709_bj = McMappingDatabase.getSRG("field_70709_bj");

	/**
	 * <p>
	 * Name: randomUnused1
	 * </p>
	 */
	public static McObfPair field_70770_ap = McMappingDatabase.getSRG("field_70770_ap");

	/**
	 * <p>
	 * Name: setJumping
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70637_d = McMappingDatabase.getSRG("EntityLivingBase.func_70637_d");

	/**
	 * <p>
	 * Name: setItemStackToSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_184201_a = McMappingDatabase.getSRG("EntityLivingBase.func_184201_a");

	/**
	 * <p>
	 * Name: updateArmSwingProgress
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_82168_bl = McMappingDatabase.getSRG("EntityLivingBase.func_82168_bl");

	/**
	 * <p>
	 * Name: swingArm
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumHand;)V]
	 * </p>
	 */
	public static McObfPair func_184609_a = McMappingDatabase.getSRG("EntityLivingBase.func_184609_a");

	/**
	 * <p>
	 * Name: isEntityAlive
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70089_S = McMappingDatabase.getSRG("EntityLivingBase.func_70089_S");

	/**
	 * <p>
	 * Name: onChangedPotionEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionEffect;Z)V]
	 * </p>
	 */
	public static McObfPair func_70695_b = McMappingDatabase.getSRG("EntityLivingBase.func_70695_b");

	/**
	 * <p>
	 * Name: markVelocityChanged
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70018_K = McMappingDatabase.getSRG("EntityLivingBase.func_70018_K");

	/**
	 * <p>
	 * Name: resetPotionEffectMetadata
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175133_bi = McMappingDatabase.getSRG("EntityLivingBase.func_175133_bi");

	/**
	 * <p>
	 * Name: setRotationYawHead
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_70034_d = McMappingDatabase.getSRG("EntityLivingBase.func_70034_d");

	/**
	 * <p>
	 * Name: maxHurtResistantTime
	 * </p>
	 */
	public static McObfPair field_70771_an = McMappingDatabase.getSRG("field_70771_an");

	/**
	 * <p>
	 * Name: unused180
	 * </p>
	 */
	public static McObfPair field_70741_aB = McMappingDatabase.getSRG("field_70741_aB");

	/**
	 * <p>
	 * Name: hasItemInSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;)Z]
	 * </p>
	 */
	public static McObfPair func_190630_a = McMappingDatabase.getSRG("EntityLivingBase.func_190630_a");

	/**
	 * <p>
	 * Name: setSprinting
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70031_b = McMappingDatabase.getSRG("EntityLivingBase.func_70031_b");

	/**
	 * <p>
	 * Name: updatePotionEffects
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70679_bo = McMappingDatabase.getSRG("EntityLivingBase.func_70679_bo");

	/**
	 * <p>
	 * Name: renderBrokenItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_70669_a = McMappingDatabase.getSRG("EntityLivingBase.func_70669_a");

	/**
	 * <p>
	 * Name: addPotionEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionEffect;)V]
	 * </p>
	 */
	public static McObfPair func_70690_d = McMappingDatabase.getSRG("EntityLivingBase.func_70690_d");

	/**
	 * <p>
	 * Name: isPotionActive
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/Potion;)Z]
	 * </p>
	 */
	public static McObfPair func_70644_a = McMappingDatabase.getSRG("EntityLivingBase.func_70644_a");

	/**
	 * <p>
	 * Name: setPartying
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Z)V]
	 * </p>
	 */
	public static McObfPair func_191987_a = McMappingDatabase.getSRG("EntityLivingBase.func_191987_a");

	/**
	 * <p>
	 * Name: isMovementBlocked
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70610_aX = McMappingDatabase.getSRG("EntityLivingBase.func_70610_aX");

	/**
	 * <p>
	 * Name: onItemUseFinish
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71036_o = McMappingDatabase.getSRG("EntityLivingBase.func_71036_o");

	/**
	 * <p>
	 * Name: checkTotemDeathProtection
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Z]
	 * </p>
	 */
	public static McObfPair func_190628_d = McMappingDatabase.getSRG("EntityLivingBase.func_190628_d");

	/**
	 * <p>
	 * Name: canBePushed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70104_M = McMappingDatabase.getSRG("EntityLivingBase.func_70104_M");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_190632_a = McMappingDatabase.getSRG("field_190632_a");

	/**
	 * <p>
	 * Name: travel
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_191986_a = McMappingDatabase.getSRG("EntityLivingBase.func_191986_a");

	/**
	 * <p>
	 * Name: randomYawVelocity
	 * </p>
	 */
	public static McObfPair field_70704_bt = McMappingDatabase.getSRG("field_70704_bt");

	/**
	 * <p>
	 * Name: updatePotionMetadata
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175135_B = McMappingDatabase.getSRG("EntityLivingBase.func_175135_B");

	/**
	 * <p>
	 * Name: isElytraFlying
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184613_cA = McMappingDatabase.getSRG("EntityLivingBase.func_184613_cA");

	/**
	 * <p>
	 * Name: lastDamage
	 * </p>
	 */
	public static McObfPair field_110153_bc = McMappingDatabase.getSRG("field_110153_bc");

	/**
	 * <p>
	 * Name: setLastAttackedEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_130011_c = McMappingDatabase.getSRG("EntityLivingBase.func_130011_c");

	/**
	 * <p>
	 * Name: getArmSwingAnimationEnd
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82166_i = McMappingDatabase.getSRG("EntityLivingBase.func_82166_i");

	/**
	 * <p>
	 * Name: onGroundSpeedFactor
	 * </p>
	 */
	public static McObfPair field_110154_aX = McMappingDatabase.getSRG("field_110154_aX");

	/**
	 * <p>
	 * Name: decreaseAirSupply
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_70682_h = McMappingDatabase.getSRG("EntityLivingBase.func_70682_h");

	/**
	 * <p>
	 * Name: playEquipSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_184606_a_ = McMappingDatabase.getSRG("EntityLivingBase.func_184606_a_");

	/**
	 * <p>
	 * Name: isActiveItemStackBlocking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184585_cz = McMappingDatabase.getSRG("EntityLivingBase.func_184585_cz");

	/**
	 * <p>
	 * Name: getFallSound
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184588_d = McMappingDatabase.getSRG("EntityLivingBase.func_184588_d");

	/**
	 * <p>
	 * Name: attributeMap
	 * </p>
	 */
	public static McObfPair field_110155_d = McMappingDatabase.getSRG("field_110155_d");

	/**
	 * <p>
	 * Name: moveVertical
	 * </p>
	 */
	public static McObfPair field_70701_bs = McMappingDatabase.getSRG("field_70701_bs");

	/**
	 * <p>
	 * Name: getIdleTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70654_ax = McMappingDatabase.getSRG("EntityLivingBase.func_70654_ax");

	/**
	 * <p>
	 * Name: limbSwingAmount
	 * </p>
	 */
	public static McObfPair field_70721_aZ = McMappingDatabase.getSRG("field_70721_aZ");

	/**
	 * <p>
	 * Name: dismountRidingEntity
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184210_p = McMappingDatabase.getSRG("EntityLivingBase.func_184210_p");

	/**
	 * <p>
	 * Name: getAlwaysRenderNameTagForRender
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_94059_bO = McMappingDatabase.getSRG("EntityLivingBase.func_94059_bO");

	/**
	 * <p>
	 * Name: damageShield
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_184590_k = McMappingDatabase.getSRG("EntityLivingBase.func_184590_k");

	/**
	 * <p>
	 * Name: activeItemStackUseCount
	 * </p>
	 */
	public static McObfPair field_184628_bn = McMappingDatabase.getSRG("field_184628_bn");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityLivingBase.func_70037_a");

	/**
	 * <p>
	 * Name: prevCameraPitch
	 * </p>
	 */
	public static McObfPair field_70727_aS = McMappingDatabase.getSRG("field_70727_aS");

	/**
	 * <p>
	 * Name: updateDistance
	 * </p>
	 * <p>
	 * Desc: [(FF)F]
	 * </p>
	 */
	public static McObfPair func_110146_f = McMappingDatabase.getSRG("EntityLivingBase.func_110146_f");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityLivingBase.func_70103_a");

	/**
	 * <p>
	 * Name: getLastAttackedEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EntityLivingBase;]
	 * </p>
	 */
	public static McObfPair func_110144_aD = McMappingDatabase.getSRG("EntityLivingBase.func_110144_aD");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityLivingBase.func_184601_bQ");

	/**
	 * <p>
	 * Name: HAND_STATES
	 * </p>
	 */
	public static McObfPair field_184621_as = McMappingDatabase.getSRG("field_184621_as");

	/**
	 * <p>
	 * Name: rotationYawHead
	 * </p>
	 */
	public static McObfPair field_70759_as = McMappingDatabase.getSRG("field_70759_as");

	/**
	 * <p>
	 * Name: setActiveHand
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumHand;)V]
	 * </p>
	 */
	public static McObfPair func_184598_c = McMappingDatabase.getSRG("EntityLivingBase.func_184598_c");

	/**
	 * <p>
	 * Name: sendEndCombat
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_152112_bu = McMappingDatabase.getSRG("EntityLivingBase.func_152112_bu");

	/**
	 * <p>
	 * Name: removePotionEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/Potion;)V]
	 * </p>
	 */
	public static McObfPair func_184589_d = McMappingDatabase.getSRG("EntityLivingBase.func_184589_d");

	/**
	 * <p>
	 * Name: updateElytra
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184616_r = McMappingDatabase.getSRG("EntityLivingBase.func_184616_r");

	/**
	 * <p>
	 * Name: getItemStackFromSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_184582_a = McMappingDatabase.getSRG("EntityLivingBase.func_184582_a");

	/**
	 * <p>
	 * Name: prevOnGroundSpeedFactor
	 * </p>
	 */
	public static McObfPair field_70768_au = McMappingDatabase.getSRG("field_70768_au");

	/**
	 * <p>
	 * Name: dropFewItems
	 * </p>
	 * <p>
	 * Desc: [(ZI)V]
	 * </p>
	 */
	public static McObfPair func_70628_a = McMappingDatabase.getSRG("EntityLivingBase.func_70628_a");

	/**
	 * <p>
	 * Name: attackable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190631_cK = McMappingDatabase.getSRG("EntityLivingBase.func_190631_cK");

	/**
	 * <p>
	 * Name: _combatTracker
	 * </p>
	 */
	public static McObfPair field_94063_bt = McMappingDatabase.getSRG("field_94063_bt");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityLivingBase.func_70097_a");

	/**
	 * <p>
	 * Name: prevRotationYawHead
	 * </p>
	 */
	public static McObfPair field_70758_at = McMappingDatabase.getSRG("field_70758_at");

	/**
	 * <p>
	 * Name: lastDamageStamp
	 * </p>
	 */
	public static McObfPair field_189751_bG = McMappingDatabase.getSRG("field_189751_bG");

	/**
	 * <p>
	 * Name: getAbsorptionAmount
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_110139_bj = McMappingDatabase.getSRG("EntityLivingBase.func_110139_bj");

	/**
	 * <p>
	 * Name: moveForward
	 * </p>
	 */
	public static McObfPair field_191988_bg = McMappingDatabase.getSRG("field_191988_bg");

	/**
	 * <p>
	 * Name: outOfWorld
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70076_C = McMappingDatabase.getSRG("EntityLivingBase.func_70076_C");

	/**
	 * <p>
	 * Name: onDeathUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70609_aI = McMappingDatabase.getSRG("EntityLivingBase.func_70609_aI");

	/**
	 * <p>
	 * Name: stopActiveHand
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184597_cx = McMappingDatabase.getSRG("EntityLivingBase.func_184597_cx");

	/**
	 * <p>
	 * Name: dropLoot
	 * </p>
	 * <p>
	 * Desc: [(ZILnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_184610_a = McMappingDatabase.getSRG("EntityLivingBase.func_184610_a");

	/**
	 * <p>
	 * Name: absorptionAmount
	 * </p>
	 */
	public static McObfPair field_110151_bq = McMappingDatabase.getSRG("field_110151_bq");

	/**
	 * <p>
	 * Name: scoreValue
	 * </p>
	 */
	public static McObfPair field_70744_aE = McMappingDatabase.getSRG("field_70744_aE");

	/**
	 * <p>
	 * Name: getAIMoveSpeed
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70689_ay = McMappingDatabase.getSRG("EntityLivingBase.func_70689_ay");

	/**
	 * <p>
	 * Name: collideWithNearbyEntities
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_85033_bc = McMappingDatabase.getSRG("EntityLivingBase.func_85033_bc");

	/**
	 * <p>
	 * Name: getHeldItemMainhand
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_184614_ca = McMappingDatabase.getSRG("EntityLivingBase.func_184614_ca");

	/**
	 * <p>
	 * Name: HEALTH
	 * </p>
	 */
	public static McObfPair field_184632_c = McMappingDatabase.getSRG("field_184632_c");

	/**
	 * <p>
	 * Name: canDropLoot
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_146066_aG = McMappingDatabase.getSRG("EntityLivingBase.func_146066_aG");

	/**
	 * <p>
	 * Name: hurtTime
	 * </p>
	 */
	public static McObfPair field_70737_aN = McMappingDatabase.getSRG("field_70737_aN");

	/**
	 * <p>
	 * Name: isSwingInProgress
	 * </p>
	 */
	public static McObfPair field_82175_bq = McMappingDatabase.getSRG("field_82175_bq");

	/**
	 * <p>
	 * Name: activeItemStack
	 * </p>
	 */
	public static McObfPair field_184627_bm = McMappingDatabase.getSRG("field_184627_bm");

	/**
	 * <p>
	 * Name: prevLimbSwingAmount
	 * </p>
	 */
	public static McObfPair field_184618_aE = McMappingDatabase.getSRG("field_184618_aE");

	/**
	 * <p>
	 * Name: isJumping
	 * </p>
	 */
	public static McObfPair field_70703_bu = McMappingDatabase.getSRG("field_70703_bu");

	/**
	 * <p>
	 * Name: setPositionAndRotationDirect
	 * </p>
	 * <p>
	 * Desc: [(DDDFFIZ)V]
	 * </p>
	 */
	public static McObfPair func_180426_a = McMappingDatabase.getSRG("EntityLivingBase.func_180426_a");

	/**
	 * <p>
	 * Name: recentlyHit
	 * </p>
	 */
	public static McObfPair field_70718_bc = McMappingDatabase.getSRG("field_70718_bc");

	/**
	 * <p>
	 * Name: setArrowCountInEntity
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_85034_r = McMappingDatabase.getSRG("EntityLivingBase.func_85034_r");

	/**
	 * <p>
	 * Name: getHeldItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_184586_b = McMappingDatabase.getSRG("EntityLivingBase.func_184586_b");

	/**
	 * <p>
	 * Name: swingingHand
	 * </p>
	 */
	public static McObfPair field_184622_au = McMappingDatabase.getSRG("field_184622_au");

	/**
	 * <p>
	 * Name: getItemInUseMaxCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184612_cw = McMappingDatabase.getSRG("EntityLivingBase.func_184612_cw");

	/**
	 * <p>
	 * Name: getTicksElytraFlying
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184599_cB = McMappingDatabase.getSRG("EntityLivingBase.func_184599_cB");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityLivingBase.func_110147_ax");

	/**
	 * <p>
	 * Name: jump
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70664_aZ = McMappingDatabase.getSRG("EntityLivingBase.func_70664_aZ");

	/**
	 * <p>
	 * Name: lastAttackedEntityTime
	 * </p>
	 */
	public static McObfPair field_142016_bo = McMappingDatabase.getSRG("field_142016_bo");

	/**
	 * <p>
	 * Name: ARROW_COUNT_IN_ENTITY
	 * </p>
	 */
	public static McObfPair field_184635_h = McMappingDatabase.getSRG("field_184635_h");

	/**
	 * <p>
	 * Name: attackingPlayer
	 * </p>
	 */
	public static McObfPair field_70717_bb = McMappingDatabase.getSRG("field_70717_bb");

	/**
	 * <p>
	 * Name: blockUsingShield
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_190629_c = McMappingDatabase.getSRG("EntityLivingBase.func_190629_c");

	/**
	 * <p>
	 * Name: lastAttackedEntity
	 * </p>
	 */
	public static McObfPair field_110150_bn = McMappingDatabase.getSRG("field_110150_bn");

	/**
	 * <p>
	 * Name: resetActiveHand
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184602_cy = McMappingDatabase.getSRG("EntityLivingBase.func_184602_cy");

	/**
	 * <p>
	 * Name: markPotionsDirty
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175136_bO = McMappingDatabase.getSRG("EntityLivingBase.func_175136_bO");

	/**
	 * <p>
	 * Name: handleJumpWater
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70629_bd = McMappingDatabase.getSRG("EntityLivingBase.func_70629_bd");

	/**
	 * <p>
	 * Name: SPRINTING_SPEED_BOOST_ID
	 * </p>
	 */
	public static McObfPair field_110156_b = McMappingDatabase.getSRG("field_110156_b");

	/**
	 * <p>
	 * Name: getRNG
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Random;]
	 * </p>
	 */
	public static McObfPair func_70681_au = McMappingDatabase.getSRG("EntityLivingBase.func_70681_au");

	/**
	 * <p>
	 * Name: applyPotionDamageCalculations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)F]
	 * </p>
	 */
	public static McObfPair func_70672_c = McMappingDatabase.getSRG("EntityLivingBase.func_70672_c");

	/**
	 * <p>
	 * Name: isServerWorld
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70613_aW = McMappingDatabase.getSRG("EntityLivingBase.func_70613_aW");

	/**
	 * <p>
	 * Name: revengeTarget
	 * </p>
	 */
	public static McObfPair field_70755_b = McMappingDatabase.getSRG("field_70755_b");

	/**
	 * <p>
	 * Name: clearActivePotions
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70674_bp = McMappingDatabase.getSRG("EntityLivingBase.func_70674_bp");

	/**
	 * <p>
	 * Name: attemptTeleport
	 * </p>
	 * <p>
	 * Desc: [(DDD)Z]
	 * </p>
	 */
	public static McObfPair func_184595_k = McMappingDatabase.getSRG("EntityLivingBase.func_184595_k");

	/**
	 * <p>
	 * Name: getAttackingEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EntityLivingBase;]
	 * </p>
	 */
	public static McObfPair func_94060_bK = McMappingDatabase.getSRG("EntityLivingBase.func_94060_bK");

	/**
	 * <p>
	 * Name: getCombatTracker
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/CombatTracker;]
	 * </p>
	 */
	public static McObfPair func_110142_aN = McMappingDatabase.getSRG("EntityLivingBase.func_110142_aN");

	/**
	 * <p>
	 * Name: getActivePotionEffects
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_70651_bq = McMappingDatabase.getSRG("EntityLivingBase.func_70651_bq");

	/**
	 * <p>
	 * Name: onEntityUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70030_z = McMappingDatabase.getSRG("EntityLivingBase.func_70030_z");

	/**
	 * <p>
	 * Name: collideWithEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_82167_n = McMappingDatabase.getSRG("EntityLivingBase.func_82167_n");

	/**
	 * <p>
	 * Name: canGoThroughtTrapDoorOnLadder
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_184604_a = McMappingDatabase.getSRG("EntityLivingBase.func_184604_a");

	/**
	 * <p>
	 * Name: getTotalArmorValue
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70658_aO = McMappingDatabase.getSRG("EntityLivingBase.func_70658_aO");

	/**
	 * <p>
	 * Name: canBeCollidedWith
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70067_L = McMappingDatabase.getSRG("EntityLivingBase.func_70067_L");

	/**
	 * <p>
	 * Name: updateRidden
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70098_U = McMappingDatabase.getSRG("EntityLivingBase.func_70098_U");

	/**
	 * <p>
	 * Name: getHeldItemOffhand
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_184592_cb = McMappingDatabase.getSRG("EntityLivingBase.func_184592_cb");

	/**
	 * <p>
	 * Name: interpTargetX
	 * </p>
	 */
	public static McObfPair field_184623_bh = McMappingDatabase.getSRG("field_184623_bh");

	/**
	 * <p>
	 * Name: getLastAttackedEntityTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_142013_aG = McMappingDatabase.getSRG("EntityLivingBase.func_142013_aG");

	/**
	 * <p>
	 * Name: potionsNeedUpdate
	 * </p>
	 */
	public static McObfPair field_70752_e = McMappingDatabase.getSRG("field_70752_e");

	/**
	 * <p>
	 * Name: randomUnused2
	 * </p>
	 */
	public static McObfPair field_70769_ao = McMappingDatabase.getSRG("field_70769_ao");

	/**
	 * <p>
	 * Name: getSoundPitch
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70647_i = McMappingDatabase.getSRG("EntityLivingBase.func_70647_i");

	/**
	 * <p>
	 * Name: getExperiencePoints
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)I]
	 * </p>
	 */
	public static McObfPair func_70693_a = McMappingDatabase.getSRG("EntityLivingBase.func_70693_a");

	/**
	 * <p>
	 * Name: getActivePotionEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/Potion;)Lnet/minecraft/potion/PotionEffect;]
	 * </p>
	 */
	public static McObfPair func_70660_b = McMappingDatabase.getSRG("EntityLivingBase.func_70660_b");

	/**
	 * <p>
	 * Name: activePotionsMap
	 * </p>
	 */
	public static McObfPair field_70713_bf = McMappingDatabase.getSRG("field_70713_bf");

	/**
	 * <p>
	 * Name: prevRenderYawOffset
	 * </p>
	 */
	public static McObfPair field_70760_ar = McMappingDatabase.getSRG("field_70760_ar");

	/**
	 * <p>
	 * Name: renderYawOffset
	 * </p>
	 */
	public static McObfPair field_70761_aq = McMappingDatabase.getSRG("field_70761_aq");

	/**
	 * <p>
	 * Name: getRotationYawHead
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70079_am = McMappingDatabase.getSRG("EntityLivingBase.func_70079_am");

	/**
	 * <p>
	 * Name: damageEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)V]
	 * </p>
	 */
	public static McObfPair func_70665_d = McMappingDatabase.getSRG("EntityLivingBase.func_70665_d");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityLivingBase.func_70636_d");

	/**
	 * <p>
	 * Name: maxHurtTime
	 * </p>
	 */
	public static McObfPair field_70738_aO = McMappingDatabase.getSRG("field_70738_aO");

	/**
	 * <p>
	 * Name: areAllPotionsAmbient
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Collection;)Z]
	 * </p>
	 */
	public static McObfPair func_184593_a = McMappingDatabase.getSRG("EntityLivingBase.func_184593_a");

	/**
	 * <p>
	 * Name: armorArray
	 * </p>
	 */
	public static McObfPair field_184631_bt = McMappingDatabase.getSRG("field_184631_bt");

	/**
	 * <p>
	 * Name: dismountEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_110145_l = McMappingDatabase.getSRG("EntityLivingBase.func_110145_l");

	/**
	 * <p>
	 * Name: applyArmorCalculations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)F]
	 * </p>
	 */
	public static McObfPair func_70655_b = McMappingDatabase.getSRG("EntityLivingBase.func_70655_b");

	/**
	 * <p>
	 * Name: prevMovedDistance
	 * </p>
	 */
	public static McObfPair field_70763_ax = McMappingDatabase.getSRG("field_70763_ax");

	/**
	 * <p>
	 * Name: getActiveItemStack
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_184607_cu = McMappingDatabase.getSRG("EntityLivingBase.func_184607_cu");

	/**
	 * <p>
	 * Name: getHealth
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_110143_aJ = McMappingDatabase.getSRG("EntityLivingBase.func_110143_aJ");

	/**
	 * <p>
	 * Name: cameraPitch
	 * </p>
	 */
	public static McObfPair field_70726_aT = McMappingDatabase.getSRG("field_70726_aT");

	/**
	 * <p>
	 * Name: updateActiveHand
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184608_ct = McMappingDatabase.getSRG("EntityLivingBase.func_184608_ct");

	/**
	 * <p>
	 * Name: canEntityBeSeen
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_70685_l = McMappingDatabase.getSRG("EntityLivingBase.func_70685_l");

	/**
	 * <p>
	 * Name: onItemPickup
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;I)V]
	 * </p>
	 */
	public static McObfPair func_71001_a = McMappingDatabase.getSRG("EntityLivingBase.func_71001_a");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityLivingBase.func_70014_b");

	/**
	 * <p>
	 * Name: updateItemUse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;I)V]
	 * </p>
	 */
	public static McObfPair func_184584_a = McMappingDatabase.getSRG("EntityLivingBase.func_184584_a");

	/**
	 * <p>
	 * Name: getArrowCountInEntity
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_85035_bI = McMappingDatabase.getSRG("EntityLivingBase.func_85035_bI");

	/**
	 * <p>
	 * Name: getLastDamageSource
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/DamageSource;]
	 * </p>
	 */
	public static McObfPair func_189748_bU = McMappingDatabase.getSRG("EntityLivingBase.func_189748_bU");

	/**
	 * <p>
	 * Name: swingProgressInt
	 * </p>
	 */
	public static McObfPair field_110158_av = McMappingDatabase.getSRG("field_110158_av");

	/**
	 * <p>
	 * Name: playHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_184581_c = McMappingDatabase.getSRG("EntityLivingBase.func_184581_c");

	/**
	 * <p>
	 * Name: isChild
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70631_g_ = McMappingDatabase.getSRG("EntityLivingBase.func_70631_g_");

	/**
	 * <p>
	 * Name: ticksSinceLastSwing
	 * </p>
	 */
	public static McObfPair field_184617_aD = McMappingDatabase.getSRG("field_184617_aD");

	/**
	 * <p>
	 * Name: POTION_EFFECTS
	 * </p>
	 */
	public static McObfPair field_184633_f = McMappingDatabase.getSRG("field_184633_f");

	/**
	 * <p>
	 * Name: onDeath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_70645_a = McMappingDatabase.getSRG("EntityLivingBase.func_70645_a");

	/**
	 * <p>
	 * Name: damageArmor
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_70675_k = McMappingDatabase.getSRG("EntityLivingBase.func_70675_k");

	/**
	 * <p>
	 * Name: setHeldItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumHand;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_184611_a = McMappingDatabase.getSRG("EntityLivingBase.func_184611_a");

	/**
	 * <p>
	 * Name: limbSwing
	 * </p>
	 */
	public static McObfPair field_184619_aG = McMappingDatabase.getSRG("field_184619_aG");

	/**
	 * <p>
	 * Name: lastDamageSource
	 * </p>
	 */
	public static McObfPair field_189750_bF = McMappingDatabase.getSRG("field_189750_bF");

	/**
	 * <p>
	 * Name: jumpTicks
	 * </p>
	 */
	public static McObfPair field_70773_bE = McMappingDatabase.getSRG("field_70773_bE");

	/**
	 * <p>
	 * Name: canBeHitWithPotion
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184603_cC = McMappingDatabase.getSRG("EntityLivingBase.func_184603_cC");

	/**
	 * <p>
	 * Name: canBreatheUnderwater
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70648_aU = McMappingDatabase.getSRG("EntityLivingBase.func_70648_aU");

	/**
	 * <p>
	 * Name: sendEnterCombat
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_152111_bt = McMappingDatabase.getSRG("EntityLivingBase.func_152111_bt");

	/**
	 * <p>
	 * Name: revengeTimer
	 * </p>
	 */
	public static McObfPair field_70756_c = McMappingDatabase.getSRG("field_70756_c");

	/**
	 * <p>
	 * Name: setHealth
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_70606_j = McMappingDatabase.getSRG("EntityLivingBase.func_70606_j");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityLivingBase.func_70088_a");

	/**
	 * <p>
	 * Name: newPosRotationIncrements
	 * </p>
	 */
	public static McObfPair field_70716_bi = McMappingDatabase.getSRG("field_70716_bi");

	/**
	 * <p>
	 * Name: movedDistance
	 * </p>
	 */
	public static McObfPair field_70764_aw = McMappingDatabase.getSRG("field_70764_aw");

	/**
	 * <p>
	 * Name: knockBack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FDD)V]
	 * </p>
	 */
	public static McObfPair func_70653_a = McMappingDatabase.getSRG("EntityLivingBase.func_70653_a");

	/**
	 * <p>
	 * Name: removeActivePotionEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/Potion;)Lnet/minecraft/potion/PotionEffect;]
	 * </p>
	 */
	public static McObfPair func_184596_c = McMappingDatabase.getSRG("EntityLivingBase.func_184596_c");

	/**
	 * <p>
	 * Name: getLook
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_70676_i = McMappingDatabase.getSRG("EntityLivingBase.func_70676_i");

	/**
	 * <p>
	 * Name: interpTargetY
	 * </p>
	 */
	public static McObfPair field_184624_bi = McMappingDatabase.getSRG("field_184624_bi");

	/**
	 * <p>
	 * Name: getMaxHealth
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_110138_aP = McMappingDatabase.getSRG("EntityLivingBase.func_110138_aP");

	/**
	 * <p>
	 * Name: isPlayer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70684_aJ = McMappingDatabase.getSRG("EntityLivingBase.func_70684_aJ");

	/**
	 * <p>
	 * Name: onKillCommand
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174812_G = McMappingDatabase.getSRG("EntityLivingBase.func_174812_G");

	/**
	 * <p>
	 * Name: getJumpUpwardsMotion
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_175134_bD = McMappingDatabase.getSRG("EntityLivingBase.func_175134_bD");

	/**
	 * <p>
	 * Name: prevBlockpos
	 * </p>
	 */
	public static McObfPair field_184620_bC = McMappingDatabase.getSRG("field_184620_bC");

	/**
	 * <p>
	 * Name: dropEquipment
	 * </p>
	 * <p>
	 * Desc: [(ZI)V]
	 * </p>
	 */
	public static McObfPair func_82160_b = McMappingDatabase.getSRG("EntityLivingBase.func_82160_b");

	/**
	 * <p>
	 * Name: setRenderYawOffset
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_181013_g = McMappingDatabase.getSRG("EntityLivingBase.func_181013_g");

}

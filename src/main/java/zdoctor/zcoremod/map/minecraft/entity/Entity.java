package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Entity {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vg";
		else
			return "net/minecraft/entity/Entity";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vg";
		else
			return "Entity";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvg;";
		else
			return "Lnet/minecraft/entity/Entity;";
	}

	/**
	 * <p>
	 * Name: getDistance
	 * </p>
	 * <p>
	 * Desc: [(DDD)D]
	 * </p>
	 */
	public static McObfPair func_70011_f = McMappingDatabase.getSRG("Entity.func_70011_f");

	/**
	 * <p>
	 * Name: CUSTOM_NAME_VISIBLE
	 * </p>
	 */
	public static McObfPair field_184233_aA = McMappingDatabase.getSRG("field_184233_aA");

	/**
	 * <p>
	 * Name: dismountRidingEntity
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184210_p = McMappingDatabase.getSRG("Entity.func_184210_p");

	/**
	 * <p>
	 * Name: onKillCommand
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174812_G = McMappingDatabase.getSRG("Entity.func_174812_G");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_70130_N = McMappingDatabase.getSRG("field_70130_N");

	/**
	 * <p>
	 * Name: dimension
	 * </p>
	 */
	public static McObfPair field_71093_bK = McMappingDatabase.getSRG("field_71093_bK");

	/**
	 * <p>
	 * Name: startRiding
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_184220_m = McMappingDatabase.getSRG("Entity.func_184220_m");

	/**
	 * <p>
	 * Name: setWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)V]
	 * </p>
	 */
	public static McObfPair func_70029_a = McMappingDatabase.getSRG("Entity.func_70029_a");

	/**
	 * <p>
	 * Name: onInsideBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_191955_a = McMappingDatabase.getSRG("Entity.func_191955_a");

	/**
	 * <p>
	 * Name: canRenderOnFire
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_90999_ad = McMappingDatabase.getSRG("Entity.func_90999_ad");

	/**
	 * <p>
	 * Name: playFlySound
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_191954_d = McMappingDatabase.getSRG("Entity.func_191954_d");

	/**
	 * <p>
	 * Name: canFitPassenger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_184219_q = McMappingDatabase.getSRG("Entity.func_184219_q");

	/**
	 * <p>
	 * Name: entityUniqueID
	 * </p>
	 */
	public static McObfPair field_96093_i = McMappingDatabase.getSRG("field_96093_i");

	/**
	 * <p>
	 * Name: getCollisionBorderSize
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70111_Y = McMappingDatabase.getSRG("Entity.func_70111_Y");

	/**
	 * <p>
	 * Name: isEntityAlive
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70089_S = McMappingDatabase.getSRG("Entity.func_70089_S");

	/**
	 * <p>
	 * Name: playSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/SoundEvent;FF)V]
	 * </p>
	 */
	public static McObfPair func_184185_a = McMappingDatabase.getSRG("Entity.func_184185_a");

	/**
	 * <p>
	 * Name: outOfWorld
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70076_C = McMappingDatabase.getSRG("Entity.func_70076_C");

	/**
	 * <p>
	 * Name: rideCooldown
	 * </p>
	 */
	public static McObfPair field_184245_j = McMappingDatabase.getSRG("field_184245_j");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("Entity.func_145748_c_");

	/**
	 * <p>
	 * Name: isInRangeToRenderDist
	 * </p>
	 * <p>
	 * Desc: [(D)Z]
	 * </p>
	 */
	public static McObfPair func_70112_a = McMappingDatabase.getSRG("Entity.func_70112_a");

	/**
	 * <p>
	 * Name: shouldSetPosAfterLoading
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_142008_O = McMappingDatabase.getSRG("Entity.func_142008_O");

	/**
	 * <p>
	 * Name: setPositionNonDirty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184189_br = McMappingDatabase.getSRG("Entity.func_184189_br");

	/**
	 * <p>
	 * Name: getLookVec
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_70040_Z = McMappingDatabase.getSRG("Entity.func_70040_Z");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_70131_O = McMappingDatabase.getSRG("field_70131_O");

	/**
	 * <p>
	 * Name: setEntityId
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_145769_d = McMappingDatabase.getSRG("Entity.func_145769_d");

	/**
	 * <p>
	 * Name: getRotationYawHead
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70079_am = McMappingDatabase.getSRG("Entity.func_70079_am");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189511_e = McMappingDatabase.getSRG("Entity.func_189511_e");

	/**
	 * <p>
	 * Name: hasNoGravity
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_189652_ae = McMappingDatabase.getSRG("Entity.func_189652_ae");

	/**
	 * <p>
	 * Name: onGround
	 * </p>
	 */
	public static McObfPair field_70122_E = McMappingDatabase.getSRG("field_70122_E");

	/**
	 * <p>
	 * Name: newFloatNBTList
	 * </p>
	 * <p>
	 * Desc: [([F)Lnet/minecraft/nbt/NBTTagList;]
	 * </p>
	 */
	public static McObfPair func_70049_a = McMappingDatabase.getSRG("Entity.func_70049_a");

	/**
	 * <p>
	 * Name: getTeleportDirection
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_181012_aH = McMappingDatabase.getSRG("Entity.func_181012_aH");

	/**
	 * <p>
	 * Name: getIsInvulnerable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190530_aW = McMappingDatabase.getSRG("Entity.func_190530_aW");

	/**
	 * <p>
	 * Name: setAir
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_70050_g = McMappingDatabase.getSRG("Entity.func_70050_g");

	/**
	 * <p>
	 * Name: decrementTimeUntilPortal
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184173_H = McMappingDatabase.getSRG("Entity.func_184173_H");

	/**
	 * <p>
	 * Name: writeToNBTOptional
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Z]
	 * </p>
	 */
	public static McObfPair func_70039_c = McMappingDatabase.getSRG("Entity.func_70039_c");

	/**
	 * <p>
	 * Name: canBeAttackedWithItem
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70075_an = McMappingDatabase.getSRG("Entity.func_70075_an");

	/**
	 * <p>
	 * Name: renderDistanceWeight
	 * </p>
	 */
	public static McObfPair field_70155_l = McMappingDatabase.getSRG("field_70155_l");

	/**
	 * <p>
	 * Name: getVectorForRotation
	 * </p>
	 * <p>
	 * Desc: [(FF)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_174806_f = McMappingDatabase.getSRG("Entity.func_174806_f");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("Entity.func_70103_a");

	/**
	 * <p>
	 * Name: dataManager
	 * </p>
	 */
	public static McObfPair field_70180_af = McMappingDatabase.getSRG("field_70180_af");

	/**
	 * <p>
	 * Name: getFlag
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_70083_f = McMappingDatabase.getSRG("Entity.func_70083_f");

	/**
	 * <p>
	 * Name: isWet
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70026_G = McMappingDatabase.getSRG("Entity.func_70026_G");

	/**
	 * <p>
	 * Name: invulnerable
	 * </p>
	 */
	public static McObfPair field_83001_bt = McMappingDatabase.getSRG("field_83001_bt");

	/**
	 * <p>
	 * Name: updateFallState
	 * </p>
	 * <p>
	 * Desc: [(DZLnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184231_a = McMappingDatabase.getSRG("Entity.func_184231_a");

	/**
	 * <p>
	 * Name: getHorizontalFacing
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_174811_aO = McMappingDatabase.getSRG("Entity.func_174811_aO");

	/**
	 * <p>
	 * Name: onEntityUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70030_z = McMappingDatabase.getSRG("Entity.func_70030_z");

	/**
	 * <p>
	 * Name: setInvisible
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_82142_c = McMappingDatabase.getSRG("Entity.func_82142_c");

	/**
	 * <p>
	 * Name: addEntityCrashInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/crash/CrashReportCategory;)V]
	 * </p>
	 */
	public static McObfPair func_85029_a = McMappingDatabase.getSRG("Entity.func_85029_a");

	/**
	 * <p>
	 * Name: moveRelative
	 * </p>
	 * <p>
	 * Desc: [(FFFF)V]
	 * </p>
	 */
	public static McObfPair func_191958_b = McMappingDatabase.getSRG("Entity.func_191958_b");

	/**
	 * <p>
	 * Name: getEquipmentAndArmor
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_184209_aF = McMappingDatabase.getSRG("Entity.func_184209_aF");

	/**
	 * <p>
	 * Name: getMountedYOffset
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_70042_X = McMappingDatabase.getSRG("Entity.func_70042_X");

	/**
	 * <p>
	 * Name: addPassenger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_184200_o = McMappingDatabase.getSRG("Entity.func_184200_o");

	/**
	 * <p>
	 * Name: processInitialInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184230_a = McMappingDatabase.getSRG("Entity.func_184230_a");

	/**
	 * <p>
	 * Name: teleportDirection
	 * </p>
	 */
	public static McObfPair field_181018_ap = McMappingDatabase.getSRG("field_181018_ap");

	/**
	 * <p>
	 * Name: addedToChunk
	 * </p>
	 */
	public static McObfPair field_70175_ag = McMappingDatabase.getSRG("field_70175_ag");

	/**
	 * <p>
	 * Name: setSilent
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_174810_b = McMappingDatabase.getSRG("Entity.func_174810_b");

	/**
	 * <p>
	 * Name: posZ
	 * </p>
	 */
	public static McObfPair field_70161_v = McMappingDatabase.getSRG("field_70161_v");

	/**
	 * <p>
	 * Name: distanceWalkedModified
	 * </p>
	 */
	public static McObfPair field_70140_Q = McMappingDatabase.getSRG("field_70140_Q");

	/**
	 * <p>
	 * Name: nextStepDistance
	 * </p>
	 */
	public static McObfPair field_70150_b = McMappingDatabase.getSRG("field_70150_b");

	/**
	 * <p>
	 * Name: onStruckByLightning
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/effect/EntityLightningBolt;)V]
	 * </p>
	 */
	public static McObfPair func_70077_a = McMappingDatabase.getSRG("Entity.func_70077_a");

	/**
	 * <p>
	 * Name: fire
	 * </p>
	 */
	public static McObfPair field_190534_ay = McMappingDatabase.getSRG("field_190534_ay");

	/**
	 * <p>
	 * Name: removeTag
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_184197_b = McMappingDatabase.getSRG("Entity.func_184197_b");

	/**
	 * <p>
	 * Name: getDistance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)F]
	 * </p>
	 */
	public static McObfPair func_70032_d = McMappingDatabase.getSRG("Entity.func_70032_d");

	/**
	 * <p>
	 * Name: hitByEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_85031_j = McMappingDatabase.getSRG("Entity.func_85031_j");

	/**
	 * <p>
	 * Name: getBrightness
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70013_c = McMappingDatabase.getSRG("Entity.func_70013_c");

	/**
	 * <p>
	 * Name: canUseCommand
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_70003_b = McMappingDatabase.getSRG("Entity.func_70003_b");

	/**
	 * <p>
	 * Name: getCollisionBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_70046_E = McMappingDatabase.getSRG("Entity.func_70046_E");

	/**
	 * <p>
	 * Name: fall
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_180430_e = McMappingDatabase.getSRG("Entity.func_180430_e");

	/**
	 * <p>
	 * Name: getEntityWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_130014_f_ = McMappingDatabase.getSRG("Entity.func_130014_f_");

	/**
	 * <p>
	 * Name: rotationYaw
	 * </p>
	 */
	public static McObfPair field_70177_z = McMappingDatabase.getSRG("field_70177_z");

	/**
	 * <p>
	 * Name: isEntityInsideOpaqueBlock
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70094_T = McMappingDatabase.getSRG("Entity.func_70094_T");

	/**
	 * <p>
	 * Name: AIR
	 * </p>
	 */
	public static McObfPair field_184241_ay = McMappingDatabase.getSRG("field_184241_ay");

	/**
	 * <p>
	 * Name: isEntityEqual
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_70028_i = McMappingDatabase.getSRG("Entity.func_70028_i");

	/**
	 * <p>
	 * Name: distanceWalkedOnStepModified
	 * </p>
	 */
	public static McObfPair field_82151_R = McMappingDatabase.getSRG("field_82151_R");

	/**
	 * <p>
	 * Name: motionY
	 * </p>
	 */
	public static McObfPair field_70181_x = McMappingDatabase.getSRG("field_70181_x");

	/**
	 * <p>
	 * Name: isPassenger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_184196_w = McMappingDatabase.getSRG("Entity.func_184196_w");

	/**
	 * <p>
	 * Name: setPositionAndRotationDirect
	 * </p>
	 * <p>
	 * Desc: [(DDDFFIZ)V]
	 * </p>
	 */
	public static McObfPair func_180426_a = McMappingDatabase.getSRG("Entity.func_180426_a");

	/**
	 * <p>
	 * Name: lastTickPosX
	 * </p>
	 */
	public static McObfPair field_70142_S = McMappingDatabase.getSRG("field_70142_S");

	/**
	 * <p>
	 * Name: cachedUniqueIdString
	 * </p>
	 */
	public static McObfPair field_189513_ar = McMappingDatabase.getSRG("field_189513_ar");

	/**
	 * <p>
	 * Name: setPositionAndRotation
	 * </p>
	 * <p>
	 * Desc: [(DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_70080_a = McMappingDatabase.getSRG("Entity.func_70080_a");

	/**
	 * <p>
	 * Name: setCustomNameTag
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_96094_a = McMappingDatabase.getSRG("Entity.func_96094_a");

	/**
	 * <p>
	 * Name: getRecursivePassengersByType
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Ljava/util/Set;)V]
	 * </p>
	 */
	public static McObfPair func_184175_a = McMappingDatabase.getSRG("Entity.func_184175_a");

	/**
	 * <p>
	 * Name: FLAGS
	 * </p>
	 */
	public static McObfPair field_184240_ax = McMappingDatabase.getSRG("field_184240_ax");

	/**
	 * <p>
	 * Name: isInRangeToRender3d
	 * </p>
	 * <p>
	 * Desc: [(DDD)Z]
	 * </p>
	 */
	public static McObfPair func_145770_h = McMappingDatabase.getSRG("Entity.func_145770_h");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_70170_p = McMappingDatabase.getSRG("field_70170_p");

	/**
	 * <p>
	 * Name: ticksExisted
	 * </p>
	 */
	public static McObfPair field_70173_aa = McMappingDatabase.getSRG("field_70173_aa");

	/**
	 * <p>
	 * Name: prevPosZ
	 * </p>
	 */
	public static McObfPair field_70166_s = McMappingDatabase.getSRG("field_70166_s");

	/**
	 * <p>
	 * Name: addTrackingPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_184178_b = McMappingDatabase.getSRG("Entity.func_184178_b");

	/**
	 * <p>
	 * Name: getSplashSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184181_aa = McMappingDatabase.getSRG("Entity.func_184181_aa");

	/**
	 * <p>
	 * Name: isInWeb
	 * </p>
	 */
	public static McObfPair field_70134_J = McMappingDatabase.getSRG("field_70134_J");

	/**
	 * <p>
	 * Name: onCollideWithPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_70100_b_ = McMappingDatabase.getSRG("Entity.func_70100_b_");

	/**
	 * <p>
	 * Name: isInvisibleToPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_98034_c = McMappingDatabase.getSRG("Entity.func_98034_c");

	/**
	 * <p>
	 * Name: getDistanceSq
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)D]
	 * </p>
	 */
	public static McObfPair func_70068_e = McMappingDatabase.getSRG("Entity.func_70068_e");

	/**
	 * <p>
	 * Name: isRidingOrBeingRiddenBy
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_184215_y = McMappingDatabase.getSRG("Entity.func_184215_y");

	/**
	 * <p>
	 * Name: inPortal
	 * </p>
	 */
	public static McObfPair field_71087_bX = McMappingDatabase.getSRG("field_71087_bX");

	/**
	 * <p>
	 * Name: isRiding
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184218_aH = McMappingDatabase.getSRG("Entity.func_184218_aH");

	/**
	 * <p>
	 * Name: setCommandStat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/CommandResultStats$Type;I)V]
	 * </p>
	 */
	public static McObfPair func_174794_a = McMappingDatabase.getSRG("Entity.func_174794_a");

	/**
	 * <p>
	 * Name: isImmuneToFire
	 * </p>
	 */
	public static McObfPair field_70178_ae = McMappingDatabase.getSRG("field_70178_ae");

	/**
	 * <p>
	 * Name: motionZ
	 * </p>
	 */
	public static McObfPair field_70179_y = McMappingDatabase.getSRG("field_70179_y");

	/**
	 * <p>
	 * Name: riddenByEntities
	 * </p>
	 */
	public static McObfPair field_184244_h = McMappingDatabase.getSRG("field_184244_h");

	/**
	 * <p>
	 * Name: createRunningParticles
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174808_Z = McMappingDatabase.getSRG("Entity.func_174808_Z");

	/**
	 * <p>
	 * Name: addTag
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_184211_a = McMappingDatabase.getSRG("Entity.func_184211_a");

	/**
	 * <p>
	 * Name: setPositionAndUpdate
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_70634_a = McMappingDatabase.getSRG("Entity.func_70634_a");

	/**
	 * <p>
	 * Name: doesEntityNotTriggerPressurePlate
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145773_az = McMappingDatabase.getSRG("Entity.func_145773_az");

	/**
	 * <p>
	 * Name: setAlwaysRenderNameTag
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_174805_g = McMappingDatabase.getSRG("Entity.func_174805_g");

	/**
	 * <p>
	 * Name: setSprinting
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70031_b = McMappingDatabase.getSRG("Entity.func_70031_b");

	/**
	 * <p>
	 * Name: getAlwaysRenderNameTag
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174833_aM = McMappingDatabase.getSRG("Entity.func_174833_aM");

	/**
	 * <p>
	 * Name: ridingEntity
	 * </p>
	 */
	public static McObfPair field_184239_as = McMappingDatabase.getSRG("field_184239_as");

	/**
	 * <p>
	 * Name: getAdjustedHorizontalFacing
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_184172_bi = McMappingDatabase.getSRG("Entity.func_184172_bi");

	/**
	 * <p>
	 * Name: isRidingSameEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_184223_x = McMappingDatabase.getSRG("Entity.func_184223_x");

	/**
	 * <p>
	 * Name: getLook
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_70676_i = McMappingDatabase.getSRG("Entity.func_70676_i");

	/**
	 * <p>
	 * Name: setRenderDistanceWeight
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_184227_b = McMappingDatabase.getSRG("Entity.func_184227_b");

	/**
	 * <p>
	 * Name: isEntityInvulnerable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Z]
	 * </p>
	 */
	public static McObfPair func_180431_b = McMappingDatabase.getSRG("Entity.func_180431_b");

	/**
	 * <p>
	 * Name: setFlag
	 * </p>
	 * <p>
	 * Desc: [(IZ)V]
	 * </p>
	 */
	public static McObfPair func_70052_a = McMappingDatabase.getSRG("Entity.func_70052_a");

	/**
	 * <p>
	 * Name: setCommandStats
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_174817_o = McMappingDatabase.getSRG("Entity.func_174817_o");

	/**
	 * <p>
	 * Name: preparePlayerToSpawn
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70065_x = McMappingDatabase.getSRG("Entity.func_70065_x");

	/**
	 * <p>
	 * Name: isSneaking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70093_af = McMappingDatabase.getSRG("Entity.func_70093_af");

	/**
	 * <p>
	 * Name: dealFireDamage
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_70081_e = McMappingDatabase.getSRG("Entity.func_70081_e");

	/**
	 * <p>
	 * Name: rand
	 * </p>
	 */
	public static McObfPair field_70146_Z = McMappingDatabase.getSRG("field_70146_Z");

	/**
	 * <p>
	 * Name: isGlowing
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184202_aL = McMappingDatabase.getSRG("Entity.func_184202_aL");

	/**
	 * <p>
	 * Name: getSoundCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundCategory;]
	 * </p>
	 */
	public static McObfPair func_184176_by = McMappingDatabase.getSRG("Entity.func_184176_by");

	/**
	 * <p>
	 * Name: copyLocationAndAnglesFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_82149_j = McMappingDatabase.getSRG("Entity.func_82149_j");

	/**
	 * <p>
	 * Name: getRecursivePassengersByType
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;)Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_184180_b = McMappingDatabase.getSRG("Entity.func_184180_b");

	/**
	 * <p>
	 * Name: performHurtAnimation
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70057_ab = McMappingDatabase.getSRG("Entity.func_70057_ab");

	/**
	 * <p>
	 * Name: posY
	 * </p>
	 */
	public static McObfPair field_70163_u = McMappingDatabase.getSRG("field_70163_u");

	/**
	 * <p>
	 * Name: getControllingPassenger
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_184179_bs = McMappingDatabase.getSRG("Entity.func_184179_bs");

	/**
	 * <p>
	 * Name: velocityChanged
	 * </p>
	 */
	public static McObfPair field_70133_I = McMappingDatabase.getSRG("field_70133_I");

	/**
	 * <p>
	 * Name: cmdResultStats
	 * </p>
	 */
	public static McObfPair field_174837_as = McMappingDatabase.getSRG("field_174837_as");

	/**
	 * <p>
	 * Name: setLocationAndAngles
	 * </p>
	 * <p>
	 * Desc: [(DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_70012_b = McMappingDatabase.getSRG("Entity.func_70012_b");

	/**
	 * <p>
	 * Name: getHeldEquipment
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_184214_aD = McMappingDatabase.getSRG("Entity.func_184214_aD");

	/**
	 * <p>
	 * Name: move
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/MoverType;DDD)V]
	 * </p>
	 */
	public static McObfPair func_70091_d = McMappingDatabase.getSRG("Entity.func_70091_d");

	/**
	 * <p>
	 * Name: setRotationYawHead
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_70034_d = McMappingDatabase.getSRG("Entity.func_70034_d");

	/**
	 * <p>
	 * Name: handleWaterMovement
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70072_I = McMappingDatabase.getSRG("Entity.func_70072_I");

	/**
	 * <p>
	 * Name: chunkCoordX
	 * </p>
	 */
	public static McObfPair field_70176_ah = McMappingDatabase.getSRG("field_70176_ah");

	/**
	 * <p>
	 * Name: motionX
	 * </p>
	 */
	public static McObfPair field_70159_w = McMappingDatabase.getSRG("field_70159_w");

	/**
	 * <p>
	 * Name: extinguish
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70066_B = McMappingDatabase.getSRG("Entity.func_70066_B");

	/**
	 * <p>
	 * Name: getCustomNameTag
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_95999_t = McMappingDatabase.getSRG("Entity.func_95999_t");

	/**
	 * <p>
	 * Name: replaceItemInInventory
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_174820_d = McMappingDatabase.getSRG("Entity.func_174820_d");

	/**
	 * <p>
	 * Name: prevPosX
	 * </p>
	 */
	public static McObfPair field_70169_q = McMappingDatabase.getSRG("field_70169_q");

	/**
	 * <p>
	 * Name: isPushedByWater
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_96092_aw = McMappingDatabase.getSRG("Entity.func_96092_aw");

	/**
	 * <p>
	 * Name: isOnScoreboardTeam
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/Team;)Z]
	 * </p>
	 */
	public static McObfPair func_184194_a = McMappingDatabase.getSRG("Entity.func_184194_a");

	/**
	 * <p>
	 * Name: getBrightnessForRender
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70070_b = McMappingDatabase.getSRG("Entity.func_70070_b");

	/**
	 * <p>
	 * Name: getMaxFallHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82143_as = McMappingDatabase.getSRG("Entity.func_82143_as");

	/**
	 * <p>
	 * Name: collidedVertically
	 * </p>
	 */
	public static McObfPair field_70124_G = McMappingDatabase.getSRG("field_70124_G");

	/**
	 * <p>
	 * Name: firstUpdate
	 * </p>
	 */
	public static McObfPair field_70148_d = McMappingDatabase.getSRG("field_70148_d");

	/**
	 * <p>
	 * Name: prevRotationYaw
	 * </p>
	 */
	public static McObfPair field_70126_B = McMappingDatabase.getSRG("field_70126_B");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_184243_a = McMappingDatabase.getSRG("field_184243_a");

	/**
	 * <p>
	 * Name: pistonDeltasGameTime
	 * </p>
	 */
	public static McObfPair field_191506_aJ = McMappingDatabase.getSRG("field_191506_aJ");

	/**
	 * <p>
	 * Name: setPortal
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_181015_d = McMappingDatabase.getSRG("Entity.func_181015_d");

	/**
	 * <p>
	 * Name: awardKillScore
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;ILnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_191956_a = McMappingDatabase.getSRG("Entity.func_191956_a");

	/**
	 * <p>
	 * Name: getLowestRidingEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_184208_bv = McMappingDatabase.getSRG("Entity.func_184208_bv");

	/**
	 * <p>
	 * Name: getForward
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_189651_aD = McMappingDatabase.getSRG("Entity.func_189651_aD");

	/**
	 * <p>
	 * Name: getPortalCooldown
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82147_ab = McMappingDatabase.getSRG("Entity.func_82147_ab");

	/**
	 * <p>
	 * Name: notifyDataManagerChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_184206_a = McMappingDatabase.getSRG("Entity.func_184206_a");

	/**
	 * <p>
	 * Name: noClip
	 * </p>
	 */
	public static McObfPair field_70145_X = McMappingDatabase.getSRG("field_70145_X");

	/**
	 * <p>
	 * Name: setDead
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70106_y = McMappingDatabase.getSRG("Entity.func_70106_y");

	/**
	 * <p>
	 * Name: boundingBox
	 * </p>
	 */
	public static McObfPair field_70121_D = McMappingDatabase.getSRG("field_70121_D");

	/**
	 * <p>
	 * Name: setVelocity
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_70016_h = McMappingDatabase.getSRG("Entity.func_70016_h");

	/**
	 * <p>
	 * Name: changeDimension
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_184204_a = McMappingDatabase.getSRG("Entity.func_184204_a");

	/**
	 * <p>
	 * Name: prevRotationPitch
	 * </p>
	 */
	public static McObfPair field_70127_C = McMappingDatabase.getSRG("field_70127_C");

	/**
	 * <p>
	 * Name: getFireImmuneTicks
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190531_bD = McMappingDatabase.getSRG("Entity.func_190531_bD");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180425_c = McMappingDatabase.getSRG("Entity.func_180425_c");

	/**
	 * <p>
	 * Name: isBurning
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70027_ad = McMappingDatabase.getSRG("Entity.func_70027_ad");

	/**
	 * <p>
	 * Name: entityCollisionReduction
	 * </p>
	 */
	public static McObfPair field_70144_Y = McMappingDatabase.getSRG("field_70144_Y");

	/**
	 * <p>
	 * Name: getCommandSenderEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_174793_f = McMappingDatabase.getSRG("Entity.func_174793_f");

	/**
	 * <p>
	 * Name: getRenderBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_184177_bl = McMappingDatabase.getSRG("Entity.func_184177_bl");

	/**
	 * <p>
	 * Name: setEntityBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;)V]
	 * </p>
	 */
	public static McObfPair func_174826_a = McMappingDatabase.getSRG("Entity.func_174826_a");

	/**
	 * <p>
	 * Name: isOffsetPositionInLiquid
	 * </p>
	 * <p>
	 * Desc: [(DDD)Z]
	 * </p>
	 */
	public static McObfPair func_70038_c = McMappingDatabase.getSRG("Entity.func_70038_c");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("Entity.func_70037_a");

	/**
	 * <p>
	 * Name: updateRidden
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70098_U = McMappingDatabase.getSRG("Entity.func_70098_U");

	/**
	 * <p>
	 * Name: setUniqueId
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)V]
	 * </p>
	 */
	public static McObfPair func_184221_a = McMappingDatabase.getSRG("Entity.func_184221_a");

	/**
	 * <p>
	 * Name: getRidingEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_184187_bx = McMappingDatabase.getSRG("Entity.func_184187_bx");

	/**
	 * <p>
	 * Name: getEntityBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_174813_aQ = McMappingDatabase.getSRG("Entity.func_174813_aQ");

	/**
	 * <p>
	 * Name: ignoreItemEntityData
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184213_bq = McMappingDatabase.getSRG("Entity.func_184213_bq");

	/**
	 * <p>
	 * Name: fallDistance
	 * </p>
	 */
	public static McObfPair field_70143_R = McMappingDatabase.getSRG("field_70143_R");

	/**
	 * <p>
	 * Name: applyEnchantments
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_174815_a = McMappingDatabase.getSRG("Entity.func_174815_a");

	/**
	 * <p>
	 * Name: entityDropItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;F)Lnet/minecraft/entity/item/EntityItem;]
	 * </p>
	 */
	public static McObfPair func_70099_a = McMappingDatabase.getSRG("Entity.func_70099_a");

	/**
	 * <p>
	 * Name: getCollisionBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_70114_g = McMappingDatabase.getSRG("Entity.func_70114_g");

	/**
	 * <p>
	 * Name: rayTrace
	 * </p>
	 * <p>
	 * Desc: [(DF)Lnet/minecraft/util/math/RayTraceResult;]
	 * </p>
	 */
	public static McObfPair func_174822_a = McMappingDatabase.getSRG("Entity.func_174822_a");

	/**
	 * <p>
	 * Name: isDead
	 * </p>
	 */
	public static McObfPair field_70128_L = McMappingDatabase.getSRG("field_70128_L");

	/**
	 * <p>
	 * Name: getExplosionResistance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/Explosion;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)F]
	 * </p>
	 */
	public static McObfPair func_180428_a = McMappingDatabase.getSRG("Entity.func_180428_a");

	/**
	 * <p>
	 * Name: getDistanceSq
	 * </p>
	 * <p>
	 * Desc: [(DDD)D]
	 * </p>
	 */
	public static McObfPair func_70092_e = McMappingDatabase.getSRG("Entity.func_70092_e");

	/**
	 * <p>
	 * Name: getPushReaction
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/EnumPushReaction;]
	 * </p>
	 */
	public static McObfPair func_184192_z = McMappingDatabase.getSRG("Entity.func_184192_z");

	/**
	 * <p>
	 * Name: getDataManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/datasync/EntityDataManager;]
	 * </p>
	 */
	public static McObfPair func_184212_Q = McMappingDatabase.getSRG("Entity.func_184212_Q");

	/**
	 * <p>
	 * Name: applyOrientationToEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_184190_l = McMappingDatabase.getSRG("Entity.func_184190_l");

	/**
	 * <p>
	 * Name: isLiquidPresentInAABB
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;)Z]
	 * </p>
	 */
	public static McObfPair func_174809_b = McMappingDatabase.getSRG("Entity.func_174809_b");

	/**
	 * <p>
	 * Name: doBlockCollisions
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145775_I = McMappingDatabase.getSRG("Entity.func_145775_I");

	/**
	 * <p>
	 * Name: portalCounter
	 * </p>
	 */
	public static McObfPair field_82153_h = McMappingDatabase.getSRG("field_82153_h");

	/**
	 * <p>
	 * Name: serverPosY
	 * </p>
	 */
	public static McObfPair field_70117_cu = McMappingDatabase.getSRG("field_70117_cu");

	/**
	 * <p>
	 * Name: tags
	 * </p>
	 */
	public static McObfPair field_184236_aF = McMappingDatabase.getSRG("field_184236_aF");

	/**
	 * <p>
	 * Name: turn
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_70082_c = McMappingDatabase.getSRG("Entity.func_70082_c");

	/**
	 * <p>
	 * Name: canBeCollidedWith
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70067_L = McMappingDatabase.getSRG("Entity.func_70067_L");

	/**
	 * <p>
	 * Name: getRenderDistanceWeight
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_184183_bd = McMappingDatabase.getSRG("Entity.func_184183_bd");

	/**
	 * <p>
	 * Name: setPosition
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_70107_b = McMappingDatabase.getSRG("Entity.func_70107_b");

	/**
	 * <p>
	 * Name: getEntityString
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70022_Q = McMappingDatabase.getSRG("Entity.func_70022_Q");

	/**
	 * <p>
	 * Name: isSilent
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174814_R = McMappingDatabase.getSRG("Entity.func_174814_R");

	/**
	 * <p>
	 * Name: isOnSameTeam
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_184191_r = McMappingDatabase.getSRG("Entity.func_184191_r");

	/**
	 * <p>
	 * Name: removePassenger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_184225_p = McMappingDatabase.getSRG("Entity.func_184225_p");

	/**
	 * <p>
	 * Name: isSprinting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70051_ag = McMappingDatabase.getSRG("Entity.func_70051_ag");

	/**
	 * <p>
	 * Name: getDistanceSq
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)D]
	 * </p>
	 */
	public static McObfPair func_174818_b = McMappingDatabase.getSRG("Entity.func_174818_b");

	/**
	 * <p>
	 * Name: isPositionDirty
	 * </p>
	 */
	public static McObfPair field_184237_aG = McMappingDatabase.getSRG("field_184237_aG");

	/**
	 * <p>
	 * Name: lastTickPosZ
	 * </p>
	 */
	public static McObfPair field_70136_U = McMappingDatabase.getSRG("field_70136_U");

	/**
	 * <p>
	 * Name: isInLava
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_180799_ab = McMappingDatabase.getSRG("Entity.func_180799_ab");

	/**
	 * <p>
	 * Name: getAlwaysRenderNameTagForRender
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_94059_bO = McMappingDatabase.getSRG("Entity.func_94059_bO");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70020_e = McMappingDatabase.getSRG("Entity.func_70020_e");

	/**
	 * <p>
	 * Name: canBePushed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70104_M = McMappingDatabase.getSRG("Entity.func_70104_M");

	/**
	 * <p>
	 * Name: playStepSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_180429_a = McMappingDatabase.getSRG("Entity.func_180429_a");

	/**
	 * <p>
	 * Name: setRotation
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_70101_b = McMappingDatabase.getSRG("Entity.func_70101_b");

	/**
	 * <p>
	 * Name: serverPosX
	 * </p>
	 */
	public static McObfPair field_70118_ct = McMappingDatabase.getSRG("field_70118_ct");

	/**
	 * <p>
	 * Name: getMirroredYaw
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Mirror;)F]
	 * </p>
	 */
	public static McObfPair func_184217_a = McMappingDatabase.getSRG("Entity.func_184217_a");

	/**
	 * <p>
	 * Name: getTags
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_184216_O = McMappingDatabase.getSRG("Entity.func_184216_O");

	/**
	 * <p>
	 * Name: isSpectatedByPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)Z]
	 * </p>
	 */
	public static McObfPair func_174827_a = McMappingDatabase.getSRG("Entity.func_174827_a");

	/**
	 * <p>
	 * Name: setGlowing
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184195_f = McMappingDatabase.getSRG("Entity.func_184195_f");

	/**
	 * <p>
	 * Name: getEntityId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_145782_y = McMappingDatabase.getSRG("Entity.func_145782_y");

	/**
	 * <p>
	 * Name: getLastPortalVec
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_181014_aG = McMappingDatabase.getSRG("Entity.func_181014_aG");

	/**
	 * <p>
	 * Name: isNonBoss
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184222_aU = McMappingDatabase.getSRG("Entity.func_184222_aU");

	/**
	 * <p>
	 * Name: getRecursivePassengers
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_184182_bu = McMappingDatabase.getSRG("Entity.func_184182_bu");

	/**
	 * <p>
	 * Name: chunkCoordY
	 * </p>
	 */
	public static McObfPair field_70162_ai = McMappingDatabase.getSRG("field_70162_ai");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("Entity.func_70005_c_");

	/**
	 * <p>
	 * Name: dropItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;I)Lnet/minecraft/entity/item/EntityItem;]
	 * </p>
	 */
	public static McObfPair func_145779_a = McMappingDatabase.getSRG("Entity.func_145779_a");

	/**
	 * <p>
	 * Name: onKillEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_70074_a = McMappingDatabase.getSRG("Entity.func_70074_a");

	/**
	 * <p>
	 * Name: ZERO_AABB
	 * </p>
	 */
	public static McObfPair field_174836_a = McMappingDatabase.getSRG("field_174836_a");

	/**
	 * <p>
	 * Name: resetPositionToBB
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174829_m = McMappingDatabase.getSRG("Entity.func_174829_m");

	/**
	 * <p>
	 * Name: dropItemWithOffset
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;IF)Lnet/minecraft/entity/item/EntityItem;]
	 * </p>
	 */
	public static McObfPair func_145778_a = McMappingDatabase.getSRG("Entity.func_145778_a");

	/**
	 * <p>
	 * Name: isOverWater
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191953_am = McMappingDatabase.getSRG("Entity.func_191953_am");

	/**
	 * <p>
	 * Name: canPassengerSteer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184186_bw = McMappingDatabase.getSRG("Entity.func_184186_bw");

	/**
	 * <p>
	 * Name: sendCommandFeedback
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174792_t_ = McMappingDatabase.getSRG("Entity.func_174792_t_");

	/**
	 * <p>
	 * Name: getCachedUniqueIdString
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_189512_bd = McMappingDatabase.getSRG("Entity.func_189512_bd");

	/**
	 * <p>
	 * Name: getPositionEyes
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_174824_e = McMappingDatabase.getSRG("Entity.func_174824_e");

	/**
	 * <p>
	 * Name: isInWater
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70090_H = McMappingDatabase.getSRG("Entity.func_70090_H");

	/**
	 * <p>
	 * Name: sendMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_145747_a = McMappingDatabase.getSRG("Entity.func_145747_a");

	/**
	 * <p>
	 * Name: isInsideOfMaterial
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/material/Material;)Z]
	 * </p>
	 */
	public static McObfPair func_70055_a = McMappingDatabase.getSRG("Entity.func_70055_a");

	/**
	 * <p>
	 * Name: setOutsideBorder
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_174821_h = McMappingDatabase.getSRG("Entity.func_174821_h");

	/**
	 * <p>
	 * Name: prevPosY
	 * </p>
	 */
	public static McObfPair field_70167_r = McMappingDatabase.getSRG("field_70167_r");

	/**
	 * <p>
	 * Name: setRenderYawOffset
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_181013_g = McMappingDatabase.getSRG("Entity.func_181013_g");

	/**
	 * <p>
	 * Name: setSneaking
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70095_a = McMappingDatabase.getSRG("Entity.func_70095_a");

	/**
	 * <p>
	 * Name: markVelocityChanged
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70018_K = McMappingDatabase.getSRG("Entity.func_70018_K");

	/**
	 * <p>
	 * Name: makeFlySound
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191957_ae = McMappingDatabase.getSRG("Entity.func_191957_ae");

	/**
	 * <p>
	 * Name: getMaxInPortalTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82145_z = McMappingDatabase.getSRG("Entity.func_82145_z");

	/**
	 * <p>
	 * Name: getTeam
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/scoreboard/Team;]
	 * </p>
	 */
	public static McObfPair func_96124_cp = McMappingDatabase.getSRG("Entity.func_96124_cp");

	/**
	 * <p>
	 * Name: writeToNBTAtomically
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Z]
	 * </p>
	 */
	public static McObfPair func_184198_c = McMappingDatabase.getSRG("Entity.func_184198_c");

	/**
	 * <p>
	 * Name: setNoGravity
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_189654_d = McMappingDatabase.getSRG("Entity.func_189654_d");

	/**
	 * <p>
	 * Name: canBeRidden
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_184228_n = McMappingDatabase.getSRG("Entity.func_184228_n");

	/**
	 * <p>
	 * Name: spawnRunningParticles
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174830_Y = McMappingDatabase.getSRG("Entity.func_174830_Y");

	/**
	 * <p>
	 * Name: lastPortalPos
	 * </p>
	 */
	public static McObfPair field_181016_an = McMappingDatabase.getSRG("field_181016_an");

	/**
	 * <p>
	 * Name: setInWeb
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70110_aj = McMappingDatabase.getSRG("Entity.func_70110_aj");

	/**
	 * <p>
	 * Name: applyPlayerInteraction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_184199_a = McMappingDatabase.getSRG("Entity.func_184199_a");

	/**
	 * <p>
	 * Name: getPitchYaw
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec2f;]
	 * </p>
	 */
	public static McObfPair func_189653_aC = McMappingDatabase.getSRG("Entity.func_189653_aC");

	/**
	 * <p>
	 * Name: getCommandStats
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/command/CommandResultStats;]
	 * </p>
	 */
	public static McObfPair func_174807_aT = McMappingDatabase.getSRG("Entity.func_174807_aT");

	/**
	 * <p>
	 * Name: updatePassenger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_184232_k = McMappingDatabase.getSRG("Entity.func_184232_k");

	/**
	 * <p>
	 * Name: getSwimSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184184_Z = McMappingDatabase.getSRG("Entity.func_184184_Z");

	/**
	 * <p>
	 * Name: getPassengers
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184188_bt = McMappingDatabase.getSRG("Entity.func_184188_bt");

	/**
	 * <p>
	 * Name: removeTrackingPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_184203_c = McMappingDatabase.getSRG("Entity.func_184203_c");

	/**
	 * <p>
	 * Name: getParts
	 * </p>
	 * <p>
	 * Desc: [()[Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_70021_al = McMappingDatabase.getSRG("Entity.func_70021_al");

	/**
	 * <p>
	 * Name: collided
	 * </p>
	 */
	public static McObfPair field_70132_H = McMappingDatabase.getSRG("field_70132_H");

	/**
	 * <p>
	 * Name: rotationPitch
	 * </p>
	 */
	public static McObfPair field_70125_A = McMappingDatabase.getSRG("field_70125_A");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("Entity.func_70071_h_");

	/**
	 * <p>
	 * Name: copyDataFromOld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_180432_n = McMappingDatabase.getSRG("Entity.func_180432_n");

	/**
	 * <p>
	 * Name: hurtResistantTime
	 * </p>
	 */
	public static McObfPair field_70172_ad = McMappingDatabase.getSRG("field_70172_ad");

	/**
	 * <p>
	 * Name: applyEntityCollision
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_70108_f = McMappingDatabase.getSRG("Entity.func_70108_f");

	/**
	 * <p>
	 * Name: lastTickPosY
	 * </p>
	 */
	public static McObfPair field_70137_T = McMappingDatabase.getSRG("field_70137_T");

	/**
	 * <p>
	 * Name: startRiding
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Z)Z]
	 * </p>
	 */
	public static McObfPair func_184205_a = McMappingDatabase.getSRG("Entity.func_184205_a");

	/**
	 * <p>
	 * Name: preventEntitySpawning
	 * </p>
	 */
	public static McObfPair field_70156_m = McMappingDatabase.getSRG("field_70156_m");

	/**
	 * <p>
	 * Name: setFire
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_70015_d = McMappingDatabase.getSRG("Entity.func_70015_d");

	/**
	 * <p>
	 * Name: entityId
	 * </p>
	 */
	public static McObfPair field_145783_c = McMappingDatabase.getSRG("field_145783_c");

	/**
	 * <p>
	 * Name: setDropItemsWhenDead
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184174_b = McMappingDatabase.getSRG("Entity.func_184174_b");

	/**
	 * <p>
	 * Name: getYOffset
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_70033_W = McMappingDatabase.getSRG("Entity.func_70033_W");

	/**
	 * <p>
	 * Name: isOutsideBorder
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174832_aS = McMappingDatabase.getSRG("Entity.func_174832_aS");

	/**
	 * <p>
	 * Name: glowing
	 * </p>
	 */
	public static McObfPair field_184238_ar = McMappingDatabase.getSRG("field_184238_ar");

	/**
	 * <p>
	 * Name: isImmuneToExplosions
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_180427_aV = McMappingDatabase.getSRG("Entity.func_180427_aV");

	/**
	 * <p>
	 * Name: registerFixes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_190533_a = McMappingDatabase.getSRG("Entity.func_190533_a");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("Entity.func_70097_a");

	/**
	 * <p>
	 * Name: inWater
	 * </p>
	 */
	public static McObfPair field_70171_ac = McMappingDatabase.getSRG("field_70171_ac");

	/**
	 * <p>
	 * Name: chunkCoordZ
	 * </p>
	 */
	public static McObfPair field_70164_aj = McMappingDatabase.getSRG("field_70164_aj");

	/**
	 * <p>
	 * Name: getArmorInventoryList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_184193_aE = McMappingDatabase.getSRG("Entity.func_184193_aE");

	/**
	 * <p>
	 * Name: getDistanceSqToCenter
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)D]
	 * </p>
	 */
	public static McObfPair func_174831_c = McMappingDatabase.getSRG("Entity.func_174831_c");

	/**
	 * <p>
	 * Name: getServer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/MinecraftServer;]
	 * </p>
	 */
	public static McObfPair func_184102_h = McMappingDatabase.getSRG("Entity.func_184102_h");

	/**
	 * <p>
	 * Name: setSize
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_70105_a = McMappingDatabase.getSRG("Entity.func_70105_a");

	/**
	 * <p>
	 * Name: EMPTY_EQUIPMENT
	 * </p>
	 */
	public static McObfPair field_190535_b = McMappingDatabase.getSRG("field_190535_b");

	/**
	 * <p>
	 * Name: isOutsideBorder
	 * </p>
	 */
	public static McObfPair field_174835_g = McMappingDatabase.getSRG("field_174835_g");

	/**
	 * <p>
	 * Name: timeUntilPortal
	 * </p>
	 */
	public static McObfPair field_71088_bW = McMappingDatabase.getSRG("field_71088_bW");

	/**
	 * <p>
	 * Name: getHoverEvent
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/event/HoverEvent;]
	 * </p>
	 */
	public static McObfPair func_174823_aP = McMappingDatabase.getSRG("Entity.func_174823_aP");

	/**
	 * <p>
	 * Name: NO_GRAVITY
	 * </p>
	 */
	public static McObfPair field_189655_aD = McMappingDatabase.getSRG("field_189655_aD");

	/**
	 * <p>
	 * Name: stepHeight
	 * </p>
	 */
	public static McObfPair field_70138_W = McMappingDatabase.getSRG("field_70138_W");

	/**
	 * <p>
	 * Name: addVelocity
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_70024_g = McMappingDatabase.getSRG("Entity.func_70024_g");

	/**
	 * <p>
	 * Name: ignoreFrustumCheck
	 * </p>
	 */
	public static McObfPair field_70158_ak = McMappingDatabase.getSRG("field_70158_ak");

	/**
	 * <p>
	 * Name: serverPosZ
	 * </p>
	 */
	public static McObfPair field_70116_cv = McMappingDatabase.getSRG("field_70116_cv");

	/**
	 * <p>
	 * Name: setOnFireFromLava
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70044_A = McMappingDatabase.getSRG("Entity.func_70044_A");

	/**
	 * <p>
	 * Name: moveToBlockPosAndAngles
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;FF)V]
	 * </p>
	 */
	public static McObfPair func_174828_a = McMappingDatabase.getSRG("Entity.func_174828_a");

	/**
	 * <p>
	 * Name: isBeingRidden
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184207_aI = McMappingDatabase.getSRG("Entity.func_184207_aI");

	/**
	 * <p>
	 * Name: hasCustomName
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145818_k_ = McMappingDatabase.getSRG("Entity.func_145818_k_");

	/**
	 * <p>
	 * Name: setItemStackToSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_184201_a = McMappingDatabase.getSRG("Entity.func_184201_a");

	/**
	 * <p>
	 * Name: setEntityInvulnerable
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184224_h = McMappingDatabase.getSRG("Entity.func_184224_h");

	/**
	 * <p>
	 * Name: isAirBorne
	 * </p>
	 */
	public static McObfPair field_70160_al = McMappingDatabase.getSRG("field_70160_al");

	/**
	 * <p>
	 * Name: posX
	 * </p>
	 */
	public static McObfPair field_70165_t = McMappingDatabase.getSRG("field_70165_t");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("Entity.func_70014_b");

	/**
	 * <p>
	 * Name: isImmuneToFire
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70045_F = McMappingDatabase.getSRG("Entity.func_70045_F");

	/**
	 * <p>
	 * Name: isInvisible
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82150_aj = McMappingDatabase.getSRG("Entity.func_82150_aj");

	/**
	 * <p>
	 * Name: newDoubleNBTList
	 * </p>
	 * <p>
	 * Desc: [([D)Lnet/minecraft/nbt/NBTTagList;]
	 * </p>
	 */
	public static McObfPair func_70087_a = McMappingDatabase.getSRG("Entity.func_70087_a");

	/**
	 * <p>
	 * Name: nextFlap
	 * </p>
	 */
	public static McObfPair field_191959_ay = McMappingDatabase.getSRG("field_191959_ay");

	/**
	 * <p>
	 * Name: getRotatedYaw
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Rotation;)F]
	 * </p>
	 */
	public static McObfPair func_184229_a = McMappingDatabase.getSRG("Entity.func_184229_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("Entity.func_70088_a");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("Entity.func_70047_e");

	/**
	 * <p>
	 * Name: collidedHorizontally
	 * </p>
	 */
	public static McObfPair field_70123_F = McMappingDatabase.getSRG("field_70123_F");

	/**
	 * <p>
	 * Name: canExplosionDestroyBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/Explosion;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;F)Z]
	 * </p>
	 */
	public static McObfPair func_174816_a = McMappingDatabase.getSRG("Entity.func_174816_a");

	/**
	 * <p>
	 * Name: getUniqueID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_110124_au = McMappingDatabase.getSRG("Entity.func_110124_au");

	/**
	 * <p>
	 * Name: getAir
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70086_ai = McMappingDatabase.getSRG("Entity.func_70086_ai");

	/**
	 * <p>
	 * Name: nextEntityID
	 * </p>
	 */
	public static McObfPair field_70152_a = McMappingDatabase.getSRG("field_70152_a");

	/**
	 * <p>
	 * Name: removePassengers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184226_ay = McMappingDatabase.getSRG("Entity.func_184226_ay");

	/**
	 * <p>
	 * Name: lastPortalVec
	 * </p>
	 */
	public static McObfPair field_181017_ao = McMappingDatabase.getSRG("field_181017_ao");

	/**
	 * <p>
	 * Name: SILENT
	 * </p>
	 */
	public static McObfPair field_184234_aB = McMappingDatabase.getSRG("field_184234_aB");

	/**
	 * <p>
	 * Name: pushOutOfBlocks
	 * </p>
	 * <p>
	 * Desc: [(DDD)Z]
	 * </p>
	 */
	public static McObfPair func_145771_j = McMappingDatabase.getSRG("Entity.func_145771_j");

	/**
	 * <p>
	 * Name: getPositionVector
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_174791_d = McMappingDatabase.getSRG("Entity.func_174791_d");

	/**
	 * <p>
	 * Name: prevDistanceWalkedModified
	 * </p>
	 */
	public static McObfPair field_70141_P = McMappingDatabase.getSRG("field_70141_P");

	/**
	 * <p>
	 * Name: forceSpawn
	 * </p>
	 */
	public static McObfPair field_98038_p = McMappingDatabase.getSRG("field_98038_p");

	/**
	 * <p>
	 * Name: pistonDeltas
	 * </p>
	 */
	public static McObfPair field_191505_aI = McMappingDatabase.getSRG("field_191505_aI");

	/**
	 * <p>
	 * Name: CUSTOM_NAME
	 * </p>
	 */
	public static McObfPair field_184242_az = McMappingDatabase.getSRG("field_184242_az");

	/**
	 * <p>
	 * Name: doWaterSplashEffect
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_71061_d_ = McMappingDatabase.getSRG("Entity.func_71061_d_");

	/**
	 * <p>
	 * Name: canTriggerWalking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70041_e_ = McMappingDatabase.getSRG("Entity.func_70041_e_");

}

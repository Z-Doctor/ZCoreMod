package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityArmorStand {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abz";
		else
			return "net/minecraft/entity/item/EntityArmorStand";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abz";
		else
			return "EntityArmorStand";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labz;";
		else
			return "Lnet/minecraft/entity/item/EntityArmorStand;";
	}

	/**
	 * <p>
	 * Name: punchCooldown
	 * </p>
	 */
	public static McObfPair field_175437_i = McMappingDatabase.getSRG("field_175437_i");

	/**
	 * <p>
	 * Name: updateBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_181550_a = McMappingDatabase.getSRG("EntityArmorStand.func_181550_a");

	/**
	 * <p>
	 * Name: rightArmRotation
	 * </p>
	 */
	public static McObfPair field_175439_bk = McMappingDatabase.getSRG("field_175439_bk");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityArmorStand.func_184615_bR");

	/**
	 * <p>
	 * Name: handItems
	 * </p>
	 */
	public static McObfPair field_184799_bw = McMappingDatabase.getSRG("field_184799_bw");

	/**
	 * <p>
	 * Name: notifyDataManagerChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_184206_a = McMappingDatabase.getSRG("EntityArmorStand.func_184206_a");

	/**
	 * <p>
	 * Name: isChild
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70631_g_ = McMappingDatabase.getSRG("EntityArmorStand.func_70631_g_");

	/**
	 * <p>
	 * Name: disabledSlots
	 * </p>
	 */
	public static McObfPair field_175442_bg = McMappingDatabase.getSRG("field_175442_bg");

	/**
	 * <p>
	 * Name: setRotationYawHead
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_70034_d = McMappingDatabase.getSRG("EntityArmorStand.func_70034_d");

	/**
	 * <p>
	 * Name: setRenderYawOffset
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_181013_g = McMappingDatabase.getSRG("EntityArmorStand.func_181013_g");

	/**
	 * <p>
	 * Name: getRightLegRotation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Rotations;]
	 * </p>
	 */
	public static McObfPair func_175407_x = McMappingDatabase.getSRG("EntityArmorStand.func_175407_x");

	/**
	 * <p>
	 * Name: getHeldEquipment
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_184214_aD = McMappingDatabase.getSRG("EntityArmorStand.func_184214_aD");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityArmorStand.func_70097_a");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntityArmorStand.func_70047_e");

	/**
	 * <p>
	 * Name: setLeftLegRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Rotations;)V]
	 * </p>
	 */
	public static McObfPair func_175417_e = McMappingDatabase.getSRG("EntityArmorStand.func_175417_e");

	/**
	 * <p>
	 * Name: getClickedSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/inventory/EntityEquipmentSlot;]
	 * </p>
	 */
	public static McObfPair func_190772_a = McMappingDatabase.getSRG("EntityArmorStand.func_190772_a");

	/**
	 * <p>
	 * Name: setBit
	 * </p>
	 * <p>
	 * Desc: [(BIZ)B]
	 * </p>
	 */
	public static McObfPair func_184797_a = McMappingDatabase.getSRG("EntityArmorStand.func_184797_a");

	/**
	 * <p>
	 * Name: setBodyRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Rotations;)V]
	 * </p>
	 */
	public static McObfPair func_175424_b = McMappingDatabase.getSRG("EntityArmorStand.func_175424_b");

	/**
	 * <p>
	 * Name: canBePushed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70104_M = McMappingDatabase.getSRG("EntityArmorStand.func_70104_M");

	/**
	 * <p>
	 * Name: damageArmorStand
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_175406_a = McMappingDatabase.getSRG("EntityArmorStand.func_175406_a");

	/**
	 * <p>
	 * Name: wasMarker
	 * </p>
	 */
	public static McObfPair field_181028_bj = McMappingDatabase.getSRG("field_181028_bj");

	/**
	 * <p>
	 * Name: setShowArms
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_175413_k = McMappingDatabase.getSRG("EntityArmorStand.func_175413_k");

	/**
	 * <p>
	 * Name: getLeftArmRotation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Rotations;]
	 * </p>
	 */
	public static McObfPair func_175404_u = McMappingDatabase.getSRG("EntityArmorStand.func_175404_u");

	/**
	 * <p>
	 * Name: setItemStackToSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_184201_a = McMappingDatabase.getSRG("EntityArmorStand.func_184201_a");

	/**
	 * <p>
	 * Name: HEAD_ROTATION
	 * </p>
	 */
	public static McObfPair field_184802_b = McMappingDatabase.getSRG("field_184802_b");

	/**
	 * <p>
	 * Name: replaceItemInInventory
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_174820_d = McMappingDatabase.getSRG("EntityArmorStand.func_174820_d");

	/**
	 * <p>
	 * Name: dropBlock
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175421_A = McMappingDatabase.getSRG("EntityArmorStand.func_175421_A");

	/**
	 * <p>
	 * Name: rightLegRotation
	 * </p>
	 */
	public static McObfPair field_175441_bm = McMappingDatabase.getSRG("field_175441_bm");

	/**
	 * <p>
	 * Name: DEFAULT_RIGHTLEG_ROTATION
	 * </p>
	 */
	public static McObfPair field_175429_f = McMappingDatabase.getSRG("field_175429_f");

	/**
	 * <p>
	 * Name: setSize
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_70105_a = McMappingDatabase.getSRG("EntityArmorStand.func_70105_a");

	/**
	 * <p>
	 * Name: getHeadRotation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Rotations;]
	 * </p>
	 */
	public static McObfPair func_175418_s = McMappingDatabase.getSRG("EntityArmorStand.func_175418_s");

	/**
	 * <p>
	 * Name: setSmall
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_175420_a = McMappingDatabase.getSRG("EntityArmorStand.func_175420_a");

	/**
	 * <p>
	 * Name: playBrokenSound
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190773_I = McMappingDatabase.getSRG("EntityArmorStand.func_190773_I");

	/**
	 * <p>
	 * Name: getPushReaction
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/EnumPushReaction;]
	 * </p>
	 */
	public static McObfPair func_184192_z = McMappingDatabase.getSRG("EntityArmorStand.func_184192_z");

	/**
	 * <p>
	 * Name: registerFixesArmorStand
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189805_a = McMappingDatabase.getSRG("EntityArmorStand.func_189805_a");

	/**
	 * <p>
	 * Name: isSmall
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175410_n = McMappingDatabase.getSRG("EntityArmorStand.func_175410_n");

	/**
	 * <p>
	 * Name: DEFAULT_LEFTLEG_ROTATION
	 * </p>
	 */
	public static McObfPair field_175432_e = McMappingDatabase.getSRG("field_175432_e");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityArmorStand.func_70103_a");

	/**
	 * <p>
	 * Name: getPrimaryHand
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumHandSide;]
	 * </p>
	 */
	public static McObfPair func_184591_cq = McMappingDatabase.getSRG("EntityArmorStand.func_184591_cq");

	/**
	 * <p>
	 * Name: updatePotionMetadata
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175135_B = McMappingDatabase.getSRG("EntityArmorStand.func_175135_B");

	/**
	 * <p>
	 * Name: hasMarker
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_181026_s = McMappingDatabase.getSRG("EntityArmorStand.func_181026_s");

	/**
	 * <p>
	 * Name: travel
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_191986_a = McMappingDatabase.getSRG("EntityArmorStand.func_191986_a");

	/**
	 * <p>
	 * Name: setMarker
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_181027_m = McMappingDatabase.getSRG("EntityArmorStand.func_181027_m");

	/**
	 * <p>
	 * Name: DEFAULT_LEFTARM_ROTATION
	 * </p>
	 */
	public static McObfPair field_175434_c = McMappingDatabase.getSRG("field_175434_c");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityArmorStand.func_70014_b");

	/**
	 * <p>
	 * Name: setNoBasePlate
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_175426_l = McMappingDatabase.getSRG("EntityArmorStand.func_175426_l");

	/**
	 * <p>
	 * Name: RIGHT_ARM_ROTATION
	 * </p>
	 */
	public static McObfPair field_184805_e = McMappingDatabase.getSRG("field_184805_e");

	/**
	 * <p>
	 * Name: setInvisible
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_82142_c = McMappingDatabase.getSRG("EntityArmorStand.func_82142_c");

	/**
	 * <p>
	 * Name: hasNoBasePlate
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175414_r = McMappingDatabase.getSRG("EntityArmorStand.func_175414_r");

	/**
	 * <p>
	 * Name: armorItems
	 * </p>
	 */
	public static McObfPair field_184800_bx = McMappingDatabase.getSRG("field_184800_bx");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityArmorStand.func_70037_a");

	/**
	 * <p>
	 * Name: onKillCommand
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174812_G = McMappingDatabase.getSRG("EntityArmorStand.func_174812_G");

	/**
	 * <p>
	 * Name: setLeftArmRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Rotations;)V]
	 * </p>
	 */
	public static McObfPair func_175405_c = McMappingDatabase.getSRG("EntityArmorStand.func_175405_c");

	/**
	 * <p>
	 * Name: getLeftLegRotation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Rotations;]
	 * </p>
	 */
	public static McObfPair func_175403_w = McMappingDatabase.getSRG("EntityArmorStand.func_175403_w");

	/**
	 * <p>
	 * Name: readPoseFromNBT
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_175419_y = McMappingDatabase.getSRG("EntityArmorStand.func_175419_y");

	/**
	 * <p>
	 * Name: setRightArmRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Rotations;)V]
	 * </p>
	 */
	public static McObfPair func_175428_d = McMappingDatabase.getSRG("EntityArmorStand.func_175428_d");

	/**
	 * <p>
	 * Name: canInteract
	 * </p>
	 */
	public static McObfPair field_175436_h = McMappingDatabase.getSRG("field_175436_h");

	/**
	 * <p>
	 * Name: getFallSound
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184588_d = McMappingDatabase.getSRG("EntityArmorStand.func_184588_d");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityArmorStand.func_70088_a");

	/**
	 * <p>
	 * Name: LEFT_LEG_ROTATION
	 * </p>
	 */
	public static McObfPair field_184806_f = McMappingDatabase.getSRG("field_184806_f");

	/**
	 * <p>
	 * Name: collideWithNearbyEntities
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_85033_bc = McMappingDatabase.getSRG("EntityArmorStand.func_85033_bc");

	/**
	 * <p>
	 * Name: canBeCollidedWith
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70067_L = McMappingDatabase.getSRG("EntityArmorStand.func_70067_L");

	/**
	 * <p>
	 * Name: updateDistance
	 * </p>
	 * <p>
	 * Desc: [(FF)F]
	 * </p>
	 */
	public static McObfPair func_110146_f = McMappingDatabase.getSRG("EntityArmorStand.func_110146_f");

	/**
	 * <p>
	 * Name: isInRangeToRenderDist
	 * </p>
	 * <p>
	 * Desc: [(D)Z]
	 * </p>
	 */
	public static McObfPair func_70112_a = McMappingDatabase.getSRG("EntityArmorStand.func_70112_a");

	/**
	 * <p>
	 * Name: BODY_ROTATION
	 * </p>
	 */
	public static McObfPair field_184803_c = McMappingDatabase.getSRG("field_184803_c");

	/**
	 * <p>
	 * Name: leftArmRotation
	 * </p>
	 */
	public static McObfPair field_175438_bj = McMappingDatabase.getSRG("field_175438_bj");

	/**
	 * <p>
	 * Name: getItemStackFromSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_184582_a = McMappingDatabase.getSRG("EntityArmorStand.func_184582_a");

	/**
	 * <p>
	 * Name: getYOffset
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_70033_W = McMappingDatabase.getSRG("EntityArmorStand.func_70033_W");

	/**
	 * <p>
	 * Name: DEFAULT_BODY_ROTATION
	 * </p>
	 */
	public static McObfPair field_175433_b = McMappingDatabase.getSRG("field_175433_b");

	/**
	 * <p>
	 * Name: collideWithEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_82167_n = McMappingDatabase.getSRG("EntityArmorStand.func_82167_n");

	/**
	 * <p>
	 * Name: bodyRotation
	 * </p>
	 */
	public static McObfPair field_175444_bi = McMappingDatabase.getSRG("field_175444_bi");

	/**
	 * <p>
	 * Name: canBeHitWithPotion
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184603_cC = McMappingDatabase.getSRG("EntityArmorStand.func_184603_cC");

	/**
	 * <p>
	 * Name: LEFT_ARM_ROTATION
	 * </p>
	 */
	public static McObfPair field_184804_d = McMappingDatabase.getSRG("field_184804_d");

	/**
	 * <p>
	 * Name: isImmuneToExplosions
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_180427_aV = McMappingDatabase.getSRG("EntityArmorStand.func_180427_aV");

	/**
	 * <p>
	 * Name: swapItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/inventory/EntityEquipmentSlot;Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumHand;)V]
	 * </p>
	 */
	public static McObfPair func_184795_a = McMappingDatabase.getSRG("EntityArmorStand.func_184795_a");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityArmorStand.func_184601_bQ");

	/**
	 * <p>
	 * Name: STATUS
	 * </p>
	 */
	public static McObfPair field_184801_a = McMappingDatabase.getSRG("field_184801_a");

	/**
	 * <p>
	 * Name: IS_RIDEABLE_MINECART
	 * </p>
	 */
	public static McObfPair field_184798_bv = McMappingDatabase.getSRG("field_184798_bv");

	/**
	 * <p>
	 * Name: setRightLegRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Rotations;)V]
	 * </p>
	 */
	public static McObfPair func_175427_f = McMappingDatabase.getSRG("EntityArmorStand.func_175427_f");

	/**
	 * <p>
	 * Name: dropContents
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175409_C = McMappingDatabase.getSRG("EntityArmorStand.func_175409_C");

	/**
	 * <p>
	 * Name: onStruckByLightning
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/effect/EntityLightningBolt;)V]
	 * </p>
	 */
	public static McObfPair func_70077_a = McMappingDatabase.getSRG("EntityArmorStand.func_70077_a");

	/**
	 * <p>
	 * Name: headRotation
	 * </p>
	 */
	public static McObfPair field_175443_bh = McMappingDatabase.getSRG("field_175443_bh");

	/**
	 * <p>
	 * Name: setHeadRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Rotations;)V]
	 * </p>
	 */
	public static McObfPair func_175415_a = McMappingDatabase.getSRG("EntityArmorStand.func_175415_a");

	/**
	 * <p>
	 * Name: getShowArms
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175402_q = McMappingDatabase.getSRG("EntityArmorStand.func_175402_q");

	/**
	 * <p>
	 * Name: getRightArmRotation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Rotations;]
	 * </p>
	 */
	public static McObfPair func_175411_v = McMappingDatabase.getSRG("EntityArmorStand.func_175411_v");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityArmorStand.func_70071_h_");

	/**
	 * <p>
	 * Name: writePoseToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_175416_h = McMappingDatabase.getSRG("EntityArmorStand.func_175416_h");

	/**
	 * <p>
	 * Name: playParticles
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175412_z = McMappingDatabase.getSRG("EntityArmorStand.func_175412_z");

	/**
	 * <p>
	 * Name: leftLegRotation
	 * </p>
	 */
	public static McObfPair field_175440_bl = McMappingDatabase.getSRG("field_175440_bl");

	/**
	 * <p>
	 * Name: isDisabled
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;)Z]
	 * </p>
	 */
	public static McObfPair func_184796_b = McMappingDatabase.getSRG("EntityArmorStand.func_184796_b");

	/**
	 * <p>
	 * Name: attackable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190631_cK = McMappingDatabase.getSRG("EntityArmorStand.func_190631_cK");

	/**
	 * <p>
	 * Name: RIGHT_LEG_ROTATION
	 * </p>
	 */
	public static McObfPair field_184807_g = McMappingDatabase.getSRG("field_184807_g");

	/**
	 * <p>
	 * Name: DEFAULT_HEAD_ROTATION
	 * </p>
	 */
	public static McObfPair field_175435_a = McMappingDatabase.getSRG("field_175435_a");

	/**
	 * <p>
	 * Name: getBodyRotation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Rotations;]
	 * </p>
	 */
	public static McObfPair func_175408_t = McMappingDatabase.getSRG("EntityArmorStand.func_175408_t");

	/**
	 * <p>
	 * Name: applyPlayerInteraction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_184199_a = McMappingDatabase.getSRG("EntityArmorStand.func_184199_a");

	/**
	 * <p>
	 * Name: DEFAULT_RIGHTARM_ROTATION
	 * </p>
	 */
	public static McObfPair field_175431_d = McMappingDatabase.getSRG("field_175431_d");

	/**
	 * <p>
	 * Name: getArmorInventoryList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_184193_aE = McMappingDatabase.getSRG("EntityArmorStand.func_184193_aE");

	/**
	 * <p>
	 * Name: isServerWorld
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70613_aW = McMappingDatabase.getSRG("EntityArmorStand.func_70613_aW");

}

package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityBoat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afd";
		else
			return "net/minecraft/entity/item/EntityBoat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afd";
		else
			return "EntityBoat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafd;";
		else
			return "Lnet/minecraft/entity/item/EntityBoat;";
	}

	/**
	 * <p>
	 * Name: getBoatStatus
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/item/EntityBoat$Status;]
	 * </p>
	 */
	public static McObfPair func_184449_t = McMappingDatabase.getSRG("EntityBoat.func_184449_t");

	/**
	 * <p>
	 * Name: lerpPitch
	 * </p>
	 */
	public static McObfPair field_184479_ay = McMappingDatabase.getSRG("field_184479_ay");

	/**
	 * <p>
	 * Name: getMountedYOffset
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_70042_X = McMappingDatabase.getSRG("EntityBoat.func_70042_X");

	/**
	 * <p>
	 * Name: getControllingPassenger
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_184179_bs = McMappingDatabase.getSRG("EntityBoat.func_184179_bs");

	/**
	 * <p>
	 * Name: setTimeSinceHit
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_70265_b = McMappingDatabase.getSRG("EntityBoat.func_70265_b");

	/**
	 * <p>
	 * Name: setPaddleState
	 * </p>
	 * <p>
	 * Desc: [(ZZ)V]
	 * </p>
	 */
	public static McObfPair func_184445_a = McMappingDatabase.getSRG("EntityBoat.func_184445_a");

	/**
	 * <p>
	 * Name: forwardInputDown
	 * </p>
	 */
	public static McObfPair field_184461_aB = McMappingDatabase.getSRG("field_184461_aB");

	/**
	 * <p>
	 * Name: applyOrientationToEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_184190_l = McMappingDatabase.getSRG("EntityBoat.func_184190_l");

	/**
	 * <p>
	 * Name: updateInputs
	 * </p>
	 * <p>
	 * Desc: [(ZZZZ)V]
	 * </p>
	 */
	public static McObfPair func_184442_a = McMappingDatabase.getSRG("EntityBoat.func_184442_a");

	/**
	 * <p>
	 * Name: leftInputDown
	 * </p>
	 */
	public static McObfPair field_184480_az = McMappingDatabase.getSRG("field_184480_az");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityBoat.func_70097_a");

	/**
	 * <p>
	 * Name: tickLerp
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184447_s = McMappingDatabase.getSRG("EntityBoat.func_184447_s");

	/**
	 * <p>
	 * Name: getBoatGlide
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_184441_l = McMappingDatabase.getSRG("EntityBoat.func_184441_l");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityBoat.func_70037_a");

	/**
	 * <p>
	 * Name: setBoatType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityBoat$Type;)V]
	 * </p>
	 */
	public static McObfPair func_184458_a = McMappingDatabase.getSRG("EntityBoat.func_184458_a");

	/**
	 * <p>
	 * Name: paddlePositions
	 * </p>
	 */
	public static McObfPair field_184470_f = McMappingDatabase.getSRG("field_184470_f");

	/**
	 * <p>
	 * Name: processInitialInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184230_a = McMappingDatabase.getSRG("EntityBoat.func_184230_a");

	/**
	 * <p>
	 * Name: canBePushed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70104_M = McMappingDatabase.getSRG("EntityBoat.func_70104_M");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityBoat.func_70014_b");

	/**
	 * <p>
	 * Name: backInputDown
	 * </p>
	 */
	public static McObfPair field_184463_aC = McMappingDatabase.getSRG("field_184463_aC");

	/**
	 * <p>
	 * Name: getRowingTime
	 * </p>
	 * <p>
	 * Desc: [(IF)F]
	 * </p>
	 */
	public static McObfPair func_184448_a = McMappingDatabase.getSRG("EntityBoat.func_184448_a");

	/**
	 * <p>
	 * Name: getCollisionBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_70046_E = McMappingDatabase.getSRG("EntityBoat.func_70046_E");

	/**
	 * <p>
	 * Name: controlBoat
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184443_x = McMappingDatabase.getSRG("EntityBoat.func_184443_x");

	/**
	 * <p>
	 * Name: getDamageTaken
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70271_g = McMappingDatabase.getSRG("EntityBoat.func_70271_g");

	/**
	 * <p>
	 * Name: outOfControlTicks
	 * </p>
	 */
	public static McObfPair field_184474_h = McMappingDatabase.getSRG("field_184474_h");

	/**
	 * <p>
	 * Name: getForwardDirection
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70267_i = McMappingDatabase.getSRG("EntityBoat.func_70267_i");

	/**
	 * <p>
	 * Name: lastYd
	 * </p>
	 */
	public static McObfPair field_184473_aH = McMappingDatabase.getSRG("field_184473_aH");

	/**
	 * <p>
	 * Name: getPaddleSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_193047_k = McMappingDatabase.getSRG("EntityBoat.func_193047_k");

	/**
	 * <p>
	 * Name: TIME_SINCE_HIT
	 * </p>
	 */
	public static McObfPair field_184460_a = McMappingDatabase.getSRG("field_184460_a");

	/**
	 * <p>
	 * Name: status
	 * </p>
	 */
	public static McObfPair field_184469_aF = McMappingDatabase.getSRG("field_184469_aF");

	/**
	 * <p>
	 * Name: canBeCollidedWith
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70067_L = McMappingDatabase.getSRG("EntityBoat.func_70067_L");

	/**
	 * <p>
	 * Name: getPaddleState
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_184457_a = McMappingDatabase.getSRG("EntityBoat.func_184457_a");

	/**
	 * <p>
	 * Name: lerpY
	 * </p>
	 */
	public static McObfPair field_184477_av = McMappingDatabase.getSRG("field_184477_av");

	/**
	 * <p>
	 * Name: DATA_ID_PADDLE
	 * </p>
	 */
	public static McObfPair field_184468_e = McMappingDatabase.getSRG("field_184468_e");

	/**
	 * <p>
	 * Name: getUnderwaterStatus
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/item/EntityBoat$Status;]
	 * </p>
	 */
	public static McObfPair func_184444_v = McMappingDatabase.getSRG("EntityBoat.func_184444_v");

	/**
	 * <p>
	 * Name: getWaterLevelAbove
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_184451_k = McMappingDatabase.getSRG("EntityBoat.func_184451_k");

	/**
	 * <p>
	 * Name: previousStatus
	 * </p>
	 */
	public static McObfPair field_184471_aG = McMappingDatabase.getSRG("field_184471_aG");

	/**
	 * <p>
	 * Name: performHurtAnimation
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70057_ab = McMappingDatabase.getSRG("EntityBoat.func_70057_ab");

	/**
	 * <p>
	 * Name: setForwardDirection
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_70269_c = McMappingDatabase.getSRG("EntityBoat.func_70269_c");

	/**
	 * <p>
	 * Name: setDamageTaken
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_70266_a = McMappingDatabase.getSRG("EntityBoat.func_70266_a");

	/**
	 * <p>
	 * Name: boatGlide
	 * </p>
	 */
	public static McObfPair field_184467_aE = McMappingDatabase.getSRG("field_184467_aE");

	/**
	 * <p>
	 * Name: lerpSteps
	 * </p>
	 */
	public static McObfPair field_184476_at = McMappingDatabase.getSRG("field_184476_at");

	/**
	 * <p>
	 * Name: setPositionAndRotationDirect
	 * </p>
	 * <p>
	 * Desc: [(DDDFFIZ)V]
	 * </p>
	 */
	public static McObfPair func_180426_a = McMappingDatabase.getSRG("EntityBoat.func_180426_a");

	/**
	 * <p>
	 * Name: FORWARD_DIRECTION
	 * </p>
	 */
	public static McObfPair field_184462_b = McMappingDatabase.getSRG("field_184462_b");

	/**
	 * <p>
	 * Name: updateMotion
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184450_w = McMappingDatabase.getSRG("EntityBoat.func_184450_w");

	/**
	 * <p>
	 * Name: applyYawToEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_184454_a = McMappingDatabase.getSRG("EntityBoat.func_184454_a");

	/**
	 * <p>
	 * Name: updateFallState
	 * </p>
	 * <p>
	 * Desc: [(DZLnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184231_a = McMappingDatabase.getSRG("EntityBoat.func_184231_a");

	/**
	 * <p>
	 * Name: deltaRotation
	 * </p>
	 */
	public static McObfPair field_184475_as = McMappingDatabase.getSRG("field_184475_as");

	/**
	 * <p>
	 * Name: lerpX
	 * </p>
	 */
	public static McObfPair field_70281_h = McMappingDatabase.getSRG("field_70281_h");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityBoat.func_70071_h_");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityBoat.func_70088_a");

	/**
	 * <p>
	 * Name: DAMAGE_TAKEN
	 * </p>
	 */
	public static McObfPair field_184464_c = McMappingDatabase.getSRG("field_184464_c");

	/**
	 * <p>
	 * Name: rightInputDown
	 * </p>
	 */
	public static McObfPair field_184459_aA = McMappingDatabase.getSRG("field_184459_aA");

	/**
	 * <p>
	 * Name: waterLevel
	 * </p>
	 */
	public static McObfPair field_184465_aD = McMappingDatabase.getSRG("field_184465_aD");

	/**
	 * <p>
	 * Name: BOAT_TYPE
	 * </p>
	 */
	public static McObfPair field_184466_d = McMappingDatabase.getSRG("field_184466_d");

	/**
	 * <p>
	 * Name: canTriggerWalking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70041_e_ = McMappingDatabase.getSRG("EntityBoat.func_70041_e_");

	/**
	 * <p>
	 * Name: lerpYaw
	 * </p>
	 */
	public static McObfPair field_70273_g = McMappingDatabase.getSRG("field_70273_g");

	/**
	 * <p>
	 * Name: updatePassenger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_184232_k = McMappingDatabase.getSRG("EntityBoat.func_184232_k");

	/**
	 * <p>
	 * Name: getAdjustedHorizontalFacing
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_184172_bi = McMappingDatabase.getSRG("EntityBoat.func_184172_bi");

	/**
	 * <p>
	 * Name: checkInWater
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184446_u = McMappingDatabase.getSRG("EntityBoat.func_184446_u");

	/**
	 * <p>
	 * Name: momentum
	 * </p>
	 */
	public static McObfPair field_184472_g = McMappingDatabase.getSRG("field_184472_g");

	/**
	 * <p>
	 * Name: lerpZ
	 * </p>
	 */
	public static McObfPair field_184478_aw = McMappingDatabase.getSRG("field_184478_aw");

	/**
	 * <p>
	 * Name: getBoatType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/item/EntityBoat$Type;]
	 * </p>
	 */
	public static McObfPair func_184453_r = McMappingDatabase.getSRG("EntityBoat.func_184453_r");

	/**
	 * <p>
	 * Name: getItemBoat
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_184455_j = McMappingDatabase.getSRG("EntityBoat.func_184455_j");

	/**
	 * <p>
	 * Name: canFitPassenger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_184219_q = McMappingDatabase.getSRG("EntityBoat.func_184219_q");

	/**
	 * <p>
	 * Name: getCollisionBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_70114_g = McMappingDatabase.getSRG("EntityBoat.func_70114_g");

	/**
	 * <p>
	 * Name: getTimeSinceHit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70268_h = McMappingDatabase.getSRG("EntityBoat.func_70268_h");

	/**
	 * <p>
	 * Name: applyEntityCollision
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_70108_f = McMappingDatabase.getSRG("EntityBoat.func_70108_f");

}

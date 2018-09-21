package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityHanging {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aca";
		else
			return "net/minecraft/entity/EntityHanging";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aca";
		else
			return "EntityHanging";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laca;";
		else
			return "Lnet/minecraft/entity/EntityHanging;";
	}

	/**
	 * <p>
	 * Name: tickCounter1
	 * </p>
	 */
	public static McObfPair field_70520_f = McMappingDatabase.getSRG("field_70520_f");

	/**
	 * <p>
	 * Name: setPosition
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_70107_b = McMappingDatabase.getSRG("EntityHanging.func_70107_b");

	/**
	 * <p>
	 * Name: updateFacingWithBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_174859_a = McMappingDatabase.getSRG("EntityHanging.func_174859_a");

	/**
	 * <p>
	 * Name: playPlaceSound
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184523_o = McMappingDatabase.getSRG("EntityHanging.func_184523_o");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityHanging.func_70097_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityHanging.func_70071_h_");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityHanging.func_70088_a");

	/**
	 * <p>
	 * Name: getHeightPixels
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82330_g = McMappingDatabase.getSRG("EntityHanging.func_82330_g");

	/**
	 * <p>
	 * Name: canBeCollidedWith
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70067_L = McMappingDatabase.getSRG("EntityHanging.func_70067_L");

	/**
	 * <p>
	 * Name: hitByEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_85031_j = McMappingDatabase.getSRG("EntityHanging.func_85031_j");

	/**
	 * <p>
	 * Name: addVelocity
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_70024_g = McMappingDatabase.getSRG("EntityHanging.func_70024_g");

	/**
	 * <p>
	 * Name: offs
	 * </p>
	 * <p>
	 * Desc: [(I)D]
	 * </p>
	 */
	public static McObfPair func_190202_a = McMappingDatabase.getSRG("EntityHanging.func_190202_a");

	/**
	 * <p>
	 * Name: facingDirection
	 * </p>
	 */
	public static McObfPair field_174860_b = McMappingDatabase.getSRG("field_174860_b");

	/**
	 * <p>
	 * Name: entityDropItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;F)Lnet/minecraft/entity/item/EntityItem;]
	 * </p>
	 */
	public static McObfPair func_70099_a = McMappingDatabase.getSRG("EntityHanging.func_70099_a");

	/**
	 * <p>
	 * Name: getHorizontalFacing
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_174811_aO = McMappingDatabase.getSRG("EntityHanging.func_174811_aO");

	/**
	 * <p>
	 * Name: hangingPosition
	 * </p>
	 */
	public static McObfPair field_174861_a = McMappingDatabase.getSRG("field_174861_a");

	/**
	 * <p>
	 * Name: getWidthPixels
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82329_d = McMappingDatabase.getSRG("EntityHanging.func_82329_d");

	/**
	 * <p>
	 * Name: getRotatedYaw
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Rotation;)F]
	 * </p>
	 */
	public static McObfPair func_184229_a = McMappingDatabase.getSRG("EntityHanging.func_184229_a");

	/**
	 * <p>
	 * Name: onValidSurface
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70518_d = McMappingDatabase.getSRG("EntityHanging.func_70518_d");

	/**
	 * <p>
	 * Name: move
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/MoverType;DDD)V]
	 * </p>
	 */
	public static McObfPair func_70091_d = McMappingDatabase.getSRG("EntityHanging.func_70091_d");

	/**
	 * <p>
	 * Name: getHangingPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_174857_n = McMappingDatabase.getSRG("EntityHanging.func_174857_n");

	/**
	 * <p>
	 * Name: shouldSetPosAfterLoading
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_142008_O = McMappingDatabase.getSRG("EntityHanging.func_142008_O");

	/**
	 * <p>
	 * Name: getMirroredYaw
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Mirror;)F]
	 * </p>
	 */
	public static McObfPair func_184217_a = McMappingDatabase.getSRG("EntityHanging.func_184217_a");

	/**
	 * <p>
	 * Name: IS_HANGING_ENTITY
	 * </p>
	 */
	public static McObfPair field_184524_c = McMappingDatabase.getSRG("field_184524_c");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityHanging.func_70037_a");

	/**
	 * <p>
	 * Name: updateBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174856_o = McMappingDatabase.getSRG("EntityHanging.func_174856_o");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityHanging.func_70014_b");

	/**
	 * <p>
	 * Name: onBroken
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_110128_b = McMappingDatabase.getSRG("EntityHanging.func_110128_b");

	/**
	 * <p>
	 * Name: onStruckByLightning
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/effect/EntityLightningBolt;)V]
	 * </p>
	 */
	public static McObfPair func_70077_a = McMappingDatabase.getSRG("EntityHanging.func_70077_a");

}
